/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.PortType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PortTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PortTypeImpl#getScicosDesc <em>Scicos Desc</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PortTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.PortTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortTypeImpl extends MinimalEObjectImpl.Container implements PortType {
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
	 * The default value of the '{@link #getScicosDesc() <em>Scicos Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScicosDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String SCICOS_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScicosDesc() <em>Scicos Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScicosDesc()
	 * @generated
	 * @ordered
	 */
	protected String scicosDesc = SCICOS_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger size = SIZE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.PORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PORT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScicosDesc() {
		return scicosDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScicosDesc(String newScicosDesc) {
		String oldScicosDesc = scicosDesc;
		scicosDesc = newScicosDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PORT_TYPE__SCICOS_DESC, oldScicosDesc, scicosDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(BigInteger newSize) {
		BigInteger oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PORT_TYPE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.PORT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E4coderguiPackage.PORT_TYPE__NAME:
				return getName();
			case E4coderguiPackage.PORT_TYPE__SCICOS_DESC:
				return getScicosDesc();
			case E4coderguiPackage.PORT_TYPE__SIZE:
				return getSize();
			case E4coderguiPackage.PORT_TYPE__TYPE:
				return getType();
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
			case E4coderguiPackage.PORT_TYPE__NAME:
				setName((String)newValue);
				return;
			case E4coderguiPackage.PORT_TYPE__SCICOS_DESC:
				setScicosDesc((String)newValue);
				return;
			case E4coderguiPackage.PORT_TYPE__SIZE:
				setSize((BigInteger)newValue);
				return;
			case E4coderguiPackage.PORT_TYPE__TYPE:
				setType((String)newValue);
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
			case E4coderguiPackage.PORT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case E4coderguiPackage.PORT_TYPE__SCICOS_DESC:
				setScicosDesc(SCICOS_DESC_EDEFAULT);
				return;
			case E4coderguiPackage.PORT_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case E4coderguiPackage.PORT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case E4coderguiPackage.PORT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case E4coderguiPackage.PORT_TYPE__SCICOS_DESC:
				return SCICOS_DESC_EDEFAULT == null ? scicosDesc != null : !SCICOS_DESC_EDEFAULT.equals(scicosDesc);
			case E4coderguiPackage.PORT_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case E4coderguiPackage.PORT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", scicosDesc: ");
		result.append(scicosDesc);
		result.append(", size: ");
		result.append(size);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PortTypeImpl
