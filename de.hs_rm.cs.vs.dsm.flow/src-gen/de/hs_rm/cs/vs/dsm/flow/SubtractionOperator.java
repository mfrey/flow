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
 * A representation of the model object '<em><b>Subtraction Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getStreamElement <em>Stream Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSubtractionOperator()
 * @model
 * @generated
 */
public interface SubtractionOperator extends ReturnTypeOperator
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSubtractionOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  StreamAccess getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getParameter <em>Parameter</em>}' containment reference.
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSubtractionOperator_Literal()
   * @model
   * @generated
   */
  BigDecimal getLiteral();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Stream Element</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamAccess}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream Element</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSubtractionOperator_StreamElement()
   * @model containment="true"
   * @generated
   */
  EList<StreamAccess> getStreamElement();

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSubtractionOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

} // SubtractionOperator
