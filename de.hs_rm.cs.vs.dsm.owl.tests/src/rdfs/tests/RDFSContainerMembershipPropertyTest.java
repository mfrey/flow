/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.textui.TestRunner;

import rdfs.RDFSContainerMembershipProperty;
import rdfs.RdfsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RDFS Container Membership Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFSContainerMembershipPropertyTest extends RDFPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RDFSContainerMembershipPropertyTest.class);
	}

	/**
	 * Constructs a new RDFS Container Membership Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSContainerMembershipPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RDFS Container Membership Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RDFSContainerMembershipProperty getFixture() {
		return (RDFSContainerMembershipProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RdfsFactory.eINSTANCE.createRDFSContainerMembershipProperty());
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

} //RDFSContainerMembershipPropertyTest
