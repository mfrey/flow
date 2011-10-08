package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;


/**
 * The class provides a generator for the input operator of the query 
 * language. The operator is defined as follows
 * 
 * 	'in' '('iri+=STRING (',' iri+=STRING)* ',' port=NUMBER ',' socket=STRING')';
 * 
 * The operator takes a list of iri's as input, seperated by a comma and followed
 * by a port and a address (socket) each seperated by comma. 
 * 
 * @author Michael Frey
 */
public class InputOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "OperatorCacheIn";
	/** The internal representation of the count operator */
	private InputOperator mOperator = null;
	
	public InputOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (InputOperator) pStatement.getOperator();
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
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		/*
		for(int i = 0; i < this.mOperator.getIri().size(); i++){
			// Add IRIs as parameters of the stream operator
			result += Util.getInstance().createParameter(this.getOutputStreams().get(0), "listen_iris", this.mOperator.getIri().get(i));
		}*/
		// Set the socket address
		result += Util.getInstance().createParameter(this.getOutputStreams().get(0), "connector_socket_address", this.mOperator.getSocket());
		// Set the port
		result += Util.getInstance().createParameter(this.getOutputStreams().get(0), "connector_socket_port", this.mOperator.getPort().toString());
		// Return the result
		return result;
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		// This operator doesn't tie input to output, but only its output to another operator
		return "";
	}

}
