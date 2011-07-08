/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLDatatypeProperty;
import owl.OwlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Datatype Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLDatatypePropertyTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLDatatypePropertyTest.class);
	}

	/**
	 * Constructs a new OWL Datatype Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDatatypePropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Datatype Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLDatatypeProperty getFixture() {
		return (OWLDatatypeProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLDatatypeProperty());
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

} //OWLDatatypePropertyTest
