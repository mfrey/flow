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
 * A representation of the model object '<em><b>Sparql Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery()
 * @model
 * @generated
 */
public interface SparqlQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(SparqlQueryVariable)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Variable()
   * @model containment="true"
   * @generated
   */
  SparqlQueryVariable getVariable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(SparqlQueryVariable value);

  /**
   * Returns the value of the '<em><b>Subject</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Subject()
   * @model unique="false"
   * @generated
   */
  EList<String> getSubject();

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Predicate()
   * @model unique="false"
   * @generated
   */
  EList<String> getPredicate();

  /**
   * Returns the value of the '<em><b>Object</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Object()
   * @model unique="false"
   * @generated
   */
  EList<String> getObject();

} // SparqlQuery
