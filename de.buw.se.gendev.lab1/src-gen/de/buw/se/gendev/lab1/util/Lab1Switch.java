/**
 */
package de.buw.se.gendev.lab1.util;

import de.buw.se.gendev.lab1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public class Lab1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Switch() {
		if (modelPackage == null) {
			modelPackage = Lab1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Lab1Package.PRODUCT_TEAM: {
			ProductTeam productTeam = (ProductTeam) theEObject;
			T result = caseProductTeam(productTeam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.PRODUCT_OWNER: {
			ProductOwner productOwner = (ProductOwner) theEObject;
			T result = caseProductOwner(productOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.ENGINEER_MANAGER: {
			EngineerManager engineerManager = (EngineerManager) theEObject;
			T result = caseEngineerManager(engineerManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.UX_DESIGNER: {
			UXDesigner uxDesigner = (UXDesigner) theEObject;
			T result = caseUXDesigner(uxDesigner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.SOFTWARE_ENGINEER: {
			SoftwareEngineer softwareEngineer = (SoftwareEngineer) theEObject;
			T result = caseSoftwareEngineer(softwareEngineer);
			if (result == null)
				result = caseEngineer(softwareEngineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.QA_ENGINEER: {
			QAEngineer qaEngineer = (QAEngineer) theEObject;
			T result = caseQAEngineer(qaEngineer);
			if (result == null)
				result = caseEngineer(qaEngineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.DEV_OPS_ENGINEER: {
			DevOpsEngineer devOpsEngineer = (DevOpsEngineer) theEObject;
			T result = caseDevOpsEngineer(devOpsEngineer);
			if (result == null)
				result = caseEngineer(devOpsEngineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Lab1Package.ENGINEER: {
			Engineer engineer = (Engineer) theEObject;
			T result = caseEngineer(engineer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductTeam(ProductTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductOwner(ProductOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineer Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineerManager(EngineerManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UX Designer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UX Designer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUXDesigner(UXDesigner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareEngineer(SoftwareEngineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QA Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QA Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAEngineer(QAEngineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dev Ops Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dev Ops Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevOpsEngineer(DevOpsEngineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineer(Engineer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Lab1Switch
