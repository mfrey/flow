package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * 
 * @author Michael Frey 
 */
public class DecisionTreeGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "DecisionTree";
	/** The decision tree operator */
	private DecisionTreeOperator mOperator;
	/** */
	private String mStream;
	
	public DecisionTreeGenerator(final StreamStatement pStatement){
		super(pStatement);
		mOperator = (DecisionTreeOperator) pStatement.getOperator();
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		if(this.getOutputStreams().size() == 1){
			mStream = this.getOutputStreams().get(0);
			return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
		}else if(this.getOutputStreams().size() > 1){
			mStream = "stream" + this.getInputStreams().hashCode();
			return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
		}else{
			return "Error in initializeOperator() in class CountOperatorGenerator";
		}	
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		String attributes = "";
		
		for(int i = 0; i < this.mOperator.getAttributes().size(); i++){
			attributes += this.mOperator.getAttributes().get(i).getKey() + " = {";
			for(int j = 0; j < this.mOperator.getAttributes().get(i).getValue().size(); j++){
				if(j != 0){
					attributes += "," + this.mOperator.getAttributes().get(i).getValue().get(j);
				}else{
				 attributes += this.mOperator.getAttributes().get(i).getValue().get(j);
				}
			}
			attributes += "}";
		}
		
		result += Util.getInstance().createParameter(mStream, "attributes", attributes);
		result += Util.getInstance().createParameter(mStream, "classAttribute", "TODO");
		result += Util.getInstance().createParameter(mStream, "delta", mOperator.getDelta().toPlainString());
		result += Util.getInstance().createParameter(mStream, "classHomogenityBarrier", mOperator.getBarrier().toPlainString());
		result += Util.getInstance().createParameter(mStream, "checkFrequency", mOperator.getFrequency().toPlainString());
		result += Util.getInstance().createParameter(mStream, "tau", mOperator.getTau().toPlainString());

		
		return result;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
