/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLOntology;
import owl.OwlFactory;

import rdfs.tests.OntologyTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Ontology</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLOntologyTest extends OntologyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLOntologyTest.class);
	}

	/**
	 * Constructs a new OWL Ontology test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntologyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Ontology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLOntology getFixture() {
		return (OWLOntology)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLOntology());
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

} //OWLOntologyTest
