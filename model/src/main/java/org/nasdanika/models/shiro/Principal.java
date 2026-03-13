/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Principal#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Principal#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Principal#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getPrincipal()
 * @model
 * @generated
 */
public interface Principal extends EObject {
	/**
	 * Returns the value of the '<em><b>Realm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Name</em>' attribute.
	 * @see #setRealmName(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getPrincipal_RealmName()
	 * @model
	 * @generated
	 */
	String getRealmName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Principal#getRealmName <em>Realm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm Name</em>' attribute.
	 * @see #getRealmName()
	 * @generated
	 */
	void setRealmName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getPrincipal_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Principal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getPrincipal_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Principal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} //Principal
