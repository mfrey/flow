/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Average Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getAverageOperator()
 * @model
 * @generated
 */
public interface AverageOperator extends ReturnTypeOperator
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
   * @see #setParameter(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getAverageOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  StreamAccess getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(StreamAccess value);

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getAverageOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

} // AverageOperator
