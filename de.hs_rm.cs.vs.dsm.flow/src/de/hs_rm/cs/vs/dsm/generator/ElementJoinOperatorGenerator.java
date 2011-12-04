package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition;

public class ElementJoinOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "ElementJoin";
	/** The internal representation of the count operator */
	private ElementJoinOperator mOperator = null;
	
	private String mStream = "";
	
	public ElementJoinOperatorGenerator(StreamStatement pStatement) {
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (ElementJoinOperator) pStatement.getOperator();	

		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < this.mOperator.getVariableElementParameters().size(); i++){
			if(this.mOperator.getVariableElementParameters().get(i) instanceof NumberVariableDefinition){
				NumberVariableDefinition variable = (NumberVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "number");
				result += Util.getInstance().createParameter(mStream, "value", variable.getValue().toPlainString());
			}else if(this.mOperator.getVariableElementParameters().get(i) instanceof StringVariableDefinition){
				StringVariableDefinition variable = (StringVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "string");
				result += Util.getInstance().createParameter(mStream, "value", variable.getValue());
			}else if(this.mOperator.getVariableElementParameters().get(i) instanceof BooleanVariableDefinition){
				BooleanVariableDefinition variable = (BooleanVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "boolean");
				result += Util.getInstance().createParameter(mStream, "value", variable.isValue() + "");
			}else{
				// This should not happen
			}
		}

		return result;
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}
}
