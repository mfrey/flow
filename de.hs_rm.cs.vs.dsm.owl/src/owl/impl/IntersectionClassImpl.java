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

import owl.IntersectionClass;
import owl.OWLClass;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.IntersectionClassImpl#getOWLIntersectionOf <em>OWL Intersection Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntersectionClassImpl extends OWLClassImpl implements IntersectionClass {
	/**
	 * The cached value of the '{@link #getOWLIntersectionOf() <em>OWL Intersection Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> owlIntersectionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntersectionClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.INTERSECTION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getOWLIntersectionOf() {
		if (owlIntersectionOf == null) {
			owlIntersectionOf = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF, OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS);
		}
		return owlIntersectionOf;
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLIntersectionOf()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				return ((InternalEList<?>)getOWLIntersectionOf()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				return getOWLIntersectionOf();
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				getOWLIntersectionOf().clear();
				getOWLIntersectionOf().addAll((Collection<? extends OWLClass>)newValue);
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				getOWLIntersectionOf().clear();
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
			case OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF:
				return owlIntersectionOf != null && !owlIntersectionOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntersectionClassImpl
