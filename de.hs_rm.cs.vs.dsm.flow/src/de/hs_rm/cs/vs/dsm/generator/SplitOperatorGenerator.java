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
	private final String OPERATOR_TYPE = "Split";
	/** The internal representation of the count operator */
	private SplitOperator mOperator = null;
	/** The identifier of the operator in LUA */
	private String mStream = "";

	/**
	 * The constructor initializes the 
	 *
	 * @param pStatement The statement which contains a number of output streams plus the operator and its parameters
	 */
	public SplitOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (SplitOperator) pStatement.getOperator();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getStream().getName());
		// Set the name of the operator
		this.setOperatorType(OPERATOR_TYPE);
		
		if(this.getOutputStreams().size()== 2){
			mStream = this.getOutputStreams().get(0);
			this.setOperatorStream(mStream);
		}
		
		// Set the identifier of the operator in LUA
		//mStream = this.getOperatorStream();
	}

	/**
	 * The method replaces an existing entry in the output stream list with a 
	 * name specified by the second argument of the operator. This method is 
	 * used for splitting multiple return types into a set of split operations
	 * where the temporary stream name replaces a stream which is part of a
	 * multiple return type definition.
	 * 
	 * @param pOldStream The stream which should be replaced
	 * @param pReplacement The stream which replaces a stream specified in the first argument
	 */
	public void replaceStream(final String pOldStream, final String pReplacement){
		for(int i = 0; i < this.getOutputStreams().size(); i++){
			if(this.getOutputStreams().get(i).equals(pOldStream)){
				this.getOutputStreams().remove(i);
				this.setOperatorStream(pReplacement);
				mStream = pReplacement;
				this.getOutputStreams().add(pReplacement);
			}
		}
	}
	
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		return "";
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
	}
}
