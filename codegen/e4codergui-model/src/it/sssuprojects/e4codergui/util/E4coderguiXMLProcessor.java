/**
 */
package it.sssuprojects.e4codergui.util;

import it.sssuprojects.e4codergui.E4coderguiPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class E4coderguiXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E4coderguiXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		E4coderguiPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the E4coderguiResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new E4coderguiResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new E4coderguiResourceFactoryImpl());
		}
		return registrations;
	}

} //E4coderguiXMLProcessor
