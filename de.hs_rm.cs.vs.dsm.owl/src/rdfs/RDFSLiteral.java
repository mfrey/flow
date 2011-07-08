/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import owl.DatatypeSlot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDFS Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFSLiteral#getDatatypeSlot <em>Datatype Slot</em>}</li>
 *   <li>{@link rdfs.RDFSLiteral#getLexicalForm <em>Lexical Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFSLiteral()
 * @model
 * @generated
 */
public interface RDFSLiteral extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>Datatype Slot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owl.DatatypeSlot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Slot</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Slot</em>' container reference.
	 * @see #setDatatypeSlot(DatatypeSlot)
	 * @see rdfs.RdfsPackage#getRDFSLiteral_DatatypeSlot()
	 * @see owl.DatatypeSlot#getContent
	 * @model opposite="content"
	 * @generated
	 */
	DatatypeSlot getDatatypeSlot();

	/**
	 * Sets the value of the '{@link rdfs.RDFSLiteral#getDatatypeSlot <em>Datatype Slot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Slot</em>' container reference.
	 * @see #getDatatypeSlot()
	 * @generated
	 */
	void setDatatypeSlot(DatatypeSlot value);

	/**
	 * Returns the value of the '<em><b>Lexical Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Form</em>' attribute.
	 * @see #setLexicalForm(String)
	 * @see rdfs.RdfsPackage#getRDFSLiteral_LexicalForm()
	 * @model
	 * @generated
	 */
	String getLexicalForm();

	/**
	 * Sets the value of the '{@link rdfs.RDFSLiteral#getLexicalForm <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Form</em>' attribute.
	 * @see #getLexicalForm()
	 * @generated
	 */
	void setLexicalForm(String value);

} // RDFSLiteral
