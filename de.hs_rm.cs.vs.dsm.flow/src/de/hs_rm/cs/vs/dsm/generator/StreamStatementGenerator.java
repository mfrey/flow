package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.Div;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.Minus;
import de.hs_rm.cs.vs.dsm.flow.Multi;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.Plus;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableCall;

/**
 * The class provides a generator for simple arithmetic operations of the query 
 * language. 
 * 
 * @author Michael Frey
 */
public class StreamStatementGenerator extends AbstractOperatorGenerator {
	/** The name of the operator */
	private final String OPERATOR_TYPE = "OperatorMath";
	/** The internal representation of the statement */
	private Expression mExpression = null;
	/** The string represents the overall result */
	private String mResult = "";
	
	/** 
	 * The constructor initializes the output stream list, sets the 
	 * expression and initializes the transformation process. Each
	 * expression consists upon division, multiplication, addition
	 * and subtraction. For each of this operation in an expression
	 * a operator is created.
	 * 
	 * @param pStatement The statement which should be transformed into
	 * a set of LUA expressions
	 */
	public StreamStatementGenerator(final StreamStatement pStatement) {
		super(pStatement);
		// Save the expression
		this.mExpression = pStatement.getExpression();
		// Start the transformation of the expression to LUA constructs
		this.expressionType(this.mExpression);
	}

	/** 
	 * The method is called for each expression in a statement. A expression
	 * can be of type:
	 *
	 * 	- division
	 *  - multiplication
	 *  - addition
	 *  - subtraction
	 * 
	 * And in addition an expression are also
	 * 
	 *  - access to variables of a stream
	 *  - variables
	 *  - number literals
	 *
	 * @param pExpression The expression which should be transformed into a 
	 * LUA expression
	 */
	private void expressionType(final Expression pExpression){
		String result = "";
		// For each operator in an expression create a operator in lua
		result += Util.getInstance().createOperator(OPERATOR_TYPE, "" + pExpression.hashCode());
		
		// Check if it is a division
		if(pExpression instanceof Div){
			Div expression = (Div) pExpression;
			// Call it for the left hand expression in the div expression
			this.expressionType(expression.getLeft());
			// Call it for the right hand expression in the div expression
			this.expressionType(expression.getRight());
		// Check if it is a multiplication
		}else if(pExpression instanceof Multi){
			Multi expression = (Multi) pExpression;
			// Call it for the left hand expression in the multiplication expression
			this.expressionType(expression.getLeft());
			// Call it for the right hand expression in the multiplication expression
			this.expressionType(expression.getRight());
		// Check if it is a addition
		}else if(pExpression instanceof Plus){
			Plus expression = (Plus) pExpression;
			// Call it for the left hand expression in the plus expression
			this.expressionType(expression.getLeft());
			// Call it for the right hand expression in the plus expression
			this.expressionType(expression.getRight());
		// Check if it is a subtraction
		}else if(pExpression instanceof Minus){
			Minus expression = (Minus) pExpression;
			// Call it for the left hand expression in the minus expression
			this.expressionType(expression.getLeft());
			// Call it for the right hand expression in the minus expression
			this.expressionType(expression.getRight());
		}else if(pExpression instanceof StreamAccess){
			StreamAccess access = (StreamAccess) pExpression;
			// Set the input stream to the stream in stream access
			result += Util.getInstance().connectOperator(access.getReference().getName(), "in", "TODO", "out");
			// TODO:
			result += Util.getInstance().createParameter(access.getReference().getName(), "todo_streamaccess_variable", access.getElement().getName());
		}else if(pExpression instanceof VariableCall){
			VariableCall variable = (VariableCall) pExpression;
			// TODO:
			result += Util.getInstance().createParameter("todo", "todo_variable", variable.getVariable().getName());
		}else if(pExpression instanceof NumberLiteral){	
			NumberLiteral number = (NumberLiteral) pExpression;
			// TODO:
			result += Util.getInstance().createParameter("todo", "todo_number", number.getValue().toPlainString());
		}else{
			
		}
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
	public String initializeOperator() {
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties() {
		return "";
	}

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return "";
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String toString(){
		return this.mResult;
	}
}
