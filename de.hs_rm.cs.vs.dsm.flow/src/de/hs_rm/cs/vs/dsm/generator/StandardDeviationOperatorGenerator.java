package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the standard deviation operator of the query 
 * language. The operator is defined as follows
 * 
 *	'std''('parameter=StreamAccess ',' stream=StreamOperatorParameter ')';	
 *
 * The operator starts with the keyword std followed by a left parenthesis, 
 * followed by one element of a stream a comma and a barrier mechanism for 
 * the operator and a right parenthesis.
 * 
 * @author Michael Frey
 */
public class StandardDeviationOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "StandardDeviation";
	/** The internal representation of the std operator */
	private StandardDeviationOperator mOperator = null;
	
	private String mStream = "";
	
	public StandardDeviationOperatorGenerator(StreamStatement pStatement) {
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (StandardDeviationOperator) pStatement.getOperator();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		return Util.getInstance().createParameter(mStream, "element", this.mOperator.getParameter().getElement().getName());
	}
	
	/** 
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setBarrier()
	 */
	@Override
	public String setBarrier() {
		return Util.getInstance().createBarrier(mStream, this.mOperator.getStream().getBarrier());
	}
}
