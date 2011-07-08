/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import rdfs.RDFSResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Value Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.HasValueRestriction#getOWLHasValue <em>OWL Has Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getHasValueRestriction()
 * @model
 * @generated
 */
public interface HasValueRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL Has Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Has Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Has Value</em>' reference.
	 * @see #setOWLHasValue(RDFSResource)
	 * @see owl.OwlPackage#getHasValueRestriction_OWLHasValue()
	 * @model required="true"
	 * @generated
	 */
	RDFSResource getOWLHasValue();

	/**
	 * Sets the value of the '{@link owl.HasValueRestriction#getOWLHasValue <em>OWL Has Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Has Value</em>' reference.
	 * @see #getOWLHasValue()
	 * @generated
	 */
	void setOWLHasValue(RDFSResource value);

} // HasValueRestriction
