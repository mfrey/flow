/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getSetting <em>Setting</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getValue <em>Value</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getWindowOperator()
 * @model
 * @generated
 */
public interface WindowOperator extends BarrierOperator
{
  /**
   * Returns the value of the '<em><b>Setting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setting</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setting</em>' attribute.
   * @see #setSetting(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getWindowOperator_Setting()
   * @model
   * @generated
   */
  String getSetting();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getSetting <em>Setting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Setting</em>' attribute.
   * @see #getSetting()
   * @generated
   */
  void setSetting(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getWindowOperator_Value()
   * @model
   * @generated
   */
  BigDecimal getValue();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getWindowOperator_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

} // WindowOperator
