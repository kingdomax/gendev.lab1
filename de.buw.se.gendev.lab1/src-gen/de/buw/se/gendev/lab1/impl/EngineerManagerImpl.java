/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.DevOpsEngineer;
import de.buw.se.gendev.lab1.EngineerManager;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lab1Tables;
import de.buw.se.gendev.lab1.QAEngineer;
import de.buw.se.gendev.lab1.SoftwareEngineer;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineer Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl#getManageMembers <em>Manage Members</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl#getManageSWE <em>Manage SWE</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl#getManageDevOps <em>Manage Dev Ops</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.EngineerManagerImpl#getManageQA <em>Manage QA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineerManagerImpl extends MinimalEObjectImpl.Container implements EngineerManager {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManageMembers() <em>Manage Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int MANAGE_MEMBERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getManageMembers() <em>Manage Members</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageMembers()
	 * @generated
	 * @ordered
	 */
	protected int manageMembers = MANAGE_MEMBERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManageSWE() <em>Manage SWE</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageSWE()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareEngineer> manageSWE;

	/**
	 * The cached value of the '{@link #getManageDevOps() <em>Manage Dev Ops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageDevOps()
	 * @generated
	 * @ordered
	 */
	protected EList<DevOpsEngineer> manageDevOps;

	/**
	 * The cached value of the '{@link #getManageQA() <em>Manage QA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageQA()
	 * @generated
	 * @ordered
	 */
	protected EList<QAEngineer> manageQA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.ENGINEER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.ENGINEER_MANAGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getManageMembers() {
		return manageMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageMembers(int newManageMembers) {
		int oldManageMembers = manageMembers;
		manageMembers = newManageMembers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.ENGINEER_MANAGER__MANAGE_MEMBERS,
					oldManageMembers, manageMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareEngineer> getManageSWE() {
		if (manageSWE == null) {
			manageSWE = new EObjectResolvingEList<SoftwareEngineer>(SoftwareEngineer.class, this,
					Lab1Package.ENGINEER_MANAGER__MANAGE_SWE);
		}
		return manageSWE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevOpsEngineer> getManageDevOps() {
		if (manageDevOps == null) {
			manageDevOps = new EObjectResolvingEList<DevOpsEngineer>(DevOpsEngineer.class, this,
					Lab1Package.ENGINEER_MANAGER__MANAGE_DEV_OPS);
		}
		return manageDevOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QAEngineer> getManageQA() {
		if (manageQA == null) {
			manageQA = new EObjectResolvingEList<QAEngineer>(QAEngineer.class, this,
					Lab1Package.ENGINEER_MANAGER__MANAGE_QA);
		}
		return manageQA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean managableHeadcounts(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EngineerManager::managableHeadcounts";
		try {
			/**
			 *
			 * inv managableHeadcounts:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = manageMembers >= 1 and manageMembers <= 10
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.ENGINEER_MANAGER___MANAGABLE_HEADCOUNTS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int manageMembers_0 = this.getManageMembers();
				final /*@NonInvalid*/ IntegerValue BOXED_manageMembers_0 = ValueUtil.integerValueOf(manageMembers_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_manageMembers_0, Lab1Tables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
							.evaluate(executor, BOXED_manageMembers_0, Lab1Tables.INT_10).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Lab1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.ENGINEER_MANAGER__NAME:
			return getName();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_MEMBERS:
			return getManageMembers();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_SWE:
			return getManageSWE();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_DEV_OPS:
			return getManageDevOps();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_QA:
			return getManageQA();
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
		case Lab1Package.ENGINEER_MANAGER__NAME:
			setName((String) newValue);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_MEMBERS:
			setManageMembers((Integer) newValue);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_SWE:
			getManageSWE().clear();
			getManageSWE().addAll((Collection<? extends SoftwareEngineer>) newValue);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_DEV_OPS:
			getManageDevOps().clear();
			getManageDevOps().addAll((Collection<? extends DevOpsEngineer>) newValue);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_QA:
			getManageQA().clear();
			getManageQA().addAll((Collection<? extends QAEngineer>) newValue);
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
		case Lab1Package.ENGINEER_MANAGER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_MEMBERS:
			setManageMembers(MANAGE_MEMBERS_EDEFAULT);
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_SWE:
			getManageSWE().clear();
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_DEV_OPS:
			getManageDevOps().clear();
			return;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_QA:
			getManageQA().clear();
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
		case Lab1Package.ENGINEER_MANAGER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab1Package.ENGINEER_MANAGER__MANAGE_MEMBERS:
			return manageMembers != MANAGE_MEMBERS_EDEFAULT;
		case Lab1Package.ENGINEER_MANAGER__MANAGE_SWE:
			return manageSWE != null && !manageSWE.isEmpty();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_DEV_OPS:
			return manageDevOps != null && !manageDevOps.isEmpty();
		case Lab1Package.ENGINEER_MANAGER__MANAGE_QA:
			return manageQA != null && !manageQA.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Lab1Package.ENGINEER_MANAGER___MANAGABLE_HEADCOUNTS__DIAGNOSTICCHAIN_MAP:
			return managableHeadcounts((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", manageMembers: ");
		result.append(manageMembers);
		result.append(')');
		return result.toString();
	}

} //EngineerManagerImpl
