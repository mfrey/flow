package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.BooleanOperation;
import de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.VariableDefinition;

public class FilterOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "Filter";
	/** The internal representation of the count operator */
	private FilterOperator mOperator = null;
	/** The name of the operator in LUA */
	private String mStream = "";
	
	public FilterOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (FilterOperator) pStatement.getOperator();
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setBarrier() {
		return "";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < this.mOperator.getExpression().size(); i++){
			// Only expressions of type boolean can be set as argument for the filter operator
			if(this.mOperator.getExpression().get(i) instanceof BooleanOperation){
				BooleanOperation operation = (BooleanOperation) this.mOperator.getExpression().get(i);
				// Add the type of the filter operation 
				result += Util.getInstance().createParameter(mStream, "type", operation.getOperator());
				// Add the right parameter of the filter operation
				result += Util.getInstance().createParameter(mStream, "operand", "right");
				result += this.createStringFromExpression(operation.getRight());
				// Add the left parameter of the filter operation
				result += Util.getInstance().createParameter(mStream, "operand", "left");
				result += this.createStringFromExpression(operation.getLeft());
			}
		}
		
		return result;
	}

	private String createStringFromExpression(Expression pExpression){
		String result = "";
		if(pExpression instanceof StreamAccess){
			StreamAccess stream = (StreamAccess) pExpression;
			result += Util.getInstance().createParameter(mStream, "stream", stream.getReference().getName());
			result += Util.getInstance().createParameter(mStream, "element", stream.getElement().getName());
		}else if(pExpression instanceof VariableDefinition){
			
			String value = "";
			String type = "";
			
			if(pExpression instanceof NumberVariableDefinition){
				type  = "number";
				value = ((NumberVariableDefinition)pExpression).getValue().toPlainString();
			}else if(pExpression instanceof StringVariableDefinition){
				type  = "string";
				value = ((StringVariableDefinition)pExpression).getValue();
			}else{
				if(pExpression instanceof BooleanVariableDefinition){
					type = "boolean";
					value = ((BooleanVariableDefinition)pExpression).isValue() + "";
				}
			}
			
			result += Util.getInstance().createParameter(mStream, "type", type);
			result += Util.getInstance().createParameter(mStream, "value", value);
			
		}else if(pExpression instanceof NumberLiteral){
			result += Util.getInstance().createParameter(mStream, "type", "nuber");
			result += Util.getInstance().createParameter(mStream, "type", ((NumberLiteral)pExpression).getValue().toPlainString());
		}else{
			// TODO: This should not happen, but could happen if you write complex expressions in filter operator
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
}
