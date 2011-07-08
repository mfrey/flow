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
 * A representation of the model object '<em><b>Some Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.SomeValuesFromRestriction#getOWLSomeValuesFrom <em>OWL Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getSomeValuesFromRestriction()
 * @model
 * @generated
 */
public interface SomeValuesFromRestriction extends OWLRestriction {
	/**
	 * Returns the value of the '<em><b>OWL Some Values From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getRefBySVFRestriction <em>Ref By SVF Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Some Values From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Some Values From</em>' reference.
	 * @see #setOWLSomeValuesFrom(RDFSClass)
	 * @see owl.OwlPackage#getSomeValuesFromRestriction_OWLSomeValuesFrom()
	 * @see rdfs.RDFSClass#getRefBySVFRestriction
	 * @model opposite="refBySVFRestriction" required="true"
	 * @generated
	 */
	RDFSClass getOWLSomeValuesFrom();

	/**
	 * Sets the value of the '{@link owl.SomeValuesFromRestriction#getOWLSomeValuesFrom <em>OWL Some Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OWL Some Values From</em>' reference.
	 * @see #getOWLSomeValuesFrom()
	 * @generated
	 */
	void setOWLSomeValuesFrom(RDFSClass value);

} // SomeValuesFromRestriction
