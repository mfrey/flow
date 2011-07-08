/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rdfs.RdfsPackage
 * @generated
 */
public interface RdfsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfsFactory eINSTANCE = rdfs.impl.RdfsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RDFS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Resource</em>'.
	 * @generated
	 */
	RDFSResource createRDFSResource();

	/**
	 * Returns a new object of class '<em>RDFS Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Class</em>'.
	 * @generated
	 */
	RDFSClass createRDFSClass();

	/**
	 * Returns a new object of class '<em>RDFS Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Literal</em>'.
	 * @generated
	 */
	RDFSLiteral createRDFSLiteral();

	/**
	 * Returns a new object of class '<em>RDFS Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Datatype</em>'.
	 * @generated
	 */
	RDFSDatatype createRDFSDatatype();

	/**
	 * Returns a new object of class '<em>RDFXML Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFXML Literal</em>'.
	 * @generated
	 */
	RDFXMLLiteral createRDFXMLLiteral();

	/**
	 * Returns a new object of class '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Property</em>'.
	 * @generated
	 */
	RDFProperty createRDFProperty();

	/**
	 * Returns a new object of class '<em>RDF List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF List</em>'.
	 * @generated
	 */
	RDFList createRDFList();

	/**
	 * Returns a new object of class '<em>RDFS Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Container</em>'.
	 * @generated
	 */
	RDFSContainer createRDFSContainer();

	/**
	 * Returns a new object of class '<em>RDF Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Alt</em>'.
	 * @generated
	 */
	RDFAlt createRDFAlt();

	/**
	 * Returns a new object of class '<em>RDF Bag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Bag</em>'.
	 * @generated
	 */
	RDFBag createRDFBag();

	/**
	 * Returns a new object of class '<em>RDF Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Seq</em>'.
	 * @generated
	 */
	RDFSeq createRDFSeq();

	/**
	 * Returns a new object of class '<em>RDFS Container Membership Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDFS Container Membership Property</em>'.
	 * @generated
	 */
	RDFSContainerMembershipProperty createRDFSContainerMembershipProperty();

	/**
	 * Returns a new object of class '<em>RDF Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Statement</em>'.
	 * @generated
	 */
	RDFStatement createRDFStatement();

	/**
	 * Returns a new object of class '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ontology</em>'.
	 * @generated
	 */
	Ontology createOntology();

	/**
	 * Returns a new object of class '<em>Plain Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Literal</em>'.
	 * @generated
	 */
	PlainLiteral createPlainLiteral();

	/**
	 * Returns a new object of class '<em>Typed Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Literal</em>'.
	 * @generated
	 */
	TypedLiteral createTypedLiteral();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdfsPackage getRdfsPackage();

} //RdfsFactory
