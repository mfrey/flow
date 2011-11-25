package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

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
	/***/
	private final String DIV_OPERATOR_NAME = "div";
	/***/
	private final String ADD_OPERATOR_NAME = "add";
	/***/
	private final String SUB_OPERATOR_NAME = "sub";
	/***/
	private final String MULT_OPERATOR_NAME = "mult";
	/** The internal representation of the statement */
	private Expression mExpression = null;
	/** */
	private ArrayList<StreamStatementOperatorGenerator> mOperators = new ArrayList<StreamStatementOperatorGenerator>();
	
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
		this.simpleCase(this.mExpression);
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
		return "";
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
		/** The result string */
		String result = "";
		/** Iterate over the array of operators */
		for(int i = 0; i < this.mOperators.size(); i++){
			/** Add string representation of each operator to the result string */
			result += this.mOperators.get(i).toString();
		}
		/** Return the result */
		return result;
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
	 * And in addition an expression is also
	 * 
	 *  - access to variables of a stream
	 *  - variables
	 *  - number literals
	 *
	 * @param pExpression The expression which should be transformed into a 
	 * LUA expression
	 * 
	 */
	public void simpleCase(final Expression pExpression){
		StreamStatementOperatorGenerator operator;
		
		if(pExpression instanceof Div){
			operator = new StreamStatementOperatorGenerator("div", ((Div) pExpression).getLeft(), ((Div) pExpression).getRight(), this.getOutputStreams());
		}else if(pExpression instanceof Multi){
			operator = new StreamStatementOperatorGenerator("multi", ((Multi) pExpression).getLeft(), ((Multi) pExpression).getRight(), this.getOutputStreams());
		}else if(pExpression instanceof Plus){
			operator = new StreamStatementOperatorGenerator("plus", ((Plus) pExpression).getLeft(), ((Plus) pExpression).getRight(), this.getOutputStreams());
		}else if(pExpression instanceof Minus){
			operator = new StreamStatementOperatorGenerator("minus", ((Minus) pExpression).getLeft(), ((Minus) pExpression).getRight(), this.getOutputStreams());
		}else{
			// Aehm
			operator = null;
		}
		this.mOperators.add(operator);
	}
	
	public void complexCase(final Expression pExpression){
		StreamStatementOperatorGenerator operator;

		if(pExpression instanceof Div){
			if(isExpression(((Div) pExpression).getLeft())){
				/** Call the function if the left operand is an expression */
				complexCase(((Div) pExpression).getLeft());
				
				if(isExpression(((Div) pExpression).getRight())){
					/** Call the function if the right operand is an expression */
					complexCase(((Div) pExpression).getRight());
				}else{
					operator = new StreamStatementOperatorGenerator(DIV_OPERATOR_NAME, ((Div) pExpression).getLeft(), ((Div) pExpression).getRight(), this.getOutputStreams());
					this.mOperators.add(operator);					
				}
			}else{
				
				if(isExpression(((Div) pExpression).getRight())){
					/** Call the function if the right operand is a expression */
					complexCase(((Div) pExpression).getRight());
				}else{
					operator = new StreamStatementOperatorGenerator(DIV_OPERATOR_NAME, ((Div) pExpression).getLeft(), ((Div) pExpression).getRight(), this.getOutputStreams());
					this.mOperators.add(operator);
				}
			}

			
		}else if(pExpression instanceof Multi){
			operator = new StreamStatementOperatorGenerator("multi", ((Multi) pExpression).getLeft(), ((Multi) pExpression).getRight(), this.getOutputStreams());
		}else if(pExpression instanceof Plus){
			operator = new StreamStatementOperatorGenerator("plus", ((Plus) pExpression).getLeft(), ((Plus) pExpression).getRight(), this.getOutputStreams());
		}else if(pExpression instanceof Minus){
			operator = new StreamStatementOperatorGenerator("minus", ((Minus) pExpression).getLeft(), ((Minus) pExpression).getRight(), this.getOutputStreams());
		}else{
			// Aehm
			operator = null;
		}
	}

	private boolean isExpression(final Expression pExpression){
		if(pExpression instanceof Div){
			return true;
		}else if(pExpression instanceof Multi){
			return true;
		}else if(pExpression instanceof Plus){
			return true;
		}else if(pExpression instanceof Minus){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 
	 */
	private class StreamStatementOperatorGenerator extends AbstractOperatorGenerator {
		/** The name of the operator */
		private String mName = "";
		/** The type of the operation */
		private String mType = "";
		/** The left operand of an expression */
		private Expression mLeft; 
		/** The right operand of an expression */
		private Expression mRight;
		
		public StreamStatementOperatorGenerator(final String pType, final String pLeft, final String pRight, final ArrayList<String> pOutputStreams){
			this.setOutputStreams(pOutputStreams);
		}
		
		/**
		 * The constructor 
		 *
		 * @param pType The type of the expression
		 * @param pLeft The left operand of the expression
		 * @param pRight The right operand of the expression
		 * @praam pResultStream The name of the stream which stores the result
		 */
		public StreamStatementOperatorGenerator(final String pType, final Expression pLeft, final Expression pRight, final ArrayList<String> pOutputStreams){
			/** Set the operator name */
			this.mName = "math";
			/** Set the left operand */
			this.mLeft = pLeft;
			/** Set the right operand */
			this.mRight = pRight;
			/** Set the type of the operator */
			this.mType = pType;
			/** Set the output streams */
			this.setOutputStreams(pOutputStreams);
		}
		
		/**
		 * {@inheritDoc} 
		 */
		@Override
		public String setBarrier() {
			/**
			 *  There is no barrier in a simple expression, every operation 
			 *  is executed on each (corresponding) element in a stream. 
			 */
			return "";
		}

		/**
		 * {@inheritDoc} 
		 */
		@Override
		public String initializeOperator() {
			/** Create an 'instance' of the operator */
			return Util.getInstance().createOperator(OPERATOR_TYPE, "" + mName);
		}

		/**
		 * {@inheritDoc} 
		 */
		@Override
		public String setOperatorProperties() {
			/** The operands of the expression are the parameters of an lua expression */
			String result = Util.getInstance().createParameter(this.mName  + "", "operationType", this.mType);
			/** Create a parameter for the left operand */
			result += createParameterFromExpression(mLeft);
			/** Create a parameter for the right operand */
			result += createParameterFromExpression(mRight);
			/** Return the result */
			return result;
		}
		
		/**
		 * 
		 * 
		 * @param pExpression
		 */
		private String createParameterFromExpression(final Expression pExpression){
			String result = "";
			
			/** Is it a literal? */
			if(isOperandLiteral(pExpression)){
				NumberLiteral literal = (NumberLiteral)pExpression;
				result += Util.getInstance().createParameter(this.mName  + "", "operand", literal.getValue().toPlainString());
			/** Is it a stream? */
			}else if(isOperandStream(pExpression)){
				StreamAccess stream = (StreamAccess)pExpression;
				/** Add the stream to the input streams */
				this.getInputStreams().add(stream.getStreamVariable().getReference().getName());
				// TODO: Is this really correct
				result += Util.getInstance().createParameter(this.mName  + "", "operand", stream.getStreamVariable().getElement().getName());
			/** Is it a variable? */
			}else if(isOperandVariable(pExpression)){
				VariableCall variable = (VariableCall)pExpression;
				// TODO: This will not work out
				result += Util.getInstance().createParameter(this.mName  + "", "operand", variable.getVariable().getName());
			}else{
				// this should never happen
			}
			
			return result;
		}
		
		/**
		 * The method checks if the parameter is a stream
		 *
		 * @param  The expression which should be validated
		 * @return True if the expression is a stream
		 */
		private boolean isOperandStream(final Expression pExpression){
			return pExpression instanceof StreamAccess;
		}
		
		/**
		 * The method checks if the parameter is a number literal
		 *
		 * @param  The expression which should be validated
		 * @return True if the expression is a number literal
		 */
		private boolean isOperandLiteral(final Expression pExpression){
			return pExpression instanceof NumberLiteral;
		}
		
		/**
		 * The method checks if the parameter is a variable
		 *
		 * @param  The expression which should be validated
		 * @return True if the expression is a variable declaration
		 */
		private boolean isOperandVariable(final Expression pExpression){
			return pExpression instanceof VariableCall;
		}

		/**
		 * {@inheritDoc} 
		 */
		@Override
		public String setOperatorConnection() {
			return Util.getInstance().connectOperator(this.getInputStreams().get(0), "in", this.getOutputStreams(), "out");
		}
	}
}
