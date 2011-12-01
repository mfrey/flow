package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class ElementJoinOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "ejoin";
	/** The internal representation of the count operator */
	private ElementJoinOperator mOperator = null;
	
	public ElementJoinOperatorGenerator(StreamStatement pStatement) {
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (ElementJoinOperator) pStatement.getOperator();	
		// Set name of the internal stream representation
		this.setOperatorStream(OPERATOR_TYPE + this.mOperator.hashCode());
		// Add the input parameters of the operator
	}

	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator("ejoin", this.getOperatorStream());
	}

	@Override
	public String setOperatorProperties() {
		String result = "";
		/*
		for(int i = 0; i < this.mOperator.getVariableElementParameters().size(); i++){
			result += Util.getInstance().createParameter(this.getOutputStreams().get(0) + "", "value", this.mOperator.getVariableElementParameters().get(i));
		}
		*/
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}
}
