/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Operator Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl#getBarrier <em>Barrier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamOperatorParameterImpl extends MinimalEObjectImpl.Container implements StreamOperatorParameter
{
  /**
   * The cached value of the '{@link #getStream() <em>Stream</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream()
   * @generated
   * @ordered
   */
  protected StreamDefinition stream;

  /**
   * The cached value of the '{@link #getBarrier() <em>Barrier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarrier()
   * @generated
   * @ordered
   */
  protected BarrierOperator barrier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamOperatorParameterImpl()
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
    return FlowPackage.Literals.STREAM_OPERATOR_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDefinition getStream()
  {
    if (stream != null && stream.eIsProxy())
    {
      InternalEObject oldStream = (InternalEObject)stream;
      stream = (StreamDefinition)eResolveProxy(oldStream);
      if (stream != oldStream)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM, oldStream, stream));
      }
    }
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDefinition basicGetStream()
  {
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream(StreamDefinition newStream)
  {
    StreamDefinition oldStream = stream;
    stream = newStream;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM, oldStream, stream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarrierOperator getBarrier()
  {
    return barrier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBarrier(BarrierOperator newBarrier, NotificationChain msgs)
  {
    BarrierOperator oldBarrier = barrier;
    barrier = newBarrier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER, oldBarrier, newBarrier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBarrier(BarrierOperator newBarrier)
  {
    if (newBarrier != barrier)
    {
      NotificationChain msgs = null;
      if (barrier != null)
        msgs = ((InternalEObject)barrier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER, null, msgs);
      if (newBarrier != null)
        msgs = ((InternalEObject)newBarrier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER, null, msgs);
      msgs = basicSetBarrier(newBarrier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER, newBarrier, newBarrier));
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
      case FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER:
        return basicSetBarrier(null, msgs);
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
      case FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM:
        if (resolve) return getStream();
        return basicGetStream();
      case FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER:
        return getBarrier();
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
      case FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM:
        setStream((StreamDefinition)newValue);
        return;
      case FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER:
        setBarrier((BarrierOperator)newValue);
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
      case FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM:
        setStream((StreamDefinition)null);
        return;
      case FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER:
        setBarrier((BarrierOperator)null);
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
      case FlowPackage.STREAM_OPERATOR_PARAMETER__STREAM:
        return stream != null;
      case FlowPackage.STREAM_OPERATOR_PARAMETER__BARRIER:
        return barrier != null;
    }
    return super.eIsSet(featureID);
  }

} //StreamOperatorParameterImpl
