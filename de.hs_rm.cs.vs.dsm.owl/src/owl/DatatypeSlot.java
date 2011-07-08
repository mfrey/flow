/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.DatatypeSlot#getIndividual <em>Individual</em>}</li>
 *   <li>{@link owl.DatatypeSlot#getContent <em>Content</em>}</li>
 *   <li>{@link owl.DatatypeSlot#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getDatatypeSlot()
 * @model
 * @generated
 */
public interface DatatypeSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getDatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' container reference.
	 * @see #setIndividual(Individual)
	 * @see owl.OwlPackage#getDatatypeSlot_Individual()
	 * @see owl.Individual#getDatatypeSlot
	 * @model opposite="datatypeSlot"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link owl.DatatypeSlot#getIndividual <em>Individual</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' container reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link rdfs.RDFSLiteral}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSLiteral#getDatatypeSlot <em>Datatype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see owl.OwlPackage#getDatatypeSlot_Content()
	 * @see rdfs.RDFSLiteral#getDatatypeSlot
	 * @model opposite="DatatypeSlot" containment="true" required="true"
	 * @generated
	 */
	EList<RDFSLiteral> getContent();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(OWLDatatypeProperty)
	 * @see owl.OwlPackage#getDatatypeSlot_Property()
	 * @model required="true"
	 * @generated
	 */
	OWLDatatypeProperty getProperty();

	/**
	 * Sets the value of the '{@link owl.DatatypeSlot#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(OWLDatatypeProperty value);

} // DatatypeSlot
