/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.buw.se.gendev.lab1/model/lab1.ecore
 * using:
 *   /de.buw.se.gendev.lab1/model/lab1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.buw.se.gendev.lab1;

// import de.buw.se.gendev.lab1.Lab1Package;
// import de.buw.se.gendev.lab1.Lab1Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Lab1Tables provides the dispatch tables for the lab1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Lab1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Lab1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_lab1 = IdManager.getNsURIPackageId("http://www.example.org/lab1", null, Lab1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Lab1Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DevOpsEngineer = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("DevOpsEngineer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EngineerManager = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("EngineerManager", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductOwner = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("ProductOwner", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductTeam = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("ProductTeam", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_QAEngineer = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("QAEngineer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SoftwareEngineer = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("SoftwareEngineer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UXDesigner = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("UXDesigner", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Lab1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Lab1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EngineerManager = TypeId.BAG.getSpecializedId(Lab1Tables.CLSSid_EngineerManager, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DevOpsEngineer = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_DevOpsEngineer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_QAEngineer = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_QAEngineer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SoftwareEngineer = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_SoftwareEngineer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UXDesigner = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_UXDesigner, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UXDesigner_0 = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_UXDesigner, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_EngineerManager = TypeId.SET.getSpecializedId(Lab1Tables.CLSSid_EngineerManager, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ProductOwner = TypeId.SET.getSpecializedId(Lab1Tables.CLSSid_ProductOwner, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Lab1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _DevOpsEngineer = new EcoreExecutorType(Lab1Package.Literals.DEV_OPS_ENGINEER, PACKAGE, 0);
		public static final EcoreExecutorType _Engineer = new EcoreExecutorType(Lab1Package.Literals.ENGINEER, PACKAGE, 0);
		public static final EcoreExecutorType _EngineerManager = new EcoreExecutorType(Lab1Package.Literals.ENGINEER_MANAGER, PACKAGE, 0);
		public static final EcoreExecutorType _ProductOwner = new EcoreExecutorType(Lab1Package.Literals.PRODUCT_OWNER, PACKAGE, 0);
		public static final EcoreExecutorType _ProductTeam = new EcoreExecutorType(Lab1Package.Literals.PRODUCT_TEAM, PACKAGE, 0);
		public static final EcoreExecutorType _QAEngineer = new EcoreExecutorType(Lab1Package.Literals.QA_ENGINEER, PACKAGE, 0);
		public static final EcoreExecutorType _SoftwareEngineer = new EcoreExecutorType(Lab1Package.Literals.SOFTWARE_ENGINEER, PACKAGE, 0);
		public static final EcoreExecutorType _UXDesigner = new EcoreExecutorType(Lab1Package.Literals.UX_DESIGNER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_DevOpsEngineer,
			_Engineer,
			_EngineerManager,
			_ProductOwner,
			_ProductTeam,
			_QAEngineer,
			_SoftwareEngineer,
			_UXDesigner
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _DevOpsEngineer__DevOpsEngineer = new ExecutorFragment(Types._DevOpsEngineer, Lab1Tables.Types._DevOpsEngineer);
		private static final ExecutorFragment _DevOpsEngineer__Engineer = new ExecutorFragment(Types._DevOpsEngineer, Lab1Tables.Types._Engineer);
		private static final ExecutorFragment _DevOpsEngineer__OclAny = new ExecutorFragment(Types._DevOpsEngineer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DevOpsEngineer__OclElement = new ExecutorFragment(Types._DevOpsEngineer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Engineer__Engineer = new ExecutorFragment(Types._Engineer, Lab1Tables.Types._Engineer);
		private static final ExecutorFragment _Engineer__OclAny = new ExecutorFragment(Types._Engineer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Engineer__OclElement = new ExecutorFragment(Types._Engineer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EngineerManager__EngineerManager = new ExecutorFragment(Types._EngineerManager, Lab1Tables.Types._EngineerManager);
		private static final ExecutorFragment _EngineerManager__OclAny = new ExecutorFragment(Types._EngineerManager, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EngineerManager__OclElement = new ExecutorFragment(Types._EngineerManager, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ProductOwner__OclAny = new ExecutorFragment(Types._ProductOwner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductOwner__OclElement = new ExecutorFragment(Types._ProductOwner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductOwner__ProductOwner = new ExecutorFragment(Types._ProductOwner, Lab1Tables.Types._ProductOwner);

		private static final ExecutorFragment _ProductTeam__OclAny = new ExecutorFragment(Types._ProductTeam, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductTeam__OclElement = new ExecutorFragment(Types._ProductTeam, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductTeam__ProductTeam = new ExecutorFragment(Types._ProductTeam, Lab1Tables.Types._ProductTeam);

		private static final ExecutorFragment _QAEngineer__Engineer = new ExecutorFragment(Types._QAEngineer, Lab1Tables.Types._Engineer);
		private static final ExecutorFragment _QAEngineer__OclAny = new ExecutorFragment(Types._QAEngineer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QAEngineer__OclElement = new ExecutorFragment(Types._QAEngineer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QAEngineer__QAEngineer = new ExecutorFragment(Types._QAEngineer, Lab1Tables.Types._QAEngineer);

		private static final ExecutorFragment _SoftwareEngineer__Engineer = new ExecutorFragment(Types._SoftwareEngineer, Lab1Tables.Types._Engineer);
		private static final ExecutorFragment _SoftwareEngineer__OclAny = new ExecutorFragment(Types._SoftwareEngineer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SoftwareEngineer__OclElement = new ExecutorFragment(Types._SoftwareEngineer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SoftwareEngineer__SoftwareEngineer = new ExecutorFragment(Types._SoftwareEngineer, Lab1Tables.Types._SoftwareEngineer);

		private static final ExecutorFragment _UXDesigner__OclAny = new ExecutorFragment(Types._UXDesigner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UXDesigner__OclElement = new ExecutorFragment(Types._UXDesigner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UXDesigner__UXDesigner = new ExecutorFragment(Types._UXDesigner, Lab1Tables.Types._UXDesigner);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _DevOpsEngineer__deployTools = new EcoreExecutorProperty(Lab1Package.Literals.DEV_OPS_ENGINEER__DEPLOY_TOOLS, Types._DevOpsEngineer, 0);
		public static final ExecutorProperty _DevOpsEngineer__integrationTools = new EcoreExecutorProperty(Lab1Package.Literals.DEV_OPS_ENGINEER__INTEGRATION_TOOLS, Types._DevOpsEngineer, 1);
		public static final ExecutorProperty _DevOpsEngineer__EngineerManager__manageDevOps = new ExecutorPropertyWithImplementation("EngineerManager", Types._DevOpsEngineer, 2, new EcoreLibraryOppositeProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_DEV_OPS));

		public static final ExecutorProperty _Engineer__name = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER__NAME, Types._Engineer, 0);
		public static final ExecutorProperty _Engineer__programmingLanguage = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER__PROGRAMMING_LANGUAGE, Types._Engineer, 1);
		public static final ExecutorProperty _Engineer__title = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER__TITLE, Types._Engineer, 2);

		public static final ExecutorProperty _EngineerManager__manageDevOps = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_DEV_OPS, Types._EngineerManager, 0);
		public static final ExecutorProperty _EngineerManager__manageMembers = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_MEMBERS, Types._EngineerManager, 1);
		public static final ExecutorProperty _EngineerManager__manageQA = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_QA, Types._EngineerManager, 2);
		public static final ExecutorProperty _EngineerManager__manageSWE = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_SWE, Types._EngineerManager, 3);
		public static final ExecutorProperty _EngineerManager__name = new EcoreExecutorProperty(Lab1Package.Literals.ENGINEER_MANAGER__NAME, Types._EngineerManager, 4);
		public static final ExecutorProperty _EngineerManager__ProductTeam__maintainBy = new ExecutorPropertyWithImplementation("ProductTeam", Types._EngineerManager, 5, new EcoreLibraryOppositeProperty(Lab1Package.Literals.PRODUCT_TEAM__MAINTAIN_BY));

		public static final ExecutorProperty _ProductOwner__name = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_OWNER__NAME, Types._ProductOwner, 0);
		public static final ExecutorProperty _ProductOwner__specializeSkills = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_OWNER__SPECIALIZE_SKILLS, Types._ProductOwner, 1);
		public static final ExecutorProperty _ProductOwner__ProductTeam__ownBy = new ExecutorPropertyWithImplementation("ProductTeam", Types._ProductOwner, 2, new EcoreLibraryOppositeProperty(Lab1Package.Literals.PRODUCT_TEAM__OWN_BY));

		public static final ExecutorProperty _ProductTeam__designBy = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__DESIGN_BY, Types._ProductTeam, 0);
		public static final ExecutorProperty _ProductTeam__maintainBy = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__MAINTAIN_BY, Types._ProductTeam, 1);
		public static final ExecutorProperty _ProductTeam__ownBy = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__OWN_BY, Types._ProductTeam, 2);
		public static final ExecutorProperty _ProductTeam__productDescription = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__PRODUCT_DESCRIPTION, Types._ProductTeam, 3);
		public static final ExecutorProperty _ProductTeam__productName = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__PRODUCT_NAME, Types._ProductTeam, 4);
		public static final ExecutorProperty _ProductTeam__productStartDate = new EcoreExecutorProperty(Lab1Package.Literals.PRODUCT_TEAM__PRODUCT_START_DATE, Types._ProductTeam, 5);

		public static final ExecutorProperty _QAEngineer__testFrameworks = new EcoreExecutorProperty(Lab1Package.Literals.QA_ENGINEER__TEST_FRAMEWORKS, Types._QAEngineer, 0);
		public static final ExecutorProperty _QAEngineer__EngineerManager__manageQA = new ExecutorPropertyWithImplementation("EngineerManager", Types._QAEngineer, 1, new EcoreLibraryOppositeProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_QA));

		public static final ExecutorProperty _SoftwareEngineer__developmentFrameworks = new EcoreExecutorProperty(Lab1Package.Literals.SOFTWARE_ENGINEER__DEVELOPMENT_FRAMEWORKS, Types._SoftwareEngineer, 0);
		public static final ExecutorProperty _SoftwareEngineer__EngineerManager__manageSWE = new ExecutorPropertyWithImplementation("EngineerManager", Types._SoftwareEngineer, 1, new EcoreLibraryOppositeProperty(Lab1Package.Literals.ENGINEER_MANAGER__MANAGE_SWE));

		public static final ExecutorProperty _UXDesigner__designTools = new EcoreExecutorProperty(Lab1Package.Literals.UX_DESIGNER__DESIGN_TOOLS, Types._UXDesigner, 0);
		public static final ExecutorProperty _UXDesigner__name = new EcoreExecutorProperty(Lab1Package.Literals.UX_DESIGNER__NAME, Types._UXDesigner, 1);
		public static final ExecutorProperty _UXDesigner__ProductTeam__designBy = new ExecutorPropertyWithImplementation("ProductTeam", Types._UXDesigner, 2, new EcoreLibraryOppositeProperty(Lab1Package.Literals.PRODUCT_TEAM__DESIGN_BY));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _DevOpsEngineer =
			{
				Fragments._DevOpsEngineer__OclAny /* 0 */,
				Fragments._DevOpsEngineer__OclElement /* 1 */,
				Fragments._DevOpsEngineer__Engineer /* 2 */,
				Fragments._DevOpsEngineer__DevOpsEngineer /* 3 */
			};
		private static final int /*@NonNull*/ [] __DevOpsEngineer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Engineer =
			{
				Fragments._Engineer__OclAny /* 0 */,
				Fragments._Engineer__OclElement /* 1 */,
				Fragments._Engineer__Engineer /* 2 */
			};
		private static final int /*@NonNull*/ [] __Engineer = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EngineerManager =
			{
				Fragments._EngineerManager__OclAny /* 0 */,
				Fragments._EngineerManager__OclElement /* 1 */,
				Fragments._EngineerManager__EngineerManager /* 2 */
			};
		private static final int /*@NonNull*/ [] __EngineerManager = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductOwner =
			{
				Fragments._ProductOwner__OclAny /* 0 */,
				Fragments._ProductOwner__OclElement /* 1 */,
				Fragments._ProductOwner__ProductOwner /* 2 */
			};
		private static final int /*@NonNull*/ [] __ProductOwner = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductTeam =
			{
				Fragments._ProductTeam__OclAny /* 0 */,
				Fragments._ProductTeam__OclElement /* 1 */,
				Fragments._ProductTeam__ProductTeam /* 2 */
			};
		private static final int /*@NonNull*/ [] __ProductTeam = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QAEngineer =
			{
				Fragments._QAEngineer__OclAny /* 0 */,
				Fragments._QAEngineer__OclElement /* 1 */,
				Fragments._QAEngineer__Engineer /* 2 */,
				Fragments._QAEngineer__QAEngineer /* 3 */
			};
		private static final int /*@NonNull*/ [] __QAEngineer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SoftwareEngineer =
			{
				Fragments._SoftwareEngineer__OclAny /* 0 */,
				Fragments._SoftwareEngineer__OclElement /* 1 */,
				Fragments._SoftwareEngineer__Engineer /* 2 */,
				Fragments._SoftwareEngineer__SoftwareEngineer /* 3 */
			};
		private static final int /*@NonNull*/ [] __SoftwareEngineer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UXDesigner =
			{
				Fragments._UXDesigner__OclAny /* 0 */,
				Fragments._UXDesigner__OclElement /* 1 */,
				Fragments._UXDesigner__UXDesigner /* 2 */
			};
		private static final int /*@NonNull*/ [] __UXDesigner = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._DevOpsEngineer.initFragments(_DevOpsEngineer, __DevOpsEngineer);
			Types._Engineer.initFragments(_Engineer, __Engineer);
			Types._EngineerManager.initFragments(_EngineerManager, __EngineerManager);
			Types._ProductOwner.initFragments(_ProductOwner, __ProductOwner);
			Types._ProductTeam.initFragments(_ProductTeam, __ProductTeam);
			Types._QAEngineer.initFragments(_QAEngineer, __QAEngineer);
			Types._SoftwareEngineer.initFragments(_SoftwareEngineer, __SoftwareEngineer);
			Types._UXDesigner.initFragments(_UXDesigner, __UXDesigner);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__DevOpsEngineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__Engineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Engineer__Engineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Engineer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Engineer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EngineerManager__EngineerManager = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EngineerManager__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EngineerManager__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductOwner__ProductOwner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductOwner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductOwner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductTeam__ProductTeam = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductTeam__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductTeam__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _QAEngineer__QAEngineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QAEngineer__Engineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QAEngineer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QAEngineer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SoftwareEngineer__SoftwareEngineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SoftwareEngineer__Engineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SoftwareEngineer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SoftwareEngineer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UXDesigner__UXDesigner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UXDesigner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UXDesigner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DevOpsEngineer__DevOpsEngineer.initOperations(_DevOpsEngineer__DevOpsEngineer);
			Fragments._DevOpsEngineer__Engineer.initOperations(_DevOpsEngineer__Engineer);
			Fragments._DevOpsEngineer__OclAny.initOperations(_DevOpsEngineer__OclAny);
			Fragments._DevOpsEngineer__OclElement.initOperations(_DevOpsEngineer__OclElement);

			Fragments._Engineer__Engineer.initOperations(_Engineer__Engineer);
			Fragments._Engineer__OclAny.initOperations(_Engineer__OclAny);
			Fragments._Engineer__OclElement.initOperations(_Engineer__OclElement);

			Fragments._EngineerManager__EngineerManager.initOperations(_EngineerManager__EngineerManager);
			Fragments._EngineerManager__OclAny.initOperations(_EngineerManager__OclAny);
			Fragments._EngineerManager__OclElement.initOperations(_EngineerManager__OclElement);

			Fragments._ProductOwner__OclAny.initOperations(_ProductOwner__OclAny);
			Fragments._ProductOwner__OclElement.initOperations(_ProductOwner__OclElement);
			Fragments._ProductOwner__ProductOwner.initOperations(_ProductOwner__ProductOwner);

			Fragments._ProductTeam__OclAny.initOperations(_ProductTeam__OclAny);
			Fragments._ProductTeam__OclElement.initOperations(_ProductTeam__OclElement);
			Fragments._ProductTeam__ProductTeam.initOperations(_ProductTeam__ProductTeam);

			Fragments._QAEngineer__Engineer.initOperations(_QAEngineer__Engineer);
			Fragments._QAEngineer__OclAny.initOperations(_QAEngineer__OclAny);
			Fragments._QAEngineer__OclElement.initOperations(_QAEngineer__OclElement);
			Fragments._QAEngineer__QAEngineer.initOperations(_QAEngineer__QAEngineer);

			Fragments._SoftwareEngineer__Engineer.initOperations(_SoftwareEngineer__Engineer);
			Fragments._SoftwareEngineer__OclAny.initOperations(_SoftwareEngineer__OclAny);
			Fragments._SoftwareEngineer__OclElement.initOperations(_SoftwareEngineer__OclElement);
			Fragments._SoftwareEngineer__SoftwareEngineer.initOperations(_SoftwareEngineer__SoftwareEngineer);

			Fragments._UXDesigner__OclAny.initOperations(_UXDesigner__OclAny);
			Fragments._UXDesigner__OclElement.initOperations(_UXDesigner__OclElement);
			Fragments._UXDesigner__UXDesigner.initOperations(_UXDesigner__UXDesigner);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _DevOpsEngineer = {
			Lab1Tables.Properties._DevOpsEngineer__deployTools,
			Lab1Tables.Properties._DevOpsEngineer__integrationTools,
			Lab1Tables.Properties._Engineer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Engineer__programmingLanguage,
			Lab1Tables.Properties._Engineer__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Engineer = {
			Lab1Tables.Properties._Engineer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Engineer__programmingLanguage,
			Lab1Tables.Properties._Engineer__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EngineerManager = {
			Lab1Tables.Properties._EngineerManager__manageDevOps,
			Lab1Tables.Properties._EngineerManager__manageMembers,
			Lab1Tables.Properties._EngineerManager__manageQA,
			Lab1Tables.Properties._EngineerManager__manageSWE,
			Lab1Tables.Properties._EngineerManager__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductOwner = {
			Lab1Tables.Properties._ProductOwner__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._ProductOwner__specializeSkills
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductTeam = {
			Lab1Tables.Properties._ProductTeam__designBy,
			Lab1Tables.Properties._ProductTeam__maintainBy,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._ProductTeam__ownBy,
			Lab1Tables.Properties._ProductTeam__productDescription,
			Lab1Tables.Properties._ProductTeam__productName,
			Lab1Tables.Properties._ProductTeam__productStartDate
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QAEngineer = {
			Lab1Tables.Properties._Engineer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Engineer__programmingLanguage,
			Lab1Tables.Properties._QAEngineer__testFrameworks,
			Lab1Tables.Properties._Engineer__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SoftwareEngineer = {
			Lab1Tables.Properties._SoftwareEngineer__developmentFrameworks,
			Lab1Tables.Properties._Engineer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Engineer__programmingLanguage,
			Lab1Tables.Properties._Engineer__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UXDesigner = {
			Lab1Tables.Properties._UXDesigner__designTools,
			Lab1Tables.Properties._UXDesigner__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DevOpsEngineer__DevOpsEngineer.initProperties(_DevOpsEngineer);
			Fragments._Engineer__Engineer.initProperties(_Engineer);
			Fragments._EngineerManager__EngineerManager.initProperties(_EngineerManager);
			Fragments._ProductOwner__ProductOwner.initProperties(_ProductOwner);
			Fragments._ProductTeam__ProductTeam.initProperties(_ProductTeam);
			Fragments._QAEngineer__QAEngineer.initProperties(_QAEngineer);
			Fragments._SoftwareEngineer__SoftwareEngineer.initProperties(_SoftwareEngineer);
			Fragments._UXDesigner__UXDesigner.initProperties(_UXDesigner);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Lab1Tables();
	}

	private Lab1Tables() {
		super(Lab1Package.eNS_URI);
	}
}
