package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the count operator of the query 
 * language. The operator is defined as follows
 * 
 *	'count''('parameter=StreamAccess ',' stream=StreamOperatorParameter ')';
 *
 * The operator starts with the keyword count followed by a left parenthesis, 
 * followed by one element of a stream a comma and a barrier mechanism for 
 * the operator and a right parenthesis.
 * 
 * @author Michael Frey
 */
public class CountOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "MessageCounter";
	/** The internal representation of the count operator */
	private CountOperator mOperator = null;
	/** The stream name of the operator in LUA */
	private String mStream = "";
	
	public CountOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (CountOperator) pStatement.getOperator();
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
