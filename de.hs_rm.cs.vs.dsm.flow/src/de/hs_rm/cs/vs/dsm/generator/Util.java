package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier;
import de.hs_rm.cs.vs.dsm.flow.MarkerOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
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
	
	public String connectOperator(final ArrayList<String> pIn, final String pIndirection, final ArrayList<String> pOut, final String pOutDirection){
		return "TODO \n";
	}
	
	public String connectOperator(final String pIn, final String pIndirection, final ArrayList<String> pOut, final String pOutDirection){
		String result = "";
		
		if(pOut.size() > 1){
			for(int i = 0; i < pOut.size(); i++){
				// The operator has only one input stream and thus we only use the first element in the list
				result += Util.getInstance().connectOperator(pIn, "in",  pOut.get(i), "out" + i);
			}
		}else{
			// This should be not necessary, but just in case
			if(pOut.size() == 1){
				result += Util.getInstance().connectOperator(pIn, "in",  pOut.get(0), "out");
			}
		}
		
		return result;
	}
	
	
	public ArrayList<String> getStreamFrom(EList<StreamDefinition> pStreams){
		ArrayList<String> result = new ArrayList<String>();
		
		/*
		for(int i = 0; i < pStreams.size(); i++){
			result.add(pStreams.get(i).getName());
		}
		*/
		
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
		Iterator iterator = this.mNetwork.getStreams().iterator();
		// Iterate over the stream list in the network
		while(iterator.hasNext()){
			// Add the streams to the result string
			result += pSetting + iterator.next() + ");\n";
		}
		// Return the result
		return result;
	}
	
	/**
	 * 
	 */
	public String createExpressionParameter(final Expression pExpression){
		return null;
	}
	
	/**
	 * 
	 */
	public String createStringFromIRI(final InternationalizedResourceIdentifier pIdentifier){
		return null;
	}
}
