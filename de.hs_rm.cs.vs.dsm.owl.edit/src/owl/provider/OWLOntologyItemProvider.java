/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import owl.OWLOntology;
import owl.OwlPackage;

import rdfs.RdfsFactory;
import rdfs.RdfsPackage;

import rdfs.provider.OntologyItemProvider;

/**
 * This is the item provider adapter for a {@link owl.OWLOntology} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OWLOntologyItemProvider
	extends OntologyItemProvider
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
	public OWLOntologyItemProvider(AdapterFactory adapterFactory) {
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

			addOWLBackwardCompatibleWithPropertyDescriptor(object);
			addOWLImportsPropertyDescriptor(object);
			addOWLIncompatibleWithPropertyDescriptor(object);
			addOWLPriorVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the OWL Backward Compatible With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOWLBackwardCompatibleWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OWLOntology_OWLBackwardCompatibleWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OWLOntology_OWLBackwardCompatibleWith_feature", "_UI_OWLOntology_type"),
				 OwlPackage.Literals.OWL_ONTOLOGY__OWL_BACKWARD_COMPATIBLE_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the OWL Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOWLImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OWLOntology_OWLImports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OWLOntology_OWLImports_feature", "_UI_OWLOntology_type"),
				 OwlPackage.Literals.OWL_ONTOLOGY__OWL_IMPORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the OWL Incompatible With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOWLIncompatibleWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OWLOntology_OWLIncompatibleWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OWLOntology_OWLIncompatibleWith_feature", "_UI_OWLOntology_type"),
				 OwlPackage.Literals.OWL_ONTOLOGY__OWL_INCOMPATIBLE_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the OWL Prior Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOWLPriorVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OWLOntology_OWLPriorVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OWLOntology_OWLPriorVersion_feature", "_UI_OWLOntology_type"),
				 OwlPackage.Literals.OWL_ONTOLOGY__OWL_PRIOR_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO);
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
	 * This returns OWLOntology.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OWLOntology"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OWLOntology)object).getLocalName();
		return label == null || label.length() == 0 ?
			getString("_UI_OWLOntology_type") :
			getString("_UI_OWLOntology_type") + " " + label;
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

		switch (notification.getFeatureID(OWLOntology.class)) {
			case OwlPackage.OWL_ONTOLOGY__OWL_VERSION_INFO:
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
				(OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO,
				 RdfsFactory.eINSTANCE.createRDFSLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO,
				 RdfsFactory.eINSTANCE.createTypedLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO,
				 RdfsFactory.eINSTANCE.createRDFXMLLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO,
				 RdfsFactory.eINSTANCE.createPlainLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == RdfsPackage.Literals.ONTOLOGY__CONTAINS ||
			childFeature == OwlPackage.Literals.OWL_ONTOLOGY__OWL_VERSION_INFO;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OwlEditPlugin.INSTANCE;
	}

}
