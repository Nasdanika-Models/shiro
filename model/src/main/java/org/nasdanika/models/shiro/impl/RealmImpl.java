/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Realm;
import org.nasdanika.models.shiro.ShiroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.RealmImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.RealmImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.RealmImpl#isCachingEnabled <em>Caching Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.RealmImpl#isAuthenticationCachingEnabled <em>Authentication Caching Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.RealmImpl#isAuthorizationCachingEnabled <em>Authorization Caching Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealmImpl extends MinimalEObjectImpl.Container implements Realm {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isCachingEnabled() <em>Caching Enabled</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHING_ENABLED_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isAuthenticationCachingEnabled() <em>Authentication Caching Enabled</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATION_CACHING_ENABLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAuthorizationCachingEnabled() <em>Authorization Caching Enabled</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORIZATION_CACHING_ENABLED_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.REALM;
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
	public String getName() {
		return (String)eDynamicGet(ShiroPackage.REALM__NAME, ShiroPackage.Literals.REALM__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ShiroPackage.REALM__NAME, ShiroPackage.Literals.REALM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ShiroPackage.REALM__DESCRIPTION, ShiroPackage.Literals.REALM__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ShiroPackage.REALM__DESCRIPTION, ShiroPackage.Literals.REALM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCachingEnabled() {
		return (Boolean)eDynamicGet(ShiroPackage.REALM__CACHING_ENABLED, ShiroPackage.Literals.REALM__CACHING_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachingEnabled(boolean newCachingEnabled) {
		eDynamicSet(ShiroPackage.REALM__CACHING_ENABLED, ShiroPackage.Literals.REALM__CACHING_ENABLED, newCachingEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthenticationCachingEnabled() {
		return (Boolean)eDynamicGet(ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED, ShiroPackage.Literals.REALM__AUTHENTICATION_CACHING_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationCachingEnabled(boolean newAuthenticationCachingEnabled) {
		eDynamicSet(ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED, ShiroPackage.Literals.REALM__AUTHENTICATION_CACHING_ENABLED, newAuthenticationCachingEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthorizationCachingEnabled() {
		return (Boolean)eDynamicGet(ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED, ShiroPackage.Literals.REALM__AUTHORIZATION_CACHING_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationCachingEnabled(boolean newAuthorizationCachingEnabled) {
		eDynamicSet(ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED, ShiroPackage.Literals.REALM__AUTHORIZATION_CACHING_ENABLED, newAuthorizationCachingEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.REALM__NAME:
				return getName();
			case ShiroPackage.REALM__DESCRIPTION:
				return getDescription();
			case ShiroPackage.REALM__CACHING_ENABLED:
				return isCachingEnabled();
			case ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED:
				return isAuthenticationCachingEnabled();
			case ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED:
				return isAuthorizationCachingEnabled();
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
			case ShiroPackage.REALM__NAME:
				setName((String)newValue);
				return;
			case ShiroPackage.REALM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ShiroPackage.REALM__CACHING_ENABLED:
				setCachingEnabled((Boolean)newValue);
				return;
			case ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED:
				setAuthenticationCachingEnabled((Boolean)newValue);
				return;
			case ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED:
				setAuthorizationCachingEnabled((Boolean)newValue);
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
			case ShiroPackage.REALM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShiroPackage.REALM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ShiroPackage.REALM__CACHING_ENABLED:
				setCachingEnabled(CACHING_ENABLED_EDEFAULT);
				return;
			case ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED:
				setAuthenticationCachingEnabled(AUTHENTICATION_CACHING_ENABLED_EDEFAULT);
				return;
			case ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED:
				setAuthorizationCachingEnabled(AUTHORIZATION_CACHING_ENABLED_EDEFAULT);
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
			case ShiroPackage.REALM__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ShiroPackage.REALM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ShiroPackage.REALM__CACHING_ENABLED:
				return isCachingEnabled() != CACHING_ENABLED_EDEFAULT;
			case ShiroPackage.REALM__AUTHENTICATION_CACHING_ENABLED:
				return isAuthenticationCachingEnabled() != AUTHENTICATION_CACHING_ENABLED_EDEFAULT;
			case ShiroPackage.REALM__AUTHORIZATION_CACHING_ENABLED:
				return isAuthorizationCachingEnabled() != AUTHORIZATION_CACHING_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RealmImpl
