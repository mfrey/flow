/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

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
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getUri <em>Uri</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getAttribute <em>Attribute</em>}</li>
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
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSparqlQuery_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

} // SparqlQuery
