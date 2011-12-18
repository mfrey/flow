/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPARQL Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getQuery <em>Query</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSPARQLOperator()
 * @model
 * @generated
 */
public interface SPARQLOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(QueryTagOperator)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSPARQLOperator_Query()
   * @model containment="true"
   * @generated
   */
  QueryTagOperator getQuery();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(QueryTagOperator value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSPARQLOperator_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // SPARQLOperator
