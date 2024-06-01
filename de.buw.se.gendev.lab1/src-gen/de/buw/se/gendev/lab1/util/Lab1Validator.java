/**
 */
package de.buw.se.gendev.lab1.util;

import de.buw.se.gendev.lab1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public class Lab1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lab1Validator INSTANCE = new Lab1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.buw.se.gendev.lab1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Key Members' of 'Product Team'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_TEAM__MUST_HAVE_KEY_MEMBERS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Managable Headcounts' of 'Engineer Manager'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENGINEER_MANAGER__MANAGABLE_HEADCOUNTS = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Lab1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Lab1Package.PRODUCT_TEAM:
			return validateProductTeam((ProductTeam) value, diagnostics, context);
		case Lab1Package.PRODUCT_OWNER:
			return validateProductOwner((ProductOwner) value, diagnostics, context);
		case Lab1Package.ENGINEER_MANAGER:
			return validateEngineerManager((EngineerManager) value, diagnostics, context);
		case Lab1Package.UX_DESIGNER:
			return validateUXDesigner((UXDesigner) value, diagnostics, context);
		case Lab1Package.SOFTWARE_ENGINEER:
			return validateSoftwareEngineer((SoftwareEngineer) value, diagnostics, context);
		case Lab1Package.QA_ENGINEER:
			return validateQAEngineer((QAEngineer) value, diagnostics, context);
		case Lab1Package.DEV_OPS_ENGINEER:
			return validateDevOpsEngineer((DevOpsEngineer) value, diagnostics, context);
		case Lab1Package.ENGINEER:
			return validateEngineer((Engineer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTeam(ProductTeam productTeam, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productTeam, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productTeam, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductTeam_MustHaveKeyMembers(productTeam, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustHaveKeyMembers constraint of '<em>Product Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTeam_MustHaveKeyMembers(ProductTeam productTeam, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return productTeam.MustHaveKeyMembers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductOwner(ProductOwner productOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineerManager(EngineerManager engineerManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(engineerManager, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(engineerManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEngineerManager_managableHeadcounts(engineerManager, diagnostics, context);
		return result;
	}

	/**
	 * Validates the managableHeadcounts constraint of '<em>Engineer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineerManager_managableHeadcounts(EngineerManager engineerManager,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return engineerManager.managableHeadcounts(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUXDesigner(UXDesigner uxDesigner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uxDesigner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareEngineer(SoftwareEngineer softwareEngineer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareEngineer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQAEngineer(QAEngineer qaEngineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qaEngineer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevOpsEngineer(DevOpsEngineer devOpsEngineer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(devOpsEngineer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineer(Engineer engineer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineer, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Lab1Validator
