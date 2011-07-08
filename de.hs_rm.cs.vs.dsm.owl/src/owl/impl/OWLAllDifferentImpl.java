/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.Individual;
import owl.OWLAllDifferent;
import owl.OwlPackage;

import rdfs.impl.RDFSResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL All Different</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLAllDifferentImpl#getOWLDistinctMembers <em>OWL Distinct Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLAllDifferentImpl extends RDFSResourceImpl implements OWLAllDifferent {
	/**
	 * The cached value of the '{@link #getOWLDistinctMembers() <em>OWL Distinct Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLDistinctMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> owlDistinctMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLAllDifferentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_ALL_DIFFERENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getOWLDistinctMembers() {
		if (owlDistinctMembers == null) {
			owlDistinctMembers = new EObjectWithInverseResolvingEList.ManyInverse<Individual>(Individual.class, this, OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS, OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS);
		}
		return owlDistinctMembers;
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLDistinctMembers()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				return ((InternalEList<?>)getOWLDistinctMembers()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				return getOWLDistinctMembers();
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				getOWLDistinctMembers().clear();
				getOWLDistinctMembers().addAll((Collection<? extends Individual>)newValue);
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				getOWLDistinctMembers().clear();
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
			case OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS:
				return owlDistinctMembers != null && !owlDistinctMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OWLAllDifferentImpl
