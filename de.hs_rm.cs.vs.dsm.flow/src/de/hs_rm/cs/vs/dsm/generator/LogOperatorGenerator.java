package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.LogOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;


/**
 * The class provides a generator for the input operator of the query 
 * language. The operator is defined as follows
 * 
 * 	'log' '('location=STRING ',' format=STRING ')';
 * 
 * The operator takes a list of iri's as input, seperated by a comma and followed
 * by a port and a address (socket) each seperated by comma. 
 * 
 * @author Michael Frey
 */
public class LogOperatorGenerator extends AbstractOperatorGenerator  {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "Log";
	/** The operator of the query language */
	private LogOperator mOperator;
	/** The name of the stream */
	private String mStream;
	
	public LogOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the super class
		super(pStatement);
		// Save the operator
		mOperator = (LogOperator) pStatement.getOperator();
		this.getInputStreams().add(mOperator.getStream().getStream().getName());
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
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
		String result = Util.getInstance().createParameter(mStream, "log_file_location", mOperator.getLocation());
		result += Util.getInstance().createParameter(mStream, "log_format", mOperator.getFormat());
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
