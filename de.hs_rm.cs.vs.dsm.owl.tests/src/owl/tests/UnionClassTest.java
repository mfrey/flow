/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OwlFactory;
import owl.UnionClass;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Union Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnionClassTest extends OWLClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnionClassTest.class);
	}

	/**
	 * Constructs a new Union Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Union Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnionClass getFixture() {
		return (UnionClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createUnionClass());
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

} //UnionClassTest
