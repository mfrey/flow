/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Join Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getElementParameters <em>Element Parameters</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getVariableElementParameters <em>Variable Element Parameters</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getElementJoinOperator()
 * @model
 * @generated
 */
public interface ElementJoinOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Element Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamAccess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Parameters</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getElementJoinOperator_ElementParameters()
   * @model containment="true"
   * @generated
   */
  EList<StreamAccess> getElementParameters();

  /**
   * Returns the value of the '<em><b>Variable Element Parameters</b></em>' reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.VariableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Element Parameters</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Element Parameters</em>' reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getElementJoinOperator_VariableElementParameters()
   * @model
   * @generated
   */
  EList<VariableDefinition> getVariableElementParameters();

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getElementJoinOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(StreamOperatorParameter value);

} // ElementJoinOperator
