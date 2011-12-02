package de.hs_rm.cs.vs.dsm.generator;


import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.OutputOperator;

/**
 * The class provides a generator for the output operator of the query 
 * language. The operator is defined as follows
 * 
 *  'out''(' stream=StreamOperatorParameter ',' iri+=STRING (',' iri+=STRING)* ',' address=STRING ',' port=INT ')' ';';
 * 
 * The operator takes a stream and a list of iri's as input, seperated by a
 * comma and followed by a port and a address (socket) each seperated by 
 * comma. 
 *
 * @author Michael Frey
 */
public class OutputOperatorGenerator extends SystemOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "CacheOut";
	
	private String mStream;
	/**
	 * The constructor calls the constructor of the super class (SystemOperatorGenerator)
	 * and sets the iri's, address and socket of the operators parameters.
	 * 
	 * @param pOperator The OutputOperator which will be transformed by the generator
	 */
	public OutputOperatorGenerator(final OutputOperator pOperator){
		super(pOperator.getIri(), pOperator.getAddress(), pOperator.getPort().toPlainString());
		// Create a array list which stores the input stream
		ArrayList<String> inputStreams = new ArrayList<String>();
		// Add the only input stream to the list
		inputStreams.add(pOperator.getStream().getStream().getName());
		// Set the list in the super class
		this.setInputStreams(inputStreams);
		//
		mStream = "stream" + this.getInputStreams().get(0).hashCode();
		// 
		this.setStream(mStream);
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", mStream, "out");
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String toString(){
		return initializeOperator() + setOperatorProperties() + setOperatorConnection();
	}
}
