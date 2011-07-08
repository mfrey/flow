/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLAllDifferent;
import owl.OwlFactory;

import rdfs.tests.RDFSResourceTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL All Different</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLAllDifferentTest extends RDFSResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLAllDifferentTest.class);
	}

	/**
	 * Constructs a new OWL All Different test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLAllDifferentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL All Different test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLAllDifferent getFixture() {
		return (OWLAllDifferent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLAllDifferent());
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

} //OWLAllDifferentTest
