/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.MapOperator#getFunctionList <em>Function List</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.MapOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMapOperator()
 * @model
 * @generated
 */
public interface MapOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Function List</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function List</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMapOperator_FunctionList()
   * @model containment="true"
   * @generated
   */
  EList<FunctionStatement> getFunctionList();

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getMapOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.MapOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

} // MapOperator
