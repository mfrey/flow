/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier;
import de.hs_rm.cs.vs.dsm.flow.Scheme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internationalized Resource Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InternationalizedResourceIdentifierImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InternationalizedResourceIdentifierImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InternationalizedResourceIdentifierImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InternationalizedResourceIdentifierImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link de.hs_rm.cs.vs.dsm.flow.impl.InternationalizedResourceIdentifierImpl#getFragmentIRI <em>Fragment IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternationalizedResourceIdentifierImpl extends MinimalEObjectImpl.Container implements InternationalizedResourceIdentifier
{
  /**
   * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheme()
   * @generated
   * @ordered
   */
  protected static final Scheme SCHEME_EDEFAULT = Scheme.HTTP;

  /**
   * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheme()
   * @generated
   * @ordered
   */
  protected Scheme scheme = SCHEME_EDEFAULT;

  /**
   * The default value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthority()
   * @generated
   * @ordered
   */
  protected static final String AUTHORITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthority() <em>Authority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthority()
   * @generated
   * @ordered
   */
  protected String authority = AUTHORITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected EList<String> path;

  /**
   * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected static final String QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected String query = QUERY_EDEFAULT;

  /**
   * The default value of the '{@link #getFragmentIRI() <em>Fragment IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragmentIRI()
   * @generated
   * @ordered
   */
  protected static final String FRAGMENT_IRI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFragmentIRI() <em>Fragment IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFragmentIRI()
   * @generated
   * @ordered
   */
  protected String fragmentIRI = FRAGMENT_IRI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InternationalizedResourceIdentifierImpl()
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
    return FlowPackage.Literals.INTERNATIONALIZED_RESOURCE_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheme getScheme()
  {
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScheme(Scheme newScheme)
  {
    Scheme oldScheme = scheme;
    scheme = newScheme == null ? SCHEME_EDEFAULT : newScheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__SCHEME, oldScheme, scheme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthority()
  {
    return authority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthority(String newAuthority)
  {
    String oldAuthority = authority;
    authority = newAuthority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__AUTHORITY, oldAuthority, authority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPath()
  {
    if (path == null)
    {
      path = new EDataTypeEList<String>(String.class, this, FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__PATH);
    }
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(String newQuery)
  {
    String oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFragmentIRI()
  {
    return fragmentIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFragmentIRI(String newFragmentIRI)
  {
    String oldFragmentIRI = fragmentIRI;
    fragmentIRI = newFragmentIRI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__FRAGMENT_IRI, oldFragmentIRI, fragmentIRI));
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
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__SCHEME:
        return getScheme();
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__AUTHORITY:
        return getAuthority();
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__PATH:
        return getPath();
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__QUERY:
        return getQuery();
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__FRAGMENT_IRI:
        return getFragmentIRI();
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
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__SCHEME:
        setScheme((Scheme)newValue);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__AUTHORITY:
        setAuthority((String)newValue);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__PATH:
        getPath().clear();
        getPath().addAll((Collection<? extends String>)newValue);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__QUERY:
        setQuery((String)newValue);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__FRAGMENT_IRI:
        setFragmentIRI((String)newValue);
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
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__SCHEME:
        setScheme(SCHEME_EDEFAULT);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__AUTHORITY:
        setAuthority(AUTHORITY_EDEFAULT);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__PATH:
        getPath().clear();
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__QUERY:
        setQuery(QUERY_EDEFAULT);
        return;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__FRAGMENT_IRI:
        setFragmentIRI(FRAGMENT_IRI_EDEFAULT);
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
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__SCHEME:
        return scheme != SCHEME_EDEFAULT;
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__AUTHORITY:
        return AUTHORITY_EDEFAULT == null ? authority != null : !AUTHORITY_EDEFAULT.equals(authority);
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__PATH:
        return path != null && !path.isEmpty();
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__QUERY:
        return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
      case FlowPackage.INTERNATIONALIZED_RESOURCE_IDENTIFIER__FRAGMENT_IRI:
        return FRAGMENT_IRI_EDEFAULT == null ? fragmentIRI != null : !FRAGMENT_IRI_EDEFAULT.equals(fragmentIRI);
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
    result.append(" (scheme: ");
    result.append(scheme);
    result.append(", authority: ");
    result.append(authority);
    result.append(", path: ");
    result.append(path);
    result.append(", query: ");
    result.append(query);
    result.append(", fragmentIRI: ");
    result.append(fragmentIRI);
    result.append(')');
    return result.toString();
  }

} //InternationalizedResourceIdentifierImpl
