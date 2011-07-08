/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owl.HasValueRestriction;
import owl.OwlPackage;

import rdfs.RDFSResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Value Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.HasValueRestrictionImpl#getOWLHasValue <em>OWL Has Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasValueRestrictionImpl extends OWLRestrictionImpl implements HasValueRestriction {
	/**
	 * The cached value of the '{@link #getOWLHasValue() <em>OWL Has Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLHasValue()
	 * @generated
	 * @ordered
	 */
	protected RDFSResource owlHasValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasValueRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.HAS_VALUE_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource getOWLHasValue() {
		if (owlHasValue != null && owlHasValue.eIsProxy()) {
			InternalEObject oldOWLHasValue = (InternalEObject)owlHasValue;
			owlHasValue = (RDFSResource)eResolveProxy(oldOWLHasValue);
			if (owlHasValue != oldOWLHasValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE, oldOWLHasValue, owlHasValue));
			}
		}
		return owlHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource basicGetOWLHasValue() {
		return owlHasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLHasValue(RDFSResource newOWLHasValue) {
		RDFSResource oldOWLHasValue = owlHasValue;
		owlHasValue = newOWLHasValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE, oldOWLHasValue, owlHasValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE:
				if (resolve) return getOWLHasValue();
				return basicGetOWLHasValue();
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
			case OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE:
				setOWLHasValue((RDFSResource)newValue);
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
			case OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE:
				setOWLHasValue((RDFSResource)null);
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
			case OwlPackage.HAS_VALUE_RESTRICTION__OWL_HAS_VALUE:
				return owlHasValue != null;
		}
		return super.eIsSet(featureID);
	}

} //HasValueRestrictionImpl
