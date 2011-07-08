/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import rdfs.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLRestriction#getOWLOnProperty <em>OWL On Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLRestriction()
 * @model abstract="true"
 * @generated
 */
public interface OWLRestriction extends OWLClass {
	/**
	 * Returns the value of the '<em><b>OWL On Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFProperty#getRefByRestriction <em>Ref By Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL On Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL On Property</em>' reference.
	 * @see #setOWLOnProperty(RDFProperty)
	 * @see owl.OwlPackage#getOWLRestriction_OWLOnProperty()
	 * @see rdfs.RDFProperty#getRefByRestriction
	 * @model opposite="refByRestriction" required="true"
	 * @generated
	 */
	RDFProperty getOWLOnProperty();

	/**
	 * Sets the value of the '{@link owl.OWLRestriction#getOWLOnProperty <em>OWL On Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL On Property</em>' reference.
	 * @see #getOWLOnProperty()
	 * @generated
	 */
	void setOWLOnProperty(RDFProperty value);

} // OWLRestriction
