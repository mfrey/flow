/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.AllValuesFromRestriction;
import owl.OwlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>All Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllValuesFromRestrictionTest extends OWLRestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllValuesFromRestrictionTest.class);
	}

	/**
	 * Constructs a new All Values From Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllValuesFromRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this All Values From Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllValuesFromRestriction getFixture() {
		return (AllValuesFromRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createAllValuesFromRestriction());
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

} //AllValuesFromRestrictionTest
