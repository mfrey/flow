/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import owl.OwlFactory;

import rdfs.Ontology;
import rdfs.RdfsFactory;
import rdfs.RdfsPackage;

/**
 * This is the item provider adapter for a {@link rdfs.Ontology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyItemProvider
	extends RDFSResourceItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RdfsPackage.Literals.ONTOLOGY__CONTAINS);
			childrenFeatures.add(RdfsPackage.Literals.ONTOLOGY__OWNED_NAMESPACE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Ontology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ontology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ontology)object).getLocalName();
		return label == null || label.length() == 0 ?
			getString("_UI_Ontology_type") :
			getString("_UI_Ontology_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Ontology.class)) {
			case RdfsPackage.ONTOLOGY__CONTAINS:
			case RdfsPackage.ONTOLOGY__OWNED_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSResource()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createTypedLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFXMLLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFList()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSContainer()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFAlt()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFBag()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSeq()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFSContainerMembershipProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createRDFStatement()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createOntology()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 RdfsFactory.eINSTANCE.createPlainLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLOntology()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLOntologyProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLAllDifferent()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLDataRange()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createEnumeratedClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createIntersectionClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createUnionClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createHasValueRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createAllValuesFromRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createSomeValuesFromRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createCardinalityRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createMaxCardinalityRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createMinCardinalityRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createComplementClass()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__CONTAINS,
				 OwlFactory.eINSTANCE.createOWLDatatypeProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdfsPackage.Literals.ONTOLOGY__OWNED_NAMESPACE,
				 RdfsFactory.eINSTANCE.createNamespace()));
	}

}
