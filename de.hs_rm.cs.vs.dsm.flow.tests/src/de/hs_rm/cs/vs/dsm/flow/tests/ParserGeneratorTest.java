package de.hs_rm.cs.vs.dsm.flow.tests;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;

import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.impl.StreamStatementImpl;

/**
 * 
 * @author Michael Frey
 */
public class ParserGeneratorTest extends AbstractTest {
	/** A string which represents a test for the operator */
	private String mOperatorTestString = "";

	
	@Before
	public void initialize(){
		
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
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testStandardDeviationOperatorGenerator(){
		
	}
	
	/**
	 * 
	 */
	@Test
	public void testAverageOperatorGenerator(){
		
	}
}
