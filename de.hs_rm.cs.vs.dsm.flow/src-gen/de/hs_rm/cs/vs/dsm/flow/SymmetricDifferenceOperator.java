/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Difference Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSymmetricDifferenceOperator()
 * @model
 * @generated
 */
public interface SymmetricDifferenceOperator extends ReturnTypeOperator
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#getSymmetricDifferenceOperator_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<StreamOperatorParameter> getParameters();

} // SymmetricDifferenceOperator
