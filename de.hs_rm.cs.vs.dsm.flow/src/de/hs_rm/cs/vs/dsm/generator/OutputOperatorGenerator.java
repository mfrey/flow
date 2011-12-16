package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the output operator of the query language.
 * The operator is defined as follows
 * 
 * 'out''(' stream=StreamOperatorParameter ',' iri+=STRING (',' iri+=STRING)*
 * ',' address=STRING ',' port=INT ')' ';';
 * 
 * The operator takes a stream and a list of iri's as input, seperated by a
 * comma and followed by a port and a address (socket) each seperated by comma.
 * 
 * @author Michael Frey
 */
public class OutputOperatorGenerator extends IOOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "CacheOut";
	/** The identifier of the operator in LUA */
	private String mStream;
	/** The internal representation of the operator */
	private OutputOperator mOperator;
	
	/**
	 * The constructor calls the constructor of the super class
	 * (SystemOperatorGenerator) and sets the iri's, address and socket of the
	 * operators parameters.
	 * 
	 * @param pOperator
	 *            The OutputOperator which will be transformed by the generator
	 */
	public OutputOperatorGenerator(final StreamStatement pStatement) {
		super(((OutputOperator) pStatement.getOperator()).getIri(),
				((OutputOperator) pStatement.getOperator()).getAddress(),
				((OutputOperator) pStatement.getOperator()).getPort()
						.toPlainString());
		
		mOperator = (OutputOperator)pStatement.getOperator();
		// Create a array list which stores the input stream
		ArrayList<String> inputStreams = new ArrayList<String>();
		// Add the only input stream to the list
		inputStreams.add(mOperator.getStream().getStream().getName());
		// Set the list in the super class
		this.setInputStreams(inputStreams);

		ArrayList<String> outputStreams = new ArrayList<String>();
	
		for(int i = 0; i < pStatement.getReturnStream().size(); i++){
			outputStreams.add(pStatement.getReturnStream().get(i).getName());
		}
		
		this.setOutputStreams(outputStreams);
	
		if(this.getOutputStreams().size() == 1){
			mStream = this.getOutputStreams().get(0);
		}else if(this.getOutputStreams().size() > 1){
			mStream = "stream" + this.getOutputStreams().hashCode();
		}
		
		this.setStream(mStream);
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#initializeOperator()
	 */
	@Override
	public String initializeOperator() {
		return Util.getInstance().createOperator(OPERATOR_TYPE, mStream);
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(
				this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}


	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return initializeOperator() + setOperatorProperties()
				+ setOperatorConnection();
	}
}
