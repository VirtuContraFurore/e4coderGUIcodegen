/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.sssuprojects.e4codergui.E4coderguiPackage
 * @generated
 */
public interface E4coderguiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	E4coderguiFactory eINSTANCE = it.sssuprojects.e4codergui.impl.E4coderguiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Type</em>'.
	 * @generated
	 */
	FrameType createFrameType();

	/**
	 * Returns a new object of class '<em>Gui Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Type</em>'.
	 * @generated
	 */
	GuiType createGuiType();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Portset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portset</em>'.
	 * @generated
	 */
	Portset createPortset();

	/**
	 * Returns a new object of class '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type</em>'.
	 * @generated
	 */
	PortType createPortType();

	/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	E4coderguiPackage getE4coderguiPackage();

} //E4coderguiFactory
