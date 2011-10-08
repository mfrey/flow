/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getIri <em>Iri</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getPort <em>Port</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getSocket <em>Socket</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator()
 * @model
 * @generated
 */
public interface InputOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Iri</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iri</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iri</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Iri()
   * @model containment="true"
   * @generated
   */
  EList<InternationalizedResourceIdentifier> getIri();

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Port()
   * @model
   * @generated
   */
  BigDecimal getPort();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Socket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Socket</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Socket</em>' attribute.
   * @see #setSocket(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Socket()
   * @model
   * @generated
   */
  String getSocket();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getSocket <em>Socket</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Socket</em>' attribute.
   * @see #getSocket()
   * @generated
   */
  void setSocket(String value);

} // InputOperator
