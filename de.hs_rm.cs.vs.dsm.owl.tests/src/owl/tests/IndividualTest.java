/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.Individual;
import owl.OwlFactory;

import rdfs.tests.RDFSResourceTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualTest extends RDFSResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualTest.class);
	}

	/**
	 * Constructs a new Individual test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Individual getFixture() {
		return (Individual)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createIndividual());
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

} //IndividualTest
