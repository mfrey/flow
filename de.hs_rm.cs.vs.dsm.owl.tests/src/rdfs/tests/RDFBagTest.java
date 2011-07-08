/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.textui.TestRunner;

import rdfs.RDFBag;
import rdfs.RdfsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RDF Bag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFBagTest extends RDFSContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RDFBagTest.class);
	}

	/**
	 * Constructs a new RDF Bag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFBagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RDF Bag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RDFBag getFixture() {
		return (RDFBag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RdfsFactory.eINSTANCE.createRDFBag());
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

} //RDFBagTest
