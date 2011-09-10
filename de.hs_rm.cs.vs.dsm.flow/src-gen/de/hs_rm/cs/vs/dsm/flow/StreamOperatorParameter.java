/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Operator Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getStream <em>Stream</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getBarrier <em>Barrier</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamOperatorParameter()
 * @model
 * @generated
 */
public interface StreamOperatorParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' reference.
   * @see #setStream(StreamDefinition)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamOperatorParameter_Stream()
   * @model
   * @generated
   */
  StreamDefinition getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getStream <em>Stream</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamDefinition value);

  /**
   * Returns the value of the '<em><b>Barrier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Barrier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Barrier</em>' containment reference.
   * @see #setBarrier(BarrierOperator)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamOperatorParameter_Barrier()
   * @model containment="true"
   * @generated
   */
  BarrierOperator getBarrier();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getBarrier <em>Barrier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Barrier</em>' containment reference.
   * @see #getBarrier()
   * @generated
   */
  void setBarrier(BarrierOperator value);

} // StreamOperatorParameter
