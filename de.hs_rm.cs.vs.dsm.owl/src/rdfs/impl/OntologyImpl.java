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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdfs.Namespace;
import rdfs.Ontology;
import rdfs.RDFSResource;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.OntologyImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link rdfs.impl.OntologyImpl#getOwnedNamespace <em>Owned Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends RDFSResourceImpl implements Ontology {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSResource> contains;

	/**
	 * The cached value of the '{@link #getOwnedNamespace() <em>Owned Namespace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> ownedNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSResource> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<RDFSResource>(RDFSResource.class, this, RdfsPackage.ONTOLOGY__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getOwnedNamespace() {
		if (ownedNamespace == null) {
			ownedNamespace = new EObjectContainmentEList<Namespace>(Namespace.class, this, RdfsPackage.ONTOLOGY__OWNED_NAMESPACE);
		}
		return ownedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.ONTOLOGY__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				return ((InternalEList<?>)getOwnedNamespace()).basicRemove(otherEnd, msgs);
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
			case RdfsPackage.ONTOLOGY__CONTAINS:
				return getContains();
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				return getOwnedNamespace();
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
			case RdfsPackage.ONTOLOGY__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends RDFSResource>)newValue);
				return;
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				getOwnedNamespace().clear();
				getOwnedNamespace().addAll((Collection<? extends Namespace>)newValue);
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
			case RdfsPackage.ONTOLOGY__CONTAINS:
				getContains().clear();
				return;
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				getOwnedNamespace().clear();
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
			case RdfsPackage.ONTOLOGY__CONTAINS:
				return contains != null && !contains.isEmpty();
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				return ownedNamespace != null && !ownedNamespace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OntologyImpl
