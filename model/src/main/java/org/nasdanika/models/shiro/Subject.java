/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Subject#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Subject#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Subject#getPrincipals <em>Principals</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Subject#getSession <em>Session</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Subject#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Subject#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Subject#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #setAuthenticated(boolean)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Authenticated()
	 * @model default="false"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Subject#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #isAuthenticated()
	 * @generated
	 */
	void setAuthenticated(boolean value);

	/**
	 * Returns the value of the '<em><b>Principals</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principals</em>' containment reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Principals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Principal> getPrincipals();

	/**
	 * Returns the value of the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' containment reference.
	 * @see #setSession(Session)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Session()
	 * @model containment="true"
	 * @generated
	 */
	Session getSession();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Subject#getSession <em>Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' containment reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(Session value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.shiro.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSubject_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permission> getPermissions();

} //Subject
