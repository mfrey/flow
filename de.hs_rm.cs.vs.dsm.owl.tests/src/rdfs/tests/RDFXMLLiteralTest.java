/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.tests;

import junit.textui.TestRunner;

import rdfs.RDFXMLLiteral;
import rdfs.RdfsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RDFXML Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFXMLLiteralTest extends TypedLiteralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RDFXMLLiteralTest.class);
	}

	/**
	 * Constructs a new RDFXML Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFXMLLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RDFXML Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RDFXMLLiteral getFixture() {
		return (RDFXMLLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RdfsFactory.eINSTANCE.createRDFXMLLiteral());
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

} //RDFXMLLiteralTest
