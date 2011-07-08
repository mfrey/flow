/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import owl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlFactoryImpl extends EFactoryImpl implements OwlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwlFactory init() {
		try {
			OwlFactory theOwlFactory = (OwlFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/owl.ecore"); 
			if (theOwlFactory != null) {
				return theOwlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OwlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlPackage.OWL_ONTOLOGY: return createOWLOntology();
			case OwlPackage.OWL_ONTOLOGY_PROPERTY: return createOWLOntologyProperty();
			case OwlPackage.OWL_CLASS: return createOWLClass();
			case OwlPackage.OWL_OBJECT_PROPERTY: return createOWLObjectProperty();
			case OwlPackage.PROPERTY: return createProperty();
			case OwlPackage.INDIVIDUAL: return createIndividual();
			case OwlPackage.OWL_ALL_DIFFERENT: return createOWLAllDifferent();
			case OwlPackage.OWL_DATA_RANGE: return createOWLDataRange();
			case OwlPackage.OWL_ANNOTATION_PROPERTY: return createOWLAnnotationProperty();
			case OwlPackage.DATATYPE_SLOT: return createDatatypeSlot();
			case OwlPackage.OBJECT_SLOT: return createObjectSlot();
			case OwlPackage.ENUMERATED_CLASS: return createEnumeratedClass();
			case OwlPackage.INTERSECTION_CLASS: return createIntersectionClass();
			case OwlPackage.UNION_CLASS: return createUnionClass();
			case OwlPackage.HAS_VALUE_RESTRICTION: return createHasValueRestriction();
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION: return createAllValuesFromRestriction();
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION: return createSomeValuesFromRestriction();
			case OwlPackage.CARDINALITY_RESTRICTION: return createCardinalityRestriction();
			case OwlPackage.MAX_CARDINALITY_RESTRICTION: return createMaxCardinalityRestriction();
			case OwlPackage.MIN_CARDINALITY_RESTRICTION: return createMinCardinalityRestriction();
			case OwlPackage.COMPLEMENT_CLASS: return createComplementClass();
			case OwlPackage.OWL_DATATYPE_PROPERTY: return createOWLDatatypeProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntology createOWLOntology() {
		OWLOntologyImpl owlOntology = new OWLOntologyImpl();
		return owlOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntologyProperty createOWLOntologyProperty() {
		OWLOntologyPropertyImpl owlOntologyProperty = new OWLOntologyPropertyImpl();
		return owlOntologyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLClass createOWLClass() {
		OWLClassImpl owlClass = new OWLClassImpl();
		return owlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLObjectProperty createOWLObjectProperty() {
		OWLObjectPropertyImpl owlObjectProperty = new OWLObjectPropertyImpl();
		return owlObjectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLAllDifferent createOWLAllDifferent() {
		OWLAllDifferentImpl owlAllDifferent = new OWLAllDifferentImpl();
		return owlAllDifferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDataRange createOWLDataRange() {
		OWLDataRangeImpl owlDataRange = new OWLDataRangeImpl();
		return owlDataRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLAnnotationProperty createOWLAnnotationProperty() {
		OWLAnnotationPropertyImpl owlAnnotationProperty = new OWLAnnotationPropertyImpl();
		return owlAnnotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeSlot createDatatypeSlot() {
		DatatypeSlotImpl datatypeSlot = new DatatypeSlotImpl();
		return datatypeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSlot createObjectSlot() {
		ObjectSlotImpl objectSlot = new ObjectSlotImpl();
		return objectSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedClass createEnumeratedClass() {
		EnumeratedClassImpl enumeratedClass = new EnumeratedClassImpl();
		return enumeratedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionClass createIntersectionClass() {
		IntersectionClassImpl intersectionClass = new IntersectionClassImpl();
		return intersectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionClass createUnionClass() {
		UnionClassImpl unionClass = new UnionClassImpl();
		return unionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasValueRestriction createHasValueRestriction() {
		HasValueRestrictionImpl hasValueRestriction = new HasValueRestrictionImpl();
		return hasValueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllValuesFromRestriction createAllValuesFromRestriction() {
		AllValuesFromRestrictionImpl allValuesFromRestriction = new AllValuesFromRestrictionImpl();
		return allValuesFromRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeValuesFromRestriction createSomeValuesFromRestriction() {
		SomeValuesFromRestrictionImpl someValuesFromRestriction = new SomeValuesFromRestrictionImpl();
		return someValuesFromRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityRestriction createCardinalityRestriction() {
		CardinalityRestrictionImpl cardinalityRestriction = new CardinalityRestrictionImpl();
		return cardinalityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxCardinalityRestriction createMaxCardinalityRestriction() {
		MaxCardinalityRestrictionImpl maxCardinalityRestriction = new MaxCardinalityRestrictionImpl();
		return maxCardinalityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinCardinalityRestriction createMinCardinalityRestriction() {
		MinCardinalityRestrictionImpl minCardinalityRestriction = new MinCardinalityRestrictionImpl();
		return minCardinalityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementClass createComplementClass() {
		ComplementClassImpl complementClass = new ComplementClassImpl();
		return complementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDatatypeProperty createOWLDatatypeProperty() {
		OWLDatatypePropertyImpl owlDatatypeProperty = new OWLDatatypePropertyImpl();
		return owlDatatypeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlPackage getOwlPackage() {
		return (OwlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OwlPackage getPackage() {
		return OwlPackage.eINSTANCE;
	}

} //OwlFactoryImpl
