/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.QAEngineer#getTestFrameworks <em>Test Frameworks</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getQAEngineer()
 * @model
 * @generated
 */
public interface QAEngineer extends Engineer {
	/**
	 * Returns the value of the '<em><b>Test Frameworks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Frameworks</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getQAEngineer_TestFrameworks()
	 * @model
	 * @generated
	 */
	EList<String> getTestFrameworks();

} // QAEngineer
