package de.hs_rm.cs.vs.dsm.flow.tests;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl;

/**
 * The class tests the system operators of the query language
 * 
 * @author Michael Frey
 */
public class SystemOperatorGeneratorTest {
	/** Instance of the factory which allows to create instances of different language objects */
	private FlowFactoryImpl mFactory;
	
	@Before
	public void initialize(){
		mFactory = new FlowFactoryImpl();
	}
	
	@Test
	public void testOutputOperatorGenerator(){
		OutputOperator operator = mFactory.createOutputOperator();
		assertNotNull(operator);
	}
	
	@Test
	public void testInputOperatorGenerator(){
		InputOperator operator = mFactory.createInputOperator();
		assertNotNull(operator);
	}
}
