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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.DatatypeSlot;
import owl.Individual;
import owl.OWLAllDifferent;
import owl.ObjectSlot;
import owl.OwlPackage;

import rdfs.impl.RDFSResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.IndividualImpl#getOWLDifferentFrom <em>OWL Different From</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getInvOWLDifferentFrom <em>Inv OWL Different From</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getRefByOWLDistinctMembers <em>Ref By OWL Distinct Members</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getOWLSameAs <em>OWL Same As</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getInvOWLSameAs <em>Inv OWL Same As</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getDatatypeSlot <em>Datatype Slot</em>}</li>
 *   <li>{@link owl.impl.IndividualImpl#getObjectSlot <em>Object Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualImpl extends RDFSResourceImpl implements Individual {
	/**
	 * The cached value of the '{@link #getOWLDifferentFrom() <em>OWL Different From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLDifferentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> owlDifferentFrom;

	/**
	 * The cached value of the '{@link #getInvOWLDifferentFrom() <em>Inv OWL Different From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLDifferentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> invOWLDifferentFrom;

	/**
	 * The cached value of the '{@link #getRefByOWLDistinctMembers() <em>Ref By OWL Distinct Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByOWLDistinctMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLAllDifferent> refByOWLDistinctMembers;

	/**
	 * The cached value of the '{@link #getOWLSameAs() <em>OWL Same As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLSameAs()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> owlSameAs;

	/**
	 * The cached value of the '{@link #getInvOWLSameAs() <em>Inv OWL Same As</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLSameAs()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> invOWLSameAs;

	/**
	 * The cached value of the '{@link #getDatatypeSlot() <em>Datatype Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeSlot> datatypeSlot;

	/**
	 * The cached value of the '{@link #getObjectSlot() <em>Object Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectSlot> objectSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getOWLDifferentFrom() {
		if (owlDifferentFrom == null) {
			owlDifferentFrom = new EObjectWithInverseResolvingEList.ManyInverse<Individual>(Individual.class, this, OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM, OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM);
		}
		return owlDifferentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getInvOWLDifferentFrom() {
		if (invOWLDifferentFrom == null) {
			invOWLDifferentFrom = new EObjectWithInverseResolvingEList.ManyInverse<Individual>(Individual.class, this, OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM, OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM);
		}
		return invOWLDifferentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLAllDifferent> getRefByOWLDistinctMembers() {
		if (refByOWLDistinctMembers == null) {
			refByOWLDistinctMembers = new EObjectWithInverseResolvingEList.ManyInverse<OWLAllDifferent>(OWLAllDifferent.class, this, OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS, OwlPackage.OWL_ALL_DIFFERENT__OWL_DISTINCT_MEMBERS);
		}
		return refByOWLDistinctMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getOWLSameAs() {
		if (owlSameAs == null) {
			owlSameAs = new EObjectWithInverseResolvingEList.ManyInverse<Individual>(Individual.class, this, OwlPackage.INDIVIDUAL__OWL_SAME_AS, OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS);
		}
		return owlSameAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getInvOWLSameAs() {
		if (invOWLSameAs == null) {
			invOWLSameAs = new EObjectWithInverseResolvingEList.ManyInverse<Individual>(Individual.class, this, OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS, OwlPackage.INDIVIDUAL__OWL_SAME_AS);
		}
		return invOWLSameAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeSlot> getDatatypeSlot() {
		if (datatypeSlot == null) {
			datatypeSlot = new EObjectContainmentWithInverseEList<DatatypeSlot>(DatatypeSlot.class, this, OwlPackage.INDIVIDUAL__DATATYPE_SLOT, OwlPackage.DATATYPE_SLOT__INDIVIDUAL);
		}
		return datatypeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectSlot> getObjectSlot() {
		if (objectSlot == null) {
			objectSlot = new EObjectContainmentWithInverseEList<ObjectSlot>(ObjectSlot.class, this, OwlPackage.INDIVIDUAL__OBJECT_SLOT, OwlPackage.OBJECT_SLOT__INDIVIDUAL);
		}
		return objectSlot;
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLDifferentFrom()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLDifferentFrom()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefByOWLDistinctMembers()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLSameAs()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLSameAs()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatatypeSlot()).basicAdd(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectSlot()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				return ((InternalEList<?>)getOWLDifferentFrom()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				return ((InternalEList<?>)getInvOWLDifferentFrom()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				return ((InternalEList<?>)getRefByOWLDistinctMembers()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				return ((InternalEList<?>)getOWLSameAs()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				return ((InternalEList<?>)getInvOWLSameAs()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				return ((InternalEList<?>)getDatatypeSlot()).basicRemove(otherEnd, msgs);
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				return ((InternalEList<?>)getObjectSlot()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				return getOWLDifferentFrom();
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				return getInvOWLDifferentFrom();
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				return getRefByOWLDistinctMembers();
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				return getOWLSameAs();
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				return getInvOWLSameAs();
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				return getDatatypeSlot();
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				return getObjectSlot();
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				getOWLDifferentFrom().clear();
				getOWLDifferentFrom().addAll((Collection<? extends Individual>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				getInvOWLDifferentFrom().clear();
				getInvOWLDifferentFrom().addAll((Collection<? extends Individual>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				getRefByOWLDistinctMembers().clear();
				getRefByOWLDistinctMembers().addAll((Collection<? extends OWLAllDifferent>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				getOWLSameAs().clear();
				getOWLSameAs().addAll((Collection<? extends Individual>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				getInvOWLSameAs().clear();
				getInvOWLSameAs().addAll((Collection<? extends Individual>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				getDatatypeSlot().clear();
				getDatatypeSlot().addAll((Collection<? extends DatatypeSlot>)newValue);
				return;
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				getObjectSlot().clear();
				getObjectSlot().addAll((Collection<? extends ObjectSlot>)newValue);
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				getOWLDifferentFrom().clear();
				return;
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				getInvOWLDifferentFrom().clear();
				return;
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				getRefByOWLDistinctMembers().clear();
				return;
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				getOWLSameAs().clear();
				return;
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				getInvOWLSameAs().clear();
				return;
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				getDatatypeSlot().clear();
				return;
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				getObjectSlot().clear();
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
			case OwlPackage.INDIVIDUAL__OWL_DIFFERENT_FROM:
				return owlDifferentFrom != null && !owlDifferentFrom.isEmpty();
			case OwlPackage.INDIVIDUAL__INV_OWL_DIFFERENT_FROM:
				return invOWLDifferentFrom != null && !invOWLDifferentFrom.isEmpty();
			case OwlPackage.INDIVIDUAL__REF_BY_OWL_DISTINCT_MEMBERS:
				return refByOWLDistinctMembers != null && !refByOWLDistinctMembers.isEmpty();
			case OwlPackage.INDIVIDUAL__OWL_SAME_AS:
				return owlSameAs != null && !owlSameAs.isEmpty();
			case OwlPackage.INDIVIDUAL__INV_OWL_SAME_AS:
				return invOWLSameAs != null && !invOWLSameAs.isEmpty();
			case OwlPackage.INDIVIDUAL__DATATYPE_SLOT:
				return datatypeSlot != null && !datatypeSlot.isEmpty();
			case OwlPackage.INDIVIDUAL__OBJECT_SLOT:
				return objectSlot != null && !objectSlot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
