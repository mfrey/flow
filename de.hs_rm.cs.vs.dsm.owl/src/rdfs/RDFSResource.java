/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDFS Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFSResource#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getURI <em>URI</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getSubjectStatement <em>Subject Statement</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getObjectStatement <em>Object Statement</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFSIsDefinedBy <em>RDFS Is Defined By</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFValue <em>RDF Value</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFSSeeAlso <em>RDFS See Also</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFType <em>RDF Type</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFSMember <em>RDFS Member</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getPredicateStatement <em>Predicate Statement</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFSComment <em>RDFS Comment</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getRDFSLabel <em>RDFS Label</em>}</li>
 *   <li>{@link rdfs.RDFSResource#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFSResource()
 * @model
 * @generated
 */
public interface RDFSResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' attribute.
	 * @see #setLocalName(String)
	 * @see rdfs.RdfsPackage#getRDFSResource_LocalName()
	 * @model
	 * @generated
	 */
	String getLocalName();

	/**
	 * Sets the value of the '{@link rdfs.RDFSResource#getLocalName <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' attribute.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see rdfs.RdfsPackage#getRDFSResource_URI()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Returns the value of the '<em><b>Subject Statement</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFStatement}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFStatement#getRDFSubject <em>RDF Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Statement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Statement</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_SubjectStatement()
	 * @see rdfs.RDFStatement#getRDFSubject
	 * @model opposite="RDFSubject"
	 * @generated
	 */
	EList<RDFStatement> getSubjectStatement();

	/**
	 * Returns the value of the '<em><b>Object Statement</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFStatement}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFStatement#getRDFObject <em>RDF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Statement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Statement</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_ObjectStatement()
	 * @see rdfs.RDFStatement#getRDFObject
	 * @model opposite="RDFObject"
	 * @generated
	 */
	EList<RDFStatement> getObjectStatement();

	/**
	 * Returns the value of the '<em><b>RDFS Is Defined By</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Is Defined By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Is Defined By</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFSIsDefinedBy()
	 * @model
	 * @generated
	 */
	EList<RDFSResource> getRDFSIsDefinedBy();

	/**
	 * Returns the value of the '<em><b>RDF Value</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Value</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFValue()
	 * @model
	 * @generated
	 */
	EList<RDFSResource> getRDFValue();

	/**
	 * Returns the value of the '<em><b>RDFS See Also</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS See Also</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS See Also</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFSSeeAlso()
	 * @model
	 * @generated
	 */
	EList<RDFSResource> getRDFSSeeAlso();

	/**
	 * Returns the value of the '<em><b>RDF Type</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSClass}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Type</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFType()
	 * @see rdfs.RDFSClass#getInstance
	 * @model opposite="instance"
	 * @generated
	 */
	EList<RDFSClass> getRDFType();

	/**
	 * Returns the value of the '<em><b>RDFS Member</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Member</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFSMember()
	 * @model
	 * @generated
	 */
	EList<RDFSResource> getRDFSMember();

	/**
	 * Returns the value of the '<em><b>Predicate Statement</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFStatement}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFStatement#getRDFPredicate <em>RDF Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate Statement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate Statement</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_PredicateStatement()
	 * @see rdfs.RDFStatement#getRDFPredicate
	 * @model opposite="RDFPredicate"
	 * @generated
	 */
	EList<RDFStatement> getPredicateStatement();

	/**
	 * Returns the value of the '<em><b>RDFS Comment</b></em>' reference list.
	 * The list contents are of type {@link rdfs.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Comment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Comment</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFSComment()
	 * @model
	 * @generated
	 */
	EList<PlainLiteral> getRDFSComment();

	/**
	 * Returns the value of the '<em><b>RDFS Label</b></em>' reference list.
	 * The list contents are of type {@link rdfs.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Label</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Label</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSResource_RDFSLabel()
	 * @model
	 * @generated
	 */
	EList<PlainLiteral> getRDFSLabel();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see rdfs.RdfsPackage#getRDFSResource_Namespace()
	 * @model required="true"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link rdfs.RDFSResource#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

} // RDFSResource
