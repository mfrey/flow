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
 * A representation of the model object '<em><b>SWRL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getAtoms <em>Atoms</em>}</li>
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
   * Returns the value of the '<em><b>Atoms</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atoms</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLRule_Atoms()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getAtoms();

  /**
   * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequent</em>' containment reference.
   * @see #setConsequent(Rule)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSWRLRule_Consequent()
   * @model containment="true"
   * @generated
   */
  Rule getConsequent();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getConsequent <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consequent</em>' containment reference.
   * @see #getConsequent()
   * @generated
   */
  void setConsequent(Rule value);

} // SWRLRule
