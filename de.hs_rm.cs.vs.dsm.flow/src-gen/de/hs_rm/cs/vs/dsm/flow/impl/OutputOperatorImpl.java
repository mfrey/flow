/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputOperatorImpl extends NoReturnTypeOperatorImpl implements OutputOperator
{
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
   * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIri()
   * @generated
   * @ordered
   */
  protected EList<String> iri;

  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final BigDecimal PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected BigDecimal port = PORT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputOperatorImpl()
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
    return FlowPackage.Literals.OUTPUT_OPERATOR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.OUTPUT_OPERATOR__STREAM, oldStream, newStream);
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
        msgs = ((InternalEObject)stream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.OUTPUT_OPERATOR__STREAM, null, msgs);
      if (newStream != null)
        msgs = ((InternalEObject)newStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.OUTPUT_OPERATOR__STREAM, null, msgs);
      msgs = basicSetStream(newStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OUTPUT_OPERATOR__STREAM, newStream, newStream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIri()
  {
    if (iri == null)
    {
      iri = new EDataTypeEList<String>(String.class, this, FlowPackage.OUTPUT_OPERATOR__IRI);
    }
    return iri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OUTPUT_OPERATOR__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(BigDecimal newPort)
  {
    BigDecimal oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OUTPUT_OPERATOR__PORT, oldPort, port));
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
      case FlowPackage.OUTPUT_OPERATOR__STREAM:
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
      case FlowPackage.OUTPUT_OPERATOR__STREAM:
        return getStream();
      case FlowPackage.OUTPUT_OPERATOR__IRI:
        return getIri();
      case FlowPackage.OUTPUT_OPERATOR__ADDRESS:
        return getAddress();
      case FlowPackage.OUTPUT_OPERATOR__PORT:
        return getPort();
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
      case FlowPackage.OUTPUT_OPERATOR__STREAM:
        setStream((StreamOperatorParameter)newValue);
        return;
      case FlowPackage.OUTPUT_OPERATOR__IRI:
        getIri().clear();
        getIri().addAll((Collection<? extends String>)newValue);
        return;
      case FlowPackage.OUTPUT_OPERATOR__ADDRESS:
        setAddress((String)newValue);
        return;
      case FlowPackage.OUTPUT_OPERATOR__PORT:
        setPort((BigDecimal)newValue);
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
      case FlowPackage.OUTPUT_OPERATOR__STREAM:
        setStream((StreamOperatorParameter)null);
        return;
      case FlowPackage.OUTPUT_OPERATOR__IRI:
        getIri().clear();
        return;
      case FlowPackage.OUTPUT_OPERATOR__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
      case FlowPackage.OUTPUT_OPERATOR__PORT:
        setPort(PORT_EDEFAULT);
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
      case FlowPackage.OUTPUT_OPERATOR__STREAM:
        return stream != null;
      case FlowPackage.OUTPUT_OPERATOR__IRI:
        return iri != null && !iri.isEmpty();
      case FlowPackage.OUTPUT_OPERATOR__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
      case FlowPackage.OUTPUT_OPERATOR__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
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
    result.append(" (iri: ");
    result.append(iri);
    result.append(", address: ");
    result.append(address);
    result.append(", port: ");
    result.append(port);
    result.append(')');
    return result.toString();
  }

} //OutputOperatorImpl
