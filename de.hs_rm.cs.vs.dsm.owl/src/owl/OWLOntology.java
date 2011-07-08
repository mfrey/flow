/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import rdfs.Ontology;
import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLOntology#getOWLBackwardCompatibleWith <em>OWL Backward Compatible With</em>}</li>
 *   <li>{@link owl.OWLOntology#getOWLImports <em>OWL Imports</em>}</li>
 *   <li>{@link owl.OWLOntology#getOWLIncompatibleWith <em>OWL Incompatible With</em>}</li>
 *   <li>{@link owl.OWLOntology#getOWLPriorVersion <em>OWL Prior Version</em>}</li>
 *   <li>{@link owl.OWLOntology#getOWLVersionInfo <em>OWL Version Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLOntology()
 * @model
 * @generated
 */
public interface OWLOntology extends Ontology {
	/**
	 * Returns the value of the '<em><b>OWL Backward Compatible With</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLOntology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Backward Compatible With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Backward Compatible With</em>' reference list.
	 * @see owl.OwlPackage#getOWLOntology_OWLBackwardCompatibleWith()
	 * @model
	 * @generated
	 */
	EList<OWLOntology> getOWLBackwardCompatibleWith();

	/**
	 * Returns the value of the '<em><b>OWL Imports</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLOntology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Imports</em>' reference list.
	 * @see owl.OwlPackage#getOWLOntology_OWLImports()
	 * @model
	 * @generated
	 */
	EList<OWLOntology> getOWLImports();

	/**
	 * Returns the value of the '<em><b>OWL Incompatible With</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLOntology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Incompatible With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Incompatible With</em>' reference list.
	 * @see owl.OwlPackage#getOWLOntology_OWLIncompatibleWith()
	 * @model
	 * @generated
	 */
	EList<OWLOntology> getOWLIncompatibleWith();

	/**
	 * Returns the value of the '<em><b>OWL Prior Version</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLOntology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Prior Version</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Prior Version</em>' reference list.
	 * @see owl.OwlPackage#getOWLOntology_OWLPriorVersion()
	 * @model
	 * @generated
	 */
	EList<OWLOntology> getOWLPriorVersion();

	/**
	 * Returns the value of the '<em><b>OWL Version Info</b></em>' containment reference list.
	 * The list contents are of type {@link rdfs.RDFSLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL Version Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL Version Info</em>' containment reference list.
	 * @see owl.OwlPackage#getOWLOntology_OWLVersionInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDFSLiteral> getOWLVersionInfo();

} // OWLOntology
