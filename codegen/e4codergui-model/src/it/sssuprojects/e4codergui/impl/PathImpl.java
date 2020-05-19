/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.Path;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PathImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PathImpl#isDefaultFolder <em>Default Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends MinimalEObjectImpl.Container implements Path {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultFolder() <em>Default Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFolder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_FOLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultFolder() <em>Default Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFolder()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFolder = DEFAULT_FOLDER_EDEFAULT;

	/**
	 * This is true if the Default Folder attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFolderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PATH__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefaultFolder() {
		return defaultFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFolder(boolean newDefaultFolder) {
		boolean oldDefaultFolder = defaultFolder;
		defaultFolder = newDefaultFolder;
		boolean oldDefaultFolderESet = defaultFolderESet;
		defaultFolderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PATH__DEFAULT_FOLDER, oldDefaultFolder, defaultFolder, !oldDefaultFolderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefaultFolder() {
		boolean oldDefaultFolder = defaultFolder;
		boolean oldDefaultFolderESet = defaultFolderESet;
		defaultFolder = DEFAULT_FOLDER_EDEFAULT;
		defaultFolderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, E4coderguiPackage.PATH__DEFAULT_FOLDER, oldDefaultFolder, DEFAULT_FOLDER_EDEFAULT, oldDefaultFolderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefaultFolder() {
		return defaultFolderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getPath() {
		if(this.eIsProxy())
			return eProxyURI().path();
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E4coderguiPackage.PATH__VALUE:
				return getValue();
			case E4coderguiPackage.PATH__DEFAULT_FOLDER:
				return isDefaultFolder();
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
			case E4coderguiPackage.PATH__VALUE:
				setValue((String)newValue);
				return;
			case E4coderguiPackage.PATH__DEFAULT_FOLDER:
				setDefaultFolder((Boolean)newValue);
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
			case E4coderguiPackage.PATH__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case E4coderguiPackage.PATH__DEFAULT_FOLDER:
				unsetDefaultFolder();
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
			case E4coderguiPackage.PATH__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case E4coderguiPackage.PATH__DEFAULT_FOLDER:
				return isSetDefaultFolder();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case E4coderguiPackage.PATH___GET_PATH:
				return getPath();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", defaultFolder: ");
		if (defaultFolderESet) result.append(defaultFolder); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	public void String() {
		// TODO Auto-generated method stub
		
	}

} //PathImpl
