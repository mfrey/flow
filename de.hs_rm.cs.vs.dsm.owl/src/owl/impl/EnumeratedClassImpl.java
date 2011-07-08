/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owl.EnumeratedClass;
import owl.Individual;
import owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.EnumeratedClassImpl#getOWLOneOf <em>OWL One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedClassImpl extends OWLClassImpl implements EnumeratedClass {
	/**
	 * The cached value of the '{@link #getOWLOneOf() <em>OWL One Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> owlOneOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ENUMERATED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getOWLOneOf() {
		if (owlOneOf == null) {
			owlOneOf = new EObjectResolvingEList<Individual>(Individual.class, this, OwlPackage.ENUMERATED_CLASS__OWL_ONE_OF);
		}
		return owlOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ENUMERATED_CLASS__OWL_ONE_OF:
				return getOWLOneOf();
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
			case OwlPackage.ENUMERATED_CLASS__OWL_ONE_OF:
				getOWLOneOf().clear();
				getOWLOneOf().addAll((Collection<? extends Individual>)newValue);
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
			case OwlPackage.ENUMERATED_CLASS__OWL_ONE_OF:
				getOWLOneOf().clear();
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
			case OwlPackage.ENUMERATED_CLASS__OWL_ONE_OF:
				return owlOneOf != null && !owlOneOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedClassImpl
