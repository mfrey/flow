/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.SWRLOperator;
import de.hs_rm.cs.vs.dsm.flow.SWRLRule;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SWRL Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl#getBarrier <em>Barrier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWRLOperatorImpl extends ReturnTypeOperatorImpl implements SWRLOperator
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected SWRLRule rule;

  /**
   * The cached value of the '{@link #getBarrier() <em>Barrier</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarrier()
   * @generated
   * @ordered
   */
  protected EList<StreamOperatorParameter> barrier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SWRLOperatorImpl()
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
    return FlowPackage.Literals.SWRL_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWRLRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(SWRLRule newRule, NotificationChain msgs)
  {
    SWRLRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_OPERATOR__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(SWRLRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_OPERATOR__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_OPERATOR__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_OPERATOR__RULE, newRule, newRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StreamOperatorParameter> getBarrier()
  {
    if (barrier == null)
    {
      barrier = new EObjectContainmentEList<StreamOperatorParameter>(StreamOperatorParameter.class, this, FlowPackage.SWRL_OPERATOR__BARRIER);
    }
    return barrier;
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
      case FlowPackage.SWRL_OPERATOR__RULE:
        return basicSetRule(null, msgs);
      case FlowPackage.SWRL_OPERATOR__BARRIER:
        return ((InternalEList<?>)getBarrier()).basicRemove(otherEnd, msgs);
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
      case FlowPackage.SWRL_OPERATOR__RULE:
        return getRule();
      case FlowPackage.SWRL_OPERATOR__BARRIER:
        return getBarrier();
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
      case FlowPackage.SWRL_OPERATOR__RULE:
        setRule((SWRLRule)newValue);
        return;
      case FlowPackage.SWRL_OPERATOR__BARRIER:
        getBarrier().clear();
        getBarrier().addAll((Collection<? extends StreamOperatorParameter>)newValue);
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
      case FlowPackage.SWRL_OPERATOR__RULE:
        setRule((SWRLRule)null);
        return;
      case FlowPackage.SWRL_OPERATOR__BARRIER:
        getBarrier().clear();
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
      case FlowPackage.SWRL_OPERATOR__RULE:
        return rule != null;
      case FlowPackage.SWRL_OPERATOR__BARRIER:
        return barrier != null && !barrier.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SWRLOperatorImpl
