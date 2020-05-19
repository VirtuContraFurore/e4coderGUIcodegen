/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.FrameType;
import it.sssuprojects.e4codergui.Point;
import it.sssuprojects.e4codergui.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl#isFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.FrameTypeImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameTypeImpl extends MinimalEObjectImpl.Container implements FrameType {
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
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Point size;

	/**
	 * The default value of the '{@link #isFullScreen() <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullScreen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULL_SCREEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFullScreen() <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullScreen()
	 * @generated
	 * @ordered
	 */
	protected boolean fullScreen = FULL_SCREEN_EDEFAULT;

	/**
	 * This is true if the Full Screen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fullScreenESet;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.FRAME_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.FRAME_TYPE__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.FRAME_TYPE__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.FRAME_TYPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.FRAME_TYPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.FRAME_TYPE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFullScreen() {
		return fullScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullScreen(boolean newFullScreen) {
		boolean oldFullScreen = fullScreen;
		fullScreen = newFullScreen;
		boolean oldFullScreenESet = fullScreenESet;
		fullScreenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.FRAME_TYPE__FULL_SCREEN, oldFullScreen, fullScreen, !oldFullScreenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFullScreen() {
		boolean oldFullScreen = fullScreen;
		boolean oldFullScreenESet = fullScreenESet;
		fullScreen = FULL_SCREEN_EDEFAULT;
		fullScreenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.FRAME_TYPE__FULL_SCREEN, oldFullScreen, FULL_SCREEN_EDEFAULT, oldFullScreenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFullScreen() {
		return fullScreenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Widget> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Widget>(Widget.class, this, E4coderguiPackage.FRAME_TYPE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E4coderguiPackage.FRAME_TYPE__SIZE:
				return basicSetSize(null, msgs);
			case E4coderguiPackage.FRAME_TYPE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case E4coderguiPackage.FRAME_TYPE__NAME:
				return getName();
			case E4coderguiPackage.FRAME_TYPE__SIZE:
				return getSize();
			case E4coderguiPackage.FRAME_TYPE__FULL_SCREEN:
				return isFullScreen();
			case E4coderguiPackage.FRAME_TYPE__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case E4coderguiPackage.FRAME_TYPE__NAME:
				setName((String)newValue);
				return;
			case E4coderguiPackage.FRAME_TYPE__SIZE:
				setSize((Point)newValue);
				return;
			case E4coderguiPackage.FRAME_TYPE__FULL_SCREEN:
				setFullScreen((Boolean)newValue);
				return;
			case E4coderguiPackage.FRAME_TYPE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Widget>)newValue);
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
			case E4coderguiPackage.FRAME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E4coderguiPackage.FRAME_TYPE__SIZE:
				setSize((Point)null);
				return;
			case E4coderguiPackage.FRAME_TYPE__FULL_SCREEN:
				unsetFullScreen();
				return;
			case E4coderguiPackage.FRAME_TYPE__ELEMENT:
				getElement().clear();
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
			case E4coderguiPackage.FRAME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E4coderguiPackage.FRAME_TYPE__SIZE:
				return size != null;
			case E4coderguiPackage.FRAME_TYPE__FULL_SCREEN:
				return isSetFullScreen();
			case E4coderguiPackage.FRAME_TYPE__ELEMENT:
				return element != null && !element.isEmpty();
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
		result.append(", fullScreen: ");
		if (fullScreenESet) result.append(fullScreen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FrameTypeImpl
