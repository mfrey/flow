/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OwlFactory;
import owl.SomeValuesFromRestriction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Some Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SomeValuesFromRestrictionTest extends OWLRestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SomeValuesFromRestrictionTest.class);
	}

	/**
	 * Constructs a new Some Values From Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeValuesFromRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Some Values From Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SomeValuesFromRestriction getFixture() {
		return (SomeValuesFromRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createSomeValuesFromRestriction());
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

} //SomeValuesFromRestrictionTest
