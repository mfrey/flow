/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import rdfs.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.Property#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link owl.Property#getFunctional <em>Functional</em>}</li>
 *   <li>{@link owl.Property#getOWLEquivalentProperty <em>OWL Equivalent Property</em>}</li>
 *   <li>{@link owl.Property#getInvOWLEquivalentProperty <em>Inv OWL Equivalent Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends RDFProperty {
	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see owl.OwlPackage#getProperty_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link owl.Property#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional</em>' attribute.
	 * @see #setFunctional(Boolean)
	 * @see owl.OwlPackage#getProperty_Functional()
	 * @model
	 * @generated
	 */
	Boolean getFunctional();

	/**
	 * Sets the value of the '{@link owl.Property#getFunctional <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional</em>' attribute.
	 * @see #getFunctional()
	 * @generated
	 */
	void setFunctional(Boolean value);

	/**
	 * Returns the value of the '<em><b>OWL Equivalent Property</b></em>' reference list.
	 * The list contents are of type {@link owl.Property}.
	 * It is bidirectional and its opposite is '{@link owl.Property#getInvOWLEquivalentProperty <em>Inv OWL Equivalent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Equivalent Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Equivalent Property</em>' reference list.
	 * @see owl.OwlPackage#getProperty_OWLEquivalentProperty()
	 * @see owl.Property#getInvOWLEquivalentProperty
	 * @model opposite="invOWLEquivalentProperty"
	 * @generated
	 */
	EList<Property> getOWLEquivalentProperty();

	/**
	 * Returns the value of the '<em><b>Inv OWL Equivalent Property</b></em>' reference list.
	 * The list contents are of type {@link owl.Property}.
	 * It is bidirectional and its opposite is '{@link owl.Property#getOWLEquivalentProperty <em>OWL Equivalent Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Equivalent Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Equivalent Property</em>' reference list.
	 * @see owl.OwlPackage#getProperty_InvOWLEquivalentProperty()
	 * @see owl.Property#getOWLEquivalentProperty
	 * @model opposite="OWLEquivalentProperty"
	 * @generated
	 */
	EList<Property> getInvOWLEquivalentProperty();

} // Property
