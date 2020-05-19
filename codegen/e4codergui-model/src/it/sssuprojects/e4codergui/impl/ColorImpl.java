/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.Color;
import it.sssuprojects.e4codergui.E4coderguiPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.ColorImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.ColorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.ColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.ColorImpl#getRed <em>Red</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected BigInteger alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BLUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected BigInteger green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger red = RED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlpha(BigInteger newAlpha) {
		BigInteger oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.COLOR__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlue(BigInteger newBlue) {
		BigInteger oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.COLOR__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreen(BigInteger newGreen) {
		BigInteger oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.COLOR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRed(BigInteger newRed) {
		BigInteger oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.COLOR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case E4coderguiPackage.COLOR__ALPHA:
				return getAlpha();
			case E4coderguiPackage.COLOR__BLUE:
				return getBlue();
			case E4coderguiPackage.COLOR__GREEN:
				return getGreen();
			case E4coderguiPackage.COLOR__RED:
				return getRed();
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
			case E4coderguiPackage.COLOR__ALPHA:
				setAlpha((BigInteger)newValue);
				return;
			case E4coderguiPackage.COLOR__BLUE:
				setBlue((BigInteger)newValue);
				return;
			case E4coderguiPackage.COLOR__GREEN:
				setGreen((BigInteger)newValue);
				return;
			case E4coderguiPackage.COLOR__RED:
				setRed((BigInteger)newValue);
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
			case E4coderguiPackage.COLOR__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case E4coderguiPackage.COLOR__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case E4coderguiPackage.COLOR__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case E4coderguiPackage.COLOR__RED:
				setRed(RED_EDEFAULT);
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
			case E4coderguiPackage.COLOR__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case E4coderguiPackage.COLOR__BLUE:
				return BLUE_EDEFAULT == null ? blue != null : !BLUE_EDEFAULT.equals(blue);
			case E4coderguiPackage.COLOR__GREEN:
				return GREEN_EDEFAULT == null ? green != null : !GREEN_EDEFAULT.equals(green);
			case E4coderguiPackage.COLOR__RED:
				return RED_EDEFAULT == null ? red != null : !RED_EDEFAULT.equals(red);
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
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", blue: ");
		result.append(blue);
		result.append(", green: ");
		result.append(green);
		result.append(", red: ");
		result.append(red);
		result.append(')');
		return result.toString();
	}

} //ColorImpl
