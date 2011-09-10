/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement#getElement <em>Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement#getFunction <em>Function</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionStatement()
 * @model
 * @generated
 */
public interface FunctionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionStatement_Element()
   * @model containment="true"
   * @generated
   */
  StreamAccess getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(StreamAccess value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(FunctionDefinition)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionStatement_Function()
   * @model
   * @generated
   */
  FunctionDefinition getFunction();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.FunctionStatement#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(FunctionDefinition value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionStatement_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // FunctionStatement
