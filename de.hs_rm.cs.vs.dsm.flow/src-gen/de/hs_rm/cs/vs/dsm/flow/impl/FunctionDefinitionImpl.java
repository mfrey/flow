/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.BlockExpression;
import de.hs_rm.cs.vs.dsm.flow.DataType;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.FunctionDefinition;
import de.hs_rm.cs.vs.dsm.flow.ReturnStatement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;

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
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.FunctionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.FunctionDefinitionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.FunctionDefinitionImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.FunctionDefinitionImpl#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends ModelElementImpl implements FunctionDefinition
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> arguments;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<BlockExpression> statements;

  /**
   * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnValue()
   * @generated
   * @ordered
   */
  protected ReturnStatement returnValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return FlowPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DataType newType, NotificationChain msgs)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.FUNCTION_DEFINITION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.FUNCTION_DEFINITION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.FUNCTION_DEFINITION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FUNCTION_DEFINITION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FUNCTION_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, FlowPackage.FUNCTION_DEFINITION__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockExpression> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<BlockExpression>(BlockExpression.class, this, FlowPackage.FUNCTION_DEFINITION__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getReturnValue()
  {
    return returnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnValue(ReturnStatement newReturnValue, NotificationChain msgs)
  {
    ReturnStatement oldReturnValue = returnValue;
    returnValue = newReturnValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE, oldReturnValue, newReturnValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnValue(ReturnStatement newReturnValue)
  {
    if (newReturnValue != returnValue)
    {
      NotificationChain msgs = null;
      if (returnValue != null)
        msgs = ((InternalEObject)returnValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE, null, msgs);
      if (newReturnValue != null)
        msgs = ((InternalEObject)newReturnValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE, null, msgs);
      msgs = basicSetReturnValue(newReturnValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE, newReturnValue, newReturnValue));
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
      case FlowPackage.FUNCTION_DEFINITION__TYPE:
        return basicSetType(null, msgs);
      case FlowPackage.FUNCTION_DEFINITION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case FlowPackage.FUNCTION_DEFINITION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE:
        return basicSetReturnValue(null, msgs);
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
      case FlowPackage.FUNCTION_DEFINITION__TYPE:
        return getType();
      case FlowPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case FlowPackage.FUNCTION_DEFINITION__ARGUMENTS:
        return getArguments();
      case FlowPackage.FUNCTION_DEFINITION__STATEMENTS:
        return getStatements();
      case FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE:
        return getReturnValue();
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
      case FlowPackage.FUNCTION_DEFINITION__TYPE:
        setType((DataType)newValue);
        return;
      case FlowPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case FlowPackage.FUNCTION_DEFINITION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case FlowPackage.FUNCTION_DEFINITION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends BlockExpression>)newValue);
        return;
      case FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE:
        setReturnValue((ReturnStatement)newValue);
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
      case FlowPackage.FUNCTION_DEFINITION__TYPE:
        setType((DataType)null);
        return;
      case FlowPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FlowPackage.FUNCTION_DEFINITION__ARGUMENTS:
        getArguments().clear();
        return;
      case FlowPackage.FUNCTION_DEFINITION__STATEMENTS:
        getStatements().clear();
        return;
      case FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE:
        setReturnValue((ReturnStatement)null);
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
      case FlowPackage.FUNCTION_DEFINITION__TYPE:
        return type != null;
      case FlowPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FlowPackage.FUNCTION_DEFINITION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case FlowPackage.FUNCTION_DEFINITION__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case FlowPackage.FUNCTION_DEFINITION__RETURN_VALUE:
        return returnValue != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
