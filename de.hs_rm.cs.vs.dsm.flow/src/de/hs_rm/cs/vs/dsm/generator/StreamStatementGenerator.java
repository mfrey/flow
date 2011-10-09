package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * 
 */
public class StreamStatementGenerator extends AbstractOperatorGenerator {
	/** The name of the operator */
	private final String OPERATOR_TYPE = "OperatorMath";
	/** The internal representation of the statement */
	private Expression mExpression = null;
	
	
	public StreamStatementGenerator(final StreamStatement pStatement) {
		super(pStatement);
		// Save the expression
		this.mExpression = pStatement.getExpression();
	}
	
	@Override
	public String setBarrier() {
		return "";
	}

	@Override
	public String initializeOperator() {
		return "TEST";
	}

	@Override
	public String setOperatorProperties() {
		return "";
	}

	@Override
	public String setOperatorConnection() {
		return "";
	}
}
