/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Permission#getWildcardString <em>Wildcard String</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Permission#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Wildcard String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard String</em>' attribute.
	 * @see #setWildcardString(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getPermission_WildcardString()
	 * @model id="true"
	 * @generated
	 */
	String getWildcardString();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Permission#getWildcardString <em>Wildcard String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard String</em>' attribute.
	 * @see #getWildcardString()
	 * @generated
	 */
	void setWildcardString(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getPermission_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Permission#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} //Permission
