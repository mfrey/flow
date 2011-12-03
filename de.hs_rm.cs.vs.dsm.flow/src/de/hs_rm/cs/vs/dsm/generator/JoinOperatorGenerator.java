package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides a generator for the join operator of the query 
 * language. The operator is defined as follows
 * 
 *	'join''('parameter=StreamAccess ',' stream=StreamOperatorParameter ')';
 *
 * The operator starts with the keyword join followed by a left parenthesis, 
 * followed by a list of streams and right parenthesis.
 * 
 * @author Michael Frey
 */
public class JoinOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "Merge";
	/** The internal representation of the count operator */
	private JoinOperator mOperator = null;
	
	public JoinOperatorGenerator(final StreamStatement pStatement){
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (JoinOperator) pStatement.getOperator();
		// Add the input streams to the list
		for(int i = 0; i < this.mOperator.getParameters().size(); i++){
			this.getInputStreams().add( this.mOperator.getParameters().get(i).getStream().getName());
		}
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator(){
		if(this.getOutputStreams().size() == 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
		}else if(this.getOutputStreams().size() > 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, "stream" + this.getInputStreams().hashCode() + "");
		}else{
			return "Error in initializeOperator() in class JoinOperatorGenerator";
		}
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorProperties(){
		return "";
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
