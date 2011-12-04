package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.BooleanOperation;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class FilterOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "Filter";
	/** The internal representation of the count operator */
	private FilterOperator mOperator = null;
	
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
				// Add the type of the filter operation 
				result += "a";
				// Add the right parameter of the filter operation
				result += "b";
				// Add the left parameter of the filter operation
				result += "c";
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
}
