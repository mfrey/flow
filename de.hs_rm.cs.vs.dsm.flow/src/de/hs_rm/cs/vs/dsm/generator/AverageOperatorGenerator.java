package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.FloatDataType;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the average operator of the query 
 * language. The operator is defined as follows
 * 
 *	'avg''('parameter=StreamAccess ',' stream=StreamOperatorParameter ')';	
 *
 * The operator starts with the keyword avg followed by a left parenthesis, 
 * followed by one element of a stream a comma and a barrier mechanism for 
 * the operator and a right parenthesis.
 * 
 * @author Michael Frey
 */
public class AverageOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private String OPERATOR_TYPE = "IntAvg";
	/** The internal representation of the avg operator */
	private AverageOperator mOperator = null;
	
	private String mStream = "";
	
	public AverageOperatorGenerator(final StreamStatement pStatement) {
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (AverageOperator) pStatement.getOperator();
		// Add the input stream to the corresponding array list (in the abstract operator class)
		this.getInputStreams().add(this.mOperator.getParameter().getReference().getName());

		if(this.mOperator.getParameter().getElement().getType() instanceof FloatDataType){
			OPERATOR_TYPE = "FloatAvg"; 
		}
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		return Util.getInstance().createParameter(mStream, "element", this.mOperator.getParameter().getElement().getName());
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return Util.getInstance().createBarrier(mStream, this.mOperator.getStream().getBarrier());
	}
}
