/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dev Ops Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.DevOpsEngineer#getIntegrationTools <em>Integration Tools</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.DevOpsEngineer#getDeployTools <em>Deploy Tools</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getDevOpsEngineer()
 * @model
 * @generated
 */
public interface DevOpsEngineer extends Engineer {
	/**
	 * Returns the value of the '<em><b>Integration Tools</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Tools</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDevOpsEngineer_IntegrationTools()
	 * @model
	 * @generated
	 */
	EList<String> getIntegrationTools();

	/**
	 * Returns the value of the '<em><b>Deploy Tools</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Tools</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDevOpsEngineer_DeployTools()
	 * @model
	 * @generated
	 */
	EList<String> getDeployTools();

} // DevOpsEngineer
