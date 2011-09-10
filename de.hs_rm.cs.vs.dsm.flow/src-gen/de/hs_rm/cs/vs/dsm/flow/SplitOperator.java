/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SplitOperator#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSplitOperator()
 * @model
 * @generated
 */
public interface SplitOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(StreamOperatorParameter)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSplitOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SplitOperator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(StreamOperatorParameter value);

} // SplitOperator
