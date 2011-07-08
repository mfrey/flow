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
 * A representation of the model object '<em><b>Union Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.UnionClass#getOWLUnionOf <em>OWL Union Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getUnionClass()
 * @model
 * @generated
 */
public interface UnionClass extends OWLClass {
	/**
	 * Returns the value of the '<em><b>OWL Union Of</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getRefByUnionClass <em>Ref By Union Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Union Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Union Of</em>' reference list.
	 * @see owl.OwlPackage#getUnionClass_OWLUnionOf()
	 * @see owl.OWLClass#getRefByUnionClass
	 * @model opposite="refByUnionClass"
	 * @generated
	 */
	EList<OWLClass> getOWLUnionOf();

} // UnionClass
