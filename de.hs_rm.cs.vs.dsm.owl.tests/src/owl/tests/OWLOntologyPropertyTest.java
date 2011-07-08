/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLOntologyProperty;
import owl.OwlFactory;

import rdfs.tests.RDFPropertyTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Ontology Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLOntologyPropertyTest extends RDFPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLOntologyPropertyTest.class);
	}

	/**
	 * Constructs a new OWL Ontology Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntologyPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Ontology Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLOntologyProperty getFixture() {
		return (OWLOntologyProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLOntologyProperty());
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

} //OWLOntologyPropertyTest
