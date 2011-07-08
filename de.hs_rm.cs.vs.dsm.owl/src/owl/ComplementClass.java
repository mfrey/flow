/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complement Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.ComplementClass#getOWLComplementOf <em>OWL Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getComplementClass()
 * @model
 * @generated
 */
public interface ComplementClass extends OWLClass {
	/**
	 * Returns the value of the '<em><b>OWL Complement Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getInvOWLComplementOf <em>Inv OWL Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Complement Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Complement Of</em>' reference.
	 * @see #setOWLComplementOf(OWLClass)
	 * @see owl.OwlPackage#getComplementClass_OWLComplementOf()
	 * @see owl.OWLClass#getInvOWLComplementOf
	 * @model opposite="invOWLComplementOf" required="true"
	 * @generated
	 */
	OWLClass getOWLComplementOf();

	/**
	 * Sets the value of the '{@link owl.ComplementClass#getOWLComplementOf <em>OWL Complement Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Complement Of</em>' reference.
	 * @see #getOWLComplementOf()
	 * @generated
	 */
	void setOWLComplementOf(OWLClass value);

} // ComplementClass
