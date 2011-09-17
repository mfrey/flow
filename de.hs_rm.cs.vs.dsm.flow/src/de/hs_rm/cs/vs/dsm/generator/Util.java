package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;

public class Util {
	private static final Util mInstance = new Util();
	
	private Util(){}
	
	public static Util getInstance(){
		return mInstance;
	}

	public String createOperator(String pOperator, String pName){
		// TODO: Is it necessary to add operator at this point to the network?
		
		//
		return pName + " = fm:create_operator_of_type(\"" + pOperator + "\", \"" + pName + "\");\n";
	}
	
	public String connectOperator(final String pIn, final String pIndirection, final String pOut, final String pOutDirection){
		// TODO: Add the operators to the network
		
		// Return the connection operator string
		return "fm:connect_operators(" + pOut + ", \"" + pOutDirection + "\"," + 
				pIn + ", \"" + pIndirection + "\");\n";
	}
	
	public String connectOperator(final ArrayList<String> pIn, final String pIndirection, final ArrayList<String> pOut, final String pOutDirection){
		return "";
	}
	
	public String connectOperator(final String pIn, final String pIndirection, final ArrayList<String> pOut, final String pOutDirection){
		String result = "";
		
		if(pOut.size() > 1){
			for(int i = 0; i < pOut.size(); i++){
				// The operator has only one input stream and thus we only use the first element in the list
				result += Util.getInstance().connectOperator(pIn, "in",  pOut.get(i), "out" + i);
			}
		}else{
			// This should be not necessary, but just in case
			if(pOut.size() == 1){
				result += Util.getInstance().connectOperator(pIn, "in",  pOut.get(0), "out");
			}
		}
		
		return result;
	}
	
	
	public ArrayList<String> getStreamFrom(EList<StreamDefinition> pStreams){
		ArrayList<String> result = new ArrayList<String>();
		
		/*
		for(int i = 0; i < pStreams.size(); i++){
			result.add(pStreams.get(i).getName());
		}
		*/
		
		return result;
	}
}
