/**
 */
package it.sssuprojects.e4codergui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.Portset#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortset()
 * @model extendedMetaData="name='portset' kind='elementOnly'"
 * @generated
 */
public interface Portset extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link it.sssuprojects.e4codergui.PortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortset_Port()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PortType> getPort();

} // Portset
