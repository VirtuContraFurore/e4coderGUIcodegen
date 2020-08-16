/**
 */
package it.sssuprojects.e4codergui.provider;


import it.sssuprojects.e4codergui.E4coderguiFactory;
import it.sssuprojects.e4codergui.E4coderguiPackage;
import it.sssuprojects.e4codergui.Widget;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.sssuprojects.e4codergui.Widget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addOutputPortPropertyDescriptor(object);
			addInputPortPropertyDescriptor(object);
			addVerticalPropertyDescriptor(object);
			addMinimumPropertyDescriptor(object);
			addMaximumPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addMinimum1PropertyDescriptor(object);
			addMaximum1PropertyDescriptor(object);
			addValue1PropertyDescriptor(object);
			addFontPropertyDescriptor(object);
			addScrollWindowPropertyDescriptor(object);
			addYScaleTypePropertyDescriptor(object);
			addYMinimumPropertyDescriptor(object);
			addYMaximumPropertyDescriptor(object);
			addInitialValuePropertyDescriptor(object);
			addFont1PropertyDescriptor(object);
			addInitialTextPropertyDescriptor(object);
			addHorizontalAlignmentPropertyDescriptor(object);
			addVerticalAlignmentPropertyDescriptor(object);
			addInitialStatePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addPressedImagePathPropertyDescriptor(object);
			addReleasedImagePathPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_name_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_outputPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_outputPort_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__OUTPUT_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_inputPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_inputPort_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__INPUT_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_vertical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_vertical_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__VERTICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_minimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_minimum_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__MINIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_maximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_maximum_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__MAXIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_value_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimum1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_minimum1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_minimum1_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__MINIMUM1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_maximum1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_maximum1_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__MAXIMUM1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValue1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_value1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_value1_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__VALUE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_font_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scroll Window feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScrollWindowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_scrollWindow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_scrollWindow_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__SCROLL_WINDOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YScale Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYScaleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_yScaleType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_yScaleType_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__YSCALE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YMinimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_yMinimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_yMinimum_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__YMINIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YMaximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_yMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_yMaximum_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__YMAXIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_initialValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_initialValue_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__INITIAL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFont1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_font1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_font1_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__FONT1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_initialText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_initialText_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__INITIAL_TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_horizontalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_horizontalAlignment_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__HORIZONTAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_verticalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_verticalAlignment_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__VERTICAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_initialState_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__INITIAL_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_type_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pressed Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPressedImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_pressedImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_pressedImagePath_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__PRESSED_IMAGE_PATH,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Released Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleasedImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_releasedImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_releasedImagePath_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__RELEASED_IMAGE_PATH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Widget_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Widget_text_feature", "_UI_Widget_type"),
				 E4coderguiPackage.Literals.WIDGET__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__POSITION);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__SIZE);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__ON_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__OFF_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__LINE_COLOR);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__NEEDLE_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__IMAGE_PIVOT_POINT);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__ELEMENT_PIVOT_POINT);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__TEXT_COLOR);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__BACKGROUND_COLOR);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__ACTIVE_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__INACTIVE_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__ACTIVE_PRESSED_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__INACTIVE_PRESSED_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__ACTIVE_RELEASED_IMAGE_PATH);
			childrenFeatures.add(E4coderguiPackage.Literals.WIDGET__INACTIVE_RELEASED_IMAGE_PATH);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Widget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Widget"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Widget)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Widget_type") :
			getString("_UI_Widget_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Widget.class)) {
			case E4coderguiPackage.WIDGET__NAME:
			case E4coderguiPackage.WIDGET__OUTPUT_PORT:
			case E4coderguiPackage.WIDGET__INPUT_PORT:
			case E4coderguiPackage.WIDGET__VERTICAL:
			case E4coderguiPackage.WIDGET__MINIMUM:
			case E4coderguiPackage.WIDGET__MAXIMUM:
			case E4coderguiPackage.WIDGET__VALUE:
			case E4coderguiPackage.WIDGET__MINIMUM1:
			case E4coderguiPackage.WIDGET__MAXIMUM1:
			case E4coderguiPackage.WIDGET__VALUE1:
			case E4coderguiPackage.WIDGET__FONT:
			case E4coderguiPackage.WIDGET__SCROLL_WINDOW:
			case E4coderguiPackage.WIDGET__YSCALE_TYPE:
			case E4coderguiPackage.WIDGET__YMINIMUM:
			case E4coderguiPackage.WIDGET__YMAXIMUM:
			case E4coderguiPackage.WIDGET__INITIAL_VALUE:
			case E4coderguiPackage.WIDGET__FONT1:
			case E4coderguiPackage.WIDGET__INITIAL_TEXT:
			case E4coderguiPackage.WIDGET__HORIZONTAL_ALIGNMENT:
			case E4coderguiPackage.WIDGET__VERTICAL_ALIGNMENT:
			case E4coderguiPackage.WIDGET__INITIAL_STATE:
			case E4coderguiPackage.WIDGET__TYPE:
			case E4coderguiPackage.WIDGET__PRESSED_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__TEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case E4coderguiPackage.WIDGET__POSITION:
			case E4coderguiPackage.WIDGET__SIZE:
			case E4coderguiPackage.WIDGET__ON_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__OFF_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__LINE_COLOR:
			case E4coderguiPackage.WIDGET__NEEDLE_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__IMAGE_PIVOT_POINT:
			case E4coderguiPackage.WIDGET__ELEMENT_PIVOT_POINT:
			case E4coderguiPackage.WIDGET__TEXT_COLOR:
			case E4coderguiPackage.WIDGET__BACKGROUND_COLOR:
			case E4coderguiPackage.WIDGET__ACTIVE_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__INACTIVE_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__ACTIVE_PRESSED_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__INACTIVE_PRESSED_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__ACTIVE_RELEASED_IMAGE_PATH:
			case E4coderguiPackage.WIDGET__INACTIVE_RELEASED_IMAGE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__POSITION,
				 E4coderguiFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__SIZE,
				 E4coderguiFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__ON_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__OFF_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__LINE_COLOR,
				 E4coderguiFactory.eINSTANCE.createColor()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__NEEDLE_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__IMAGE_PIVOT_POINT,
				 E4coderguiFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__ELEMENT_PIVOT_POINT,
				 E4coderguiFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__TEXT_COLOR,
				 E4coderguiFactory.eINSTANCE.createColor()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__BACKGROUND_COLOR,
				 E4coderguiFactory.eINSTANCE.createColor()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__ACTIVE_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__INACTIVE_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__ACTIVE_PRESSED_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__INACTIVE_PRESSED_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__ACTIVE_RELEASED_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(E4coderguiPackage.Literals.WIDGET__INACTIVE_RELEASED_IMAGE_PATH,
				 E4coderguiFactory.eINSTANCE.createPath()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == E4coderguiPackage.Literals.WIDGET__POSITION ||
			childFeature == E4coderguiPackage.Literals.WIDGET__SIZE ||
			childFeature == E4coderguiPackage.Literals.WIDGET__IMAGE_PIVOT_POINT ||
			childFeature == E4coderguiPackage.Literals.WIDGET__ELEMENT_PIVOT_POINT ||
			childFeature == E4coderguiPackage.Literals.WIDGET__ON_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__OFF_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__NEEDLE_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__ACTIVE_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__INACTIVE_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__ACTIVE_PRESSED_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__INACTIVE_PRESSED_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__ACTIVE_RELEASED_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__INACTIVE_RELEASED_IMAGE_PATH ||
			childFeature == E4coderguiPackage.Literals.WIDGET__LINE_COLOR ||
			childFeature == E4coderguiPackage.Literals.WIDGET__TEXT_COLOR ||
			childFeature == E4coderguiPackage.Literals.WIDGET__BACKGROUND_COLOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SchemaEditPlugin.INSTANCE;
	}

}
