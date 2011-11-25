/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator;

import java.math.BigDecimal;

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
 * An implementation of the model object '<em><b>Subtraction Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getStreamElements <em>Stream Elements</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtractionOperatorImpl extends ReturnTypeOperatorImpl implements SubtractionOperator
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
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final BigDecimal LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected BigDecimal literal = LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getStreamElements() <em>Stream Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamElements()
   * @generated
   * @ordered
   */
  protected EList<StreamAccess> streamElements;

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
  protected SubtractionOperatorImpl()
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
    return FlowPackage.Literals.SUBTRACTION_OPERATOR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__PARAMETER, oldParameter, newParameter);
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
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(BigDecimal newLiteral)
  {
    BigDecimal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StreamAccess> getStreamElements()
  {
    if (streamElements == null)
    {
      streamElements = new EObjectContainmentEList<StreamAccess>(StreamAccess.class, this, FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS);
    }
    return streamElements;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__STREAM, oldStream, newStream);
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
        msgs = ((InternalEObject)stream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__STREAM, null, msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__STREAM, null, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__STREAM, newStream, newStream));
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        return basicSetParameter(null, msgs);
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS:
        return ((InternalEList<?>)getStreamElements()).basicRemove(otherEnd, msgs);
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM:
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        return getParameter();
      case FlowPackage.SUBTRACTION_OPERATOR__LITERAL:
        return getLiteral();
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS:
        return getStreamElements();
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM:
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        setParameter((StreamAccess)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__LITERAL:
        setLiteral((BigDecimal)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS:
        getStreamElements().clear();
        getStreamElements().addAll((Collection<? extends StreamAccess>)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM:
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        setParameter((StreamAccess)null);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS:
        getStreamElements().clear();
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM:
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        return parameter != null;
      case FlowPackage.SUBTRACTION_OPERATOR__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENTS:
        return streamElements != null && !streamElements.isEmpty();
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM:
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
    result.append(" (literal: ");
    result.append(literal);
    result.append(')');
    return result.toString();
  }

} //SubtractionOperatorImpl
