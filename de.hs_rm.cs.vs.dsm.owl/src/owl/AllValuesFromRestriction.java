/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import rdfs.RDFSClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.AllValuesFromRestriction#getOWLAllValuesFrom <em>OWL All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getAllValuesFromRestriction()
 * @model
 * @generated
 */
public interface AllValuesFromRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL All Values From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getRefByAVFRestriction <em>Ref By AVF Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL All Values From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL All Values From</em>' reference.
	 * @see #setOWLAllValuesFrom(RDFSClass)
	 * @see owl.OwlPackage#getAllValuesFromRestriction_OWLAllValuesFrom()
	 * @see rdfs.RDFSClass#getRefByAVFRestriction
	 * @model opposite="refByAVFRestriction" required="true"
	 * @generated
	 */
	RDFSClass getOWLAllValuesFrom();

	/**
	 * Sets the value of the '{@link owl.AllValuesFromRestriction#getOWLAllValuesFrom <em>OWL All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL All Values From</em>' reference.
	 * @see #getOWLAllValuesFrom()
	 * @generated
	 */
	void setOWLAllValuesFrom(RDFSClass value);

} // AllValuesFromRestriction
