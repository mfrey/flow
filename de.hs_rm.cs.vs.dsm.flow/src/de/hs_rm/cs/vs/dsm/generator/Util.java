package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;
import java.util.Iterator;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowFactory;
import de.hs_rm.cs.vs.dsm.flow.MarkerOperator;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;

/**
 * The class provides various useful functions for creating LUA expressions which
 * are required by operator generator classes. 
 * 
 * @author Michael Frey
 */
public class Util {
	/** Initialize the only instance of the class */ 
	private static final Util mInstance = new Util();
	/** A in-memory representation of the complex event processing network */
	private Network mNetwork = new Network();
	
	/**
	 * The constructor is private in order to guarantee that the class is
	 * only initialized once. 
	 */
	private Util(){}
	
	/**
	 * The method returns an instance of the class
	 *
	 * @return The only instance of the class Unit
	 */
	public static Util getInstance(){
		return mInstance;
	}

	public String createOperator(String pOperator, String pName){
		// Add operator to the list 
		this.mNetwork.getStreams().add(pName);
		// TODO: Is it necessary to add operator at this point to the network?
		
		//
		return pName + " = fm:create_operator_of_type(\"" + pName + "\", \"" + pOperator + "\");\n";
	}
	
	public String connectOperator(final String pIn, final String pIndirection, final String pOut, final String pOutDirection){
		// TODO: Add the operators to the network
		
		// Return the connection operator string
		return "fm:connect_operators(" + pOut + ", \"" + pOutDirection + "\", " + 
				pIn + ", \"" + pIndirection + "\");\n";
	}
	
	/**
	 * The function creates a string which contains a string representation of a barrier
	 * of a stream. If the barrier refers to a time setting, the corresponding times are
	 * calculated in miliseconds. 
	 * 
	 * @param pStream  The stream which string representation of a barrier should be created 
	 * @param pBarrier The barrier of the operator
	 * 
	 * @return A string representation of the barrier of a stream
	 */
	public String createBarrier(final String pStream, final BarrierOperator pBarrier){
		String result = "";
		
		if(pBarrier instanceof WindowOperator){
			// Cast to window operator
			WindowOperator operator = (WindowOperator) pBarrier;
			// Set factor for value to one
			int factor = 1;
			// Set type of operator to 'none'
			String type = "";
			int value = 1;
			
			if(operator.getSetting().equals("last")){
				if(operator.getUnit().equals("elements")){
					// Set type to elements
					type = "elements";
				}else{
					// Set type to time
					type = "time";
					// Type of unit is seconds
					if(operator.getUnit().equals("sec")){
						factor = 1000;
					// Type of unit is minutes
					}else if(operator.getUnit().equals("min")){
						factor = 1000 * 60;
					// Type of unit is hours
					}else{
						factor = 1000 * 60 * 60;
					}
				}
				
				value = operator.getValue().intValue() * factor;
			}else{
				type = "elements";
			}
			
			// Set the value
			result += Util.getInstance().createParameter(pStream, "step_size_num", new Integer(value).toString());
			// Set the window type
			result += Util.getInstance().createParameter(pStream, "window_type", type);
			
		}else if(pBarrier instanceof MarkerOperator){
			result = "createBarrier: todo";
		}else{
			result = "createBarrier: this should not happen!";
		}
		// Return the result
		return result;
	}
	
	/**
	 * The method creates a parameter for an operator. Every parameter of an operator consists of
	 * an key/value pair. For example
	 * 
	 *	avg:set_parameter("window_type", "num");
	 * 
	 * where for a stream 'avg' a parameter 'window_type' is set to 'num'
	 * 
	 * @return A string which contains a set_parameter operation
	 */
	public String createParameter(final String pStream, final String pKey, final String pValue){
		return pStream + ":set_parameter(" + "\"" + pKey + "\"" + ", " + "\"" + pValue + "\"" + ");\n";
	}
	
