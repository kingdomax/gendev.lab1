/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.ProductOwner#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProductOwner#getSpecializeSkills <em>Specialize Skills</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getProductOwner()
 * @model
 * @generated
 */
public interface ProductOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductOwner_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.ProductOwner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialize Skills</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialize Skills</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProductOwner_SpecializeSkills()
	 * @model
	 * @generated
	 */
	EList<String> getSpecializeSkills();

} // ProductOwner
