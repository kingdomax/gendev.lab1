/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UX Designer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.UXDesigner#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.UXDesigner#getDesignTools <em>Design Tools</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getUXDesigner()
 * @model
 * @generated
 */
public interface UXDesigner extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUXDesigner_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.UXDesigner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Design Tools</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Tools</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUXDesigner_DesignTools()
	 * @model
	 * @generated
	 */
	EList<String> getDesignTools();

} // UXDesigner
