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

import owl.MinCardinalityRestriction;
import owl.OwlPackage;

import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.MinCardinalityRestrictionImpl#getOWLMinCardinality <em>OWL Min Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MinCardinalityRestrictionImpl extends OWLRestrictionImpl implements MinCardinalityRestriction {
	/**
	 * The cached value of the '{@link #getOWLMinCardinality() <em>OWL Min Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected RDFSLiteral owlMinCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinCardinalityRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.MIN_CARDINALITY_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral getOWLMinCardinality() {
		if (owlMinCardinality != null && owlMinCardinality.eIsProxy()) {
			InternalEObject oldOWLMinCardinality = (InternalEObject)owlMinCardinality;
			owlMinCardinality = (RDFSLiteral)eResolveProxy(oldOWLMinCardinality);
			if (owlMinCardinality != oldOWLMinCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY, oldOWLMinCardinality, owlMinCardinality));
			}
		}
		return owlMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral basicGetOWLMinCardinality() {
		return owlMinCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLMinCardinality(RDFSLiteral newOWLMinCardinality) {
		RDFSLiteral oldOWLMinCardinality = owlMinCardinality;
		owlMinCardinality = newOWLMinCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY, oldOWLMinCardinality, owlMinCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY:
				if (resolve) return getOWLMinCardinality();
				return basicGetOWLMinCardinality();
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
			case OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY:
				setOWLMinCardinality((RDFSLiteral)newValue);
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
			case OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY:
				setOWLMinCardinality((RDFSLiteral)null);
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
			case OwlPackage.MIN_CARDINALITY_RESTRICTION__OWL_MIN_CARDINALITY:
				return owlMinCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //MinCardinalityRestrictionImpl
