/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owl.OwlPackage;

import owl.impl.OwlPackageImpl;

import rdfs.Namespace;
import rdfs.Ontology;
import rdfs.PlainLiteral;
import rdfs.RDFAlt;
import rdfs.RDFBag;
import rdfs.RDFList;
import rdfs.RDFProperty;
import rdfs.RDFSClass;
import rdfs.RDFSContainer;
import rdfs.RDFSContainerMembershipProperty;
import rdfs.RDFSDatatype;
import rdfs.RDFSLiteral;
import rdfs.RDFSResource;
import rdfs.RDFSeq;
import rdfs.RDFStatement;
import rdfs.RDFXMLLiteral;
import rdfs.RdfsFactory;
import rdfs.RdfsPackage;
import rdfs.TypedLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfsPackageImpl extends EPackageImpl implements RdfsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfxmlLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfAltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfBagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfsContainerMembershipPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

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
	 * @see rdfs.RdfsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdfsPackageImpl() {
		super(eNS_URI, RdfsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RdfsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdfsPackage init() {
		if (isInited) return (RdfsPackage)EPackage.Registry.INSTANCE.getEPackage(RdfsPackage.eNS_URI);

		// Obtain or create and register package
		RdfsPackageImpl theRdfsPackage = (RdfsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RdfsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RdfsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OwlPackageImpl theOwlPackage = (OwlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI) instanceof OwlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI) : OwlPackage.eINSTANCE);

		// Create package meta-data objects
		theRdfsPackage.createPackageContents();
		theOwlPackage.createPackageContents();

		// Initialize created meta-data
		theRdfsPackage.initializePackageContents();
		theOwlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRdfsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdfsPackage.eNS_URI, theRdfsPackage);
		return theRdfsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSResource() {
		return rdfsResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDFSResource_LocalName() {
		return (EAttribute)rdfsResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDFSResource_URI() {
		return (EAttribute)rdfsResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_SubjectStatement() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_ObjectStatement() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFSIsDefinedBy() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFValue() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFSSeeAlso() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFType() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFSMember() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_PredicateStatement() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFSComment() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_RDFSLabel() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSResource_Namespace() {
		return (EReference)rdfsResourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSClass() {
		return rdfsClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_RefByAVFRestriction() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_RefBySVFRestriction() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_RDFSSubClassOf() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_SubClass() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_OwnedProperty() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_RangedByProperty() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSClass_Instance() {
		return (EReference)rdfsClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSLiteral() {
		return rdfsLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFSLiteral_DatatypeSlot() {
		return (EReference)rdfsLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDFSLiteral_LexicalForm() {
		return (EAttribute)rdfsLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSDatatype() {
		return rdfsDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFXMLLiteral() {
		return rdfxmlLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDFXMLLiteral_Language() {
		return (EAttribute)rdfxmlLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFProperty() {
		return rdfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFProperty_RefByRestriction() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFProperty_RDFSSubPropertyOf() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFProperty_SubProperty() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFProperty_RDFSDomain() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFProperty_RDFSRange() {
		return (EReference)rdfPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFList() {
		return rdfListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFList_RDFRest() {
		return (EReference)rdfListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFList_RDFFirst() {
		return (EReference)rdfListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSContainer() {
		return rdfsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFAlt() {
		return rdfAltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFBag() {
		return rdfBagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSeq() {
		return rdfSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFSContainerMembershipProperty() {
		return rdfsContainerMembershipPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDFStatement() {
		return rdfStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFStatement_RDFSubject() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFStatement_RDFObject() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDFStatement_RDFPredicate() {
		return (EReference)rdfStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Contains() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_OwnedNamespace() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainLiteral() {
		return plainLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteral_Language() {
		return (EAttribute)plainLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedLiteral() {
		return typedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedLiteral_Datatype() {
		return (EReference)typedLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Name() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_URI() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsFactory getRdfsFactory() {
		return (RdfsFactory)getEFactoryInstance();
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
		rdfsResourceEClass = createEClass(RDFS_RESOURCE);
		createEAttribute(rdfsResourceEClass, RDFS_RESOURCE__LOCAL_NAME);
		createEAttribute(rdfsResourceEClass, RDFS_RESOURCE__URI);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__SUBJECT_STATEMENT);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__OBJECT_STATEMENT);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDFS_IS_DEFINED_BY);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDF_VALUE);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDFS_SEE_ALSO);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDF_TYPE);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDFS_MEMBER);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__PREDICATE_STATEMENT);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDFS_COMMENT);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__RDFS_LABEL);
		createEReference(rdfsResourceEClass, RDFS_RESOURCE__NAMESPACE);

		rdfsClassEClass = createEClass(RDFS_CLASS);
		createEReference(rdfsClassEClass, RDFS_CLASS__REF_BY_AVF_RESTRICTION);
		createEReference(rdfsClassEClass, RDFS_CLASS__REF_BY_SVF_RESTRICTION);
		createEReference(rdfsClassEClass, RDFS_CLASS__RDFS_SUB_CLASS_OF);
		createEReference(rdfsClassEClass, RDFS_CLASS__SUB_CLASS);
		createEReference(rdfsClassEClass, RDFS_CLASS__OWNED_PROPERTY);
		createEReference(rdfsClassEClass, RDFS_CLASS__RANGED_BY_PROPERTY);
		createEReference(rdfsClassEClass, RDFS_CLASS__INSTANCE);

		rdfsLiteralEClass = createEClass(RDFS_LITERAL);
		createEReference(rdfsLiteralEClass, RDFS_LITERAL__DATATYPE_SLOT);
		createEAttribute(rdfsLiteralEClass, RDFS_LITERAL__LEXICAL_FORM);

		rdfsDatatypeEClass = createEClass(RDFS_DATATYPE);

		rdfxmlLiteralEClass = createEClass(RDFXML_LITERAL);
		createEAttribute(rdfxmlLiteralEClass, RDFXML_LITERAL__LANGUAGE);

		rdfPropertyEClass = createEClass(RDF_PROPERTY);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__REF_BY_RESTRICTION);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__RDFS_SUB_PROPERTY_OF);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__SUB_PROPERTY);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__RDFS_DOMAIN);
		createEReference(rdfPropertyEClass, RDF_PROPERTY__RDFS_RANGE);

		rdfListEClass = createEClass(RDF_LIST);
		createEReference(rdfListEClass, RDF_LIST__RDF_REST);
		createEReference(rdfListEClass, RDF_LIST__RDF_FIRST);

		rdfsContainerEClass = createEClass(RDFS_CONTAINER);

		rdfAltEClass = createEClass(RDF_ALT);

		rdfBagEClass = createEClass(RDF_BAG);

		rdfSeqEClass = createEClass(RDF_SEQ);

		rdfsContainerMembershipPropertyEClass = createEClass(RDFS_CONTAINER_MEMBERSHIP_PROPERTY);

		rdfStatementEClass = createEClass(RDF_STATEMENT);
		createEReference(rdfStatementEClass, RDF_STATEMENT__RDF_SUBJECT);
		createEReference(rdfStatementEClass, RDF_STATEMENT__RDF_OBJECT);
		createEReference(rdfStatementEClass, RDF_STATEMENT__RDF_PREDICATE);

		ontologyEClass = createEClass(ONTOLOGY);
		createEReference(ontologyEClass, ONTOLOGY__CONTAINS);
		createEReference(ontologyEClass, ONTOLOGY__OWNED_NAMESPACE);

		plainLiteralEClass = createEClass(PLAIN_LITERAL);
		createEAttribute(plainLiteralEClass, PLAIN_LITERAL__LANGUAGE);

		typedLiteralEClass = createEClass(TYPED_LITERAL);
		createEReference(typedLiteralEClass, TYPED_LITERAL__DATATYPE);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__NAME);
		createEAttribute(namespaceEClass, NAMESPACE__URI);
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
		OwlPackage theOwlPackage = (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdfsClassEClass.getESuperTypes().add(this.getRDFSResource());
		rdfsLiteralEClass.getESuperTypes().add(this.getRDFSResource());
		rdfsDatatypeEClass.getESuperTypes().add(this.getRDFSClass());
		rdfxmlLiteralEClass.getESuperTypes().add(this.getTypedLiteral());
		rdfPropertyEClass.getESuperTypes().add(this.getRDFSResource());
		rdfListEClass.getESuperTypes().add(this.getRDFSResource());
		rdfsContainerEClass.getESuperTypes().add(this.getRDFSResource());
		rdfAltEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfBagEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfSeqEClass.getESuperTypes().add(this.getRDFSContainer());
		rdfsContainerMembershipPropertyEClass.getESuperTypes().add(this.getRDFProperty());
		rdfStatementEClass.getESuperTypes().add(this.getRDFSResource());
		ontologyEClass.getESuperTypes().add(this.getRDFSResource());
		plainLiteralEClass.getESuperTypes().add(this.getRDFSLiteral());
		typedLiteralEClass.getESuperTypes().add(this.getRDFSLiteral());

		// Initialize classes and features; add operations and parameters
		initEClass(rdfsResourceEClass, RDFSResource.class, "RDFSResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDFSResource_LocalName(), ecorePackage.getEString(), "localName", null, 0, 1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDFSResource_URI(), ecorePackage.getEString(), "URI", null, 0, 1, RDFSResource.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_SubjectStatement(), this.getRDFStatement(), this.getRDFStatement_RDFSubject(), "subjectStatement", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_ObjectStatement(), this.getRDFStatement(), this.getRDFStatement_RDFObject(), "objectStatement", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFSIsDefinedBy(), this.getRDFSResource(), null, "RDFSIsDefinedBy", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFValue(), this.getRDFSResource(), null, "RDFValue", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFSSeeAlso(), this.getRDFSResource(), null, "RDFSSeeAlso", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFType(), this.getRDFSClass(), this.getRDFSClass_Instance(), "RDFType", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFSMember(), this.getRDFSResource(), null, "RDFSMember", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_PredicateStatement(), this.getRDFStatement(), this.getRDFStatement_RDFPredicate(), "predicateStatement", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFSComment(), this.getPlainLiteral(), null, "RDFSComment", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_RDFSLabel(), this.getPlainLiteral(), null, "RDFSLabel", null, 0, -1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSResource_Namespace(), this.getNamespace(), null, "namespace", null, 1, 1, RDFSResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfsClassEClass, RDFSClass.class, "RDFSClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFSClass_RefByAVFRestriction(), theOwlPackage.getAllValuesFromRestriction(), theOwlPackage.getAllValuesFromRestriction_OWLAllValuesFrom(), "refByAVFRestriction", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_RefBySVFRestriction(), theOwlPackage.getSomeValuesFromRestriction(), theOwlPackage.getSomeValuesFromRestriction_OWLSomeValuesFrom(), "refBySVFRestriction", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_RDFSSubClassOf(), this.getRDFSClass(), this.getRDFSClass_SubClass(), "RDFSSubClassOf", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_SubClass(), this.getRDFSClass(), this.getRDFSClass_RDFSSubClassOf(), "subClass", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_OwnedProperty(), this.getRDFProperty(), this.getRDFProperty_RDFSDomain(), "ownedProperty", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_RangedByProperty(), this.getRDFProperty(), this.getRDFProperty_RDFSRange(), "rangedByProperty", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFSClass_Instance(), this.getRDFSResource(), this.getRDFSResource_RDFType(), "instance", null, 0, -1, RDFSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfsLiteralEClass, RDFSLiteral.class, "RDFSLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFSLiteral_DatatypeSlot(), theOwlPackage.getDatatypeSlot(), theOwlPackage.getDatatypeSlot_Content(), "DatatypeSlot", null, 0, 1, RDFSLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDFSLiteral_LexicalForm(), ecorePackage.getEString(), "lexicalForm", null, 0, 1, RDFSLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfsDatatypeEClass, RDFSDatatype.class, "RDFSDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfxmlLiteralEClass, RDFXMLLiteral.class, "RDFXMLLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRDFXMLLiteral_Language(), ecorePackage.getEString(), "language", null, 0, 1, RDFXMLLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfPropertyEClass, RDFProperty.class, "RDFProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFProperty_RefByRestriction(), theOwlPackage.getOWLRestriction(), theOwlPackage.getOWLRestriction_OWLOnProperty(), "refByRestriction", null, 0, -1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFProperty_RDFSSubPropertyOf(), this.getRDFProperty(), this.getRDFProperty_SubProperty(), "RDFSSubPropertyOf", null, 0, -1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFProperty_SubProperty(), this.getRDFProperty(), this.getRDFProperty_RDFSSubPropertyOf(), "subProperty", null, 0, -1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFProperty_RDFSDomain(), this.getRDFSClass(), this.getRDFSClass_OwnedProperty(), "RDFSDomain", null, 0, -1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFProperty_RDFSRange(), this.getRDFSClass(), this.getRDFSClass_RangedByProperty(), "RDFSRange", null, 0, -1, RDFProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfListEClass, RDFList.class, "RDFList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFList_RDFRest(), this.getRDFList(), null, "RDFRest", null, 0, 1, RDFList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFList_RDFFirst(), this.getRDFSResource(), null, "RDFFirst", null, 0, 1, RDFList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfsContainerEClass, RDFSContainer.class, "RDFSContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfAltEClass, RDFAlt.class, "RDFAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfBagEClass, RDFBag.class, "RDFBag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfSeqEClass, RDFSeq.class, "RDFSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfsContainerMembershipPropertyEClass, RDFSContainerMembershipProperty.class, "RDFSContainerMembershipProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfStatementEClass, RDFStatement.class, "RDFStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDFStatement_RDFSubject(), this.getRDFSResource(), this.getRDFSResource_SubjectStatement(), "RDFSubject", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFStatement_RDFObject(), this.getRDFSResource(), this.getRDFSResource_ObjectStatement(), "RDFObject", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDFStatement_RDFPredicate(), this.getRDFSResource(), this.getRDFSResource_PredicateStatement(), "RDFPredicate", null, 1, 1, RDFStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntology_Contains(), this.getRDFSResource(), null, "contains", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOntology_OwnedNamespace(), this.getNamespace(), null, "ownedNamespace", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainLiteralEClass, PlainLiteral.class, "PlainLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainLiteral_Language(), ecorePackage.getEString(), "language", null, 0, 1, PlainLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedLiteralEClass, TypedLiteral.class, "TypedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedLiteral_Datatype(), this.getRDFSDatatype(), null, "datatype", null, 1, 1, TypedLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RdfsPackageImpl
