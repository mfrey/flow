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

import owl.OWLRestriction;
import owl.OwlPackage;

import rdfs.RDFProperty;
import rdfs.RDFSClass;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDF Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFPropertyImpl#getRefByRestriction <em>Ref By Restriction</em>}</li>
 *   <li>{@link rdfs.impl.RDFPropertyImpl#getRDFSSubPropertyOf <em>RDFS Sub Property Of</em>}</li>
 *   <li>{@link rdfs.impl.RDFPropertyImpl#getSubProperty <em>Sub Property</em>}</li>
 *   <li>{@link rdfs.impl.RDFPropertyImpl#getRDFSDomain <em>RDFS Domain</em>}</li>
 *   <li>{@link rdfs.impl.RDFPropertyImpl#getRDFSRange <em>RDFS Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFPropertyImpl extends RDFSResourceImpl implements RDFProperty {
	/**
	 * The cached value of the '{@link #getRefByRestriction() <em>Ref By Restriction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLRestriction> refByRestriction;

	/**
	 * The cached value of the '{@link #getRDFSSubPropertyOf() <em>RDFS Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFProperty> rdfsSubPropertyOf;

	/**
	 * The cached value of the '{@link #getSubProperty() <em>Sub Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFProperty> subProperty;

	/**
	 * The cached value of the '{@link #getRDFSDomain() <em>RDFS Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSClass> rdfsDomain;

	/**
	 * The cached value of the '{@link #getRDFSRange() <em>RDFS Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFSRange()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSClass> rdfsRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDF_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLRestriction> getRefByRestriction() {
		if (refByRestriction == null) {
			refByRestriction = new EObjectWithInverseResolvingEList<OWLRestriction>(OWLRestriction.class, this, RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION, OwlPackage.OWL_RESTRICTION__OWL_ON_PROPERTY);
		}
		return refByRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFProperty> getRDFSSubPropertyOf() {
		if (rdfsSubPropertyOf == null) {
			rdfsSubPropertyOf = new EObjectWithInverseResolvingEList.ManyInverse<RDFProperty>(RDFProperty.class, this, RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF, RdfsPackage.RDF_PROPERTY__SUB_PROPERTY);
		}
		return rdfsSubPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFProperty> getSubProperty() {
		if (subProperty == null) {
			subProperty = new EObjectWithInverseResolvingEList.ManyInverse<RDFProperty>(RDFProperty.class, this, RdfsPackage.RDF_PROPERTY__SUB_PROPERTY, RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF);
		}
		return subProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSClass> getRDFSDomain() {
		if (rdfsDomain == null) {
			rdfsDomain = new EObjectWithInverseResolvingEList.ManyInverse<RDFSClass>(RDFSClass.class, this, RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN, RdfsPackage.RDFS_CLASS__OWNED_PROPERTY);
		}
		return rdfsDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSClass> getRDFSRange() {
		if (rdfsRange == null) {
			rdfsRange = new EObjectWithInverseResolvingEList.ManyInverse<RDFSClass>(RDFSClass.class, this, RdfsPackage.RDF_PROPERTY__RDFS_RANGE, RdfsPackage.RDFS_CLASS__RANGED_BY_PROPERTY);
		}
		return rdfsRange;
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefByRestriction()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRDFSSubPropertyOf()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProperty()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRDFSDomain()).basicAdd(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRDFSRange()).basicAdd(otherEnd, msgs);
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				return ((InternalEList<?>)getRefByRestriction()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				return ((InternalEList<?>)getRDFSSubPropertyOf()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				return ((InternalEList<?>)getSubProperty()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				return ((InternalEList<?>)getRDFSDomain()).basicRemove(otherEnd, msgs);
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				return ((InternalEList<?>)getRDFSRange()).basicRemove(otherEnd, msgs);
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				return getRefByRestriction();
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				return getRDFSSubPropertyOf();
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				return getSubProperty();
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				return getRDFSDomain();
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				return getRDFSRange();
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				getRefByRestriction().clear();
				getRefByRestriction().addAll((Collection<? extends OWLRestriction>)newValue);
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				getRDFSSubPropertyOf().clear();
				getRDFSSubPropertyOf().addAll((Collection<? extends RDFProperty>)newValue);
				return;
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				getSubProperty().clear();
				getSubProperty().addAll((Collection<? extends RDFProperty>)newValue);
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				getRDFSDomain().clear();
				getRDFSDomain().addAll((Collection<? extends RDFSClass>)newValue);
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				getRDFSRange().clear();
				getRDFSRange().addAll((Collection<? extends RDFSClass>)newValue);
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				getRefByRestriction().clear();
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				getRDFSSubPropertyOf().clear();
				return;
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				getSubProperty().clear();
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				getRDFSDomain().clear();
				return;
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				getRDFSRange().clear();
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
			case RdfsPackage.RDF_PROPERTY__REF_BY_RESTRICTION:
				return refByRestriction != null && !refByRestriction.isEmpty();
			case RdfsPackage.RDF_PROPERTY__RDFS_SUB_PROPERTY_OF:
				return rdfsSubPropertyOf != null && !rdfsSubPropertyOf.isEmpty();
			case RdfsPackage.RDF_PROPERTY__SUB_PROPERTY:
				return subProperty != null && !subProperty.isEmpty();
			case RdfsPackage.RDF_PROPERTY__RDFS_DOMAIN:
				return rdfsDomain != null && !rdfsDomain.isEmpty();
			case RdfsPackage.RDF_PROPERTY__RDFS_RANGE:
				return rdfsRange != null && !rdfsRange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RDFPropertyImpl
