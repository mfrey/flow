/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import owl.*;

import rdfs.Ontology;
import rdfs.RDFProperty;
import rdfs.RDFSClass;
import rdfs.RDFSResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see owl.OwlPackage
 * @generated
 */
public class OwlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlSwitch() {
		if (modelPackage == null) {
			modelPackage = OwlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OwlPackage.OWL_ONTOLOGY: {
				OWLOntology owlOntology = (OWLOntology)theEObject;
				T result = caseOWLOntology(owlOntology);
				if (result == null) result = caseOntology(owlOntology);
				if (result == null) result = caseRDFSResource(owlOntology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_ONTOLOGY_PROPERTY: {
				OWLOntologyProperty owlOntologyProperty = (OWLOntologyProperty)theEObject;
				T result = caseOWLOntologyProperty(owlOntologyProperty);
				if (result == null) result = caseRDFProperty(owlOntologyProperty);
				if (result == null) result = caseRDFSResource(owlOntologyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_CLASS: {
				OWLClass owlClass = (OWLClass)theEObject;
				T result = caseOWLClass(owlClass);
				if (result == null) result = caseRDFSClass(owlClass);
				if (result == null) result = caseRDFSResource(owlClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_RESTRICTION: {
				OWLRestriction owlRestriction = (OWLRestriction)theEObject;
				T result = caseOWLRestriction(owlRestriction);
				if (result == null) result = caseOWLClass(owlRestriction);
				if (result == null) result = caseRDFSClass(owlRestriction);
				if (result == null) result = caseRDFSResource(owlRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_OBJECT_PROPERTY: {
				OWLObjectProperty owlObjectProperty = (OWLObjectProperty)theEObject;
				T result = caseOWLObjectProperty(owlObjectProperty);
				if (result == null) result = caseProperty(owlObjectProperty);
				if (result == null) result = caseRDFProperty(owlObjectProperty);
				if (result == null) result = caseRDFSResource(owlObjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseRDFProperty(property);
				if (result == null) result = caseRDFSResource(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseRDFSResource(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_ALL_DIFFERENT: {
				OWLAllDifferent owlAllDifferent = (OWLAllDifferent)theEObject;
				T result = caseOWLAllDifferent(owlAllDifferent);
				if (result == null) result = caseRDFSResource(owlAllDifferent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_DATA_RANGE: {
				OWLDataRange owlDataRange = (OWLDataRange)theEObject;
				T result = caseOWLDataRange(owlDataRange);
				if (result == null) result = caseRDFSClass(owlDataRange);
				if (result == null) result = caseRDFSResource(owlDataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_ANNOTATION_PROPERTY: {
				OWLAnnotationProperty owlAnnotationProperty = (OWLAnnotationProperty)theEObject;
				T result = caseOWLAnnotationProperty(owlAnnotationProperty);
				if (result == null) result = caseRDFProperty(owlAnnotationProperty);
				if (result == null) result = caseRDFSResource(owlAnnotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.DATATYPE_SLOT: {
				DatatypeSlot datatypeSlot = (DatatypeSlot)theEObject;
				T result = caseDatatypeSlot(datatypeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OBJECT_SLOT: {
				ObjectSlot objectSlot = (ObjectSlot)theEObject;
				T result = caseObjectSlot(objectSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ENUMERATED_CLASS: {
				EnumeratedClass enumeratedClass = (EnumeratedClass)theEObject;
				T result = caseEnumeratedClass(enumeratedClass);
				if (result == null) result = caseOWLClass(enumeratedClass);
				if (result == null) result = caseRDFSClass(enumeratedClass);
				if (result == null) result = caseRDFSResource(enumeratedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.INTERSECTION_CLASS: {
				IntersectionClass intersectionClass = (IntersectionClass)theEObject;
				T result = caseIntersectionClass(intersectionClass);
				if (result == null) result = caseOWLClass(intersectionClass);
				if (result == null) result = caseRDFSClass(intersectionClass);
				if (result == null) result = caseRDFSResource(intersectionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.UNION_CLASS: {
				UnionClass unionClass = (UnionClass)theEObject;
				T result = caseUnionClass(unionClass);
				if (result == null) result = caseOWLClass(unionClass);
				if (result == null) result = caseRDFSClass(unionClass);
				if (result == null) result = caseRDFSResource(unionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.HAS_VALUE_RESTRICTION: {
				HasValueRestriction hasValueRestriction = (HasValueRestriction)theEObject;
				T result = caseHasValueRestriction(hasValueRestriction);
				if (result == null) result = caseOWLRestriction(hasValueRestriction);
				if (result == null) result = caseOWLClass(hasValueRestriction);
				if (result == null) result = caseRDFSClass(hasValueRestriction);
				if (result == null) result = caseRDFSResource(hasValueRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION: {
				AllValuesFromRestriction allValuesFromRestriction = (AllValuesFromRestriction)theEObject;
				T result = caseAllValuesFromRestriction(allValuesFromRestriction);
				if (result == null) result = caseOWLRestriction(allValuesFromRestriction);
				if (result == null) result = caseOWLClass(allValuesFromRestriction);
				if (result == null) result = caseRDFSClass(allValuesFromRestriction);
				if (result == null) result = caseRDFSResource(allValuesFromRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION: {
				SomeValuesFromRestriction someValuesFromRestriction = (SomeValuesFromRestriction)theEObject;
				T result = caseSomeValuesFromRestriction(someValuesFromRestriction);
				if (result == null) result = caseOWLRestriction(someValuesFromRestriction);
				if (result == null) result = caseOWLClass(someValuesFromRestriction);
				if (result == null) result = caseRDFSClass(someValuesFromRestriction);
				if (result == null) result = caseRDFSResource(someValuesFromRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.CARDINALITY_RESTRICTION: {
				CardinalityRestriction cardinalityRestriction = (CardinalityRestriction)theEObject;
				T result = caseCardinalityRestriction(cardinalityRestriction);
				if (result == null) result = caseOWLRestriction(cardinalityRestriction);
				if (result == null) result = caseOWLClass(cardinalityRestriction);
				if (result == null) result = caseRDFSClass(cardinalityRestriction);
				if (result == null) result = caseRDFSResource(cardinalityRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.MAX_CARDINALITY_RESTRICTION: {
				MaxCardinalityRestriction maxCardinalityRestriction = (MaxCardinalityRestriction)theEObject;
				T result = caseMaxCardinalityRestriction(maxCardinalityRestriction);
				if (result == null) result = caseOWLRestriction(maxCardinalityRestriction);
				if (result == null) result = caseOWLClass(maxCardinalityRestriction);
				if (result == null) result = caseRDFSClass(maxCardinalityRestriction);
				if (result == null) result = caseRDFSResource(maxCardinalityRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.MIN_CARDINALITY_RESTRICTION: {
				MinCardinalityRestriction minCardinalityRestriction = (MinCardinalityRestriction)theEObject;
				T result = caseMinCardinalityRestriction(minCardinalityRestriction);
				if (result == null) result = caseOWLRestriction(minCardinalityRestriction);
				if (result == null) result = caseOWLClass(minCardinalityRestriction);
				if (result == null) result = caseRDFSClass(minCardinalityRestriction);
				if (result == null) result = caseRDFSResource(minCardinalityRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.COMPLEMENT_CLASS: {
				ComplementClass complementClass = (ComplementClass)theEObject;
				T result = caseComplementClass(complementClass);
				if (result == null) result = caseOWLClass(complementClass);
				if (result == null) result = caseRDFSClass(complementClass);
				if (result == null) result = caseRDFSResource(complementClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlPackage.OWL_DATATYPE_PROPERTY: {
				OWLDatatypeProperty owlDatatypeProperty = (OWLDatatypeProperty)theEObject;
				T result = caseOWLDatatypeProperty(owlDatatypeProperty);
				if (result == null) result = caseProperty(owlDatatypeProperty);
				if (result == null) result = caseRDFProperty(owlDatatypeProperty);
				if (result == null) result = caseRDFSResource(owlDatatypeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLOntology(OWLOntology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Ontology Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Ontology Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLOntologyProperty(OWLOntologyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLClass(OWLClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLRestriction(OWLRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLObjectProperty(OWLObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL All Different</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL All Different</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLAllDifferent(OWLAllDifferent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLDataRange(OWLDataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLAnnotationProperty(OWLAnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeSlot(DatatypeSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSlot(ObjectSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedClass(EnumeratedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersectionClass(IntersectionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionClass(UnionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Value Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Value Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasValueRestriction(HasValueRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Values From Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Values From Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllValuesFromRestriction(AllValuesFromRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Values From Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Values From Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeValuesFromRestriction(SomeValuesFromRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRestriction(CardinalityRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Cardinality Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxCardinalityRestriction(MaxCardinalityRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Cardinality Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Cardinality Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinCardinalityRestriction(MinCardinalityRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complement Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complement Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplementClass(ComplementClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OWL Datatype Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OWL Datatype Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOWLDatatypeProperty(OWLDatatypeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSResource(RDFSResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFProperty(RDFProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSClass(RDFSClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OwlSwitch
