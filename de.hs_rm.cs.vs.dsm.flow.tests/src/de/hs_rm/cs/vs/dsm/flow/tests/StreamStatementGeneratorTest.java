package de.hs_rm.cs.vs.dsm.flow.tests;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.Div;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl;
import de.hs_rm.cs.vs.dsm.generator.StreamStatementGenerator;

/**
 * 
 * @author Michael Frey
 */
public class StreamStatementGeneratorTest {
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
	public void testStreamStatementGeneratorSimpleDivisionExpression(){
		// Create a divide expression
		Div expression = mFactory.createDiv();
		// Create a number literal
		NumberLiteral number = mFactory.createNumberLiteral();
		assertNotNull(number);
		// Set value of number literal
		number.setValue(new BigDecimal(42));
		// Create a stream definition
		StreamDefinition inputStream = Util.getInstance().createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = Util.getInstance().createStreamAccess(mElement, inputStream);
		assertNotNull(access);
		// Set left parameter
		expression.setLeft(access);
		assertNotNull(expression.getLeft());
		// Set right parameter
		expression.setRight(number);
		assertNotNull(expression.getRight());
		// Create a return Stream
		StreamDefinition outputStream = Util.getInstance().createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		mStatement = Util.getInstance().buildStreamStatement(mStatement, expression, outputStream);
		
		// Create stream statement generator
		StreamStatementGenerator generator = new StreamStatementGenerator(mStatement);
		
		System.out.println(generator.toString());
	}
	
	/**
	 * 
	 */
	@Test
	public void testStreamStatementGeneratorSimpleMultiplicationExpression(){
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testStreamStatementGeneratorSimpleAdditionExpression(){
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testStreamStatementGeneratorSimpleSubtractionExpression(){
		
	}

}
