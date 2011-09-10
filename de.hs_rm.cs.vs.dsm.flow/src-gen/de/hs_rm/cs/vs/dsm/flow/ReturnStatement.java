/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ReturnStatement#getReturnVariable <em>Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getReturnStatement()
 * @model
 * @generated
 */
public interface ReturnStatement extends BlockExpression
{
  /**
   * Returns the value of the '<em><b>Return Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Variable</em>' containment reference.
   * @see #setReturnVariable(ReturnVariable)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getReturnStatement_ReturnVariable()
   * @model containment="true"
   * @generated
   */
  ReturnVariable getReturnVariable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ReturnStatement#getReturnVariable <em>Return Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Variable</em>' containment reference.
   * @see #getReturnVariable()
   * @generated
   */
  void setReturnVariable(ReturnVariable value);

} // ReturnStatement
