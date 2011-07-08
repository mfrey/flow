/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>owl</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlTests extends TestSuite {

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
		TestSuite suite = new OwlTests("owl Tests");
		suite.addTestSuite(OWLOntologyTest.class);
		suite.addTestSuite(OWLOntologyPropertyTest.class);
		suite.addTestSuite(OWLClassTest.class);
		suite.addTestSuite(OWLObjectPropertyTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(IndividualTest.class);
		suite.addTestSuite(OWLAllDifferentTest.class);
		suite.addTestSuite(OWLDataRangeTest.class);
		suite.addTestSuite(OWLAnnotationPropertyTest.class);
		suite.addTestSuite(EnumeratedClassTest.class);
		suite.addTestSuite(IntersectionClassTest.class);
		suite.addTestSuite(UnionClassTest.class);
		suite.addTestSuite(HasValueRestrictionTest.class);
		suite.addTestSuite(AllValuesFromRestrictionTest.class);
		suite.addTestSuite(SomeValuesFromRestrictionTest.class);
		suite.addTestSuite(CardinalityRestrictionTest.class);
		suite.addTestSuite(MaxCardinalityRestrictionTest.class);
		suite.addTestSuite(MinCardinalityRestrictionTest.class);
		suite.addTestSuite(ComplementClassTest.class);
		suite.addTestSuite(OWLDatatypePropertyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlTests(String name) {
		super(name);
	}

} //OwlTests
