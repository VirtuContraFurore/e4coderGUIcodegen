/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.sssuprojects.e4codergui.E4coderguiFactory
 * @model kind="package"
 * @generated
 */
public interface E4coderguiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "e4codergui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sssuprojects.it/e4codergui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "e4codergui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	E4coderguiPackage eINSTANCE = it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.ColorImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__ALPHA = 0;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 2;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.DocumentRootImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Gui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GUI = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl <em>Frame Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.FrameTypeImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getFrameType()
	 * @generated
	 */
	int FRAME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Full Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__FULL_SCREEN = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Frame Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl <em>Gui Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.GuiTypeImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getGuiType()
	 * @generated
	 */
	int GUI_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE__FRAME = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Gui Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Gui Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.PathImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Default Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DEFAULT_FOLDER = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_PATH = 0;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.PointImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.PortsetImpl <em>Portset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.PortsetImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPortset()
	 * @generated
	 */
	int PORTSET = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTSET__PORT = 0;

	/**
	 * The number of structural features of the '<em>Portset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Portset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.PortTypeImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scicos Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SCICOS_DESC = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.sssuprojects.e4codergui.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.sssuprojects.e4codergui.impl.WidgetImpl
	 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__OUTPUT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VERTICAL = 5;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MINIMUM = 6;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MAXIMUM = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VALUE = 8;

	/**
	 * The feature id for the '<em><b>Minimum1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MINIMUM1 = 9;

	/**
	 * The feature id for the '<em><b>Maximum1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MAXIMUM1 = 10;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VALUE1 = 11;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FONT = 12;

	/**
	 * The feature id for the '<em><b>On Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ON_IMAGE_PATH = 13;

	/**
	 * The feature id for the '<em><b>Off Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__OFF_IMAGE_PATH = 14;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LINE_COLOR = 15;

	/**
	 * The feature id for the '<em><b>Scroll Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__SCROLL_WINDOW = 16;

	/**
	 * The feature id for the '<em><b>YScale Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YSCALE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YMINIMUM = 18;

	/**
	 * The feature id for the '<em><b>YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YMAXIMUM = 19;

	/**
	 * The feature id for the '<em><b>Needle Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NEEDLE_IMAGE_PATH = 20;

	/**
	 * The feature id for the '<em><b>Image Pivot Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IMAGE_PIVOT_POINT = 21;

	/**
	 * The feature id for the '<em><b>Element Pivot Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ELEMENT_PIVOT_POINT = 22;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INITIAL_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Font1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FONT1 = 24;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TEXT_COLOR = 25;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BACKGROUND_COLOR = 26;

	/**
	 * The feature id for the '<em><b>Initial Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INITIAL_TEXT = 27;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HORIZONTAL_ALIGNMENT = 28;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VERTICAL_ALIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Active Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ACTIVE_IMAGE_PATH = 30;

	/**
	 * The feature id for the '<em><b>Inactive Image Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INACTIVE_IMAGE_PATH = 31;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INITIAL_STATE = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TYPE = 33;

	/**
	 * The feature id for the '<em><b>Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PRESSED_IMAGE_PATH = 34;

	/**
	 * The feature id for the '<em><b>Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__RELEASED_IMAGE_PATH = 35;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TEXT = 36;

	/**
	 * The feature id for the '<em><b>Active Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ACTIVE_PRESSED_IMAGE_PATH = 37;

	/**
	 * The feature id for the '<em><b>Inactive Pressed Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INACTIVE_PRESSED_IMAGE_PATH = 38;

	/**
	 * The feature id for the '<em><b>Active Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ACTIVE_RELEASED_IMAGE_PATH = 39;

	/**
	 * The feature id for the '<em><b>Inactive Released Image Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INACTIVE_RELEASED_IMAGE_PATH = 40;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 41;

	/**
	 * The number of operations of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see it.sssuprojects.e4codergui.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Color#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see it.sssuprojects.e4codergui.Color#getAlpha()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see it.sssuprojects.e4codergui.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see it.sssuprojects.e4codergui.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see it.sssuprojects.e4codergui.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see it.sssuprojects.e4codergui.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link it.sssuprojects.e4codergui.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see it.sssuprojects.e4codergui.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link it.sssuprojects.e4codergui.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see it.sssuprojects.e4codergui.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link it.sssuprojects.e4codergui.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see it.sssuprojects.e4codergui.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.DocumentRoot#getGui <em>Gui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gui</em>'.
	 * @see it.sssuprojects.e4codergui.DocumentRoot#getGui()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Gui();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Type</em>'.
	 * @see it.sssuprojects.e4codergui.FrameType
	 * @generated
	 */
	EClass getFrameType();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.FrameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.sssuprojects.e4codergui.FrameType#getName()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.FrameType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see it.sssuprojects.e4codergui.FrameType#getSize()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.FrameType#isFullScreen <em>Full Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Screen</em>'.
	 * @see it.sssuprojects.e4codergui.FrameType#isFullScreen()
	 * @see #getFrameType()
	 * @generated
	 */
	EAttribute getFrameType_FullScreen();

	/**
	 * Returns the meta object for the containment reference list '{@link it.sssuprojects.e4codergui.FrameType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see it.sssuprojects.e4codergui.FrameType#getElement()
	 * @see #getFrameType()
	 * @generated
	 */
	EReference getFrameType_Element();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.GuiType <em>Gui Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Type</em>'.
	 * @see it.sssuprojects.e4codergui.GuiType
	 * @generated
	 */
	EClass getGuiType();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.GuiType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see it.sssuprojects.e4codergui.GuiType#getInputs()
	 * @see #getGuiType()
	 * @generated
	 */
	EReference getGuiType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.GuiType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see it.sssuprojects.e4codergui.GuiType#getOutputs()
	 * @see #getGuiType()
	 * @generated
	 */
	EReference getGuiType_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.GuiType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see it.sssuprojects.e4codergui.GuiType#getFrame()
	 * @see #getGuiType()
	 * @generated
	 */
	EReference getGuiType_Frame();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.GuiType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.sssuprojects.e4codergui.GuiType#getVersion()
	 * @see #getGuiType()
	 * @generated
	 */
	EAttribute getGuiType_Version();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see it.sssuprojects.e4codergui.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Path#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.sssuprojects.e4codergui.Path#getValue()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Path#isDefaultFolder <em>Default Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Folder</em>'.
	 * @see it.sssuprojects.e4codergui.Path#isDefaultFolder()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_DefaultFolder();

	/**
	 * Returns the meta object for the '{@link it.sssuprojects.e4codergui.Path#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see it.sssuprojects.e4codergui.Path#getPath()
	 * @generated
	 */
	EOperation getPath__GetPath();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see it.sssuprojects.e4codergui.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see it.sssuprojects.e4codergui.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see it.sssuprojects.e4codergui.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.Portset <em>Portset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Portset</em>'.
	 * @see it.sssuprojects.e4codergui.Portset
	 * @generated
	 */
	EClass getPortset();

	/**
	 * Returns the meta object for the containment reference list '{@link it.sssuprojects.e4codergui.Portset#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see it.sssuprojects.e4codergui.Portset#getPort()
	 * @see #getPortset()
	 * @generated
	 */
	EReference getPortset_Port();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see it.sssuprojects.e4codergui.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.sssuprojects.e4codergui.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.PortType#getScicosDesc <em>Scicos Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scicos Desc</em>'.
	 * @see it.sssuprojects.e4codergui.PortType#getScicosDesc()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_ScicosDesc();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.PortType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.sssuprojects.e4codergui.PortType#getSize()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.PortType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.sssuprojects.e4codergui.PortType#getType()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Type();

	/**
	 * Returns the meta object for class '{@link it.sssuprojects.e4codergui.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see it.sssuprojects.e4codergui.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getPosition()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Position();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getSize()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Port</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getOutputPort()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_OutputPort();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Port</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInputPort()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_InputPort();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#isVertical()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getMinimum()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getMaximum()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getValue()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getMinimum1 <em>Minimum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum1</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getMinimum1()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Minimum1();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getMaximum1 <em>Maximum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum1</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getMaximum1()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Maximum1();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getValue1()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Value1();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getFont()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Font();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getOnImagePath <em>On Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getOnImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_OnImagePath();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getOffImagePath <em>Off Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Off Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getOffImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_OffImagePath();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Color</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getLineColor()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getScrollWindow <em>Scroll Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scroll Window</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getScrollWindow()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_ScrollWindow();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getYScaleType <em>YScale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YScale Type</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getYScaleType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_YScaleType();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getYMinimum <em>YMinimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMinimum</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getYMinimum()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_YMinimum();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getYMaximum <em>YMaximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMaximum</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getYMaximum()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_YMaximum();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getNeedleImagePath <em>Needle Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Needle Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getNeedleImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_NeedleImagePath();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getImagePivotPoint <em>Image Pivot Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Pivot Point</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getImagePivotPoint()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ImagePivotPoint();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getElementPivotPoint <em>Element Pivot Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Pivot Point</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getElementPivotPoint()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ElementPivotPoint();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInitialValue()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getFont1 <em>Font1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font1</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getFont1()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Font1();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getTextColor()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_TextColor();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getBackgroundColor()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getInitialText <em>Initial Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Text</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInitialText()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_InitialText();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getHorizontalAlignment()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getVerticalAlignment()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_VerticalAlignment();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getActiveImagePath <em>Active Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getActiveImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ActiveImagePath();

	/**
	 * Returns the meta object for the containment reference '{@link it.sssuprojects.e4codergui.Widget#getInactiveImagePath <em>Inactive Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inactive Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInactiveImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_InactiveImagePath();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#isInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#isInitialState()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Type();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getPressedImagePath <em>Pressed Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pressed Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getPressedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_PressedImagePath();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getReleasedImagePath <em>Released Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Released Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getReleasedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ReleasedImagePath();

	/**
	 * Returns the meta object for the attribute '{@link it.sssuprojects.e4codergui.Widget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getText()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Text();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getActivePressedImagePath <em>Active Pressed Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Pressed Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getActivePressedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ActivePressedImagePath();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getInactivePressedImagePath <em>Inactive Pressed Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inactive Pressed Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInactivePressedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_InactivePressedImagePath();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getActiveReleasedImagePath <em>Active Released Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Released Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getActiveReleasedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_ActiveReleasedImagePath();

	/**
	 * Returns the meta object for the reference '{@link it.sssuprojects.e4codergui.Widget#getInactiveReleasedImagePath <em>Inactive Released Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inactive Released Image Path</em>'.
	 * @see it.sssuprojects.e4codergui.Widget#getInactiveReleasedImagePath()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_InactiveReleasedImagePath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	E4coderguiFactory getE4coderguiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.ColorImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__ALPHA = eINSTANCE.getColor_Alpha();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.DocumentRootImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Gui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GUI = eINSTANCE.getDocumentRoot_Gui();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl <em>Frame Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.FrameTypeImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getFrameType()
		 * @generated
		 */
		EClass FRAME_TYPE = eINSTANCE.getFrameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME_TYPE__NAME = eINSTANCE.getFrameType_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME_TYPE__SIZE = eINSTANCE.getFrameType_Size();

		/**
		 * The meta object literal for the '<em><b>Full Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME_TYPE__FULL_SCREEN = eINSTANCE.getFrameType_FullScreen();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME_TYPE__ELEMENT = eINSTANCE.getFrameType_Element();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl <em>Gui Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.GuiTypeImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getGuiType()
		 * @generated
		 */
		EClass GUI_TYPE = eINSTANCE.getGuiType();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TYPE__INPUTS = eINSTANCE.getGuiType_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TYPE__OUTPUTS = eINSTANCE.getGuiType_Outputs();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TYPE__FRAME = eINSTANCE.getGuiType_Frame();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TYPE__VERSION = eINSTANCE.getGuiType_Version();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.PathImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__VALUE = eINSTANCE.getPath_Value();

		/**
		 * The meta object literal for the '<em><b>Default Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__DEFAULT_FOLDER = eINSTANCE.getPath_DefaultFolder();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___GET_PATH = eINSTANCE.getPath__GetPath();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.PointImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.PortsetImpl <em>Portset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.PortsetImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPortset()
		 * @generated
		 */
		EClass PORTSET = eINSTANCE.getPortset();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTSET__PORT = eINSTANCE.getPortset_Port();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.PortTypeImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '<em><b>Scicos Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__SCICOS_DESC = eINSTANCE.getPortType_ScicosDesc();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__SIZE = eINSTANCE.getPortType_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__TYPE = eINSTANCE.getPortType_Type();

		/**
		 * The meta object literal for the '{@link it.sssuprojects.e4codergui.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.sssuprojects.e4codergui.impl.WidgetImpl
		 * @see it.sssuprojects.e4codergui.impl.E4coderguiPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__POSITION = eINSTANCE.getWidget_Position();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__SIZE = eINSTANCE.getWidget_Size();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__OUTPUT_PORT = eINSTANCE.getWidget_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__INPUT_PORT = eINSTANCE.getWidget_InputPort();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__VERTICAL = eINSTANCE.getWidget_Vertical();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MINIMUM = eINSTANCE.getWidget_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MAXIMUM = eINSTANCE.getWidget_Maximum();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__VALUE = eINSTANCE.getWidget_Value();

		/**
		 * The meta object literal for the '<em><b>Minimum1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MINIMUM1 = eINSTANCE.getWidget_Minimum1();

		/**
		 * The meta object literal for the '<em><b>Maximum1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MAXIMUM1 = eINSTANCE.getWidget_Maximum1();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__VALUE1 = eINSTANCE.getWidget_Value1();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__FONT = eINSTANCE.getWidget_Font();

		/**
		 * The meta object literal for the '<em><b>On Image Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ON_IMAGE_PATH = eINSTANCE.getWidget_OnImagePath();

		/**
		 * The meta object literal for the '<em><b>Off Image Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__OFF_IMAGE_PATH = eINSTANCE.getWidget_OffImagePath();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__LINE_COLOR = eINSTANCE.getWidget_LineColor();

		/**
		 * The meta object literal for the '<em><b>Scroll Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__SCROLL_WINDOW = eINSTANCE.getWidget_ScrollWindow();

		/**
		 * The meta object literal for the '<em><b>YScale Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__YSCALE_TYPE = eINSTANCE.getWidget_YScaleType();

		/**
		 * The meta object literal for the '<em><b>YMinimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__YMINIMUM = eINSTANCE.getWidget_YMinimum();

		/**
		 * The meta object literal for the '<em><b>YMaximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__YMAXIMUM = eINSTANCE.getWidget_YMaximum();

		/**
		 * The meta object literal for the '<em><b>Needle Image Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__NEEDLE_IMAGE_PATH = eINSTANCE.getWidget_NeedleImagePath();

		/**
		 * The meta object literal for the '<em><b>Image Pivot Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__IMAGE_PIVOT_POINT = eINSTANCE.getWidget_ImagePivotPoint();

		/**
		 * The meta object literal for the '<em><b>Element Pivot Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ELEMENT_PIVOT_POINT = eINSTANCE.getWidget_ElementPivotPoint();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__INITIAL_VALUE = eINSTANCE.getWidget_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Font1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__FONT1 = eINSTANCE.getWidget_Font1();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TEXT_COLOR = eINSTANCE.getWidget_TextColor();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__BACKGROUND_COLOR = eINSTANCE.getWidget_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Initial Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__INITIAL_TEXT = eINSTANCE.getWidget_InitialText();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__HORIZONTAL_ALIGNMENT = eINSTANCE.getWidget_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__VERTICAL_ALIGNMENT = eINSTANCE.getWidget_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Active Image Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ACTIVE_IMAGE_PATH = eINSTANCE.getWidget_ActiveImagePath();

		/**
		 * The meta object literal for the '<em><b>Inactive Image Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__INACTIVE_IMAGE_PATH = eINSTANCE.getWidget_InactiveImagePath();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__INITIAL_STATE = eINSTANCE.getWidget_InitialState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TYPE = eINSTANCE.getWidget_Type();

		/**
		 * The meta object literal for the '<em><b>Pressed Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__PRESSED_IMAGE_PATH = eINSTANCE.getWidget_PressedImagePath();

		/**
		 * The meta object literal for the '<em><b>Released Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__RELEASED_IMAGE_PATH = eINSTANCE.getWidget_ReleasedImagePath();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TEXT = eINSTANCE.getWidget_Text();

		/**
		 * The meta object literal for the '<em><b>Active Pressed Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ACTIVE_PRESSED_IMAGE_PATH = eINSTANCE.getWidget_ActivePressedImagePath();

		/**
		 * The meta object literal for the '<em><b>Inactive Pressed Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__INACTIVE_PRESSED_IMAGE_PATH = eINSTANCE.getWidget_InactivePressedImagePath();

		/**
		 * The meta object literal for the '<em><b>Active Released Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__ACTIVE_RELEASED_IMAGE_PATH = eINSTANCE.getWidget_ActiveReleasedImagePath();

		/**
		 * The meta object literal for the '<em><b>Inactive Released Image Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__INACTIVE_RELEASED_IMAGE_PATH = eINSTANCE.getWidget_InactiveReleasedImagePath();

	}

} //E4coderguiPackage
