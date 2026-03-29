/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.SecurityManager#getRealms <em>Realms</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.SecurityManager#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.SecurityManager#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getSecurityManager()
 * @model
 * @generated
 */
public interface SecurityManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Realms</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Realm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realms</em>' containment reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSecurityManager_Realms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realm> getRealms();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSecurityManager_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSecurityManager_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

} //SecurityManager
