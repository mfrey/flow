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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import owl.provider.OwlEditPlugin;

import rdfs.RDFSResource;
import rdfs.RdfsPackage;

/**
 * This is the item provider adapter for a {@link rdfs.RDFSResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RDFSResourceItemProvider
	extends ItemProviderAdapter
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
	public RDFSResourceItemProvider(AdapterFactory adapterFactory) {
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

			addLocalNamePropertyDescriptor(object);
			addURIPropertyDescriptor(object);
			addSubjectStatementPropertyDescriptor(object);
			addObjectStatementPropertyDescriptor(object);
			addRDFSIsDefinedByPropertyDescriptor(object);
			addRDFValuePropertyDescriptor(object);
			addRDFSSeeAlsoPropertyDescriptor(object);
			addRDFTypePropertyDescriptor(object);
			addRDFSMemberPropertyDescriptor(object);
			addPredicateStatementPropertyDescriptor(object);
			addRDFSCommentPropertyDescriptor(object);
			addRDFSLabelPropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Local Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_localName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_localName_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__LOCAL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_URI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_URI_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__URI,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subject Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_subjectStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_subjectStatement_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__SUBJECT_STATEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_objectStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_objectStatement_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__OBJECT_STATEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDFS Is Defined By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFSIsDefinedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFSIsDefinedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFSIsDefinedBy_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDFS_IS_DEFINED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDF Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFValue_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDF_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDFS See Also feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFSSeeAlsoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFSSeeAlso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFSSeeAlso_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDFS_SEE_ALSO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDF Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFType_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDF_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDFS Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFSMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFSMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFSMember_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDFS_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predicate Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredicateStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_predicateStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_predicateStatement_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__PREDICATE_STATEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDFS Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFSCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFSComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFSComment_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDFS_COMMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RDFS Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRDFSLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_RDFSLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_RDFSLabel_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__RDFS_LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RDFSResource_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RDFSResource_namespace_feature", "_UI_RDFSResource_type"),
				 RdfsPackage.Literals.RDFS_RESOURCE__NAMESPACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RDFSResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RDFSResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RDFSResource)object).getLocalName();
		return label == null || label.length() == 0 ?
			getString("_UI_RDFSResource_type") :
			getString("_UI_RDFSResource_type") + " " + label;
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

		switch (notification.getFeatureID(RDFSResource.class)) {
			case RdfsPackage.RDFS_RESOURCE__LOCAL_NAME:
			case RdfsPackage.RDFS_RESOURCE__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
