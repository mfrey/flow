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
 * A representation of the model object '<em><b>Decision Tree Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getDelta <em>Delta</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getTau <em>Tau</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getBarrier <em>Barrier</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getClassAttributes <em>Class Attributes</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator()
 * @model
 * @generated
 */
public interface DecisionTreeOperator extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<DecisionTreeAttribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta</em>' attribute.
   * @see #setDelta(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Delta()
   * @model
   * @generated
   */
  BigDecimal getDelta();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getDelta <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' attribute.
   * @see #getDelta()
   * @generated
   */
  void setDelta(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Tau</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tau</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tau</em>' attribute.
   * @see #setTau(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Tau()
   * @model
   * @generated
   */
  BigDecimal getTau();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getTau <em>Tau</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tau</em>' attribute.
   * @see #getTau()
   * @generated
   */
  void setTau(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Barrier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Barrier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Barrier</em>' attribute.
   * @see #setBarrier(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Barrier()
   * @model
   * @generated
   */
  BigDecimal getBarrier();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getBarrier <em>Barrier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Barrier</em>' attribute.
   * @see #getBarrier()
   * @generated
   */
  void setBarrier(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frequency</em>' attribute.
   * @see #setFrequency(BigDecimal)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Frequency()
   * @model
   * @generated
   */
  BigDecimal getFrequency();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getFrequency <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frequency</em>' attribute.
   * @see #getFrequency()
   * @generated
   */
  void setFrequency(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Class Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Attributes</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_ClassAttributes()
   * @model containment="true"
   * @generated
   */
  EList<DecisionTreeAttribute> getClassAttributes();

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getDecisionTreeOperator_Stream()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getStream();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator#getStream <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream</em>' containment reference.
   * @see #getStream()
   * @generated
   */
  void setStream(StreamOperatorParameter value);

} // DecisionTreeOperator
