package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;


/**
 * The class provides a generator for the split operator of the query 
 * language. The operator is defined as follows
 * 
 *	'split''('parameter=StreamOperatorParameter')';
 *
 * The operator starts with the keyword split followed by a left parenthesis, 
 * followed by a stream and the right parenthesis.
 * 
 * @author Michael Frey
 */
public class SplitOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "split";
	/** The internal representation of the count operator */
	private SplitOperator mOperator = null;

	/**
	 * The constructor initializes the 
	 *
	 * @param pStatement The statement which contains a number of output streams plus the operator and its parameters
	 */
	public SplitOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (SplitOperator) pStatement.getExpression();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getStream().getName());
		// Set name of the internal stream representation
		this.setOperatorStream(OPERATOR_TYPE + this.mOperator.hashCode());
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator("split", this.getOperatorStream());
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		return "";
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
