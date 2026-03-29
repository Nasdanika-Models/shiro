/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Role#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Role#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Role#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRole_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRole_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Role#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRole_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permission> getPermissions();

} //Role
