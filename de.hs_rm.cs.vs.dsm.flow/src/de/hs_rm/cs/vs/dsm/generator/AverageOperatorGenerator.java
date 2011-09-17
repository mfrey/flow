package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class AverageOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "avg";
	/** The internal representation of the avg operator */
	private AverageOperator mOperator = null;
	
	public AverageOperatorGenerator(StreamStatement pStatement) {
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (AverageOperator) pStatement.getExpression();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());
		// Set name of the internal stream representation
		this.setOperatorStream(OPERATOR_TYPE + this.mOperator.hashCode());
	}

	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator("avg", this.getOperatorStream());
	}

	@Override
	public String setOperatorProperties() {
		// TODO Auto-generated method stub
		return "TODO AVG\n";
	}

	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}
}
