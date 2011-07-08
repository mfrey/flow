/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.Ontology#getContains <em>Contains</em>}</li>
 *   <li>{@link rdfs.Ontology#getOwnedNamespace <em>Owned Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see rdfs.RdfsPackage#getOntology_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDFSResource> getContains();

	/**
	 * Returns the value of the '<em><b>Owned Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link rdfs.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Namespace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Namespace</em>' containment reference list.
	 * @see rdfs.RdfsPackage#getOntology_OwnedNamespace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getOwnedNamespace();

} // Ontology
