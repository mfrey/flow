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
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getInput <em>Input</em>}</li>
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
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSPARQLOperator_Target()
   * @model containment="true"
   * @generated
   */
  StreamAccess getTarget();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(StreamAccess value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(StreamOperatorParameter)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSPARQLOperator_Input()
   * @model containment="true"
   * @generated
   */
  StreamOperatorParameter getInput();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.SPARQLOperator#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(StreamOperatorParameter value);

} // SPARQLOperator
