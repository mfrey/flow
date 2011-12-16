package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;


/**
 * The MultiplicationOperatorGenerator class generates a LUA code representation
 * of the MultiplicationOperator. The operator is defined as follows:
 * 
 * 	'mult''('parameter=StreamAccess ',' (literal=NUMBER | 
 *    streamElement=StreamAccess | 
 *    variable=[VariableDefinition])')';	
 * 
 * The operator is initialized with the 'mult' keyword followed by a list
 * of arguments where the first argument denotes the input stream and an 
 * element of the stream which is part of the operation followed by a
 * number literal, another element of a stream or a variable.
 * 
 * @author Michael Frey 
 */
public class MultiplicationOperatorGenerator extends ArithmeticOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "mult";
	/** The internal representation of the avg operator */
	private MultiplicationOperator mOperator = null;
	
	/**
	 * The constructor delegates most of the functionality to the super
	 * class of the operator generator (ArithmeticOperatorGenerator) 
	 * where the input and output streams are set and the arguments of
	 * the operator are parsed and transformed to the LUA code 
	 * representation of the operator.
	 * 
	 * @param pStatement The statement which contains the operator
	 */
	public MultiplicationOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		// Store the operator in the attribute
		mOperator = (MultiplicationOperator) pStatement.getOperator();
		// Set the operator type
		this.setOperationType(OPERATOR_TYPE);
		
		ArrayList<String> inputStreams = new ArrayList<String>();
		inputStreams.add(mOperator.getParameter().getReference().getName());
		
		
		if(mOperator.getLiteral() != null){
			this.setLiteral(mOperator.getLiteral().toPlainString());
		}else if(mOperator.getVariable() != null){
			this.setVariableDefinition(mOperator.getVariable());
		}else{
			inputStreams.add(mOperator.getStreamElement().getReference().getName());
			this.setStreamParameter(mOperator.getStreamElement());
		}
		
		this.setInputStreams(inputStreams);
	}
}
