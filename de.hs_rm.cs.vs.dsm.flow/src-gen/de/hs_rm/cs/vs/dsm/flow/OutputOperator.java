/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getLocation <em>Location</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator()
 * @model
 * @generated
 */
public interface OutputOperator extends NoReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(OutputOperatorParameter)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Parameter()
   * @model containment="true"
   * @generated
   */
  OutputOperatorParameter getParameter();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(OutputOperatorParameter value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Stream</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getOutputOperator_Stream()
   * @model containment="true"
   * @generated
   */
  EList<StreamOperatorParameter> getStream();

} // OutputOperator
