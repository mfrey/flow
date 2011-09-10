/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.IfElseCondition#getIfAction <em>If Action</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.IfElseCondition#getElseAction <em>Else Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getIfElseCondition()
 * @model
 * @generated
 */
public interface IfElseCondition extends ConditionalExpressions
{
  /**
   * Returns the value of the '<em><b>If Action</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.BlockExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Action</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getIfElseCondition_IfAction()
   * @model containment="true"
   * @generated
   */
  EList<BlockExpression> getIfAction();

  /**
   * Returns the value of the '<em><b>Else Action</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.BlockExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Action</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getIfElseCondition_ElseAction()
   * @model containment="true"
   * @generated
   */
  EList<BlockExpression> getElseAction();

} // IfElseCondition
