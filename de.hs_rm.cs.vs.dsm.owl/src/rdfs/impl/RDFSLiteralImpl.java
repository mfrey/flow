/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rdfs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import owl.DatatypeSlot;
import owl.OwlPackage;

import rdfs.RDFSLiteral;
import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDFS Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdfs.impl.RDFSLiteralImpl#getDatatypeSlot <em>Datatype Slot</em>}</li>
 *   <li>{@link rdfs.impl.RDFSLiteralImpl#getLexicalForm <em>Lexical Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDFSLiteralImpl extends RDFSResourceImpl implements RDFSLiteral {
	/**
	 * The default value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected static final String LEXICAL_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalForm()
	 * @generated
	 * @ordered
	 */
	protected String lexicalForm = LEXICAL_FORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFSLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.RDFS_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeSlot getDatatypeSlot() {
		if (eContainerFeatureID() != RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT) return null;
		return (DatatypeSlot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatypeSlot(DatatypeSlot newDatatypeSlot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatypeSlot, RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeSlot(DatatypeSlot newDatatypeSlot) {
		if (newDatatypeSlot != eInternalContainer() || (eContainerFeatureID() != RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT && newDatatypeSlot != null)) {
			if (EcoreUtil.isAncestor(this, newDatatypeSlot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatypeSlot != null)
				msgs = ((InternalEObject)newDatatypeSlot).eInverseAdd(this, OwlPackage.DATATYPE_SLOT__CONTENT, DatatypeSlot.class, msgs);
			msgs = basicSetDatatypeSlot(newDatatypeSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT, newDatatypeSlot, newDatatypeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalForm() {
		return lexicalForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalForm(String newLexicalForm) {
		String oldLexicalForm = lexicalForm;
		lexicalForm = newLexicalForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfsPackage.RDFS_LITERAL__LEXICAL_FORM, oldLexicalForm, lexicalForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatypeSlot((DatatypeSlot)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				return basicSetDatatypeSlot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				return eInternalContainer().eInverseRemove(this, OwlPackage.DATATYPE_SLOT__CONTENT, DatatypeSlot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				return getDatatypeSlot();
			case RdfsPackage.RDFS_LITERAL__LEXICAL_FORM:
				return getLexicalForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				setDatatypeSlot((DatatypeSlot)newValue);
				return;
			case RdfsPackage.RDFS_LITERAL__LEXICAL_FORM:
				setLexicalForm((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				setDatatypeSlot((DatatypeSlot)null);
				return;
			case RdfsPackage.RDFS_LITERAL__LEXICAL_FORM:
				setLexicalForm(LEXICAL_FORM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdfsPackage.RDFS_LITERAL__DATATYPE_SLOT:
				return getDatatypeSlot() != null;
			case RdfsPackage.RDFS_LITERAL__LEXICAL_FORM:
				return LEXICAL_FORM_EDEFAULT == null ? lexicalForm != null : !LEXICAL_FORM_EDEFAULT.equals(lexicalForm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lexicalForm: ");
		result.append(lexicalForm);
		result.append(')');
		return result.toString();
	}

} //RDFSLiteralImpl
