/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl;

import org.eclipse.emf.common.util.EList;

import rdfs.RDFSClass;
import rdfs.RDFSLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OWL Data Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owl.OWLDataRange#getOWLOneOf <em>OWL One Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see owl.OwlPackage#getOWLDataRange()
 * @model
 * @generated
 */
public interface OWLDataRange extends RDFSClass {
	/**
	 * Returns the value of the '<em><b>OWL One Of</b></em>' reference list.
	 * The list contents are of type {@link rdfs.RDFSLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OWL One Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OWL One Of</em>' reference list.
	 * @see owl.OwlPackage#getOWLDataRange_OWLOneOf()
	 * @model required="true"
	 * @generated
	 */
	EList<RDFSLiteral> getOWLOneOf();

} // OWLDataRange
