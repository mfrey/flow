package de.hs_rm.cs.vs.dsm.generator;

import java.lang.reflect.Array;

import org.eclipse.emf.common.util.EList;

import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
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
public class InputOperatorGenerator extends SystemOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "CacheIn";
	/** The operator */
	private InputOperator mOperator;
	/** The output streams of the operator */
	private EList<StreamDefinition> mOutputStreams;
	
	public InputOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the super class
		super(((InputOperator) pStatement.getOperator()).getIri(), ((InputOperator) pStatement.getOperator()).getAddress(), ((InputOperator) pStatement.getOperator()).getPort().toPlainString());
		// Store the operator in the attribute
		this.mOperator = (InputOperator) pStatement.getOperator();
		// Store the output streams in a member
		mOutputStreams = pStatement.getReturnStream();
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		if(this.getOutputStreams().size() == 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
		}else if(this.getOutputStreams().size() > 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, "stream" + this.getOutputStreams().hashCode() + "");
		}else{
			return "Error in initializeOperator() in class InputOperatorGenerator";
		}
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String toString(){
		return initializeOperator() + setOperatorProperties();
	}
}
