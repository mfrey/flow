/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import rdfs.Namespace;
import rdfs.RdfsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceTest extends TestCase {

	/**
	 * The fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Namespace fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamespaceTest.class);
	}

	/**
	 * Constructs a new Namespace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Namespace fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Namespace getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RdfsFactory.eINSTANCE.createNamespace());
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

} //NamespaceTest
