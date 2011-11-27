package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class ArithmeticOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private String OPERATOR_TYPE = "math";
	/** The type of the operator */
	private String OPERATION = "";
	/** The barrier of the operator */
	private BarrierOperator mBarrier;
	/** A list with streams and elements which are used in an arithmetic operation */ 
	private ArrayList<StreamAccess> mStreams = new ArrayList<StreamAccess>();
	/** The literal which is used in an arithmetic operation */
	private String mLiteral = "";
	
	public ArithmeticOperatorGenerator(StreamStatement pStatement){
		super(pStatement);
	}
	
	@Override
	public String setBarrier() {
		return Util.getInstance().createBarrier(this.getOutputStreams().get(0), mBarrier);
	}

	@Override
	public String initializeOperator() {
		if(this.getOutputStreams().size() == 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
		}else if(this.getOutputStreams().size() > 1){
			return Util.getInstance().createOperator(OPERATOR_TYPE, "stream" + this.getInputStreams().hashCode() + "");
		}else{
			return "Error in initializeOperator() in class AverageOperatorGenerator";
		}
	}

	@Override
	public String setOperatorProperties() {
		String result = Util.getInstance().createParameter(this.getOutputStreams().get(0) + "", "operationType", OPERATION);
		/**
		 * TODO: MEETING: Wie sollen die Elemente unterschiedlicher Streams unterschieden werden, vielleicht
		 * ein Funktionsaufruf mit drei statt zwei Parametern? 
		 */
		for(int i = 0; i < mStreams.size(); i++){
			result += Util.getInstance().createParameter(this.getOutputStreams().get(0) + "", "stream", mStreams.get(i).getReference().getName());
			result += Util.getInstance().createParameter(this.getOutputStreams().get(0) + "", "element", mStreams.get(i).getElement().getName());
		}
		
		if(!mLiteral.equals("")){
			result += Util.getInstance().createParameter(this.getOutputStreams().get(0) + "", "literal", mLiteral);
		}
		
		return result;
	}

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

	public ArrayList<StreamAccess> getOperatorStreams() {
		return mStreams;
	}

	public void setOperatorStreams(ArrayList<StreamAccess> pStreams) {
		this.mStreams = pStreams;
	}

	public String getLiteral() {
		return mLiteral;
	}

	public void setLiteral(String pLiteral) {
		this.mLiteral = pLiteral;
	}
}
