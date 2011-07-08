/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFList#getRDFRest <em>RDF Rest</em>}</li>
 *   <li>{@link rdfs.RDFList#getRDFFirst <em>RDF First</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFList()
 * @model
 * @generated
 */
public interface RDFList extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>RDF Rest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF Rest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF Rest</em>' reference.
	 * @see #setRDFRest(RDFList)
	 * @see rdfs.RdfsPackage#getRDFList_RDFRest()
	 * @model
	 * @generated
	 */
	RDFList getRDFRest();

	/**
	 * Sets the value of the '{@link rdfs.RDFList#getRDFRest <em>RDF Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF Rest</em>' reference.
	 * @see #getRDFRest()
	 * @generated
	 */
	void setRDFRest(RDFList value);

	/**
	 * Returns the value of the '<em><b>RDF First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF First</em>' reference.
	 * @see #setRDFFirst(RDFSResource)
	 * @see rdfs.RdfsPackage#getRDFList_RDFFirst()
	 * @model
	 * @generated
	 */
	RDFSResource getRDFFirst();

	/**
	 * Sets the value of the '{@link rdfs.RDFList#getRDFFirst <em>RDF First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF First</em>' reference.
	 * @see #getRDFFirst()
	 * @generated
	 */
	void setRDFFirst(RDFSResource value);

} // RDFList
