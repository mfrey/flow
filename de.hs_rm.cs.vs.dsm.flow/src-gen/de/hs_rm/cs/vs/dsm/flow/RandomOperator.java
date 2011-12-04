/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getSleep <em>Sleep</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getRandomOperator()
 * @model
 * @generated
 */
public interface RandomOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Maximum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum</em>' attribute.
   * @see #setMaximum(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getRandomOperator_Maximum()
   * @model
   * @generated
   */
  BigDecimal getMaximum();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getMaximum <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum</em>' attribute.
   * @see #getMaximum()
   * @generated
   */
  void setMaximum(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Sleep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sleep</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sleep</em>' attribute.
   * @see #setSleep(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getRandomOperator_Sleep()
   * @model
   * @generated
   */
  BigDecimal getSleep();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getSleep <em>Sleep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sleep</em>' attribute.
   * @see #getSleep()
   * @generated
   */
  void setSleep(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' containment reference.
   * @see #setStream(StreamOperatorParameter)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getRandomOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.RandomOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

} // RandomOperator
