/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl#getStreamVariable <em>Stream Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamAccessImpl extends ProcessingExpressionImpl implements StreamAccess
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected StreamDefinition reference;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected VariableDeclaration element;

  /**
   * The cached value of the '{@link #getStreamVariable() <em>Stream Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamVariable()
   * @generated
   * @ordered
   */
  protected StreamAccess streamVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamAccessImpl()
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
    return FlowPackage.Literals.STREAM_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDefinition getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (StreamDefinition)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.STREAM_ACCESS__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDefinition basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(StreamDefinition newReference)
  {
    StreamDefinition oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_ACCESS__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (VariableDeclaration)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.STREAM_ACCESS__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(VariableDeclaration newElement)
  {
    VariableDeclaration oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_ACCESS__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamAccess getStreamVariable()
  {
    return streamVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStreamVariable(StreamAccess newStreamVariable, NotificationChain msgs)
  {
    StreamAccess oldStreamVariable = streamVariable;
    streamVariable = newStreamVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_ACCESS__STREAM_VARIABLE, oldStreamVariable, newStreamVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreamVariable(StreamAccess newStreamVariable)
  {
    if (newStreamVariable != streamVariable)
    {
      NotificationChain msgs = null;
      if (streamVariable != null)
        msgs = ((InternalEObject)streamVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM_ACCESS__STREAM_VARIABLE, null, msgs);
      if (newStreamVariable != null)
        msgs = ((InternalEObject)newStreamVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM_ACCESS__STREAM_VARIABLE, null, msgs);
      msgs = basicSetStreamVariable(newStreamVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM_ACCESS__STREAM_VARIABLE, newStreamVariable, newStreamVariable));
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
      case FlowPackage.STREAM_ACCESS__STREAM_VARIABLE:
        return basicSetStreamVariable(null, msgs);
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
      case FlowPackage.STREAM_ACCESS__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case FlowPackage.STREAM_ACCESS__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case FlowPackage.STREAM_ACCESS__STREAM_VARIABLE:
        return getStreamVariable();
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
      case FlowPackage.STREAM_ACCESS__REFERENCE:
        setReference((StreamDefinition)newValue);
        return;
      case FlowPackage.STREAM_ACCESS__ELEMENT:
        setElement((VariableDeclaration)newValue);
        return;
      case FlowPackage.STREAM_ACCESS__STREAM_VARIABLE:
        setStreamVariable((StreamAccess)newValue);
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
      case FlowPackage.STREAM_ACCESS__REFERENCE:
        setReference((StreamDefinition)null);
        return;
      case FlowPackage.STREAM_ACCESS__ELEMENT:
        setElement((VariableDeclaration)null);
        return;
      case FlowPackage.STREAM_ACCESS__STREAM_VARIABLE:
        setStreamVariable((StreamAccess)null);
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
      case FlowPackage.STREAM_ACCESS__REFERENCE:
        return reference != null;
      case FlowPackage.STREAM_ACCESS__ELEMENT:
        return element != null;
      case FlowPackage.STREAM_ACCESS__STREAM_VARIABLE:
        return streamVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //StreamAccessImpl
