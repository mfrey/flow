/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.InputOperator;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOperatorImpl extends ReturnTypeOperatorImpl implements InputOperator
{
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
  protected InputOperatorImpl()
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
    return FlowPackage.Literals.INPUT_OPERATOR;
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
      iri = new EDataTypeEList<String>(String.class, this, FlowPackage.INPUT_OPERATOR__IRI);
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INPUT_OPERATOR__ADDRESS, oldAddress, address));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INPUT_OPERATOR__PORT, oldPort, port));
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
      case FlowPackage.INPUT_OPERATOR__IRI:
        return getIri();
      case FlowPackage.INPUT_OPERATOR__ADDRESS:
        return getAddress();
      case FlowPackage.INPUT_OPERATOR__PORT:
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
      case FlowPackage.INPUT_OPERATOR__IRI:
        getIri().clear();
        getIri().addAll((Collection<? extends String>)newValue);
        return;
      case FlowPackage.INPUT_OPERATOR__ADDRESS:
        setAddress((String)newValue);
        return;
      case FlowPackage.INPUT_OPERATOR__PORT:
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
      case FlowPackage.INPUT_OPERATOR__IRI:
        getIri().clear();
        return;
      case FlowPackage.INPUT_OPERATOR__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
      case FlowPackage.INPUT_OPERATOR__PORT:
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
      case FlowPackage.INPUT_OPERATOR__IRI:
        return iri != null && !iri.isEmpty();
      case FlowPackage.INPUT_OPERATOR__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
      case FlowPackage.INPUT_OPERATOR__PORT:
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

} //InputOperatorImpl
