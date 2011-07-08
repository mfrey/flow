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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.DatatypeSlot;
import owl.Individual;
import owl.OWLDatatypeProperty;
import owl.OwlPackage;

import rdfs.RDFSLiteral;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.DatatypeSlotImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link owl.impl.DatatypeSlotImpl#getContent <em>Content</em>}</li>
 *   <li>{@link owl.impl.DatatypeSlotImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeSlotImpl extends EObjectImpl implements DatatypeSlot {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSLiteral> content;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected OWLDatatypeProperty property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATATYPE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getIndividual() {
		if (eContainerFeatureID() != OwlPackage.DATATYPE_SLOT__INDIVIDUAL) return null;
		return (Individual)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(Individual newIndividual, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIndividual, OwlPackage.DATATYPE_SLOT__INDIVIDUAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividual(Individual newIndividual) {
		if (newIndividual != eInternalContainer() || (eContainerFeatureID() != OwlPackage.DATATYPE_SLOT__INDIVIDUAL && newIndividual != null)) {
			if (EcoreUtil.isAncestor(this, newIndividual))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, OwlPackage.INDIVIDUAL__DATATYPE_SLOT, Individual.class, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE_SLOT__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSLiteral> getContent() {
		if (content == null) {
			content = new EObjectContainmentWithInverseEList<RDFSLiteral>(RDFSLiteral.class, this, OwlPackage.DATATYPE_SLOT__CONTENT, RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDatatypeProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (OWLDatatypeProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.DATATYPE_SLOT__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDatatypeProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(OWLDatatypeProperty newProperty) {
		OWLDatatypeProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.DATATYPE_SLOT__PROPERTY, oldProperty, property));
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIndividual((Individual)otherEnd, msgs);
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContent()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				return eInternalContainer().eInverseRemove(this, OwlPackage.INDIVIDUAL__DATATYPE_SLOT, Individual.class, msgs);
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				return getIndividual();
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				return getContent();
			case OwlPackage.DATATYPE_SLOT__PROPERTY:
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				setIndividual((Individual)newValue);
				return;
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends RDFSLiteral>)newValue);
				return;
			case OwlPackage.DATATYPE_SLOT__PROPERTY:
				setProperty((OWLDatatypeProperty)newValue);
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				setIndividual((Individual)null);
				return;
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				getContent().clear();
				return;
			case OwlPackage.DATATYPE_SLOT__PROPERTY:
				setProperty((OWLDatatypeProperty)null);
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
			case OwlPackage.DATATYPE_SLOT__INDIVIDUAL:
				return getIndividual() != null;
			case OwlPackage.DATATYPE_SLOT__CONTENT:
				return content != null && !content.isEmpty();
			case OwlPackage.DATATYPE_SLOT__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

} //DatatypeSlotImpl
