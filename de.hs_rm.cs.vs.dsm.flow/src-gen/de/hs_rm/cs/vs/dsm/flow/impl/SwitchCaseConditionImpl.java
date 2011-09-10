/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.CaseStatement;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.SwitchCaseCondition;

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
 * An implementation of the model object '<em><b>Switch Case Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SwitchCaseConditionImpl#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SwitchCaseConditionImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchCaseConditionImpl extends ConditionalExpressionsImpl implements SwitchCaseCondition
{
  /**
   * The cached value of the '{@link #getCaseExpression() <em>Case Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseExpression()
   * @generated
   * @ordered
   */
  protected EList<CaseStatement> caseExpression;

  /**
   * The cached value of the '{@link #getDefaultExpression() <em>Default Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultExpression()
   * @generated
   * @ordered
   */
  protected Expression defaultExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchCaseConditionImpl()
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
    return FlowPackage.Literals.SWITCH_CASE_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseStatement> getCaseExpression()
  {
    if (caseExpression == null)
    {
      caseExpression = new EObjectContainmentEList<CaseStatement>(CaseStatement.class, this, FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION);
    }
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefaultExpression()
  {
    return defaultExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultExpression(Expression newDefaultExpression, NotificationChain msgs)
  {
    Expression oldDefaultExpression = defaultExpression;
    defaultExpression = newDefaultExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION, oldDefaultExpression, newDefaultExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultExpression(Expression newDefaultExpression)
  {
    if (newDefaultExpression != defaultExpression)
    {
      NotificationChain msgs = null;
      if (defaultExpression != null)
        msgs = ((InternalEObject)defaultExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION, null, msgs);
      if (newDefaultExpression != null)
        msgs = ((InternalEObject)newDefaultExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION, null, msgs);
      msgs = basicSetDefaultExpression(newDefaultExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION, newDefaultExpression, newDefaultExpression));
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
      case FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION:
        return ((InternalEList<?>)getCaseExpression()).basicRemove(otherEnd, msgs);
      case FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION:
        return basicSetDefaultExpression(null, msgs);
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
      case FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION:
        return getCaseExpression();
      case FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION:
        return getDefaultExpression();
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
      case FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION:
        getCaseExpression().clear();
        getCaseExpression().addAll((Collection<? extends CaseStatement>)newValue);
        return;
      case FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION:
        setDefaultExpression((Expression)newValue);
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
      case FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION:
        getCaseExpression().clear();
        return;
      case FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION:
        setDefaultExpression((Expression)null);
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
      case FlowPackage.SWITCH_CASE_CONDITION__CASE_EXPRESSION:
        return caseExpression != null && !caseExpression.isEmpty();
      case FlowPackage.SWITCH_CASE_CONDITION__DEFAULT_EXPRESSION:
        return defaultExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchCaseConditionImpl
