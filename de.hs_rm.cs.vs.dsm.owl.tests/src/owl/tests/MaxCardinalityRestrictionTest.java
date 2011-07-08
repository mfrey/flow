/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.MaxCardinalityRestriction;
import owl.OwlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Max Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaxCardinalityRestrictionTest extends OWLRestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaxCardinalityRestrictionTest.class);
	}

	/**
	 * Constructs a new Max Cardinality Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCardinalityRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Max Cardinality Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MaxCardinalityRestriction getFixture() {
		return (MaxCardinalityRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createMaxCardinalityRestriction());
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

} //MaxCardinalityRestrictionTest
