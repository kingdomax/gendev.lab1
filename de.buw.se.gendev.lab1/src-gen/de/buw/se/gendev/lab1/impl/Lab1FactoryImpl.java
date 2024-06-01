/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1FactoryImpl extends EFactoryImpl implements Lab1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lab1Factory init() {
		try {
			Lab1Factory theLab1Factory = (Lab1Factory) EPackage.Registry.INSTANCE.getEFactory(Lab1Package.eNS_URI);
			if (theLab1Factory != null) {
				return theLab1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lab1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Lab1Package.PRODUCT_TEAM:
			return createProductTeam();
		case Lab1Package.PRODUCT_OWNER:
			return createProductOwner();
		case Lab1Package.ENGINEER_MANAGER:
			return createEngineerManager();
		case Lab1Package.UX_DESIGNER:
			return createUXDesigner();
		case Lab1Package.SOFTWARE_ENGINEER:
			return createSoftwareEngineer();
		case Lab1Package.QA_ENGINEER:
			return createQAEngineer();
		case Lab1Package.DEV_OPS_ENGINEER:
			return createDevOpsEngineer();
		case Lab1Package.ENGINEER:
			return createEngineer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTeam createProductTeam() {
		ProductTeamImpl productTeam = new ProductTeamImpl();
		return productTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOwner createProductOwner() {
		ProductOwnerImpl productOwner = new ProductOwnerImpl();
		return productOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineerManager createEngineerManager() {
		EngineerManagerImpl engineerManager = new EngineerManagerImpl();
		return engineerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UXDesigner createUXDesigner() {
		UXDesignerImpl uxDesigner = new UXDesignerImpl();
		return uxDesigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareEngineer createSoftwareEngineer() {
		SoftwareEngineerImpl softwareEngineer = new SoftwareEngineerImpl();
		return softwareEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAEngineer createQAEngineer() {
		QAEngineerImpl qaEngineer = new QAEngineerImpl();
		return qaEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsEngineer createDevOpsEngineer() {
		DevOpsEngineerImpl devOpsEngineer = new DevOpsEngineerImpl();
		return devOpsEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer createEngineer() {
		EngineerImpl engineer = new EngineerImpl();
		return engineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Package getLab1Package() {
		return (Lab1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lab1Package getPackage() {
		return Lab1Package.eINSTANCE;
	}

} //Lab1FactoryImpl
