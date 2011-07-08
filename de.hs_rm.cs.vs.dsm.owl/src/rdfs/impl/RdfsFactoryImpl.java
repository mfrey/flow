/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rdfs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfsFactoryImpl extends EFactoryImpl implements RdfsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdfsFactory init() {
		try {
			RdfsFactory theRdfsFactory = (RdfsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/rdfs.ecore"); 
			if (theRdfsFactory != null) {
				return theRdfsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdfsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsFactoryImpl() {
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
			case RdfsPackage.RDFS_RESOURCE: return createRDFSResource();
			case RdfsPackage.RDFS_CLASS: return createRDFSClass();
			case RdfsPackage.RDFS_LITERAL: return createRDFSLiteral();
			case RdfsPackage.RDFS_DATATYPE: return createRDFSDatatype();
			case RdfsPackage.RDFXML_LITERAL: return createRDFXMLLiteral();
			case RdfsPackage.RDF_PROPERTY: return createRDFProperty();
			case RdfsPackage.RDF_LIST: return createRDFList();
			case RdfsPackage.RDFS_CONTAINER: return createRDFSContainer();
			case RdfsPackage.RDF_ALT: return createRDFAlt();
			case RdfsPackage.RDF_BAG: return createRDFBag();
			case RdfsPackage.RDF_SEQ: return createRDFSeq();
			case RdfsPackage.RDFS_CONTAINER_MEMBERSHIP_PROPERTY: return createRDFSContainerMembershipProperty();
			case RdfsPackage.RDF_STATEMENT: return createRDFStatement();
			case RdfsPackage.ONTOLOGY: return createOntology();
			case RdfsPackage.PLAIN_LITERAL: return createPlainLiteral();
			case RdfsPackage.TYPED_LITERAL: return createTypedLiteral();
			case RdfsPackage.NAMESPACE: return createNamespace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource createRDFSResource() {
		RDFSResourceImpl rdfsResource = new RDFSResourceImpl();
		return rdfsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClass createRDFSClass() {
		RDFSClassImpl rdfsClass = new RDFSClassImpl();
		return rdfsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral createRDFSLiteral() {
		RDFSLiteralImpl rdfsLiteral = new RDFSLiteralImpl();
		return rdfsLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSDatatype createRDFSDatatype() {
		RDFSDatatypeImpl rdfsDatatype = new RDFSDatatypeImpl();
		return rdfsDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFXMLLiteral createRDFXMLLiteral() {
		RDFXMLLiteralImpl rdfxmlLiteral = new RDFXMLLiteralImpl();
		return rdfxmlLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty createRDFProperty() {
		RDFPropertyImpl rdfProperty = new RDFPropertyImpl();
		return rdfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFList createRDFList() {
		RDFListImpl rdfList = new RDFListImpl();
		return rdfList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSContainer createRDFSContainer() {
		RDFSContainerImpl rdfsContainer = new RDFSContainerImpl();
		return rdfsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFAlt createRDFAlt() {
		RDFAltImpl rdfAlt = new RDFAltImpl();
		return rdfAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFBag createRDFBag() {
		RDFBagImpl rdfBag = new RDFBagImpl();
		return rdfBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSeq createRDFSeq() {
		RDFSeqImpl rdfSeq = new RDFSeqImpl();
		return rdfSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSContainerMembershipProperty createRDFSContainerMembershipProperty() {
		RDFSContainerMembershipPropertyImpl rdfsContainerMembershipProperty = new RDFSContainerMembershipPropertyImpl();
		return rdfsContainerMembershipProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFStatement createRDFStatement() {
		RDFStatementImpl rdfStatement = new RDFStatementImpl();
		return rdfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral createPlainLiteral() {
		PlainLiteralImpl plainLiteral = new PlainLiteralImpl();
		return plainLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedLiteral createTypedLiteral() {
		TypedLiteralImpl typedLiteral = new TypedLiteralImpl();
		return typedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsPackage getRdfsPackage() {
		return (RdfsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdfsPackage getPackage() {
		return RdfsPackage.eINSTANCE;
	}

} //RdfsFactoryImpl
