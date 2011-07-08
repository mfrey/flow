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

import owl.MaxCardinalityRestriction;
import owl.OwlPackage;

import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.MaxCardinalityRestrictionImpl#getOWLMaxCardinality <em>OWL Max Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaxCardinalityRestrictionImpl extends OWLRestrictionImpl implements MaxCardinalityRestriction {
	/**
	 * The cached value of the '{@link #getOWLMaxCardinality() <em>OWL Max Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected RDFSLiteral owlMaxCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxCardinalityRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.MAX_CARDINALITY_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral getOWLMaxCardinality() {
		if (owlMaxCardinality != null && owlMaxCardinality.eIsProxy()) {
			InternalEObject oldOWLMaxCardinality = (InternalEObject)owlMaxCardinality;
			owlMaxCardinality = (RDFSLiteral)eResolveProxy(oldOWLMaxCardinality);
			if (owlMaxCardinality != oldOWLMaxCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY, oldOWLMaxCardinality, owlMaxCardinality));
			}
		}
		return owlMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral basicGetOWLMaxCardinality() {
		return owlMaxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLMaxCardinality(RDFSLiteral newOWLMaxCardinality) {
		RDFSLiteral oldOWLMaxCardinality = owlMaxCardinality;
		owlMaxCardinality = newOWLMaxCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY, oldOWLMaxCardinality, owlMaxCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY:
				if (resolve) return getOWLMaxCardinality();
				return basicGetOWLMaxCardinality();
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
			case OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY:
				setOWLMaxCardinality((RDFSLiteral)newValue);
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
			case OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY:
				setOWLMaxCardinality((RDFSLiteral)null);
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
			case OwlPackage.MAX_CARDINALITY_RESTRICTION__OWL_MAX_CARDINALITY:
				return owlMaxCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //MaxCardinalityRestrictionImpl
