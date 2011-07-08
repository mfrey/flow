/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDFXML Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFXMLLiteral#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFXMLLiteral()
 * @model
 * @generated
 */
public interface RDFXMLLiteral extends TypedLiteral {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see rdfs.RdfsPackage#getRDFXMLLiteral_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link rdfs.RDFXMLLiteral#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // RDFXMLLiteral
