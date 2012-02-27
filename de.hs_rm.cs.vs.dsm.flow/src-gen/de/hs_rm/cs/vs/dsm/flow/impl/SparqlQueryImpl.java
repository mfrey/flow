/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.SparqlQuery;
import de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sparql Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SparqlQueryImpl extends MinimalEObjectImpl.Container implements SparqlQuery
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected SparqlQueryVariable variable;

  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected EList<String> subject;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected EList<String> predicate;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected EList<String> object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SparqlQueryImpl()
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
    return FlowPackage.Literals.SPARQL_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQueryVariable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(SparqlQueryVariable newVariable, NotificationChain msgs)
  {
    SparqlQueryVariable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.SPARQL_QUERY__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(SparqlQueryVariable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SPARQL_QUERY__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.SPARQL_QUERY__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.SPARQL_QUERY__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSubject()
  {
    if (subject == null)
    {
      subject = new EDataTypeEList<String>(String.class, this, FlowPackage.SPARQL_QUERY__SUBJECT);
    }
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPredicate()
  {
    if (predicate == null)
    {
      predicate = new EDataTypeEList<String>(String.class, this, FlowPackage.SPARQL_QUERY__PREDICATE);
    }
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getObject()
  {
    if (object == null)
    {
      object = new EDataTypeEList<String>(String.class, this, FlowPackage.SPARQL_QUERY__OBJECT);
    }
    return object;
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
      case FlowPackage.SPARQL_QUERY__VARIABLE:
        return basicSetVariable(null, msgs);
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
      case FlowPackage.SPARQL_QUERY__VARIABLE:
        return getVariable();
      case FlowPackage.SPARQL_QUERY__SUBJECT:
        return getSubject();
      case FlowPackage.SPARQL_QUERY__PREDICATE:
        return getPredicate();
      case FlowPackage.SPARQL_QUERY__OBJECT:
        return getObject();
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
      case FlowPackage.SPARQL_QUERY__VARIABLE:
        setVariable((SparqlQueryVariable)newValue);
        return;
      case FlowPackage.SPARQL_QUERY__SUBJECT:
        getSubject().clear();
        getSubject().addAll((Collection<? extends String>)newValue);
        return;
      case FlowPackage.SPARQL_QUERY__PREDICATE:
        getPredicate().clear();
        getPredicate().addAll((Collection<? extends String>)newValue);
        return;
      case FlowPackage.SPARQL_QUERY__OBJECT:
        getObject().clear();
        getObject().addAll((Collection<? extends String>)newValue);
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
      case FlowPackage.SPARQL_QUERY__VARIABLE:
        setVariable((SparqlQueryVariable)null);
        return;
      case FlowPackage.SPARQL_QUERY__SUBJECT:
        getSubject().clear();
        return;
      case FlowPackage.SPARQL_QUERY__PREDICATE:
        getPredicate().clear();
        return;
      case FlowPackage.SPARQL_QUERY__OBJECT:
        getObject().clear();
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
      case FlowPackage.SPARQL_QUERY__VARIABLE:
        return variable != null;
      case FlowPackage.SPARQL_QUERY__SUBJECT:
        return subject != null && !subject.isEmpty();
      case FlowPackage.SPARQL_QUERY__PREDICATE:
        return predicate != null && !predicate.isEmpty();
      case FlowPackage.SPARQL_QUERY__OBJECT:
        return object != null && !object.isEmpty();
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
    result.append(" (subject: ");
    result.append(subject);
    result.append(", predicate: ");
    result.append(predicate);
    result.append(", object: ");
    result.append(object);
    result.append(')');
    return result.toString();
  }

} //SparqlQueryImpl
