/**
 */
package it.sssuprojects.e4codergui;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.Point#getX <em>X</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPoint()
 * @model extendedMetaData="name='point' kind='empty'"
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPoint_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	BigInteger getX();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPoint_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	BigInteger getY();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(BigInteger value);

} // Point
