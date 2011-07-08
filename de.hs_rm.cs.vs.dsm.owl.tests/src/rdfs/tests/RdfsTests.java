/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>rdfs</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RdfsTests("rdfs Tests");
		suite.addTestSuite(RDFSResourceTest.class);
		suite.addTestSuite(RDFSClassTest.class);
		suite.addTestSuite(RDFSLiteralTest.class);
		suite.addTestSuite(RDFSDatatypeTest.class);
		suite.addTestSuite(RDFXMLLiteralTest.class);
		suite.addTestSuite(RDFPropertyTest.class);
		suite.addTestSuite(RDFListTest.class);
		suite.addTestSuite(RDFSContainerTest.class);
		suite.addTestSuite(RDFAltTest.class);
		suite.addTestSuite(RDFBagTest.class);
		suite.addTestSuite(RDFSeqTest.class);
		suite.addTestSuite(RDFSContainerMembershipPropertyTest.class);
		suite.addTestSuite(RDFStatementTest.class);
		suite.addTestSuite(OntologyTest.class);
		suite.addTestSuite(PlainLiteralTest.class);
		suite.addTestSuite(TypedLiteralTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsTests(String name) {
		super(name);
	}

} //RdfsTests
