/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import rdfs.RDFSClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLClass#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link owl.OWLClass#getInvOWLEquivalentClass <em>Inv OWL Equivalent Class</em>}</li>
 *   <li>{@link owl.OWLClass#getOWLEquivalentClass <em>OWL Equivalent Class</em>}</li>
 *   <li>{@link owl.OWLClass#getOWLDisjointWith <em>OWL Disjoint With</em>}</li>
 *   <li>{@link owl.OWLClass#getInvOWLDisjointWith <em>Inv OWL Disjoint With</em>}</li>
 *   <li>{@link owl.OWLClass#getRefByIntersectionClass <em>Ref By Intersection Class</em>}</li>
 *   <li>{@link owl.OWLClass#getRefByUnionClass <em>Ref By Union Class</em>}</li>
 *   <li>{@link owl.OWLClass#getInvOWLComplementOf <em>Inv OWL Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLClass()
 * @model
 * @generated
 */
public interface OWLClass extends RDFSClass {
	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * default: false
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see owl.OwlPackage#getOWLClass_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link owl.OWLClass#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Inv OWL Equivalent Class</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getOWLEquivalentClass <em>OWL Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Equivalent Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Equivalent Class</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_InvOWLEquivalentClass()
	 * @see owl.OWLClass#getOWLEquivalentClass
	 * @model opposite="OWLEquivalentClass"
	 * @generated
	 */
	EList<OWLClass> getInvOWLEquivalentClass();

	/**
	 * Returns the value of the '<em><b>OWL Equivalent Class</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getInvOWLEquivalentClass <em>Inv OWL Equivalent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Equivalent Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Equivalent Class</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_OWLEquivalentClass()
	 * @see owl.OWLClass#getInvOWLEquivalentClass
	 * @model opposite="invOWLEquivalentClass"
	 * @generated
	 */
	EList<OWLClass> getOWLEquivalentClass();

	/**
	 * Returns the value of the '<em><b>OWL Disjoint With</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getInvOWLDisjointWith <em>Inv OWL Disjoint With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Disjoint With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Disjoint With</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_OWLDisjointWith()
	 * @see owl.OWLClass#getInvOWLDisjointWith
	 * @model opposite="invOWLDisjointWith"
	 * @generated
	 */
	EList<OWLClass> getOWLDisjointWith();

	/**
	 * Returns the value of the '<em><b>Inv OWL Disjoint With</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLClass}.
	 * It is bidirectional and its opposite is '{@link owl.OWLClass#getOWLDisjointWith <em>OWL Disjoint With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Disjoint With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Disjoint With</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_InvOWLDisjointWith()
	 * @see owl.OWLClass#getOWLDisjointWith
	 * @model opposite="OWLDisjointWith"
	 * @generated
	 */
	EList<OWLClass> getInvOWLDisjointWith();

	/**
	 * Returns the value of the '<em><b>Ref By Intersection Class</b></em>' reference list.
	 * The list contents are of type {@link owl.IntersectionClass}.
	 * It is bidirectional and its opposite is '{@link owl.IntersectionClass#getOWLIntersectionOf <em>OWL Intersection Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By Intersection Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By Intersection Class</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_RefByIntersectionClass()
	 * @see owl.IntersectionClass#getOWLIntersectionOf
	 * @model opposite="OWLIntersectionOf"
	 * @generated
	 */
	EList<IntersectionClass> getRefByIntersectionClass();

	/**
	 * Returns the value of the '<em><b>Ref By Union Class</b></em>' reference list.
	 * The list contents are of type {@link owl.UnionClass}.
	 * It is bidirectional and its opposite is '{@link owl.UnionClass#getOWLUnionOf <em>OWL Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By Union Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By Union Class</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_RefByUnionClass()
	 * @see owl.UnionClass#getOWLUnionOf
	 * @model opposite="OWLUnionOf"
	 * @generated
	 */
	EList<UnionClass> getRefByUnionClass();

	/**
	 * Returns the value of the '<em><b>Inv OWL Complement Of</b></em>' reference list.
	 * The list contents are of type {@link owl.ComplementClass}.
	 * It is bidirectional and its opposite is '{@link owl.ComplementClass#getOWLComplementOf <em>OWL Complement Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv OWL Complement Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inv OWL Complement Of</em>' reference list.
	 * @see owl.OwlPackage#getOWLClass_InvOWLComplementOf()
	 * @see owl.ComplementClass#getOWLComplementOf
	 * @model opposite="OWLComplementOf"
	 * @generated
	 */
	EList<ComplementClass> getInvOWLComplementOf();

} // OWLClass
