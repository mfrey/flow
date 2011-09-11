package de.hs_rm.cs.vs.dsm.generator;


import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.OutputOperator;

public class OutputOperatorGenerator implements IOperator {
	public String mOperatorStream;
	
	public ArrayList<String> mInputStreamList = new ArrayList<String>();
	
	public OutputOperatorGenerator(final OutputOperator pOutput){
		mOperatorStream = "output" + pOutput.hashCode();
		
		for(int i = 0; i < pOutput.getStream().size(); i++){
			// Determine the name of the stream
			String name = pOutput.getStream().get(i).getStream().getName();
			// Check if the stream is already in the list
			if(!mInputStreamList.contains(name)){
				// Add the stream to the list
				mInputStreamList.add(name);
			}
		}
	}

	@Override
	public String initializeOperator(){
		return Util.getInstance().createOperator("cachout", mOperatorStream);
	}
	
	@Override
	public String setOperatorProperties(){
		String result = "";
		
		for(int i = 0; i < this.mInputStreamList.size(); i++){
			// TODO: Fix the syntax, especially the in, out variables are wrong
			result += Util.getInstance().connectOperator(mOperatorStream , "in", "out", this.mInputStreamList.get(i)); 
		}
		
		return result;
	}

	@Override
	public String toString(){
		return initializeOperator() + setOperatorProperties();
	}
}
