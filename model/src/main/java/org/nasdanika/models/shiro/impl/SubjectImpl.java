/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Permission;
import org.nasdanika.models.shiro.Principal;
import org.nasdanika.models.shiro.Role;
import org.nasdanika.models.shiro.Session;
import org.nasdanika.models.shiro.ShiroPackage;
import org.nasdanika.models.shiro.Subject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#getPrincipals <em>Principals</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SubjectImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectImpl extends MinimalEObjectImpl.Container implements Subject {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.SUBJECT;
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
	public String getHost() {
		return (String)eDynamicGet(ShiroPackage.SUBJECT__HOST, ShiroPackage.Literals.SUBJECT__HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		eDynamicSet(ShiroPackage.SUBJECT__HOST, ShiroPackage.Literals.SUBJECT__HOST, newHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthenticated() {
		return (Boolean)eDynamicGet(ShiroPackage.SUBJECT__AUTHENTICATED, ShiroPackage.Literals.SUBJECT__AUTHENTICATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticated(boolean newAuthenticated) {
		eDynamicSet(ShiroPackage.SUBJECT__AUTHENTICATED, ShiroPackage.Literals.SUBJECT__AUTHENTICATED, newAuthenticated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Principal> getPrincipals() {
		return (EList<Principal>)eDynamicGet(ShiroPackage.SUBJECT__PRINCIPALS, ShiroPackage.Literals.SUBJECT__PRINCIPALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Session getSession() {
		return (Session)eDynamicGet(ShiroPackage.SUBJECT__SESSION, ShiroPackage.Literals.SUBJECT__SESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSession(Session newSession) {
		eDynamicSet(ShiroPackage.SUBJECT__SESSION, ShiroPackage.Literals.SUBJECT__SESSION, newSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ShiroPackage.SUBJECT__ROLES, ShiroPackage.Literals.SUBJECT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eDynamicGet(ShiroPackage.SUBJECT__PERMISSIONS, ShiroPackage.Literals.SUBJECT__PERMISSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.SUBJECT__HOST:
				return getHost();
			case ShiroPackage.SUBJECT__AUTHENTICATED:
				return isAuthenticated();
			case ShiroPackage.SUBJECT__PRINCIPALS:
				return getPrincipals();
			case ShiroPackage.SUBJECT__SESSION:
				return getSession();
			case ShiroPackage.SUBJECT__ROLES:
				return getRoles();
			case ShiroPackage.SUBJECT__PERMISSIONS:
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
			case ShiroPackage.SUBJECT__HOST:
				setHost((String)newValue);
				return;
			case ShiroPackage.SUBJECT__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
				return;
			case ShiroPackage.SUBJECT__PRINCIPALS:
				getPrincipals().clear();
				getPrincipals().addAll((java.util.Collection<? extends Principal>)newValue);
				return;
			case ShiroPackage.SUBJECT__SESSION:
				setSession((Session)newValue);
				return;
			case ShiroPackage.SUBJECT__ROLES:
				getRoles().clear();
				getRoles().addAll((java.util.Collection<? extends Role>)newValue);
				return;
			case ShiroPackage.SUBJECT__PERMISSIONS:
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
			case ShiroPackage.SUBJECT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case ShiroPackage.SUBJECT__AUTHENTICATED:
				setAuthenticated(AUTHENTICATED_EDEFAULT);
				return;
			case ShiroPackage.SUBJECT__PRINCIPALS:
				getPrincipals().clear();
				return;
			case ShiroPackage.SUBJECT__SESSION:
				setSession((Session)null);
				return;
			case ShiroPackage.SUBJECT__ROLES:
				getRoles().clear();
				return;
			case ShiroPackage.SUBJECT__PERMISSIONS:
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
			case ShiroPackage.SUBJECT__HOST:
				return HOST_EDEFAULT == null ? getHost() != null : !HOST_EDEFAULT.equals(getHost());
			case ShiroPackage.SUBJECT__AUTHENTICATED:
				return isAuthenticated() != AUTHENTICATED_EDEFAULT;
			case ShiroPackage.SUBJECT__PRINCIPALS:
				return !getPrincipals().isEmpty();
			case ShiroPackage.SUBJECT__SESSION:
				return getSession() != null;
			case ShiroPackage.SUBJECT__ROLES:
				return !getRoles().isEmpty();
			case ShiroPackage.SUBJECT__PERMISSIONS:
				return !getPermissions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubjectImpl
