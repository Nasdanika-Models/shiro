/**
 */
package org.nasdanika.models.shiro;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.Session#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Session#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Session#getStartTimestamp <em>Start Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Session#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.Session#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.shiro.ShiroPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSession_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Session#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSession_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Session#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Start Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Timestamp</em>' attribute.
	 * @see #setStartTimestamp(Date)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSession_StartTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.EDate"
	 * @generated
	 */
	Date getStartTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Session#getStartTimestamp <em>Start Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Timestamp</em>' attribute.
	 * @see #getStartTimestamp()
	 * @generated
	 */
	void setStartTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Last Access Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Access Time</em>' attribute.
	 * @see #setLastAccessTime(Date)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSession_LastAccessTime()
	 * @model dataType="org.eclipse.emf.ecore.EDate"
	 * @generated
	 */
	Date getLastAccessTime();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Session#getLastAccessTime <em>Last Access Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Access Time</em>' attribute.
	 * @see #getLastAccessTime()
	 * @generated
	 */
	void setLastAccessTime(Date value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"1800000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(long)
	 * @see org.nasdanika.models.shiro.ShiroPackage#getSession_Timeout()
	 * @model default="1800000"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.shiro.Session#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

} //Session
