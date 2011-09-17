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
	private final String OPERATOR_TYPE = "count";
	/** The internal representation of the count operator */
	private CountOperator mOperator = null;
	
	public CountOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (CountOperator) pStatement.getExpression();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());
		// Set name of the internal stream representation
		this.setOperatorStream(OPERATOR_TYPE + this.mOperator.hashCode());
	}
	
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator("counter", this.getOperatorStream());
	}

	@Override
	public String setOperatorProperties() {
		// TODO Auto-generated method stub
		return "TODO COUNT\n";
	}

	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}
}
