/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.VariableCall#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getVariableCall()
 * @model
 * @generated
 */
public interface VariableCall extends Expression
{
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getVariableCall_Variable()
   * @model
   * @generated
   */
  VariableDefinition getVariable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.VariableCall#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDefinition value);

} // VariableCall