	/**
	 * The method connects a list of input streams to a list of output streams. There are four cases
	 * which have to be considered (a, b, c, d are streams while op denotes a operator):
	 * 
	 * -  b = op(a); 
	 *    a is a input stream and is simply connected to the output stream b
	 *    
	 * -  b, c = op(a);
	 *    a is a input stream and is connected to two output streams b and c
	 *    
	 * -  c = op(a, b);
	 *    a and b are input streams of the operator and are connected to a simple output stream b
	 *    
	 * -  c, d = op(a, b);
	 *    a and b are input streams of the operator and are connected to the output streams c and d 
	 * 
	 * This could be very simple, but the LUA wrapper for the DSM framework doesn't support multiple
	 * input and output streams for each operator.
	 * 
	 * @param pIn A list which contains the names of the input streams
	 * @param pIndDirection The name of the attribute for the lua function call for input streams
	 * @param pOut A list which contains the names of the output streams
	 * @param pOutDirection The name of the attribute for the lua function call for output streams
	 * 
	 * @return A string which contains the connectOperator expression for lua
	 */
	public String connectOperator(final ArrayList<String> pIn, final String pInDirection, final ArrayList<String> pOut, final String pOutDirection){
		// Only one input stream
		if(pIn.size() == 1){
			// Only one ouput stream
			if(pOut.size() == 1){
				return Util.getInstance().connectOperator(pIn.get(0), pInDirection, pOut.get(0), pOutDirection);
			// Multiple output streams
			}else if(pOut.size() > 1){
				return match(pIn, pInDirection, pOut, pOutDirection);
			// Error
			}else{
				/**
				 * This should never happen since every operator has at least one output stream, 
				 * except the 'out' operator.
				 */
				return "ERROR: The number of output streams is zero!";
			}
		// Multiple input streams
		}else if(pIn.size() > 1){
			String result = "";
			// Only one ouput stream
			if(pOut.size() == 1){
				// Iterate over the input stream list
				for(int i = 0; i < pIn.size(); i++){
					// The operator has multiple input stream but only one output stream
					result += Util.getInstance().connectOperator(pIn.get(i), "in" + i,  pOut.get(0), "out");
				}
				
				return result;
			// Multiple output streams
			}else if(pOut.size() > 1){
				return match(pIn, pInDirection, pOut, pOutDirection);
			// Error
			}else{
				/**
				 * This should never happen since every operator has at least one output stream, 
				 * except the 'out' operator.
				 */
				return "ERROR: The number of output streams is zero!";
			}
		}else{
			/**
			 * This should never happen since every operator has a input stream, 
			 * except the 'in' operator.
			 */
			return "ERROR: The number of input streams is zero!";
		}
	}
	
	public String connectOperator(final String pIn, final String pIndirection, final ArrayList<String> pOut, final String pOutDirection){
		String result = "";
		
		if(pOut.size() > 1){
			for(int i = 0; i < pOut.size(); i++){
				// The operator has only one input stream and thus we only use the first element in the list
				result += Util.getInstance().connectOperator(pIn, "in",  pOut.get(i), "out" + i);
			}
		}
		
		return result;
	}
	
