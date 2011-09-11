package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;
import java.util.Iterator;

import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;


/**
 * 
 */
public class SplitOperatorGenerator implements IOperator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "split";
	/** The streams which are the result of the operation */
	private ArrayList<String> mOutputStreams = new ArrayList<String>();
	/** The stream which is the parameter of the operation */
	private String mInputOperator;

	/**
	 * The constructor initializes the 
	 *
	 * @param pStatement The statement which contains a number of output streams plus the operator and its parameters
	 */
	public SplitOperatorGenerator(final StreamStatement pStatement){
		// Create an iterator in order to iterate over the return type statements
		Iterator<StreamDefinition> streamDefinition = pStatement.getReturnStream().iterator();
		// Iterate over the return type statements
		while(streamDefinition.hasNext()){
			// Add the output stream to the list
			mOutputStreams.add(streamDefinition.next().getName());
		}
		// Get the input stream
		mInputOperator = ((SplitOperator)pStatement.getExpression()).getParameter().getStream().getName();
	}
	
	@Override
	public String initializeOperator() {
		// Build up the result string
		String result = "";
		// If there are more than two output streams
		if(this.mOutputStreams.size() > 2){
			int j = 0;
			// Create for every pair of streams a new intermediate output stream
			for(int i = 0; i <= this.mOutputStreams.size(); i++){
				if((i % 2) == 0){
					if(i != 0){
						result += Util.getInstance().createOperator(OPERATOR_TYPE, mInputOperator + "_" + j);
						j++;
					}else{
						// The initial input/output stream
						result += Util.getInstance().createOperator(OPERATOR_TYPE, mInputOperator);
					}
				}
			}
		// There are no more than two output streams
		}else{
			result = Util.getInstance().createOperator(OPERATOR_TYPE, mInputOperator);
		}
		
		return result;
	}

	// TODO: FIXME
	@Override
	public String setOperatorProperties() {
		String result = "";

		if(this.mOutputStreams.size() > 2){
			int j = 0;
			
			for(int i = 0; i < this.mOutputStreams.size(); i++){
				if((i % 2) == 0){
					if(i != 0){
						result += Util.getInstance().connectOperator(mInputOperator + "_" + j, "in", this.mOutputStreams.get(i), "out2");
						j++;
					}else{	
						result += Util.getInstance().connectOperator(mInputOperator, "in", this.mOutputStreams.get(0), "out1");
						result += Util.getInstance().connectOperator(mInputOperator, "in", mInputOperator + "_" + j, "out2");
					}
				}else{
					result += Util.getInstance().connectOperator(mInputOperator + "_" + j, "in", this.mOutputStreams.get(i), "out1");
				}
			}
		}else{
			// The operator requires at least two output streams
			if(this.mOutputStreams.size() == 2){
				result = Util.getInstance().connectOperator(mInputOperator, "in", this.mOutputStreams.get(0), "out1");
				result += Util.getInstance().connectOperator(mInputOperator, "in", this.mOutputStreams.get(1), "out2");
			}
		}

		return result;				
	}

	@Override
	public String toString(){
		return initializeOperator() + setOperatorProperties();
	}
}
