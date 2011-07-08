/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs;

import org.eclipse.emf.common.util.EList;

import owl.AllValuesFromRestriction;
import owl.SomeValuesFromRestriction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDFS Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdfs.RDFSClass#getRefByAVFRestriction <em>Ref By AVF Restriction</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getRefBySVFRestriction <em>Ref By SVF Restriction</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getRDFSSubClassOf <em>RDFS Sub Class Of</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getRangedByProperty <em>Ranged By Property</em>}</li>
 *   <li>{@link rdfs.RDFSClass#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdfs.RdfsPackage#getRDFSClass()
 * @model
 * @generated
 */
public interface RDFSClass extends RDFSResource {
	/**
	 * Returns the value of the '<em><b>Ref By AVF Restriction</b></em>' reference list.
	 * The list contents are of type {@link owl.AllValuesFromRestriction}.
	 * It is bidirectional and its opposite is '{@link owl.AllValuesFromRestriction#getOWLAllValuesFrom <em>OWL All Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By AVF Restriction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By AVF Restriction</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_RefByAVFRestriction()
	 * @see owl.AllValuesFromRestriction#getOWLAllValuesFrom
	 * @model opposite="OWLAllValuesFrom"
	 * @generated
	 */
	EList<AllValuesFromRestriction> getRefByAVFRestriction();

	/**
	 * Returns the value of the '<em><b>Ref By SVF Restriction</b></em>' reference list.
	 * The list contents are of type {@link owl.SomeValuesFromRestriction}.
	 * It is bidirectional and its opposite is '{@link owl.SomeValuesFromRestriction#getOWLSomeValuesFrom <em>OWL Some Values From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By SVF Restriction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By SVF Restriction</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_RefBySVFRestriction()
	 * @see owl.SomeValuesFromRestriction#getOWLSomeValuesFrom
	 * @model opposite="OWLSomeValuesFrom"
	 * @generated
	 */
	EList<SomeValuesFromRestriction> getRefBySVFRestriction();

	/**
	 * Returns the value of the '<em><b>RDFS Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSClass}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getSubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDFS Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDFS Sub Class Of</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_RDFSSubClassOf()
	 * @see rdfs.RDFSClass#getSubClass
	 * @model opposite="subClass"
	 * @generated
	 */
	EList<RDFSClass> getRDFSSubClassOf();

	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSClass}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSClass#getRDFSSubClassOf <em>RDFS Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_SubClass()
	 * @see rdfs.RDFSClass#getRDFSSubClassOf
	 * @model opposite="RDFSSubClassOf"
	 * @generated
	 */
	EList<RDFSClass> getSubClass();

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFProperty}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFProperty#getRDFSDomain <em>RDFS Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_OwnedProperty()
	 * @see rdfs.RDFProperty#getRDFSDomain
	 * @model opposite="RDFSDomain"
	 * @generated
	 */
	EList<RDFProperty> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Ranged By Property</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFProperty}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFProperty#getRDFSRange <em>RDFS Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranged By Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranged By Property</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_RangedByProperty()
	 * @see rdfs.RDFProperty#getRDFSRange
	 * @model opposite="RDFSRange"
	 * @generated
	 */
	EList<RDFProperty> getRangedByProperty();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSResource}.
	 * It is bidirectional and its opposite is '{@link rdfs.RDFSResource#getRDFType <em>RDF Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see rdfs.RdfsPackage#getRDFSClass_Instance()
	 * @see rdfs.RDFSResource#getRDFType
	 * @model opposite="RDFType"
	 * @generated
	 */
	EList<RDFSResource> getInstance();

} // RDFSClass
