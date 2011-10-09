package de.hs_rm.cs.vs.dsm.flow.tests;

import java.math.BigDecimal;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;
import de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl;

/**
 * The class provides utility functions for constructing objects 
 * of the language. Most of the code is simple instantiating of 
 * objects and setting parameters of the objects. 
 *
 * @author Michael Frey
 */
public class Util {
	/** The singleton instance of the class*/
	private static final Util mInstance = new Util();
	/** Instance of the factory which allows to create instances of different language objects */
	private FlowFactoryImpl mFactory;

	private Util(){
		mFactory = new FlowFactoryImpl();
	}
	
	/**
	 * The method returns an instance of the class
	 *
	 * @return The only instance of the class Util
	 */
	public static Util getInstance(){
		return mInstance;
	}
	
	public StreamAccess createStreamAccess(final VariableDeclaration pDeclaration, final StreamDefinition pStream){
		// Create stream access object
		StreamAccess access = mFactory.createStreamAccess();
		// Set the element
		access.setElement(pDeclaration);
		// Set the reference to the input stream
		access.setReference(pStream);
		
		return access;
	}
	
	public StreamDefinition createStreamDefinition(final StreamDeclaration pStream, final String pName){
		StreamDefinition result = mFactory.createStreamDefinition();
		result.setReference(pStream);
		result.setName(pName);
		
		return result;
	}
	
	public StreamOperatorParameter createStreamOperatorParameter(final StreamDefinition pStream, final BarrierOperator pBarrier){
		StreamOperatorParameter streamOperatorParameter = mFactory.createStreamOperatorParameter();
		// Set stream parameter to the stream definition
		streamOperatorParameter.setStream(pStream);
		// Set window
		streamOperatorParameter.setBarrier(pBarrier);

		return streamOperatorParameter;
	}
	
	public StreamStatement buildStreamStatement(StreamStatement pStatement, ReturnTypeOperator pOperator, StreamDefinition pOutputStream){
		pStatement.setOperator(pOperator);
		pStatement.getReturnStream().add(pOutputStream);
		return pStatement;
	}
	
	public StreamStatement buildStreamStatement(StreamStatement pStatement, Expression pExpression, StreamDefinition pOutputStream){
		pStatement.setExpression(pExpression);
		pStatement.getReturnStream().add(pOutputStream);
		return pStatement;
	}
	
	
	public WindowOperator createWindowOperator(int pValue, String pSetting, String pUnit){
		WindowOperator result = mFactory.createWindowOperator();
		result.setSetting(pSetting);

		if(pSetting.equals("last")){
			result.setValue(new BigDecimal(pValue));
			result.setUnit(pUnit);
		}
		
		return result;
	}
}
