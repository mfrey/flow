package de.hs_rm.cs.vs.dsm.flow.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;
import de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl;

/**
 * 
 * @author Michael Frey
 */
public class ParserGeneratorTest  {
	/** A string which represents a test for the operator */
	private String mOperatorTestString = "";
	/** Instance of the factory which allows to create instances of different language objects */
	private FlowFactoryImpl mFactory;
	/** */
	private StreamStatement mStatement;
	/** */
	private VariableDeclaration mElement;
	/** */
	private StreamDeclaration mStream;
	
	@Before
	public void initialize(){
		mFactory = new FlowFactoryImpl();
		// Create a stream statement
		mStatement = mFactory.createStreamStatement();
		assertNotNull(mStatement);
		// Create stream declaration 
		mStream = mFactory.createStreamDeclaration();
		assertNotNull(mStream);
		// Set the name of the stream
		mStream.setName("inputTestStream");
		// Create a variable declaration which is added to the stream
		mElement = mFactory.createVariableDeclaration();
		assertNotNull(mElement);
		// Set the name of the variable
		mElement.setName("testElement");
		// Create the type of the variable
		IntegerDataType type = mFactory.createIntegerDataType();
		assertNotNull(type);
		// Set the type of the variable;
		mElement.setType(type);
		// Add an element to the stream
		mStream.getElements().add(mElement);
	}
	
	@Test
	public void simpleTest(){
		// Just for the sake of the build process, will add other unit tests later
		assertTrue(true);
	}
	
	/**
	 * 
	 */
	@Test
	public void testCountOperatorGenerator(){
		// Create count operator
		CountOperator operator = mFactory.createCountOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = createWindowOperator(10, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		buildStreamStatement(operator, outputStream);
	}
	
	/**
	 * 
	 */
	@Test
	public void testStandardDeviationOperatorGenerator(){
		// Create count operator
		StandardDeviationOperator operator = mFactory.createStandardDeviationOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = createWindowOperator(10, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		buildStreamStatement(operator, outputStream);
	}
	
	/**
	 * 
	 */
	@Test
	public void testAverageOperatorGenerator(){
		// Create count operator
		AverageOperator operator = mFactory.createAverageOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = createWindowOperator(10, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		buildStreamStatement(operator, outputStream);
	}

	private StreamAccess createStreamAccess(final VariableDeclaration pDeclaration, final StreamDefinition pStream){
		// Create stream access object
		StreamAccess access = mFactory.createStreamAccess();
		// Set the element
		access.setElement(pDeclaration);
		// Set the reference to the input stream
		access.setReference(pStream);
		
		return access;
	}
	
	private StreamDefinition createStreamDefinition(final StreamDeclaration pStream, final String pName){
		StreamDefinition result = mFactory.createStreamDefinition();
		result.setReference(pStream);
		result.setName(pName);
		return result;
	}
	
	private StreamOperatorParameter createStreamOperatorParameter(final StreamDefinition pStream, final BarrierOperator pBarrier){
		StreamOperatorParameter streamOperatorParameter = mFactory.createStreamOperatorParameter();
		// Set stream parameter to the stream definition
		streamOperatorParameter.setStream(pStream);
		// Set window
		streamOperatorParameter.setBarrier(pBarrier);

		return streamOperatorParameter;
	}
	
	private void buildStreamStatement(ReturnTypeOperator mOperator, StreamDefinition outputStream){
		mStatement.setExpression(mOperator);
		mStatement.getReturnStream().add(outputStream);
	}
	
	private WindowOperator createWindowOperator(int pValue, String pSetting, String pUnit){
		WindowOperator result = mFactory.createWindowOperator();
		result.setSetting(pSetting);

		if(pSetting.equals("last")){
			result.setValue(new BigDecimal(pValue));
			result.setUnit(pUnit);
		}
		
		return result;
	}
}
