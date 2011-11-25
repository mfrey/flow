/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.AdditionOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addition Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl#getLiteralList <em>Literal List</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl#getStreamElementList <em>Stream Element List</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionOperatorImpl extends ReturnTypeOperatorImpl implements AdditionOperator
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected StreamAccess parameter;

  /**
   * The cached value of the '{@link #getLiteralList() <em>Literal List</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteralList()
   * @generated
   * @ordered
   */
  protected EList<BigDecimal> literalList;

  /**
   * The cached value of the '{@link #getStreamElementList() <em>Stream Element List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamElementList()
   * @generated
   * @ordered
   */
  protected EList<StreamAccess> streamElementList;

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
  protected AdditionOperatorImpl()
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
    return FlowPackage.Literals.ADDITION_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamAccess getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(StreamAccess newParameter, NotificationChain msgs)
  {
    StreamAccess oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.ADDITION_OPERATOR__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(StreamAccess newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ADDITION_OPERATOR__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ADDITION_OPERATOR__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ADDITION_OPERATOR__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BigDecimal> getLiteralList()
  {
    if (literalList == null)
    {
      literalList = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, FlowPackage.ADDITION_OPERATOR__LITERAL_LIST);
    }
    return literalList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StreamAccess> getStreamElementList()
  {
    if (streamElementList == null)
    {
      streamElementList = new EObjectContainmentEList<StreamAccess>(StreamAccess.class, this, FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST);
    }
    return streamElementList;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.ADDITION_OPERATOR__STREAM, oldStream, newStream);
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
        msgs = ((InternalEObject)stream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ADDITION_OPERATOR__STREAM, null, msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ADDITION_OPERATOR__STREAM, null, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ADDITION_OPERATOR__STREAM, newStream, newStream));
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
      case FlowPackage.ADDITION_OPERATOR__PARAMETER:
        return basicSetParameter(null, msgs);
      case FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST:
        return ((InternalEList<?>)getStreamElementList()).basicRemove(otherEnd, msgs);
      case FlowPackage.ADDITION_OPERATOR__STREAM:
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
      case FlowPackage.ADDITION_OPERATOR__PARAMETER:
        return getParameter();
      case FlowPackage.ADDITION_OPERATOR__LITERAL_LIST:
        return getLiteralList();
      case FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST:
        return getStreamElementList();
      case FlowPackage.ADDITION_OPERATOR__STREAM:
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
      case FlowPackage.ADDITION_OPERATOR__PARAMETER:
        setParameter((StreamAccess)newValue);
        return;
      case FlowPackage.ADDITION_OPERATOR__LITERAL_LIST:
        getLiteralList().clear();
        getLiteralList().addAll((Collection<? extends BigDecimal>)newValue);
        return;
      case FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST:
        getStreamElementList().clear();
        getStreamElementList().addAll((Collection<? extends StreamAccess>)newValue);
        return;
      case FlowPackage.ADDITION_OPERATOR__STREAM:
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
      case FlowPackage.ADDITION_OPERATOR__PARAMETER:
        setParameter((StreamAccess)null);
        return;
      case FlowPackage.ADDITION_OPERATOR__LITERAL_LIST:
        getLiteralList().clear();
        return;
      case FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST:
        getStreamElementList().clear();
        return;
      case FlowPackage.ADDITION_OPERATOR__STREAM:
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
      case FlowPackage.ADDITION_OPERATOR__PARAMETER:
        return parameter != null;
      case FlowPackage.ADDITION_OPERATOR__LITERAL_LIST:
        return literalList != null && !literalList.isEmpty();
      case FlowPackage.ADDITION_OPERATOR__STREAM_ELEMENT_LIST:
        return streamElementList != null && !streamElementList.isEmpty();
      case FlowPackage.ADDITION_OPERATOR__STREAM:
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
    result.append(" (literalList: ");
    result.append(literalList);
    result.append(')');
    return result.toString();
  }

} //AdditionOperatorImpl
