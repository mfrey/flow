package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class ArithmeticOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private String OPERATOR_TYPE = "";
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
		return Util.getInstance().createOperator(OPERATOR_TYPE, this.getOutputStreams().get(0));
	}

	@Override
	public String setOperatorProperties() {
		String result = Util.getInstance().createParameter("TODO" + "", "operationType", OPERATOR_TYPE);
		// Wie soll man gleichnamige elemente unterschiedlicher datenstroeme unterscheiden ?
		result += "";
		return result;
	}

	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(this.getInputStreams(), "in", this.getOutputStreams(), "out");
	}

	public String getOperatorType() {
		return OPERATOR_TYPE;
	}

	public void setOperatorType(final String pOperatorType) {
		OPERATOR_TYPE = pOperatorType;
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
