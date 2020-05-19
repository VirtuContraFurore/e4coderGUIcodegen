/**
 */
package it.sssuprojects.e4codergui;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.Color#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Color#getBlue <em>Blue</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Color#getRed <em>Red</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getColor()
 * @model extendedMetaData="name='color' kind='empty'"
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getColor_Alpha()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='alpha'"
	 * @generated
	 */
	BigInteger getAlpha();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Color#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getColor_Blue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='blue'"
	 * @generated
	 */
	BigInteger getBlue();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getColor_Green()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='green'"
	 * @generated
	 */
	BigInteger getGreen();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getColor_Red()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='red'"
	 * @generated
	 */
	BigInteger getRed();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(BigInteger value);

} // Color
