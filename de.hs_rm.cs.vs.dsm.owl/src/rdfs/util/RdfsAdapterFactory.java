/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rdfs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rdfs.RdfsPackage
 * @generated
 */
public class RdfsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdfsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfsSwitch<Adapter> modelSwitch =
		new RdfsSwitch<Adapter>() {
			@Override
			public Adapter caseRDFSResource(RDFSResource object) {
				return createRDFSResourceAdapter();
			}
			@Override
			public Adapter caseRDFSClass(RDFSClass object) {
				return createRDFSClassAdapter();
			}
			@Override
			public Adapter caseRDFSLiteral(RDFSLiteral object) {
				return createRDFSLiteralAdapter();
			}
			@Override
			public Adapter caseRDFSDatatype(RDFSDatatype object) {
				return createRDFSDatatypeAdapter();
			}
			@Override
			public Adapter caseRDFXMLLiteral(RDFXMLLiteral object) {
				return createRDFXMLLiteralAdapter();
			}
			@Override
			public Adapter caseRDFProperty(RDFProperty object) {
				return createRDFPropertyAdapter();
			}
			@Override
			public Adapter caseRDFList(RDFList object) {
				return createRDFListAdapter();
			}
			@Override
			public Adapter caseRDFSContainer(RDFSContainer object) {
				return createRDFSContainerAdapter();
			}
			@Override
			public Adapter caseRDFAlt(RDFAlt object) {
				return createRDFAltAdapter();
			}
			@Override
			public Adapter caseRDFBag(RDFBag object) {
				return createRDFBagAdapter();
			}
			@Override
			public Adapter caseRDFSeq(RDFSeq object) {
				return createRDFSeqAdapter();
			}
			@Override
			public Adapter caseRDFSContainerMembershipProperty(RDFSContainerMembershipProperty object) {
				return createRDFSContainerMembershipPropertyAdapter();
			}
			@Override
			public Adapter caseRDFStatement(RDFStatement object) {
				return createRDFStatementAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter casePlainLiteral(PlainLiteral object) {
				return createPlainLiteralAdapter();
			}
			@Override
			public Adapter caseTypedLiteral(TypedLiteral object) {
				return createTypedLiteralAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSResource <em>RDFS Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSResource
	 * @generated
	 */
	public Adapter createRDFSResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSClass <em>RDFS Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSClass
	 * @generated
	 */
	public Adapter createRDFSClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSLiteral <em>RDFS Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSLiteral
	 * @generated
	 */
	public Adapter createRDFSLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSDatatype <em>RDFS Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSDatatype
	 * @generated
	 */
	public Adapter createRDFSDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFXMLLiteral <em>RDFXML Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFXMLLiteral
	 * @generated
	 */
	public Adapter createRDFXMLLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFProperty
	 * @generated
	 */
	public Adapter createRDFPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFList <em>RDF List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFList
	 * @generated
	 */
	public Adapter createRDFListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSContainer <em>RDFS Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSContainer
	 * @generated
	 */
	public Adapter createRDFSContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFAlt <em>RDF Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFAlt
	 * @generated
	 */
	public Adapter createRDFAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFBag <em>RDF Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFBag
	 * @generated
	 */
	public Adapter createRDFBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSeq <em>RDF Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSeq
	 * @generated
	 */
	public Adapter createRDFSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFSContainerMembershipProperty <em>RDFS Container Membership Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFSContainerMembershipProperty
	 * @generated
	 */
	public Adapter createRDFSContainerMembershipPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.RDFStatement <em>RDF Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.RDFStatement
	 * @generated
	 */
	public Adapter createRDFStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.PlainLiteral <em>Plain Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.PlainLiteral
	 * @generated
	 */
	public Adapter createPlainLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.TypedLiteral
	 * @generated
	 */
	public Adapter createTypedLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdfs.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdfs.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdfsAdapterFactory
