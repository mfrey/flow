/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLDataRange;
import owl.OwlFactory;

import rdfs.tests.RDFSClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Data Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLDataRangeTest extends RDFSClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLDataRangeTest.class);
	}

	/**
	 * Constructs a new OWL Data Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDataRangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Data Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLDataRange getFixture() {
		return (OWLDataRange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLDataRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OWLDataRangeTest
