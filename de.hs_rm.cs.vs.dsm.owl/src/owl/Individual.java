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
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.Individual#getOWLDifferentFrom <em>OWL Different From</em>}</li>
 *   <li>{@link owl.Individual#getInvOWLDifferentFrom <em>Inv OWL Different From</em>}</li>
 *   <li>{@link owl.Individual#getRefByOWLDistinctMembers <em>Ref By OWL Distinct Members</em>}</li>
 *   <li>{@link owl.Individual#getOWLSameAs <em>OWL Same As</em>}</li>
 *   <li>{@link owl.Individual#getInvOWLSameAs <em>Inv OWL Same As</em>}</li>
 *   <li>{@link owl.Individual#getDatatypeSlot <em>Datatype Slot</em>}</li>
 *   <li>{@link owl.Individual#getObjectSlot <em>Object Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>OWL Different From</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getInvOWLDifferentFrom <em>Inv OWL Different From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Different From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Different From</em>' reference list.
	 * @see owl.OwlPackage#getIndividual_OWLDifferentFrom()
	 * @see owl.Individual#getInvOWLDifferentFrom
	 * @model opposite="invOWLDifferentFrom"
	 * @generated
	 */
	EList<Individual> getOWLDifferentFrom();

	/**
	 * Returns the value of the '<em><b>Inv OWL Different From</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getOWLDifferentFrom <em>OWL Different From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Different From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Different From</em>' reference list.
	 * @see owl.OwlPackage#getIndividual_InvOWLDifferentFrom()
	 * @see owl.Individual#getOWLDifferentFrom
	 * @model opposite="OWLDifferentFrom"
	 * @generated
	 */
	EList<Individual> getInvOWLDifferentFrom();

	/**
	 * Returns the value of the '<em><b>Ref By OWL Distinct Members</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLAllDifferent}.
	 * It is bidirectional and its opposite is '{@link owl.OWLAllDifferent#getOWLDistinctMembers <em>OWL Distinct Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By OWL Distinct Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By OWL Distinct Members</em>' reference list.
	 * @see owl.OwlPackage#getIndividual_RefByOWLDistinctMembers()
	 * @see owl.OWLAllDifferent#getOWLDistinctMembers
	 * @model opposite="OWLDistinctMembers"
	 * @generated
	 */
	EList<OWLAllDifferent> getRefByOWLDistinctMembers();

	/**
	 * Returns the value of the '<em><b>OWL Same As</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getInvOWLSameAs <em>Inv OWL Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Same As</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Same As</em>' reference list.
	 * @see owl.OwlPackage#getIndividual_OWLSameAs()
	 * @see owl.Individual#getInvOWLSameAs
	 * @model opposite="invOWLSameAs"
	 * @generated
	 */
	EList<Individual> getOWLSameAs();

	/**
	 * Returns the value of the '<em><b>Inv OWL Same As</b></em>' reference list.
	 * The list contents are of type {@link owl.Individual}.
	 * It is bidirectional and its opposite is '{@link owl.Individual#getOWLSameAs <em>OWL Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Same As</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Same As</em>' reference list.
	 * @see owl.OwlPackage#getIndividual_InvOWLSameAs()
	 * @see owl.Individual#getOWLSameAs
	 * @model opposite="OWLSameAs"
	 * @generated
	 */
	EList<Individual> getInvOWLSameAs();

	/**
	 * Returns the value of the '<em><b>Datatype Slot</b></em>' containment reference list.
	 * The list contents are of type {@link owl.DatatypeSlot}.
	 * It is bidirectional and its opposite is '{@link owl.DatatypeSlot#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Slot</em>' containment reference list.
	 * @see owl.OwlPackage#getIndividual_DatatypeSlot()
	 * @see owl.DatatypeSlot#getIndividual
	 * @model opposite="Individual" containment="true"
	 * @generated
	 */
	EList<DatatypeSlot> getDatatypeSlot();

	/**
	 * Returns the value of the '<em><b>Object Slot</b></em>' containment reference list.
	 * The list contents are of type {@link owl.ObjectSlot}.
	 * It is bidirectional and its opposite is '{@link owl.ObjectSlot#getIndividual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Slot</em>' containment reference list.
	 * @see owl.OwlPackage#getIndividual_ObjectSlot()
	 * @see owl.ObjectSlot#getIndividual
	 * @model opposite="Individual" containment="true"
	 * @generated
	 */
	EList<ObjectSlot> getObjectSlot();

} // Individual
