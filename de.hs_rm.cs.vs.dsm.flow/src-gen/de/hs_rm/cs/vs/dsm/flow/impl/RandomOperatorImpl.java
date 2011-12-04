/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.RandomOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.RandomOperatorImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.RandomOperatorImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.RandomOperatorImpl#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RandomOperatorImpl extends ReturnTypeOperatorImpl implements RandomOperator
{
  /**
   * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected static final BigDecimal MAXIMUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected BigDecimal maximum = MAXIMUM_EDEFAULT;

  /**
   * The default value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSleep()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SLEEP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSleep()
   * @generated
   * @ordered
   */
  protected BigDecimal sleep = SLEEP_EDEFAULT;

  /**
   * The cached value of the '{@link #getStream() <em>Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream()
   * @generated
   * @ordered
   */
  protected StreamOperatorParameter stream;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RandomOperatorImpl()
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
    return FlowPackage.Literals.RANDOM_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getMaximum()
  {
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaximum(BigDecimal newMaximum)
  {
    BigDecimal oldMaximum = maximum;
    maximum = newMaximum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RANDOM_OPERATOR__MAXIMUM, oldMaximum, maximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getSleep()
  {
    return sleep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSleep(BigDecimal newSleep)
  {
    BigDecimal oldSleep = sleep;
    sleep = newSleep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RANDOM_OPERATOR__SLEEP, oldSleep, sleep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamOperatorParameter getStream()
  {
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStream(StreamOperatorParameter newStream, NotificationChain msgs)
  {
    StreamOperatorParameter oldStream = stream;
    stream = newStream;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.RANDOM_OPERATOR__STREAM, oldStream, newStream);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream(StreamOperatorParameter newStream)
  {
    if (newStream != stream)
    {
      NotificationChain msgs = null;
      if (stream != null)
        msgs = ((InternalEObject)stream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.RANDOM_OPERATOR__STREAM, null, msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.RANDOM_OPERATOR__STREAM, null, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RANDOM_OPERATOR__STREAM, newStream, newStream));
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
      case FlowPackage.RANDOM_OPERATOR__STREAM:
        return basicSetStream(null, msgs);
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
      case FlowPackage.RANDOM_OPERATOR__MAXIMUM:
        return getMaximum();
      case FlowPackage.RANDOM_OPERATOR__SLEEP:
        return getSleep();
      case FlowPackage.RANDOM_OPERATOR__STREAM:
        return getStream();
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
      case FlowPackage.RANDOM_OPERATOR__MAXIMUM:
        setMaximum((BigDecimal)newValue);
        return;
      case FlowPackage.RANDOM_OPERATOR__SLEEP:
        setSleep((BigDecimal)newValue);
        return;
      case FlowPackage.RANDOM_OPERATOR__STREAM:
        setStream((StreamOperatorParameter)newValue);
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
      case FlowPackage.RANDOM_OPERATOR__MAXIMUM:
        setMaximum(MAXIMUM_EDEFAULT);
        return;
      case FlowPackage.RANDOM_OPERATOR__SLEEP:
        setSleep(SLEEP_EDEFAULT);
        return;
      case FlowPackage.RANDOM_OPERATOR__STREAM:
        setStream((StreamOperatorParameter)null);
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
      case FlowPackage.RANDOM_OPERATOR__MAXIMUM:
        return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
      case FlowPackage.RANDOM_OPERATOR__SLEEP:
        return SLEEP_EDEFAULT == null ? sleep != null : !SLEEP_EDEFAULT.equals(sleep);
      case FlowPackage.RANDOM_OPERATOR__STREAM:
        return stream != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (maximum: ");
    result.append(maximum);
    result.append(", sleep: ");
    result.append(sleep);
    result.append(')');
    return result.toString();
  }

} //RandomOperatorImpl
