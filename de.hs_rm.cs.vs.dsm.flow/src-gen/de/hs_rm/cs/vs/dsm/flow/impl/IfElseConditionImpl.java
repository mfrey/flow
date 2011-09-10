/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.BlockExpression;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.IfElseCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.IfElseConditionImpl#getIfAction <em>If Action</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.IfElseConditionImpl#getElseAction <em>Else Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseConditionImpl extends ConditionalExpressionsImpl implements IfElseCondition
{
  /**
   * The cached value of the '{@link #getIfAction() <em>If Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfAction()
   * @generated
   * @ordered
   */
  protected EList<BlockExpression> ifAction;

  /**
   * The cached value of the '{@link #getElseAction() <em>Else Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseAction()
   * @generated
   * @ordered
   */
  protected EList<BlockExpression> elseAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfElseConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FlowPackage.Literals.IF_ELSE_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockExpression> getIfAction()
  {
    if (ifAction == null)
    {
      ifAction = new EObjectContainmentEList<BlockExpression>(BlockExpression.class, this, FlowPackage.IF_ELSE_CONDITION__IF_ACTION);
    }
    return ifAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockExpression> getElseAction()
  {
    if (elseAction == null)
    {
      elseAction = new EObjectContainmentEList<BlockExpression>(BlockExpression.class, this, FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION);
    }
    return elseAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FlowPackage.IF_ELSE_CONDITION__IF_ACTION:
        return ((InternalEList<?>)getIfAction()).basicRemove(otherEnd, msgs);
      case FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION:
        return ((InternalEList<?>)getElseAction()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FlowPackage.IF_ELSE_CONDITION__IF_ACTION:
        return getIfAction();
      case FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION:
        return getElseAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowPackage.IF_ELSE_CONDITION__IF_ACTION:
        getIfAction().clear();
        getIfAction().addAll((Collection<? extends BlockExpression>)newValue);
        return;
      case FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION:
        getElseAction().clear();
        getElseAction().addAll((Collection<? extends BlockExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FlowPackage.IF_ELSE_CONDITION__IF_ACTION:
        getIfAction().clear();
        return;
      case FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION:
        getElseAction().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FlowPackage.IF_ELSE_CONDITION__IF_ACTION:
        return ifAction != null && !ifAction.isEmpty();
      case FlowPackage.IF_ELSE_CONDITION__ELSE_ACTION:
        return elseAction != null && !elseAction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfElseConditionImpl
