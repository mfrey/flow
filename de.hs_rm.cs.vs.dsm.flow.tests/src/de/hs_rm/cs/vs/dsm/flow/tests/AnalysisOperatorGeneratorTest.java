package de.hs_rm.cs.vs.dsm.flow.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;
import de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl;
import de.hs_rm.cs.vs.dsm.generator.AverageOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.CountOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.StandardDeviationOperatorGenerator;

/**
 * 
 * @author Michael Frey
 */
public class AnalysisOperatorGeneratorTest  {
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
	
	/**
	 * 
	 */
	@Test
	public void testCountOperatorGenerator(){
		int w = 10;
		// Create count operator
		CountOperator operator = mFactory.createCountOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = Util.getInstance().createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = Util.getInstance().createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = Util.getInstance().createWindowOperator(w, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = Util.getInstance().createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = Util.getInstance().createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		mStatement = Util.getInstance().buildStreamStatement(mStatement, operator, outputStream);
		
		mOperatorTestString =  "outputStream = fm:create_operator_of_type(\"outputStream\", \"count\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"step_size_num\", \"" +  (w * 1000 * 60) + "\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"window_type\", \"time\");\n";
		mOperatorTestString += "fm:connect_operators(outputStream, \"out\", inputStream, \"in\");\n";
		
		CountOperatorGenerator generator = new CountOperatorGenerator(mStatement);
		boolean result = mOperatorTestString.equals(generator.toString());
		assertTrue(result);
	}
	
	/**
	 * 
	 */
	@Test
	public void testStandardDeviationOperatorGenerator(){
		int w = 10;
		// Create count operator
		StandardDeviationOperator operator = mFactory.createStandardDeviationOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = Util.getInstance().createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = Util.getInstance().createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = Util.getInstance().createWindowOperator(w, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = Util.getInstance().createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = Util.getInstance().createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		mStatement = Util.getInstance().buildStreamStatement(mStatement, operator, outputStream);
		
		mOperatorTestString =  "outputStream = fm:create_operator_of_type(\"outputStream\", \"std\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"step_size_num\", \"" +  (w * 1000 * 60) + "\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"window_type\", \"time\");\n";
		mOperatorTestString += "fm:connect_operators(outputStream, \"out\", inputStream, \"in\");\n";
		
		StandardDeviationOperatorGenerator generator = new StandardDeviationOperatorGenerator(mStatement);
		boolean result = mOperatorTestString.equals(generator.toString());
		assertTrue(result);
	}
	
	/**
	 * 
	 */
	@Test
	public void testAverageOperatorGenerator(){
		int w = 10;
		
		// Create count operator
		AverageOperator operator = mFactory.createAverageOperator();
		assertNotNull(operator);
		// Create a stream definition
		StreamDefinition inputStream = Util.getInstance().createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = Util.getInstance().createStreamAccess(mElement, inputStream);
		assertNotNull(access);		
		// Create a barrier
		WindowOperator window = Util.getInstance().createWindowOperator(w, "last", "min");
		assertNotNull(window);
		// Create a stream operator parameter
		StreamOperatorParameter parameter = Util.getInstance().createStreamOperatorParameter(inputStream, window);
		assertNotNull(parameter);
		// Set the parameter of the operator
		operator.setParameter(access);
		// Set stream
		operator.setStream(parameter);
		// Create a return Stream
		StreamDefinition outputStream = Util.getInstance().createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		mStatement = Util.getInstance().buildStreamStatement(mStatement, operator, outputStream);
		
		mOperatorTestString =  "outputStream = fm:create_operator_of_type(\"outputStream\", \"avg\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"step_size_num\", \"" +  (w * 1000 * 60) + "\");\n";
		mOperatorTestString += "outputStream:set_parameter(\"window_type\", \"time\");\n";
		mOperatorTestString += "fm:connect_operators(outputStream, \"out\", inputStream, \"in\");\n";
		
		AverageOperatorGenerator generator = new AverageOperatorGenerator(mStatement);
		boolean result = mOperatorTestString.equals(generator.toString());
		assertTrue(result);
	}

	
}
