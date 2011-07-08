/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdfs.RDFSResource;
import rdfs.RDFStatement;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDF Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFStatementImpl#getRDFSubject <em>RDF Subject</em>}</li>
 *   <li>{@link rdfs.impl.RDFStatementImpl#getRDFObject <em>RDF Object</em>}</li>
 *   <li>{@link rdfs.impl.RDFStatementImpl#getRDFPredicate <em>RDF Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFStatementImpl extends RDFSResourceImpl implements RDFStatement {
	/**
	 * The cached value of the '{@link #getRDFSubject() <em>RDF Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSubject()
	 * @generated
	 * @ordered
	 */
	protected RDFSResource rdfSubject;

	/**
	 * The cached value of the '{@link #getRDFObject() <em>RDF Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFObject()
	 * @generated
	 * @ordered
	 */
	protected RDFSResource rdfObject;

	/**
	 * The cached value of the '{@link #getRDFPredicate() <em>RDF Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFPredicate()
	 * @generated
	 * @ordered
	 */
	protected RDFSResource rdfPredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource getRDFSubject() {
		if (rdfSubject != null && rdfSubject.eIsProxy()) {
			InternalEObject oldRDFSubject = (InternalEObject)rdfSubject;
			rdfSubject = (RDFSResource)eResolveProxy(oldRDFSubject);
			if (rdfSubject != oldRDFSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_STATEMENT__RDF_SUBJECT, oldRDFSubject, rdfSubject));
			}
		}
		return rdfSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource basicGetRDFSubject() {
		return rdfSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDFSubject(RDFSResource newRDFSubject, NotificationChain msgs) {
		RDFSResource oldRDFSubject = rdfSubject;
		rdfSubject = newRDFSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_SUBJECT, oldRDFSubject, newRDFSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDFSubject(RDFSResource newRDFSubject) {
		if (newRDFSubject != rdfSubject) {
			NotificationChain msgs = null;
			if (rdfSubject != null)
				msgs = ((InternalEObject)rdfSubject).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT, RDFSResource.class, msgs);
			if (newRDFSubject != null)
				msgs = ((InternalEObject)newRDFSubject).eInverseAdd(this, RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT, RDFSResource.class, msgs);
			msgs = basicSetRDFSubject(newRDFSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_SUBJECT, newRDFSubject, newRDFSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource getRDFObject() {
		if (rdfObject != null && rdfObject.eIsProxy()) {
			InternalEObject oldRDFObject = (InternalEObject)rdfObject;
			rdfObject = (RDFSResource)eResolveProxy(oldRDFObject);
			if (rdfObject != oldRDFObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_STATEMENT__RDF_OBJECT, oldRDFObject, rdfObject));
			}
		}
		return rdfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource basicGetRDFObject() {
		return rdfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDFObject(RDFSResource newRDFObject, NotificationChain msgs) {
		RDFSResource oldRDFObject = rdfObject;
		rdfObject = newRDFObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_OBJECT, oldRDFObject, newRDFObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDFObject(RDFSResource newRDFObject) {
		if (newRDFObject != rdfObject) {
			NotificationChain msgs = null;
			if (rdfObject != null)
				msgs = ((InternalEObject)rdfObject).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT, RDFSResource.class, msgs);
			if (newRDFObject != null)
				msgs = ((InternalEObject)newRDFObject).eInverseAdd(this, RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT, RDFSResource.class, msgs);
			msgs = basicSetRDFObject(newRDFObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_OBJECT, newRDFObject, newRDFObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource getRDFPredicate() {
		if (rdfPredicate != null && rdfPredicate.eIsProxy()) {
			InternalEObject oldRDFPredicate = (InternalEObject)rdfPredicate;
			rdfPredicate = (RDFSResource)eResolveProxy(oldRDFPredicate);
			if (rdfPredicate != oldRDFPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_STATEMENT__RDF_PREDICATE, oldRDFPredicate, rdfPredicate));
			}
		}
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource basicGetRDFPredicate() {
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDFPredicate(RDFSResource newRDFPredicate, NotificationChain msgs) {
		RDFSResource oldRDFPredicate = rdfPredicate;
		rdfPredicate = newRDFPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_PREDICATE, oldRDFPredicate, newRDFPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDFPredicate(RDFSResource newRDFPredicate) {
		if (newRDFPredicate != rdfPredicate) {
			NotificationChain msgs = null;
			if (rdfPredicate != null)
				msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT, RDFSResource.class, msgs);
			if (newRDFPredicate != null)
				msgs = ((InternalEObject)newRDFPredicate).eInverseAdd(this, RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT, RDFSResource.class, msgs);
			msgs = basicSetRDFPredicate(newRDFPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_STATEMENT__RDF_PREDICATE, newRDFPredicate, newRDFPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				if (rdfSubject != null)
					msgs = ((InternalEObject)rdfSubject).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__SUBJECT_STATEMENT, RDFSResource.class, msgs);
				return basicSetRDFSubject((RDFSResource)otherEnd, msgs);
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				if (rdfObject != null)
					msgs = ((InternalEObject)rdfObject).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__OBJECT_STATEMENT, RDFSResource.class, msgs);
				return basicSetRDFObject((RDFSResource)otherEnd, msgs);
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				if (rdfPredicate != null)
					msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, RdfsPackage.RDFS_RESOURCE__PREDICATE_STATEMENT, RDFSResource.class, msgs);
				return basicSetRDFPredicate((RDFSResource)otherEnd, msgs);
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
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				return basicSetRDFSubject(null, msgs);
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				return basicSetRDFObject(null, msgs);
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				return basicSetRDFPredicate(null, msgs);
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
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				if (resolve) return getRDFSubject();
				return basicGetRDFSubject();
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				if (resolve) return getRDFObject();
				return basicGetRDFObject();
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				if (resolve) return getRDFPredicate();
				return basicGetRDFPredicate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				setRDFSubject((RDFSResource)newValue);
				return;
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				setRDFObject((RDFSResource)newValue);
				return;
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				setRDFPredicate((RDFSResource)newValue);
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
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				setRDFSubject((RDFSResource)null);
				return;
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				setRDFObject((RDFSResource)null);
				return;
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				setRDFPredicate((RDFSResource)null);
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
			case RdfsPackage.RDF_STATEMENT__RDF_SUBJECT:
				return rdfSubject != null;
			case RdfsPackage.RDF_STATEMENT__RDF_OBJECT:
				return rdfObject != null;
			case RdfsPackage.RDF_STATEMENT__RDF_PREDICATE:
				return rdfPredicate != null;
		}
		return super.eIsSet(featureID);
	}

} //RDFStatementImpl
