/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import owl.OWLDatatypeProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Data Type Property Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagDataTypePropertyElement()
 * @model
 * @generated
 */
public interface TagDataTypePropertyElement extends TagElement
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
   * @see #setElement(OWLDatatypeProperty)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getTagDataTypePropertyElement_Element()
   * @model
   * @generated
   */
  OWLDatatypeProperty getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(OWLDatatypeProperty value);

} // TagDataTypePropertyElement
