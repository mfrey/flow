/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owl.AllValuesFromRestriction;
import owl.CardinalityRestriction;
import owl.ComplementClass;
import owl.DatatypeSlot;
import owl.EnumeratedClass;
import owl.HasValueRestriction;
import owl.Individual;
import owl.IntersectionClass;
import owl.MaxCardinalityRestriction;
import owl.MinCardinalityRestriction;
import owl.OWLAllDifferent;
import owl.OWLAnnotationProperty;
import owl.OWLClass;
import owl.OWLDataRange;
import owl.OWLDatatypeProperty;
import owl.OWLObjectProperty;
import owl.OWLOntology;
import owl.OWLOntologyProperty;
import owl.OWLRestriction;
import owl.ObjectSlot;
import owl.OwlFactory;
import owl.OwlPackage;
import owl.Property;
import owl.SomeValuesFromRestriction;
import owl.UnionClass;

import rdfs.RdfsPackage;

import rdfs.impl.RdfsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlPackageImpl extends EPackageImpl implements OwlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlOntologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlOntologyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlObjectPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlAllDifferentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlDataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlAnnotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasValueRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allValuesFromRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someValuesFromRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxCardinalityRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minCardinalityRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass owlDatatypePropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see owl.OwlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwlPackageImpl() {
		super(eNS_URI, OwlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OwlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwlPackage init() {
		if (isInited) return (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

		// Obtain or create and register package
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OwlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OwlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RdfsPackageImpl theRdfsPackage = (RdfsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI) instanceof RdfsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI) : RdfsPackage.eINSTANCE);

		// Create package meta-data objects
		theOwlPackage.createPackageContents();
		theRdfsPackage.createPackageContents();

		// Initialize created meta-data
		theOwlPackage.initializePackageContents();
		theRdfsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOwlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OwlPackage.eNS_URI, theOwlPackage);
		return theOwlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLOntology() {
		return owlOntologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLOntology_OWLBackwardCompatibleWith() {
		return (EReference)owlOntologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLOntology_OWLImports() {
		return (EReference)owlOntologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLOntology_OWLIncompatibleWith() {
		return (EReference)owlOntologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLOntology_OWLPriorVersion() {
		return (EReference)owlOntologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLOntology_OWLVersionInfo() {
		return (EReference)owlOntologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLOntologyProperty() {
		return owlOntologyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLClass() {
		return owlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWLClass_Deprecated() {
		return (EAttribute)owlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_InvOWLEquivalentClass() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_OWLEquivalentClass() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_OWLDisjointWith() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_InvOWLDisjointWith() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_RefByIntersectionClass() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_RefByUnionClass() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLClass_InvOWLComplementOf() {
		return (EReference)owlClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLRestriction() {
		return owlRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLRestriction_OWLOnProperty() {
		return (EReference)owlRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLObjectProperty() {
		return owlObjectPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWLObjectProperty_InverseFunctional() {
		return (EAttribute)owlObjectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWLObjectProperty_Symmetric() {
		return (EAttribute)owlObjectPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOWLObjectProperty_Transitive() {
		return (EAttribute)owlObjectPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLObjectProperty_OWLInverseOf() {
		return (EReference)owlObjectPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLObjectProperty_InvOWLInverseOf() {
		return (EReference)owlObjectPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Deprecated() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Functional() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OWLEquivalentProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_InvOWLEquivalentProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_OWLDifferentFrom() {
		return (EReference)individualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_InvOWLDifferentFrom() {
		return (EReference)individualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_RefByOWLDistinctMembers() {
		return (EReference)individualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_OWLSameAs() {
		return (EReference)individualEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_InvOWLSameAs() {
		return (EReference)individualEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_DatatypeSlot() {
		return (EReference)individualEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividual_ObjectSlot() {
		return (EReference)individualEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLAllDifferent() {
		return owlAllDifferentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLAllDifferent_OWLDistinctMembers() {
		return (EReference)owlAllDifferentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLDataRange() {
		return owlDataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOWLDataRange_OWLOneOf() {
		return (EReference)owlDataRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLAnnotationProperty() {
		return owlAnnotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeSlot() {
		return datatypeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeSlot_Individual() {
		return (EReference)datatypeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeSlot_Content() {
		return (EReference)datatypeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeSlot_Property() {
		return (EReference)datatypeSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSlot() {
		return objectSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSlot_Individual() {
		return (EReference)objectSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSlot_Content() {
		return (EReference)objectSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSlot_Property() {
		return (EReference)objectSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedClass() {
		return enumeratedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedClass_OWLOneOf() {
		return (EReference)enumeratedClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersectionClass() {
		return intersectionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntersectionClass_OWLIntersectionOf() {
		return (EReference)intersectionClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionClass() {
		return unionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionClass_OWLUnionOf() {
		return (EReference)unionClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasValueRestriction() {
		return hasValueRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasValueRestriction_OWLHasValue() {
		return (EReference)hasValueRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllValuesFromRestriction() {
		return allValuesFromRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllValuesFromRestriction_OWLAllValuesFrom() {
		return (EReference)allValuesFromRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeValuesFromRestriction() {
		return someValuesFromRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSomeValuesFromRestriction_OWLSomeValuesFrom() {
		return (EReference)someValuesFromRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityRestriction() {
		return cardinalityRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityRestriction_OWLCardinality() {
		return (EReference)cardinalityRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxCardinalityRestriction() {
		return maxCardinalityRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxCardinalityRestriction_OWLMaxCardinality() {
		return (EReference)maxCardinalityRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinCardinalityRestriction() {
		return minCardinalityRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinCardinalityRestriction_OWLMinCardinality() {
		return (EReference)minCardinalityRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementClass() {
		return complementClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementClass_OWLComplementOf() {
		return (EReference)complementClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOWLDatatypeProperty() {
		return owlDatatypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlFactory getOwlFactory() {
		return (OwlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		owlOntologyEClass = createEClass(OWL_ONTOLOGY);
		createEReference(owlOntologyEClass, OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH);
		createEReference(owlOntologyEClass, OWL_ONTOLOGY__OWL_IMPORTS);
		createEReference(owlOntologyEClass, OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH);
		createEReference(owlOntologyEClass, OWL_ONTOLOGY__OWL_PRIOR_VERSION);
		createEReference(owlOntologyEClass, OWL_ONTOLOGY__OWL_VERSION_INFO);

		owlOntologyPropertyEClass = createEClass(OWL_ONTOLOGY_PROPERTY);

		owlClassEClass = createEClass(OWL_CLASS);
		createEAttribute(owlClassEClass, OWL_CLASS__DEPRECATED);
		createEReference(owlClassEClass, OWL_CLASS__INV_OWL_EQUIVALENT_CLASS);
		createEReference(owlClassEClass, OWL_CLASS__OWL_EQUIVALENT_CLASS);
		createEReference(owlClassEClass, OWL_CLASS__OWL_DISJOINT_WITH);
		createEReference(owlClassEClass, OWL_CLASS__INV_OWL_DISJOINT_WITH);
		createEReference(owlClassEClass, OWL_CLASS__REF_BY_INTERSECTION_CLASS);
		createEReference(owlClassEClass, OWL_CLASS__REF_BY_UNION_CLASS);
		createEReference(owlClassEClass, OWL_CLASS__INV_OWL_COMPLEMENT_OF);

		owlRestrictionEClass = createEClass(OWL_RESTRICTION);
		createEReference(owlRestrictionEClass, OWL_RESTRICTION__OWL_ON_PROPERTY);

		owlObjectPropertyEClass = createEClass(OWL_OBJECT_PROPERTY);
		createEAttribute(owlObjectPropertyEClass, OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL);
		createEAttribute(owlObjectPropertyEClass, OWL_OBJECT_PROPERTY__SYMMETRIC);
		createEAttribute(owlObjectPropertyEClass, OWL_OBJECT_PROPERTY__TRANSITIVE);
		createEReference(owlObjectPropertyEClass, OWL_OBJECT_PROPERTY__OWL_INVERSE_OF);
		createEReference(owlObjectPropertyEClass, OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__DEPRECATED);
		createEAttribute(propertyEClass, PROPERTY__FUNCTIONAL);
		createEReference(propertyEClass, PROPERTY__OWL_EQUIVALENT_PROPERTY);
		createEReference(propertyEClass, PROPERTY__INV_OWL_EQUIVALENT_PROPERTY);

		individualEClass = createEClass(INDIVIDUAL);
		createEReference(individualEClass, INDIVIDUAL__OWL_DIFFERENT_FROM);
		createEReference(individualEClass, INDIVIDUAL__INV_OWL_DIFFERENT_FROM);
		createEReference(individualEClass, INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS);
		createEReference(individualEClass, INDIVIDUAL__OWL_SAME_AS);
		createEReference(individualEClass, INDIVIDUAL__INV_OWL_SAME_AS);
		createEReference(individualEClass, INDIVIDUAL__DATATYPE_SLOT);
		createEReference(individualEClass, INDIVIDUAL__OBJECT_SLOT);

		owlAllDifferentEClass = createEClass(OWL_ALL_DIFFERENT);
		createEReference(owlAllDifferentEClass, OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS);

		owlDataRangeEClass = createEClass(OWL_DATA_RANGE);
		createEReference(owlDataRangeEClass, OWL_DATA_RANGE__OWL_ONE_OF);

		owlAnnotationPropertyEClass = createEClass(OWL_ANNOTATION_PROPERTY);

		datatypeSlotEClass = createEClass(DATATYPE_SLOT);
		createEReference(datatypeSlotEClass, DATATYPE_SLOT__INDIVIDUAL);
		createEReference(datatypeSlotEClass, DATATYPE_SLOT__CONTENT);
		createEReference(datatypeSlotEClass, DATATYPE_SLOT__PROPERTY);

		objectSlotEClass = createEClass(OBJECT_SLOT);
		createEReference(objectSlotEClass, OBJECT_SLOT__INDIVIDUAL);
		createEReference(objectSlotEClass, OBJECT_SLOT__CONTENT);
		createEReference(objectSlotEClass, OBJECT_SLOT__PROPERTY);

		enumeratedClassEClass = createEClass(ENUMERATED_CLASS);
		createEReference(enumeratedClassEClass, ENUMERATED_CLASS__OWL_ONE_OF);

		intersectionClassEClass = createEClass(INTERSECTION_CLASS);
		createEReference(intersectionClassEClass, INTERSECTION_CLASS__OWL_INTERSECTION_OF);

		unionClassEClass = createEClass(UNION_CLASS);
		createEReference(unionClassEClass, UNION_CLASS__OWL_UNION_OF);

		hasValueRestrictionEClass = createEClass(HAS_VALUE_RESTRICTION);
		createEReference(hasValueRestrictionEClass, HAS_VALUE_RESTRICTION__OWL_HAS_VALUE);

		allValuesFromRestrictionEClass = createEClass(ALL_VALUES_FROM_RESTRICTION);
		createEReference(allValuesFromRestrictionEClass, ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM);

		someValuesFromRestrictionEClass = createEClass(SOME_VALUES_FROM_RESTRICTION);
		createEReference(someValuesFromRestrictionEClass, SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM);

		cardinalityRestrictionEClass = createEClass(CARDINALITY_RESTRICTION);
		createEReference(cardinalityRestrictionEClass, CARDINALITY_RESTRICTION__OWL_CARDINALITY);

		maxCardinalityRestrictionEClass = createEClass(MAX_CARDINALITY_RESTRICTION);
		createEReference(maxCardinalityRestrictionEClass, MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY);

		minCardinalityRestrictionEClass = createEClass(MIN_CARDINALITY_RESTRICTION);
		createEReference(minCardinalityRestrictionEClass, MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY);

		complementClassEClass = createEClass(COMPLEMENT_CLASS);
		createEReference(complementClassEClass, COMPLEMENT_CLASS__OWL_COMPLEMENT_OF);

		owlDatatypePropertyEClass = createEClass(OWL_DATATYPE_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RdfsPackage theRdfsPackage = (RdfsPackage)EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		owlOntologyEClass.getESuperTypes().add(theRdfsPackage.getOntology());
		owlOntologyPropertyEClass.getESuperTypes().add(theRdfsPackage.getRDFProperty());
		owlClassEClass.getESuperTypes().add(theRdfsPackage.getRDFSClass());
		owlRestrictionEClass.getESuperTypes().add(this.getOWLClass());
		owlObjectPropertyEClass.getESuperTypes().add(this.getProperty());
		propertyEClass.getESuperTypes().add(theRdfsPackage.getRDFProperty());
		individualEClass.getESuperTypes().add(theRdfsPackage.getRDFSResource());
		owlAllDifferentEClass.getESuperTypes().add(theRdfsPackage.getRDFSResource());
		owlDataRangeEClass.getESuperTypes().add(theRdfsPackage.getRDFSClass());
		owlAnnotationPropertyEClass.getESuperTypes().add(theRdfsPackage.getRDFProperty());
		enumeratedClassEClass.getESuperTypes().add(this.getOWLClass());
		intersectionClassEClass.getESuperTypes().add(this.getOWLClass());
		unionClassEClass.getESuperTypes().add(this.getOWLClass());
		hasValueRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		allValuesFromRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		someValuesFromRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		cardinalityRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		maxCardinalityRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		minCardinalityRestrictionEClass.getESuperTypes().add(this.getOWLRestriction());
		complementClassEClass.getESuperTypes().add(this.getOWLClass());
		owlDatatypePropertyEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(owlOntologyEClass, OWLOntology.class, "OWLOntology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOWLOntology_OWLBackwardCompatibleWith(), this.getOWLOntology(), null, "OWLBackwardCompatibleWith", null, 0, -1, OWLOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLOntology_OWLImports(), this.getOWLOntology(), null, "OWLImports", null, 0, -1, OWLOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLOntology_OWLIncompatibleWith(), this.getOWLOntology(), null, "OWLIncompatibleWith", null, 0, -1, OWLOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLOntology_OWLPriorVersion(), this.getOWLOntology(), null, "OWLPriorVersion", null, 0, -1, OWLOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLOntology_OWLVersionInfo(), theRdfsPackage.getRDFSLiteral(), null, "OWLVersionInfo", null, 0, -1, OWLOntology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlOntologyPropertyEClass, OWLOntologyProperty.class, "OWLOntologyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(owlClassEClass, OWLClass.class, "OWLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWLClass_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_InvOWLEquivalentClass(), this.getOWLClass(), this.getOWLClass_OWLEquivalentClass(), "invOWLEquivalentClass", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_OWLEquivalentClass(), this.getOWLClass(), this.getOWLClass_InvOWLEquivalentClass(), "OWLEquivalentClass", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_OWLDisjointWith(), this.getOWLClass(), this.getOWLClass_InvOWLDisjointWith(), "OWLDisjointWith", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_InvOWLDisjointWith(), this.getOWLClass(), this.getOWLClass_OWLDisjointWith(), "invOWLDisjointWith", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_RefByIntersectionClass(), this.getIntersectionClass(), this.getIntersectionClass_OWLIntersectionOf(), "refByIntersectionClass", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_RefByUnionClass(), this.getUnionClass(), this.getUnionClass_OWLUnionOf(), "refByUnionClass", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLClass_InvOWLComplementOf(), this.getComplementClass(), this.getComplementClass_OWLComplementOf(), "invOWLComplementOf", null, 0, -1, OWLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlRestrictionEClass, OWLRestriction.class, "OWLRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOWLRestriction_OWLOnProperty(), theRdfsPackage.getRDFProperty(), theRdfsPackage.getRDFProperty_RefByRestriction(), "OWLOnProperty", null, 1, 1, OWLRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlObjectPropertyEClass, OWLObjectProperty.class, "OWLObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOWLObjectProperty_InverseFunctional(), ecorePackage.getEBooleanObject(), "inverseFunctional", null, 0, 1, OWLObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOWLObjectProperty_Symmetric(), ecorePackage.getEBooleanObject(), "symmetric", null, 0, 1, OWLObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOWLObjectProperty_Transitive(), ecorePackage.getEBooleanObject(), "transitive", null, 0, 1, OWLObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLObjectProperty_OWLInverseOf(), this.getOWLObjectProperty(), this.getOWLObjectProperty_InvOWLInverseOf(), "OWLInverseOf", null, 0, 1, OWLObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOWLObjectProperty_InvOWLInverseOf(), this.getOWLObjectProperty(), this.getOWLObjectProperty_OWLInverseOf(), "invOWLInverseOf", null, 0, -1, OWLObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Functional(), ecorePackage.getEBooleanObject(), "functional", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OWLEquivalentProperty(), this.getProperty(), this.getProperty_InvOWLEquivalentProperty(), "OWLEquivalentProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_InvOWLEquivalentProperty(), this.getProperty(), this.getProperty_OWLEquivalentProperty(), "invOWLEquivalentProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividual_OWLDifferentFrom(), this.getIndividual(), this.getIndividual_InvOWLDifferentFrom(), "OWLDifferentFrom", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_InvOWLDifferentFrom(), this.getIndividual(), this.getIndividual_OWLDifferentFrom(), "invOWLDifferentFrom", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_RefByOWLDistinctMembers(), this.getOWLAllDifferent(), this.getOWLAllDifferent_OWLDistinctMembers(), "refByOWLDistinctMembers", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_OWLSameAs(), this.getIndividual(), this.getIndividual_InvOWLSameAs(), "OWLSameAs", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_InvOWLSameAs(), this.getIndividual(), this.getIndividual_OWLSameAs(), "invOWLSameAs", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_DatatypeSlot(), this.getDatatypeSlot(), this.getDatatypeSlot_Individual(), "datatypeSlot", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividual_ObjectSlot(), this.getObjectSlot(), this.getObjectSlot_Individual(), "objectSlot", null, 0, -1, Individual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlAllDifferentEClass, OWLAllDifferent.class, "OWLAllDifferent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOWLAllDifferent_OWLDistinctMembers(), this.getIndividual(), this.getIndividual_RefByOWLDistinctMembers(), "OWLDistinctMembers", null, 2, -1, OWLAllDifferent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlDataRangeEClass, OWLDataRange.class, "OWLDataRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOWLDataRange_OWLOneOf(), theRdfsPackage.getRDFSLiteral(), null, "OWLOneOf", null, 1, -1, OWLDataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlAnnotationPropertyEClass, OWLAnnotationProperty.class, "OWLAnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeSlotEClass, DatatypeSlot.class, "DatatypeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeSlot_Individual(), this.getIndividual(), this.getIndividual_DatatypeSlot(), "Individual", null, 0, 1, DatatypeSlot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeSlot_Content(), theRdfsPackage.getRDFSLiteral(), theRdfsPackage.getRDFSLiteral_DatatypeSlot(), "content", null, 1, -1, DatatypeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeSlot_Property(), this.getOWLDatatypeProperty(), null, "property", null, 1, 1, DatatypeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSlotEClass, ObjectSlot.class, "ObjectSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSlot_Individual(), this.getIndividual(), this.getIndividual_ObjectSlot(), "Individual", null, 0, 1, ObjectSlot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSlot_Content(), this.getIndividual(), null, "content", null, 1, -1, ObjectSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSlot_Property(), this.getOWLObjectProperty(), null, "property", null, 1, 1, ObjectSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedClassEClass, EnumeratedClass.class, "EnumeratedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedClass_OWLOneOf(), this.getIndividual(), null, "OWLOneOf", null, 0, -1, EnumeratedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intersectionClassEClass, IntersectionClass.class, "IntersectionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntersectionClass_OWLIntersectionOf(), this.getOWLClass(), this.getOWLClass_RefByIntersectionClass(), "OWLIntersectionOf", null, 0, -1, IntersectionClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionClassEClass, UnionClass.class, "UnionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionClass_OWLUnionOf(), this.getOWLClass(), this.getOWLClass_RefByUnionClass(), "OWLUnionOf", null, 0, -1, UnionClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasValueRestrictionEClass, HasValueRestriction.class, "HasValueRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasValueRestriction_OWLHasValue(), theRdfsPackage.getRDFSResource(), null, "OWLHasValue", null, 1, 1, HasValueRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allValuesFromRestrictionEClass, AllValuesFromRestriction.class, "AllValuesFromRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllValuesFromRestriction_OWLAllValuesFrom(), theRdfsPackage.getRDFSClass(), theRdfsPackage.getRDFSClass_RefByAVFRestriction(), "OWLAllValuesFrom", null, 1, 1, AllValuesFromRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(someValuesFromRestrictionEClass, SomeValuesFromRestriction.class, "SomeValuesFromRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSomeValuesFromRestriction_OWLSomeValuesFrom(), theRdfsPackage.getRDFSClass(), theRdfsPackage.getRDFSClass_RefBySVFRestriction(), "OWLSomeValuesFrom", null, 1, 1, SomeValuesFromRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityRestrictionEClass, CardinalityRestriction.class, "CardinalityRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinalityRestriction_OWLCardinality(), theRdfsPackage.getRDFSLiteral(), null, "OWLCardinality", null, 1, 1, CardinalityRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxCardinalityRestrictionEClass, MaxCardinalityRestriction.class, "MaxCardinalityRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxCardinalityRestriction_OWLMaxCardinality(), theRdfsPackage.getRDFSLiteral(), null, "OWLMaxCardinality", null, 1, 1, MaxCardinalityRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minCardinalityRestrictionEClass, MinCardinalityRestriction.class, "MinCardinalityRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinCardinalityRestriction_OWLMinCardinality(), theRdfsPackage.getRDFSLiteral(), null, "OWLMinCardinality", null, 1, 1, MinCardinalityRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementClassEClass, ComplementClass.class, "ComplementClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplementClass_OWLComplementOf(), this.getOWLClass(), this.getOWLClass_InvOWLComplementOf(), "OWLComplementOf", null, 1, 1, ComplementClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(owlDatatypePropertyEClass, OWLDatatypeProperty.class, "OWLDatatypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OwlPackageImpl
