/**
 */
package it.sssuprojects.e4codergui.impl;

import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.FrameType;
import it.sssuprojects.e4codergui.GuiType;
import it.sssuprojects.e4codergui.Portset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.impl.GuiTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuiTypeImpl extends MinimalEObjectImpl.Container implements GuiType {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected Portset inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected Portset outputs;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected FrameType frame;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E4coderguiPackage.Literals.GUI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Portset getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(Portset newInputs, NotificationChain msgs) {
		Portset oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__INPUTS, oldInputs, newInputs);
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
	public void setInputs(Portset newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Portset getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(Portset newOutputs, NotificationChain msgs) {
		Portset oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__OUTPUTS, oldOutputs, newOutputs);
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
	public void setOutputs(Portset newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(FrameType newFrame, NotificationChain msgs) {
		FrameType oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__FRAME, oldFrame, newFrame);
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
	public void setFrame(FrameType newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - E4coderguiPackage.GUI_TYPE__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E4coderguiPackage.GUI_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case E4coderguiPackage.GUI_TYPE__INPUTS:
				return basicSetInputs(null, msgs);
			case E4coderguiPackage.GUI_TYPE__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case E4coderguiPackage.GUI_TYPE__FRAME:
				return basicSetFrame(null, msgs);
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
			case E4coderguiPackage.GUI_TYPE__INPUTS:
				return getInputs();
			case E4coderguiPackage.GUI_TYPE__OUTPUTS:
				return getOutputs();
			case E4coderguiPackage.GUI_TYPE__FRAME:
				return getFrame();
			case E4coderguiPackage.GUI_TYPE__VERSION:
				return getVersion();
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
			case E4coderguiPackage.GUI_TYPE__INPUTS:
				setInputs((Portset)newValue);
				return;
			case E4coderguiPackage.GUI_TYPE__OUTPUTS:
				setOutputs((Portset)newValue);
				return;
			case E4coderguiPackage.GUI_TYPE__FRAME:
				setFrame((FrameType)newValue);
				return;
			case E4coderguiPackage.GUI_TYPE__VERSION:
				setVersion((String)newValue);
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
			case E4coderguiPackage.GUI_TYPE__INPUTS:
				setInputs((Portset)null);
				return;
			case E4coderguiPackage.GUI_TYPE__OUTPUTS:
				setOutputs((Portset)null);
				return;
			case E4coderguiPackage.GUI_TYPE__FRAME:
				setFrame((FrameType)null);
				return;
			case E4coderguiPackage.GUI_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case E4coderguiPackage.GUI_TYPE__INPUTS:
				return inputs != null;
			case E4coderguiPackage.GUI_TYPE__OUTPUTS:
				return outputs != null;
			case E4coderguiPackage.GUI_TYPE__FRAME:
				return frame != null;
			case E4coderguiPackage.GUI_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //GuiTypeImpl
