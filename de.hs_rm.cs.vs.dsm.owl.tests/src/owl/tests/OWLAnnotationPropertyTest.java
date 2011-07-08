/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.textui.TestRunner;

import owl.OWLAnnotationProperty;
import owl.OwlFactory;

import rdfs.tests.RDFPropertyTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OWL Annotation Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLAnnotationPropertyTest extends RDFPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OWLAnnotationPropertyTest.class);
	}

	/**
	 * Constructs a new OWL Annotation Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLAnnotationPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OWL Annotation Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OWLAnnotationProperty getFixture() {
		return (OWLAnnotationProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OwlFactory.eINSTANCE.createOWLAnnotationProperty());
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

} //OWLAnnotationPropertyTest
