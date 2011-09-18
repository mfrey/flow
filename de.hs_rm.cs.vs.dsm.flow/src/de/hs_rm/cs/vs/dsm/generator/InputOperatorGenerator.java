package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

// 	'in' '('location=STRING ',' regexp=STRING ',' model=[StreamDeclaration]')';

/**
 * The class provides a generator for the input operator of the query 
 * language. The operator is defined as follows
 * 
 * 		TODO
 * 
 * @author Michael Frey
 */
public class InputOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "CacheIn";
	/** The internal representation of the count operator */
	private InputOperator mOperator = null;
	
	public InputOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (InputOperator) pStatement.getExpression();
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "TODO input\n";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		return "TODO input\n";
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		// This operator doesn't tie input to output, but only its output to another operator
		return "";
	}

}
