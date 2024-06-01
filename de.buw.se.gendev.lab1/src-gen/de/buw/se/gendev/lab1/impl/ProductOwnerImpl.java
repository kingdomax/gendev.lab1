/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.ProductOwner;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductOwnerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductOwnerImpl#getSpecializeSkills <em>Specialize Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOwnerImpl extends MinimalEObjectImpl.Container implements ProductOwner {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializeSkills() <em>Specialize Skills</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializeSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<String> specializeSkills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.PRODUCT_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_OWNER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSpecializeSkills() {
		if (specializeSkills == null) {
			specializeSkills = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.PRODUCT_OWNER__SPECIALIZE_SKILLS);
		}
		return specializeSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.PRODUCT_OWNER__NAME:
			return getName();
		case Lab1Package.PRODUCT_OWNER__SPECIALIZE_SKILLS:
			return getSpecializeSkills();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.PRODUCT_OWNER__NAME:
			setName((String) newValue);
			return;
		case Lab1Package.PRODUCT_OWNER__SPECIALIZE_SKILLS:
			getSpecializeSkills().clear();
			getSpecializeSkills().addAll((Collection<? extends String>) newValue);
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
		case Lab1Package.PRODUCT_OWNER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab1Package.PRODUCT_OWNER__SPECIALIZE_SKILLS:
			getSpecializeSkills().clear();
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
		case Lab1Package.PRODUCT_OWNER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab1Package.PRODUCT_OWNER__SPECIALIZE_SKILLS:
			return specializeSkills != null && !specializeSkills.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", specializeSkills: ");
		result.append(specializeSkills);
		result.append(')');
		return result.toString();
	}

} //ProductOwnerImpl
