/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

import owl.OWLClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Tag Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getElement <em>Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getUnTagElement()
 * @model
 * @generated
 */
public interface UnTagElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(OWLClass)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getUnTagElement_Element()
   * @model
   * @generated
   */
  OWLClass getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(OWLClass value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getUnTagElement_Reference()
   * @model containment="true"
   * @generated
   */
  StreamAccess getReference();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(StreamAccess value);

} // UnTagElement
