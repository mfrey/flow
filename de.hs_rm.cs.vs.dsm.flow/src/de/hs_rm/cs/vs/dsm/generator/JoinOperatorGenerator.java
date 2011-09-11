package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.JoinOperator;

/**
 *
 * 
 * @author Michael Frey
 */
public class JoinOperatorGenerator implements IOperator {
	private ArrayList<String> mOutputOperators = new ArrayList<String>();
	private ArrayList<String> mInputOperators = new ArrayList<String>();
	
	public JoinOperatorGenerator(final ArrayList<String> pOutput, final JoinOperator pJoinOperator){
		mOutputOperators = pOutput;
		
		for(int i = 0; i < pJoinOperator.getParameters().size(); i++){
			mInputOperators.add(pJoinOperator.getParameters().get(i).getStream().getName());
		}
	}
	
	@Override
	public String initializeOperator(){
		String result = "";
		for(int i = 0; i < mOutputOperators.size(); i++){
			result +=  mOutputOperators.get(i)  + " = fm:create_operator_of_type(\"merge\", \"" + mOutputOperators.get(i) + "\");\"\n";
		}
		return result;
	}
	
	@Override
	public String setOperatorProperties(){
		String result = "";
		for(int i = 0; i < mInputOperators.size(); i++){
			result += "fm:connect_operators(" + mInputOperators.get(i) + ", \"out\", , \"in1\");\n";
			if((i % 2) == 0){
				result += "fm:connect_operators(" + mInputOperators.get(i) + ", \"out\", , \"in2\");\n";				
			}
		}
		return result;
	}
	
	@Override
	public String toString(){
		return initializeOperator() + setOperatorProperties();
	}
}
