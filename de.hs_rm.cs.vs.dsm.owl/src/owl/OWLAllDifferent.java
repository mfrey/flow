/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import rdfs.RDFSResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL All Different</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLAllDifferent#getOWLDistinctMembers <em>OWL Distinct Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLAllDifferent()
 * @model
 * @generated
 */
public interface OWLAllDifferent extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>OWL Distinct Members</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getRefByOWLDistinctMembers <em>Ref By OWL Distinct Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Distinct Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Distinct Members</em>' reference list.
	 * @see owl.OwlPackage#getOWLAllDifferent_OWLDistinctMembers()
	 * @see owl.Individual#getRefByOWLDistinctMembers
	 * @model opposite="refByOWLDistinctMembers" lower="2"
	 * @generated
	 */
	EList<Individual> getOWLDistinctMembers();

} // OWLAllDifferent
