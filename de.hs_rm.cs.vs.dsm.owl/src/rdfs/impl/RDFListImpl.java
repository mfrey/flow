/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rdfs.RDFList;
import rdfs.RDFSResource;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDF List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFListImpl#getRDFRest <em>RDF Rest</em>}</li>
 *   <li>{@link rdfs.impl.RDFListImpl#getRDFFirst <em>RDF First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFListImpl extends RDFSResourceImpl implements RDFList {
	/**
	 * The cached value of the '{@link #getRDFRest() <em>RDF Rest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFRest()
	 * @generated
	 * @ordered
	 */
	protected RDFList rdfRest;

	/**
	 * The cached value of the '{@link #getRDFFirst() <em>RDF First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDFFirst()
	 * @generated
	 * @ordered
	 */
	protected RDFSResource rdfFirst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDF_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFList getRDFRest() {
		if (rdfRest != null && rdfRest.eIsProxy()) {
			InternalEObject oldRDFRest = (InternalEObject)rdfRest;
			rdfRest = (RDFList)eResolveProxy(oldRDFRest);
			if (rdfRest != oldRDFRest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_LIST__RDF_REST, oldRDFRest, rdfRest));
			}
		}
		return rdfRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFList basicGetRDFRest() {
		return rdfRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDFRest(RDFList newRDFRest) {
		RDFList oldRDFRest = rdfRest;
		rdfRest = newRDFRest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_LIST__RDF_REST, oldRDFRest, rdfRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource getRDFFirst() {
		if (rdfFirst != null && rdfFirst.eIsProxy()) {
			InternalEObject oldRDFFirst = (InternalEObject)rdfFirst;
			rdfFirst = (RDFSResource)eResolveProxy(oldRDFFirst);
			if (rdfFirst != oldRDFFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfsPackage.RDF_LIST__RDF_FIRST, oldRDFFirst, rdfFirst));
			}
		}
		return rdfFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFSResource basicGetRDFFirst() {
		return rdfFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDFFirst(RDFSResource newRDFFirst) {
		RDFSResource oldRDFFirst = rdfFirst;
		rdfFirst = newRDFFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDF_LIST__RDF_FIRST, oldRDFFirst, rdfFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdfsPackage.RDF_LIST__RDF_REST:
				if (resolve) return getRDFRest();
				return basicGetRDFRest();
			case RdfsPackage.RDF_LIST__RDF_FIRST:
				if (resolve) return getRDFFirst();
				return basicGetRDFFirst();
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
			case RdfsPackage.RDF_LIST__RDF_REST:
				setRDFRest((RDFList)newValue);
				return;
			case RdfsPackage.RDF_LIST__RDF_FIRST:
				setRDFFirst((RDFSResource)newValue);
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
			case RdfsPackage.RDF_LIST__RDF_REST:
				setRDFRest((RDFList)null);
				return;
			case RdfsPackage.RDF_LIST__RDF_FIRST:
				setRDFFirst((RDFSResource)null);
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
			case RdfsPackage.RDF_LIST__RDF_REST:
				return rdfRest != null;
			case RdfsPackage.RDF_LIST__RDF_FIRST:
				return rdfFirst != null;
		}
		return super.eIsSet(featureID);
	}

} //RDFListImpl
