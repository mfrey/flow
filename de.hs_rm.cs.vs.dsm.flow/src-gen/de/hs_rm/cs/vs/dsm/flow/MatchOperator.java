/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getCalculation <em>Calculation</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMatchOperator()
 * @model
 * @generated
 */
public interface MatchOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMatchOperator_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Calculation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calculation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculation</em>' containment reference.
   * @see #setCalculation(Expression)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMatchOperator_Calculation()
   * @model containment="true"
   * @generated
   */
  Expression getCalculation();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getCalculation <em>Calculation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calculation</em>' containment reference.
   * @see #getCalculation()
   * @generated
   */
  void setCalculation(Expression value);

  /**
   * Returns the value of the '<em><b>Stream</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMatchOperator_Stream()
   * @model containment="true"
   * @generated
   */
  EList<StreamOperatorParameter> getStream();

} // MatchOperator
