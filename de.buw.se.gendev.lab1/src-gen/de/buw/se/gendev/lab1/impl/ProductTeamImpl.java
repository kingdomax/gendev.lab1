/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.EngineerManager;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lab1Tables;
import de.buw.se.gendev.lab1.ProductOwner;
import de.buw.se.gendev.lab1.ProductTeam;
import de.buw.se.gendev.lab1.UXDesigner;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getProductStartDate <em>Product Start Date</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getOwnBy <em>Own By</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getMaintainBy <em>Maintain By</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProductTeamImpl#getDesignBy <em>Design By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductTeamImpl extends MinimalEObjectImpl.Container implements ProductTeam {
	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected String productDescription = PRODUCT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStartDate() <em>Product Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRODUCT_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStartDate() <em>Product Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date productStartDate = PRODUCT_START_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnBy() <em>Own By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnBy()
	 * @generated
	 * @ordered
	 */
	protected ProductOwner ownBy;

	/**
	 * The cached value of the '{@link #getMaintainBy() <em>Maintain By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainBy()
	 * @generated
	 * @ordered
	 */
	protected EngineerManager maintainBy;

	/**
	 * The cached value of the '{@link #getDesignBy() <em>Design By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignBy()
	 * @generated
	 * @ordered
	 */
	protected EList<UXDesigner> designBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.PRODUCT_TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_TEAM__PRODUCT_NAME,
					oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDescription(String newProductDescription) {
		String oldProductDescription = productDescription;
		productDescription = newProductDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_TEAM__PRODUCT_DESCRIPTION,
					oldProductDescription, productDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getProductStartDate() {
		return productStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductStartDate(Date newProductStartDate) {
		Date oldProductStartDate = productStartDate;
		productStartDate = newProductStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_TEAM__PRODUCT_START_DATE,
					oldProductStartDate, productStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOwner getOwnBy() {
		return ownBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnBy(ProductOwner newOwnBy, NotificationChain msgs) {
		ProductOwner oldOwnBy = ownBy;
		ownBy = newOwnBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Lab1Package.PRODUCT_TEAM__OWN_BY, oldOwnBy, newOwnBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnBy(ProductOwner newOwnBy) {
		if (newOwnBy != ownBy) {
			NotificationChain msgs = null;
			if (ownBy != null)
				msgs = ((InternalEObject) ownBy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.PRODUCT_TEAM__OWN_BY, null, msgs);
			if (newOwnBy != null)
				msgs = ((InternalEObject) newOwnBy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.PRODUCT_TEAM__OWN_BY, null, msgs);
			msgs = basicSetOwnBy(newOwnBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_TEAM__OWN_BY, newOwnBy,
					newOwnBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineerManager getMaintainBy() {
		return maintainBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaintainBy(EngineerManager newMaintainBy, NotificationChain msgs) {
		EngineerManager oldMaintainBy = maintainBy;
		maintainBy = newMaintainBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Lab1Package.PRODUCT_TEAM__MAINTAIN_BY, oldMaintainBy, newMaintainBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainBy(EngineerManager newMaintainBy) {
		if (newMaintainBy != maintainBy) {
			NotificationChain msgs = null;
			if (maintainBy != null)
				msgs = ((InternalEObject) maintainBy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.PRODUCT_TEAM__MAINTAIN_BY, null, msgs);
			if (newMaintainBy != null)
				msgs = ((InternalEObject) newMaintainBy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.PRODUCT_TEAM__MAINTAIN_BY, null, msgs);
			msgs = basicSetMaintainBy(newMaintainBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PRODUCT_TEAM__MAINTAIN_BY, newMaintainBy,
					newMaintainBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UXDesigner> getDesignBy() {
		if (designBy == null) {
			designBy = new EObjectContainmentEList<UXDesigner>(UXDesigner.class, this,
					Lab1Package.PRODUCT_TEAM__DESIGN_BY);
		}
		return designBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MustHaveKeyMembers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProductTeam::MustHaveKeyMembers";
		try {
			/**
			 *
			 * inv MustHaveKeyMembers:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ownBy->select(p |
			 *           p.oclIsTypeOf(ProductOwner))
			 *         ->size() = 1 and
			 *         maintainBy->select(e | e.oclIsTypeOf(EngineerManager))
			 *         ->size() = 1 and
			 *         designBy->select(u | u.oclIsTypeOf(UXDesigner))
			 *         ->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.PRODUCT_TEAM___MUST_HAVE_KEY_MEMBERS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ ProductOwner ownBy = this.getOwnBy();
					final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Lab1Tables.SET_CLSSid_ProductOwner, ownBy);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Lab1Tables.SET_CLSSid_ProductOwner);
					Iterator<Object> ITERATOR_p = oclAsSet.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ ProductOwner p = (ProductOwner) ITERATOR_p.next();
						/**
						 * p.oclIsTypeOf(ProductOwner)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_lab1_c_c_ProductOwner = idResolver
								.getClass(Lab1Tables.CLSSid_ProductOwner, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, p, TYP_lab1_c_c_ProductOwner).booleanValue();
						//
						if (oclIsTypeOf) {
							accumulator.add(p);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean eq = size.equals(Lab1Tables.INT_1);
					final /*@NonInvalid*/ Boolean and;
					if (!eq) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ EngineerManager maintainBy = this.getMaintainBy();
						final /*@NonInvalid*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
								Lab1Tables.SET_CLSSid_EngineerManager, maintainBy);
						/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
								.createSetAccumulatorValue(Lab1Tables.SET_CLSSid_EngineerManager);
						Iterator<Object> ITERATOR_e_0 = oclAsSet_0.iterator();
						/*@NonInvalid*/ SetValue select_0;
						while (true) {
							if (!ITERATOR_e_0.hasNext()) {
								select_0 = accumulator_0;
								break;
							}
							/*@NonInvalid*/ EngineerManager e_0 = (EngineerManager) ITERATOR_e_0.next();
							/**
							 * e.oclIsTypeOf(EngineerManager)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_lab1_c_c_EngineerManager = idResolver
									.getClass(Lab1Tables.CLSSid_EngineerManager, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, e_0, TYP_lab1_c_c_EngineerManager).booleanValue();
							//
							if (oclIsTypeOf_0) {
								accumulator_0.add(e_0);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(select_0);
						final /*@NonInvalid*/ boolean eq_0 = size_0.equals(Lab1Tables.INT_1);
						if (!eq_0) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (and == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ List<UXDesigner> designBy = this.getDesignBy();
						final /*@NonInvalid*/ OrderedSetValue BOXED_designBy = idResolver
								.createOrderedSetOfAll(Lab1Tables.ORD_CLSSid_UXDesigner, designBy);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_1 = ValueUtil
								.createOrderedSetAccumulatorValue(Lab1Tables.ORD_CLSSid_UXDesigner_0);
						Iterator<Object> ITERATOR_u = BOXED_designBy.iterator();
						/*@NonInvalid*/ OrderedSetValue select_1;
						while (true) {
							if (!ITERATOR_u.hasNext()) {
								select_1 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ UXDesigner u = (UXDesigner) ITERATOR_u.next();
							/**
							 * u.oclIsTypeOf(UXDesigner)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_lab1_c_c_UXDesigner = idResolver
									.getClass(Lab1Tables.CLSSid_UXDesigner, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf_1 = OclAnyOclIsTypeOfOperation.INSTANCE
									.evaluate(executor, u, TYP_lab1_c_c_UXDesigner).booleanValue();
							//
							if (oclIsTypeOf_1) {
								accumulator_1.add(u);
							}
						}
						final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(select_1);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, size_1, Lab1Tables.INT_1).booleanValue();
						if (!ge) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (and == null) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Lab1Tables.INT_0)
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.PRODUCT_TEAM__OWN_BY:
			return basicSetOwnBy(null, msgs);
		case Lab1Package.PRODUCT_TEAM__MAINTAIN_BY:
			return basicSetMaintainBy(null, msgs);
		case Lab1Package.PRODUCT_TEAM__DESIGN_BY:
			return ((InternalEList<?>) getDesignBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.PRODUCT_TEAM__PRODUCT_NAME:
			return getProductName();
		case Lab1Package.PRODUCT_TEAM__PRODUCT_DESCRIPTION:
			return getProductDescription();
		case Lab1Package.PRODUCT_TEAM__PRODUCT_START_DATE:
			return getProductStartDate();
		case Lab1Package.PRODUCT_TEAM__OWN_BY:
			return getOwnBy();
		case Lab1Package.PRODUCT_TEAM__MAINTAIN_BY:
			return getMaintainBy();
		case Lab1Package.PRODUCT_TEAM__DESIGN_BY:
			return getDesignBy();
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
		case Lab1Package.PRODUCT_TEAM__PRODUCT_NAME:
			setProductName((String) newValue);
			return;
		case Lab1Package.PRODUCT_TEAM__PRODUCT_DESCRIPTION:
			setProductDescription((String) newValue);
			return;
		case Lab1Package.PRODUCT_TEAM__PRODUCT_START_DATE:
			setProductStartDate((Date) newValue);
			return;
		case Lab1Package.PRODUCT_TEAM__OWN_BY:
			setOwnBy((ProductOwner) newValue);
			return;
		case Lab1Package.PRODUCT_TEAM__MAINTAIN_BY:
			setMaintainBy((EngineerManager) newValue);
			return;
		case Lab1Package.PRODUCT_TEAM__DESIGN_BY:
			getDesignBy().clear();
			getDesignBy().addAll((Collection<? extends UXDesigner>) newValue);
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
		case Lab1Package.PRODUCT_TEAM__PRODUCT_NAME:
			setProductName(PRODUCT_NAME_EDEFAULT);
			return;
		case Lab1Package.PRODUCT_TEAM__PRODUCT_DESCRIPTION:
			setProductDescription(PRODUCT_DESCRIPTION_EDEFAULT);
			return;
		case Lab1Package.PRODUCT_TEAM__PRODUCT_START_DATE:
			setProductStartDate(PRODUCT_START_DATE_EDEFAULT);
			return;
		case Lab1Package.PRODUCT_TEAM__OWN_BY:
			setOwnBy((ProductOwner) null);
			return;
		case Lab1Package.PRODUCT_TEAM__MAINTAIN_BY:
			setMaintainBy((EngineerManager) null);
			return;
		case Lab1Package.PRODUCT_TEAM__DESIGN_BY:
			getDesignBy().clear();
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
		case Lab1Package.PRODUCT_TEAM__PRODUCT_NAME:
			return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
		case Lab1Package.PRODUCT_TEAM__PRODUCT_DESCRIPTION:
			return PRODUCT_DESCRIPTION_EDEFAULT == null ? productDescription != null
					: !PRODUCT_DESCRIPTION_EDEFAULT.equals(productDescription);
		case Lab1Package.PRODUCT_TEAM__PRODUCT_START_DATE:
			return PRODUCT_START_DATE_EDEFAULT == null ? productStartDate != null
					: !PRODUCT_START_DATE_EDEFAULT.equals(productStartDate);
		case Lab1Package.PRODUCT_TEAM__OWN_BY:
			return ownBy != null;
		case Lab1Package.PRODUCT_TEAM__MAINTAIN_BY:
			return maintainBy != null;
		case Lab1Package.PRODUCT_TEAM__DESIGN_BY:
			return designBy != null && !designBy.isEmpty();
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
		case Lab1Package.PRODUCT_TEAM___MUST_HAVE_KEY_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return MustHaveKeyMembers((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (productName: ");
		result.append(productName);
		result.append(", productDescription: ");
		result.append(productDescription);
		result.append(", productStartDate: ");
		result.append(productStartDate);
		result.append(')');
		return result.toString();
	}

} //ProductTeamImpl
