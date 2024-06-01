/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public interface Lab1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Factory eINSTANCE = de.buw.se.gendev.lab1.impl.Lab1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Team</em>'.
	 * @generated
	 */
	ProductTeam createProductTeam();

	/**
	 * Returns a new object of class '<em>Product Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Owner</em>'.
	 * @generated
	 */
	ProductOwner createProductOwner();

	/**
	 * Returns a new object of class '<em>Engineer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineer Manager</em>'.
	 * @generated
	 */
	EngineerManager createEngineerManager();

	/**
	 * Returns a new object of class '<em>UX Designer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UX Designer</em>'.
	 * @generated
	 */
	UXDesigner createUXDesigner();

	/**
	 * Returns a new object of class '<em>Software Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Engineer</em>'.
	 * @generated
	 */
	SoftwareEngineer createSoftwareEngineer();

	/**
	 * Returns a new object of class '<em>QA Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA Engineer</em>'.
	 * @generated
	 */
	QAEngineer createQAEngineer();

	/**
	 * Returns a new object of class '<em>Dev Ops Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dev Ops Engineer</em>'.
	 * @generated
	 */
	DevOpsEngineer createDevOpsEngineer();

	/**
	 * Returns a new object of class '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineer</em>'.
	 * @generated
	 */
	Engineer createEngineer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lab1Package getLab1Package();

} //Lab1Factory
