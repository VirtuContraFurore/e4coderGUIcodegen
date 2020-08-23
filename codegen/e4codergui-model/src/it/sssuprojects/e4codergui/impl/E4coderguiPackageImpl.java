/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.Color;
import it.sssuprojects.e4codergui.DocumentRoot;
import it.sssuprojects.e4codergui.E4coderguiFactory;
import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.FrameType;
import it.sssuprojects.e4codergui.GuiType;
import it.sssuprojects.e4codergui.Path;
import it.sssuprojects.e4codergui.Point;
import it.sssuprojects.e4codergui.PortType;
import it.sssuprojects.e4codergui.Portset;
import it.sssuprojects.e4codergui.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E4coderguiPackageImpl extends EPackageImpl implements E4coderguiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private E4coderguiPackageImpl() {
		super(eNS_URI, E4coderguiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link E4coderguiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static E4coderguiPackage init() {
		if (isInited) return (E4coderguiPackage)EPackage.Registry.INSTANCE.getEPackage(E4coderguiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredE4coderguiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		E4coderguiPackageImpl theE4coderguiPackage = registeredE4coderguiPackage instanceof E4coderguiPackageImpl ? (E4coderguiPackageImpl)registeredE4coderguiPackage : new E4coderguiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theE4coderguiPackage.createPackageContents();

		// Initialize created meta-data
		theE4coderguiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theE4coderguiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(E4coderguiPackage.eNS_URI, theE4coderguiPackage);
		return theE4coderguiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Alpha() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Blue() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Green() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColor_Red() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Gui() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameType() {
		return frameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Name() {
		return (EAttribute)frameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrameType_Size() {
		return (EReference)frameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_FullScreen() {
		return (EAttribute)frameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrameType_Element() {
		return (EReference)frameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGuiType() {
		return guiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGuiType_Inputs() {
		return (EReference)guiTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGuiType_Outputs() {
		return (EReference)guiTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGuiType_Frame() {
		return (EReference)guiTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGuiType_Version() {
		return (EAttribute)guiTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Value() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_DefaultFolder() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPath__GetPath() {
		return pathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortset() {
		return portsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortset_Port() {
		return (EReference)portsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_Name() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_ScicosDesc() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_Size() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_Type() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Position() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Size() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_OutputPort() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_InputPort() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Vertical() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Minimum() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Maximum() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Value() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Minimum1() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Maximum1() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Value1() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Font() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_OnImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_OffImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_LineColor() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_ScrollWindow() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_YScaleType() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_YMinimum() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_YMaximum() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_NeedleImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ImagePivotPoint() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ElementPivotPoint() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_InitialValue() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Font1() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_TextColor() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_BackgroundColor() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_InitialText() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_HorizontalAlignment() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_VerticalAlignment() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ActiveImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_InactiveImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_InitialState() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Type() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_PressedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ReleasedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Text() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ActivePressedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_InactivePressedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_ActiveReleasedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_InactiveReleasedImagePath() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E4coderguiFactory getE4coderguiFactory() {
		return (E4coderguiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__ALPHA);
		createEAttribute(colorEClass, COLOR__BLUE);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__RED);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GUI);

		frameTypeEClass = createEClass(FRAME_TYPE);
		createEAttribute(frameTypeEClass, FRAME_TYPE__NAME);
		createEReference(frameTypeEClass, FRAME_TYPE__SIZE);
		createEAttribute(frameTypeEClass, FRAME_TYPE__FULL_SCREEN);
		createEReference(frameTypeEClass, FRAME_TYPE__ELEMENT);

		guiTypeEClass = createEClass(GUI_TYPE);
		createEReference(guiTypeEClass, GUI_TYPE__INPUTS);
		createEReference(guiTypeEClass, GUI_TYPE__OUTPUTS);
		createEReference(guiTypeEClass, GUI_TYPE__FRAME);
		createEAttribute(guiTypeEClass, GUI_TYPE__VERSION);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__VALUE);
		createEAttribute(pathEClass, PATH__DEFAULT_FOLDER);
		createEOperation(pathEClass, PATH___GET_PATH);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		portsetEClass = createEClass(PORTSET);
		createEReference(portsetEClass, PORTSET__PORT);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__NAME);
		createEAttribute(portTypeEClass, PORT_TYPE__SCICOS_DESC);
		createEAttribute(portTypeEClass, PORT_TYPE__SIZE);
		createEAttribute(portTypeEClass, PORT_TYPE__TYPE);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEReference(widgetEClass, WIDGET__POSITION);
		createEReference(widgetEClass, WIDGET__SIZE);
		createEAttribute(widgetEClass, WIDGET__OUTPUT_PORT);
		createEAttribute(widgetEClass, WIDGET__INPUT_PORT);
		createEAttribute(widgetEClass, WIDGET__VERTICAL);
		createEAttribute(widgetEClass, WIDGET__MINIMUM);
		createEAttribute(widgetEClass, WIDGET__MAXIMUM);
		createEAttribute(widgetEClass, WIDGET__VALUE);
		createEAttribute(widgetEClass, WIDGET__MINIMUM1);
		createEAttribute(widgetEClass, WIDGET__MAXIMUM1);
		createEAttribute(widgetEClass, WIDGET__VALUE1);
		createEAttribute(widgetEClass, WIDGET__FONT);
		createEReference(widgetEClass, WIDGET__ON_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__OFF_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__LINE_COLOR);
		createEAttribute(widgetEClass, WIDGET__SCROLL_WINDOW);
		createEAttribute(widgetEClass, WIDGET__YSCALE_TYPE);
		createEAttribute(widgetEClass, WIDGET__YMINIMUM);
		createEAttribute(widgetEClass, WIDGET__YMAXIMUM);
		createEReference(widgetEClass, WIDGET__NEEDLE_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__IMAGE_PIVOT_POINT);
		createEReference(widgetEClass, WIDGET__ELEMENT_PIVOT_POINT);
		createEAttribute(widgetEClass, WIDGET__INITIAL_VALUE);
		createEAttribute(widgetEClass, WIDGET__FONT1);
		createEReference(widgetEClass, WIDGET__TEXT_COLOR);
		createEReference(widgetEClass, WIDGET__BACKGROUND_COLOR);
		createEAttribute(widgetEClass, WIDGET__INITIAL_TEXT);
		createEAttribute(widgetEClass, WIDGET__HORIZONTAL_ALIGNMENT);
		createEAttribute(widgetEClass, WIDGET__VERTICAL_ALIGNMENT);
		createEReference(widgetEClass, WIDGET__ACTIVE_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__INACTIVE_IMAGE_PATH);
		createEAttribute(widgetEClass, WIDGET__INITIAL_STATE);
		createEAttribute(widgetEClass, WIDGET__TYPE);
		createEReference(widgetEClass, WIDGET__PRESSED_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__RELEASED_IMAGE_PATH);
		createEAttribute(widgetEClass, WIDGET__TEXT);
		createEReference(widgetEClass, WIDGET__ACTIVE_PRESSED_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__INACTIVE_PRESSED_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__ACTIVE_RELEASED_IMAGE_PATH);
		createEReference(widgetEClass, WIDGET__INACTIVE_RELEASED_IMAGE_PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Alpha(), theXMLTypePackage.getInteger(), "alpha", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Blue(), theXMLTypePackage.getInteger(), "blue", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Green(), theXMLTypePackage.getInteger(), "green", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_Red(), theXMLTypePackage.getInteger(), "red", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Gui(), this.getGuiType(), null, "gui", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(frameTypeEClass, FrameType.class, "FrameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrameType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, FrameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrameType_Size(), this.getPoint(), null, "size", null, 1, 1, FrameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameType_FullScreen(), theXMLTypePackage.getBoolean(), "fullScreen", null, 1, 1, FrameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrameType_Element(), this.getWidget(), null, "element", null, 0, -1, FrameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTypeEClass, GuiType.class, "GuiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiType_Inputs(), this.getPortset(), null, "inputs", null, 1, 1, GuiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiType_Outputs(), this.getPortset(), null, "outputs", null, 1, 1, GuiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiType_Frame(), this.getFrameType(), null, "frame", null, 1, 1, GuiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, GuiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_DefaultFolder(), theXMLTypePackage.getBoolean(), "defaultFolder", null, 1, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPath__GetPath(), theXMLTypePackage.getString(), "getPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theXMLTypePackage.getInteger(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), theXMLTypePackage.getInteger(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portsetEClass, Portset.class, "Portset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortset_Port(), this.getPortType(), null, "port", null, 0, -1, Portset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_ScicosDesc(), theXMLTypePackage.getString(), "scicosDesc", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Size(), theXMLTypePackage.getInteger(), "size", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Position(), this.getPoint(), null, "position", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Size(), this.getPoint(), null, "size", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_OutputPort(), theXMLTypePackage.getNCName(), "outputPort", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_InputPort(), theXMLTypePackage.getNCName(), "inputPort", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Vertical(), theXMLTypePackage.getBoolean(), "vertical", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Minimum(), theXMLTypePackage.getDouble(), "minimum", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Maximum(), theXMLTypePackage.getDouble(), "maximum", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Minimum1(), theXMLTypePackage.getDouble(), "minimum1", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Maximum1(), theXMLTypePackage.getDouble(), "maximum1", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Value1(), theXMLTypePackage.getDouble(), "value1", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Font(), theXMLTypePackage.getString(), "font", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_OnImagePath(), this.getPath(), null, "onImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_OffImagePath(), this.getPath(), null, "offImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_LineColor(), this.getColor(), null, "lineColor", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_ScrollWindow(), theXMLTypePackage.getDouble(), "scrollWindow", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_YScaleType(), theXMLTypePackage.getString(), "yScaleType", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_YMinimum(), theXMLTypePackage.getDouble(), "yMinimum", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_YMaximum(), theXMLTypePackage.getDouble(), "yMaximum", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_NeedleImagePath(), this.getPath(), null, "needleImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ImagePivotPoint(), this.getPoint(), null, "imagePivotPoint", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ElementPivotPoint(), this.getPoint(), null, "elementPivotPoint", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_InitialValue(), theXMLTypePackage.getDouble(), "initialValue", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Font1(), theXMLTypePackage.getString(), "font1", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_TextColor(), this.getColor(), null, "textColor", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_BackgroundColor(), this.getColor(), null, "backgroundColor", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_InitialText(), theXMLTypePackage.getString(), "initialText", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_HorizontalAlignment(), theXMLTypePackage.getNCName(), "horizontalAlignment", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_VerticalAlignment(), theXMLTypePackage.getNCName(), "verticalAlignment", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ActiveImagePath(), this.getPath(), null, "activeImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_InactiveImagePath(), this.getPath(), null, "inactiveImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_InitialState(), theXMLTypePackage.getBoolean(), "initialState", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Type(), theXMLTypePackage.getNCName(), "type", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_PressedImagePath(), this.getPath(), null, "pressedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ReleasedImagePath(), this.getPath(), null, "releasedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ActivePressedImagePath(), this.getPath(), null, "activePressedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_InactivePressedImagePath(), this.getPath(), null, "inactivePressedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_ActiveReleasedImagePath(), this.getPath(), null, "activeReleasedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_InactiveReleasedImagePath(), this.getPath(), null, "inactiveReleasedImagePath", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (colorEClass,
		   source,
		   new String[] {
			   "name", "color",
			   "kind", "empty"
		   });
		addAnnotation
		  (getColor_Alpha(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "alpha"
		   });
		addAnnotation
		  (getColor_Blue(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "blue"
		   });
		addAnnotation
		  (getColor_Green(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "green"
		   });
		addAnnotation
		  (getColor_Red(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "red"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Gui(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gui",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (frameTypeEClass,
		   source,
		   new String[] {
			   "name", "frame_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFrameType_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrameType_Size(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrameType_FullScreen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fullScreen",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFrameType_Element(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (guiTypeEClass,
		   source,
		   new String[] {
			   "name", "gui_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGuiType_Inputs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGuiType_Outputs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGuiType_Frame(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "frame",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGuiType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (pathEClass,
		   source,
		   new String[] {
			   "name", "path",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPath_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPath_DefaultFolder(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "defaultFolder"
		   });
		addAnnotation
		  (pointEClass,
		   source,
		   new String[] {
			   "name", "point",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPoint_X(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "x"
		   });
		addAnnotation
		  (getPoint_Y(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "y"
		   });
		addAnnotation
		  (portsetEClass,
		   source,
		   new String[] {
			   "name", "portset",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPortset_Port(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "port",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (portTypeEClass,
		   source,
		   new String[] {
			   "name", "port_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPortType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getPortType_ScicosDesc(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scicosDesc"
		   });
		addAnnotation
		  (getPortType_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size"
		   });
		addAnnotation
		  (getPortType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (widgetEClass,
		   source,
		   new String[] {
			   "name", "widget",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWidget_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Position(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "position",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Size(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_OutputPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InputPort(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputPort",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Vertical(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vertical",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Minimum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "minimum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Maximum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maximum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Minimum1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "minimum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Maximum1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maximum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Value1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Font(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "font",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_OnImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_OffImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "offImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_LineColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lineColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ScrollWindow(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "scrollWindow",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_YScaleType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "yScaleType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_YMinimum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "yMinimum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_YMaximum(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "yMaximum",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_NeedleImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "needleImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ImagePivotPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "imagePivotPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ElementPivotPoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elementPivotPoint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InitialValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "initialValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Font1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "font",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_TextColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "textColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_BackgroundColor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "backgroundColor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InitialText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "initialText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_HorizontalAlignment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "horizontalAlignment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_VerticalAlignment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verticalAlignment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ActiveImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activeImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InactiveImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inactiveImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InitialState(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "initialState",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getWidget_PressedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ReleasedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ActivePressedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activePressedImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InactivePressedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inactivePressedImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_ActiveReleasedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activeReleasedImagePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getWidget_InactiveReleasedImagePath(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inactiveReleasedImagePath",
			   "namespace", "##targetNamespace"
		   });
	}

} //E4coderguiPackageImpl
