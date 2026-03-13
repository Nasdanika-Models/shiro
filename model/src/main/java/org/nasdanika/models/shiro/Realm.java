/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Realm#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Realm#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Realm#isCachingEnabled <em>Caching Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Realm#isAuthenticationCachingEnabled <em>Authentication Caching Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Realm#isAuthorizationCachingEnabled <em>Authorization Caching Enabled</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm()
 * @model
 * @generated
 */
public interface Realm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Realm#getName <em>Name</em>}' attribute.
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
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Realm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Caching Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caching Enabled</em>' attribute.
	 * @see #setCachingEnabled(boolean)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm_CachingEnabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isCachingEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Realm#isCachingEnabled <em>Caching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Enabled</em>' attribute.
	 * @see #isCachingEnabled()
	 * @generated
	 */
	void setCachingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Authentication Caching Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Caching Enabled</em>' attribute.
	 * @see #setAuthenticationCachingEnabled(boolean)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm_AuthenticationCachingEnabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isAuthenticationCachingEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Realm#isAuthenticationCachingEnabled <em>Authentication Caching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Caching Enabled</em>' attribute.
	 * @see #isAuthenticationCachingEnabled()
	 * @generated
	 */
	void setAuthenticationCachingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Authorization Caching Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Caching Enabled</em>' attribute.
	 * @see #setAuthorizationCachingEnabled(boolean)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getRealm_AuthorizationCachingEnabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isAuthorizationCachingEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Realm#isAuthorizationCachingEnabled <em>Authorization Caching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Caching Enabled</em>' attribute.
	 * @see #isAuthorizationCachingEnabled()
	 * @generated
	 */
	void setAuthorizationCachingEnabled(boolean value);

} //Realm
