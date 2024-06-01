/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.DevOpsEngineer;
import de.buw.se.gendev.lab1.Engineer;
import de.buw.se.gendev.lab1.EngineerManager;
import de.buw.se.gendev.lab1.Lab1Factory;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.ProductOwner;
import de.buw.se.gendev.lab1.ProductTeam;
import de.buw.se.gendev.lab1.QAEngineer;
import de.buw.se.gendev.lab1.SoftwareEngineer;
import de.buw.se.gendev.lab1.UXDesigner;

import de.buw.se.gendev.lab1.util.Lab1Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1PackageImpl extends EPackageImpl implements Lab1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxDesignerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devOpsEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.buw.se.gendev.lab1.Lab1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lab1PackageImpl() {
		super(eNS_URI, Lab1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Lab1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lab1Package init() {
		if (isInited)
			return (Lab1Package) EPackage.Registry.INSTANCE.getEPackage(Lab1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredLab1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Lab1PackageImpl theLab1Package = registeredLab1Package instanceof Lab1PackageImpl
				? (Lab1PackageImpl) registeredLab1Package
				: new Lab1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLab1Package.createPackageContents();

		// Initialize created meta-data
		theLab1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theLab1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Lab1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theLab1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lab1Package.eNS_URI, theLab1Package);
		return theLab1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductTeam() {
		return productTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTeam_ProductName() {
		return (EAttribute) productTeamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTeam_ProductDescription() {
		return (EAttribute) productTeamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductTeam_ProductStartDate() {
		return (EAttribute) productTeamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductTeam_OwnBy() {
		return (EReference) productTeamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductTeam_MaintainBy() {
		return (EReference) productTeamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductTeam_DesignBy() {
		return (EReference) productTeamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductTeam__MustHaveKeyMembers__DiagnosticChain_Map() {
		return productTeamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductOwner() {
		return productOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOwner_Name() {
		return (EAttribute) productOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOwner_SpecializeSkills() {
		return (EAttribute) productOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineerManager() {
		return engineerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineerManager_Name() {
		return (EAttribute) engineerManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineerManager_ManageMembers() {
		return (EAttribute) engineerManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineerManager_ManageSWE() {
		return (EReference) engineerManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineerManager_ManageDevOps() {
		return (EReference) engineerManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineerManager_ManageQA() {
		return (EReference) engineerManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEngineerManager__ManagableHeadcounts__DiagnosticChain_Map() {
		return engineerManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUXDesigner() {
		return uxDesignerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUXDesigner_Name() {
		return (EAttribute) uxDesignerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUXDesigner_DesignTools() {
		return (EAttribute) uxDesignerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareEngineer() {
		return softwareEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareEngineer_DevelopmentFrameworks() {
		return (EAttribute) softwareEngineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQAEngineer() {
		return qaEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAEngineer_TestFrameworks() {
		return (EAttribute) qaEngineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevOpsEngineer() {
		return devOpsEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevOpsEngineer_IntegrationTools() {
		return (EAttribute) devOpsEngineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevOpsEngineer_DeployTools() {
		return (EAttribute) devOpsEngineerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineer_Name() {
		return (EAttribute) engineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineer_Title() {
		return (EAttribute) engineerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineer_ProgrammingLanguage() {
		return (EAttribute) engineerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Factory getLab1Factory() {
		return (Lab1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		productTeamEClass = createEClass(PRODUCT_TEAM);
		createEAttribute(productTeamEClass, PRODUCT_TEAM__PRODUCT_NAME);
		createEAttribute(productTeamEClass, PRODUCT_TEAM__PRODUCT_DESCRIPTION);
		createEAttribute(productTeamEClass, PRODUCT_TEAM__PRODUCT_START_DATE);
		createEReference(productTeamEClass, PRODUCT_TEAM__OWN_BY);
		createEReference(productTeamEClass, PRODUCT_TEAM__MAINTAIN_BY);
		createEReference(productTeamEClass, PRODUCT_TEAM__DESIGN_BY);
		createEOperation(productTeamEClass, PRODUCT_TEAM___MUST_HAVE_KEY_MEMBERS__DIAGNOSTICCHAIN_MAP);

		productOwnerEClass = createEClass(PRODUCT_OWNER);
		createEAttribute(productOwnerEClass, PRODUCT_OWNER__NAME);
		createEAttribute(productOwnerEClass, PRODUCT_OWNER__SPECIALIZE_SKILLS);

		engineerManagerEClass = createEClass(ENGINEER_MANAGER);
		createEAttribute(engineerManagerEClass, ENGINEER_MANAGER__NAME);
		createEAttribute(engineerManagerEClass, ENGINEER_MANAGER__MANAGE_MEMBERS);
		createEReference(engineerManagerEClass, ENGINEER_MANAGER__MANAGE_SWE);
		createEReference(engineerManagerEClass, ENGINEER_MANAGER__MANAGE_DEV_OPS);
		createEReference(engineerManagerEClass, ENGINEER_MANAGER__MANAGE_QA);
		createEOperation(engineerManagerEClass, ENGINEER_MANAGER___MANAGABLE_HEADCOUNTS__DIAGNOSTICCHAIN_MAP);

		uxDesignerEClass = createEClass(UX_DESIGNER);
		createEAttribute(uxDesignerEClass, UX_DESIGNER__NAME);
		createEAttribute(uxDesignerEClass, UX_DESIGNER__DESIGN_TOOLS);

		softwareEngineerEClass = createEClass(SOFTWARE_ENGINEER);
		createEAttribute(softwareEngineerEClass, SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS);

		qaEngineerEClass = createEClass(QA_ENGINEER);
		createEAttribute(qaEngineerEClass, QA_ENGINEER__TEST_FRAMEWORKS);

		devOpsEngineerEClass = createEClass(DEV_OPS_ENGINEER);
		createEAttribute(devOpsEngineerEClass, DEV_OPS_ENGINEER__INTEGRATION_TOOLS);
		createEAttribute(devOpsEngineerEClass, DEV_OPS_ENGINEER__DEPLOY_TOOLS);

		engineerEClass = createEClass(ENGINEER);
		createEAttribute(engineerEClass, ENGINEER__NAME);
		createEAttribute(engineerEClass, ENGINEER__TITLE);
		createEAttribute(engineerEClass, ENGINEER__PROGRAMMING_LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		softwareEngineerEClass.getESuperTypes().add(this.getEngineer());
		qaEngineerEClass.getESuperTypes().add(this.getEngineer());
		devOpsEngineerEClass.getESuperTypes().add(this.getEngineer());

		// Initialize classes, features, and operations; add parameters
		initEClass(productTeamEClass, ProductTeam.class, "ProductTeam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductTeam_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1,
				ProductTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductTeam_ProductDescription(), ecorePackage.getEString(), "productDescription", null, 0, 1,
				ProductTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductTeam_ProductStartDate(), ecorePackage.getEDate(), "productStartDate", null, 0, 1,
				ProductTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProductTeam_OwnBy(), this.getProductOwner(), null, "ownBy", null, 1, 1, ProductTeam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductTeam_MaintainBy(), this.getEngineerManager(), null, "maintainBy", null, 1, 1,
				ProductTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductTeam_DesignBy(), this.getUXDesigner(), null, "designBy", null, 1, -1,
				ProductTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProductTeam__MustHaveKeyMembers__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "MustHaveKeyMembers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productOwnerEClass, ProductOwner.class, "ProductOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOwner_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductOwner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOwner_SpecializeSkills(), ecorePackage.getEString(), "specializeSkills", null, 0, -1,
				ProductOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(engineerManagerEClass, EngineerManager.class, "EngineerManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngineerManager_Name(), ecorePackage.getEString(), "name", null, 0, 1, EngineerManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineerManager_ManageMembers(), ecorePackage.getEInt(), "manageMembers", null, 1, 1,
				EngineerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEngineerManager_ManageSWE(), this.getSoftwareEngineer(), null, "manageSWE", null, 0, -1,
				EngineerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineerManager_ManageDevOps(), this.getDevOpsEngineer(), null, "manageDevOps", null, 0, -1,
				EngineerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineerManager_ManageQA(), this.getQAEngineer(), null, "manageQA", null, 0, -1,
				EngineerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEngineerManager__ManagableHeadcounts__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"managableHeadcounts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uxDesignerEClass, UXDesigner.class, "UXDesigner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUXDesigner_Name(), ecorePackage.getEString(), "name", null, 0, 1, UXDesigner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUXDesigner_DesignTools(), ecorePackage.getEString(), "designTools", null, 0, -1,
				UXDesigner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(softwareEngineerEClass, SoftwareEngineer.class, "SoftwareEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareEngineer_DevelopmentFrameworks(), ecorePackage.getEString(), "developmentFrameworks",
				null, 0, -1, SoftwareEngineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qaEngineerEClass, QAEngineer.class, "QAEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQAEngineer_TestFrameworks(), ecorePackage.getEString(), "testFrameworks", null, 0, -1,
				QAEngineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(devOpsEngineerEClass, DevOpsEngineer.class, "DevOpsEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevOpsEngineer_IntegrationTools(), ecorePackage.getEString(), "integrationTools", null, 0, -1,
				DevOpsEngineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevOpsEngineer_DeployTools(), ecorePackage.getEString(), "deployTools", null, 0, -1,
				DevOpsEngineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngineer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Engineer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineer_Title(), ecorePackage.getEString(), "title", null, 0, 1, Engineer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineer_ProgrammingLanguage(), ecorePackage.getEString(), "programmingLanguage", null, 0, -1,
				Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(productTeamEClass, source, new String[] { "constraints", "MustHaveKeyMembers" });
		addAnnotation(engineerManagerEClass, source, new String[] { "constraints", "managableHeadcounts" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getProductTeam__MustHaveKeyMembers__DiagnosticChain_Map(), source, new String[] { "body",
				"\townBy->select(p | p.oclIsTypeOf(ProductOwner))->size() = 1 and\n\t\t\t\t\t\t\t\t\t    maintainBy->select(e | e.oclIsTypeOf(EngineerManager))->size() = 1 and\n\t\t\t\t\t\t\t\t\t    designBy->select(u | u.oclIsTypeOf(UXDesigner))->size() >= 1" });
		addAnnotation(getEngineerManager__ManagableHeadcounts__DiagnosticChain_Map(), source,
				new String[] { "body", "manageMembers >= 1 and manageMembers <= 10" });
	}

} //Lab1PackageImpl
