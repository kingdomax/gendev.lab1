/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.QAEngineer;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QA Engineer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.QAEngineerImpl#getTestFrameworks <em>Test Frameworks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAEngineerImpl extends EngineerImpl implements QAEngineer {
	/**
	 * The cached value of the '{@link #getTestFrameworks() <em>Test Frameworks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> testFrameworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAEngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.QA_ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTestFrameworks() {
		if (testFrameworks == null) {
			testFrameworks = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.QA_ENGINEER__TEST_FRAMEWORKS);
		}
		return testFrameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.QA_ENGINEER__TEST_FRAMEWORKS:
			return getTestFrameworks();
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
		case Lab1Package.QA_ENGINEER__TEST_FRAMEWORKS:
			getTestFrameworks().clear();
			getTestFrameworks().addAll((Collection<? extends String>) newValue);
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
		case Lab1Package.QA_ENGINEER__TEST_FRAMEWORKS:
			getTestFrameworks().clear();
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
		case Lab1Package.QA_ENGINEER__TEST_FRAMEWORKS:
			return testFrameworks != null && !testFrameworks.isEmpty();
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
		result.append(" (testFrameworks: ");
		result.append(testFrameworks);
		result.append(')');
		return result.toString();
	}

} //QAEngineerImpl
