/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import rdfs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rdfs.RdfsPackage
 * @generated
 */
public class RdfsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsSwitch() {
		if (modelPackage == null) {
			modelPackage = RdfsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdfsPackage.RDFS_RESOURCE: {
				RDFSResource rdfsResource = (RDFSResource)theEObject;
				T result = caseRDFSResource(rdfsResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFS_CLASS: {
				RDFSClass rdfsClass = (RDFSClass)theEObject;
				T result = caseRDFSClass(rdfsClass);
				if (result == null) result = caseRDFSResource(rdfsClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFS_LITERAL: {
				RDFSLiteral rdfsLiteral = (RDFSLiteral)theEObject;
				T result = caseRDFSLiteral(rdfsLiteral);
				if (result == null) result = caseRDFSResource(rdfsLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFS_DATATYPE: {
				RDFSDatatype rdfsDatatype = (RDFSDatatype)theEObject;
				T result = caseRDFSDatatype(rdfsDatatype);
				if (result == null) result = caseRDFSClass(rdfsDatatype);
				if (result == null) result = caseRDFSResource(rdfsDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFXML_LITERAL: {
				RDFXMLLiteral rdfxmlLiteral = (RDFXMLLiteral)theEObject;
				T result = caseRDFXMLLiteral(rdfxmlLiteral);
				if (result == null) result = caseTypedLiteral(rdfxmlLiteral);
				if (result == null) result = caseRDFSLiteral(rdfxmlLiteral);
				if (result == null) result = caseRDFSResource(rdfxmlLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_PROPERTY: {
				RDFProperty rdfProperty = (RDFProperty)theEObject;
				T result = caseRDFProperty(rdfProperty);
				if (result == null) result = caseRDFSResource(rdfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_LIST: {
				RDFList rdfList = (RDFList)theEObject;
				T result = caseRDFList(rdfList);
				if (result == null) result = caseRDFSResource(rdfList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFS_CONTAINER: {
				RDFSContainer rdfsContainer = (RDFSContainer)theEObject;
				T result = caseRDFSContainer(rdfsContainer);
				if (result == null) result = caseRDFSResource(rdfsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_ALT: {
				RDFAlt rdfAlt = (RDFAlt)theEObject;
				T result = caseRDFAlt(rdfAlt);
				if (result == null) result = caseRDFSContainer(rdfAlt);
				if (result == null) result = caseRDFSResource(rdfAlt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_BAG: {
				RDFBag rdfBag = (RDFBag)theEObject;
				T result = caseRDFBag(rdfBag);
				if (result == null) result = caseRDFSContainer(rdfBag);
				if (result == null) result = caseRDFSResource(rdfBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_SEQ: {
				RDFSeq rdfSeq = (RDFSeq)theEObject;
				T result = caseRDFSeq(rdfSeq);
				if (result == null) result = caseRDFSContainer(rdfSeq);
				if (result == null) result = caseRDFSResource(rdfSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDFS_CONTAINER_MEMBERSHIP_PROPERTY: {
				RDFSContainerMembershipProperty rdfsContainerMembershipProperty = (RDFSContainerMembershipProperty)theEObject;
				T result = caseRDFSContainerMembershipProperty(rdfsContainerMembershipProperty);
				if (result == null) result = caseRDFProperty(rdfsContainerMembershipProperty);
				if (result == null) result = caseRDFSResource(rdfsContainerMembershipProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.RDF_STATEMENT: {
				RDFStatement rdfStatement = (RDFStatement)theEObject;
				T result = caseRDFStatement(rdfStatement);
				if (result == null) result = caseRDFSResource(rdfStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseRDFSResource(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.PLAIN_LITERAL: {
				PlainLiteral plainLiteral = (PlainLiteral)theEObject;
				T result = casePlainLiteral(plainLiteral);
				if (result == null) result = caseRDFSLiteral(plainLiteral);
				if (result == null) result = caseRDFSResource(plainLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.TYPED_LITERAL: {
				TypedLiteral typedLiteral = (TypedLiteral)theEObject;
				T result = caseTypedLiteral(typedLiteral);
				if (result == null) result = caseRDFSLiteral(typedLiteral);
				if (result == null) result = caseRDFSResource(typedLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdfsPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSResource(RDFSResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSClass(RDFSClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSLiteral(RDFSLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSDatatype(RDFSDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFXML Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFXML Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFXMLLiteral(RDFXMLLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFProperty(RDFProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFList(RDFList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSContainer(RDFSContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFAlt(RDFAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFBag(RDFBag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSeq(RDFSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDFS Container Membership Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDFS Container Membership Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFSContainerMembershipProperty(RDFSContainerMembershipProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDF Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDF Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDFStatement(RDFStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainLiteral(PlainLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedLiteral(TypedLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //RdfsSwitch
