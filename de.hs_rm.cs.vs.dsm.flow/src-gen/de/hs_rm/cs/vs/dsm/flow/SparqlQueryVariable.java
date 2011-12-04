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
 * A representation of the model object '<em><b>Sparql Query Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQueryVariable()
 * @model
 * @generated
 */
public interface SparqlQueryVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQueryVariable_Variable()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariable();

} // SparqlQueryVariable
