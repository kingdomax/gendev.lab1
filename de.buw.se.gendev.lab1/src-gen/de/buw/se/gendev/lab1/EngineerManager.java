/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineer Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.EngineerManager#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.EngineerManager#getManageMembers <em>Manage Members</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.EngineerManager#getManageSWE <em>Manage SWE</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.EngineerManager#getManageDevOps <em>Manage Dev Ops</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.EngineerManager#getManageQA <em>Manage QA</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='managableHeadcounts'"
 * @generated
 */
public interface EngineerManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.EngineerManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manage Members</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage Members</em>' attribute.
	 * @see #setManageMembers(int)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager_ManageMembers()
	 * @model required="true"
	 * @generated
	 */
	int getManageMembers();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.EngineerManager#getManageMembers <em>Manage Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manage Members</em>' attribute.
	 * @see #getManageMembers()
	 * @generated
	 */
	void setManageMembers(int value);

	/**
	 * Returns the value of the '<em><b>Manage SWE</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.SoftwareEngineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage SWE</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager_ManageSWE()
	 * @model
	 * @generated
	 */
	EList<SoftwareEngineer> getManageSWE();

	/**
	 * Returns the value of the '<em><b>Manage Dev Ops</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.DevOpsEngineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage Dev Ops</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager_ManageDevOps()
	 * @model
	 * @generated
	 */
	EList<DevOpsEngineer> getManageDevOps();

	/**
	 * Returns the value of the '<em><b>Manage QA</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.QAEngineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage QA</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEngineerManager_ManageQA()
	 * @model
	 * @generated
	 */
	EList<QAEngineer> getManageQA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='manageMembers &gt;= 1 and manageMembers &lt;= 10'"
	 * @generated
	 */
	boolean managableHeadcounts(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EngineerManager
