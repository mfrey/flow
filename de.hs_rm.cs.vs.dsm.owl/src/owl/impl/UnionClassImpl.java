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

import owl.OWLClass;
import owl.OwlPackage;
import owl.UnionClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.UnionClassImpl#getOWLUnionOf <em>OWL Union Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionClassImpl extends OWLClassImpl implements UnionClass {
	/**
	 * The cached value of the '{@link #getOWLUnionOf() <em>OWL Union Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLUnionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> owlUnionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.UNION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getOWLUnionOf() {
		if (owlUnionOf == null) {
			owlUnionOf = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.UNION_CLASS__OWL_UNION_OF, OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS);
		}
		return owlUnionOf;
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLUnionOf()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				return ((InternalEList<?>)getOWLUnionOf()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				return getOWLUnionOf();
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				getOWLUnionOf().clear();
				getOWLUnionOf().addAll((Collection<? extends OWLClass>)newValue);
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				getOWLUnionOf().clear();
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
			case OwlPackage.UNION_CLASS__OWL_UNION_OF:
				return owlUnionOf != null && !owlUnionOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnionClassImpl
