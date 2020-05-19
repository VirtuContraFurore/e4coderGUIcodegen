/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.Path#getValue <em>Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Path#isDefaultFolder <em>Default Folder</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPath()
 * @model extendedMetaData="name='path' kind='simple'"
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPath_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Path#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Folder</em>' attribute.
	 * @see #isSetDefaultFolder()
	 * @see #unsetDefaultFolder()
	 * @see #setDefaultFolder(boolean)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPath_DefaultFolder()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='defaultFolder'"
	 * @generated
	 */
	boolean isDefaultFolder();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Path#isDefaultFolder <em>Default Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Folder</em>' attribute.
	 * @see #isSetDefaultFolder()
	 * @see #unsetDefaultFolder()
	 * @see #isDefaultFolder()
	 * @generated
	 */
	void setDefaultFolder(boolean value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Path#isDefaultFolder <em>Default Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultFolder()
	 * @see #isDefaultFolder()
	 * @see #setDefaultFolder(boolean)
	 * @generated
	 */
	void unsetDefaultFolder();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Path#isDefaultFolder <em>Default Folder</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Folder</em>' attribute is set.
	 * @see #unsetDefaultFolder()
	 * @see #isDefaultFolder()
	 * @see #setDefaultFolder(boolean)
	 * @generated
	 */
	boolean isSetDefaultFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPath();

} // Path
