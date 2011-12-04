package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class MultiplicationOperatorGenerator extends ArithmeticOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "mult";
	/** The internal representation of the avg operator */
	private MultiplicationOperator mOperator = null;
	
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
