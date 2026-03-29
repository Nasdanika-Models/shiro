/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Permission;
import org.nasdanika.models.shiro.ShiroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.PermissionImpl#getWildcardString <em>Wildcard String</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.PermissionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The default value of the '{@link #getWildcardString() <em>Wildcard String</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String WILDCARD_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWildcardString() {
		return (String)eDynamicGet(ShiroPackage.PERMISSION__WILDCARD_STRING, ShiroPackage.Literals.PERMISSION__WILDCARD_STRING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWildcardString(String newWildcardString) {
		eDynamicSet(ShiroPackage.PERMISSION__WILDCARD_STRING, ShiroPackage.Literals.PERMISSION__WILDCARD_STRING, newWildcardString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ShiroPackage.PERMISSION__DESCRIPTION, ShiroPackage.Literals.PERMISSION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ShiroPackage.PERMISSION__DESCRIPTION, ShiroPackage.Literals.PERMISSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.PERMISSION__WILDCARD_STRING:
				return getWildcardString();
			case ShiroPackage.PERMISSION__DESCRIPTION:
				return getDescription();
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
			case ShiroPackage.PERMISSION__WILDCARD_STRING:
				setWildcardString((String)newValue);
				return;
			case ShiroPackage.PERMISSION__DESCRIPTION:
				setDescription((String)newValue);
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
			case ShiroPackage.PERMISSION__WILDCARD_STRING:
				setWildcardString(WILDCARD_STRING_EDEFAULT);
				return;
			case ShiroPackage.PERMISSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ShiroPackage.PERMISSION__WILDCARD_STRING:
				return WILDCARD_STRING_EDEFAULT == null ? getWildcardString() != null : !WILDCARD_STRING_EDEFAULT.equals(getWildcardString());
			case ShiroPackage.PERMISSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //PermissionImpl
