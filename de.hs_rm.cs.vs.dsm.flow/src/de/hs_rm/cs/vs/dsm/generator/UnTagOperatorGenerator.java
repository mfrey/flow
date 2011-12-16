package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.UnTagElement;
import de.hs_rm.cs.vs.dsm.flow.UnTagOperator;

/**
 * The class provides a code generator for the untag operator of the query
 * language. The structure of the language is 
 * 
 *  'untag''('parameters+=UnTagElement(',' parameters+=UnTagElement)* 
 *	  ',' stream=StreamOperatorParameter')';
 * 
 * The operator consists of a list of untag operations and a stream on which the
 * list is applied. Each untag operaton consists of a mapping from a OWL class to
 * a primitive data type of the query language. All parameters are seperated by
 * commas.
 * 
 * @author Michael Frey
 */
public class UnTagOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "UnTag";
	/** The internal representation of the count operator */
	private UnTagOperator mOperator = null;
	/** The identifier of the operator in LUA */
	private String mStream = "";
	
	public UnTagOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (UnTagOperator) pStatement.getOperator();
		// Add the input stream to the list
		this.getInputStreams().add(this.mOperator.getStream().getStream().getName());
		// Set the operator type
		this.setOperatorType(OPERATOR_TYPE);
		// Set the stream
		mStream = this.getOperatorStream();
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < this.mOperator.getParameters().size(); i++){
			final UnTagElement element = this.mOperator.getParameters().get(i); 
			result += Util.getInstance().createParameter(mStream, "ontology_element", element.getElement().getLocalName());
			result += Util.getInstance().createParameter(mStream, "variable", element.getReference().getElement().getName());
		}
		
		return result;
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

}
