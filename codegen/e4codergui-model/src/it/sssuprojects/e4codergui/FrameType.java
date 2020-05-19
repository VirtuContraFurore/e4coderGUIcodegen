/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.FrameType#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.FrameType#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.FrameType#isFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.FrameType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getFrameType()
 * @model extendedMetaData="name='frame_._type' kind='elementOnly'"
 * @generated
 */
public interface FrameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getFrameType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.FrameType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Point)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getFrameType_Size()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getSize();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.FrameType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Point value);

	/**
	 * Returns the value of the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Screen</em>' attribute.
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #setFullScreen(boolean)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getFrameType_FullScreen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='fullScreen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFullScreen();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.FrameType#isFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Screen</em>' attribute.
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #isFullScreen()
	 * @generated
	 */
	void setFullScreen(boolean value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.FrameType#isFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullScreen()
	 * @see #isFullScreen()
	 * @see #setFullScreen(boolean)
	 * @generated
	 */
	void unsetFullScreen();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.FrameType#isFullScreen <em>Full Screen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Screen</em>' attribute is set.
	 * @see #unsetFullScreen()
	 * @see #isFullScreen()
	 * @see #setFullScreen(boolean)
	 * @generated
	 */
	boolean isSetFullScreen();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link it.sssuprojects.e4codergui.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getFrameType_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Widget> getElement();

} // FrameType
