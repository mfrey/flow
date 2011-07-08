/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLObjectProperty#getInverseFunctional <em>Inverse Functional</em>}</li>
 *   <li>{@link owl.OWLObjectProperty#getSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link owl.OWLObjectProperty#getTransitive <em>Transitive</em>}</li>
 *   <li>{@link owl.OWLObjectProperty#getOWLInverseOf <em>OWL Inverse Of</em>}</li>
 *   <li>{@link owl.OWLObjectProperty#getInvOWLInverseOf <em>Inv OWL Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLObjectProperty()
 * @model
 * @generated
 */
public interface OWLObjectProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse Functional</em>' attribute.
	 * @see #setInverseFunctional(Boolean)
	 * @see owl.OwlPackage#getOWLObjectProperty_InverseFunctional()
	 * @model
	 * @generated
	 */
	Boolean getInverseFunctional();

	/**
	 * Sets the value of the '{@link owl.OWLObjectProperty#getInverseFunctional <em>Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Functional</em>' attribute.
	 * @see #getInverseFunctional()
	 * @generated
	 */
	void setInverseFunctional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symmetric</em>' attribute.
	 * @see #setSymmetric(Boolean)
	 * @see owl.OwlPackage#getOWLObjectProperty_Symmetric()
	 * @model
	 * @generated
	 */
	Boolean getSymmetric();

	/**
	 * Sets the value of the '{@link owl.OWLObjectProperty#getSymmetric <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetric</em>' attribute.
	 * @see #getSymmetric()
	 * @generated
	 */
	void setSymmetric(Boolean value);

	/**
	 * Returns the value of the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitive</em>' attribute.
	 * @see #setTransitive(Boolean)
	 * @see owl.OwlPackage#getOWLObjectProperty_Transitive()
	 * @model
	 * @generated
	 */
	Boolean getTransitive();

	/**
	 * Sets the value of the '{@link owl.OWLObjectProperty#getTransitive <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive</em>' attribute.
	 * @see #getTransitive()
	 * @generated
	 */
	void setTransitive(Boolean value);

	/**
	 * Returns the value of the '<em><b>OWL Inverse Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link owl.OWLObjectProperty#getInvOWLInverseOf <em>Inv OWL Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Inverse Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Inverse Of</em>' reference.
	 * @see #setOWLInverseOf(OWLObjectProperty)
	 * @see owl.OwlPackage#getOWLObjectProperty_OWLInverseOf()
	 * @see owl.OWLObjectProperty#getInvOWLInverseOf
	 * @model opposite="invOWLInverseOf"
	 * @generated
	 */
	OWLObjectProperty getOWLInverseOf();

	/**
	 * Sets the value of the '{@link owl.OWLObjectProperty#getOWLInverseOf <em>OWL Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Inverse Of</em>' reference.
	 * @see #getOWLInverseOf()
	 * @generated
	 */
	void setOWLInverseOf(OWLObjectProperty value);

	/**
	 * Returns the value of the '<em><b>Inv OWL Inverse Of</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLObjectProperty}.
	 * It is bidirectional and its opposite is '{@link owl.OWLObjectProperty#getOWLInverseOf <em>OWL Inverse Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Inverse Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Inverse Of</em>' reference list.
	 * @see owl.OwlPackage#getOWLObjectProperty_InvOWLInverseOf()
	 * @see owl.OWLObjectProperty#getOWLInverseOf
	 * @model opposite="OWLInverseOf"
	 * @generated
	 */
	EList<OWLObjectProperty> getInvOWLInverseOf();

} // OWLObjectProperty
