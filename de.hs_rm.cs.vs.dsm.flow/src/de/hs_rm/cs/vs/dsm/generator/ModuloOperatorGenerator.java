package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.ModuloOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The ModuloOperatorGenerator class generates a LUA code representation
 * of the ModuloOperator. The operator is defined as follows:
 * 
 * 	'mod''('parameter=StreamAccess ',' (literal=NUMBER | 
 *    streamElement=StreamAccess | 
 *    variable=[VariableDefinition])')';	
 * 
 * The operator is initialized with the 'mod' keyword followed by a list
 * of arguments where the first argument denotes the input stream and an 
 * element of the stream which is part of the operation followed by a
 * number literal, another element of a stream or a variable.
 * 
 * @author Michael Frey 
 */
public class ModuloOperatorGenerator extends ArithmeticOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "mod";
	/** The internal representation of the avg operator */
	private ModuloOperator mOperator = null;
	
	/**
	 * The constructor delegates most of the functionality to the super
	 * class of the operator generator (ArithmeticOperatorGenerator) 
	 * where the input and output streams are set and the arguments of
	 * the operator are parsed and transformed to the LUA code 
	 * representation of the operator.
	 * 
	 * @param pStatement The statement which contains the operator
	 */
	public ModuloOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		// Store the operator in the attribute
		mOperator = (ModuloOperator) pStatement.getOperator();
		// Set the operator type
		this.setOperationType(OPERATOR_TYPE);
		
		this.getInputStreams().add(mOperator.getParameter().getReference().getName());
		this.setStreamParameter(mOperator.getParameter());
		
		if(mOperator.getLiteral() != null){
			this.setLiteral(mOperator.getLiteral().toPlainString());
		}else if(mOperator.getVariable() != null){
			this.setVariableDefinition(mOperator.getVariable());
		}else{
			if(this.getInputStreams().get(0) != mOperator.getStreamElement().getReference().getName()){
				this.getInputStreams().add(mOperator.getStreamElement().getReference().getName());
			}
			this.setStreamParameterOperand(mOperator.getStreamElement());
		}
	}
}
