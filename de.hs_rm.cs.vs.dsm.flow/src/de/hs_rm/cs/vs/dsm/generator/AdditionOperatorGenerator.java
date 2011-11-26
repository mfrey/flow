package de.hs_rm.cs.vs.dsm.generator;

import java.util.ArrayList;
import java.util.Iterator;

import de.hs_rm.cs.vs.dsm.flow.AdditionOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

public class AdditionOperatorGenerator extends ArithmeticOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "add";
	/** The internal representation of the avg operator */
	private AdditionOperator mOperator = null;
	
	public AdditionOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		// Store the operator in the attribute
		mOperator = (AdditionOperator) pStatement.getOperator();
		// Set the barrier
		this.setBarrier(mOperator.getStream().getBarrier());
		// Set the operator type
		this.setOperationType(OPERATOR_TYPE);
		// Set the streams which will be used for calculation
		if(mOperator.getStreamElements() != null){
			ArrayList<StreamAccess> elements = new ArrayList<StreamAccess>();
			// Setup an iterator for the elist
			Iterator<StreamAccess> iterator = this.mOperator.getStreamElements().iterator();
			// Iterate over the elist
			while(iterator.hasNext()){
				elements.add(iterator.next());
			}
			// Add the streams to the operator streams list
			this.setOperatorStreams(elements);
		}
		if(mOperator.getLiteral() != null){
			this.setLiteral(mOperator.getLiteral().toPlainString());
		}
	}
}
