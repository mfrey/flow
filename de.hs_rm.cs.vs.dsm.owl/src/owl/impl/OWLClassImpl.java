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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.ComplementClass;
import owl.IntersectionClass;
import owl.OWLClass;
import owl.OwlPackage;
import owl.UnionClass;

import rdfs.impl.RDFSClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLClassImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getInvOWLEquivalentClass <em>Inv OWL Equivalent Class</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getOWLEquivalentClass <em>OWL Equivalent Class</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getOWLDisjointWith <em>OWL Disjoint With</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getInvOWLDisjointWith <em>Inv OWL Disjoint With</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getRefByIntersectionClass <em>Ref By Intersection Class</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getRefByUnionClass <em>Ref By Union Class</em>}</li>
 *   <li>{@link owl.impl.OWLClassImpl#getInvOWLComplementOf <em>Inv OWL Complement Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLClassImpl extends RDFSClassImpl implements OWLClass {
	/**
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvOWLEquivalentClass() <em>Inv OWL Equivalent Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLEquivalentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> invOWLEquivalentClass;

	/**
	 * The cached value of the '{@link #getOWLEquivalentClass() <em>OWL Equivalent Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLEquivalentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> owlEquivalentClass;

	/**
	 * The cached value of the '{@link #getOWLDisjointWith() <em>OWL Disjoint With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLDisjointWith()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> owlDisjointWith;

	/**
	 * The cached value of the '{@link #getInvOWLDisjointWith() <em>Inv OWL Disjoint With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLDisjointWith()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLClass> invOWLDisjointWith;

	/**
	 * The cached value of the '{@link #getRefByIntersectionClass() <em>Ref By Intersection Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByIntersectionClass()
	 * @generated
	 * @ordered
	 */
	protected EList<IntersectionClass> refByIntersectionClass;

	/**
	 * The cached value of the '{@link #getRefByUnionClass() <em>Ref By Union Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByUnionClass()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionClass> refByUnionClass;

	/**
	 * The cached value of the '{@link #getInvOWLComplementOf() <em>Inv OWL Complement Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvOWLComplementOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplementClass> invOWLComplementOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(Boolean newDeprecated) {
		Boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.OWL_CLASS__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getInvOWLEquivalentClass() {
		if (invOWLEquivalentClass == null) {
			invOWLEquivalentClass = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS, OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS);
		}
		return invOWLEquivalentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getOWLEquivalentClass() {
		if (owlEquivalentClass == null) {
			owlEquivalentClass = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS, OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS);
		}
		return owlEquivalentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getOWLDisjointWith() {
		if (owlDisjointWith == null) {
			owlDisjointWith = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH, OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH);
		}
		return owlDisjointWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLClass> getInvOWLDisjointWith() {
		if (invOWLDisjointWith == null) {
			invOWLDisjointWith = new EObjectWithInverseResolvingEList.ManyInverse<OWLClass>(OWLClass.class, this, OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH, OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH);
		}
		return invOWLDisjointWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntersectionClass> getRefByIntersectionClass() {
		if (refByIntersectionClass == null) {
			refByIntersectionClass = new EObjectWithInverseResolvingEList.ManyInverse<IntersectionClass>(IntersectionClass.class, this, OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS, OwlPackage.INTERSECTION_CLASS__OWL_INTERSECTION_OF);
		}
		return refByIntersectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionClass> getRefByUnionClass() {
		if (refByUnionClass == null) {
			refByUnionClass = new EObjectWithInverseResolvingEList.ManyInverse<UnionClass>(UnionClass.class, this, OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS, OwlPackage.UNION_CLASS__OWL_UNION_OF);
		}
		return refByUnionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplementClass> getInvOWLComplementOf() {
		if (invOWLComplementOf == null) {
			invOWLComplementOf = new EObjectWithInverseResolvingEList<ComplementClass>(ComplementClass.class, this, OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF, OwlPackage.COMPLEMENT_CLASS__OWL_COMPLEMENT_OF);
		}
		return invOWLComplementOf;
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
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLEquivalentClass()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLEquivalentClass()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOWLDisjointWith()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLDisjointWith()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefByIntersectionClass()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefByUnionClass()).basicAdd(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvOWLComplementOf()).basicAdd(otherEnd, msgs);
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
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				return ((InternalEList<?>)getInvOWLEquivalentClass()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				return ((InternalEList<?>)getOWLEquivalentClass()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				return ((InternalEList<?>)getOWLDisjointWith()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				return ((InternalEList<?>)getInvOWLDisjointWith()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				return ((InternalEList<?>)getRefByIntersectionClass()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				return ((InternalEList<?>)getRefByUnionClass()).basicRemove(otherEnd, msgs);
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				return ((InternalEList<?>)getInvOWLComplementOf()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.OWL_CLASS__DEPRECATED:
				return getDeprecated();
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				return getInvOWLEquivalentClass();
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				return getOWLEquivalentClass();
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				return getOWLDisjointWith();
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				return getInvOWLDisjointWith();
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				return getRefByIntersectionClass();
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				return getRefByUnionClass();
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				return getInvOWLComplementOf();
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
			case OwlPackage.OWL_CLASS__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				getInvOWLEquivalentClass().clear();
				getInvOWLEquivalentClass().addAll((Collection<? extends OWLClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				getOWLEquivalentClass().clear();
				getOWLEquivalentClass().addAll((Collection<? extends OWLClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				getOWLDisjointWith().clear();
				getOWLDisjointWith().addAll((Collection<? extends OWLClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				getInvOWLDisjointWith().clear();
				getInvOWLDisjointWith().addAll((Collection<? extends OWLClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				getRefByIntersectionClass().clear();
				getRefByIntersectionClass().addAll((Collection<? extends IntersectionClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				getRefByUnionClass().clear();
				getRefByUnionClass().addAll((Collection<? extends UnionClass>)newValue);
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				getInvOWLComplementOf().clear();
				getInvOWLComplementOf().addAll((Collection<? extends ComplementClass>)newValue);
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
			case OwlPackage.OWL_CLASS__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				getInvOWLEquivalentClass().clear();
				return;
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				getOWLEquivalentClass().clear();
				return;
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				getOWLDisjointWith().clear();
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				getInvOWLDisjointWith().clear();
				return;
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				getRefByIntersectionClass().clear();
				return;
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				getRefByUnionClass().clear();
				return;
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				getInvOWLComplementOf().clear();
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
			case OwlPackage.OWL_CLASS__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case OwlPackage.OWL_CLASS__INV_OWL_EQUIVALENT_CLASS:
				return invOWLEquivalentClass != null && !invOWLEquivalentClass.isEmpty();
			case OwlPackage.OWL_CLASS__OWL_EQUIVALENT_CLASS:
				return owlEquivalentClass != null && !owlEquivalentClass.isEmpty();
			case OwlPackage.OWL_CLASS__OWL_DISJOINT_WITH:
				return owlDisjointWith != null && !owlDisjointWith.isEmpty();
			case OwlPackage.OWL_CLASS__INV_OWL_DISJOINT_WITH:
				return invOWLDisjointWith != null && !invOWLDisjointWith.isEmpty();
			case OwlPackage.OWL_CLASS__REF_BY_INTERSECTION_CLASS:
				return refByIntersectionClass != null && !refByIntersectionClass.isEmpty();
			case OwlPackage.OWL_CLASS__REF_BY_UNION_CLASS:
				return refByUnionClass != null && !refByUnionClass.isEmpty();
			case OwlPackage.OWL_CLASS__INV_OWL_COMPLEMENT_OF:
				return invOWLComplementOf != null && !invOWLComplementOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deprecated: ");
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //OWLClassImpl
