/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.QueryTagOperator;
import de.hs_rm.cs.vs.dsm.flow.SparqlQuery;
import de.hs_rm.cs.vs.dsm.flow.SparqlQueryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Tag Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl#getQueryType <em>Query Type</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryTagOperatorImpl extends MinimalEObjectImpl.Container implements QueryTagOperator
{
  /**
   * The default value of the '{@link #getQueryType() <em>Query Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryType()
   * @generated
   * @ordered
   */
  protected static final SparqlQueryType QUERY_TYPE_EDEFAULT = SparqlQueryType.SELECT;

  /**
   * The cached value of the '{@link #getQueryType() <em>Query Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryType()
   * @generated
   * @ordered
   */
  protected SparqlQueryType queryType = QUERY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected SparqlQuery query;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryTagOperatorImpl()
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
    return FlowPackage.Literals.QUERY_TAG_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQueryType getQueryType()
  {
    return queryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryType(SparqlQueryType newQueryType)
  {
    SparqlQueryType oldQueryType = queryType;
    queryType = newQueryType == null ? QUERY_TYPE_EDEFAULT : newQueryType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.QUERY_TAG_OPERATOR__QUERY_TYPE, oldQueryType, queryType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQuery getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(SparqlQuery newQuery, NotificationChain msgs)
  {
    SparqlQuery oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.QUERY_TAG_OPERATOR__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(SparqlQuery newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.QUERY_TAG_OPERATOR__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.QUERY_TAG_OPERATOR__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.QUERY_TAG_OPERATOR__QUERY, newQuery, newQuery));
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
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY:
        return basicSetQuery(null, msgs);
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
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY_TYPE:
        return getQueryType();
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY:
        return getQuery();
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
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY_TYPE:
        setQueryType((SparqlQueryType)newValue);
        return;
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY:
        setQuery((SparqlQuery)newValue);
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
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY_TYPE:
        setQueryType(QUERY_TYPE_EDEFAULT);
        return;
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY:
        setQuery((SparqlQuery)null);
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
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY_TYPE:
        return queryType != QUERY_TYPE_EDEFAULT;
      case FlowPackage.QUERY_TAG_OPERATOR__QUERY:
        return query != null;
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
    result.append(" (queryType: ");
    result.append(queryType);
    result.append(')');
    return result.toString();
  }

} //QueryTagOperatorImpl
