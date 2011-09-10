/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import owl.OWLObjectProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Object Property Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagObjectPropertyElement()
 * @model
 * @generated
 */
public interface TagObjectPropertyElement extends TagElement
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
   * @see #setElement(OWLObjectProperty)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagObjectPropertyElement_Element()
   * @model
   * @generated
   */
  OWLObjectProperty getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(OWLObjectProperty value);

} // TagObjectPropertyElement
