/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.OwlPackage;
import owl.Property;

import rdfs.impl.RDFPropertyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.PropertyImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link owl.impl.PropertyImpl#getFunctional <em>Functional</em>}</li>
 *   <li>{@link owl.impl.PropertyImpl#getOWLEquivalentProperty <em>OWL Equivalent Property</em>}</li>
 *   <li>{@link owl.impl.PropertyImpl#getInvOWLEquivalentProperty <em>Inv OWL Equivalent Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends RDFPropertyImpl implements Property {
	/**
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctional() <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FUNCTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctional() <em>Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctional()
	 * @generated
	 * @ordered
	 */
	protected Boolean functional = FUNCTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOWLEquivalentProperty() <em>OWL Equivalent Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLEquivalentProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> owlEquivalentProperty;

	/**
	 * The cached value of the '{@link #getInvOWLEquivalentProperty() <em>Inv OWL Equivalent Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLEquivalentProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> invOWLEquivalentProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(Boolean newDeprecated) {
		Boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.PROPERTY__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFunctional() {
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctional(Boolean newFunctional) {
		Boolean oldFunctional = functional;
		functional = newFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.PROPERTY__FUNCTIONAL, oldFunctional, functional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOWLEquivalentProperty() {
		if (owlEquivalentProperty == null) {
			owlEquivalentProperty = new EObjectWithInverseResolvingEList.ManyInverse<Property>(Property.class, this, OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY, OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY);
		}
		return owlEquivalentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getInvOWLEquivalentProperty() {
		if (invOWLEquivalentProperty == null) {
			invOWLEquivalentProperty = new EObjectWithInverseResolvingEList.ManyInverse<Property>(Property.class, this, OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY, OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY);
		}
		return invOWLEquivalentProperty;
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
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLEquivalentProperty()).basicAdd(otherEnd, msgs);
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLEquivalentProperty()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				return ((InternalEList<?>)getOWLEquivalentProperty()).basicRemove(otherEnd, msgs);
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				return ((InternalEList<?>)getInvOWLEquivalentProperty()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.PROPERTY__DEPRECATED:
				return getDeprecated();
			case OwlPackage.PROPERTY__FUNCTIONAL:
				return getFunctional();
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				return getOWLEquivalentProperty();
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				return getInvOWLEquivalentProperty();
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
			case OwlPackage.PROPERTY__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case OwlPackage.PROPERTY__FUNCTIONAL:
				setFunctional((Boolean)newValue);
				return;
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				getOWLEquivalentProperty().clear();
				getOWLEquivalentProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				getInvOWLEquivalentProperty().clear();
				getInvOWLEquivalentProperty().addAll((Collection<? extends Property>)newValue);
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
			case OwlPackage.PROPERTY__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case OwlPackage.PROPERTY__FUNCTIONAL:
				setFunctional(FUNCTIONAL_EDEFAULT);
				return;
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				getOWLEquivalentProperty().clear();
				return;
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				getInvOWLEquivalentProperty().clear();
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
			case OwlPackage.PROPERTY__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case OwlPackage.PROPERTY__FUNCTIONAL:
				return FUNCTIONAL_EDEFAULT == null ? functional != null : !FUNCTIONAL_EDEFAULT.equals(functional);
			case OwlPackage.PROPERTY__OWL_EQUIVALENT_PROPERTY:
				return owlEquivalentProperty != null && !owlEquivalentProperty.isEmpty();
			case OwlPackage.PROPERTY__INV_OWL_EQUIVALENT_PROPERTY:
				return invOWLEquivalentProperty != null && !invOWLEquivalentProperty.isEmpty();
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
		result.append(" (deprecated: ");
		result.append(deprecated);
		result.append(", functional: ");
		result.append(functional);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
