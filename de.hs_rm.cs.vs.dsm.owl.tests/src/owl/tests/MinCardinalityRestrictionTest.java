/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.MinCardinalityRestriction;
import owl.OwlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Min Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinCardinalityRestrictionTest extends OWLRestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MinCardinalityRestrictionTest.class);
	}

	/**
	 * Constructs a new Min Cardinality Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinCardinalityRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Min Cardinality Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MinCardinalityRestriction getFixture() {
		return (MinCardinalityRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createMinCardinalityRestriction());
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

} //MinCardinalityRestrictionTest
