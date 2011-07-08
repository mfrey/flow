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

import owl.ComplementClass;
import owl.OWLClass;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complement Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.ComplementClassImpl#getOWLComplementOf <em>OWL Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplementClassImpl extends OWLClassImpl implements ComplementClass {
	/**
	 * The cached value of the '{@link #getOWLComplementOf() <em>OWL Complement Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLComplementOf()
	 * @generated
	 * @ordered
	 */
	protected OWLClass owlComplementOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.COMPLEMENT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLClass getOWLComplementOf() {
		if (owlComplementOf != null && owlComplementOf.eIsProxy()) {
			InternalEObject oldOWLComplementOf = (InternalEObject)owlComplementOf;
			owlComplementOf = (OWLClass)eResolveProxy(oldOWLComplementOf);
			if (owlComplementOf != oldOWLComplementOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF, oldOWLComplementOf, owlComplementOf));
			}
		}
		return owlComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLClass basicGetOWLComplementOf() {
		return owlComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOWLComplementOf(OWLClass newOWLComplementOf, NotificationChain msgs) {
		OWLClass oldOWLComplementOf = owlComplementOf;
		owlComplementOf = newOWLComplementOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF, oldOWLComplementOf, newOWLComplementOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLComplementOf(OWLClass newOWLComplementOf) {
		if (newOWLComplementOf != owlComplementOf) {
			NotificationChain msgs = null;
			if (owlComplementOf != null)
				msgs = ((InternalEObject)owlComplementOf).eInverseRemove(this, OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF, OWLClass.class, msgs);
			if (newOWLComplementOf != null)
				msgs = ((InternalEObject)newOWLComplementOf).eInverseAdd(this, OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF, OWLClass.class, msgs);
			msgs = basicSetOWLComplementOf(newOWLComplementOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF, newOWLComplementOf, newOWLComplementOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				if (owlComplementOf != null)
					msgs = ((InternalEObject)owlComplementOf).eInverseRemove(this, OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF, OWLClass.class, msgs);
				return basicSetOWLComplementOf((OWLClass)otherEnd, msgs);
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
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				return basicSetOWLComplementOf(null, msgs);
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
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				if (resolve) return getOWLComplementOf();
				return basicGetOWLComplementOf();
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
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				setOWLComplementOf((OWLClass)newValue);
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
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				setOWLComplementOf((OWLClass)null);
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
			case OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF:
				return owlComplementOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplementClassImpl
