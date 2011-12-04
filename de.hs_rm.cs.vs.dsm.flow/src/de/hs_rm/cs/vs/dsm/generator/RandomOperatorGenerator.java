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
	/** The name of the stream */
	private String mStream;
	
	public RandomOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the super class
		super(pStatement);
		// Save the operator
		mOperator = (RandomOperator) pStatement.getOperator();
		this.getInputStreams().add(mOperator.getStream().getStream().getName());
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		if(this.getOutputStreams().size() == 1){
			mStream = this.getOutputStreams().get(0);
			return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
		}else if(this.getOutputStreams().size() > 1){
			mStream = "stream" + this.getOutputStreams().hashCode();
			return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
		}else{
			return "Error in initializeOperator() in class RandomOperatorGenerator";
		}
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
	public String setOperatorProperties() {
		String result = Util.getInstance().createParameter(mStream, "random_max", mOperator.getMaximum().toPlainString());
		result += Util.getInstance().createParameter(mStream, "us_sleep", mOperator.getSleep().toPlainString());
		return result;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(getInputStreams(), "in", getOutputStreams(), "out");
	}
}
