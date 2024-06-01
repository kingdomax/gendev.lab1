/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Lab1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lab1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lab1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Package eINSTANCE = de.buw.se.gendev.lab1.impl.Lab1PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl <em>Product Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.ProductTeamImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProductTeam()
	 * @generated
	 */
	int PRODUCT_TEAM = 0;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__PRODUCT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__PRODUCT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Product Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__PRODUCT_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Own By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__OWN_BY = 3;

	/**
	 * The feature id for the '<em><b>Maintain By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__MAINTAIN_BY = 4;

	/**
	 * The feature id for the '<em><b>Design By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM__DESIGN_BY = 5;

	/**
	 * The number of structural features of the '<em>Product Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Must Have Key Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM___MUST_HAVE_KEY_MEMBERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Product Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TEAM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.ProductOwnerImpl <em>Product Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.ProductOwnerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProductOwner()
	 * @generated
	 */
	int PRODUCT_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OWNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialize Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OWNER__SPECIALIZE_SKILLS = 1;

	/**
	 * The number of structural features of the '<em>Product Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl <em>Engineer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.EngineerManagerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEngineerManager()
	 * @generated
	 */
	int ENGINEER_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Manage Members</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER__MANAGE_MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Manage SWE</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER__MANAGE_SWE = 2;

	/**
	 * The feature id for the '<em><b>Manage Dev Ops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER__MANAGE_DEV_OPS = 3;

	/**
	 * The feature id for the '<em><b>Manage QA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER__MANAGE_QA = 4;

	/**
	 * The number of structural features of the '<em>Engineer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Managable Headcounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER___MANAGABLE_HEADCOUNTS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Engineer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.UXDesignerImpl <em>UX Designer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.UXDesignerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getUXDesigner()
	 * @generated
	 */
	int UX_DESIGNER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_DESIGNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Design Tools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_DESIGNER__DESIGN_TOOLS = 1;

	/**
	 * The number of structural features of the '<em>UX Designer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_DESIGNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UX Designer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_DESIGNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.EngineerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PROGRAMMING_LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.SoftwareEngineerImpl <em>Software Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.SoftwareEngineerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getSoftwareEngineer()
	 * @generated
	 */
	int SOFTWARE_ENGINEER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER__NAME = ENGINEER__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER__TITLE = ENGINEER__TITLE;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER__PROGRAMMING_LANGUAGE = ENGINEER__PROGRAMMING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Development Frameworks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS = ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER_FEATURE_COUNT = ENGINEER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Software Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_ENGINEER_OPERATION_COUNT = ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.QAEngineerImpl <em>QA Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.QAEngineerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getQAEngineer()
	 * @generated
	 */
	int QA_ENGINEER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER__NAME = ENGINEER__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER__TITLE = ENGINEER__TITLE;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER__PROGRAMMING_LANGUAGE = ENGINEER__PROGRAMMING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Test Frameworks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER__TEST_FRAMEWORKS = ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QA Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER_FEATURE_COUNT = ENGINEER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QA Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_ENGINEER_OPERATION_COUNT = ENGINEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl <em>Dev Ops Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDevOpsEngineer()
	 * @generated
	 */
	int DEV_OPS_ENGINEER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__NAME = ENGINEER__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__TITLE = ENGINEER__TITLE;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__PROGRAMMING_LANGUAGE = ENGINEER__PROGRAMMING_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Integration Tools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__INTEGRATION_TOOLS = ENGINEER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deploy Tools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__DEPLOY_TOOLS = ENGINEER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dev Ops Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER_FEATURE_COUNT = ENGINEER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dev Ops Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER_OPERATION_COUNT = ENGINEER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.ProductTeam <em>Product Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Team</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam
	 * @generated
	 */
	EClass getProductTeam();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.ProductTeam#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getProductName()
	 * @see #getProductTeam()
	 * @generated
	 */
	EAttribute getProductTeam_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.ProductTeam#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getProductDescription()
	 * @see #getProductTeam()
	 * @generated
	 */
	EAttribute getProductTeam_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.ProductTeam#getProductStartDate <em>Product Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Start Date</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getProductStartDate()
	 * @see #getProductTeam()
	 * @generated
	 */
	EAttribute getProductTeam_ProductStartDate();

	/**
	 * Returns the meta object for the containment reference '{@link de.buw.se.gendev.lab1.ProductTeam#getOwnBy <em>Own By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Own By</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getOwnBy()
	 * @see #getProductTeam()
	 * @generated
	 */
	EReference getProductTeam_OwnBy();

	/**
	 * Returns the meta object for the containment reference '{@link de.buw.se.gendev.lab1.ProductTeam#getMaintainBy <em>Maintain By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maintain By</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getMaintainBy()
	 * @see #getProductTeam()
	 * @generated
	 */
	EReference getProductTeam_MaintainBy();

	/**
	 * Returns the meta object for the containment reference list '{@link de.buw.se.gendev.lab1.ProductTeam#getDesignBy <em>Design By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design By</em>'.
	 * @see de.buw.se.gendev.lab1.ProductTeam#getDesignBy()
	 * @see #getProductTeam()
	 * @generated
	 */
	EReference getProductTeam_DesignBy();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.ProductTeam#MustHaveKeyMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Key Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Key Members</em>' operation.
	 * @see de.buw.se.gendev.lab1.ProductTeam#MustHaveKeyMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProductTeam__MustHaveKeyMembers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.ProductOwner <em>Product Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Owner</em>'.
	 * @see de.buw.se.gendev.lab1.ProductOwner
	 * @generated
	 */
	EClass getProductOwner();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.ProductOwner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.buw.se.gendev.lab1.ProductOwner#getName()
	 * @see #getProductOwner()
	 * @generated
	 */
	EAttribute getProductOwner_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.ProductOwner#getSpecializeSkills <em>Specialize Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Specialize Skills</em>'.
	 * @see de.buw.se.gendev.lab1.ProductOwner#getSpecializeSkills()
	 * @see #getProductOwner()
	 * @generated
	 */
	EAttribute getProductOwner_SpecializeSkills();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.EngineerManager <em>Engineer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer Manager</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager
	 * @generated
	 */
	EClass getEngineerManager();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.EngineerManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager#getName()
	 * @see #getEngineerManager()
	 * @generated
	 */
	EAttribute getEngineerManager_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.EngineerManager#getManageMembers <em>Manage Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manage Members</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager#getManageMembers()
	 * @see #getEngineerManager()
	 * @generated
	 */
	EAttribute getEngineerManager_ManageMembers();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.EngineerManager#getManageSWE <em>Manage SWE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manage SWE</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager#getManageSWE()
	 * @see #getEngineerManager()
	 * @generated
	 */
	EReference getEngineerManager_ManageSWE();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.EngineerManager#getManageDevOps <em>Manage Dev Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manage Dev Ops</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager#getManageDevOps()
	 * @see #getEngineerManager()
	 * @generated
	 */
	EReference getEngineerManager_ManageDevOps();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.EngineerManager#getManageQA <em>Manage QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manage QA</em>'.
	 * @see de.buw.se.gendev.lab1.EngineerManager#getManageQA()
	 * @see #getEngineerManager()
	 * @generated
	 */
	EReference getEngineerManager_ManageQA();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.EngineerManager#managableHeadcounts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Managable Headcounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Managable Headcounts</em>' operation.
	 * @see de.buw.se.gendev.lab1.EngineerManager#managableHeadcounts(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEngineerManager__ManagableHeadcounts__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.UXDesigner <em>UX Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UX Designer</em>'.
	 * @see de.buw.se.gendev.lab1.UXDesigner
	 * @generated
	 */
	EClass getUXDesigner();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.UXDesigner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.buw.se.gendev.lab1.UXDesigner#getName()
	 * @see #getUXDesigner()
	 * @generated
	 */
	EAttribute getUXDesigner_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.UXDesigner#getDesignTools <em>Design Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Design Tools</em>'.
	 * @see de.buw.se.gendev.lab1.UXDesigner#getDesignTools()
	 * @see #getUXDesigner()
	 * @generated
	 */
	EAttribute getUXDesigner_DesignTools();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.SoftwareEngineer <em>Software Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Engineer</em>'.
	 * @see de.buw.se.gendev.lab1.SoftwareEngineer
	 * @generated
	 */
	EClass getSoftwareEngineer();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.SoftwareEngineer#getDevelopmentFrameworks <em>Development Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Development Frameworks</em>'.
	 * @see de.buw.se.gendev.lab1.SoftwareEngineer#getDevelopmentFrameworks()
	 * @see #getSoftwareEngineer()
	 * @generated
	 */
	EAttribute getSoftwareEngineer_DevelopmentFrameworks();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.QAEngineer <em>QA Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Engineer</em>'.
	 * @see de.buw.se.gendev.lab1.QAEngineer
	 * @generated
	 */
	EClass getQAEngineer();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.QAEngineer#getTestFrameworks <em>Test Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test Frameworks</em>'.
	 * @see de.buw.se.gendev.lab1.QAEngineer#getTestFrameworks()
	 * @see #getQAEngineer()
	 * @generated
	 */
	EAttribute getQAEngineer_TestFrameworks();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.DevOpsEngineer <em>Dev Ops Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev Ops Engineer</em>'.
	 * @see de.buw.se.gendev.lab1.DevOpsEngineer
	 * @generated
	 */
	EClass getDevOpsEngineer();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.DevOpsEngineer#getIntegrationTools <em>Integration Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Integration Tools</em>'.
	 * @see de.buw.se.gendev.lab1.DevOpsEngineer#getIntegrationTools()
	 * @see #getDevOpsEngineer()
	 * @generated
	 */
	EAttribute getDevOpsEngineer_IntegrationTools();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.DevOpsEngineer#getDeployTools <em>Deploy Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Deploy Tools</em>'.
	 * @see de.buw.se.gendev.lab1.DevOpsEngineer#getDeployTools()
	 * @see #getDevOpsEngineer()
	 * @generated
	 */
	EAttribute getDevOpsEngineer_DeployTools();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see de.buw.se.gendev.lab1.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Engineer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.buw.se.gendev.lab1.Engineer#getName()
	 * @see #getEngineer()
	 * @generated
	 */
	EAttribute getEngineer_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Engineer#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.buw.se.gendev.lab1.Engineer#getTitle()
	 * @see #getEngineer()
	 * @generated
	 */
	EAttribute getEngineer_Title();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.Engineer#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Programming Language</em>'.
	 * @see de.buw.se.gendev.lab1.Engineer#getProgrammingLanguage()
	 * @see #getEngineer()
	 * @generated
	 */
	EAttribute getEngineer_ProgrammingLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab1Factory getLab1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl <em>Product Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.ProductTeamImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProductTeam()
		 * @generated
		 */
		EClass PRODUCT_TEAM = eINSTANCE.getProductTeam();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TEAM__PRODUCT_NAME = eINSTANCE.getProductTeam_ProductName();

		/**
		 * The meta object literal for the '<em><b>Product Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TEAM__PRODUCT_DESCRIPTION = eINSTANCE.getProductTeam_ProductDescription();

		/**
		 * The meta object literal for the '<em><b>Product Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TEAM__PRODUCT_START_DATE = eINSTANCE.getProductTeam_ProductStartDate();

		/**
		 * The meta object literal for the '<em><b>Own By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TEAM__OWN_BY = eINSTANCE.getProductTeam_OwnBy();

		/**
		 * The meta object literal for the '<em><b>Maintain By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TEAM__MAINTAIN_BY = eINSTANCE.getProductTeam_MaintainBy();

		/**
		 * The meta object literal for the '<em><b>Design By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TEAM__DESIGN_BY = eINSTANCE.getProductTeam_DesignBy();

		/**
		 * The meta object literal for the '<em><b>Must Have Key Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_TEAM___MUST_HAVE_KEY_MEMBERS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getProductTeam__MustHaveKeyMembers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.ProductOwnerImpl <em>Product Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.ProductOwnerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProductOwner()
		 * @generated
		 */
		EClass PRODUCT_OWNER = eINSTANCE.getProductOwner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_OWNER__NAME = eINSTANCE.getProductOwner_Name();

		/**
		 * The meta object literal for the '<em><b>Specialize Skills</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_OWNER__SPECIALIZE_SKILLS = eINSTANCE.getProductOwner_SpecializeSkills();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl <em>Engineer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.EngineerManagerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEngineerManager()
		 * @generated
		 */
		EClass ENGINEER_MANAGER = eINSTANCE.getEngineerManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER_MANAGER__NAME = eINSTANCE.getEngineerManager_Name();

		/**
		 * The meta object literal for the '<em><b>Manage Members</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER_MANAGER__MANAGE_MEMBERS = eINSTANCE.getEngineerManager_ManageMembers();

		/**
		 * The meta object literal for the '<em><b>Manage SWE</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER_MANAGER__MANAGE_SWE = eINSTANCE.getEngineerManager_ManageSWE();

		/**
		 * The meta object literal for the '<em><b>Manage Dev Ops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER_MANAGER__MANAGE_DEV_OPS = eINSTANCE.getEngineerManager_ManageDevOps();

		/**
		 * The meta object literal for the '<em><b>Manage QA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER_MANAGER__MANAGE_QA = eINSTANCE.getEngineerManager_ManageQA();

		/**
		 * The meta object literal for the '<em><b>Managable Headcounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER_MANAGER___MANAGABLE_HEADCOUNTS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEngineerManager__ManagableHeadcounts__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.UXDesignerImpl <em>UX Designer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.UXDesignerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getUXDesigner()
		 * @generated
		 */
		EClass UX_DESIGNER = eINSTANCE.getUXDesigner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_DESIGNER__NAME = eINSTANCE.getUXDesigner_Name();

		/**
		 * The meta object literal for the '<em><b>Design Tools</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_DESIGNER__DESIGN_TOOLS = eINSTANCE.getUXDesigner_DesignTools();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.SoftwareEngineerImpl <em>Software Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.SoftwareEngineerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getSoftwareEngineer()
		 * @generated
		 */
		EClass SOFTWARE_ENGINEER = eINSTANCE.getSoftwareEngineer();

		/**
		 * The meta object literal for the '<em><b>Development Frameworks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS = eINSTANCE.getSoftwareEngineer_DevelopmentFrameworks();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.QAEngineerImpl <em>QA Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.QAEngineerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getQAEngineer()
		 * @generated
		 */
		EClass QA_ENGINEER = eINSTANCE.getQAEngineer();

		/**
		 * The meta object literal for the '<em><b>Test Frameworks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_ENGINEER__TEST_FRAMEWORKS = eINSTANCE.getQAEngineer_TestFrameworks();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl <em>Dev Ops Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.DevOpsEngineerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDevOpsEngineer()
		 * @generated
		 */
		EClass DEV_OPS_ENGINEER = eINSTANCE.getDevOpsEngineer();

		/**
		 * The meta object literal for the '<em><b>Integration Tools</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_OPS_ENGINEER__INTEGRATION_TOOLS = eINSTANCE.getDevOpsEngineer_IntegrationTools();

		/**
		 * The meta object literal for the '<em><b>Deploy Tools</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_OPS_ENGINEER__DEPLOY_TOOLS = eINSTANCE.getDevOpsEngineer_DeployTools();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.EngineerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER__NAME = eINSTANCE.getEngineer_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER__TITLE = eINSTANCE.getEngineer_Title();

		/**
		 * The meta object literal for the '<em><b>Programming Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEER__PROGRAMMING_LANGUAGE = eINSTANCE.getEngineer_ProgrammingLanguage();

	}

} //Lab1Package
