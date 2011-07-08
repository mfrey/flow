/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFStatement#getRDFSubject <em>RDF Subject</em>}</li>
 *   <li>{@link rdfs.RDFStatement#getRDFObject <em>RDF Object</em>}</li>
 *   <li>{@link rdfs.RDFStatement#getRDFPredicate <em>RDF Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFStatement()
 * @model
 * @generated
 */
public interface RDFStatement extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>RDF Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSResource#getSubjectStatement <em>Subject Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Subject</em>' reference.
	 * @see #setRDFSubject(RDFSResource)
	 * @see rdfs.RdfsPackage#getRDFStatement_RDFSubject()
	 * @see rdfs.RDFSResource#getSubjectStatement
	 * @model opposite="subjectStatement" required="true"
	 * @generated
	 */
	RDFSResource getRDFSubject();

	/**
	 * Sets the value of the '{@link rdfs.RDFStatement#getRDFSubject <em>RDF Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF Subject</em>' reference.
	 * @see #getRDFSubject()
	 * @generated
	 */
	void setRDFSubject(RDFSResource value);

	/**
	 * Returns the value of the '<em><b>RDF Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSResource#getObjectStatement <em>Object Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Object</em>' reference.
	 * @see #setRDFObject(RDFSResource)
	 * @see rdfs.RdfsPackage#getRDFStatement_RDFObject()
	 * @see rdfs.RDFSResource#getObjectStatement
	 * @model opposite="objectStatement" required="true"
	 * @generated
	 */
	RDFSResource getRDFObject();

	/**
	 * Sets the value of the '{@link rdfs.RDFStatement#getRDFObject <em>RDF Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF Object</em>' reference.
	 * @see #getRDFObject()
	 * @generated
	 */
	void setRDFObject(RDFSResource value);

	/**
	 * Returns the value of the '<em><b>RDF Predicate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSResource#getPredicateStatement <em>Predicate Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Predicate</em>' reference.
	 * @see #setRDFPredicate(RDFSResource)
	 * @see rdfs.RdfsPackage#getRDFStatement_RDFPredicate()
	 * @see rdfs.RDFSResource#getPredicateStatement
	 * @model opposite="predicateStatement" required="true"
	 * @generated
	 */
	RDFSResource getRDFPredicate();

	/**
	 * Sets the value of the '{@link rdfs.RDFStatement#getRDFPredicate <em>RDF Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF Predicate</em>' reference.
	 * @see #getRDFPredicate()
	 * @generated
	 */
	void setRDFPredicate(RDFSResource value);

} // RDFStatement
