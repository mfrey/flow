/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.IntersectionClass;
import owl.OwlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intersection Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntersectionClassTest extends OWLClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntersectionClassTest.class);
	}

	/**
	 * Constructs a new Intersection Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intersection Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntersectionClass getFixture() {
		return (IntersectionClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createIntersectionClass());
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

} //IntersectionClassTest
