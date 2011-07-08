/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.common.util.EList;

import owl.OWLRestriction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFProperty#getRefByRestriction <em>Ref By Restriction</em>}</li>
 *   <li>{@link rdfs.RDFProperty#getRDFSSubPropertyOf <em>RDFS Sub Property Of</em>}</li>
 *   <li>{@link rdfs.RDFProperty#getSubProperty <em>Sub Property</em>}</li>
 *   <li>{@link rdfs.RDFProperty#getRDFSDomain <em>RDFS Domain</em>}</li>
 *   <li>{@link rdfs.RDFProperty#getRDFSRange <em>RDFS Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFProperty()
 * @model
 * @generated
 */
public interface RDFProperty extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>Ref By Restriction</b></em>' reference list.
	 * The list contents are of type {@link owl.OWLRestriction}.
	 * It is bidirectional and its opposite is '{@link owl.OWLRestriction#getOWLOnProperty <em>OWL On Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By Restriction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By Restriction</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFProperty_RefByRestriction()
	 * @see owl.OWLRestriction#getOWLOnProperty
	 * @model opposite="OWLOnProperty"
	 * @generated
	 */
	EList<OWLRestriction> getRefByRestriction();

	/**
	 * Returns the value of the '<em><b>RDFS Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFProperty}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFProperty#getSubProperty <em>Sub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Sub Property Of</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFProperty_RDFSSubPropertyOf()
	 * @see rdfs.RDFProperty#getSubProperty
	 * @model opposite="subProperty"
	 * @generated
	 */
	EList<RDFProperty> getRDFSSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Sub Property</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFProperty}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFProperty#getRDFSSubPropertyOf <em>RDFS Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFProperty_SubProperty()
	 * @see rdfs.RDFProperty#getRDFSSubPropertyOf
	 * @model opposite="RDFSSubPropertyOf"
	 * @generated
	 */
	EList<RDFProperty> getSubProperty();

	/**
	 * Returns the value of the '<em><b>RDFS Domain</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSClass}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Domain</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFProperty_RDFSDomain()
	 * @see rdfs.RDFSClass#getOwnedProperty
	 * @model opposite="ownedProperty"
	 * @generated
	 */
	EList<RDFSClass> getRDFSDomain();

	/**
	 * Returns the value of the '<em><b>RDFS Range</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSClass}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getRangedByProperty <em>Ranged By Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Range</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFProperty_RDFSRange()
	 * @see rdfs.RDFSClass#getRangedByProperty
	 * @model opposite="rangedByProperty"
	 * @generated
	 */
	EList<RDFSClass> getRDFSRange();

} // RDFProperty
