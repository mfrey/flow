/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.AntecedentRule;
import de.hs_rm.cs.vs.dsm.flow.ConsequentRule;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.SWRLRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SWRL Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWRLRuleImpl extends MinimalEObjectImpl.Container implements SWRLRule
{
  /**
   * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntecedent()
   * @generated
   * @ordered
   */
  protected AntecedentRule antecedent;

  /**
   * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequent()
   * @generated
   * @ordered
   */
  protected ConsequentRule consequent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SWRLRuleImpl()
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
    return FlowPackage.Literals.SWRL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntecedentRule getAntecedent()
  {
    return antecedent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAntecedent(AntecedentRule newAntecedent, NotificationChain msgs)
  {
    AntecedentRule oldAntecedent = antecedent;
    antecedent = newAntecedent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_RULE__ANTECEDENT, oldAntecedent, newAntecedent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntecedent(AntecedentRule newAntecedent)
  {
    if (newAntecedent != antecedent)
    {
      NotificationChain msgs = null;
      if (antecedent != null)
        msgs = ((InternalEObject)antecedent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_RULE__ANTECEDENT, null, msgs);
      if (newAntecedent != null)
        msgs = ((InternalEObject)newAntecedent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_RULE__ANTECEDENT, null, msgs);
      msgs = basicSetAntecedent(newAntecedent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_RULE__ANTECEDENT, newAntecedent, newAntecedent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsequentRule getConsequent()
  {
    return consequent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequent(ConsequentRule newConsequent, NotificationChain msgs)
  {
    ConsequentRule oldConsequent = consequent;
    consequent = newConsequent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_RULE__CONSEQUENT, oldConsequent, newConsequent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsequent(ConsequentRule newConsequent)
  {
    if (newConsequent != consequent)
    {
      NotificationChain msgs = null;
      if (consequent != null)
        msgs = ((InternalEObject)consequent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_RULE__CONSEQUENT, null, msgs);
      if (newConsequent != null)
        msgs = ((InternalEObject)newConsequent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWRL_RULE__CONSEQUENT, null, msgs);
      msgs = basicSetConsequent(newConsequent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SWRL_RULE__CONSEQUENT, newConsequent, newConsequent));
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
      case FlowPackage.SWRL_RULE__ANTECEDENT:
        return basicSetAntecedent(null, msgs);
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        return basicSetConsequent(null, msgs);
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
      case FlowPackage.SWRL_RULE__ANTECEDENT:
        return getAntecedent();
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        return getConsequent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowPackage.SWRL_RULE__ANTECEDENT:
        setAntecedent((AntecedentRule)newValue);
        return;
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        setConsequent((ConsequentRule)newValue);
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
      case FlowPackage.SWRL_RULE__ANTECEDENT:
        setAntecedent((AntecedentRule)null);
        return;
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        setConsequent((ConsequentRule)null);
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
      case FlowPackage.SWRL_RULE__ANTECEDENT:
        return antecedent != null;
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        return consequent != null;
    }
    return super.eIsSet(featureID);
  }

} //SWRLRuleImpl
