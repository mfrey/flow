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
 * A representation of the model object '<em><b>Min Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.MinCardinalityRestriction#getOWLMinCardinality <em>OWL Min Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getMinCardinalityRestriction()
 * @model
 * @generated
 */
public interface MinCardinalityRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL Min Cardinality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Min Cardinality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Min Cardinality</em>' reference.
	 * @see #setOWLMinCardinality(RDFSLiteral)
	 * @see owl.OwlPackage#getMinCardinalityRestriction_OWLMinCardinality()
	 * @model required="true"
	 * @generated
	 */
	RDFSLiteral getOWLMinCardinality();

	/**
	 * Sets the value of the '{@link owl.MinCardinalityRestriction#getOWLMinCardinality <em>OWL Min Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Min Cardinality</em>' reference.
	 * @see #getOWLMinCardinality()
	 * @generated
	 */
	void setOWLMinCardinality(RDFSLiteral value);

} // MinCardinalityRestriction
