/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.ReturnVariable;
import de.hs_rm.cs.vs.dsm.flow.Returnable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.ReturnVariableImpl#getReturnable <em>Returnable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnVariableImpl extends MinimalEObjectImpl.Container implements ReturnVariable
{
  /**
   * The cached value of the '{@link #getReturnable() <em>Returnable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnable()
   * @generated
   * @ordered
   */
  protected Returnable returnable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnVariableImpl()
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
    return FlowPackage.Literals.RETURN_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Returnable getReturnable()
  {
    if (returnable != null && returnable.eIsProxy())
    {
      InternalEObject oldReturnable = (InternalEObject)returnable;
      returnable = (Returnable)eResolveProxy(oldReturnable);
      if (returnable != oldReturnable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.RETURN_VARIABLE__RETURNABLE, oldReturnable, returnable));
      }
    }
    return returnable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Returnable basicGetReturnable()
  {
    return returnable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnable(Returnable newReturnable)
  {
    Returnable oldReturnable = returnable;
    returnable = newReturnable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RETURN_VARIABLE__RETURNABLE, oldReturnable, returnable));
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
      case FlowPackage.RETURN_VARIABLE__RETURNABLE:
        if (resolve) return getReturnable();
        return basicGetReturnable();
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
      case FlowPackage.RETURN_VARIABLE__RETURNABLE:
        setReturnable((Returnable)newValue);
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
      case FlowPackage.RETURN_VARIABLE__RETURNABLE:
        setReturnable((Returnable)null);
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
      case FlowPackage.RETURN_VARIABLE__RETURNABLE:
        return returnable != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnVariableImpl
