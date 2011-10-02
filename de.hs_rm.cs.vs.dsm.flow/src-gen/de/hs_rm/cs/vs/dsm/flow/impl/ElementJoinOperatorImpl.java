/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.VariableDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Join Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl#getElementParameters <em>Element Parameters</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl#getVariableElementParameters <em>Variable Element Parameters</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementJoinOperatorImpl extends ReturnTypeOperatorImpl implements ElementJoinOperator
{
  /**
   * The cached value of the '{@link #getElementParameters() <em>Element Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementParameters()
   * @generated
   * @ordered
   */
  protected EList<StreamAccess> elementParameters;

  /**
   * The cached value of the '{@link #getVariableElementParameters() <em>Variable Element Parameters</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableElementParameters()
   * @generated
   * @ordered
   */
  protected EList<VariableDefinition> variableElementParameters;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected StreamOperatorParameter parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementJoinOperatorImpl()
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
    return FlowPackage.Literals.ELEMENT_JOIN_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StreamAccess> getElementParameters()
  {
    if (elementParameters == null)
    {
      elementParameters = new EObjectContainmentEList<StreamAccess>(StreamAccess.class, this, FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS);
    }
    return elementParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDefinition> getVariableElementParameters()
  {
    if (variableElementParameters == null)
    {
      variableElementParameters = new EObjectResolvingEList<VariableDefinition>(VariableDefinition.class, this, FlowPackage.ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS);
    }
    return variableElementParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamOperatorParameter getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(StreamOperatorParameter newParameter, NotificationChain msgs)
  {
    StreamOperatorParameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(StreamOperatorParameter newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER, newParameter, newParameter));
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
      case FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS:
        return ((InternalEList<?>)getElementParameters()).basicRemove(otherEnd, msgs);
      case FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER:
        return basicSetParameter(null, msgs);
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
      case FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS:
        return getElementParameters();
      case FlowPackage.ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS:
        return getVariableElementParameters();
      case FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER:
        return getParameter();
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
      case FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS:
        getElementParameters().clear();
        getElementParameters().addAll((Collection<? extends StreamAccess>)newValue);
        return;
      case FlowPackage.ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS:
        getVariableElementParameters().clear();
        getVariableElementParameters().addAll((Collection<? extends VariableDefinition>)newValue);
        return;
      case FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER:
        setParameter((StreamOperatorParameter)newValue);
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
      case FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS:
        getElementParameters().clear();
        return;
      case FlowPackage.ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS:
        getVariableElementParameters().clear();
        return;
      case FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER:
        setParameter((StreamOperatorParameter)null);
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
      case FlowPackage.ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS:
        return elementParameters != null && !elementParameters.isEmpty();
      case FlowPackage.ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS:
        return variableElementParameters != null && !variableElementParameters.isEmpty();
      case FlowPackage.ELEMENT_JOIN_OPERATOR__PARAMETER:
        return parameter != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementJoinOperatorImpl
