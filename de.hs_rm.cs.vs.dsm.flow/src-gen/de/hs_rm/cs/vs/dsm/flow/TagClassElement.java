/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import owl.OWLClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Class Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.TagClassElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagClassElement()
 * @model
 * @generated
 */
public interface TagClassElement extends TagElement
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagClassElement_Element()
   * @model
   * @generated
   */
  OWLClass getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.TagClassElement#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(OWLClass value);

} // TagClassElement
