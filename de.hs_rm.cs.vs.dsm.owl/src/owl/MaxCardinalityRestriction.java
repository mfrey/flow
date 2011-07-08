/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.MaxCardinalityRestriction#getOWLMaxCardinality <em>OWL Max Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getMaxCardinalityRestriction()
 * @model
 * @generated
 */
public interface MaxCardinalityRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL Max Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Max Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Max Cardinality</em>' reference.
	 * @see #setOWLMaxCardinality(RDFSLiteral)
	 * @see owl.OwlPackage#getMaxCardinalityRestriction_OWLMaxCardinality()
	 * @model required="true"
	 * @generated
	 */
	RDFSLiteral getOWLMaxCardinality();

	/**
	 * Sets the value of the '{@link owl.MaxCardinalityRestriction#getOWLMaxCardinality <em>OWL Max Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Max Cardinality</em>' reference.
	 * @see #getOWLMaxCardinality()
	 * @generated
	 */
	void setOWLMaxCardinality(RDFSLiteral value);

} // MaxCardinalityRestriction
