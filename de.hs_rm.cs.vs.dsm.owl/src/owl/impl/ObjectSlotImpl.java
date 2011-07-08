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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import owl.Individual;
import owl.OWLObjectProperty;
import owl.ObjectSlot;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.ObjectSlotImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link owl.impl.ObjectSlotImpl#getContent <em>Content</em>}</li>
 *   <li>{@link owl.impl.ObjectSlotImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectSlotImpl extends EObjectImpl implements ObjectSlot {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> content;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected OWLObjectProperty property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OBJECT_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividual() {
		if (eContainerFeatureID() != OwlPackage.OBJECT_SLOT__INDIVIDUAL) return null;
		return (Individual)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(Individual newIndividual, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIndividual, OwlPackage.OBJECT_SLOT__INDIVIDUAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Individual newIndividual) {
		if (newIndividual != eInternalContainer() || (eContainerFeatureID() != OwlPackage.OBJECT_SLOT__INDIVIDUAL && newIndividual != null)) {
			if (EcoreUtil.isAncestor(this, newIndividual))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, OwlPackage.INDIVIDUAL__OBJECT_SLOT, Individual.class, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OBJECT_SLOT__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getContent() {
		if (content == null) {
			content = new EObjectResolvingEList<Individual>(Individual.class, this, OwlPackage.OBJECT_SLOT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLObjectProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (OWLObjectProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.OBJECT_SLOT__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLObjectProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(OWLObjectProperty newProperty) {
		OWLObjectProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OBJECT_SLOT__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIndividual((Individual)otherEnd, msgs);
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
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				return eInternalContainer().eInverseRemove(this, OwlPackage.INDIVIDUAL__OBJECT_SLOT, Individual.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				return getIndividual();
			case OwlPackage.OBJECT_SLOT__CONTENT:
				return getContent();
			case OwlPackage.OBJECT_SLOT__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				setIndividual((Individual)newValue);
				return;
			case OwlPackage.OBJECT_SLOT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Individual>)newValue);
				return;
			case OwlPackage.OBJECT_SLOT__PROPERTY:
				setProperty((OWLObjectProperty)newValue);
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
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				setIndividual((Individual)null);
				return;
			case OwlPackage.OBJECT_SLOT__CONTENT:
				getContent().clear();
				return;
			case OwlPackage.OBJECT_SLOT__PROPERTY:
				setProperty((OWLObjectProperty)null);
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
			case OwlPackage.OBJECT_SLOT__INDIVIDUAL:
				return getIndividual() != null;
			case OwlPackage.OBJECT_SLOT__CONTENT:
				return content != null && !content.isEmpty();
			case OwlPackage.OBJECT_SLOT__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectSlotImpl
