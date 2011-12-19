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
 * A representation of the model object '<em><b>Output Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getStream <em>Stream</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getIri <em>Iri</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator()
 * @model
 * @generated
 */
public interface OutputOperator extends ReturnTypeOperator, NoReturnTypeOperator
{
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

  /**
   * Returns the value of the '<em><b>Iri</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iri</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iri</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Iri()
   * @model unique="false"
   * @generated
   */
  EList<String> getIri();

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Port()
   * @model
   * @generated
   */
  BigDecimal getPort();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(BigDecimal value);

} // OutputOperator
