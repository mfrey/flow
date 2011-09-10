/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getLocation <em>Location</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getRegexp <em>Regexp</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator()
 * @model
 * @generated
 */
public interface InputOperator extends ReturnTypeOperator
{
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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Regexp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regexp</em>' attribute.
   * @see #setRegexp(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Regexp()
   * @model
   * @generated
   */
  String getRegexp();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getRegexp <em>Regexp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regexp</em>' attribute.
   * @see #getRegexp()
   * @generated
   */
  void setRegexp(String value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(StreamDeclaration)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInputOperator_Model()
   * @model
   * @generated
   */
  StreamDeclaration getModel();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(StreamDeclaration value);

} // InputOperator
