/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SwitchCaseCondition#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SwitchCaseCondition#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSwitchCaseCondition()
 * @model
 * @generated
 */
public interface SwitchCaseCondition extends ConditionalExpressions
{
  /**
   * Returns the value of the '<em><b>Case Expression</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.CaseStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Expression</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSwitchCaseCondition_CaseExpression()
   * @model containment="true"
   * @generated
   */
  EList<CaseStatement> getCaseExpression();

  /**
   * Returns the value of the '<em><b>Default Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Expression</em>' containment reference.
   * @see #setDefaultExpression(Expression)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSwitchCaseCondition_DefaultExpression()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultExpression();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SwitchCaseCondition#getDefaultExpression <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Expression</em>' containment reference.
   * @see #getDefaultExpression()
   * @generated
   */
  void setDefaultExpression(Expression value);

} // SwitchCaseCondition
