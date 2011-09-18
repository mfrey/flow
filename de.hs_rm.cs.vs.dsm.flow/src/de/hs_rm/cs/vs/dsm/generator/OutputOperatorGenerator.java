package de.hs_rm.cs.vs.dsm.generator;


import de.hs_rm.cs.vs.dsm.flow.OutputOperator;

public class OutputOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "output";
	/** The internal representation of the count operator */
	private OutputOperator mOperator = null;
	
	public OutputOperatorGenerator(final OutputOperator pOutput){
		// Call the constructor of the abstract operator class
		super();
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
		return Util.getInstance().createOperator("cachout", this.getOperatorStream());
	}
	
	@Override
	public String setOperatorProperties(){
		return "TODO OUTPUT\n";
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
