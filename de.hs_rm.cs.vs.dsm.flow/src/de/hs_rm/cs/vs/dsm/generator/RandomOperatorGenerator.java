package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.RandomOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;


/**
 * The class provides a generator for the input operator of the query 
 * language. The operator is defined as follows
 * 
 * 	'random' '('max=NUMBER ',' sleep=NUMBER ')';
 * 
 * The operator takes a list of iri's as input, seperated by a comma and followed
 * by a port and a address (socket) each seperated by comma. 
 * 
 * @author Michael Frey
 */
public class RandomOperatorGenerator extends AbstractOperatorGenerator  {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "RandomInts";
	/** The operator of the query language */
	private RandomOperator mOperator;
	/** The identifier of the operator in LUA */
	private String mStream;

	public RandomOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the super class
		super(pStatement);
		// Save the operator
		mOperator = (RandomOperator) pStatement.getOperator();
		this.getInputStreams().add(mOperator.getStream().getStream().getName());
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}
	
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = Util.getInstance().createParameter(mStream, "random_max", mOperator.getMaximum().toPlainString());
		result += Util.getInstance().createParameter(mStream, "us_sleep", mOperator.getSleep().toPlainString());
		return result;
	}
}
