/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.GuiType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.GuiType#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.GuiType#getFrame <em>Frame</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.GuiType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getGuiType()
 * @model extendedMetaData="name='gui_._type' kind='elementOnly'"
 * @generated
 */
public interface GuiType extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Portset)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getGuiType_Inputs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	Portset getInputs();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.GuiType#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Portset value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(Portset)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getGuiType_Outputs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	Portset getOutputs();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.GuiType#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(Portset value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(FrameType)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getGuiType_Frame()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.GuiType#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getGuiType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.GuiType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // GuiType
