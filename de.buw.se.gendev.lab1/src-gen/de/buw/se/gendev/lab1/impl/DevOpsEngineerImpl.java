/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.DevOpsEngineer;
import de.buw.se.gendev.lab1.Lab1Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dev Ops Engineer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl#getIntegrationTools <em>Integration Tools</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl#getDeployTools <em>Deploy Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevOpsEngineerImpl extends EngineerImpl implements DevOpsEngineer {
	/**
	 * The cached value of the '{@link #getIntegrationTools() <em>Integration Tools</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationTools()
	 * @generated
	 * @ordered
	 */
	protected EList<String> integrationTools;

	/**
	 * The cached value of the '{@link #getDeployTools() <em>Deploy Tools</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployTools()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deployTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevOpsEngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.DEV_OPS_ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIntegrationTools() {
		if (integrationTools == null) {
			integrationTools = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.DEV_OPS_ENGINEER__INTEGRATION_TOOLS);
		}
		return integrationTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeployTools() {
		if (deployTools == null) {
			deployTools = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.DEV_OPS_ENGINEER__DEPLOY_TOOLS);
		}
		return deployTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.DEV_OPS_ENGINEER__INTEGRATION_TOOLS:
			return getIntegrationTools();
		case Lab1Package.DEV_OPS_ENGINEER__DEPLOY_TOOLS:
			return getDeployTools();
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
		case Lab1Package.DEV_OPS_ENGINEER__INTEGRATION_TOOLS:
			getIntegrationTools().clear();
			getIntegrationTools().addAll((Collection<? extends String>) newValue);
			return;
		case Lab1Package.DEV_OPS_ENGINEER__DEPLOY_TOOLS:
			getDeployTools().clear();
			getDeployTools().addAll((Collection<? extends String>) newValue);
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
		case Lab1Package.DEV_OPS_ENGINEER__INTEGRATION_TOOLS:
			getIntegrationTools().clear();
			return;
		case Lab1Package.DEV_OPS_ENGINEER__DEPLOY_TOOLS:
			getDeployTools().clear();
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
		case Lab1Package.DEV_OPS_ENGINEER__INTEGRATION_TOOLS:
			return integrationTools != null && !integrationTools.isEmpty();
		case Lab1Package.DEV_OPS_ENGINEER__DEPLOY_TOOLS:
			return deployTools != null && !deployTools.isEmpty();
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
		result.append(" (integrationTools: ");
		result.append(integrationTools);
		result.append(", deployTools: ");
		result.append(deployTools);
		result.append(')');
		return result.toString();
	}

} //DevOpsEngineerImpl
