/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Permission;
import org.nasdanika.models.shiro.Realm;
import org.nasdanika.models.shiro.Role;
import org.nasdanika.models.shiro.SecurityManager;
import org.nasdanika.models.shiro.ShiroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.SecurityManagerImpl#getRealms <em>Realms</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SecurityManagerImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SecurityManagerImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends MinimalEObjectImpl.Container implements SecurityManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.SECURITY_MANAGER;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Realm> getRealms() {
		return (EList<Realm>)eDynamicGet(ShiroPackage.SECURITY_MANAGER__REALMS, ShiroPackage.Literals.SECURITY_MANAGER__REALMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ShiroPackage.SECURITY_MANAGER__ROLES, ShiroPackage.Literals.SECURITY_MANAGER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eDynamicGet(ShiroPackage.SECURITY_MANAGER__PERMISSIONS, ShiroPackage.Literals.SECURITY_MANAGER__PERMISSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.SECURITY_MANAGER__REALMS:
				return getRealms();
			case ShiroPackage.SECURITY_MANAGER__ROLES:
				return getRoles();
			case ShiroPackage.SECURITY_MANAGER__PERMISSIONS:
				return getPermissions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShiroPackage.SECURITY_MANAGER__REALMS:
				getRealms().clear();
				getRealms().addAll((java.util.Collection<? extends Realm>)newValue);
				return;
			case ShiroPackage.SECURITY_MANAGER__ROLES:
				getRoles().clear();
				getRoles().addAll((java.util.Collection<? extends Role>)newValue);
				return;
			case ShiroPackage.SECURITY_MANAGER__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((java.util.Collection<? extends Permission>)newValue);
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
			case ShiroPackage.SECURITY_MANAGER__REALMS:
				getRealms().clear();
				return;
			case ShiroPackage.SECURITY_MANAGER__ROLES:
				getRoles().clear();
				return;
			case ShiroPackage.SECURITY_MANAGER__PERMISSIONS:
				getPermissions().clear();
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
			case ShiroPackage.SECURITY_MANAGER__REALMS:
				return !getRealms().isEmpty();
			case ShiroPackage.SECURITY_MANAGER__ROLES:
				return !getRoles().isEmpty();
			case ShiroPackage.SECURITY_MANAGER__PERMISSIONS:
				return !getPermissions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
