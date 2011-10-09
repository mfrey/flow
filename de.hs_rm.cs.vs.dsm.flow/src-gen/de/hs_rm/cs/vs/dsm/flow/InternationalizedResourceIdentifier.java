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
 * A representation of the model object '<em><b>Internationalized Resource Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getScheme <em>Scheme</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getAuthority <em>Authority</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getPath <em>Path</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getQuery <em>Query</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getFragmentIRI <em>Fragment IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier()
 * @model
 * @generated
 */
public interface InternationalizedResourceIdentifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Scheme</b></em>' attribute.
   * The literals are from the enumeration {@link de.hs_rm.cs.vs.dsm.flow.Scheme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheme</em>' attribute.
   * @see de.hs_rm.cs.vs.dsm.flow.Scheme
   * @see #setScheme(Scheme)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier_Scheme()
   * @model
   * @generated
   */
  Scheme getScheme();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getScheme <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheme</em>' attribute.
   * @see de.hs_rm.cs.vs.dsm.flow.Scheme
   * @see #getScheme()
   * @generated
   */
  void setScheme(Scheme value);

  /**
   * Returns the value of the '<em><b>Authority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authority</em>' attribute.
   * @see #setAuthority(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier_Authority()
   * @model
   * @generated
   */
  String getAuthority();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getAuthority <em>Authority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authority</em>' attribute.
   * @see #getAuthority()
   * @generated
   */
  void setAuthority(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier_Path()
   * @model unique="false"
   * @generated
   */
  EList<String> getPath();

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

  /**
   * Returns the value of the '<em><b>Fragment IRI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragment IRI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragment IRI</em>' attribute.
   * @see #setFragmentIRI(String)
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getInternationalizedResourceIdentifier_FragmentIRI()
   * @model
   * @generated
   */
  String getFragmentIRI();

  /**
   * Sets the value of the '{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier#getFragmentIRI <em>Fragment IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fragment IRI</em>' attribute.
   * @see #getFragmentIRI()
   * @generated
   */
  void setFragmentIRI(String value);

} // InternationalizedResourceIdentifier
