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
 * A representation of the model object '<em><b>Enumerated Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.EnumeratedClass#getOWLOneOf <em>OWL One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getEnumeratedClass()
 * @model
 * @generated
 */
public interface EnumeratedClass extends OWLClass {
	/**
	 * Returns the value of the '<em><b>OWL One Of</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL One Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL One Of</em>' reference list.
	 * @see owl.OwlPackage#getEnumeratedClass_OWLOneOf()
	 * @model
	 * @generated
	 */
	EList<Individual> getOWLOneOf();

} // EnumeratedClass
