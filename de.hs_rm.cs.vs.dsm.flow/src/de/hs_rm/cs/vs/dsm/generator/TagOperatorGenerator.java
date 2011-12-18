package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.TagClassElement;
import de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagElement;
import de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement;
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
	/** */
	private String mStream = "";
	
	public TagOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (TagOperator) pStatement.getOperator();
		// Add the input stream to the list
		this.getInputStreams().add(this.mOperator.getStream().getStream().getName());
		// Set the operator type
		this.setOperatorType(OPERATOR_TYPE);
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
			TagElement element = this.mOperator.getParameters().get(i);
			
			if(element instanceof TagClassElement){
				TagClassElement tag = (TagClassElement)element;
				result +=  Util.getInstance().createParameter(mStream, "owl_class", tag.getElement().getLocalName());
				result +=  Util.getInstance().createParameter(mStream, "element", tag.getReference().getElement().getName());
			}else if(element instanceof TagObjectPropertyElement){
				TagObjectPropertyElement tag = (TagObjectPropertyElement)element;
				result +=  Util.getInstance().createParameter(mStream, "owl_object_property", tag.getElement().getLocalName());
				result +=  Util.getInstance().createParameter(mStream, "element", tag.getReference().getElement().getName());
			}else{
				if(element instanceof TagDataTypePropertyElement){
					TagDataTypePropertyElement tag = (TagDataTypePropertyElement)element;
					result +=  Util.getInstance().createParameter(mStream, "owl_datatype_property", tag.getElement().getLocalName());
					result +=  Util.getInstance().createParameter(mStream, "element", tag.getReference().getElement().getName());
				}
			}
			
		}
		
		return result;
	}
}
