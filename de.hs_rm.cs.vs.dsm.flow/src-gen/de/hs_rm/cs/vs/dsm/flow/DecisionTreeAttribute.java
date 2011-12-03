/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Tree Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute#getKey <em>Key</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeAttribute()
 * @model
 * @generated
 */
public interface DecisionTreeAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeAttribute_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeAttribute_Value()
   * @model unique="false"
   * @generated
   */
  EList<String> getValue();

} // DecisionTreeAttribute
