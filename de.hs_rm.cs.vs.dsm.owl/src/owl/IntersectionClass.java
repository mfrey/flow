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
 * A representation of the model object '<em><b>Intersection Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.IntersectionClass#getOWLIntersectionOf <em>OWL Intersection Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getIntersectionClass()
 * @model
 * @generated
 */
public interface IntersectionClass extends OWLClass {
	/**
	 * Returns the value of the '<em><b>OWL Intersection Of</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getRefByIntersectionClass <em>Ref By Intersection Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Intersection Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Intersection Of</em>' reference list.
	 * @see owl.OwlPackage#getIntersectionClass_OWLIntersectionOf()
	 * @see owl.OWLClass#getRefByIntersectionClass
	 * @model opposite="refByIntersectionClass"
	 * @generated
	 */
	EList<OWLClass> getOWLIntersectionOf();

} // IntersectionClass
