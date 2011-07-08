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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owl.OWLOntology;
import owl.OwlPackage;

import rdfs.RDFSLiteral;

import rdfs.impl.OntologyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OWL Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owl.impl.OWLOntologyImpl#getOWLBackwardCompatibleWith <em>OWL Backward Compatible With</em>}</li>
 *   <li>{@link owl.impl.OWLOntologyImpl#getOWLImports <em>OWL Imports</em>}</li>
 *   <li>{@link owl.impl.OWLOntologyImpl#getOWLIncompatibleWith <em>OWL Incompatible With</em>}</li>
 *   <li>{@link owl.impl.OWLOntologyImpl#getOWLPriorVersion <em>OWL Prior Version</em>}</li>
 *   <li>{@link owl.impl.OWLOntologyImpl#getOWLVersionInfo <em>OWL Version Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OWLOntologyImpl extends OntologyImpl implements OWLOntology {
	/**
	 * The cached value of the '{@link #getOWLBackwardCompatibleWith() <em>OWL Backward Compatible With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLBackwardCompatibleWith()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLOntology> owlBackwardCompatibleWith;

	/**
	 * The cached value of the '{@link #getOWLImports() <em>OWL Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLImports()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLOntology> owlImports;

	/**
	 * The cached value of the '{@link #getOWLIncompatibleWith() <em>OWL Incompatible With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLIncompatibleWith()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLOntology> owlIncompatibleWith;

	/**
	 * The cached value of the '{@link #getOWLPriorVersion() <em>OWL Prior Version</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLPriorVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<OWLOntology> owlPriorVersion;

	/**
	 * The cached value of the '{@link #getOWLVersionInfo() <em>OWL Version Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOWLVersionInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFSLiteral> owlVersionInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OWLOntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.OWL_ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLOntology> getOWLBackwardCompatibleWith() {
		if (owlBackwardCompatibleWith == null) {
			owlBackwardCompatibleWith = new EObjectResolvingEList<OWLOntology>(OWLOntology.class, this, OwlPackage.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH);
		}
		return owlBackwardCompatibleWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLOntology> getOWLImports() {
		if (owlImports == null) {
			owlImports = new EObjectResolvingEList<OWLOntology>(OWLOntology.class, this, OwlPackage.OWL_ONTOLOGY__OWL_IMPORTS);
		}
		return owlImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLOntology> getOWLIncompatibleWith() {
		if (owlIncompatibleWith == null) {
			owlIncompatibleWith = new EObjectResolvingEList<OWLOntology>(OWLOntology.class, this, OwlPackage.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH);
		}
		return owlIncompatibleWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OWLOntology> getOWLPriorVersion() {
		if (owlPriorVersion == null) {
			owlPriorVersion = new EObjectResolvingEList<OWLOntology>(OWLOntology.class, this, OwlPackage.OWL_ONTOLOGY__OWL_PRIOR_VERSION);
		}
		return owlPriorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDFSLiteral> getOWLVersionInfo() {
		if (owlVersionInfo == null) {
			owlVersionInfo = new EObjectContainmentEList<RDFSLiteral>(RDFSLiteral.class, this, OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO);
		}
		return owlVersionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
				return ((InternalEList<?>)getOWLVersionInfo()).basicRemove(otherEnd, msgs);
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
			case OwlPackage.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH:
				return getOWLBackwardCompatibleWith();
			case OwlPackage.OWL_ONTOLOGY__OWL_IMPORTS:
				return getOWLImports();
			case OwlPackage.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH:
				return getOWLIncompatibleWith();
			case OwlPackage.OWL_ONTOLOGY__OWL_PRIOR_VERSION:
				return getOWLPriorVersion();
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
				return getOWLVersionInfo();
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
			case OwlPackage.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH:
				getOWLBackwardCompatibleWith().clear();
				getOWLBackwardCompatibleWith().addAll((Collection<? extends OWLOntology>)newValue);
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_IMPORTS:
				getOWLImports().clear();
				getOWLImports().addAll((Collection<? extends OWLOntology>)newValue);
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH:
				getOWLIncompatibleWith().clear();
				getOWLIncompatibleWith().addAll((Collection<? extends OWLOntology>)newValue);
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_PRIOR_VERSION:
				getOWLPriorVersion().clear();
				getOWLPriorVersion().addAll((Collection<? extends OWLOntology>)newValue);
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
				getOWLVersionInfo().clear();
				getOWLVersionInfo().addAll((Collection<? extends RDFSLiteral>)newValue);
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
			case OwlPackage.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH:
				getOWLBackwardCompatibleWith().clear();
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_IMPORTS:
				getOWLImports().clear();
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH:
				getOWLIncompatibleWith().clear();
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_PRIOR_VERSION:
				getOWLPriorVersion().clear();
				return;
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
				getOWLVersionInfo().clear();
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
			case OwlPackage.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH:
				return owlBackwardCompatibleWith != null && !owlBackwardCompatibleWith.isEmpty();
			case OwlPackage.OWL_ONTOLOGY__OWL_IMPORTS:
				return owlImports != null && !owlImports.isEmpty();
			case OwlPackage.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH:
				return owlIncompatibleWith != null && !owlIncompatibleWith.isEmpty();
			case OwlPackage.OWL_ONTOLOGY__OWL_PRIOR_VERSION:
				return owlPriorVersion != null && !owlPriorVersion.isEmpty();
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
				return owlVersionInfo != null && !owlVersionInfo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OWLOntologyImpl
