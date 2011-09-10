/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.ReturnVariable#getReturnable <em>Returnable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getReturnVariable()
 * @model
 * @generated
 */
public interface ReturnVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Returnable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returnable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returnable</em>' reference.
   * @see #setReturnable(Returnable)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getReturnVariable_Returnable()
   * @model
   * @generated
   */
  Returnable getReturnable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.ReturnVariable#getReturnable <em>Returnable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returnable</em>' reference.
   * @see #getReturnable()
   * @generated
   */
  void setReturnable(Returnable value);

} // ReturnVariable
