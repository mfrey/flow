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

import owl.OWLRestriction;
import owl.OwlPackage;

import rdfs.RDFProperty;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLRestrictionImpl#getOWLOnProperty <em>OWL On Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OWLRestrictionImpl extends OWLClassImpl implements OWLRestriction {
	/**
	 * The cached value of the '{@link #getOWLOnProperty() <em>OWL On Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLOnProperty()
	 * @generated
	 * @ordered
	 */
	protected RDFProperty owlOnProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty getOWLOnProperty() {
		if (owlOnProperty != null && owlOnProperty.eIsProxy()) {
			InternalEObject oldOWLOnProperty = (InternalEObject)owlOnProperty;
			owlOnProperty = (RDFProperty)eResolveProxy(oldOWLOnProperty);
			if (owlOnProperty != oldOWLOnProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY, oldOWLOnProperty, owlOnProperty));
			}
		}
		return owlOnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFProperty basicGetOWLOnProperty() {
		return owlOnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOWLOnProperty(RDFProperty newOWLOnProperty, NotificationChain msgs) {
		RDFProperty oldOWLOnProperty = owlOnProperty;
		owlOnProperty = newOWLOnProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY, oldOWLOnProperty, newOWLOnProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLOnProperty(RDFProperty newOWLOnProperty) {
		if (newOWLOnProperty != owlOnProperty) {
			NotificationChain msgs = null;
			if (owlOnProperty != null)
				msgs = ((InternalEObject)owlOnProperty).eInverseRemove(this, RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION, RDFProperty.class, msgs);
			if (newOWLOnProperty != null)
				msgs = ((InternalEObject)newOWLOnProperty).eInverseAdd(this, RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION, RDFProperty.class, msgs);
			msgs = basicSetOWLOnProperty(newOWLOnProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY, newOWLOnProperty, newOWLOnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				if (owlOnProperty != null)
					msgs = ((InternalEObject)owlOnProperty).eInverseRemove(this, RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION, RDFProperty.class, msgs);
				return basicSetOWLOnProperty((RDFProperty)otherEnd, msgs);
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
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				return basicSetOWLOnProperty(null, msgs);
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
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				if (resolve) return getOWLOnProperty();
				return basicGetOWLOnProperty();
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
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				setOWLOnProperty((RDFProperty)newValue);
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
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				setOWLOnProperty((RDFProperty)null);
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
			case OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY:
				return owlOnProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //OWLRestrictionImpl
