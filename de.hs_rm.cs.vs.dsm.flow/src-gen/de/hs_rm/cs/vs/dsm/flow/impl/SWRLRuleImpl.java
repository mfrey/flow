/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.Rule;
import de.hs_rm.cs.vs.dsm.flow.SWRLRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SWRL Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl#getAtoms <em>Atoms</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWRLRuleImpl extends MinimalEObjectImpl.Container implements SWRLRule
{
  /**
   * The cached value of the '{@link #getAtoms() <em>Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtoms()
   * @generated
   * @ordered
   */
  protected EList<Rule> atoms;

  /**
   * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequent()
   * @generated
   * @ordered
   */
  protected Rule consequent;

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
  public EList<Rule> getAtoms()
  {
    if (atoms == null)
    {
      atoms = new EObjectContainmentEList<Rule>(Rule.class, this, FlowPackage.SWRL_RULE__ATOMS);
    }
    return atoms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getConsequent()
  {
    return consequent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsequent(Rule newConsequent, NotificationChain msgs)
  {
    Rule oldConsequent = consequent;
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
  public void setConsequent(Rule newConsequent)
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
      case FlowPackage.SWRL_RULE__ATOMS:
        return ((InternalEList<?>)getAtoms()).basicRemove(otherEnd, msgs);
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
      case FlowPackage.SWRL_RULE__ATOMS:
        return getAtoms();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowPackage.SWRL_RULE__ATOMS:
        getAtoms().clear();
        getAtoms().addAll((Collection<? extends Rule>)newValue);
        return;
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        setConsequent((Rule)newValue);
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
      case FlowPackage.SWRL_RULE__ATOMS:
        getAtoms().clear();
        return;
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        setConsequent((Rule)null);
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
      case FlowPackage.SWRL_RULE__ATOMS:
        return atoms != null && !atoms.isEmpty();
      case FlowPackage.SWRL_RULE__CONSEQUENT:
        return consequent != null;
    }
    return super.eIsSet(featureID);
  }

} //SWRLRuleImpl
