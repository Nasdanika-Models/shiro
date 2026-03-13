/**
 */
package org.nasdanika.models.shiro.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.shiro.Session;
import org.nasdanika.models.shiro.ShiroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.shiro.impl.SessionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SessionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SessionImpl#getStartTimestamp <em>Start Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SessionImpl#getLastAccessTime <em>Last Access Time</em>}</li>
 *   <li>{@link org.nasdanika.models.shiro.impl.SessionImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartTimestamp() <em>Start Timestamp</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIMESTAMP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastAccessTime() <em>Last Access Time</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ACCESS_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_EDEFAULT = 1800000L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShiroPackage.Literals.SESSION;
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
	public String getId() {
		return (String)eDynamicGet(ShiroPackage.SESSION__ID, ShiroPackage.Literals.SESSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(ShiroPackage.SESSION__ID, ShiroPackage.Literals.SESSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return (String)eDynamicGet(ShiroPackage.SESSION__HOST, ShiroPackage.Literals.SESSION__HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		eDynamicSet(ShiroPackage.SESSION__HOST, ShiroPackage.Literals.SESSION__HOST, newHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartTimestamp() {
		return (Date)eDynamicGet(ShiroPackage.SESSION__START_TIMESTAMP, ShiroPackage.Literals.SESSION__START_TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTimestamp(Date newStartTimestamp) {
		eDynamicSet(ShiroPackage.SESSION__START_TIMESTAMP, ShiroPackage.Literals.SESSION__START_TIMESTAMP, newStartTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastAccessTime() {
		return (Date)eDynamicGet(ShiroPackage.SESSION__LAST_ACCESS_TIME, ShiroPackage.Literals.SESSION__LAST_ACCESS_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessTime(Date newLastAccessTime) {
		eDynamicSet(ShiroPackage.SESSION__LAST_ACCESS_TIME, ShiroPackage.Literals.SESSION__LAST_ACCESS_TIME, newLastAccessTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeout() {
		return (Long)eDynamicGet(ShiroPackage.SESSION__TIMEOUT, ShiroPackage.Literals.SESSION__TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(long newTimeout) {
		eDynamicSet(ShiroPackage.SESSION__TIMEOUT, ShiroPackage.Literals.SESSION__TIMEOUT, newTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShiroPackage.SESSION__ID:
				return getId();
			case ShiroPackage.SESSION__HOST:
				return getHost();
			case ShiroPackage.SESSION__START_TIMESTAMP:
				return getStartTimestamp();
			case ShiroPackage.SESSION__LAST_ACCESS_TIME:
				return getLastAccessTime();
			case ShiroPackage.SESSION__TIMEOUT:
				return getTimeout();
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
			case ShiroPackage.SESSION__ID:
				setId((String)newValue);
				return;
			case ShiroPackage.SESSION__HOST:
				setHost((String)newValue);
				return;
			case ShiroPackage.SESSION__START_TIMESTAMP:
				setStartTimestamp((Date)newValue);
				return;
			case ShiroPackage.SESSION__LAST_ACCESS_TIME:
				setLastAccessTime((Date)newValue);
				return;
			case ShiroPackage.SESSION__TIMEOUT:
				setTimeout((Long)newValue);
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
			case ShiroPackage.SESSION__ID:
				setId(ID_EDEFAULT);
				return;
			case ShiroPackage.SESSION__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case ShiroPackage.SESSION__START_TIMESTAMP:
				setStartTimestamp(START_TIMESTAMP_EDEFAULT);
				return;
			case ShiroPackage.SESSION__LAST_ACCESS_TIME:
				setLastAccessTime(LAST_ACCESS_TIME_EDEFAULT);
				return;
			case ShiroPackage.SESSION__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case ShiroPackage.SESSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case ShiroPackage.SESSION__HOST:
				return HOST_EDEFAULT == null ? getHost() != null : !HOST_EDEFAULT.equals(getHost());
			case ShiroPackage.SESSION__START_TIMESTAMP:
				return START_TIMESTAMP_EDEFAULT == null ? getStartTimestamp() != null : !START_TIMESTAMP_EDEFAULT.equals(getStartTimestamp());
			case ShiroPackage.SESSION__LAST_ACCESS_TIME:
				return LAST_ACCESS_TIME_EDEFAULT == null ? getLastAccessTime() != null : !LAST_ACCESS_TIME_EDEFAULT.equals(getLastAccessTime());
			case ShiroPackage.SESSION__TIMEOUT:
				return getTimeout() != TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SessionImpl
