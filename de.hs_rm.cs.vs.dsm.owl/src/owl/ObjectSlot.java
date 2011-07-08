/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.ObjectSlot#getIndividual <em>Individual</em>}</li>
 *   <li>{@link owl.ObjectSlot#getContent <em>Content</em>}</li>
 *   <li>{@link owl.ObjectSlot#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getObjectSlot()
 * @model
 * @generated
 */
public interface ObjectSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getObjectSlot <em>Object Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' container reference.
	 * @see #setIndividual(Individual)
	 * @see owl.OwlPackage#getObjectSlot_Individual()
	 * @see owl.Individual#getObjectSlot
	 * @model opposite="objectSlot"
	 * @generated
	 */
	Individual getIndividual();

	/**
	 * Sets the value of the '{@link owl.ObjectSlot#getIndividual <em>Individual</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' container reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(Individual value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see owl.OwlPackage#getObjectSlot_Content()
	 * @model required="true"
	 * @generated
	 */
	EList<Individual> getContent();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(OWLObjectProperty)
	 * @see owl.OwlPackage#getObjectSlot_Property()
	 * @model required="true"
	 * @generated
	 */
	OWLObjectProperty getProperty();

	/**
	 * Sets the value of the '{@link owl.ObjectSlot#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(OWLObjectProperty value);

} // ObjectSlot
