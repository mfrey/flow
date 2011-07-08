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
 * A representation of the model object '<em><b>Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.CardinalityRestriction#getOWLCardinality <em>OWL Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getCardinalityRestriction()
 * @model
 * @generated
 */
public interface CardinalityRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Cardinality</em>' reference.
	 * @see #setOWLCardinality(RDFSLiteral)
	 * @see owl.OwlPackage#getCardinalityRestriction_OWLCardinality()
	 * @model required="true"
	 * @generated
	 */
	RDFSLiteral getOWLCardinality();

	/**
	 * Sets the value of the '{@link owl.CardinalityRestriction#getOWLCardinality <em>OWL Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Cardinality</em>' reference.
	 * @see #getOWLCardinality()
	 * @generated
	 */
	void setOWLCardinality(RDFSLiteral value);

} // CardinalityRestriction
