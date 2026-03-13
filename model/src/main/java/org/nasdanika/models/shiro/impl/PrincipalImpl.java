/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Principal;
import org.nasdanika.models.shiro.ShiroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.PrincipalImpl#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.PrincipalImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.PrincipalImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrincipalImpl extends MinimalEObjectImpl.Container implements Principal {
	/**
	 * The default value of the '{@link #getRealmName() <em>Realm Name</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String REALM_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.PRINCIPAL;
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
	public String getRealmName() {
		return (String)eDynamicGet(ShiroPackage.PRINCIPAL__REALM_NAME, ShiroPackage.Literals.PRINCIPAL__REALM_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealmName(String newRealmName) {
		eDynamicSet(ShiroPackage.PRINCIPAL__REALM_NAME, ShiroPackage.Literals.PRINCIPAL__REALM_NAME, newRealmName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(ShiroPackage.PRINCIPAL__VALUE, ShiroPackage.Literals.PRINCIPAL__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(ShiroPackage.PRINCIPAL__VALUE, ShiroPackage.Literals.PRINCIPAL__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(ShiroPackage.PRINCIPAL__TYPE, ShiroPackage.Literals.PRINCIPAL__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(ShiroPackage.PRINCIPAL__TYPE, ShiroPackage.Literals.PRINCIPAL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.PRINCIPAL__REALM_NAME:
				return getRealmName();
			case ShiroPackage.PRINCIPAL__VALUE:
				return getValue();
			case ShiroPackage.PRINCIPAL__TYPE:
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
			case ShiroPackage.PRINCIPAL__REALM_NAME:
				setRealmName((String)newValue);
				return;
			case ShiroPackage.PRINCIPAL__VALUE:
				setValue((String)newValue);
				return;
			case ShiroPackage.PRINCIPAL__TYPE:
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
			case ShiroPackage.PRINCIPAL__REALM_NAME:
				setRealmName(REALM_NAME_EDEFAULT);
				return;
			case ShiroPackage.PRINCIPAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ShiroPackage.PRINCIPAL__TYPE:
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
			case ShiroPackage.PRINCIPAL__REALM_NAME:
				return REALM_NAME_EDEFAULT == null ? getRealmName() != null : !REALM_NAME_EDEFAULT.equals(getRealmName());
			case ShiroPackage.PRINCIPAL__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case ShiroPackage.PRINCIPAL__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //PrincipalImpl
