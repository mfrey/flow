package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;
import java.util.Iterator;

import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class implements the basic generator functionality of a operator of the query language. 
 * the target platform. Every operator consists of a initialization method, a setup
 * of different properties and the tie up process of connecting different input and
 * output streams
 * 
 * @author Michael Frey
 */
public abstract class AbstractOperatorGenerator {
	/** The type of the operator */
	private String OPERATOR_TYPE = "_ABSTRACT_DO_NO_IMPLEMENT_";
	/** The streams which are the result of the operation */
	private ArrayList<String> mOutputStreams = new ArrayList<String>();
	/** The streams which are the input for the operation */
	private ArrayList<String> mInputStreams = new ArrayList<String>();
	/** The name of the internal representation of the stream */
	private String mOperatorStream;

	
	public AbstractOperatorGenerator(){
		
	}
	
	public AbstractOperatorGenerator(StreamStatement pStatement){
		// Create an iterator in order to iterate over the return type statements
		Iterator<StreamDefinition> streamDefinition = pStatement.getReturnStream().iterator();
		// Iterate over the return type statements
		while(streamDefinition.hasNext()){
			// Add the output stream to the list
			mOutputStreams.add(streamDefinition.next().getName());
		}
		if(this.getOutputStreams().size() == 1){
			mOperatorStream = this.getOutputStreams().get(0);
		}else if(this.getOutputStreams().size() > 1){
			mOperatorStream = "stream" + this.getOutputStreams().hashCode();
		}
	}
	
	public ArrayList<String> getOutputStreams() {
		return mOutputStreams;
	}

	public void setOutputStreams(ArrayList<String> pOutputStreams) {
		this.mOutputStreams = pOutputStreams;
	}

	public ArrayList<String> getInputStreams() {
		return mInputStreams;
	}

	public void setInputStreams(ArrayList<String> pInputStreams) {
		this.mInputStreams = pInputStreams;
	}

	public String getOperatorStream() {
		return mOperatorStream;
	}

	public void setOperatorStream(String pOperatorStream) {
		this.mOperatorStream = pOperatorStream;
	}
	
	public abstract String setBarrier();
	
	/**
	 * The method initializes the operator. The initialization of the operator 
	 * corresponds to the 'fm::create_operator_of_type' operation in LUA.
	 *
	 * @return A string which includes the initialization setting for the operator
	 */
	public String initializeOperator(){
		return Util.getInstance().createOperator(OPERATOR_TYPE, mOperatorStream);
	}
	
	/**
	 * The method sets parameters of the operator. Setting parameters of the operator 
	 * corresponds to the 'operatorname:set_parameter' operation in LUA.
	 *
	 * @return A string which includes the parameterization setting for the operator
	 */
	public abstract String setOperatorProperties();
	
	/**
	 * The method sets connection parameters of the operator. Setting connection parameters
	 * of the operator corresponds to the 'fm:connect_operators' operation in LUA.
	 *
	 * @return A string which includes the connection setting for the operator
	 */
	public abstract String setOperatorConnection();
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String toString(){
		return initializeOperator() + setBarrier() + setOperatorProperties() + setOperatorConnection();
	}
	
	public void setOperatorType(final String pType){
		OPERATOR_TYPE = pType;
	}
}
