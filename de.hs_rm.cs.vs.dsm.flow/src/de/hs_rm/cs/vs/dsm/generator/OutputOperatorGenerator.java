package de.hs_rm.cs.vs.dsm.generator;


import de.hs_rm.cs.vs.dsm.flow.OutputOperator;

/**
 * The class provides a generator for the output operator of the query 
 * language. The operator is defined as follows
 * 
 * 	'in' '('iri+=STRING (',' iri+=STRING)* ',' port=NUMBER ',' socket=STRING')';
 * 
 * The operator takes a list of iri's as input, seperated by a comma and followed
 * by a port and a address (socket) each seperated by comma. 
 * 
 * @author Michael Frey
 */
public class OutputOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "OperatorCacheOut";
	/** The internal representation of the count operator */
	private OutputOperator mOperator = null;
	
	public OutputOperatorGenerator(final OutputOperator pOutput){
		// Store the operator in the attribute
		this.mOperator = pOutput;
		// Set the name of the stream
		this.setOperatorStream(OPERATOR_TYPE + pOutput.hashCode());
		// TODO: Verify. Iterate over the input/output stream list
		for(int i = 0; i < pOutput.getStream().size(); i++){
			// Determine the name of the stream
			String name = pOutput.getStream().get(i).getStream().getName();
			// Check if the stream is already in the list
			if(!this.getInputStreams().contains(name)){
				// Add the stream to the list
				this.getInputStreams().add(name);
			}
		}
	}

	@Override
	public String initializeOperator(){
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOperatorStream());
	}
	
	@Override
	public String setOperatorProperties(){
		return "";
	}

	// TODO: FIX ME
	@Override
	public String setOperatorConnection() {
		String result = "";
		
		for(int i = 0; i < this.getInputStreams().size(); i++){
			// TODO: Fix the syntax, especially the in, out variables are wrong
			result += Util.getInstance().connectOperator(this.getOperatorStream() , "in", "out", this.getInputStreams().get(i)); 
		}
		
		//return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOperatorStream(), "out");
		return result;
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}
}
