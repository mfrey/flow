package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the average operator of the query 
 * language. The operator is defined as follows
 * 
 *	'avg''('parameter=StreamAccess ',' stream=StreamOperatorParameter ')';	
 *
 * The operator starts with the keyword avg followed by a left parenthesis, 
 * followed by one element of a stream a comma and a barrier mechanism for 
 * the operator and a right parenthesis.
 * 
 * @author Michael Frey
 */
public class AverageOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "avg";
	/** The internal representation of the avg operator */
	private AverageOperator mOperator = null;
	
	public AverageOperatorGenerator(final StreamStatement pStatement) {
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (AverageOperator) pStatement.getExpression();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getInputStreams().get(0));
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		// TODO Auto-generated method stub
		return "TODO AVG\n";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}
}
