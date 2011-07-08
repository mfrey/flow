/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.textui.TestRunner;

import rdfs.RDFSClass;
import rdfs.RdfsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RDFS Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFSClassTest extends RDFSResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RDFSClassTest.class);
	}

	/**
	 * Constructs a new RDFS Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RDFS Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RDFSClass getFixture() {
		return (RDFSClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RdfsFactory.eINSTANCE.createRDFSClass());
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

} //RDFSClassTest
