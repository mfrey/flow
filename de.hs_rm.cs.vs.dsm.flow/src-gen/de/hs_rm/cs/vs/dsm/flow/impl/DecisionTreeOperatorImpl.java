/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute;
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;

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
 * An implementation of the model object '<em><b>Decision Tree Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getTau <em>Tau</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getBarrier <em>Barrier</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getClassAttributes <em>Class Attributes</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.DecisionTreeOperatorImpl#getStream <em>Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionTreeOperatorImpl extends ModelElementImpl implements DecisionTreeOperator
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<DecisionTreeAttribute> attributes;

  /**
   * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DELTA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected BigDecimal delta = DELTA_EDEFAULT;

  /**
   * The default value of the '{@link #getTau() <em>Tau</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTau()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TAU_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTau() <em>Tau</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTau()
   * @generated
   * @ordered
   */
  protected BigDecimal tau = TAU_EDEFAULT;

  /**
   * The default value of the '{@link #getBarrier() <em>Barrier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarrier()
   * @generated
   * @ordered
   */
  protected static final BigDecimal BARRIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBarrier() <em>Barrier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBarrier()
   * @generated
   * @ordered
   */
  protected BigDecimal barrier = BARRIER_EDEFAULT;

  /**
   * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected static final BigDecimal FREQUENCY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected BigDecimal frequency = FREQUENCY_EDEFAULT;

  /**
   * The cached value of the '{@link #getClassAttributes() <em>Class Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassAttributes()
   * @generated
   * @ordered
   */
  protected EList<DecisionTreeAttribute> classAttributes;

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
  protected DecisionTreeOperatorImpl()
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
    return FlowPackage.Literals.DECISION_TREE_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecisionTreeAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<DecisionTreeAttribute>(DecisionTreeAttribute.class, this, FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getDelta()
  {
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelta(BigDecimal newDelta)
  {
    BigDecimal oldDelta = delta;
    delta = newDelta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__DELTA, oldDelta, delta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getTau()
  {
    return tau;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTau(BigDecimal newTau)
  {
    BigDecimal oldTau = tau;
    tau = newTau;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__TAU, oldTau, tau));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getBarrier()
  {
    return barrier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBarrier(BigDecimal newBarrier)
  {
    BigDecimal oldBarrier = barrier;
    barrier = newBarrier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__BARRIER, oldBarrier, barrier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getFrequency()
  {
    return frequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrequency(BigDecimal newFrequency)
  {
    BigDecimal oldFrequency = frequency;
    frequency = newFrequency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__FREQUENCY, oldFrequency, frequency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecisionTreeAttribute> getClassAttributes()
  {
    if (classAttributes == null)
    {
      classAttributes = new EObjectContainmentEList<DecisionTreeAttribute>(DecisionTreeAttribute.class, this, FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES);
    }
    return classAttributes;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__STREAM, oldStream, newStream);
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
        msgs = ((InternalEObject)stream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.DECISION_TREE_OPERATOR__STREAM, null, msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.DECISION_TREE_OPERATOR__STREAM, null, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.DECISION_TREE_OPERATOR__STREAM, newStream, newStream));
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
      case FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES:
        return ((InternalEList<?>)getClassAttributes()).basicRemove(otherEnd, msgs);
      case FlowPackage.DECISION_TREE_OPERATOR__STREAM:
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
      case FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES:
        return getAttributes();
      case FlowPackage.DECISION_TREE_OPERATOR__DELTA:
        return getDelta();
      case FlowPackage.DECISION_TREE_OPERATOR__TAU:
        return getTau();
      case FlowPackage.DECISION_TREE_OPERATOR__BARRIER:
        return getBarrier();
      case FlowPackage.DECISION_TREE_OPERATOR__FREQUENCY:
        return getFrequency();
      case FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES:
        return getClassAttributes();
      case FlowPackage.DECISION_TREE_OPERATOR__STREAM:
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
      case FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends DecisionTreeAttribute>)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__DELTA:
        setDelta((BigDecimal)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__TAU:
        setTau((BigDecimal)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__BARRIER:
        setBarrier((BigDecimal)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__FREQUENCY:
        setFrequency((BigDecimal)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES:
        getClassAttributes().clear();
        getClassAttributes().addAll((Collection<? extends DecisionTreeAttribute>)newValue);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__STREAM:
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
      case FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES:
        getAttributes().clear();
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__DELTA:
        setDelta(DELTA_EDEFAULT);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__TAU:
        setTau(TAU_EDEFAULT);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__BARRIER:
        setBarrier(BARRIER_EDEFAULT);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__FREQUENCY:
        setFrequency(FREQUENCY_EDEFAULT);
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES:
        getClassAttributes().clear();
        return;
      case FlowPackage.DECISION_TREE_OPERATOR__STREAM:
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
      case FlowPackage.DECISION_TREE_OPERATOR__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case FlowPackage.DECISION_TREE_OPERATOR__DELTA:
        return DELTA_EDEFAULT == null ? delta != null : !DELTA_EDEFAULT.equals(delta);
      case FlowPackage.DECISION_TREE_OPERATOR__TAU:
        return TAU_EDEFAULT == null ? tau != null : !TAU_EDEFAULT.equals(tau);
      case FlowPackage.DECISION_TREE_OPERATOR__BARRIER:
        return BARRIER_EDEFAULT == null ? barrier != null : !BARRIER_EDEFAULT.equals(barrier);
      case FlowPackage.DECISION_TREE_OPERATOR__FREQUENCY:
        return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
      case FlowPackage.DECISION_TREE_OPERATOR__CLASS_ATTRIBUTES:
        return classAttributes != null && !classAttributes.isEmpty();
      case FlowPackage.DECISION_TREE_OPERATOR__STREAM:
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
    result.append(" (delta: ");
    result.append(delta);
    result.append(", tau: ");
    result.append(tau);
    result.append(", barrier: ");
    result.append(barrier);
    result.append(", frequency: ");
    result.append(frequency);
    result.append(')');
    return result.toString();
  }

} //DecisionTreeOperatorImpl
