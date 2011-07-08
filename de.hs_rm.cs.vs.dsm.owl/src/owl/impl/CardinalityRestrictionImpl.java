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

import owl.CardinalityRestriction;
import owl.OwlPackage;

import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.CardinalityRestrictionImpl#getOWLCardinality <em>OWL Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityRestrictionImpl extends OWLRestrictionImpl implements CardinalityRestriction {
	/**
	 * The cached value of the '{@link #getOWLCardinality() <em>OWL Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLCardinality()
	 * @generated
	 * @ordered
	 */
	protected RDFSLiteral owlCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.CARDINALITY_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral getOWLCardinality() {
		if (owlCardinality != null && owlCardinality.eIsProxy()) {
			InternalEObject oldOWLCardinality = (InternalEObject)owlCardinality;
			owlCardinality = (RDFSLiteral)eResolveProxy(oldOWLCardinality);
			if (owlCardinality != oldOWLCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY, oldOWLCardinality, owlCardinality));
			}
		}
		return owlCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSLiteral basicGetOWLCardinality() {
		return owlCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLCardinality(RDFSLiteral newOWLCardinality) {
		RDFSLiteral oldOWLCardinality = owlCardinality;
		owlCardinality = newOWLCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY, oldOWLCardinality, owlCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY:
				if (resolve) return getOWLCardinality();
				return basicGetOWLCardinality();
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
			case OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY:
				setOWLCardinality((RDFSLiteral)newValue);
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
			case OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY:
				setOWLCardinality((RDFSLiteral)null);
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
			case OwlPackage.CARDINALITY_RESTRICTION__OWL_CARDINALITY:
				return owlCardinality != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalityRestrictionImpl
