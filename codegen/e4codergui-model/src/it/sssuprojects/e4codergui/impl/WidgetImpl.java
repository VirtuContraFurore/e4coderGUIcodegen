/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.Color;
import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.Path;
import it.sssuprojects.e4codergui.Point;
import it.sssuprojects.e4codergui.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getMinimum1 <em>Minimum1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getMaximum1 <em>Maximum1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getFont <em>Font</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getOnImagePath <em>On Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getOffImagePath <em>Off Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getScrollWindow <em>Scroll Window</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getYScaleType <em>YScale Type</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getYMinimum <em>YMinimum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getYMaximum <em>YMaximum</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getNeedleImagePath <em>Needle Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getImagePivotPoint <em>Image Pivot Point</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getElementPivotPoint <em>Element Pivot Point</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getFont1 <em>Font1</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getInitialText <em>Initial Text</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getActiveImagePath <em>Active Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getInactiveImagePath <em>Inactive Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#isInitialState <em>Initial State</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getPressedImagePath <em>Pressed Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getReleasedImagePath <em>Released Image Path</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.WidgetImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Point position;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Point size;

	/**
	 * The default value of the '{@link #getOutputPort() <em>Output Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected String outputPort = OUTPUT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputPort() <em>Input Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected String inputPort = INPUT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean vertical = VERTICAL_EDEFAULT;

	/**
	 * This is true if the Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalESet;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * This is true if the Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumESet;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getMinimum1() <em>Minimum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum1()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum1() <em>Minimum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum1()
	 * @generated
	 * @ordered
	 */
	protected double minimum1 = MINIMUM1_EDEFAULT;

	/**
	 * This is true if the Minimum1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimum1ESet;

	/**
	 * The default value of the '{@link #getMaximum1() <em>Maximum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum1()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum1() <em>Maximum1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum1()
	 * @generated
	 * @ordered
	 */
	protected double maximum1 = MAXIMUM1_EDEFAULT;

	/**
	 * This is true if the Maximum1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximum1ESet;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected double value1 = VALUE1_EDEFAULT;

	/**
	 * This is true if the Value1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value1ESet;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnImagePath() <em>On Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path onImagePath;

	/**
	 * The cached value of the '{@link #getOffImagePath() <em>Off Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path offImagePath;

	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected Color lineColor;

	/**
	 * The default value of the '{@link #getScrollWindow() <em>Scroll Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollWindow()
	 * @generated
	 * @ordered
	 */
	protected static final double SCROLL_WINDOW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScrollWindow() <em>Scroll Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollWindow()
	 * @generated
	 * @ordered
	 */
	protected double scrollWindow = SCROLL_WINDOW_EDEFAULT;

	/**
	 * This is true if the Scroll Window attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scrollWindowESet;

	/**
	 * The default value of the '{@link #getYScaleType() <em>YScale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScaleType()
	 * @generated
	 * @ordered
	 */
	protected static final String YSCALE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYScaleType() <em>YScale Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScaleType()
	 * @generated
	 * @ordered
	 */
	protected String yScaleType = YSCALE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMinimum() <em>YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double YMINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMinimum() <em>YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMinimum()
	 * @generated
	 * @ordered
	 */
	protected double yMinimum = YMINIMUM_EDEFAULT;

	/**
	 * This is true if the YMinimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yMinimumESet;

	/**
	 * The default value of the '{@link #getYMaximum() <em>YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double YMAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMaximum() <em>YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMaximum()
	 * @generated
	 * @ordered
	 */
	protected double yMaximum = YMAXIMUM_EDEFAULT;

	/**
	 * This is true if the YMaximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yMaximumESet;

	/**
	 * The cached value of the '{@link #getNeedleImagePath() <em>Needle Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedleImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path needleImagePath;

	/**
	 * The cached value of the '{@link #getImagePivotPoint() <em>Image Pivot Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePivotPoint()
	 * @generated
	 * @ordered
	 */
	protected Point imagePivotPoint;

	/**
	 * The cached value of the '{@link #getElementPivotPoint() <em>Element Pivot Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPivotPoint()
	 * @generated
	 * @ordered
	 */
	protected Point elementPivotPoint;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected double initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Initial Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialValueESet;

	/**
	 * The default value of the '{@link #getFont1() <em>Font1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont1()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont1() <em>Font1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont1()
	 * @generated
	 * @ordered
	 */
	protected String font1 = FONT1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected Color textColor;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * The default value of the '{@link #getInitialText() <em>Initial Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialText()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialText() <em>Initial Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialText()
	 * @generated
	 * @ordered
	 */
	protected String initialText = INITIAL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected String horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTICAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected String verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveImagePath() <em>Active Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path activeImagePath;

	/**
	 * The cached value of the '{@link #getInactiveImagePath() <em>Inactive Image Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactiveImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path inactiveImagePath;

	/**
	 * The default value of the '{@link #isInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialState()
	 * @generated
	 * @ordered
	 */
	protected boolean initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * This is true if the Initial State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialStateESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPressedImagePath() <em>Pressed Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressedImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path pressedImagePath;

	/**
	 * The cached value of the '{@link #getReleasedImagePath() <em>Released Image Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleasedImagePath()
	 * @generated
	 * @ordered
	 */
	protected Path releasedImagePath;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Point newPosition, NotificationChain msgs) {
		Point oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Point newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Point newSize, NotificationChain msgs) {
		Point oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Point newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPort(String newOutputPort) {
		String oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__OUTPUT_PORT, oldOutputPort, outputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputPort(String newInputPort) {
		String oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INPUT_PORT, oldInputPort, inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVertical() {
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVertical(boolean newVertical) {
		boolean oldVertical = vertical;
		vertical = newVertical;
		boolean oldVerticalESet = verticalESet;
		verticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__VERTICAL, oldVertical, vertical, !oldVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVertical() {
		boolean oldVertical = vertical;
		boolean oldVerticalESet = verticalESet;
		vertical = VERTICAL_EDEFAULT;
		verticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__VERTICAL, oldVertical, VERTICAL_EDEFAULT, oldVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVertical() {
		return verticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		boolean oldMinimumESet = minimumESet;
		minimumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__MINIMUM, oldMinimum, minimum, !oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinimum() {
		double oldMinimum = minimum;
		boolean oldMinimumESet = minimumESet;
		minimum = MINIMUM_EDEFAULT;
		minimumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__MINIMUM, oldMinimum, MINIMUM_EDEFAULT, oldMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinimum() {
		return minimumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		boolean oldMaximumESet = maximumESet;
		maximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__MAXIMUM, oldMaximum, maximum, !oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximum() {
		double oldMaximum = maximum;
		boolean oldMaximumESet = maximumESet;
		maximum = MAXIMUM_EDEFAULT;
		maximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__MAXIMUM, oldMaximum, MAXIMUM_EDEFAULT, oldMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximum() {
		return maximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinimum1() {
		return minimum1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum1(double newMinimum1) {
		double oldMinimum1 = minimum1;
		minimum1 = newMinimum1;
		boolean oldMinimum1ESet = minimum1ESet;
		minimum1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__MINIMUM1, oldMinimum1, minimum1, !oldMinimum1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinimum1() {
		double oldMinimum1 = minimum1;
		boolean oldMinimum1ESet = minimum1ESet;
		minimum1 = MINIMUM1_EDEFAULT;
		minimum1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__MINIMUM1, oldMinimum1, MINIMUM1_EDEFAULT, oldMinimum1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinimum1() {
		return minimum1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaximum1() {
		return maximum1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum1(double newMaximum1) {
		double oldMaximum1 = maximum1;
		maximum1 = newMaximum1;
		boolean oldMaximum1ESet = maximum1ESet;
		maximum1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__MAXIMUM1, oldMaximum1, maximum1, !oldMaximum1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximum1() {
		double oldMaximum1 = maximum1;
		boolean oldMaximum1ESet = maximum1ESet;
		maximum1 = MAXIMUM1_EDEFAULT;
		maximum1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__MAXIMUM1, oldMaximum1, MAXIMUM1_EDEFAULT, oldMaximum1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximum1() {
		return maximum1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue1(double newValue1) {
		double oldValue1 = value1;
		value1 = newValue1;
		boolean oldValue1ESet = value1ESet;
		value1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__VALUE1, oldValue1, value1, !oldValue1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValue1() {
		double oldValue1 = value1;
		boolean oldValue1ESet = value1ESet;
		value1 = VALUE1_EDEFAULT;
		value1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__VALUE1, oldValue1, VALUE1_EDEFAULT, oldValue1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValue1() {
		return value1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getOnImagePath() {
		return onImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnImagePath(Path newOnImagePath, NotificationChain msgs) {
		Path oldOnImagePath = onImagePath;
		onImagePath = newOnImagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ON_IMAGE_PATH, oldOnImagePath, newOnImagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnImagePath(Path newOnImagePath) {
		if (newOnImagePath != onImagePath) {
			NotificationChain msgs = null;
			if (onImagePath != null)
				msgs = ((InternalEObject)onImagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ON_IMAGE_PATH, null, msgs);
			if (newOnImagePath != null)
				msgs = ((InternalEObject)newOnImagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ON_IMAGE_PATH, null, msgs);
			msgs = basicSetOnImagePath(newOnImagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ON_IMAGE_PATH, newOnImagePath, newOnImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getOffImagePath() {
		return offImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffImagePath(Path newOffImagePath, NotificationChain msgs) {
		Path oldOffImagePath = offImagePath;
		offImagePath = newOffImagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__OFF_IMAGE_PATH, oldOffImagePath, newOffImagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffImagePath(Path newOffImagePath) {
		if (newOffImagePath != offImagePath) {
			NotificationChain msgs = null;
			if (offImagePath != null)
				msgs = ((InternalEObject)offImagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__OFF_IMAGE_PATH, null, msgs);
			if (newOffImagePath != null)
				msgs = ((InternalEObject)newOffImagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__OFF_IMAGE_PATH, null, msgs);
			msgs = basicSetOffImagePath(newOffImagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__OFF_IMAGE_PATH, newOffImagePath, newOffImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineColor(Color newLineColor, NotificationChain msgs) {
		Color oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__LINE_COLOR, oldLineColor, newLineColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineColor(Color newLineColor) {
		if (newLineColor != lineColor) {
			NotificationChain msgs = null;
			if (lineColor != null)
				msgs = ((InternalEObject)lineColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__LINE_COLOR, null, msgs);
			if (newLineColor != null)
				msgs = ((InternalEObject)newLineColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__LINE_COLOR, null, msgs);
			msgs = basicSetLineColor(newLineColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__LINE_COLOR, newLineColor, newLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScrollWindow() {
		return scrollWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScrollWindow(double newScrollWindow) {
		double oldScrollWindow = scrollWindow;
		scrollWindow = newScrollWindow;
		boolean oldScrollWindowESet = scrollWindowESet;
		scrollWindowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__SCROLL_WINDOW, oldScrollWindow, scrollWindow, !oldScrollWindowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScrollWindow() {
		double oldScrollWindow = scrollWindow;
		boolean oldScrollWindowESet = scrollWindowESet;
		scrollWindow = SCROLL_WINDOW_EDEFAULT;
		scrollWindowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__SCROLL_WINDOW, oldScrollWindow, SCROLL_WINDOW_EDEFAULT, oldScrollWindowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScrollWindow() {
		return scrollWindowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYScaleType() {
		return yScaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYScaleType(String newYScaleType) {
		String oldYScaleType = yScaleType;
		yScaleType = newYScaleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__YSCALE_TYPE, oldYScaleType, yScaleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYMinimum() {
		return yMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYMinimum(double newYMinimum) {
		double oldYMinimum = yMinimum;
		yMinimum = newYMinimum;
		boolean oldYMinimumESet = yMinimumESet;
		yMinimumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__YMINIMUM, oldYMinimum, yMinimum, !oldYMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYMinimum() {
		double oldYMinimum = yMinimum;
		boolean oldYMinimumESet = yMinimumESet;
		yMinimum = YMINIMUM_EDEFAULT;
		yMinimumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__YMINIMUM, oldYMinimum, YMINIMUM_EDEFAULT, oldYMinimumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYMinimum() {
		return yMinimumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYMaximum() {
		return yMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYMaximum(double newYMaximum) {
		double oldYMaximum = yMaximum;
		yMaximum = newYMaximum;
		boolean oldYMaximumESet = yMaximumESet;
		yMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__YMAXIMUM, oldYMaximum, yMaximum, !oldYMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYMaximum() {
		double oldYMaximum = yMaximum;
		boolean oldYMaximumESet = yMaximumESet;
		yMaximum = YMAXIMUM_EDEFAULT;
		yMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__YMAXIMUM, oldYMaximum, YMAXIMUM_EDEFAULT, oldYMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYMaximum() {
		return yMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getNeedleImagePath() {
		return needleImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeedleImagePath(Path newNeedleImagePath, NotificationChain msgs) {
		Path oldNeedleImagePath = needleImagePath;
		needleImagePath = newNeedleImagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH, oldNeedleImagePath, newNeedleImagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedleImagePath(Path newNeedleImagePath) {
		if (newNeedleImagePath != needleImagePath) {
			NotificationChain msgs = null;
			if (needleImagePath != null)
				msgs = ((InternalEObject)needleImagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH, null, msgs);
			if (newNeedleImagePath != null)
				msgs = ((InternalEObject)newNeedleImagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH, null, msgs);
			msgs = basicSetNeedleImagePath(newNeedleImagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH, newNeedleImagePath, newNeedleImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getImagePivotPoint() {
		return imagePivotPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePivotPoint(Point newImagePivotPoint, NotificationChain msgs) {
		Point oldImagePivotPoint = imagePivotPoint;
		imagePivotPoint = newImagePivotPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT, oldImagePivotPoint, newImagePivotPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePivotPoint(Point newImagePivotPoint) {
		if (newImagePivotPoint != imagePivotPoint) {
			NotificationChain msgs = null;
			if (imagePivotPoint != null)
				msgs = ((InternalEObject)imagePivotPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT, null, msgs);
			if (newImagePivotPoint != null)
				msgs = ((InternalEObject)newImagePivotPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT, null, msgs);
			msgs = basicSetImagePivotPoint(newImagePivotPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT, newImagePivotPoint, newImagePivotPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getElementPivotPoint() {
		return elementPivotPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementPivotPoint(Point newElementPivotPoint, NotificationChain msgs) {
		Point oldElementPivotPoint = elementPivotPoint;
		elementPivotPoint = newElementPivotPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT, oldElementPivotPoint, newElementPivotPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementPivotPoint(Point newElementPivotPoint) {
		if (newElementPivotPoint != elementPivotPoint) {
			NotificationChain msgs = null;
			if (elementPivotPoint != null)
				msgs = ((InternalEObject)elementPivotPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT, null, msgs);
			if (newElementPivotPoint != null)
				msgs = ((InternalEObject)newElementPivotPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT, null, msgs);
			msgs = basicSetElementPivotPoint(newElementPivotPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT, newElementPivotPoint, newElementPivotPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialValue(double newInitialValue) {
		double oldInitialValue = initialValue;
		initialValue = newInitialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INITIAL_VALUE, oldInitialValue, initialValue, !oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInitialValue() {
		double oldInitialValue = initialValue;
		boolean oldInitialValueESet = initialValueESet;
		initialValue = INITIAL_VALUE_EDEFAULT;
		initialValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__INITIAL_VALUE, oldInitialValue, INITIAL_VALUE_EDEFAULT, oldInitialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInitialValue() {
		return initialValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFont1() {
		return font1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFont1(String newFont1) {
		String oldFont1 = font1;
		font1 = newFont1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__FONT1, oldFont1, font1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextColor(Color newTextColor, NotificationChain msgs) {
		Color oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__TEXT_COLOR, oldTextColor, newTextColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		if (newTextColor != textColor) {
			NotificationChain msgs = null;
			if (textColor != null)
				msgs = ((InternalEObject)textColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__TEXT_COLOR, null, msgs);
			if (newTextColor != null)
				msgs = ((InternalEObject)newTextColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__TEXT_COLOR, null, msgs);
			msgs = basicSetTextColor(newTextColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__TEXT_COLOR, newTextColor, newTextColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(Color newBackgroundColor) {
		if (newBackgroundColor != backgroundColor) {
			NotificationChain msgs = null;
			if (backgroundColor != null)
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialText() {
		return initialText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialText(String newInitialText) {
		String oldInitialText = initialText;
		initialText = newInitialText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INITIAL_TEXT, oldInitialText, initialText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalAlignment(String newHorizontalAlignment) {
		String oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalAlignment(String newVerticalAlignment) {
		String oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getActiveImagePath() {
		return activeImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveImagePath(Path newActiveImagePath, NotificationChain msgs) {
		Path oldActiveImagePath = activeImagePath;
		activeImagePath = newActiveImagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH, oldActiveImagePath, newActiveImagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveImagePath(Path newActiveImagePath) {
		if (newActiveImagePath != activeImagePath) {
			NotificationChain msgs = null;
			if (activeImagePath != null)
				msgs = ((InternalEObject)activeImagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH, null, msgs);
			if (newActiveImagePath != null)
				msgs = ((InternalEObject)newActiveImagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH, null, msgs);
			msgs = basicSetActiveImagePath(newActiveImagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH, newActiveImagePath, newActiveImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getInactiveImagePath() {
		return inactiveImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactiveImagePath(Path newInactiveImagePath, NotificationChain msgs) {
		Path oldInactiveImagePath = inactiveImagePath;
		inactiveImagePath = newInactiveImagePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH, oldInactiveImagePath, newInactiveImagePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInactiveImagePath(Path newInactiveImagePath) {
		if (newInactiveImagePath != inactiveImagePath) {
			NotificationChain msgs = null;
			if (inactiveImagePath != null)
				msgs = ((InternalEObject)inactiveImagePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH, null, msgs);
			if (newInactiveImagePath != null)
				msgs = ((InternalEObject)newInactiveImagePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH, null, msgs);
			msgs = basicSetInactiveImagePath(newInactiveImagePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH, newInactiveImagePath, newInactiveImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialState(boolean newInitialState) {
		boolean oldInitialState = initialState;
		initialState = newInitialState;
		boolean oldInitialStateESet = initialStateESet;
		initialStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__INITIAL_STATE, oldInitialState, initialState, !oldInitialStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInitialState() {
		boolean oldInitialState = initialState;
		boolean oldInitialStateESet = initialStateESet;
		initialState = INITIAL_STATE_EDEFAULT;
		initialStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.WIDGET__INITIAL_STATE, oldInitialState, INITIAL_STATE_EDEFAULT, oldInitialStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInitialState() {
		return initialStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPressedImagePath() {
		if (pressedImagePath != null && pressedImagePath.eIsProxy()) {
			InternalEObject oldPressedImagePath = (InternalEObject)pressedImagePath;
			pressedImagePath = (Path)eResolveProxy(oldPressedImagePath);
			if (pressedImagePath != oldPressedImagePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH, oldPressedImagePath, pressedImagePath));
			}
		}
		return pressedImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path basicGetPressedImagePath() {
		return pressedImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPressedImagePath(Path newPressedImagePath) {
		Path oldPressedImagePath = pressedImagePath;
		pressedImagePath = newPressedImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH, oldPressedImagePath, pressedImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getReleasedImagePath() {
		if (releasedImagePath != null && releasedImagePath.eIsProxy()) {
			InternalEObject oldReleasedImagePath = (InternalEObject)releasedImagePath;
			releasedImagePath = (Path)eResolveProxy(oldReleasedImagePath);
			if (releasedImagePath != oldReleasedImagePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH, oldReleasedImagePath, releasedImagePath));
			}
		}
		return releasedImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path basicGetReleasedImagePath() {
		return releasedImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleasedImagePath(Path newReleasedImagePath) {
		Path oldReleasedImagePath = releasedImagePath;
		releasedImagePath = newReleasedImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH, oldReleasedImagePath, releasedImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.WIDGET__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E4coderguiPackage.WIDGET__POSITION:
				return basicSetPosition(null, msgs);
			case E4coderguiPackage.WIDGET__SIZE:
				return basicSetSize(null, msgs);
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
				return basicSetOnImagePath(null, msgs);
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
				return basicSetOffImagePath(null, msgs);
			case E4coderguiPackage.WIDGET__LINE_COLOR:
				return basicSetLineColor(null, msgs);
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
				return basicSetNeedleImagePath(null, msgs);
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
				return basicSetImagePivotPoint(null, msgs);
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
				return basicSetElementPivotPoint(null, msgs);
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
				return basicSetTextColor(null, msgs);
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
				return basicSetActiveImagePath(null, msgs);
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
				return basicSetInactiveImagePath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E4coderguiPackage.WIDGET__NAME:
				return getName();
			case E4coderguiPackage.WIDGET__POSITION:
				return getPosition();
			case E4coderguiPackage.WIDGET__SIZE:
				return getSize();
			case E4coderguiPackage.WIDGET__OUTPUT_PORT:
				return getOutputPort();
			case E4coderguiPackage.WIDGET__INPUT_PORT:
				return getInputPort();
			case E4coderguiPackage.WIDGET__VERTICAL:
				return isVertical();
			case E4coderguiPackage.WIDGET__MINIMUM:
				return getMinimum();
			case E4coderguiPackage.WIDGET__MAXIMUM:
				return getMaximum();
			case E4coderguiPackage.WIDGET__VALUE:
				return getValue();
			case E4coderguiPackage.WIDGET__MINIMUM1:
				return getMinimum1();
			case E4coderguiPackage.WIDGET__MAXIMUM1:
				return getMaximum1();
			case E4coderguiPackage.WIDGET__VALUE1:
				return getValue1();
			case E4coderguiPackage.WIDGET__FONT:
				return getFont();
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
				return getOnImagePath();
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
				return getOffImagePath();
			case E4coderguiPackage.WIDGET__LINE_COLOR:
				return getLineColor();
			case E4coderguiPackage.WIDGET__SCROLL_WINDOW:
				return getScrollWindow();
			case E4coderguiPackage.WIDGET__YSCALE_TYPE:
				return getYScaleType();
			case E4coderguiPackage.WIDGET__YMINIMUM:
				return getYMinimum();
			case E4coderguiPackage.WIDGET__YMAXIMUM:
				return getYMaximum();
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
				return getNeedleImagePath();
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
				return getImagePivotPoint();
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
				return getElementPivotPoint();
			case E4coderguiPackage.WIDGET__INITIAL_VALUE:
				return getInitialValue();
			case E4coderguiPackage.WIDGET__FONT1:
				return getFont1();
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
				return getTextColor();
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
				return getBackgroundColor();
			case E4coderguiPackage.WIDGET__INITIAL_TEXT:
				return getInitialText();
			case E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
				return getActiveImagePath();
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
				return getInactiveImagePath();
			case E4coderguiPackage.WIDGET__INITIAL_STATE:
				return isInitialState();
			case E4coderguiPackage.WIDGET__TYPE:
				return getType();
			case E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH:
				if (resolve) return getPressedImagePath();
				return basicGetPressedImagePath();
			case E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH:
				if (resolve) return getReleasedImagePath();
				return basicGetReleasedImagePath();
			case E4coderguiPackage.WIDGET__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E4coderguiPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__POSITION:
				setPosition((Point)newValue);
				return;
			case E4coderguiPackage.WIDGET__SIZE:
				setSize((Point)newValue);
				return;
			case E4coderguiPackage.WIDGET__OUTPUT_PORT:
				setOutputPort((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__INPUT_PORT:
				setInputPort((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__VERTICAL:
				setVertical((Boolean)newValue);
				return;
			case E4coderguiPackage.WIDGET__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__VALUE:
				setValue((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__MINIMUM1:
				setMinimum1((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__MAXIMUM1:
				setMaximum1((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__VALUE1:
				setValue1((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__FONT:
				setFont((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
				setOnImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
				setOffImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__LINE_COLOR:
				setLineColor((Color)newValue);
				return;
			case E4coderguiPackage.WIDGET__SCROLL_WINDOW:
				setScrollWindow((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__YSCALE_TYPE:
				setYScaleType((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__YMINIMUM:
				setYMinimum((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__YMAXIMUM:
				setYMaximum((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
				setNeedleImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
				setImagePivotPoint((Point)newValue);
				return;
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
				setElementPivotPoint((Point)newValue);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_VALUE:
				setInitialValue((Double)newValue);
				return;
			case E4coderguiPackage.WIDGET__FONT1:
				setFont1((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_TEXT:
				setInitialText((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT:
				setVerticalAlignment((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
				setActiveImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
				setInactiveImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_STATE:
				setInitialState((Boolean)newValue);
				return;
			case E4coderguiPackage.WIDGET__TYPE:
				setType((String)newValue);
				return;
			case E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH:
				setPressedImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH:
				setReleasedImagePath((Path)newValue);
				return;
			case E4coderguiPackage.WIDGET__TEXT:
				setText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case E4coderguiPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__POSITION:
				setPosition((Point)null);
				return;
			case E4coderguiPackage.WIDGET__SIZE:
				setSize((Point)null);
				return;
			case E4coderguiPackage.WIDGET__OUTPUT_PORT:
				setOutputPort(OUTPUT_PORT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__INPUT_PORT:
				setInputPort(INPUT_PORT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__VERTICAL:
				unsetVertical();
				return;
			case E4coderguiPackage.WIDGET__MINIMUM:
				unsetMinimum();
				return;
			case E4coderguiPackage.WIDGET__MAXIMUM:
				unsetMaximum();
				return;
			case E4coderguiPackage.WIDGET__VALUE:
				unsetValue();
				return;
			case E4coderguiPackage.WIDGET__MINIMUM1:
				unsetMinimum1();
				return;
			case E4coderguiPackage.WIDGET__MAXIMUM1:
				unsetMaximum1();
				return;
			case E4coderguiPackage.WIDGET__VALUE1:
				unsetValue1();
				return;
			case E4coderguiPackage.WIDGET__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
				setOnImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
				setOffImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__LINE_COLOR:
				setLineColor((Color)null);
				return;
			case E4coderguiPackage.WIDGET__SCROLL_WINDOW:
				unsetScrollWindow();
				return;
			case E4coderguiPackage.WIDGET__YSCALE_TYPE:
				setYScaleType(YSCALE_TYPE_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__YMINIMUM:
				unsetYMinimum();
				return;
			case E4coderguiPackage.WIDGET__YMAXIMUM:
				unsetYMaximum();
				return;
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
				setNeedleImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
				setImagePivotPoint((Point)null);
				return;
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
				setElementPivotPoint((Point)null);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_VALUE:
				unsetInitialValue();
				return;
			case E4coderguiPackage.WIDGET__FONT1:
				setFont1(FONT1_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
				setTextColor((Color)null);
				return;
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_TEXT:
				setInitialText(INITIAL_TEXT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
				setActiveImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
				setInactiveImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__INITIAL_STATE:
				unsetInitialState();
				return;
			case E4coderguiPackage.WIDGET__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH:
				setPressedImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH:
				setReleasedImagePath((Path)null);
				return;
			case E4coderguiPackage.WIDGET__TEXT:
				setText(TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case E4coderguiPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E4coderguiPackage.WIDGET__POSITION:
				return position != null;
			case E4coderguiPackage.WIDGET__SIZE:
				return size != null;
			case E4coderguiPackage.WIDGET__OUTPUT_PORT:
				return OUTPUT_PORT_EDEFAULT == null ? outputPort != null : !OUTPUT_PORT_EDEFAULT.equals(outputPort);
			case E4coderguiPackage.WIDGET__INPUT_PORT:
				return INPUT_PORT_EDEFAULT == null ? inputPort != null : !INPUT_PORT_EDEFAULT.equals(inputPort);
			case E4coderguiPackage.WIDGET__VERTICAL:
				return isSetVertical();
			case E4coderguiPackage.WIDGET__MINIMUM:
				return isSetMinimum();
			case E4coderguiPackage.WIDGET__MAXIMUM:
				return isSetMaximum();
			case E4coderguiPackage.WIDGET__VALUE:
				return isSetValue();
			case E4coderguiPackage.WIDGET__MINIMUM1:
				return isSetMinimum1();
			case E4coderguiPackage.WIDGET__MAXIMUM1:
				return isSetMaximum1();
			case E4coderguiPackage.WIDGET__VALUE1:
				return isSetValue1();
			case E4coderguiPackage.WIDGET__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
				return onImagePath != null;
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
				return offImagePath != null;
			case E4coderguiPackage.WIDGET__LINE_COLOR:
				return lineColor != null;
			case E4coderguiPackage.WIDGET__SCROLL_WINDOW:
				return isSetScrollWindow();
			case E4coderguiPackage.WIDGET__YSCALE_TYPE:
				return YSCALE_TYPE_EDEFAULT == null ? yScaleType != null : !YSCALE_TYPE_EDEFAULT.equals(yScaleType);
			case E4coderguiPackage.WIDGET__YMINIMUM:
				return isSetYMinimum();
			case E4coderguiPackage.WIDGET__YMAXIMUM:
				return isSetYMaximum();
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
				return needleImagePath != null;
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
				return imagePivotPoint != null;
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
				return elementPivotPoint != null;
			case E4coderguiPackage.WIDGET__INITIAL_VALUE:
				return isSetInitialValue();
			case E4coderguiPackage.WIDGET__FONT1:
				return FONT1_EDEFAULT == null ? font1 != null : !FONT1_EDEFAULT.equals(font1);
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
				return textColor != null;
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
				return backgroundColor != null;
			case E4coderguiPackage.WIDGET__INITIAL_TEXT:
				return INITIAL_TEXT_EDEFAULT == null ? initialText != null : !INITIAL_TEXT_EDEFAULT.equals(initialText);
			case E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT:
				return HORIZONTAL_ALIGNMENT_EDEFAULT == null ? horizontalAlignment != null : !HORIZONTAL_ALIGNMENT_EDEFAULT.equals(horizontalAlignment);
			case E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT:
				return VERTICAL_ALIGNMENT_EDEFAULT == null ? verticalAlignment != null : !VERTICAL_ALIGNMENT_EDEFAULT.equals(verticalAlignment);
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
				return activeImagePath != null;
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
				return inactiveImagePath != null;
			case E4coderguiPackage.WIDGET__INITIAL_STATE:
				return isSetInitialState();
			case E4coderguiPackage.WIDGET__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH:
				return pressedImagePath != null;
			case E4coderguiPackage.WIDGET__RELEASED_IMAGE_PATH:
				return releasedImagePath != null;
			case E4coderguiPackage.WIDGET__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", outputPort: ");
		result.append(outputPort);
		result.append(", inputPort: ");
		result.append(inputPort);
		result.append(", vertical: ");
		if (verticalESet) result.append(vertical); else result.append("<unset>");
		result.append(", minimum: ");
		if (minimumESet) result.append(minimum); else result.append("<unset>");
		result.append(", maximum: ");
		if (maximumESet) result.append(maximum); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", minimum1: ");
		if (minimum1ESet) result.append(minimum1); else result.append("<unset>");
		result.append(", maximum1: ");
		if (maximum1ESet) result.append(maximum1); else result.append("<unset>");
		result.append(", value1: ");
		if (value1ESet) result.append(value1); else result.append("<unset>");
		result.append(", font: ");
		result.append(font);
		result.append(", scrollWindow: ");
		if (scrollWindowESet) result.append(scrollWindow); else result.append("<unset>");
		result.append(", yScaleType: ");
		result.append(yScaleType);
		result.append(", yMinimum: ");
		if (yMinimumESet) result.append(yMinimum); else result.append("<unset>");
		result.append(", yMaximum: ");
		if (yMaximumESet) result.append(yMaximum); else result.append("<unset>");
		result.append(", initialValue: ");
		if (initialValueESet) result.append(initialValue); else result.append("<unset>");
		result.append(", font1: ");
		result.append(font1);
		result.append(", initialText: ");
		result.append(initialText);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", initialState: ");
		if (initialStateESet) result.append(initialState); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
