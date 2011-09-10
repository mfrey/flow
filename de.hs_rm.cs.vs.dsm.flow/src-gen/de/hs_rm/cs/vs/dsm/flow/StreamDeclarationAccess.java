/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Declaration Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamDeclarationAccess()
 * @model
 * @generated
 */
public interface StreamDeclarationAccess extends EObject
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
   * @see #setReference(StreamDeclaration)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamDeclarationAccess_Reference()
   * @model
   * @generated
   */
  StreamDeclaration getReference();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(StreamDeclaration value);

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
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getStreamDeclarationAccess_Element()
   * @model
   * @generated
   */
  VariableDeclaration getElement();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(VariableDeclaration value);

} // StreamDeclarationAccess
