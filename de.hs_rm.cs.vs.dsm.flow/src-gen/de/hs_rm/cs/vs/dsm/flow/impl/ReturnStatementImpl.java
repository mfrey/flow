/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.ReturnStatement;
import de.hs_rm.cs.vs.dsm.flow.ReturnVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.ReturnStatementImpl#getReturnVariable <em>Return Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnStatementImpl extends BlockExpressionImpl implements ReturnStatement
{
  /**
   * The cached value of the '{@link #getReturnVariable() <em>Return Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVariable()
   * @generated
   * @ordered
   */
  protected ReturnVariable returnVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnStatementImpl()
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
    return FlowPackage.Literals.RETURN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnVariable getReturnVariable()
  {
    return returnVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnVariable(ReturnVariable newReturnVariable, NotificationChain msgs)
  {
    ReturnVariable oldReturnVariable = returnVariable;
    returnVariable = newReturnVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE, oldReturnVariable, newReturnVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnVariable(ReturnVariable newReturnVariable)
  {
    if (newReturnVariable != returnVariable)
    {
      NotificationChain msgs = null;
      if (returnVariable != null)
        msgs = ((InternalEObject)returnVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE, null, msgs);
      if (newReturnVariable != null)
        msgs = ((InternalEObject)newReturnVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE, null, msgs);
      msgs = basicSetReturnVariable(newReturnVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE, newReturnVariable, newReturnVariable));
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
      case FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE:
        return basicSetReturnVariable(null, msgs);
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
      case FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE:
        return getReturnVariable();
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
      case FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE:
        setReturnVariable((ReturnVariable)newValue);
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
      case FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE:
        setReturnVariable((ReturnVariable)null);
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
      case FlowPackage.RETURN_STATEMENT__RETURN_VARIABLE:
        return returnVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnStatementImpl
