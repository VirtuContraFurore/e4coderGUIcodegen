/**
 */
package it.sssuprojects.e4codergui.util;

import it.sssuprojects.e4codergui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.sssuprojects.e4codergui.E4coderguiPackage
 * @generated
 */
public class E4coderguiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static E4coderguiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E4coderguiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = E4coderguiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E4coderguiSwitch<Adapter> modelSwitch =
		new E4coderguiSwitch<Adapter>() {
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFrameType(FrameType object) {
				return createFrameTypeAdapter();
			}
			@Override
			public Adapter caseGuiType(GuiType object) {
				return createGuiTypeAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePortset(Portset object) {
				return createPortsetAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.FrameType
	 * @generated
	 */
	public Adapter createFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.GuiType <em>Gui Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.GuiType
	 * @generated
	 */
	public Adapter createGuiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.Portset <em>Portset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.Portset
	 * @generated
	 */
	public Adapter createPortsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.sssuprojects.e4codergui.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.sssuprojects.e4codergui.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //E4coderguiAdapterFactory
