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

import owl.OwlPackage;
import owl.SomeValuesFromRestriction;

import rdfs.RDFSClass;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Some Values From Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.SomeValuesFromRestrictionImpl#getOWLSomeValuesFrom <em>OWL Some Values From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SomeValuesFromRestrictionImpl extends OWLRestrictionImpl implements SomeValuesFromRestriction {
	/**
	 * The cached value of the '{@link #getOWLSomeValuesFrom() <em>OWL Some Values From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLSomeValuesFrom()
	 * @generated
	 * @ordered
	 */
	protected RDFSClass owlSomeValuesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeValuesFromRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.SOME_VALUES_FROM_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClass getOWLSomeValuesFrom() {
		if (owlSomeValuesFrom != null && owlSomeValuesFrom.eIsProxy()) {
			InternalEObject oldOWLSomeValuesFrom = (InternalEObject)owlSomeValuesFrom;
			owlSomeValuesFrom = (RDFSClass)eResolveProxy(oldOWLSomeValuesFrom);
			if (owlSomeValuesFrom != oldOWLSomeValuesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM, oldOWLSomeValuesFrom, owlSomeValuesFrom));
			}
		}
		return owlSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSClass basicGetOWLSomeValuesFrom() {
		return owlSomeValuesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOWLSomeValuesFrom(RDFSClass newOWLSomeValuesFrom, NotificationChain msgs) {
		RDFSClass oldOWLSomeValuesFrom = owlSomeValuesFrom;
		owlSomeValuesFrom = newOWLSomeValuesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM, oldOWLSomeValuesFrom, newOWLSomeValuesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLSomeValuesFrom(RDFSClass newOWLSomeValuesFrom) {
		if (newOWLSomeValuesFrom != owlSomeValuesFrom) {
			NotificationChain msgs = null;
			if (owlSomeValuesFrom != null)
				msgs = ((InternalEObject)owlSomeValuesFrom).eInverseRemove(this, RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION, RDFSClass.class, msgs);
			if (newOWLSomeValuesFrom != null)
				msgs = ((InternalEObject)newOWLSomeValuesFrom).eInverseAdd(this, RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION, RDFSClass.class, msgs);
			msgs = basicSetOWLSomeValuesFrom(newOWLSomeValuesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM, newOWLSomeValuesFrom, newOWLSomeValuesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				if (owlSomeValuesFrom != null)
					msgs = ((InternalEObject)owlSomeValuesFrom).eInverseRemove(this, RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION, RDFSClass.class, msgs);
				return basicSetOWLSomeValuesFrom((RDFSClass)otherEnd, msgs);
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
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				return basicSetOWLSomeValuesFrom(null, msgs);
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
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				if (resolve) return getOWLSomeValuesFrom();
				return basicGetOWLSomeValuesFrom();
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
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				setOWLSomeValuesFrom((RDFSClass)newValue);
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
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				setOWLSomeValuesFrom((RDFSClass)null);
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
			case OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM:
				return owlSomeValuesFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //SomeValuesFromRestrictionImpl
