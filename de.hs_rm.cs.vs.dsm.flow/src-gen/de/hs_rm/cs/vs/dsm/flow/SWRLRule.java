/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SWRL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLRule()
 * @model
 * @generated
 */
public interface SWRLRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antecedent</em>' containment reference.
   * @see #setAntecedent(AntecedentRule)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLRule_Antecedent()
   * @model containment="true"
   * @generated
   */
  AntecedentRule getAntecedent();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getAntecedent <em>Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antecedent</em>' containment reference.
   * @see #getAntecedent()
   * @generated
   */
  void setAntecedent(AntecedentRule value);

  /**
   * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequent</em>' containment reference.
   * @see #setConsequent(ConsequentRule)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLRule_Consequent()
   * @model containment="true"
   * @generated
   */
  ConsequentRule getConsequent();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getConsequent <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consequent</em>' containment reference.
   * @see #getConsequent()
   * @generated
   */
  void setConsequent(ConsequentRule value);

} // SWRLRule
