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

import owl.OWLDataRange;
import owl.OwlPackage;

import rdfs.RDFSLiteral;

import rdfs.impl.RDFSClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL Data Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLDataRangeImpl#getOWLOneOf <em>OWL One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLDataRangeImpl extends RDFSClassImpl implements OWLDataRange {
	/**
	 * The cached value of the '{@link #getOWLOneOf() <em>OWL One Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLOneOf()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSLiteral> owlOneOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLDataRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_DATA_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSLiteral> getOWLOneOf() {
		if (owlOneOf == null) {
			owlOneOf = new EObjectResolvingEList<RDFSLiteral>(RDFSLiteral.class, this, OwlPackage.OWL_DATA_RANGE__OWL_ONE_OF);
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
			case OwlPackage.OWL_DATA_RANGE__OWL_ONE_OF:
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
			case OwlPackage.OWL_DATA_RANGE__OWL_ONE_OF:
				getOWLOneOf().clear();
				getOWLOneOf().addAll((Collection<? extends RDFSLiteral>)newValue);
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
			case OwlPackage.OWL_DATA_RANGE__OWL_ONE_OF:
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
			case OwlPackage.OWL_DATA_RANGE__OWL_ONE_OF:
				return owlOneOf != null && !owlOneOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OWLDataRangeImpl
