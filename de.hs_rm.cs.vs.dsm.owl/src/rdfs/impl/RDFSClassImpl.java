/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.AllValuesFromRestriction;
import owl.OwlPackage;
import owl.SomeValuesFromRestriction;

import rdfs.RDFProperty;
import rdfs.RDFSClass;
import rdfs.RDFSResource;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDFS Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getRefByAVFRestriction <em>Ref By AVF Restriction</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getRefBySVFRestriction <em>Ref By SVF Restriction</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getRDFSSubClassOf <em>RDFS Sub Class Of</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getRangedByProperty <em>Ranged By Property</em>}</li>
 *   <li>{@link rdfs.impl.RDFSClassImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFSClassImpl extends RDFSResourceImpl implements RDFSClass {
	/**
	 * The cached value of the '{@link #getRefByAVFRestriction() <em>Ref By AVF Restriction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByAVFRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<AllValuesFromRestriction> refByAVFRestriction;

	/**
	 * The cached value of the '{@link #getRefBySVFRestriction() <em>Ref By SVF Restriction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBySVFRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<SomeValuesFromRestriction> refBySVFRestriction;

	/**
	 * The cached value of the '{@link #getRDFSSubClassOf() <em>RDFS Sub Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSClass> rdfsSubClassOf;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSClass> subClass;

	/**
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFProperty> ownedProperty;

	/**
	 * The cached value of the '{@link #getRangedByProperty() <em>Ranged By Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangedByProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFProperty> rangedByProperty;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFSClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDFS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllValuesFromRestriction> getRefByAVFRestriction() {
		if (refByAVFRestriction == null) {
			refByAVFRestriction = new EObjectWithInverseResolvingEList<AllValuesFromRestriction>(AllValuesFromRestriction.class, this, RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION, OwlPackage.ALL_VALUES_FROM_RESTRICTION__OWL_ALL_VALUES_FROM);
		}
		return refByAVFRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SomeValuesFromRestriction> getRefBySVFRestriction() {
		if (refBySVFRestriction == null) {
			refBySVFRestriction = new EObjectWithInverseResolvingEList<SomeValuesFromRestriction>(SomeValuesFromRestriction.class, this, RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION, OwlPackage.SOME_VALUES_FROM_RESTRICTION__OWL_SOME_VALUES_FROM);
		}
		return refBySVFRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSClass> getRDFSSubClassOf() {
		if (rdfsSubClassOf == null) {
			rdfsSubClassOf = new EObjectWithInverseResolvingEList.ManyInverse<RDFSClass>(RDFSClass.class, this, RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF, RdfsPackage.RDFS_CLASS__SUB_CLASS);
		}
		return rdfsSubClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSClass> getSubClass() {
		if (subClass == null) {
			subClass = new EObjectWithInverseResolvingEList.ManyInverse<RDFSClass>(RDFSClass.class, this, RdfsPackage.RDFS_CLASS__SUB_CLASS, RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF);
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFProperty> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectWithInverseResolvingEList.ManyInverse<RDFProperty>(RDFProperty.class, this, RdfsPackage.RDFS_CLASS__OWNED_PROPERTY, RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN);
		}
		return ownedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFProperty> getRangedByProperty() {
		if (rangedByProperty == null) {
			rangedByProperty = new EObjectWithInverseResolvingEList.ManyInverse<RDFProperty>(RDFProperty.class, this, RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY, RdfsPackage.RDF_PROPERTY__RDFS_RANGE);
		}
		return rangedByProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getInstance() {
		if (instance == null) {
			instance = new EObjectWithInverseResolvingEList.ManyInverse<RDFSResource>(RDFSResource.class, this, RdfsPackage.RDFS_CLASS__INSTANCE, RdfsPackage.RDFS_RESOURCE__RDF_TYPE);
		}
		return instance;
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefByAVFRestriction()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefBySVFRestriction()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRDFSSubClassOf()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubClass()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedProperty()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRangedByProperty()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstance()).basicAdd(otherEnd, msgs);
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				return ((InternalEList<?>)getRefByAVFRestriction()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				return ((InternalEList<?>)getRefBySVFRestriction()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				return ((InternalEList<?>)getRDFSSubClassOf()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				return ((InternalEList<?>)getSubClass()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				return ((InternalEList<?>)getOwnedProperty()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				return ((InternalEList<?>)getRangedByProperty()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				return getRefByAVFRestriction();
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				return getRefBySVFRestriction();
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				return getRDFSSubClassOf();
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				return getSubClass();
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				return getOwnedProperty();
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				return getRangedByProperty();
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				return getInstance();
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				getRefByAVFRestriction().clear();
				getRefByAVFRestriction().addAll((Collection<? extends AllValuesFromRestriction>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				getRefBySVFRestriction().clear();
				getRefBySVFRestriction().addAll((Collection<? extends SomeValuesFromRestriction>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				getRDFSSubClassOf().clear();
				getRDFSSubClassOf().addAll((Collection<? extends RDFSClass>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				getSubClass().clear();
				getSubClass().addAll((Collection<? extends RDFSClass>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends RDFProperty>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				getRangedByProperty().clear();
				getRangedByProperty().addAll((Collection<? extends RDFProperty>)newValue);
				return;
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends RDFSResource>)newValue);
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				getRefByAVFRestriction().clear();
				return;
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				getRefBySVFRestriction().clear();
				return;
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				getRDFSSubClassOf().clear();
				return;
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				getSubClass().clear();
				return;
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				getRangedByProperty().clear();
				return;
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				getInstance().clear();
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
			case RdfsPackage.RDFS_CLASS__REF_BY_AVF_RESTRICTION:
				return refByAVFRestriction != null && !refByAVFRestriction.isEmpty();
			case RdfsPackage.RDFS_CLASS__REF_BY_SVF_RESTRICTION:
				return refBySVFRestriction != null && !refBySVFRestriction.isEmpty();
			case RdfsPackage.RDFS_CLASS__RDFS_SUB_CLASS_OF:
				return rdfsSubClassOf != null && !rdfsSubClassOf.isEmpty();
			case RdfsPackage.RDFS_CLASS__SUB_CLASS:
				return subClass != null && !subClass.isEmpty();
			case RdfsPackage.RDFS_CLASS__OWNED_PROPERTY:
				return ownedProperty != null && !ownedProperty.isEmpty();
			case RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY:
				return rangedByProperty != null && !rangedByProperty.isEmpty();
			case RdfsPackage.RDFS_CLASS__INSTANCE:
				return instance != null && !instance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RDFSClassImpl
