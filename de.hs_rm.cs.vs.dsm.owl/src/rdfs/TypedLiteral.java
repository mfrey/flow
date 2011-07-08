/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.TypedLiteral#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getTypedLiteral()
 * @model
 * @generated
 */
public interface TypedLiteral extends RDFSLiteral {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(RDFSDatatype)
	 * @see rdfs.RdfsPackage#getTypedLiteral_Datatype()
	 * @model required="true"
	 * @generated
	 */
	RDFSDatatype getDatatype();

	/**
	 * Sets the value of the '{@link rdfs.TypedLiteral#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(RDFSDatatype value);

} // TypedLiteral
