/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getType <em>Type</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition()
 * @model
 * @generated
 */
public interface FunctionDefinition extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DataType)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition_Type()
   * @model containment="true"
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getArguments();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.BlockExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BlockExpression> getStatements();

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(ReturnStatement)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getFunctionDefinition_ReturnValue()
   * @model containment="true"
   * @generated
   */
  ReturnStatement getReturnValue();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.FunctionDefinition#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(ReturnStatement value);

} // FunctionDefinition
