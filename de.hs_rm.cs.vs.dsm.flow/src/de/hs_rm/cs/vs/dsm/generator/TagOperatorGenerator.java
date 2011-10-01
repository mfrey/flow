package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;

/**
 * The class provides a generator for the tag operator of the query 
 * language. The operator is defined as follows
 * 
 *	'tag''('parameters+=TagElement (',' parameters+=TagElement)* 
 *		',' stream=StreamOperatorParameter')';
 *
 * The operator starts with the keyword tag followed by a left parenthesis, 
 * followed by a list of elements of a stream which are assigne to a OWL class, data
 * or object property, a barrier mechanism for the operator and a right 
 * parenthesis.
 * 
 * @author Michael Frey
 */
public class TagOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "OperatorTag";
	/** The internal representation of the count operator */
	private TagOperator mOperator = null;
	
	public TagOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (TagOperator) pStatement.getExpression();
		// TODO: Add the input stream to the list
		// this.getInputStreams().add(this.mOperator.getStream().getStream().getName());
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
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
		return "TODO tag\n";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}
}