	private String match(final ArrayList<String> pIn, final String pInDirection, final ArrayList<String> pOut, final String pOutDirection){
		String result = "";
		
		/**
		 *  That's the 'ugly' case since the LUA framework for the DSM doesn't allow multiple output 
		 *  streams (except the split operator). For each output stream we create a 'split' operator
		 *  where one output of the operator is one ouput stream (of the original operation) and one
		 *  is used for the next split operation until it isn't necessary to create another output
		 *  stream. 
		 */
		
		// Create a unique identifier for the ouput stream (which is a input stream for the 
		String stream = "stream" + pIn.hashCode();
		// Create a stream statement for the split operator
		StreamStatement statement = FlowFactory.eINSTANCE.createStreamStatement();
		// Create a split operator
		SplitOperator operator = FlowFactory.eINSTANCE.createSplitOperator();
		// Create a stream parameter 
		StreamOperatorParameter parameter = FlowFactory.eINSTANCE.createStreamOperatorParameter();
		// Create a barrier
		BarrierOperator barrier = FlowFactory.eINSTANCE.createBarrierOperator();
		// Create a return stream
		StreamDefinition resultStreamOne = FlowFactory.eINSTANCE.createStreamDefinition();
		// Create another return stream
		StreamDefinition resultStreamTwo = FlowFactory.eINSTANCE.createStreamDefinition();
		// Set the first result stream to the statement
		statement.getReturnStream().add(resultStreamOne);
		// Set the second result stream to the statement
		statement.getReturnStream().add(resultStreamTwo);
		
		if(pIn.size() > 1){
			// Build the first result stream
			for(int i = 0; i < pIn.size(); i++){
				// The operator has multiple input stream but only one output stream
				result += Util.getInstance().connectOperator(pIn.get(i), "in" + i,  stream, "out");
			}
		}else{
			result += Util.getInstance().connectOperator(pIn.get(0), "in",  stream, "out");
		}
		
		for(int i = 0; i < pOut.size(); i+=2){
			// Set the name of the stream which will be 'splitted'
			StreamDefinition splitStream = FlowFactory.eINSTANCE.createStreamDefinition();
			// Set the name of the stream
			splitStream.setName(stream);
			// Set the stream in the parameter of the operator
			parameter.setStream(splitStream);
			// Set the barrier of the parameter
			parameter.setBarrier(barrier);
			// Set the parameter of the split operator
			operator.setParameter(parameter);
			// Set the operator to the statement
			statement.setOperator(operator);
			// Set the first return type of the operator
			stream = stream + i;
		
			if((i+2) == pOut.size()){
				statement.getReturnStream().get(0).setName(pOut.get(i));
				statement.getReturnStream().get(1).setName(pOut.get(i+1));
			}else{
				statement.getReturnStream().get(0).setName(stream);
				// Set the second return type of the operator
				statement.getReturnStream().get(1).setName(pOut.get(i));
			}

			// Create a split operator generator
			SplitOperatorGenerator generator = new SplitOperatorGenerator(statement);
			// Store the result
			result += generator.toString();
			// Create a new operator (for a new hash code)
			//operator = FlowFactory.eINSTANCE.createSplitOperator();
		}
		
		return result;		
	}
	
	/**
	 * The method returns a string which contains the operators
	 * which should be started.
	 * 
	 * @return A list with operators which should be started
	 */
	public String getStartOperators(){
		return Util.getInstance().createOperators("fm:start(");
	}
	
	/**
	 * The method returns a string which contains the operators
	 * which should be stopped.
	 * 
	 * @return A list with operators which should be stopped
	 */
	public String getStopOperators(){
		return Util.getInstance().createOperators("fm:stop(");
	}
	
	/**
	 * The method builds a string which starts or stops the operators 
	 * in LUA. Actually the method is 'capable' of using every 
	 * preamble, but there are only two types of operation which have 
	 * one parameter with a operator. One operation is the 
	 * 
	 * 	fm:start();
	 * 
	 * method and the other one is the
	 * 
	 * 	fm:stop();
	 * 
	 * method.
	 *
	 * @param pSetting The preamble which will be added before the operator
	 * 
	 * @return A string which consists of starting or stopping operators in 
	 *  the network
	 */
	private String createOperators(final String pSetting){
		// Initialize result string
		String result = "";
		Iterator<String> iterator = this.mNetwork.getStreams().iterator();
		// Iterate over the stream list in the network
		while(iterator.hasNext()){
			// Add the streams to the result string
			result += pSetting + iterator.next() + ");\n";
		}
		// Return the result
		return result;
	}
}
