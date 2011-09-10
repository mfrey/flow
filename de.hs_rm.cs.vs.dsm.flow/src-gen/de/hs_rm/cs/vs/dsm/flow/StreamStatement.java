/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement#getReturnStream <em>Return Stream</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamStatement()
 * @model
 * @generated
 */
public interface StreamStatement extends ProcessingExpression
{
  /**
   * Returns the value of the '<em><b>Return Stream</b></em>' reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Stream</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Stream</em>' reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamStatement_ReturnStream()
   * @model
   * @generated
   */
  EList<StreamDefinition> getReturnStream();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ReturnTypeOperator)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamStatement_Expression()
   * @model containment="true"
   * @generated
   */
  ReturnTypeOperator getExpression();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ReturnTypeOperator value);

} // StreamStatement
