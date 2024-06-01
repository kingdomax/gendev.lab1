/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.SoftwareEngineer;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Engineer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.SoftwareEngineerImpl#getDevelopmentFrameworks <em>Development Frameworks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareEngineerImpl extends EngineerImpl implements SoftwareEngineer {
	/**
	 * The cached value of the '{@link #getDevelopmentFrameworks() <em>Development Frameworks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> developmentFrameworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareEngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.SOFTWARE_ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDevelopmentFrameworks() {
		if (developmentFrameworks == null) {
			developmentFrameworks = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS);
		}
		return developmentFrameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS:
			return getDevelopmentFrameworks();
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
		case Lab1Package.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS:
			getDevelopmentFrameworks().clear();
			getDevelopmentFrameworks().addAll((Collection<? extends String>) newValue);
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
		case Lab1Package.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS:
			getDevelopmentFrameworks().clear();
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
		case Lab1Package.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS:
			return developmentFrameworks != null && !developmentFrameworks.isEmpty();
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
		result.append(" (developmentFrameworks: ");
		result.append(developmentFrameworks);
		result.append(')');
		return result.toString();
	}

} //SoftwareEngineerImpl
