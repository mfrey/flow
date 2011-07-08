/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.AllValuesFromRestriction;
import owl.OwlPackage;

import rdfs.RDFSClass;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.AllValuesFromRestrictionImpl#getOWLAllValuesFrom <em>OWL All Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllValuesFromRestrictionImpl extends OWLRestrictionImpl implements AllValuesFromRestriction {
	/**
	 * The cached value of the '{@link #getOWLAllValuesFrom() <em>OWL All Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLAllValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected RDFSClass owlAllValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllValuesFromRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ALL_VALUES_FROM_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClass getOWLAllValuesFrom() {
		if (owlAllValuesFrom != null && owlAllValuesFrom.eIsProxy()) {
			InternalEObject oldOWLAllValuesFrom = (InternalEObject)owlAllValuesFrom;
			owlAllValuesFrom = (RDFSClass)eResolveProxy(oldOWLAllValuesFrom);
			if (owlAllValuesFrom != oldOWLAllValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM, oldOWLAllValuesFrom, owlAllValuesFrom));
			}
		}
		return owlAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClass basicGetOWLAllValuesFrom() {
		return owlAllValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOWLAllValuesFrom(RDFSClass newOWLAllValuesFrom, NotificationChain msgs) {
		RDFSClass oldOWLAllValuesFrom = owlAllValuesFrom;
		owlAllValuesFrom = newOWLAllValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM, oldOWLAllValuesFrom, newOWLAllValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLAllValuesFrom(RDFSClass newOWLAllValuesFrom) {
		if (newOWLAllValuesFrom != owlAllValuesFrom) {
			NotificationChain msgs = null;
			if (owlAllValuesFrom != null)
				msgs = ((InternalEObject)owlAllValuesFrom).eInverseRemove(this, RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION, RDFSClass.class, msgs);
			if (newOWLAllValuesFrom != null)
				msgs = ((InternalEObject)newOWLAllValuesFrom).eInverseAdd(this, RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION, RDFSClass.class, msgs);
			msgs = basicSetOWLAllValuesFrom(newOWLAllValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM, newOWLAllValuesFrom, newOWLAllValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				if (owlAllValuesFrom != null)
					msgs = ((InternalEObject)owlAllValuesFrom).eInverseRemove(this, RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION, RDFSClass.class, msgs);
				return basicSetOWLAllValuesFrom((RDFSClass)otherEnd, msgs);
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
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				return basicSetOWLAllValuesFrom(null, msgs);
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
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				if (resolve) return getOWLAllValuesFrom();
				return basicGetOWLAllValuesFrom();
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
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				setOWLAllValuesFrom((RDFSClass)newValue);
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
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				setOWLAllValuesFrom((RDFSClass)null);
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
			case OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM:
				return owlAllValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //AllValuesFromRestrictionImpl
