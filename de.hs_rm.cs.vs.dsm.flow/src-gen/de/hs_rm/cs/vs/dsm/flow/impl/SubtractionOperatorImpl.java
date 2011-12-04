/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator;
import de.hs_rm.cs.vs.dsm.flow.VariableDefinition;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtraction Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getStreamElement <em>Stream Element</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl#getVariable <em>Variable</em>}</li>
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
   * The cached value of the '{@link #getStreamElement() <em>Stream Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreamElement()
   * @generated
   * @ordered
   */
  protected StreamAccess streamElement;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDefinition variable;

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
  public StreamAccess getStreamElement()
  {
    return streamElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStreamElement(StreamAccess newStreamElement, NotificationChain msgs)
  {
    StreamAccess oldStreamElement = streamElement;
    streamElement = newStreamElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT, oldStreamElement, newStreamElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreamElement(StreamAccess newStreamElement)
  {
    if (newStreamElement != streamElement)
    {
      NotificationChain msgs = null;
      if (streamElement != null)
        msgs = ((InternalEObject)streamElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT, null, msgs);
      if (newStreamElement != null)
        msgs = ((InternalEObject)newStreamElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT, null, msgs);
      msgs = basicSetStreamElement(newStreamElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT, newStreamElement, newStreamElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (VariableDefinition)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.SUBTRACTION_OPERATOR__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableDefinition newVariable)
  {
    VariableDefinition oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SUBTRACTION_OPERATOR__VARIABLE, oldVariable, variable));
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
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT:
        return basicSetStreamElement(null, msgs);
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
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT:
        return getStreamElement();
      case FlowPackage.SUBTRACTION_OPERATOR__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
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
      case FlowPackage.SUBTRACTION_OPERATOR__PARAMETER:
        setParameter((StreamAccess)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__LITERAL:
        setLiteral((BigDecimal)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT:
        setStreamElement((StreamAccess)newValue);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__VARIABLE:
        setVariable((VariableDefinition)newValue);
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
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT:
        setStreamElement((StreamAccess)null);
        return;
      case FlowPackage.SUBTRACTION_OPERATOR__VARIABLE:
        setVariable((VariableDefinition)null);
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
      case FlowPackage.SUBTRACTION_OPERATOR__STREAM_ELEMENT:
        return streamElement != null;
      case FlowPackage.SUBTRACTION_OPERATOR__VARIABLE:
        return variable != null;
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
