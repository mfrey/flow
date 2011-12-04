/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Tag Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQueryType <em>Query Type</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getQueryTagOperator()
 * @model
 * @generated
 */
public interface QueryTagOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Query Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Type</em>' attribute.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryType
   * @see #setQueryType(SparqlQueryType)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getQueryTagOperator_QueryType()
   * @model
   * @generated
   */
  SparqlQueryType getQueryType();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQueryType <em>Query Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Type</em>' attribute.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryType
   * @see #getQueryType()
   * @generated
   */
  void setQueryType(SparqlQueryType value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(SparqlQuery)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getQueryTagOperator_Query()
   * @model containment="true"
   * @generated
   */
  SparqlQuery getQuery();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(SparqlQuery value);

} // QueryTagOperator
