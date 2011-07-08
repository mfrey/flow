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

import owl.OWLObjectProperty;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLObjectPropertyImpl#getInverseFunctional <em>Inverse Functional</em>}</li>
 *   <li>{@link owl.impl.OWLObjectPropertyImpl#getSymmetric <em>Symmetric</em>}</li>
 *   <li>{@link owl.impl.OWLObjectPropertyImpl#getTransitive <em>Transitive</em>}</li>
 *   <li>{@link owl.impl.OWLObjectPropertyImpl#getOWLInverseOf <em>OWL Inverse Of</em>}</li>
 *   <li>{@link owl.impl.OWLObjectPropertyImpl#getInvOWLInverseOf <em>Inv OWL Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLObjectPropertyImpl extends PropertyImpl implements OWLObjectProperty {
	/**
	 * The default value of the '{@link #getInverseFunctional() <em>Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INVERSE_FUNCTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverseFunctional() <em>Inverse Functional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseFunctional()
	 * @generated
	 * @ordered
	 */
	protected Boolean inverseFunctional = INVERSE_FUNCTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYMMETRIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymmetric() <em>Symmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetric()
	 * @generated
	 * @ordered
	 */
	protected Boolean symmetric = SYMMETRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TRANSITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitive()
	 * @generated
	 * @ordered
	 */
	protected Boolean transitive = TRANSITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOWLInverseOf() <em>OWL Inverse Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLInverseOf()
	 * @generated
	 * @ordered
	 */
	protected OWLObjectProperty owlInverseOf;

	/**
	 * The cached value of the '{@link #getInvOWLInverseOf() <em>Inv OWL Inverse Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLInverseOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLObjectProperty> invOWLInverseOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInverseFunctional() {
		return inverseFunctional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseFunctional(Boolean newInverseFunctional) {
		Boolean oldInverseFunctional = inverseFunctional;
		inverseFunctional = newInverseFunctional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL, oldInverseFunctional, inverseFunctional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSymmetric() {
		return symmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetric(Boolean newSymmetric) {
		Boolean oldSymmetric = symmetric;
		symmetric = newSymmetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_OBJECT_PROPERTY__SYMMETRIC, oldSymmetric, symmetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTransitive() {
		return transitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitive(Boolean newTransitive) {
		Boolean oldTransitive = transitive;
		transitive = newTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_OBJECT_PROPERTY__TRANSITIVE, oldTransitive, transitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLObjectProperty getOWLInverseOf() {
		if (owlInverseOf != null && owlInverseOf.eIsProxy()) {
			InternalEObject oldOWLInverseOf = (InternalEObject)owlInverseOf;
			owlInverseOf = (OWLObjectProperty)eResolveProxy(oldOWLInverseOf);
			if (owlInverseOf != oldOWLInverseOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF, oldOWLInverseOf, owlInverseOf));
			}
		}
		return owlInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLObjectProperty basicGetOWLInverseOf() {
		return owlInverseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOWLInverseOf(OWLObjectProperty newOWLInverseOf, NotificationChain msgs) {
		OWLObjectProperty oldOWLInverseOf = owlInverseOf;
		owlInverseOf = newOWLInverseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF, oldOWLInverseOf, newOWLInverseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOWLInverseOf(OWLObjectProperty newOWLInverseOf) {
		if (newOWLInverseOf != owlInverseOf) {
			NotificationChain msgs = null;
			if (owlInverseOf != null)
				msgs = ((InternalEObject)owlInverseOf).eInverseRemove(this, OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF, OWLObjectProperty.class, msgs);
			if (newOWLInverseOf != null)
				msgs = ((InternalEObject)newOWLInverseOf).eInverseAdd(this, OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF, OWLObjectProperty.class, msgs);
			msgs = basicSetOWLInverseOf(newOWLInverseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF, newOWLInverseOf, newOWLInverseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLObjectProperty> getInvOWLInverseOf() {
		if (invOWLInverseOf == null) {
			invOWLInverseOf = new EObjectWithInverseResolvingEList<OWLObjectProperty>(OWLObjectProperty.class, this, OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF, OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF);
		}
		return invOWLInverseOf;
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
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				if (owlInverseOf != null)
					msgs = ((InternalEObject)owlInverseOf).eInverseRemove(this, OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF, OWLObjectProperty.class, msgs);
				return basicSetOWLInverseOf((OWLObjectProperty)otherEnd, msgs);
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLInverseOf()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				return basicSetOWLInverseOf(null, msgs);
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				return ((InternalEList<?>)getInvOWLInverseOf()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL:
				return getInverseFunctional();
			case OwlPackage.OWL_OBJECT_PROPERTY__SYMMETRIC:
				return getSymmetric();
			case OwlPackage.OWL_OBJECT_PROPERTY__TRANSITIVE:
				return getTransitive();
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				if (resolve) return getOWLInverseOf();
				return basicGetOWLInverseOf();
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				return getInvOWLInverseOf();
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
			case OwlPackage.OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL:
				setInverseFunctional((Boolean)newValue);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__SYMMETRIC:
				setSymmetric((Boolean)newValue);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__TRANSITIVE:
				setTransitive((Boolean)newValue);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				setOWLInverseOf((OWLObjectProperty)newValue);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				getInvOWLInverseOf().clear();
				getInvOWLInverseOf().addAll((Collection<? extends OWLObjectProperty>)newValue);
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
			case OwlPackage.OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL:
				setInverseFunctional(INVERSE_FUNCTIONAL_EDEFAULT);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__SYMMETRIC:
				setSymmetric(SYMMETRIC_EDEFAULT);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__TRANSITIVE:
				setTransitive(TRANSITIVE_EDEFAULT);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				setOWLInverseOf((OWLObjectProperty)null);
				return;
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				getInvOWLInverseOf().clear();
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
			case OwlPackage.OWL_OBJECT_PROPERTY__INVERSE_FUNCTIONAL:
				return INVERSE_FUNCTIONAL_EDEFAULT == null ? inverseFunctional != null : !INVERSE_FUNCTIONAL_EDEFAULT.equals(inverseFunctional);
			case OwlPackage.OWL_OBJECT_PROPERTY__SYMMETRIC:
				return SYMMETRIC_EDEFAULT == null ? symmetric != null : !SYMMETRIC_EDEFAULT.equals(symmetric);
			case OwlPackage.OWL_OBJECT_PROPERTY__TRANSITIVE:
				return TRANSITIVE_EDEFAULT == null ? transitive != null : !TRANSITIVE_EDEFAULT.equals(transitive);
			case OwlPackage.OWL_OBJECT_PROPERTY__OWL_INVERSE_OF:
				return owlInverseOf != null;
			case OwlPackage.OWL_OBJECT_PROPERTY__INV_OWL_INVERSE_OF:
				return invOWLInverseOf != null && !invOWLInverseOf.isEmpty();
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
		result.append(" (inverseFunctional: ");
		result.append(inverseFunctional);
		result.append(", symmetric: ");
		result.append(symmetric);
		result.append(", transitive: ");
		result.append(transitive);
		result.append(')');
		return result.toString();
	}

} //OWLObjectPropertyImpl
