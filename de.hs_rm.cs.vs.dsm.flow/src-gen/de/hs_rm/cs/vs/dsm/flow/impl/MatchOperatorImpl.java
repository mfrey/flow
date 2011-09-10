/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.MatchOperator;
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
 * An implementation of the model object '<em><b>Match Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl#getCalculation <em>Calculation</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchOperatorImpl extends ReturnTypeOperatorImpl implements MatchOperator
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getCalculation() <em>Calculation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculation()
   * @generated
   * @ordered
   */
  protected Expression calculation;

  /**
   * The cached value of the '{@link #getStream() <em>Stream</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream()
   * @generated
   * @ordered
   */
  protected EList<StreamOperatorParameter> stream;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchOperatorImpl()
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
    return FlowPackage.Literals.MATCH_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.MATCH_OPERATOR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.MATCH_OPERATOR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.MATCH_OPERATOR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.MATCH_OPERATOR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCalculation()
  {
    return calculation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalculation(Expression newCalculation, NotificationChain msgs)
  {
    Expression oldCalculation = calculation;
    calculation = newCalculation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.MATCH_OPERATOR__CALCULATION, oldCalculation, newCalculation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalculation(Expression newCalculation)
  {
    if (newCalculation != calculation)
    {
      NotificationChain msgs = null;
      if (calculation != null)
        msgs = ((InternalEObject)calculation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.MATCH_OPERATOR__CALCULATION, null, msgs);
      if (newCalculation != null)
        msgs = ((InternalEObject)newCalculation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.MATCH_OPERATOR__CALCULATION, null, msgs);
      msgs = basicSetCalculation(newCalculation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.MATCH_OPERATOR__CALCULATION, newCalculation, newCalculation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StreamOperatorParameter> getStream()
  {
    if (stream == null)
    {
      stream = new EObjectContainmentEList<StreamOperatorParameter>(StreamOperatorParameter.class, this, FlowPackage.MATCH_OPERATOR__STREAM);
    }
    return stream;
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
      case FlowPackage.MATCH_OPERATOR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case FlowPackage.MATCH_OPERATOR__CALCULATION:
        return basicSetCalculation(null, msgs);
      case FlowPackage.MATCH_OPERATOR__STREAM:
        return ((InternalEList<?>)getStream()).basicRemove(otherEnd, msgs);
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
      case FlowPackage.MATCH_OPERATOR__EXPRESSION:
        return getExpression();
      case FlowPackage.MATCH_OPERATOR__CALCULATION:
        return getCalculation();
      case FlowPackage.MATCH_OPERATOR__STREAM:
        return getStream();
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
      case FlowPackage.MATCH_OPERATOR__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case FlowPackage.MATCH_OPERATOR__CALCULATION:
        setCalculation((Expression)newValue);
        return;
      case FlowPackage.MATCH_OPERATOR__STREAM:
        getStream().clear();
        getStream().addAll((Collection<? extends StreamOperatorParameter>)newValue);
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
      case FlowPackage.MATCH_OPERATOR__EXPRESSION:
        setExpression((Expression)null);
        return;
      case FlowPackage.MATCH_OPERATOR__CALCULATION:
        setCalculation((Expression)null);
        return;
      case FlowPackage.MATCH_OPERATOR__STREAM:
        getStream().clear();
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
      case FlowPackage.MATCH_OPERATOR__EXPRESSION:
        return expression != null;
      case FlowPackage.MATCH_OPERATOR__CALCULATION:
        return calculation != null;
      case FlowPackage.MATCH_OPERATOR__STREAM:
        return stream != null && !stream.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MatchOperatorImpl
