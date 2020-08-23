/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getPosition <em>Position</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#isVertical <em>Vertical</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getValue <em>Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getMinimum1 <em>Minimum1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getMaximum1 <em>Maximum1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getValue1 <em>Value1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getFont <em>Font</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getOnImagePath <em>On Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getOffImagePath <em>Off Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getScrollWindow <em>Scroll Window</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getYScaleType <em>YScale Type</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getYMinimum <em>YMinimum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getYMaximum <em>YMaximum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getNeedleImagePath <em>Needle Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getImagePivotPoint <em>Image Pivot Point</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getElementPivotPoint <em>Element Pivot Point</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getFont1 <em>Font1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInitialText <em>Initial Text</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getActiveImagePath <em>Active Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInactiveImagePath <em>Inactive Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#isInitialState <em>Initial State</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getType <em>Type</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getPressedImagePath <em>Pressed Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getReleasedImagePath <em>Released Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getText <em>Text</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getActivePressedImagePath <em>Active Pressed Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInactivePressedImagePath <em>Inactive Pressed Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getActiveReleasedImagePath <em>Active Released Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.Widget#getInactiveReleasedImagePath <em>Inactive Released Image Path</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget()
 * @model extendedMetaData="name='widget' kind='elementOnly'"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Point)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Size()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getSize();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Point value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' attribute.
	 * @see #setOutputPort(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_OutputPort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='element' name='outputPort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputPort();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getOutputPort <em>Output Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' attribute.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(String value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' attribute.
	 * @see #setInputPort(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InputPort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='element' name='inputPort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInputPort();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInputPort <em>Input Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' attribute.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(String value);

	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #isSetVertical()
	 * @see #unsetVertical()
	 * @see #setVertical(boolean)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Vertical()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isSetVertical()
	 * @see #unsetVertical()
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVertical()
	 * @see #isVertical()
	 * @see #setVertical(boolean)
	 * @generated
	 */
	void unsetVertical();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#isVertical <em>Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical</em>' attribute is set.
	 * @see #unsetVertical()
	 * @see #isVertical()
	 * @see #setVertical(boolean)
	 * @generated
	 */
	boolean isSetVertical();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #setMinimum(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Minimum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #isSetMinimum()
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	void unsetMinimum();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum <em>Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum</em>' attribute is set.
	 * @see #unsetMinimum()
	 * @see #getMinimum()
	 * @see #setMinimum(double)
	 * @generated
	 */
	boolean isSetMinimum();

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #setMaximum(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Maximum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #isSetMaximum()
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	void unsetMaximum();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum <em>Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum</em>' attribute is set.
	 * @see #unsetMaximum()
	 * @see #getMaximum()
	 * @see #setMaximum(double)
	 * @generated
	 */
	boolean isSetMaximum();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Minimum1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum1</em>' attribute.
	 * @see #isSetMinimum1()
	 * @see #unsetMinimum1()
	 * @see #setMinimum1(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Minimum1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinimum1();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum1 <em>Minimum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum1</em>' attribute.
	 * @see #isSetMinimum1()
	 * @see #unsetMinimum1()
	 * @see #getMinimum1()
	 * @generated
	 */
	void setMinimum1(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum1 <em>Minimum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimum1()
	 * @see #getMinimum1()
	 * @see #setMinimum1(double)
	 * @generated
	 */
	void unsetMinimum1();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getMinimum1 <em>Minimum1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum1</em>' attribute is set.
	 * @see #unsetMinimum1()
	 * @see #getMinimum1()
	 * @see #setMinimum1(double)
	 * @generated
	 */
	boolean isSetMinimum1();

	/**
	 * Returns the value of the '<em><b>Maximum1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum1</em>' attribute.
	 * @see #isSetMaximum1()
	 * @see #unsetMaximum1()
	 * @see #setMaximum1(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Maximum1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximum1();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum1 <em>Maximum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum1</em>' attribute.
	 * @see #isSetMaximum1()
	 * @see #unsetMaximum1()
	 * @see #getMaximum1()
	 * @generated
	 */
	void setMaximum1(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum1 <em>Maximum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximum1()
	 * @see #getMaximum1()
	 * @see #setMaximum1(double)
	 * @generated
	 */
	void unsetMaximum1();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getMaximum1 <em>Maximum1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum1</em>' attribute is set.
	 * @see #unsetMaximum1()
	 * @see #getMaximum1()
	 * @see #setMaximum1(double)
	 * @generated
	 */
	boolean isSetMaximum1();

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #isSetValue1()
	 * @see #unsetValue1()
	 * @see #setValue1(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Value1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	double getValue1();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #isSetValue1()
	 * @see #unsetValue1()
	 * @see #getValue1()
	 * @generated
	 */
	void setValue1(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue1()
	 * @see #getValue1()
	 * @see #setValue1(double)
	 * @generated
	 */
	void unsetValue1();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getValue1 <em>Value1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value1</em>' attribute is set.
	 * @see #unsetValue1()
	 * @see #getValue1()
	 * @see #setValue1(double)
	 * @generated
	 */
	boolean isSetValue1();

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Font()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>On Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Image Path</em>' containment reference.
	 * @see #setOnImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_OnImagePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getOnImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getOnImagePath <em>On Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Image Path</em>' containment reference.
	 * @see #getOnImagePath()
	 * @generated
	 */
	void setOnImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Off Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off Image Path</em>' containment reference.
	 * @see #setOffImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_OffImagePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getOffImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getOffImagePath <em>Off Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off Image Path</em>' containment reference.
	 * @see #getOffImagePath()
	 * @generated
	 */
	void setOffImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' containment reference.
	 * @see #setLineColor(Color)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_LineColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lineColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getLineColor();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getLineColor <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' containment reference.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(Color value);

	/**
	 * Returns the value of the '<em><b>Scroll Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll Window</em>' attribute.
	 * @see #isSetScrollWindow()
	 * @see #unsetScrollWindow()
	 * @see #setScrollWindow(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ScrollWindow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='scrollWindow' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScrollWindow();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getScrollWindow <em>Scroll Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll Window</em>' attribute.
	 * @see #isSetScrollWindow()
	 * @see #unsetScrollWindow()
	 * @see #getScrollWindow()
	 * @generated
	 */
	void setScrollWindow(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getScrollWindow <em>Scroll Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollWindow()
	 * @see #getScrollWindow()
	 * @see #setScrollWindow(double)
	 * @generated
	 */
	void unsetScrollWindow();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getScrollWindow <em>Scroll Window</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scroll Window</em>' attribute is set.
	 * @see #unsetScrollWindow()
	 * @see #getScrollWindow()
	 * @see #setScrollWindow(double)
	 * @generated
	 */
	boolean isSetScrollWindow();

	/**
	 * Returns the value of the '<em><b>YScale Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YScale Type</em>' attribute.
	 * @see #setYScaleType(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_YScaleType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='yScaleType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getYScaleType();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getYScaleType <em>YScale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YScale Type</em>' attribute.
	 * @see #getYScaleType()
	 * @generated
	 */
	void setYScaleType(String value);

	/**
	 * Returns the value of the '<em><b>YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMinimum</em>' attribute.
	 * @see #isSetYMinimum()
	 * @see #unsetYMinimum()
	 * @see #setYMinimum(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_YMinimum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='yMinimum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getYMinimum();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMinimum <em>YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMinimum</em>' attribute.
	 * @see #isSetYMinimum()
	 * @see #unsetYMinimum()
	 * @see #getYMinimum()
	 * @generated
	 */
	void setYMinimum(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMinimum <em>YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYMinimum()
	 * @see #getYMinimum()
	 * @see #setYMinimum(double)
	 * @generated
	 */
	void unsetYMinimum();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMinimum <em>YMinimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YMinimum</em>' attribute is set.
	 * @see #unsetYMinimum()
	 * @see #getYMinimum()
	 * @see #setYMinimum(double)
	 * @generated
	 */
	boolean isSetYMinimum();

	/**
	 * Returns the value of the '<em><b>YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMaximum</em>' attribute.
	 * @see #isSetYMaximum()
	 * @see #unsetYMaximum()
	 * @see #setYMaximum(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_YMaximum()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='yMaximum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getYMaximum();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMaximum <em>YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMaximum</em>' attribute.
	 * @see #isSetYMaximum()
	 * @see #unsetYMaximum()
	 * @see #getYMaximum()
	 * @generated
	 */
	void setYMaximum(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMaximum <em>YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYMaximum()
	 * @see #getYMaximum()
	 * @see #setYMaximum(double)
	 * @generated
	 */
	void unsetYMaximum();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getYMaximum <em>YMaximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YMaximum</em>' attribute is set.
	 * @see #unsetYMaximum()
	 * @see #getYMaximum()
	 * @see #setYMaximum(double)
	 * @generated
	 */
	boolean isSetYMaximum();

	/**
	 * Returns the value of the '<em><b>Needle Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needle Image Path</em>' containment reference.
	 * @see #setNeedleImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_NeedleImagePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='needleImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getNeedleImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getNeedleImagePath <em>Needle Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needle Image Path</em>' containment reference.
	 * @see #getNeedleImagePath()
	 * @generated
	 */
	void setNeedleImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Image Pivot Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pivot Point</em>' containment reference.
	 * @see #setImagePivotPoint(Point)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ImagePivotPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagePivotPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getImagePivotPoint();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getImagePivotPoint <em>Image Pivot Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pivot Point</em>' containment reference.
	 * @see #getImagePivotPoint()
	 * @generated
	 */
	void setImagePivotPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Element Pivot Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Pivot Point</em>' containment reference.
	 * @see #setElementPivotPoint(Point)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ElementPivotPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elementPivotPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Point getElementPivotPoint();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getElementPivotPoint <em>Element Pivot Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Pivot Point</em>' containment reference.
	 * @see #getElementPivotPoint()
	 * @generated
	 */
	void setElementPivotPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #setInitialValue(double)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InitialValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='initialValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(double)
	 * @generated
	 */
	void unsetInitialValue();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#getInitialValue <em>Initial Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Value</em>' attribute is set.
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(double)
	 * @generated
	 */
	boolean isSetInitialValue();

	/**
	 * Returns the value of the '<em><b>Font1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font1</em>' attribute.
	 * @see #setFont1(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Font1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFont1();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getFont1 <em>Font1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font1</em>' attribute.
	 * @see #getFont1()
	 * @generated
	 */
	void setFont1(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' containment reference.
	 * @see #setTextColor(Color)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_TextColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getTextColor();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getTextColor <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' containment reference.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Color value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' containment reference.
	 * @see #setBackgroundColor(Color)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_BackgroundColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='backgroundColor' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getBackgroundColor <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' containment reference.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Initial Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Text</em>' attribute.
	 * @see #setInitialText(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InitialText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='initialText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInitialText();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInitialText <em>Initial Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Text</em>' attribute.
	 * @see #getInitialText()
	 * @generated
	 */
	void setInitialText(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #setHorizontalAlignment(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_HorizontalAlignment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='element' name='horizontalAlignment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(String value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #setVerticalAlignment(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_VerticalAlignment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='element' name='verticalAlignment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVerticalAlignment();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(String value);

	/**
	 * Returns the value of the '<em><b>Active Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Image Path</em>' reference.
	 * @see #setActiveImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ActiveImagePath()
	 * @model extendedMetaData="kind='element' name='activeImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getActiveImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getActiveImagePath <em>Active Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Image Path</em>' reference.
	 * @see #getActiveImagePath()
	 * @generated
	 */
	void setActiveImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Inactive Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive Image Path</em>' reference.
	 * @see #setInactiveImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InactiveImagePath()
	 * @model extendedMetaData="kind='element' name='inactiveImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getInactiveImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInactiveImagePath <em>Inactive Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive Image Path</em>' reference.
	 * @see #getInactiveImagePath()
	 * @generated
	 */
	void setInactiveImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #isSetInitialState()
	 * @see #unsetInitialState()
	 * @see #setInitialState(boolean)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InitialState()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='initialState' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isInitialState();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#isInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #isSetInitialState()
	 * @see #unsetInitialState()
	 * @see #isInitialState()
	 * @generated
	 */
	void setInitialState(boolean value);

	/**
	 * Unsets the value of the '{@link it.sssuprojects.e4codergui.Widget#isInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialState()
	 * @see #isInitialState()
	 * @see #setInitialState(boolean)
	 * @generated
	 */
	void unsetInitialState();

	/**
	 * Returns whether the value of the '{@link it.sssuprojects.e4codergui.Widget#isInitialState <em>Initial State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial State</em>' attribute is set.
	 * @see #unsetInitialState()
	 * @see #isInitialState()
	 * @see #setInitialState(boolean)
	 * @generated
	 */
	boolean isSetInitialState();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressed Image Path</em>' reference.
	 * @see #setPressedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_PressedImagePath()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getPressedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getPressedImagePath <em>Pressed Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressed Image Path</em>' reference.
	 * @see #getPressedImagePath()
	 * @generated
	 */
	void setPressedImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Released Image Path</em>' reference.
	 * @see #setReleasedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ReleasedImagePath()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getReleasedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getReleasedImagePath <em>Released Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Released Image Path</em>' reference.
	 * @see #getReleasedImagePath()
	 * @generated
	 */
	void setReleasedImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Active Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Pressed Image Path</em>' reference.
	 * @see #setActivePressedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ActivePressedImagePath()
	 * @model extendedMetaData="kind='element' name='activePressedImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getActivePressedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getActivePressedImagePath <em>Active Pressed Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Pressed Image Path</em>' reference.
	 * @see #getActivePressedImagePath()
	 * @generated
	 */
	void setActivePressedImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Inactive Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive Pressed Image Path</em>' reference.
	 * @see #setInactivePressedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InactivePressedImagePath()
	 * @model extendedMetaData="kind='element' name='inactivePressedImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getInactivePressedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInactivePressedImagePath <em>Inactive Pressed Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive Pressed Image Path</em>' reference.
	 * @see #getInactivePressedImagePath()
	 * @generated
	 */
	void setInactivePressedImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Active Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Released Image Path</em>' reference.
	 * @see #setActiveReleasedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_ActiveReleasedImagePath()
	 * @model extendedMetaData="kind='element' name='activeReleasedImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getActiveReleasedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getActiveReleasedImagePath <em>Active Released Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Released Image Path</em>' reference.
	 * @see #getActiveReleasedImagePath()
	 * @generated
	 */
	void setActiveReleasedImagePath(Path value);

	/**
	 * Returns the value of the '<em><b>Inactive Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive Released Image Path</em>' reference.
	 * @see #setInactiveReleasedImagePath(Path)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getWidget_InactiveReleasedImagePath()
	 * @model extendedMetaData="kind='element' name='inactiveReleasedImagePath' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getInactiveReleasedImagePath();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.Widget#getInactiveReleasedImagePath <em>Inactive Released Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive Released Image Path</em>' reference.
	 * @see #getInactiveReleasedImagePath()
	 * @generated
	 */
	void setInactiveReleasedImagePath(Path value);

} // Widget
