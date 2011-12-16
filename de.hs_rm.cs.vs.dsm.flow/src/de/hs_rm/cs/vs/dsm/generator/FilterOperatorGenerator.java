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

/**
 * The FilterOperatorGenerator class generates a LUA code representation
 * of the FilterOperator. The operator is defined as follows:
 * 
 *	'filter' '(' expression+=Expression (',' expression+=Expression)* ',' 
 *    stream=StreamOperatorParameter')';
 *	
 * The operator is initialized with the 'filter' keyword followed by a list
 * of arguments where the last argument denotes the input stream. Previous
 * arguments are boolean expressions which specify how the stream is 
 * sorted.
 * 
 * @author Michael Frey 
 */
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
		// Add the input operator to the stream
		this.getInputStreams().add(this.mOperator.getStream().getStream().getName());
		// Set the type of the operator
		this.setOperatorType(OPERATOR_TYPE);
		// Set the name of the stream 
		mStream = this.getOperatorStream();
	}
	
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < this.mOperator.getExpression().size(); i++){
			// Only expressions of type boolean can be set as argument for the filter operator
			if(this.mOperator.getExpression().get(i) instanceof BooleanOperation){
				BooleanOperation operation = (BooleanOperation) this.mOperator.getExpression().get(i);
				// Add the type of the filter operation 
				result += Util.getInstance().createParameter(mStream, "operatortype", operation.getOperator());
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

	/**
	 * The method transforms an expression to a LUA code fragment for the
	 * filter operator.
	 * 
	 * @param pExpression The expression which will be transformed in a LUA code representation
	 * 
	 * @return The LUA code representation of the input expression
	 */
	private String createStringFromExpression(Expression pExpression){
		String result = "";
		if(pExpression instanceof StreamAccess){
			StreamAccess stream = (StreamAccess) pExpression;
			result += Util.getInstance().createParameter(mStream, "stream", stream.getStreamVariable().getReference().getName());
			result += Util.getInstance().createParameter(mStream, "element", stream.getStreamVariable().getElement().getName());
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
			result += Util.getInstance().createParameter(mStream, "type", "number");
			result += Util.getInstance().createParameter(mStream, "type", ((NumberLiteral)pExpression).getValue().toPlainString());
		}else{
			// TODO: This should not happen, but could happen if you write complex expressions in filter operator
		}
		return result;
	}
	
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}
}
