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
 * A representation of the model object '<em><b>Antecedent Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.AntecedentRule#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getAntecedentRule()
 * @model
 * @generated
 */
public interface AntecedentRule extends EObject
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getAntecedentRule_Atoms()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getAtoms();

} // AntecedentRule
