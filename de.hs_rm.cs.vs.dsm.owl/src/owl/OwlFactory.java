/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see owl.OwlPackage
 * @generated
 */
public interface OwlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlFactory eINSTANCE = owl.impl.OwlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OWL Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Ontology</em>'.
	 * @generated
	 */
	OWLOntology createOWLOntology();

	/**
	 * Returns a new object of class '<em>OWL Ontology Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Ontology Property</em>'.
	 * @generated
	 */
	OWLOntologyProperty createOWLOntologyProperty();

	/**
	 * Returns a new object of class '<em>OWL Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Class</em>'.
	 * @generated
	 */
	OWLClass createOWLClass();

	/**
	 * Returns a new object of class '<em>OWL Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Object Property</em>'.
	 * @generated
	 */
	OWLObjectProperty createOWLObjectProperty();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual</em>'.
	 * @generated
	 */
	Individual createIndividual();

	/**
	 * Returns a new object of class '<em>OWL All Different</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL All Different</em>'.
	 * @generated
	 */
	OWLAllDifferent createOWLAllDifferent();

	/**
	 * Returns a new object of class '<em>OWL Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Data Range</em>'.
	 * @generated
	 */
	OWLDataRange createOWLDataRange();

	/**
	 * Returns a new object of class '<em>OWL Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Annotation Property</em>'.
	 * @generated
	 */
	OWLAnnotationProperty createOWLAnnotationProperty();

	/**
	 * Returns a new object of class '<em>Datatype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Slot</em>'.
	 * @generated
	 */
	DatatypeSlot createDatatypeSlot();

	/**
	 * Returns a new object of class '<em>Object Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Slot</em>'.
	 * @generated
	 */
	ObjectSlot createObjectSlot();

	/**
	 * Returns a new object of class '<em>Enumerated Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Class</em>'.
	 * @generated
	 */
	EnumeratedClass createEnumeratedClass();

	/**
	 * Returns a new object of class '<em>Intersection Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection Class</em>'.
	 * @generated
	 */
	IntersectionClass createIntersectionClass();

	/**
	 * Returns a new object of class '<em>Union Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Class</em>'.
	 * @generated
	 */
	UnionClass createUnionClass();

	/**
	 * Returns a new object of class '<em>Has Value Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Value Restriction</em>'.
	 * @generated
	 */
	HasValueRestriction createHasValueRestriction();

	/**
	 * Returns a new object of class '<em>All Values From Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Values From Restriction</em>'.
	 * @generated
	 */
	AllValuesFromRestriction createAllValuesFromRestriction();

	/**
	 * Returns a new object of class '<em>Some Values From Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Values From Restriction</em>'.
	 * @generated
	 */
	SomeValuesFromRestriction createSomeValuesFromRestriction();

	/**
	 * Returns a new object of class '<em>Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality Restriction</em>'.
	 * @generated
	 */
	CardinalityRestriction createCardinalityRestriction();

	/**
	 * Returns a new object of class '<em>Max Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Cardinality Restriction</em>'.
	 * @generated
	 */
	MaxCardinalityRestriction createMaxCardinalityRestriction();

	/**
	 * Returns a new object of class '<em>Min Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Cardinality Restriction</em>'.
	 * @generated
	 */
	MinCardinalityRestriction createMinCardinalityRestriction();

	/**
	 * Returns a new object of class '<em>Complement Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complement Class</em>'.
	 * @generated
	 */
	ComplementClass createComplementClass();

	/**
	 * Returns a new object of class '<em>OWL Datatype Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OWL Datatype Property</em>'.
	 * @generated
	 */
	OWLDatatypeProperty createOWLDatatypeProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OwlPackage getOwlPackage();

} //OwlFactory
