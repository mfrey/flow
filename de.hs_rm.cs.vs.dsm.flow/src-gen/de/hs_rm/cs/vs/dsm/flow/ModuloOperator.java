/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getStreamElement <em>Stream Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getModuloOperator()
 * @model
 * @generated
 */
public interface ModuloOperator extends ReturnTypeOperator
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getModuloOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  StreamAccess getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(StreamAccess value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getModuloOperator_Literal()
   * @model
   * @generated
   */
  BigDecimal getLiteral();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Stream Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream Element</em>' containment reference.
   * @see #setStreamElement(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getModuloOperator_StreamElement()
   * @model containment="true"
   * @generated
   */
  StreamAccess getStreamElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getStreamElement <em>Stream Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream Element</em>' containment reference.
   * @see #getStreamElement()
   * @generated
   */
  void setStreamElement(StreamAccess value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableDefinition)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getModuloOperator_Variable()
   * @model
   * @generated
   */
  VariableDefinition getVariable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ModuloOperator#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDefinition value);

} // ModuloOperator
