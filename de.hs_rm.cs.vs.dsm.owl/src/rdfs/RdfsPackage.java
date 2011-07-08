/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see rdfs.RdfsFactory
 * @model kind="package"
 * @generated
 */
public interface RdfsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/rdfs.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.eodm.rdfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfsPackage eINSTANCE = rdfs.impl.RdfsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSResourceImpl <em>RDFS Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSResourceImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSResource()
	 * @generated
	 */
	int RDFS_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__LOCAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__URI = 1;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__SUBJECT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__OBJECT_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDFS_IS_DEFINED_BY = 4;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDF_VALUE = 5;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDFS_SEE_ALSO = 6;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDF_TYPE = 7;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDFS_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__PREDICATE_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDFS_COMMENT = 10;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__RDFS_LABEL = 11;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE__NAMESPACE = 12;

	/**
	 * The number of structural features of the '<em>RDFS Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_RESOURCE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSClassImpl <em>RDFS Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSClassImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSClass()
	 * @generated
	 */
	int RDFS_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__REF_BY_AVF_RESTRICTION = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__REF_BY_SVF_RESTRICTION = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RDFS_SUB_CLASS_OF = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__SUB_CLASS = RDFS_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__OWNED_PROPERTY = RDFS_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__RANGED_BY_PROPERTY = RDFS_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS__INSTANCE = RDFS_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>RDFS Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CLASS_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSLiteralImpl <em>RDFS Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSLiteralImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSLiteral()
	 * @generated
	 */
	int RDFS_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Datatype Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__DATATYPE_SLOT = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL__LEXICAL_FORM = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RDFS Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_LITERAL_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSDatatypeImpl <em>RDFS Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSDatatypeImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSDatatype()
	 * @generated
	 */
	int RDFS_DATATYPE = 3;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__LOCAL_NAME = RDFS_CLASS__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__URI = RDFS_CLASS__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__SUBJECT_STATEMENT = RDFS_CLASS__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__OBJECT_STATEMENT = RDFS_CLASS__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_IS_DEFINED_BY = RDFS_CLASS__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDF_VALUE = RDFS_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_SEE_ALSO = RDFS_CLASS__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDF_TYPE = RDFS_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_MEMBER = RDFS_CLASS__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__PREDICATE_STATEMENT = RDFS_CLASS__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_COMMENT = RDFS_CLASS__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_LABEL = RDFS_CLASS__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__NAMESPACE = RDFS_CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__REF_BY_AVF_RESTRICTION = RDFS_CLASS__REF_BY_AVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__REF_BY_SVF_RESTRICTION = RDFS_CLASS__REF_BY_SVF_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RDFS_SUB_CLASS_OF = RDFS_CLASS__RDFS_SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Sub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__SUB_CLASS = RDFS_CLASS__SUB_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__OWNED_PROPERTY = RDFS_CLASS__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Ranged By Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__RANGED_BY_PROPERTY = RDFS_CLASS__RANGED_BY_PROPERTY;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE__INSTANCE = RDFS_CLASS__INSTANCE;

	/**
	 * The number of structural features of the '<em>RDFS Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_DATATYPE_FEATURE_COUNT = RDFS_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.TypedLiteralImpl
	 * @see rdfs.impl.RdfsPackageImpl#getTypedLiteral()
	 * @generated
	 */
	int TYPED_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__LOCAL_NAME = RDFS_LITERAL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__URI = RDFS_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__SUBJECT_STATEMENT = RDFS_LITERAL__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__OBJECT_STATEMENT = RDFS_LITERAL__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDFS_IS_DEFINED_BY = RDFS_LITERAL__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDF_VALUE = RDFS_LITERAL__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDFS_SEE_ALSO = RDFS_LITERAL__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDF_TYPE = RDFS_LITERAL__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDFS_MEMBER = RDFS_LITERAL__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__PREDICATE_STATEMENT = RDFS_LITERAL__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDFS_COMMENT = RDFS_LITERAL__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__RDFS_LABEL = RDFS_LITERAL__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__NAMESPACE = RDFS_LITERAL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Datatype Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__DATATYPE_SLOT = RDFS_LITERAL__DATATYPE_SLOT;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__LEXICAL_FORM = RDFS_LITERAL__LEXICAL_FORM;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL__DATATYPE = RDFS_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_LITERAL_FEATURE_COUNT = RDFS_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFXMLLiteralImpl <em>RDFXML Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFXMLLiteralImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFXMLLiteral()
	 * @generated
	 */
	int RDFXML_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__LOCAL_NAME = TYPED_LITERAL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__URI = TYPED_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__SUBJECT_STATEMENT = TYPED_LITERAL__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__OBJECT_STATEMENT = TYPED_LITERAL__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDFS_IS_DEFINED_BY = TYPED_LITERAL__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDF_VALUE = TYPED_LITERAL__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDFS_SEE_ALSO = TYPED_LITERAL__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDF_TYPE = TYPED_LITERAL__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDFS_MEMBER = TYPED_LITERAL__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__PREDICATE_STATEMENT = TYPED_LITERAL__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDFS_COMMENT = TYPED_LITERAL__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__RDFS_LABEL = TYPED_LITERAL__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__NAMESPACE = TYPED_LITERAL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Datatype Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__DATATYPE_SLOT = TYPED_LITERAL__DATATYPE_SLOT;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__LEXICAL_FORM = TYPED_LITERAL__LEXICAL_FORM;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__DATATYPE = TYPED_LITERAL__DATATYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL__LANGUAGE = TYPED_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RDFXML Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFXML_LITERAL_FEATURE_COUNT = TYPED_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFPropertyImpl <em>RDF Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFPropertyImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFProperty()
	 * @generated
	 */
	int RDF_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__REF_BY_RESTRICTION = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_SUB_PROPERTY_OF = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__SUB_PROPERTY = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_DOMAIN = RDFS_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY__RDFS_RANGE = RDFS_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RDF Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_PROPERTY_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFListImpl <em>RDF List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFListImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFList()
	 * @generated
	 */
	int RDF_LIST = 6;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>RDF Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_REST = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RDF First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST__RDF_FIRST = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RDF List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LIST_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSContainerImpl <em>RDFS Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSContainerImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSContainer()
	 * @generated
	 */
	int RDFS_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The number of structural features of the '<em>RDFS Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFAltImpl <em>RDF Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFAltImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFAlt()
	 * @generated
	 */
	int RDF_ALT = 8;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__LOCAL_NAME = RDFS_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__URI = RDFS_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__SUBJECT_STATEMENT = RDFS_CONTAINER__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__OBJECT_STATEMENT = RDFS_CONTAINER__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDFS_IS_DEFINED_BY = RDFS_CONTAINER__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDF_VALUE = RDFS_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDFS_SEE_ALSO = RDFS_CONTAINER__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDF_TYPE = RDFS_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDFS_MEMBER = RDFS_CONTAINER__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__PREDICATE_STATEMENT = RDFS_CONTAINER__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDFS_COMMENT = RDFS_CONTAINER__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__RDFS_LABEL = RDFS_CONTAINER__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT__NAMESPACE = RDFS_CONTAINER__NAMESPACE;

	/**
	 * The number of structural features of the '<em>RDF Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_ALT_FEATURE_COUNT = RDFS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFBagImpl <em>RDF Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFBagImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFBag()
	 * @generated
	 */
	int RDF_BAG = 9;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__LOCAL_NAME = RDFS_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__URI = RDFS_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__SUBJECT_STATEMENT = RDFS_CONTAINER__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__OBJECT_STATEMENT = RDFS_CONTAINER__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDFS_IS_DEFINED_BY = RDFS_CONTAINER__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDF_VALUE = RDFS_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDFS_SEE_ALSO = RDFS_CONTAINER__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDF_TYPE = RDFS_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDFS_MEMBER = RDFS_CONTAINER__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__PREDICATE_STATEMENT = RDFS_CONTAINER__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDFS_COMMENT = RDFS_CONTAINER__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__RDFS_LABEL = RDFS_CONTAINER__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG__NAMESPACE = RDFS_CONTAINER__NAMESPACE;

	/**
	 * The number of structural features of the '<em>RDF Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_BAG_FEATURE_COUNT = RDFS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSeqImpl <em>RDF Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSeqImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSeq()
	 * @generated
	 */
	int RDF_SEQ = 10;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__LOCAL_NAME = RDFS_CONTAINER__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__URI = RDFS_CONTAINER__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__SUBJECT_STATEMENT = RDFS_CONTAINER__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__OBJECT_STATEMENT = RDFS_CONTAINER__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDFS_IS_DEFINED_BY = RDFS_CONTAINER__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDF_VALUE = RDFS_CONTAINER__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDFS_SEE_ALSO = RDFS_CONTAINER__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDF_TYPE = RDFS_CONTAINER__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDFS_MEMBER = RDFS_CONTAINER__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__PREDICATE_STATEMENT = RDFS_CONTAINER__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDFS_COMMENT = RDFS_CONTAINER__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__RDFS_LABEL = RDFS_CONTAINER__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ__NAMESPACE = RDFS_CONTAINER__NAMESPACE;

	/**
	 * The number of structural features of the '<em>RDF Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_SEQ_FEATURE_COUNT = RDFS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFSContainerMembershipPropertyImpl <em>RDFS Container Membership Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFSContainerMembershipPropertyImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFSContainerMembershipProperty()
	 * @generated
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__LOCAL_NAME = RDF_PROPERTY__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__URI = RDF_PROPERTY__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__SUBJECT_STATEMENT = RDF_PROPERTY__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__OBJECT_STATEMENT = RDF_PROPERTY__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_IS_DEFINED_BY = RDF_PROPERTY__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDF_VALUE = RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_SEE_ALSO = RDF_PROPERTY__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDF_TYPE = RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_MEMBER = RDF_PROPERTY__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__PREDICATE_STATEMENT = RDF_PROPERTY__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_COMMENT = RDF_PROPERTY__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_LABEL = RDF_PROPERTY__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__NAMESPACE = RDF_PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Ref By Restriction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__REF_BY_RESTRICTION = RDF_PROPERTY__REF_BY_RESTRICTION;

	/**
	 * The feature id for the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_SUB_PROPERTY_OF = RDF_PROPERTY__RDFS_SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__SUB_PROPERTY = RDF_PROPERTY__SUB_PROPERTY;

	/**
	 * The feature id for the '<em><b>RDFS Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_DOMAIN = RDF_PROPERTY__RDFS_DOMAIN;

	/**
	 * The feature id for the '<em><b>RDFS Range</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY__RDFS_RANGE = RDF_PROPERTY__RDFS_RANGE;

	/**
	 * The number of structural features of the '<em>RDFS Container Membership Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDFS_CONTAINER_MEMBERSHIP_PROPERTY_FEATURE_COUNT = RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rdfs.impl.RDFStatementImpl <em>RDF Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.RDFStatementImpl
	 * @see rdfs.impl.RdfsPackageImpl#getRDFStatement()
	 * @generated
	 */
	int RDF_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>RDF Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_SUBJECT = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RDF Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_OBJECT = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RDF Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT__RDF_PREDICATE = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDF Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_STATEMENT_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rdfs.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.OntologyImpl
	 * @see rdfs.impl.RdfsPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 13;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__LOCAL_NAME = RDFS_RESOURCE__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__URI = RDFS_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__SUBJECT_STATEMENT = RDFS_RESOURCE__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__OBJECT_STATEMENT = RDFS_RESOURCE__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDFS_IS_DEFINED_BY = RDFS_RESOURCE__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_VALUE = RDFS_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDFS_SEE_ALSO = RDFS_RESOURCE__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDF_TYPE = RDFS_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDFS_MEMBER = RDFS_RESOURCE__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__PREDICATE_STATEMENT = RDFS_RESOURCE__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDFS_COMMENT = RDFS_RESOURCE__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RDFS_LABEL = RDFS_RESOURCE__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAMESPACE = RDFS_RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CONTAINS = RDFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Namespace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__OWNED_NAMESPACE = RDFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = RDFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rdfs.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.PlainLiteralImpl
	 * @see rdfs.impl.RdfsPackageImpl#getPlainLiteral()
	 * @generated
	 */
	int PLAIN_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__LOCAL_NAME = RDFS_LITERAL__LOCAL_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__URI = RDFS_LITERAL__URI;

	/**
	 * The feature id for the '<em><b>Subject Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__SUBJECT_STATEMENT = RDFS_LITERAL__SUBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>Object Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__OBJECT_STATEMENT = RDFS_LITERAL__OBJECT_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDFS_IS_DEFINED_BY = RDFS_LITERAL__RDFS_IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>RDF Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDF_VALUE = RDFS_LITERAL__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>RDFS See Also</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDFS_SEE_ALSO = RDFS_LITERAL__RDFS_SEE_ALSO;

	/**
	 * The feature id for the '<em><b>RDF Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDF_TYPE = RDFS_LITERAL__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>RDFS Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDFS_MEMBER = RDFS_LITERAL__RDFS_MEMBER;

	/**
	 * The feature id for the '<em><b>Predicate Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__PREDICATE_STATEMENT = RDFS_LITERAL__PREDICATE_STATEMENT;

	/**
	 * The feature id for the '<em><b>RDFS Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDFS_COMMENT = RDFS_LITERAL__RDFS_COMMENT;

	/**
	 * The feature id for the '<em><b>RDFS Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__RDFS_LABEL = RDFS_LITERAL__RDFS_LABEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__NAMESPACE = RDFS_LITERAL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Datatype Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__DATATYPE_SLOT = RDFS_LITERAL__DATATYPE_SLOT;

	/**
	 * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__LEXICAL_FORM = RDFS_LITERAL__LEXICAL_FORM;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL__LANGUAGE = RDFS_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plain Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_FEATURE_COUNT = RDFS_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rdfs.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdfs.impl.NamespaceImpl
	 * @see rdfs.impl.RdfsPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link rdfs.RDFSResource <em>RDFS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Resource</em>'.
	 * @see rdfs.RDFSResource
	 * @generated
	 */
	EClass getRDFSResource();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.RDFSResource#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Name</em>'.
	 * @see rdfs.RDFSResource#getLocalName()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EAttribute getRDFSResource_LocalName();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.RDFSResource#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see rdfs.RDFSResource#getURI()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EAttribute getRDFSResource_URI();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getSubjectStatement <em>Subject Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subject Statement</em>'.
	 * @see rdfs.RDFSResource#getSubjectStatement()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_SubjectStatement();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getObjectStatement <em>Object Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Statement</em>'.
	 * @see rdfs.RDFSResource#getObjectStatement()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_ObjectStatement();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFSIsDefinedBy <em>RDFS Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Is Defined By</em>'.
	 * @see rdfs.RDFSResource#getRDFSIsDefinedBy()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFSIsDefinedBy();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFValue <em>RDF Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDF Value</em>'.
	 * @see rdfs.RDFSResource#getRDFValue()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFValue();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFSSeeAlso <em>RDFS See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS See Also</em>'.
	 * @see rdfs.RDFSResource#getRDFSSeeAlso()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFSSeeAlso();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFType <em>RDF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDF Type</em>'.
	 * @see rdfs.RDFSResource#getRDFType()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFType();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFSMember <em>RDFS Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Member</em>'.
	 * @see rdfs.RDFSResource#getRDFSMember()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFSMember();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getPredicateStatement <em>Predicate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicate Statement</em>'.
	 * @see rdfs.RDFSResource#getPredicateStatement()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_PredicateStatement();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFSComment <em>RDFS Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Comment</em>'.
	 * @see rdfs.RDFSResource#getRDFSComment()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFSComment();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSResource#getRDFSLabel <em>RDFS Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Label</em>'.
	 * @see rdfs.RDFSResource#getRDFSLabel()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_RDFSLabel();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFSResource#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see rdfs.RDFSResource#getNamespace()
	 * @see #getRDFSResource()
	 * @generated
	 */
	EReference getRDFSResource_Namespace();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSClass <em>RDFS Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Class</em>'.
	 * @see rdfs.RDFSClass
	 * @generated
	 */
	EClass getRDFSClass();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getRefByAVFRestriction <em>Ref By AVF Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By AVF Restriction</em>'.
	 * @see rdfs.RDFSClass#getRefByAVFRestriction()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_RefByAVFRestriction();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getRefBySVFRestriction <em>Ref By SVF Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By SVF Restriction</em>'.
	 * @see rdfs.RDFSClass#getRefBySVFRestriction()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_RefBySVFRestriction();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getRDFSSubClassOf <em>RDFS Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Sub Class Of</em>'.
	 * @see rdfs.RDFSClass#getRDFSSubClassOf()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_RDFSSubClassOf();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getSubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Class</em>'.
	 * @see rdfs.RDFSClass#getSubClass()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_SubClass();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Property</em>'.
	 * @see rdfs.RDFSClass#getOwnedProperty()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_OwnedProperty();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getRangedByProperty <em>Ranged By Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranged By Property</em>'.
	 * @see rdfs.RDFSClass#getRangedByProperty()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_RangedByProperty();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFSClass#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance</em>'.
	 * @see rdfs.RDFSClass#getInstance()
	 * @see #getRDFSClass()
	 * @generated
	 */
	EReference getRDFSClass_Instance();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSLiteral <em>RDFS Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Literal</em>'.
	 * @see rdfs.RDFSLiteral
	 * @generated
	 */
	EClass getRDFSLiteral();

	/**
	 * Returns the meta object for the container reference '{@link rdfs.RDFSLiteral#getDatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datatype Slot</em>'.
	 * @see rdfs.RDFSLiteral#getDatatypeSlot()
	 * @see #getRDFSLiteral()
	 * @generated
	 */
	EReference getRDFSLiteral_DatatypeSlot();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.RDFSLiteral#getLexicalForm <em>Lexical Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Form</em>'.
	 * @see rdfs.RDFSLiteral#getLexicalForm()
	 * @see #getRDFSLiteral()
	 * @generated
	 */
	EAttribute getRDFSLiteral_LexicalForm();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSDatatype <em>RDFS Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Datatype</em>'.
	 * @see rdfs.RDFSDatatype
	 * @generated
	 */
	EClass getRDFSDatatype();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFXMLLiteral <em>RDFXML Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFXML Literal</em>'.
	 * @see rdfs.RDFXMLLiteral
	 * @generated
	 */
	EClass getRDFXMLLiteral();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.RDFXMLLiteral#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see rdfs.RDFXMLLiteral#getLanguage()
	 * @see #getRDFXMLLiteral()
	 * @generated
	 */
	EAttribute getRDFXMLLiteral_Language();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Property</em>'.
	 * @see rdfs.RDFProperty
	 * @generated
	 */
	EClass getRDFProperty();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFProperty#getRefByRestriction <em>Ref By Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref By Restriction</em>'.
	 * @see rdfs.RDFProperty#getRefByRestriction()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_RefByRestriction();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFProperty#getRDFSSubPropertyOf <em>RDFS Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Sub Property Of</em>'.
	 * @see rdfs.RDFProperty#getRDFSSubPropertyOf()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_RDFSSubPropertyOf();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFProperty#getSubProperty <em>Sub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Property</em>'.
	 * @see rdfs.RDFProperty#getSubProperty()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_SubProperty();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFProperty#getRDFSDomain <em>RDFS Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Domain</em>'.
	 * @see rdfs.RDFProperty#getRDFSDomain()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_RDFSDomain();

	/**
	 * Returns the meta object for the reference list '{@link rdfs.RDFProperty#getRDFSRange <em>RDFS Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDFS Range</em>'.
	 * @see rdfs.RDFProperty#getRDFSRange()
	 * @see #getRDFProperty()
	 * @generated
	 */
	EReference getRDFProperty_RDFSRange();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFList <em>RDF List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF List</em>'.
	 * @see rdfs.RDFList
	 * @generated
	 */
	EClass getRDFList();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFList#getRDFRest <em>RDF Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RDF Rest</em>'.
	 * @see rdfs.RDFList#getRDFRest()
	 * @see #getRDFList()
	 * @generated
	 */
	EReference getRDFList_RDFRest();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFList#getRDFFirst <em>RDF First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RDF First</em>'.
	 * @see rdfs.RDFList#getRDFFirst()
	 * @see #getRDFList()
	 * @generated
	 */
	EReference getRDFList_RDFFirst();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSContainer <em>RDFS Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Container</em>'.
	 * @see rdfs.RDFSContainer
	 * @generated
	 */
	EClass getRDFSContainer();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFAlt <em>RDF Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Alt</em>'.
	 * @see rdfs.RDFAlt
	 * @generated
	 */
	EClass getRDFAlt();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFBag <em>RDF Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Bag</em>'.
	 * @see rdfs.RDFBag
	 * @generated
	 */
	EClass getRDFBag();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSeq <em>RDF Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Seq</em>'.
	 * @see rdfs.RDFSeq
	 * @generated
	 */
	EClass getRDFSeq();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFSContainerMembershipProperty <em>RDFS Container Membership Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDFS Container Membership Property</em>'.
	 * @see rdfs.RDFSContainerMembershipProperty
	 * @generated
	 */
	EClass getRDFSContainerMembershipProperty();

	/**
	 * Returns the meta object for class '{@link rdfs.RDFStatement <em>RDF Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Statement</em>'.
	 * @see rdfs.RDFStatement
	 * @generated
	 */
	EClass getRDFStatement();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFStatement#getRDFSubject <em>RDF Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RDF Subject</em>'.
	 * @see rdfs.RDFStatement#getRDFSubject()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_RDFSubject();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFStatement#getRDFObject <em>RDF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RDF Object</em>'.
	 * @see rdfs.RDFStatement#getRDFObject()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_RDFObject();

	/**
	 * Returns the meta object for the reference '{@link rdfs.RDFStatement#getRDFPredicate <em>RDF Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RDF Predicate</em>'.
	 * @see rdfs.RDFStatement#getRDFPredicate()
	 * @see #getRDFStatement()
	 * @generated
	 */
	EReference getRDFStatement_RDFPredicate();

	/**
	 * Returns the meta object for class '{@link rdfs.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see rdfs.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the containment reference list '{@link rdfs.Ontology#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see rdfs.Ontology#getContains()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link rdfs.Ontology#getOwnedNamespace <em>Owned Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Namespace</em>'.
	 * @see rdfs.Ontology#getOwnedNamespace()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_OwnedNamespace();

	/**
	 * Returns the meta object for class '{@link rdfs.PlainLiteral <em>Plain Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Literal</em>'.
	 * @see rdfs.PlainLiteral
	 * @generated
	 */
	EClass getPlainLiteral();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.PlainLiteral#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see rdfs.PlainLiteral#getLanguage()
	 * @see #getPlainLiteral()
	 * @generated
	 */
	EAttribute getPlainLiteral_Language();

	/**
	 * Returns the meta object for class '{@link rdfs.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Literal</em>'.
	 * @see rdfs.TypedLiteral
	 * @generated
	 */
	EClass getTypedLiteral();

	/**
	 * Returns the meta object for the reference '{@link rdfs.TypedLiteral#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see rdfs.TypedLiteral#getDatatype()
	 * @see #getTypedLiteral()
	 * @generated
	 */
	EReference getTypedLiteral_Datatype();

	/**
	 * Returns the meta object for class '{@link rdfs.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see rdfs.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.Namespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdfs.Namespace#getName()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdfs.Namespace#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see rdfs.Namespace#getURI()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_URI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdfsFactory getRdfsFactory();

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
		 * The meta object literal for the '{@link rdfs.impl.RDFSResourceImpl <em>RDFS Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSResourceImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSResource()
		 * @generated
		 */
		EClass RDFS_RESOURCE = eINSTANCE.getRDFSResource();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDFS_RESOURCE__LOCAL_NAME = eINSTANCE.getRDFSResource_LocalName();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDFS_RESOURCE__URI = eINSTANCE.getRDFSResource_URI();

		/**
		 * The meta object literal for the '<em><b>Subject Statement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__SUBJECT_STATEMENT = eINSTANCE.getRDFSResource_SubjectStatement();

		/**
		 * The meta object literal for the '<em><b>Object Statement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__OBJECT_STATEMENT = eINSTANCE.getRDFSResource_ObjectStatement();

		/**
		 * The meta object literal for the '<em><b>RDFS Is Defined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDFS_IS_DEFINED_BY = eINSTANCE.getRDFSResource_RDFSIsDefinedBy();

		/**
		 * The meta object literal for the '<em><b>RDF Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDF_VALUE = eINSTANCE.getRDFSResource_RDFValue();

		/**
		 * The meta object literal for the '<em><b>RDFS See Also</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDFS_SEE_ALSO = eINSTANCE.getRDFSResource_RDFSSeeAlso();

		/**
		 * The meta object literal for the '<em><b>RDF Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDF_TYPE = eINSTANCE.getRDFSResource_RDFType();

		/**
		 * The meta object literal for the '<em><b>RDFS Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDFS_MEMBER = eINSTANCE.getRDFSResource_RDFSMember();

		/**
		 * The meta object literal for the '<em><b>Predicate Statement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__PREDICATE_STATEMENT = eINSTANCE.getRDFSResource_PredicateStatement();

		/**
		 * The meta object literal for the '<em><b>RDFS Comment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDFS_COMMENT = eINSTANCE.getRDFSResource_RDFSComment();

		/**
		 * The meta object literal for the '<em><b>RDFS Label</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__RDFS_LABEL = eINSTANCE.getRDFSResource_RDFSLabel();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_RESOURCE__NAMESPACE = eINSTANCE.getRDFSResource_Namespace();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSClassImpl <em>RDFS Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSClassImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSClass()
		 * @generated
		 */
		EClass RDFS_CLASS = eINSTANCE.getRDFSClass();

		/**
		 * The meta object literal for the '<em><b>Ref By AVF Restriction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__REF_BY_AVF_RESTRICTION = eINSTANCE.getRDFSClass_RefByAVFRestriction();

		/**
		 * The meta object literal for the '<em><b>Ref By SVF Restriction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__REF_BY_SVF_RESTRICTION = eINSTANCE.getRDFSClass_RefBySVFRestriction();

		/**
		 * The meta object literal for the '<em><b>RDFS Sub Class Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__RDFS_SUB_CLASS_OF = eINSTANCE.getRDFSClass_RDFSSubClassOf();

		/**
		 * The meta object literal for the '<em><b>Sub Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__SUB_CLASS = eINSTANCE.getRDFSClass_SubClass();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__OWNED_PROPERTY = eINSTANCE.getRDFSClass_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Ranged By Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__RANGED_BY_PROPERTY = eINSTANCE.getRDFSClass_RangedByProperty();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_CLASS__INSTANCE = eINSTANCE.getRDFSClass_Instance();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSLiteralImpl <em>RDFS Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSLiteralImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSLiteral()
		 * @generated
		 */
		EClass RDFS_LITERAL = eINSTANCE.getRDFSLiteral();

		/**
		 * The meta object literal for the '<em><b>Datatype Slot</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDFS_LITERAL__DATATYPE_SLOT = eINSTANCE.getRDFSLiteral_DatatypeSlot();

		/**
		 * The meta object literal for the '<em><b>Lexical Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDFS_LITERAL__LEXICAL_FORM = eINSTANCE.getRDFSLiteral_LexicalForm();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSDatatypeImpl <em>RDFS Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSDatatypeImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSDatatype()
		 * @generated
		 */
		EClass RDFS_DATATYPE = eINSTANCE.getRDFSDatatype();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFXMLLiteralImpl <em>RDFXML Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFXMLLiteralImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFXMLLiteral()
		 * @generated
		 */
		EClass RDFXML_LITERAL = eINSTANCE.getRDFXMLLiteral();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDFXML_LITERAL__LANGUAGE = eINSTANCE.getRDFXMLLiteral_Language();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFPropertyImpl <em>RDF Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFPropertyImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFProperty()
		 * @generated
		 */
		EClass RDF_PROPERTY = eINSTANCE.getRDFProperty();

		/**
		 * The meta object literal for the '<em><b>Ref By Restriction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__REF_BY_RESTRICTION = eINSTANCE.getRDFProperty_RefByRestriction();

		/**
		 * The meta object literal for the '<em><b>RDFS Sub Property Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__RDFS_SUB_PROPERTY_OF = eINSTANCE.getRDFProperty_RDFSSubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Sub Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__SUB_PROPERTY = eINSTANCE.getRDFProperty_SubProperty();

		/**
		 * The meta object literal for the '<em><b>RDFS Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__RDFS_DOMAIN = eINSTANCE.getRDFProperty_RDFSDomain();

		/**
		 * The meta object literal for the '<em><b>RDFS Range</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_PROPERTY__RDFS_RANGE = eINSTANCE.getRDFProperty_RDFSRange();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFListImpl <em>RDF List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFListImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFList()
		 * @generated
		 */
		EClass RDF_LIST = eINSTANCE.getRDFList();

		/**
		 * The meta object literal for the '<em><b>RDF Rest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LIST__RDF_REST = eINSTANCE.getRDFList_RDFRest();

		/**
		 * The meta object literal for the '<em><b>RDF First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LIST__RDF_FIRST = eINSTANCE.getRDFList_RDFFirst();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSContainerImpl <em>RDFS Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSContainerImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSContainer()
		 * @generated
		 */
		EClass RDFS_CONTAINER = eINSTANCE.getRDFSContainer();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFAltImpl <em>RDF Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFAltImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFAlt()
		 * @generated
		 */
		EClass RDF_ALT = eINSTANCE.getRDFAlt();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFBagImpl <em>RDF Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFBagImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFBag()
		 * @generated
		 */
		EClass RDF_BAG = eINSTANCE.getRDFBag();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSeqImpl <em>RDF Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSeqImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSeq()
		 * @generated
		 */
		EClass RDF_SEQ = eINSTANCE.getRDFSeq();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFSContainerMembershipPropertyImpl <em>RDFS Container Membership Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFSContainerMembershipPropertyImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFSContainerMembershipProperty()
		 * @generated
		 */
		EClass RDFS_CONTAINER_MEMBERSHIP_PROPERTY = eINSTANCE.getRDFSContainerMembershipProperty();

		/**
		 * The meta object literal for the '{@link rdfs.impl.RDFStatementImpl <em>RDF Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.RDFStatementImpl
		 * @see rdfs.impl.RdfsPackageImpl#getRDFStatement()
		 * @generated
		 */
		EClass RDF_STATEMENT = eINSTANCE.getRDFStatement();

		/**
		 * The meta object literal for the '<em><b>RDF Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__RDF_SUBJECT = eINSTANCE.getRDFStatement_RDFSubject();

		/**
		 * The meta object literal for the '<em><b>RDF Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__RDF_OBJECT = eINSTANCE.getRDFStatement_RDFObject();

		/**
		 * The meta object literal for the '<em><b>RDF Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_STATEMENT__RDF_PREDICATE = eINSTANCE.getRDFStatement_RDFPredicate();

		/**
		 * The meta object literal for the '{@link rdfs.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.OntologyImpl
		 * @see rdfs.impl.RdfsPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CONTAINS = eINSTANCE.getOntology_Contains();

		/**
		 * The meta object literal for the '<em><b>Owned Namespace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__OWNED_NAMESPACE = eINSTANCE.getOntology_OwnedNamespace();

		/**
		 * The meta object literal for the '{@link rdfs.impl.PlainLiteralImpl <em>Plain Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.PlainLiteralImpl
		 * @see rdfs.impl.RdfsPackageImpl#getPlainLiteral()
		 * @generated
		 */
		EClass PLAIN_LITERAL = eINSTANCE.getPlainLiteral();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_LITERAL__LANGUAGE = eINSTANCE.getPlainLiteral_Language();

		/**
		 * The meta object literal for the '{@link rdfs.impl.TypedLiteralImpl <em>Typed Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.TypedLiteralImpl
		 * @see rdfs.impl.RdfsPackageImpl#getTypedLiteral()
		 * @generated
		 */
		EClass TYPED_LITERAL = eINSTANCE.getTypedLiteral();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_LITERAL__DATATYPE = eINSTANCE.getTypedLiteral_Datatype();

		/**
		 * The meta object literal for the '{@link rdfs.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdfs.impl.NamespaceImpl
		 * @see rdfs.impl.RdfsPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__URI = eINSTANCE.getNamespace_URI();

	}

} //RdfsPackage
