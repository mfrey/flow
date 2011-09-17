package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class StandardDeviationOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "std";
	/** The internal representation of the std operator */
	private StandardDeviationOperator mOperator = null;
	
	public StandardDeviationOperatorGenerator(StreamStatement pStatement) {
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (StandardDeviationOperator) pStatement.getExpression();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());
		// Set name of the internal stream representation
		this.setOperatorStream(OPERATOR_TYPE + this.mOperator.hashCode());
	}

	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator("std", this.getOperatorStream());
	}

	@Override
	public String setOperatorProperties() {
		return "TODO STD\n";
	}

	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}
}
