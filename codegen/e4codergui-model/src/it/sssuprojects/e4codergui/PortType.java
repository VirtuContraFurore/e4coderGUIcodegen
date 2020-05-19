/**
 */
package it.sssuprojects.e4codergui;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.sssuprojects.e4codergui.PortType#getName <em>Name</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.PortType#getScicosDesc <em>Scicos Desc</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.PortType#getSize <em>Size</em>}</li>
 *   <li>{@link it.sssuprojects.e4codergui.PortType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortType()
 * @model extendedMetaData="name='port_._type' kind='empty'"
 * @generated
 */
public interface PortType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.PortType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scicos Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scicos Desc</em>' attribute.
	 * @see #setScicosDesc(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortType_ScicosDesc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scicosDesc'"
	 * @generated
	 */
	String getScicosDesc();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.PortType#getScicosDesc <em>Scicos Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scicos Desc</em>' attribute.
	 * @see #getScicosDesc()
	 * @generated
	 */
	void setScicosDesc(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigInteger)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortType_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.PortType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.sssuprojects.e4codergui.E4coderguiPackage#getPortType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.sssuprojects.e4codergui.PortType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // PortType
