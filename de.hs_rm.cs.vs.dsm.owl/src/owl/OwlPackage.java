/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see owl.OwlFactory
 * @model kind="package"
 * @generated
 */
public interface OwlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/owl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.eodm.owl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlPackage eINSTANCE = owl.impl.OwlPackageImpl.init();

	/**
	 * The meta object id for the '{@link owl.impl.OWLOntologyImpl <em>OWL Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLOntologyImpl
	 * @see owl.impl.OwlPackageImpl#getOWLOntology()
	 * @generated
	 */
	int OWL_ONTOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__LOCAL_NAME = RdfsPackage.ONTOLOGY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__URI = RdfsPackage.ONTOLOGY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__SUBJECT_STATEMENT = RdfsPackage.ONTOLOGY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OBJECT_STATEMENT = RdfsPackage.ONTOLOGY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDFS_IS_DEFINED_BY = RdfsPackage.ONTOLOGY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDF_VALUE = RdfsPackage.ONTOLOGY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDFS_SEE_ALSO = RdfsPackage.ONTOLOGY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDF_TYPE = RdfsPackage.ONTOLOGY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDFS_MEMBER = RdfsPackage.ONTOLOGY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__PREDICATE_STATEMENT = RdfsPackage.ONTOLOGY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDFS_COMMENT = RdfsPackage.ONTOLOGY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__RDFS_LABEL = RdfsPackage.ONTOLOGY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__NAMESPACE = RdfsPackage.ONTOLOGY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__CONTAINS = RdfsPackage.ONTOLOGY__CONTAINS;

	/**
	 * The feature id for the '<em><b>Owned Namespace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWNED_NAMESPACE = RdfsPackage.ONTOLOGY__OWNED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>OWL Backward Compatible With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OWL Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWL_IMPORTS = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>OWL Incompatible With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>OWL Prior Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWL_PRIOR_VERSION = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>OWL Version Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY__OWL_VERSION_INFO = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OWL Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_FEATURE_COUNT = RdfsPackage.ONTOLOGY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link owl.impl.OWLOntologyPropertyImpl <em>OWL Ontology Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLOntologyPropertyImpl
	 * @see owl.impl.OwlPackageImpl#getOWLOntologyProperty()
	 * @generated
	 */
	int OWL_ONTOLOGY_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__LOCAL_NAME = RdfsPackage.RDF_PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__URI = RdfsPackage.RDF_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__SUBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__OBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_IS_DEFINED_BY = RdfsPackage.RDF_PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDF_VALUE = RdfsPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_SEE_ALSO = RdfsPackage.RDF_PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDF_TYPE = RdfsPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_MEMBER = RdfsPackage.RDF_PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__PREDICATE_STATEMENT = RdfsPackage.RDF_PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_COMMENT = RdfsPackage.RDF_PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_LABEL = RdfsPackage.RDF_PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__NAMESPACE = RdfsPackage.RDF_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__REF_BY_RESTRICTION = RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_SUB_PROPERTY_OF = RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__SUB_PROPERTY = RdfsPackage.RDF_PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_DOMAIN = RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY__RDFS_RANGE = RdfsPackage.RDF_PROPERTY__RDFS_RANGE;

	/**
	 * The number of structural features of the '<em>OWL Ontology Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ONTOLOGY_PROPERTY_FEATURE_COUNT = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link owl.impl.OWLClassImpl <em>OWL Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLClassImpl
	 * @see owl.impl.OwlPackageImpl#getOWLClass()
	 * @generated
	 */
	int OWL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__LOCAL_NAME = RdfsPackage.RDFS_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__URI = RdfsPackage.RDFS_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__SUBJECT_STATEMENT = RdfsPackage.RDFS_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__OBJECT_STATEMENT = RdfsPackage.RDFS_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_IS_DEFINED_BY = RdfsPackage.RDFS_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDF_VALUE = RdfsPackage.RDFS_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_SEE_ALSO = RdfsPackage.RDFS_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDF_TYPE = RdfsPackage.RDFS_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_MEMBER = RdfsPackage.RDFS_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__PREDICATE_STATEMENT = RdfsPackage.RDFS_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_COMMENT = RdfsPackage.RDFS_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_LABEL = RdfsPackage.RDFS_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__NAMESPACE = RdfsPackage.RDFS_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__REF_BY_AVF_RESTRICTION = RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__REF_BY_SVF_RESTRICTION = RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RDFS_SUB_CLASS_OF = RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__SUB_CLASS = RdfsPackage.RDFS_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__OWNED_PROPERTY = RdfsPackage.RDFS_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__RANGED_BY_PROPERTY = RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__INSTANCE = RdfsPackage.RDFS_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__DEPRECATED = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__INV_OWL_EQUIVALENT_CLASS = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__OWL_EQUIVALENT_CLASS = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__OWL_DISJOINT_WITH = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__INV_OWL_DISJOINT_WITH = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__REF_BY_INTERSECTION_CLASS = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__REF_BY_UNION_CLASS = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS__INV_OWL_COMPLEMENT_OF = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>OWL Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_CLASS_FEATURE_COUNT = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link owl.impl.OWLRestrictionImpl <em>OWL Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getOWLRestriction()
	 * @generated
	 */
	int OWL_RESTRICTION = 3;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__LOCAL_NAME = OWL_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__URI = OWL_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__SUBJECT_STATEMENT = OWL_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__OBJECT_STATEMENT = OWL_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDF_VALUE = OWL_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_SEE_ALSO = OWL_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDF_TYPE = OWL_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_MEMBER = OWL_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__PREDICATE_STATEMENT = OWL_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_COMMENT = OWL_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_LABEL = OWL_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__NAMESPACE = OWL_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__SUB_CLASS = OWL_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__OWNED_PROPERTY = OWL_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__RANGED_BY_PROPERTY = OWL_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__INSTANCE = OWL_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__DEPRECATED = OWL_CLASS__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_CLASS__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_CLASS__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__OWL_DISJOINT_WITH = OWL_CLASS__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_CLASS__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_CLASS__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__REF_BY_UNION_CLASS = OWL_CLASS__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_CLASS__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION__OWL_ON_PROPERTY = OWL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OWL Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_RESTRICTION_FEATURE_COUNT = OWL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.PropertyImpl
	 * @see owl.impl.OwlPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOCAL_NAME = RdfsPackage.RDF_PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__URI = RdfsPackage.RDF_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_IS_DEFINED_BY = RdfsPackage.RDF_PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDF_VALUE = RdfsPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_SEE_ALSO = RdfsPackage.RDF_PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDF_TYPE = RdfsPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_MEMBER = RdfsPackage.RDF_PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PREDICATE_STATEMENT = RdfsPackage.RDF_PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_COMMENT = RdfsPackage.RDF_PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_LABEL = RdfsPackage.RDF_PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMESPACE = RdfsPackage.RDF_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REF_BY_RESTRICTION = RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_SUB_PROPERTY_OF = RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUB_PROPERTY = RdfsPackage.RDF_PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_DOMAIN = RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RDFS_RANGE = RdfsPackage.RDF_PROPERTY__RDFS_RANGE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPRECATED = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FUNCTIONAL = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWL_EQUIVALENT_PROPERTY = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INV_OWL_EQUIVALENT_PROPERTY = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link owl.impl.OWLObjectPropertyImpl <em>OWL Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLObjectPropertyImpl
	 * @see owl.impl.OwlPackageImpl#getOWLObjectProperty()
	 * @generated
	 */
	int OWL_OBJECT_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__LOCAL_NAME = PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__URI = PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__SUBJECT_STATEMENT = PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__OBJECT_STATEMENT = PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_IS_DEFINED_BY = PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDF_VALUE = PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_SEE_ALSO = PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDF_TYPE = PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_MEMBER = PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__PREDICATE_STATEMENT = PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_COMMENT = PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_LABEL = PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__NAMESPACE = PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__REF_BY_RESTRICTION = PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_SUB_PROPERTY_OF = PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__SUB_PROPERTY = PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_DOMAIN = PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__RDFS_RANGE = PROPERTY__RDFS_RANGE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__DEPRECATED = PROPERTY__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__FUNCTIONAL = PROPERTY__FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__OWL_EQUIVALENT_PROPERTY = PROPERTY__OWL_EQUIVALENT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__INV_OWL_EQUIVALENT_PROPERTY = PROPERTY__INV_OWL_EQUIVALENT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__SYMMETRIC = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__TRANSITIVE = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>OWL Inverse Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__OWL_INVERSE_OF = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inv OWL Inverse Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OWL Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_OBJECT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link owl.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.IndividualImpl
	 * @see owl.impl.OwlPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 6;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__LOCAL_NAME = RdfsPackage.RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__URI = RdfsPackage.RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__SUBJECT_STATEMENT = RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__OBJECT_STATEMENT = RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDFS_IS_DEFINED_BY = RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_VALUE = RdfsPackage.RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDFS_SEE_ALSO = RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDF_TYPE = RdfsPackage.RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDFS_MEMBER = RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__PREDICATE_STATEMENT = RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDFS_COMMENT = RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__RDFS_LABEL = RdfsPackage.RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAMESPACE = RdfsPackage.RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>OWL Different From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__OWL_DIFFERENT_FROM = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inv OWL Different From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INV_OWL_DIFFERENT_FROM = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref By OWL Distinct Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>OWL Same As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__OWL_SAME_AS = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inv OWL Same As</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INV_OWL_SAME_AS = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datatype Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__DATATYPE_SLOT = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Object Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__OBJECT_SLOT = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link owl.impl.OWLAllDifferentImpl <em>OWL All Different</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLAllDifferentImpl
	 * @see owl.impl.OwlPackageImpl#getOWLAllDifferent()
	 * @generated
	 */
	int OWL_ALL_DIFFERENT = 7;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__LOCAL_NAME = RdfsPackage.RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__URI = RdfsPackage.RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__SUBJECT_STATEMENT = RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__OBJECT_STATEMENT = RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDFS_IS_DEFINED_BY = RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDF_VALUE = RdfsPackage.RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDFS_SEE_ALSO = RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDF_TYPE = RdfsPackage.RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDFS_MEMBER = RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__PREDICATE_STATEMENT = RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDFS_COMMENT = RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__RDFS_LABEL = RdfsPackage.RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__NAMESPACE = RdfsPackage.RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>OWL Distinct Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OWL All Different</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ALL_DIFFERENT_FEATURE_COUNT = RdfsPackage.RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.OWLDataRangeImpl <em>OWL Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLDataRangeImpl
	 * @see owl.impl.OwlPackageImpl#getOWLDataRange()
	 * @generated
	 */
	int OWL_DATA_RANGE = 8;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__LOCAL_NAME = RdfsPackage.RDFS_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__URI = RdfsPackage.RDFS_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__SUBJECT_STATEMENT = RdfsPackage.RDFS_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__OBJECT_STATEMENT = RdfsPackage.RDFS_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_IS_DEFINED_BY = RdfsPackage.RDFS_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDF_VALUE = RdfsPackage.RDFS_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_SEE_ALSO = RdfsPackage.RDFS_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDF_TYPE = RdfsPackage.RDFS_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_MEMBER = RdfsPackage.RDFS_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__PREDICATE_STATEMENT = RdfsPackage.RDFS_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_COMMENT = RdfsPackage.RDFS_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_LABEL = RdfsPackage.RDFS_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__NAMESPACE = RdfsPackage.RDFS_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__REF_BY_AVF_RESTRICTION = RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__REF_BY_SVF_RESTRICTION = RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RDFS_SUB_CLASS_OF = RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__SUB_CLASS = RdfsPackage.RDFS_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__OWNED_PROPERTY = RdfsPackage.RDFS_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__RANGED_BY_PROPERTY = RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__INSTANCE = RdfsPackage.RDFS_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>OWL One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE__OWL_ONE_OF = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OWL Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATA_RANGE_FEATURE_COUNT = RdfsPackage.RDFS_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.OWLAnnotationPropertyImpl <em>OWL Annotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLAnnotationPropertyImpl
	 * @see owl.impl.OwlPackageImpl#getOWLAnnotationProperty()
	 * @generated
	 */
	int OWL_ANNOTATION_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__LOCAL_NAME = RdfsPackage.RDF_PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__URI = RdfsPackage.RDF_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__SUBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__OBJECT_STATEMENT = RdfsPackage.RDF_PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_IS_DEFINED_BY = RdfsPackage.RDF_PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDF_VALUE = RdfsPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_SEE_ALSO = RdfsPackage.RDF_PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDF_TYPE = RdfsPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_MEMBER = RdfsPackage.RDF_PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__PREDICATE_STATEMENT = RdfsPackage.RDF_PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_COMMENT = RdfsPackage.RDF_PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_LABEL = RdfsPackage.RDF_PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__NAMESPACE = RdfsPackage.RDF_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__REF_BY_RESTRICTION = RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_SUB_PROPERTY_OF = RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__SUB_PROPERTY = RdfsPackage.RDF_PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_DOMAIN = RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY__RDFS_RANGE = RdfsPackage.RDF_PROPERTY__RDFS_RANGE;

	/**
	 * The number of structural features of the '<em>OWL Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_ANNOTATION_PROPERTY_FEATURE_COUNT = RdfsPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link owl.impl.DatatypeSlotImpl <em>Datatype Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.DatatypeSlotImpl
	 * @see owl.impl.OwlPackageImpl#getDatatypeSlot()
	 * @generated
	 */
	int DATATYPE_SLOT = 10;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_SLOT__INDIVIDUAL = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_SLOT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_SLOT__PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Datatype Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_SLOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link owl.impl.ObjectSlotImpl <em>Object Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.ObjectSlotImpl
	 * @see owl.impl.OwlPackageImpl#getObjectSlot()
	 * @generated
	 */
	int OBJECT_SLOT = 11;

	/**
	 * The feature id for the '<em><b>Individual</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SLOT__INDIVIDUAL = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SLOT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SLOT__PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>Object Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SLOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link owl.impl.EnumeratedClassImpl <em>Enumerated Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.EnumeratedClassImpl
	 * @see owl.impl.OwlPackageImpl#getEnumeratedClass()
	 * @generated
	 */
	int ENUMERATED_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__LOCAL_NAME = OWL_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__URI = OWL_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__SUBJECT_STATEMENT = OWL_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__OBJECT_STATEMENT = OWL_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_IS_DEFINED_BY = OWL_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDF_VALUE = OWL_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_SEE_ALSO = OWL_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDF_TYPE = OWL_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_MEMBER = OWL_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__PREDICATE_STATEMENT = OWL_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_COMMENT = OWL_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_LABEL = OWL_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__NAMESPACE = OWL_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__REF_BY_AVF_RESTRICTION = OWL_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__REF_BY_SVF_RESTRICTION = OWL_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RDFS_SUB_CLASS_OF = OWL_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__SUB_CLASS = OWL_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__OWNED_PROPERTY = OWL_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__RANGED_BY_PROPERTY = OWL_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__INSTANCE = OWL_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__DEPRECATED = OWL_CLASS__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__INV_OWL_EQUIVALENT_CLASS = OWL_CLASS__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__OWL_EQUIVALENT_CLASS = OWL_CLASS__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__OWL_DISJOINT_WITH = OWL_CLASS__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__INV_OWL_DISJOINT_WITH = OWL_CLASS__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__REF_BY_INTERSECTION_CLASS = OWL_CLASS__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__REF_BY_UNION_CLASS = OWL_CLASS__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__INV_OWL_COMPLEMENT_OF = OWL_CLASS__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS__OWL_ONE_OF = OWL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_CLASS_FEATURE_COUNT = OWL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.IntersectionClassImpl <em>Intersection Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.IntersectionClassImpl
	 * @see owl.impl.OwlPackageImpl#getIntersectionClass()
	 * @generated
	 */
	int INTERSECTION_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__LOCAL_NAME = OWL_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__URI = OWL_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__SUBJECT_STATEMENT = OWL_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__OBJECT_STATEMENT = OWL_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_IS_DEFINED_BY = OWL_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDF_VALUE = OWL_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_SEE_ALSO = OWL_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDF_TYPE = OWL_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_MEMBER = OWL_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__PREDICATE_STATEMENT = OWL_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_COMMENT = OWL_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_LABEL = OWL_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__NAMESPACE = OWL_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__REF_BY_AVF_RESTRICTION = OWL_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__REF_BY_SVF_RESTRICTION = OWL_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RDFS_SUB_CLASS_OF = OWL_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__SUB_CLASS = OWL_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__OWNED_PROPERTY = OWL_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__RANGED_BY_PROPERTY = OWL_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__INSTANCE = OWL_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__DEPRECATED = OWL_CLASS__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__INV_OWL_EQUIVALENT_CLASS = OWL_CLASS__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__OWL_EQUIVALENT_CLASS = OWL_CLASS__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__OWL_DISJOINT_WITH = OWL_CLASS__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__INV_OWL_DISJOINT_WITH = OWL_CLASS__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__REF_BY_INTERSECTION_CLASS = OWL_CLASS__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__REF_BY_UNION_CLASS = OWL_CLASS__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__INV_OWL_COMPLEMENT_OF = OWL_CLASS__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL Intersection Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS__OWL_INTERSECTION_OF = OWL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intersection Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_CLASS_FEATURE_COUNT = OWL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.UnionClassImpl <em>Union Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.UnionClassImpl
	 * @see owl.impl.OwlPackageImpl#getUnionClass()
	 * @generated
	 */
	int UNION_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__LOCAL_NAME = OWL_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__URI = OWL_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__SUBJECT_STATEMENT = OWL_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__OBJECT_STATEMENT = OWL_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_IS_DEFINED_BY = OWL_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDF_VALUE = OWL_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_SEE_ALSO = OWL_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDF_TYPE = OWL_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_MEMBER = OWL_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__PREDICATE_STATEMENT = OWL_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_COMMENT = OWL_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_LABEL = OWL_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__NAMESPACE = OWL_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__REF_BY_AVF_RESTRICTION = OWL_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__REF_BY_SVF_RESTRICTION = OWL_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RDFS_SUB_CLASS_OF = OWL_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__SUB_CLASS = OWL_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__OWNED_PROPERTY = OWL_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__RANGED_BY_PROPERTY = OWL_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__INSTANCE = OWL_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__DEPRECATED = OWL_CLASS__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__INV_OWL_EQUIVALENT_CLASS = OWL_CLASS__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__OWL_EQUIVALENT_CLASS = OWL_CLASS__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__OWL_DISJOINT_WITH = OWL_CLASS__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__INV_OWL_DISJOINT_WITH = OWL_CLASS__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__REF_BY_INTERSECTION_CLASS = OWL_CLASS__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__REF_BY_UNION_CLASS = OWL_CLASS__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__INV_OWL_COMPLEMENT_OF = OWL_CLASS__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL Union Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS__OWL_UNION_OF = OWL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_CLASS_FEATURE_COUNT = OWL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.HasValueRestrictionImpl <em>Has Value Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.HasValueRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getHasValueRestriction()
	 * @generated
	 */
	int HAS_VALUE_RESTRICTION = 15;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION__OWL_HAS_VALUE = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Value Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.AllValuesFromRestrictionImpl <em>All Values From Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.AllValuesFromRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getAllValuesFromRestriction()
	 * @generated
	 */
	int ALL_VALUES_FROM_RESTRICTION = 16;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL All Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Values From Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_VALUES_FROM_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.SomeValuesFromRestrictionImpl <em>Some Values From Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.SomeValuesFromRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getSomeValuesFromRestriction()
	 * @generated
	 */
	int SOME_VALUES_FROM_RESTRICTION = 17;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL Some Values From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Some Values From Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_VALUES_FROM_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.CardinalityRestrictionImpl <em>Cardinality Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.CardinalityRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getCardinalityRestriction()
	 * @generated
	 */
	int CARDINALITY_RESTRICTION = 18;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION__OWL_CARDINALITY = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.MaxCardinalityRestrictionImpl <em>Max Cardinality Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.MaxCardinalityRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getMaxCardinalityRestriction()
	 * @generated
	 */
	int MAX_CARDINALITY_RESTRICTION = 19;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL Max Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Cardinality Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_CARDINALITY_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.MinCardinalityRestrictionImpl <em>Min Cardinality Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.MinCardinalityRestrictionImpl
	 * @see owl.impl.OwlPackageImpl#getMinCardinalityRestriction()
	 * @generated
	 */
	int MIN_CARDINALITY_RESTRICTION = 20;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__LOCAL_NAME = OWL_RESTRICTION__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__URI = OWL_RESTRICTION__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__SUBJECT_STATEMENT = OWL_RESTRICTION__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OBJECT_STATEMENT = OWL_RESTRICTION__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_IS_DEFINED_BY = OWL_RESTRICTION__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDF_VALUE = OWL_RESTRICTION__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_SEE_ALSO = OWL_RESTRICTION__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDF_TYPE = OWL_RESTRICTION__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_MEMBER = OWL_RESTRICTION__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__PREDICATE_STATEMENT = OWL_RESTRICTION__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_COMMENT = OWL_RESTRICTION__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_LABEL = OWL_RESTRICTION__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__NAMESPACE = OWL_RESTRICTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__REF_BY_AVF_RESTRICTION = OWL_RESTRICTION__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__REF_BY_SVF_RESTRICTION = OWL_RESTRICTION__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RDFS_SUB_CLASS_OF = OWL_RESTRICTION__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__SUB_CLASS = OWL_RESTRICTION__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OWNED_PROPERTY = OWL_RESTRICTION__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__RANGED_BY_PROPERTY = OWL_RESTRICTION__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__INSTANCE = OWL_RESTRICTION__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__DEPRECATED = OWL_RESTRICTION__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__INV_OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OWL_EQUIVALENT_CLASS = OWL_RESTRICTION__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OWL_DISJOINT_WITH = OWL_RESTRICTION__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__INV_OWL_DISJOINT_WITH = OWL_RESTRICTION__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__REF_BY_INTERSECTION_CLASS = OWL_RESTRICTION__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__REF_BY_UNION_CLASS = OWL_RESTRICTION__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__INV_OWL_COMPLEMENT_OF = OWL_RESTRICTION__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL On Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OWL_ON_PROPERTY = OWL_RESTRICTION__OWL_ON_PROPERTY;

	/**
	 * The feature id for the '<em><b>OWL Min Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY = OWL_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Cardinality Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_CARDINALITY_RESTRICTION_FEATURE_COUNT = OWL_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.ComplementClassImpl <em>Complement Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.ComplementClassImpl
	 * @see owl.impl.OwlPackageImpl#getComplementClass()
	 * @generated
	 */
	int COMPLEMENT_CLASS = 21;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__LOCAL_NAME = OWL_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__URI = OWL_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__SUBJECT_STATEMENT = OWL_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__OBJECT_STATEMENT = OWL_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_IS_DEFINED_BY = OWL_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDF_VALUE = OWL_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_SEE_ALSO = OWL_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDF_TYPE = OWL_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_MEMBER = OWL_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__PREDICATE_STATEMENT = OWL_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_COMMENT = OWL_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_LABEL = OWL_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__NAMESPACE = OWL_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__REF_BY_AVF_RESTRICTION = OWL_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__REF_BY_SVF_RESTRICTION = OWL_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RDFS_SUB_CLASS_OF = OWL_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__SUB_CLASS = OWL_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__OWNED_PROPERTY = OWL_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__RANGED_BY_PROPERTY = OWL_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__INSTANCE = OWL_CLASS__INSTANCE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__DEPRECATED = OWL_CLASS__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__INV_OWL_EQUIVALENT_CLASS = OWL_CLASS__INV_OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__OWL_EQUIVALENT_CLASS = OWL_CLASS__OWL_EQUIVALENT_CLASS;

	/**
	 * The feature id for the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__OWL_DISJOINT_WITH = OWL_CLASS__OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__INV_OWL_DISJOINT_WITH = OWL_CLASS__INV_OWL_DISJOINT_WITH;

	/**
	 * The feature id for the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__REF_BY_INTERSECTION_CLASS = OWL_CLASS__REF_BY_INTERSECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Ref By Union Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__REF_BY_UNION_CLASS = OWL_CLASS__REF_BY_UNION_CLASS;

	/**
	 * The feature id for the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__INV_OWL_COMPLEMENT_OF = OWL_CLASS__INV_OWL_COMPLEMENT_OF;

	/**
	 * The feature id for the '<em><b>OWL Complement Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS__OWL_COMPLEMENT_OF = OWL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complement Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_CLASS_FEATURE_COUNT = OWL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link owl.impl.OWLDatatypePropertyImpl <em>OWL Datatype Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owl.impl.OWLDatatypePropertyImpl
	 * @see owl.impl.OwlPackageImpl#getOWLDatatypeProperty()
	 * @generated
	 */
	int OWL_DATATYPE_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__LOCAL_NAME = PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__URI = PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__SUBJECT_STATEMENT = PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__OBJECT_STATEMENT = PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_IS_DEFINED_BY = PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDF_VALUE = PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_SEE_ALSO = PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDF_TYPE = PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_MEMBER = PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__PREDICATE_STATEMENT = PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_COMMENT = PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_LABEL = PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__NAMESPACE = PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__REF_BY_RESTRICTION = PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_SUB_PROPERTY_OF = PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__SUB_PROPERTY = PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_DOMAIN = PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__RDFS_RANGE = PROPERTY__RDFS_RANGE;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__DEPRECATED = PROPERTY__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__FUNCTIONAL = PROPERTY__FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__OWL_EQUIVALENT_PROPERTY = PROPERTY__OWL_EQUIVALENT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Inv OWL Equivalent Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY__INV_OWL_EQUIVALENT_PROPERTY = PROPERTY__INV_OWL_EQUIVALENT_PROPERTY;

	/**
	 * The number of structural features of the '<em>OWL Datatype Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWL_DATATYPE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link owl.OWLOntology <em>OWL Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Ontology</em>'.
	 * @see owl.OWLOntology
	 * @generated
	 */
	EClass getOWLOntology();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLOntology#getOWLBackwardCompatibleWith <em>OWL Backward Compatible With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Backward Compatible With</em>'.
	 * @see owl.OWLOntology#getOWLBackwardCompatibleWith()
	 * @see #getOWLOntology()
	 * @generated
	 */
	EReference getOWLOntology_OWLBackwardCompatibleWith();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLOntology#getOWLImports <em>OWL Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Imports</em>'.
	 * @see owl.OWLOntology#getOWLImports()
	 * @see #getOWLOntology()
	 * @generated
	 */
	EReference getOWLOntology_OWLImports();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLOntology#getOWLIncompatibleWith <em>OWL Incompatible With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Incompatible With</em>'.
	 * @see owl.OWLOntology#getOWLIncompatibleWith()
	 * @see #getOWLOntology()
	 * @generated
	 */
	EReference getOWLOntology_OWLIncompatibleWith();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLOntology#getOWLPriorVersion <em>OWL Prior Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Prior Version</em>'.
	 * @see owl.OWLOntology#getOWLPriorVersion()
	 * @see #getOWLOntology()
	 * @generated
	 */
	EReference getOWLOntology_OWLPriorVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link owl.OWLOntology#getOWLVersionInfo <em>OWL Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OWL Version Info</em>'.
	 * @see owl.OWLOntology#getOWLVersionInfo()
	 * @see #getOWLOntology()
	 * @generated
	 */
	EReference getOWLOntology_OWLVersionInfo();

	/**
	 * Returns the meta object for class '{@link owl.OWLOntologyProperty <em>OWL Ontology Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Ontology Property</em>'.
	 * @see owl.OWLOntologyProperty
	 * @generated
	 */
	EClass getOWLOntologyProperty();

	/**
	 * Returns the meta object for class '{@link owl.OWLClass <em>OWL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Class</em>'.
	 * @see owl.OWLClass
	 * @generated
	 */
	EClass getOWLClass();

	/**
	 * Returns the meta object for the attribute '{@link owl.OWLClass#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see owl.OWLClass#getDeprecated()
	 * @see #getOWLClass()
	 * @generated
	 */
	EAttribute getOWLClass_Deprecated();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getInvOWLEquivalentClass <em>Inv OWL Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Equivalent Class</em>'.
	 * @see owl.OWLClass#getInvOWLEquivalentClass()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_InvOWLEquivalentClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getOWLEquivalentClass <em>OWL Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Equivalent Class</em>'.
	 * @see owl.OWLClass#getOWLEquivalentClass()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_OWLEquivalentClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getOWLDisjointWith <em>OWL Disjoint With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Disjoint With</em>'.
	 * @see owl.OWLClass#getOWLDisjointWith()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_OWLDisjointWith();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getInvOWLDisjointWith <em>Inv OWL Disjoint With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Disjoint With</em>'.
	 * @see owl.OWLClass#getInvOWLDisjointWith()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_InvOWLDisjointWith();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getRefByIntersectionClass <em>Ref By Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By Intersection Class</em>'.
	 * @see owl.OWLClass#getRefByIntersectionClass()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_RefByIntersectionClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getRefByUnionClass <em>Ref By Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By Union Class</em>'.
	 * @see owl.OWLClass#getRefByUnionClass()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_RefByUnionClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLClass#getInvOWLComplementOf <em>Inv OWL Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Complement Of</em>'.
	 * @see owl.OWLClass#getInvOWLComplementOf()
	 * @see #getOWLClass()
	 * @generated
	 */
	EReference getOWLClass_InvOWLComplementOf();

	/**
	 * Returns the meta object for class '{@link owl.OWLRestriction <em>OWL Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Restriction</em>'.
	 * @see owl.OWLRestriction
	 * @generated
	 */
	EClass getOWLRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.OWLRestriction#getOWLOnProperty <em>OWL On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL On Property</em>'.
	 * @see owl.OWLRestriction#getOWLOnProperty()
	 * @see #getOWLRestriction()
	 * @generated
	 */
	EReference getOWLRestriction_OWLOnProperty();

	/**
	 * Returns the meta object for class '{@link owl.OWLObjectProperty <em>OWL Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Object Property</em>'.
	 * @see owl.OWLObjectProperty
	 * @generated
	 */
	EClass getOWLObjectProperty();

	/**
	 * Returns the meta object for the attribute '{@link owl.OWLObjectProperty#getInverseFunctional <em>Inverse Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Functional</em>'.
	 * @see owl.OWLObjectProperty#getInverseFunctional()
	 * @see #getOWLObjectProperty()
	 * @generated
	 */
	EAttribute getOWLObjectProperty_InverseFunctional();

	/**
	 * Returns the meta object for the attribute '{@link owl.OWLObjectProperty#getSymmetric <em>Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetric</em>'.
	 * @see owl.OWLObjectProperty#getSymmetric()
	 * @see #getOWLObjectProperty()
	 * @generated
	 */
	EAttribute getOWLObjectProperty_Symmetric();

	/**
	 * Returns the meta object for the attribute '{@link owl.OWLObjectProperty#getTransitive <em>Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive</em>'.
	 * @see owl.OWLObjectProperty#getTransitive()
	 * @see #getOWLObjectProperty()
	 * @generated
	 */
	EAttribute getOWLObjectProperty_Transitive();

	/**
	 * Returns the meta object for the reference '{@link owl.OWLObjectProperty#getOWLInverseOf <em>OWL Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Inverse Of</em>'.
	 * @see owl.OWLObjectProperty#getOWLInverseOf()
	 * @see #getOWLObjectProperty()
	 * @generated
	 */
	EReference getOWLObjectProperty_OWLInverseOf();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLObjectProperty#getInvOWLInverseOf <em>Inv OWL Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Inverse Of</em>'.
	 * @see owl.OWLObjectProperty#getInvOWLInverseOf()
	 * @see #getOWLObjectProperty()
	 * @generated
	 */
	EReference getOWLObjectProperty_InvOWLInverseOf();

	/**
	 * Returns the meta object for class '{@link owl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see owl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link owl.Property#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see owl.Property#getDeprecated()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Deprecated();

	/**
	 * Returns the meta object for the attribute '{@link owl.Property#getFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional</em>'.
	 * @see owl.Property#getFunctional()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Functional();

	/**
	 * Returns the meta object for the reference list '{@link owl.Property#getOWLEquivalentProperty <em>OWL Equivalent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Equivalent Property</em>'.
	 * @see owl.Property#getOWLEquivalentProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OWLEquivalentProperty();

	/**
	 * Returns the meta object for the reference list '{@link owl.Property#getInvOWLEquivalentProperty <em>Inv OWL Equivalent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Equivalent Property</em>'.
	 * @see owl.Property#getInvOWLEquivalentProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_InvOWLEquivalentProperty();

	/**
	 * Returns the meta object for class '{@link owl.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see owl.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference list '{@link owl.Individual#getOWLDifferentFrom <em>OWL Different From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Different From</em>'.
	 * @see owl.Individual#getOWLDifferentFrom()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_OWLDifferentFrom();

	/**
	 * Returns the meta object for the reference list '{@link owl.Individual#getInvOWLDifferentFrom <em>Inv OWL Different From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Different From</em>'.
	 * @see owl.Individual#getInvOWLDifferentFrom()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_InvOWLDifferentFrom();

	/**
	 * Returns the meta object for the reference list '{@link owl.Individual#getRefByOWLDistinctMembers <em>Ref By OWL Distinct Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By OWL Distinct Members</em>'.
	 * @see owl.Individual#getRefByOWLDistinctMembers()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_RefByOWLDistinctMembers();

	/**
	 * Returns the meta object for the reference list '{@link owl.Individual#getOWLSameAs <em>OWL Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Same As</em>'.
	 * @see owl.Individual#getOWLSameAs()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_OWLSameAs();

	/**
	 * Returns the meta object for the reference list '{@link owl.Individual#getInvOWLSameAs <em>Inv OWL Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inv OWL Same As</em>'.
	 * @see owl.Individual#getInvOWLSameAs()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_InvOWLSameAs();

	/**
	 * Returns the meta object for the containment reference list '{@link owl.Individual#getDatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype Slot</em>'.
	 * @see owl.Individual#getDatatypeSlot()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_DatatypeSlot();

	/**
	 * Returns the meta object for the containment reference list '{@link owl.Individual#getObjectSlot <em>Object Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Slot</em>'.
	 * @see owl.Individual#getObjectSlot()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_ObjectSlot();

	/**
	 * Returns the meta object for class '{@link owl.OWLAllDifferent <em>OWL All Different</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL All Different</em>'.
	 * @see owl.OWLAllDifferent
	 * @generated
	 */
	EClass getOWLAllDifferent();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLAllDifferent#getOWLDistinctMembers <em>OWL Distinct Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Distinct Members</em>'.
	 * @see owl.OWLAllDifferent#getOWLDistinctMembers()
	 * @see #getOWLAllDifferent()
	 * @generated
	 */
	EReference getOWLAllDifferent_OWLDistinctMembers();

	/**
	 * Returns the meta object for class '{@link owl.OWLDataRange <em>OWL Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Data Range</em>'.
	 * @see owl.OWLDataRange
	 * @generated
	 */
	EClass getOWLDataRange();

	/**
	 * Returns the meta object for the reference list '{@link owl.OWLDataRange#getOWLOneOf <em>OWL One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL One Of</em>'.
	 * @see owl.OWLDataRange#getOWLOneOf()
	 * @see #getOWLDataRange()
	 * @generated
	 */
	EReference getOWLDataRange_OWLOneOf();

	/**
	 * Returns the meta object for class '{@link owl.OWLAnnotationProperty <em>OWL Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Annotation Property</em>'.
	 * @see owl.OWLAnnotationProperty
	 * @generated
	 */
	EClass getOWLAnnotationProperty();

	/**
	 * Returns the meta object for class '{@link owl.DatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Slot</em>'.
	 * @see owl.DatatypeSlot
	 * @generated
	 */
	EClass getDatatypeSlot();

	/**
	 * Returns the meta object for the container reference '{@link owl.DatatypeSlot#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Individual</em>'.
	 * @see owl.DatatypeSlot#getIndividual()
	 * @see #getDatatypeSlot()
	 * @generated
	 */
	EReference getDatatypeSlot_Individual();

	/**
	 * Returns the meta object for the containment reference list '{@link owl.DatatypeSlot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see owl.DatatypeSlot#getContent()
	 * @see #getDatatypeSlot()
	 * @generated
	 */
	EReference getDatatypeSlot_Content();

	/**
	 * Returns the meta object for the reference '{@link owl.DatatypeSlot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see owl.DatatypeSlot#getProperty()
	 * @see #getDatatypeSlot()
	 * @generated
	 */
	EReference getDatatypeSlot_Property();

	/**
	 * Returns the meta object for class '{@link owl.ObjectSlot <em>Object Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Slot</em>'.
	 * @see owl.ObjectSlot
	 * @generated
	 */
	EClass getObjectSlot();

	/**
	 * Returns the meta object for the container reference '{@link owl.ObjectSlot#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Individual</em>'.
	 * @see owl.ObjectSlot#getIndividual()
	 * @see #getObjectSlot()
	 * @generated
	 */
	EReference getObjectSlot_Individual();

	/**
	 * Returns the meta object for the reference list '{@link owl.ObjectSlot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content</em>'.
	 * @see owl.ObjectSlot#getContent()
	 * @see #getObjectSlot()
	 * @generated
	 */
	EReference getObjectSlot_Content();

	/**
	 * Returns the meta object for the reference '{@link owl.ObjectSlot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see owl.ObjectSlot#getProperty()
	 * @see #getObjectSlot()
	 * @generated
	 */
	EReference getObjectSlot_Property();

	/**
	 * Returns the meta object for class '{@link owl.EnumeratedClass <em>Enumerated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Class</em>'.
	 * @see owl.EnumeratedClass
	 * @generated
	 */
	EClass getEnumeratedClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.EnumeratedClass#getOWLOneOf <em>OWL One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL One Of</em>'.
	 * @see owl.EnumeratedClass#getOWLOneOf()
	 * @see #getEnumeratedClass()
	 * @generated
	 */
	EReference getEnumeratedClass_OWLOneOf();

	/**
	 * Returns the meta object for class '{@link owl.IntersectionClass <em>Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection Class</em>'.
	 * @see owl.IntersectionClass
	 * @generated
	 */
	EClass getIntersectionClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.IntersectionClass#getOWLIntersectionOf <em>OWL Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Intersection Of</em>'.
	 * @see owl.IntersectionClass#getOWLIntersectionOf()
	 * @see #getIntersectionClass()
	 * @generated
	 */
	EReference getIntersectionClass_OWLIntersectionOf();

	/**
	 * Returns the meta object for class '{@link owl.UnionClass <em>Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Class</em>'.
	 * @see owl.UnionClass
	 * @generated
	 */
	EClass getUnionClass();

	/**
	 * Returns the meta object for the reference list '{@link owl.UnionClass#getOWLUnionOf <em>OWL Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OWL Union Of</em>'.
	 * @see owl.UnionClass#getOWLUnionOf()
	 * @see #getUnionClass()
	 * @generated
	 */
	EReference getUnionClass_OWLUnionOf();

	/**
	 * Returns the meta object for class '{@link owl.HasValueRestriction <em>Has Value Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Value Restriction</em>'.
	 * @see owl.HasValueRestriction
	 * @generated
	 */
	EClass getHasValueRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.HasValueRestriction#getOWLHasValue <em>OWL Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Has Value</em>'.
	 * @see owl.HasValueRestriction#getOWLHasValue()
	 * @see #getHasValueRestriction()
	 * @generated
	 */
	EReference getHasValueRestriction_OWLHasValue();

	/**
	 * Returns the meta object for class '{@link owl.AllValuesFromRestriction <em>All Values From Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Values From Restriction</em>'.
	 * @see owl.AllValuesFromRestriction
	 * @generated
	 */
	EClass getAllValuesFromRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.AllValuesFromRestriction#getOWLAllValuesFrom <em>OWL All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL All Values From</em>'.
	 * @see owl.AllValuesFromRestriction#getOWLAllValuesFrom()
	 * @see #getAllValuesFromRestriction()
	 * @generated
	 */
	EReference getAllValuesFromRestriction_OWLAllValuesFrom();

	/**
	 * Returns the meta object for class '{@link owl.SomeValuesFromRestriction <em>Some Values From Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Values From Restriction</em>'.
	 * @see owl.SomeValuesFromRestriction
	 * @generated
	 */
	EClass getSomeValuesFromRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.SomeValuesFromRestriction#getOWLSomeValuesFrom <em>OWL Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Some Values From</em>'.
	 * @see owl.SomeValuesFromRestriction#getOWLSomeValuesFrom()
	 * @see #getSomeValuesFromRestriction()
	 * @generated
	 */
	EReference getSomeValuesFromRestriction_OWLSomeValuesFrom();

	/**
	 * Returns the meta object for class '{@link owl.CardinalityRestriction <em>Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Restriction</em>'.
	 * @see owl.CardinalityRestriction
	 * @generated
	 */
	EClass getCardinalityRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.CardinalityRestriction#getOWLCardinality <em>OWL Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Cardinality</em>'.
	 * @see owl.CardinalityRestriction#getOWLCardinality()
	 * @see #getCardinalityRestriction()
	 * @generated
	 */
	EReference getCardinalityRestriction_OWLCardinality();

	/**
	 * Returns the meta object for class '{@link owl.MaxCardinalityRestriction <em>Max Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Cardinality Restriction</em>'.
	 * @see owl.MaxCardinalityRestriction
	 * @generated
	 */
	EClass getMaxCardinalityRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.MaxCardinalityRestriction#getOWLMaxCardinality <em>OWL Max Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Max Cardinality</em>'.
	 * @see owl.MaxCardinalityRestriction#getOWLMaxCardinality()
	 * @see #getMaxCardinalityRestriction()
	 * @generated
	 */
	EReference getMaxCardinalityRestriction_OWLMaxCardinality();

	/**
	 * Returns the meta object for class '{@link owl.MinCardinalityRestriction <em>Min Cardinality Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Cardinality Restriction</em>'.
	 * @see owl.MinCardinalityRestriction
	 * @generated
	 */
	EClass getMinCardinalityRestriction();

	/**
	 * Returns the meta object for the reference '{@link owl.MinCardinalityRestriction#getOWLMinCardinality <em>OWL Min Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Min Cardinality</em>'.
	 * @see owl.MinCardinalityRestriction#getOWLMinCardinality()
	 * @see #getMinCardinalityRestriction()
	 * @generated
	 */
	EReference getMinCardinalityRestriction_OWLMinCardinality();

	/**
	 * Returns the meta object for class '{@link owl.ComplementClass <em>Complement Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complement Class</em>'.
	 * @see owl.ComplementClass
	 * @generated
	 */
	EClass getComplementClass();

	/**
	 * Returns the meta object for the reference '{@link owl.ComplementClass#getOWLComplementOf <em>OWL Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>OWL Complement Of</em>'.
	 * @see owl.ComplementClass#getOWLComplementOf()
	 * @see #getComplementClass()
	 * @generated
	 */
	EReference getComplementClass_OWLComplementOf();

	/**
	 * Returns the meta object for class '{@link owl.OWLDatatypeProperty <em>OWL Datatype Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OWL Datatype Property</em>'.
	 * @see owl.OWLDatatypeProperty
	 * @generated
	 */
	EClass getOWLDatatypeProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OwlFactory getOwlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link owl.impl.OWLOntologyImpl <em>OWL Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLOntologyImpl
		 * @see owl.impl.OwlPackageImpl#getOWLOntology()
		 * @generated
		 */
		EClass OWL_ONTOLOGY = eINSTANCE.getOWLOntology();

		/**
		 * The meta object literal for the '<em><b>OWL Backward Compatible With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH = eINSTANCE.getOWLOntology_OWLBackwardCompatibleWith();

		/**
		 * The meta object literal for the '<em><b>OWL Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ONTOLOGY__OWL_IMPORTS = eINSTANCE.getOWLOntology_OWLImports();

		/**
		 * The meta object literal for the '<em><b>OWL Incompatible With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH = eINSTANCE.getOWLOntology_OWLIncompatibleWith();

		/**
		 * The meta object literal for the '<em><b>OWL Prior Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ONTOLOGY__OWL_PRIOR_VERSION = eINSTANCE.getOWLOntology_OWLPriorVersion();

		/**
		 * The meta object literal for the '<em><b>OWL Version Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ONTOLOGY__OWL_VERSION_INFO = eINSTANCE.getOWLOntology_OWLVersionInfo();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLOntologyPropertyImpl <em>OWL Ontology Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLOntologyPropertyImpl
		 * @see owl.impl.OwlPackageImpl#getOWLOntologyProperty()
		 * @generated
		 */
		EClass OWL_ONTOLOGY_PROPERTY = eINSTANCE.getOWLOntologyProperty();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLClassImpl <em>OWL Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLClassImpl
		 * @see owl.impl.OwlPackageImpl#getOWLClass()
		 * @generated
		 */
		EClass OWL_CLASS = eINSTANCE.getOWLClass();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWL_CLASS__DEPRECATED = eINSTANCE.getOWLClass_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Equivalent Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__INV_OWL_EQUIVALENT_CLASS = eINSTANCE.getOWLClass_InvOWLEquivalentClass();

		/**
		 * The meta object literal for the '<em><b>OWL Equivalent Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__OWL_EQUIVALENT_CLASS = eINSTANCE.getOWLClass_OWLEquivalentClass();

		/**
		 * The meta object literal for the '<em><b>OWL Disjoint With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__OWL_DISJOINT_WITH = eINSTANCE.getOWLClass_OWLDisjointWith();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Disjoint With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__INV_OWL_DISJOINT_WITH = eINSTANCE.getOWLClass_InvOWLDisjointWith();

		/**
		 * The meta object literal for the '<em><b>Ref By Intersection Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__REF_BY_INTERSECTION_CLASS = eINSTANCE.getOWLClass_RefByIntersectionClass();

		/**
		 * The meta object literal for the '<em><b>Ref By Union Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__REF_BY_UNION_CLASS = eINSTANCE.getOWLClass_RefByUnionClass();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Complement Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_CLASS__INV_OWL_COMPLEMENT_OF = eINSTANCE.getOWLClass_InvOWLComplementOf();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLRestrictionImpl <em>OWL Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getOWLRestriction()
		 * @generated
		 */
		EClass OWL_RESTRICTION = eINSTANCE.getOWLRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL On Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_RESTRICTION__OWL_ON_PROPERTY = eINSTANCE.getOWLRestriction_OWLOnProperty();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLObjectPropertyImpl <em>OWL Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLObjectPropertyImpl
		 * @see owl.impl.OwlPackageImpl#getOWLObjectProperty()
		 * @generated
		 */
		EClass OWL_OBJECT_PROPERTY = eINSTANCE.getOWLObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Inverse Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL = eINSTANCE.getOWLObjectProperty_InverseFunctional();

		/**
		 * The meta object literal for the '<em><b>Symmetric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWL_OBJECT_PROPERTY__SYMMETRIC = eINSTANCE.getOWLObjectProperty_Symmetric();

		/**
		 * The meta object literal for the '<em><b>Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWL_OBJECT_PROPERTY__TRANSITIVE = eINSTANCE.getOWLObjectProperty_Transitive();

		/**
		 * The meta object literal for the '<em><b>OWL Inverse Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_OBJECT_PROPERTY__OWL_INVERSE_OF = eINSTANCE.getOWLObjectProperty_OWLInverseOf();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Inverse Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF = eINSTANCE.getOWLObjectProperty_InvOWLInverseOf();

		/**
		 * The meta object literal for the '{@link owl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.PropertyImpl
		 * @see owl.impl.OwlPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEPRECATED = eINSTANCE.getProperty_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__FUNCTIONAL = eINSTANCE.getProperty_Functional();

		/**
		 * The meta object literal for the '<em><b>OWL Equivalent Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWL_EQUIVALENT_PROPERTY = eINSTANCE.getProperty_OWLEquivalentProperty();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Equivalent Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INV_OWL_EQUIVALENT_PROPERTY = eINSTANCE.getProperty_InvOWLEquivalentProperty();

		/**
		 * The meta object literal for the '{@link owl.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.IndividualImpl
		 * @see owl.impl.OwlPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>OWL Different From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__OWL_DIFFERENT_FROM = eINSTANCE.getIndividual_OWLDifferentFrom();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Different From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__INV_OWL_DIFFERENT_FROM = eINSTANCE.getIndividual_InvOWLDifferentFrom();

		/**
		 * The meta object literal for the '<em><b>Ref By OWL Distinct Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS = eINSTANCE.getIndividual_RefByOWLDistinctMembers();

		/**
		 * The meta object literal for the '<em><b>OWL Same As</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__OWL_SAME_AS = eINSTANCE.getIndividual_OWLSameAs();

		/**
		 * The meta object literal for the '<em><b>Inv OWL Same As</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__INV_OWL_SAME_AS = eINSTANCE.getIndividual_InvOWLSameAs();

		/**
		 * The meta object literal for the '<em><b>Datatype Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__DATATYPE_SLOT = eINSTANCE.getIndividual_DatatypeSlot();

		/**
		 * The meta object literal for the '<em><b>Object Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__OBJECT_SLOT = eINSTANCE.getIndividual_ObjectSlot();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLAllDifferentImpl <em>OWL All Different</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLAllDifferentImpl
		 * @see owl.impl.OwlPackageImpl#getOWLAllDifferent()
		 * @generated
		 */
		EClass OWL_ALL_DIFFERENT = eINSTANCE.getOWLAllDifferent();

		/**
		 * The meta object literal for the '<em><b>OWL Distinct Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS = eINSTANCE.getOWLAllDifferent_OWLDistinctMembers();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLDataRangeImpl <em>OWL Data Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLDataRangeImpl
		 * @see owl.impl.OwlPackageImpl#getOWLDataRange()
		 * @generated
		 */
		EClass OWL_DATA_RANGE = eINSTANCE.getOWLDataRange();

		/**
		 * The meta object literal for the '<em><b>OWL One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWL_DATA_RANGE__OWL_ONE_OF = eINSTANCE.getOWLDataRange_OWLOneOf();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLAnnotationPropertyImpl <em>OWL Annotation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLAnnotationPropertyImpl
		 * @see owl.impl.OwlPackageImpl#getOWLAnnotationProperty()
		 * @generated
		 */
		EClass OWL_ANNOTATION_PROPERTY = eINSTANCE.getOWLAnnotationProperty();

		/**
		 * The meta object literal for the '{@link owl.impl.DatatypeSlotImpl <em>Datatype Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.DatatypeSlotImpl
		 * @see owl.impl.OwlPackageImpl#getDatatypeSlot()
		 * @generated
		 */
		EClass DATATYPE_SLOT = eINSTANCE.getDatatypeSlot();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_SLOT__INDIVIDUAL = eINSTANCE.getDatatypeSlot_Individual();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_SLOT__CONTENT = eINSTANCE.getDatatypeSlot_Content();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_SLOT__PROPERTY = eINSTANCE.getDatatypeSlot_Property();

		/**
		 * The meta object literal for the '{@link owl.impl.ObjectSlotImpl <em>Object Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.ObjectSlotImpl
		 * @see owl.impl.OwlPackageImpl#getObjectSlot()
		 * @generated
		 */
		EClass OBJECT_SLOT = eINSTANCE.getObjectSlot();

		/**
		 * The meta object literal for the '<em><b>Individual</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SLOT__INDIVIDUAL = eINSTANCE.getObjectSlot_Individual();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SLOT__CONTENT = eINSTANCE.getObjectSlot_Content();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SLOT__PROPERTY = eINSTANCE.getObjectSlot_Property();

		/**
		 * The meta object literal for the '{@link owl.impl.EnumeratedClassImpl <em>Enumerated Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.EnumeratedClassImpl
		 * @see owl.impl.OwlPackageImpl#getEnumeratedClass()
		 * @generated
		 */
		EClass ENUMERATED_CLASS = eINSTANCE.getEnumeratedClass();

		/**
		 * The meta object literal for the '<em><b>OWL One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_CLASS__OWL_ONE_OF = eINSTANCE.getEnumeratedClass_OWLOneOf();

		/**
		 * The meta object literal for the '{@link owl.impl.IntersectionClassImpl <em>Intersection Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.IntersectionClassImpl
		 * @see owl.impl.OwlPackageImpl#getIntersectionClass()
		 * @generated
		 */
		EClass INTERSECTION_CLASS = eINSTANCE.getIntersectionClass();

		/**
		 * The meta object literal for the '<em><b>OWL Intersection Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION_CLASS__OWL_INTERSECTION_OF = eINSTANCE.getIntersectionClass_OWLIntersectionOf();

		/**
		 * The meta object literal for the '{@link owl.impl.UnionClassImpl <em>Union Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.UnionClassImpl
		 * @see owl.impl.OwlPackageImpl#getUnionClass()
		 * @generated
		 */
		EClass UNION_CLASS = eINSTANCE.getUnionClass();

		/**
		 * The meta object literal for the '<em><b>OWL Union Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_CLASS__OWL_UNION_OF = eINSTANCE.getUnionClass_OWLUnionOf();

		/**
		 * The meta object literal for the '{@link owl.impl.HasValueRestrictionImpl <em>Has Value Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.HasValueRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getHasValueRestriction()
		 * @generated
		 */
		EClass HAS_VALUE_RESTRICTION = eINSTANCE.getHasValueRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL Has Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_VALUE_RESTRICTION__OWL_HAS_VALUE = eINSTANCE.getHasValueRestriction_OWLHasValue();

		/**
		 * The meta object literal for the '{@link owl.impl.AllValuesFromRestrictionImpl <em>All Values From Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.AllValuesFromRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getAllValuesFromRestriction()
		 * @generated
		 */
		EClass ALL_VALUES_FROM_RESTRICTION = eINSTANCE.getAllValuesFromRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL All Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM = eINSTANCE.getAllValuesFromRestriction_OWLAllValuesFrom();

		/**
		 * The meta object literal for the '{@link owl.impl.SomeValuesFromRestrictionImpl <em>Some Values From Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.SomeValuesFromRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getSomeValuesFromRestriction()
		 * @generated
		 */
		EClass SOME_VALUES_FROM_RESTRICTION = eINSTANCE.getSomeValuesFromRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL Some Values From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM = eINSTANCE.getSomeValuesFromRestriction_OWLSomeValuesFrom();

		/**
		 * The meta object literal for the '{@link owl.impl.CardinalityRestrictionImpl <em>Cardinality Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.CardinalityRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getCardinalityRestriction()
		 * @generated
		 */
		EClass CARDINALITY_RESTRICTION = eINSTANCE.getCardinalityRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY_RESTRICTION__OWL_CARDINALITY = eINSTANCE.getCardinalityRestriction_OWLCardinality();

		/**
		 * The meta object literal for the '{@link owl.impl.MaxCardinalityRestrictionImpl <em>Max Cardinality Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.MaxCardinalityRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getMaxCardinalityRestriction()
		 * @generated
		 */
		EClass MAX_CARDINALITY_RESTRICTION = eINSTANCE.getMaxCardinalityRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL Max Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY = eINSTANCE.getMaxCardinalityRestriction_OWLMaxCardinality();

		/**
		 * The meta object literal for the '{@link owl.impl.MinCardinalityRestrictionImpl <em>Min Cardinality Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.MinCardinalityRestrictionImpl
		 * @see owl.impl.OwlPackageImpl#getMinCardinalityRestriction()
		 * @generated
		 */
		EClass MIN_CARDINALITY_RESTRICTION = eINSTANCE.getMinCardinalityRestriction();

		/**
		 * The meta object literal for the '<em><b>OWL Min Cardinality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY = eINSTANCE.getMinCardinalityRestriction_OWLMinCardinality();

		/**
		 * The meta object literal for the '{@link owl.impl.ComplementClassImpl <em>Complement Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.ComplementClassImpl
		 * @see owl.impl.OwlPackageImpl#getComplementClass()
		 * @generated
		 */
		EClass COMPLEMENT_CLASS = eINSTANCE.getComplementClass();

		/**
		 * The meta object literal for the '<em><b>OWL Complement Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENT_CLASS__OWL_COMPLEMENT_OF = eINSTANCE.getComplementClass_OWLComplementOf();

		/**
		 * The meta object literal for the '{@link owl.impl.OWLDatatypePropertyImpl <em>OWL Datatype Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owl.impl.OWLDatatypePropertyImpl
		 * @see owl.impl.OwlPackageImpl#getOWLDatatypeProperty()
		 * @generated
		 */
		EClass OWL_DATATYPE_PROPERTY = eINSTANCE.getOWLDatatypeProperty();

	}

} //OwlPackage
