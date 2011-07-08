/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLClass;
import owl.OwlFactory;

import rdfs.tests.RDFSClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLClassTest extends RDFSClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLClassTest.class);
	}

	/**
	 * Constructs a new OWL Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLClass getFixture() {
		return (OWLClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLClass());
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

} //OWLClassTest
