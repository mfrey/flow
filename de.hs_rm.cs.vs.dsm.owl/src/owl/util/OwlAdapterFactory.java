/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import owl.*;

import rdfs.Ontology;
import rdfs.RDFProperty;
import rdfs.RDFSClass;
import rdfs.RDFSResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see owl.OwlPackage
 * @generated
 */
public class OwlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OwlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlSwitch<Adapter> modelSwitch =
		new OwlSwitch<Adapter>() {
			@Override
			public Adapter caseOWLOntology(OWLOntology object) {
				return createOWLOntologyAdapter();
			}
			@Override
			public Adapter caseOWLOntologyProperty(OWLOntologyProperty object) {
				return createOWLOntologyPropertyAdapter();
			}
			@Override
			public Adapter caseOWLClass(OWLClass object) {
				return createOWLClassAdapter();
			}
			@Override
			public Adapter caseOWLRestriction(OWLRestriction object) {
				return createOWLRestrictionAdapter();
			}
			@Override
			public Adapter caseOWLObjectProperty(OWLObjectProperty object) {
				return createOWLObjectPropertyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseOWLAllDifferent(OWLAllDifferent object) {
				return createOWLAllDifferentAdapter();
			}
			@Override
			public Adapter caseOWLDataRange(OWLDataRange object) {
				return createOWLDataRangeAdapter();
			}
			@Override
			public Adapter caseOWLAnnotationProperty(OWLAnnotationProperty object) {
				return createOWLAnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseDatatypeSlot(DatatypeSlot object) {
				return createDatatypeSlotAdapter();
			}
			@Override
			public Adapter caseObjectSlot(ObjectSlot object) {
				return createObjectSlotAdapter();
			}
			@Override
			public Adapter caseEnumeratedClass(EnumeratedClass object) {
				return createEnumeratedClassAdapter();
			}
			@Override
			public Adapter caseIntersectionClass(IntersectionClass object) {
				return createIntersectionClassAdapter();
			}
			@Override
			public Adapter caseUnionClass(UnionClass object) {
				return createUnionClassAdapter();
			}
			@Override
			public Adapter caseHasValueRestriction(HasValueRestriction object) {
				return createHasValueRestrictionAdapter();
			}
			@Override
			public Adapter caseAllValuesFromRestriction(AllValuesFromRestriction object) {
				return createAllValuesFromRestrictionAdapter();
			}
			@Override
			public Adapter caseSomeValuesFromRestriction(SomeValuesFromRestriction object) {
				return createSomeValuesFromRestrictionAdapter();
			}
			@Override
			public Adapter caseCardinalityRestriction(CardinalityRestriction object) {
				return createCardinalityRestrictionAdapter();
			}
			@Override
			public Adapter caseMaxCardinalityRestriction(MaxCardinalityRestriction object) {
				return createMaxCardinalityRestrictionAdapter();
			}
			@Override
			public Adapter caseMinCardinalityRestriction(MinCardinalityRestriction object) {
				return createMinCardinalityRestrictionAdapter();
			}
			@Override
			public Adapter caseComplementClass(ComplementClass object) {
				return createComplementClassAdapter();
			}
			@Override
			public Adapter caseOWLDatatypeProperty(OWLDatatypeProperty object) {
				return createOWLDatatypePropertyAdapter();
			}
			@Override
			public Adapter caseRDFSResource(RDFSResource object) {
				return createRDFSResourceAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseRDFProperty(RDFProperty object) {
				return createRDFPropertyAdapter();
			}
			@Override
			public Adapter caseRDFSClass(RDFSClass object) {
				return createRDFSClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLOntology <em>OWL Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLOntology
	 * @generated
	 */
	public Adapter createOWLOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLOntologyProperty <em>OWL Ontology Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLOntologyProperty
	 * @generated
	 */
	public Adapter createOWLOntologyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLClass <em>OWL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLClass
	 * @generated
	 */
	public Adapter createOWLClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLRestriction <em>OWL Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLRestriction
	 * @generated
	 */
	public Adapter createOWLRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLObjectProperty <em>OWL Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLObjectProperty
	 * @generated
	 */
	public Adapter createOWLObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLAllDifferent <em>OWL All Different</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLAllDifferent
	 * @generated
	 */
	public Adapter createOWLAllDifferentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLDataRange <em>OWL Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLDataRange
	 * @generated
	 */
	public Adapter createOWLDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLAnnotationProperty <em>OWL Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLAnnotationProperty
	 * @generated
	 */
	public Adapter createOWLAnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.DatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.DatatypeSlot
	 * @generated
	 */
	public Adapter createDatatypeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ObjectSlot <em>Object Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ObjectSlot
	 * @generated
	 */
	public Adapter createObjectSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.EnumeratedClass <em>Enumerated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.EnumeratedClass
	 * @generated
	 */
	public Adapter createEnumeratedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.IntersectionClass <em>Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.IntersectionClass
	 * @generated
	 */
	public Adapter createIntersectionClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.UnionClass <em>Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.UnionClass
	 * @generated
	 */
	public Adapter createUnionClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.HasValueRestriction <em>Has Value Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.HasValueRestriction
	 * @generated
	 */
	public Adapter createHasValueRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.AllValuesFromRestriction <em>All Values From Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.AllValuesFromRestriction
	 * @generated
	 */
	public Adapter createAllValuesFromRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.SomeValuesFromRestriction <em>Some Values From Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.SomeValuesFromRestriction
	 * @generated
	 */
	public Adapter createSomeValuesFromRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.CardinalityRestriction <em>Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.CardinalityRestriction
	 * @generated
	 */
	public Adapter createCardinalityRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.MaxCardinalityRestriction <em>Max Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.MaxCardinalityRestriction
	 * @generated
	 */
	public Adapter createMaxCardinalityRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.MinCardinalityRestriction <em>Min Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.MinCardinalityRestriction
	 * @generated
	 */
	public Adapter createMinCardinalityRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.ComplementClass <em>Complement Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.ComplementClass
	 * @generated
	 */
	public Adapter createComplementClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owl.OWLDatatypeProperty <em>OWL Datatype Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owl.OWLDatatypeProperty
	 * @generated
	 */
	public Adapter createOWLDatatypePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSResource <em>RDFS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSResource
	 * @generated
	 */
	public Adapter createRDFSResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFProperty
	 * @generated
	 */
	public Adapter createRDFPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSClass <em>RDFS Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSClass
	 * @generated
	 */
	public Adapter createRDFSClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OwlAdapterFactory
