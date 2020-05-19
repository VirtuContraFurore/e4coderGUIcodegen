/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class E4coderguiFactoryImpl extends EFactoryImpl implements E4coderguiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static E4coderguiFactory init() {
		try {
			E4coderguiFactory theE4coderguiFactory = (E4coderguiFactory)EPackage.Registry.INSTANCE.getEFactory(E4coderguiPackage.eNS_URI);
			if (theE4coderguiFactory != null) {
				return theE4coderguiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new E4coderguiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E4coderguiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case E4coderguiPackage.COLOR: return createColor();
			case E4coderguiPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case E4coderguiPackage.FRAME_TYPE: return createFrameType();
			case E4coderguiPackage.GUI_TYPE: return createGuiType();
			case E4coderguiPackage.PATH: return createPath();
			case E4coderguiPackage.POINT: return createPoint();
			case E4coderguiPackage.PORTSET: return createPortset();
			case E4coderguiPackage.PORT_TYPE: return createPortType();
			case E4coderguiPackage.WIDGET: return createWidget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType createFrameType() {
		FrameTypeImpl frameType = new FrameTypeImpl();
		return frameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuiType createGuiType() {
		GuiTypeImpl guiType = new GuiTypeImpl();
		return guiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Portset createPortset() {
		PortsetImpl portset = new PortsetImpl();
		return portset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E4coderguiPackage getE4coderguiPackage() {
		return (E4coderguiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static E4coderguiPackage getPackage() {
		return E4coderguiPackage.eINSTANCE;
	}

} //E4coderguiFactoryImpl
