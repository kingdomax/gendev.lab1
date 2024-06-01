/**
 */
package de.buw.se.gendev.lab1;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getProductName <em>Product Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getProductStartDate <em>Product Start Date</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getOwnBy <em>Own By</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getMaintainBy <em>Maintain By</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductTeam#getDesignBy <em>Design By</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustHaveKeyMembers'"
 * @generated
 */
public interface ProductTeam extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductTeam#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Description</em>' attribute.
	 * @see #setProductDescription(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_ProductDescription()
	 * @model
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductTeam#getProductDescription <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Description</em>' attribute.
	 * @see #getProductDescription()
	 * @generated
	 */
	void setProductDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Start Date</em>' attribute.
	 * @see #setProductStartDate(Date)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_ProductStartDate()
	 * @model
	 * @generated
	 */
	Date getProductStartDate();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductTeam#getProductStartDate <em>Product Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Start Date</em>' attribute.
	 * @see #getProductStartDate()
	 * @generated
	 */
	void setProductStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Own By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own By</em>' containment reference.
	 * @see #setOwnBy(ProductOwner)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_OwnBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProductOwner getOwnBy();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductTeam#getOwnBy <em>Own By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own By</em>' containment reference.
	 * @see #getOwnBy()
	 * @generated
	 */
	void setOwnBy(ProductOwner value);

	/**
	 * Returns the value of the '<em><b>Maintain By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintain By</em>' containment reference.
	 * @see #setMaintainBy(EngineerManager)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_MaintainBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EngineerManager getMaintainBy();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductTeam#getMaintainBy <em>Maintain By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintain By</em>' containment reference.
	 * @see #getMaintainBy()
	 * @generated
	 */
	void setMaintainBy(EngineerManager value);

	/**
	 * Returns the value of the '<em><b>Design By</b></em>' containment reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.UXDesigner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design By</em>' containment reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductTeam_DesignBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UXDesigner> getDesignBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\townBy-&gt;select(p | p.oclIsTypeOf(ProductOwner))-&gt;size() = 1 and\n\t\t\t\t\t\t\t\t\t    maintainBy-&gt;select(e | e.oclIsTypeOf(EngineerManager))-&gt;size() = 1 and\n\t\t\t\t\t\t\t\t\t    designBy-&gt;select(u | u.oclIsTypeOf(UXDesigner))-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean MustHaveKeyMembers(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProductTeam
