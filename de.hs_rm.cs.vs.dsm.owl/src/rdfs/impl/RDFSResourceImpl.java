/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdfs.Namespace;
import rdfs.PlainLiteral;
import rdfs.RDFSClass;
import rdfs.RDFSResource;
import rdfs.RDFStatement;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDFS Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getURI <em>URI</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getSubjectStatement <em>Subject Statement</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getObjectStatement <em>Object Statement</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFSIsDefinedBy <em>RDFS Is Defined By</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFValue <em>RDF Value</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFSSeeAlso <em>RDFS See Also</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFType <em>RDF Type</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFSMember <em>RDFS Member</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getPredicateStatement <em>Predicate Statement</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFSComment <em>RDFS Comment</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getRDFSLabel <em>RDFS Label</em>}</li>
 *   <li>{@link rdfs.impl.RDFSResourceImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFSResourceImpl extends EObjectImpl implements RDFSResource {
	/**
	 * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalName()
	 * @generated
	 * @ordered
	 */
	protected String localName = LOCAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectStatement() <em>Subject Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFStatement> subjectStatement;

	/**
	 * The cached value of the '{@link #getObjectStatement() <em>Object Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFStatement> objectStatement;

	/**
	 * The cached value of the '{@link #getRDFSIsDefinedBy() <em>RDFS Is Defined By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSIsDefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> rdfsIsDefinedBy;

	/**
	 * The cached value of the '{@link #getRDFValue() <em>RDF Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> rdfValue;

	/**
	 * The cached value of the '{@link #getRDFSSeeAlso() <em>RDFS See Also</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> rdfsSeeAlso;

	/**
	 * The cached value of the '{@link #getRDFType() <em>RDF Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFType()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSClass> rdfType;

	/**
	 * The cached value of the '{@link #getRDFSMember() <em>RDFS Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSMember()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> rdfsMember;

	/**
	 * The cached value of the '{@link #getPredicateStatement() <em>Predicate Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicateStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFStatement> predicateStatement;

	/**
	 * The cached value of the '{@link #getRDFSComment() <em>RDFS Comment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSComment()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> rdfsComment;

	/**
	 * The cached value of the '{@link #getRDFSLabel() <em>RDFS Label</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> rdfsLabel;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFSResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDFS_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalName(String newLocalName) {
		String oldLocalName = localName;
		localName = newLocalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDFS_RESOURCE__LOCAL_NAME, oldLocalName, localName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	// TODO: Fixme
	public String getURI() {
		// TODO: implement this method to return the 'URI' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		return namespace + localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFStatement> getSubjectStatement() {
		if (subjectStatement == null) {
			subjectStatement = new EObjectWithInverseResolvingEList<RDFStatement>(RDFStatement.class, this, RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT, RdfsPackage.RDF_STATEMENT__RDF_SUBJECT);
		}
		return subjectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFStatement> getObjectStatement() {
		if (objectStatement == null) {
			objectStatement = new EObjectWithInverseResolvingEList<RDFStatement>(RDFStatement.class, this, RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT, RdfsPackage.RDF_STATEMENT__RDF_OBJECT);
		}
		return objectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getRDFSIsDefinedBy() {
		if (rdfsIsDefinedBy == null) {
			rdfsIsDefinedBy = new EObjectResolvingEList<RDFSResource>(RDFSResource.class, this, RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY);
		}
		return rdfsIsDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getRDFValue() {
		if (rdfValue == null) {
			rdfValue = new EObjectResolvingEList<RDFSResource>(RDFSResource.class, this, RdfsPackage.RDFS_RESOURCE__RDF_VALUE);
		}
		return rdfValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getRDFSSeeAlso() {
		if (rdfsSeeAlso == null) {
			rdfsSeeAlso = new EObjectResolvingEList<RDFSResource>(RDFSResource.class, this, RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO);
		}
		return rdfsSeeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSClass> getRDFType() {
		if (rdfType == null) {
			rdfType = new EObjectWithInverseResolvingEList.ManyInverse<RDFSClass>(RDFSClass.class, this, RdfsPackage.RDFS_RESOURCE__RDF_TYPE, RdfsPackage.RDFS_CLASS__INSTANCE);
		}
		return rdfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getRDFSMember() {
		if (rdfsMember == null) {
			rdfsMember = new EObjectResolvingEList<RDFSResource>(RDFSResource.class, this, RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER);
		}
		return rdfsMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFStatement> getPredicateStatement() {
		if (predicateStatement == null) {
			predicateStatement = new EObjectWithInverseResolvingEList<RDFStatement>(RDFStatement.class, this, RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT, RdfsPackage.RDF_STATEMENT__RDF_PREDICATE);
		}
		return predicateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getRDFSComment() {
		if (rdfsComment == null) {
			rdfsComment = new EObjectResolvingEList<PlainLiteral>(PlainLiteral.class, this, RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT);
		}
		return rdfsComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getRDFSLabel() {
		if (rdfsLabel == null) {
			rdfsLabel = new EObjectResolvingEList<PlainLiteral>(PlainLiteral.class, this, RdfsPackage.RDFS_RESOURCE__RDFS_LABEL);
		}
		return rdfsLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Namespace)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDFS_RESOURCE__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDFS_RESOURCE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubjectStatement()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectStatement()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRDFType()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredicateStatement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				return ((InternalEList<?>)getSubjectStatement()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				return ((InternalEList<?>)getObjectStatement()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				return ((InternalEList<?>)getRDFType()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				return ((InternalEList<?>)getPredicateStatement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__LOCAL_NAME:
				return getLocalName();
			case RdfsPackage.RDFS_RESOURCE__URI:
				return getURI();
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				return getSubjectStatement();
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				return getObjectStatement();
			case RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY:
				return getRDFSIsDefinedBy();
			case RdfsPackage.RDFS_RESOURCE__RDF_VALUE:
				return getRDFValue();
			case RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO:
				return getRDFSSeeAlso();
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				return getRDFType();
			case RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER:
				return getRDFSMember();
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				return getPredicateStatement();
			case RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT:
				return getRDFSComment();
			case RdfsPackage.RDFS_RESOURCE__RDFS_LABEL:
				return getRDFSLabel();
			case RdfsPackage.RDFS_RESOURCE__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__LOCAL_NAME:
				setLocalName((String)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				getSubjectStatement().clear();
				getSubjectStatement().addAll((Collection<? extends RDFStatement>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				getObjectStatement().clear();
				getObjectStatement().addAll((Collection<? extends RDFStatement>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY:
				getRDFSIsDefinedBy().clear();
				getRDFSIsDefinedBy().addAll((Collection<? extends RDFSResource>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDF_VALUE:
				getRDFValue().clear();
				getRDFValue().addAll((Collection<? extends RDFSResource>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO:
				getRDFSSeeAlso().clear();
				getRDFSSeeAlso().addAll((Collection<? extends RDFSResource>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				getRDFType().clear();
				getRDFType().addAll((Collection<? extends RDFSClass>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER:
				getRDFSMember().clear();
				getRDFSMember().addAll((Collection<? extends RDFSResource>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				getPredicateStatement().clear();
				getPredicateStatement().addAll((Collection<? extends RDFStatement>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT:
				getRDFSComment().clear();
				getRDFSComment().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_LABEL:
				getRDFSLabel().clear();
				getRDFSLabel().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case RdfsPackage.RDFS_RESOURCE__NAMESPACE:
				setNamespace((Namespace)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__LOCAL_NAME:
				setLocalName(LOCAL_NAME_EDEFAULT);
				return;
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				getSubjectStatement().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				getObjectStatement().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY:
				getRDFSIsDefinedBy().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDF_VALUE:
				getRDFValue().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO:
				getRDFSSeeAlso().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				getRDFType().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER:
				getRDFSMember().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				getPredicateStatement().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT:
				getRDFSComment().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__RDFS_LABEL:
				getRDFSLabel().clear();
				return;
			case RdfsPackage.RDFS_RESOURCE__NAMESPACE:
				setNamespace((Namespace)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdfsPackage.RDFS_RESOURCE__LOCAL_NAME:
				return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
			case RdfsPackage.RDFS_RESOURCE__URI:
				return URI_EDEFAULT == null ? getURI() != null : !URI_EDEFAULT.equals(getURI());
			case RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT:
				return subjectStatement != null && !subjectStatement.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT:
				return objectStatement != null && !objectStatement.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDFS_IS_DEFINED_BY:
				return rdfsIsDefinedBy != null && !rdfsIsDefinedBy.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDF_VALUE:
				return rdfValue != null && !rdfValue.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDFS_SEE_ALSO:
				return rdfsSeeAlso != null && !rdfsSeeAlso.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDF_TYPE:
				return rdfType != null && !rdfType.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDFS_MEMBER:
				return rdfsMember != null && !rdfsMember.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT:
				return predicateStatement != null && !predicateStatement.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDFS_COMMENT:
				return rdfsComment != null && !rdfsComment.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__RDFS_LABEL:
				return rdfsLabel != null && !rdfsLabel.isEmpty();
			case RdfsPackage.RDFS_RESOURCE__NAMESPACE:
				return namespace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (localName: ");
		result.append(localName);
		result.append(')');
		return result.toString();
	}

} //RDFSResourceImpl
