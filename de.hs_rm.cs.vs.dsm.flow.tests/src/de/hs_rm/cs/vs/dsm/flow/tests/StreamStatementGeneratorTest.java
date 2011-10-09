package de.hs_rm.cs.vs.dsm.flow.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.Div;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
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
		StreamDefinition inputStream = createStreamDefinition(mStream, "inputStream");
		assertNotNull(inputStream);
		// Create stream access object
		StreamAccess access = createStreamAccess(mElement, inputStream);
		assertNotNull(access);
		// Set left parameter
		expression.setLeft(access);
		assertNotNull(expression.getLeft());
		// Set right parameter
		expression.setRight(number);
		assertNotNull(expression.getRight());
		// Create a return Stream
		StreamDefinition outputStream = createStreamDefinition(mStream, "outputStream");
		assertNotNull(outputStream);
		// Build the statement
		buildStreamStatement(expression, outputStream);
		
		// Create stream statement generator
		StreamStatementGenerator generator = new StreamStatementGenerator(mStatement);
		
		System.out.println(generator.toString());
	}
	
	private void buildStreamStatement(Expression pExpression, StreamDefinition outputStream){
		mStatement.setExpression(pExpression);
		mStatement.getReturnStream().add(outputStream);
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
}
