/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SWRL Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getRule <em>Rule</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getBarrier <em>Barrier</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLOperator()
 * @model
 * @generated
 */
public interface SWRLOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(SWRLRule)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLOperator_Rule()
   * @model containment="true"
   * @generated
   */
  SWRLRule getRule();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(SWRLRule value);

  /**
   * Returns the value of the '<em><b>Barrier</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Barrier</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Barrier</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLOperator_Barrier()
   * @model containment="true"
   * @generated
   */
  EList<StreamOperatorParameter> getBarrier();

} // SWRLOperator
