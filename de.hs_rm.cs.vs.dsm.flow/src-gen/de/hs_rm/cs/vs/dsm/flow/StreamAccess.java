/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getElement <em>Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getStreamVariable <em>Stream Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamAccess()
 * @model
 * @generated
 */
public interface StreamAccess extends ModelElement, Expression
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(StreamDefinition)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamAccess_Reference()
   * @model
   * @generated
   */
  StreamDefinition getReference();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(StreamDefinition value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(VariableDeclaration)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamAccess_Element()
   * @model
   * @generated
   */
  VariableDeclaration getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Stream Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream Variable</em>' containment reference.
   * @see #setStreamVariable(StreamAccess)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamAccess_StreamVariable()
   * @model containment="true"
   * @generated
   */
  StreamAccess getStreamVariable();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getStreamVariable <em>Stream Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream Variable</em>' containment reference.
   * @see #getStreamVariable()
   * @generated
   */
  void setStreamVariable(StreamAccess value);

} // StreamAccess
