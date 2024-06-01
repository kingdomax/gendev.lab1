/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.SoftwareEngineer#getDevelopmentFrameworks <em>Development Frameworks</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getSoftwareEngineer()
 * @model
 * @generated
 */
public interface SoftwareEngineer extends Engineer {
	/**
	 * Returns the value of the '<em><b>Development Frameworks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Frameworks</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getSoftwareEngineer_DevelopmentFrameworks()
	 * @model
	 * @generated
	 */
	EList<String> getDevelopmentFrameworks();

} // SoftwareEngineer
