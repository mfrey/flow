package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.DifferenceOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the difference operator of the query 
 * language. The operator is defined as follows
 * 
 *	'diff''('parameters+=StreamOperatorParameter ',' 
		parameters+=StreamOperatorParameter (',' parameters+=StreamOperatorParameter)*')';
 *
 * The operator starts with the keyword diff followed by a left parenthesis, 
 * followed by a list of streams seperated each by a comma and a barrier mechanism for 
 * the operator and a right parenthesis.
 * 
 * @author Michael Frey
 */
public class DifferenceOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "diff";
	/** The internal representation of the count operator */
	private DifferenceOperator mOperator = null;
	
	public DifferenceOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (DifferenceOperator) pStatement.getExpression();
		// Get the input streams of the operator
		for(int i = 0; i < this.mOperator.getParameters().size(); i++){
			this.getInputStreams().add(this.mOperator.getParameters().get(i).getStream().getName());
		}
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		// TODO Auto-generated method stub
		return null;
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
