package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDefinition;

public class ArithmeticOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private String OPERATOR_TYPE = "Math";
	/** The type of the operator */
	private String OPERATION = "";
	/** The barrier of the operator */
	private BarrierOperator mBarrier;
	/** The stream and its element which is used in an arithmetic operation */ 
	private StreamAccess mStreamParameter;
	/** The literal which is used in an arithmetic operation */
	private String mLiteral = "";
	/** The name of the output stream */
	private String mStream = "";
	
	public ArithmeticOperatorGenerator(StreamStatement pStatement){
		super(pStatement);
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
		String result = Util.getInstance().createParameter(mStream, "operationType", OPERATION);

		if(mStreamParameter != null){
			result += Util.getInstance().createParameter(mStream, "stream", mStreamParameter.getStreamVariable().getReference().getName());
			result += Util.getInstance().createParameter(mStream, "element", mStreamParameter.getElement().getName());
		}else if(!mLiteral.equals("")){
			result += Util.getInstance().createParameter(mStream, "literal", mLiteral);
		}else{
			// Shouldn't happen
		}
		
		return result;
	}

	/**
	 * The method stores the value of a variable definition. The value itself is
	 * stored in the mLiteral member variable of the class.
	 * 
	 * @param pVariable The variable which should be saved
	 */
	public void setVariableDefinition(final VariableDefinition pVariable){
		if(pVariable instanceof NumberVariableDefinition){
			mLiteral = ((NumberVariableDefinition)pVariable).getValue().toPlainString();
		}
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

	public String getOperationType() {
		return OPERATION;
	}

	public void setOperationType(final String pOperationType) {
		OPERATION = pOperationType;
	}

	public BarrierOperator getBarrier() {
		return mBarrier;
	}

	public void setBarrier(final BarrierOperator pBarrier) {
		this.mBarrier = pBarrier;
	}


	public void setStreamParameter(StreamAccess pStream) {
		this.mStreamParameter = pStream;
	}

	public String getLiteral() {
		return mLiteral;
	}

	public void setLiteral(String pLiteral) {
		this.mLiteral = pLiteral;
	}
}
