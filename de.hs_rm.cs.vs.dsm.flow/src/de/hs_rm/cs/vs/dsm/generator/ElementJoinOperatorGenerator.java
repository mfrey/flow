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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setOperatorConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}
}
