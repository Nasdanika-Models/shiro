/**
 */
package org.nasdanika.models.shiro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.shiro.ShiroFactory
 * @model kind="package"
 * @generated
 */
public interface ShiroPackage extends EPackage {
String eNAME = "shiro";
String eNS_URI = "ecore://nasdanika.org/models/shiro";
String eNS_PREFIX = "org.nasdanika.models.shiro";

ShiroPackage eINSTANCE = org.nasdanika.models.shiro.impl.ShiroPackageImpl.init();

int SECURITY_MANAGER = 0;
int SECURITY_MANAGER__REALMS = 0;
int SECURITY_MANAGER__ROLES = 1;
int SECURITY_MANAGER__PERMISSIONS = 2;
int SECURITY_MANAGER_FEATURE_COUNT = 3;
int SECURITY_MANAGER_OPERATION_COUNT = 0;

int SUBJECT = 1;
int SUBJECT__HOST = 0;
int SUBJECT__AUTHENTICATED = 1;
int SUBJECT__PRINCIPALS = 2;
int SUBJECT__SESSION = 3;
int SUBJECT__ROLES = 4;
int SUBJECT__PERMISSIONS = 5;
int SUBJECT_FEATURE_COUNT = 6;
int SUBJECT_OPERATION_COUNT = 0;

int PRINCIPAL = 2;
int PRINCIPAL__REALM_NAME = 0;
int PRINCIPAL__VALUE = 1;
int PRINCIPAL__TYPE = 2;
int PRINCIPAL_FEATURE_COUNT = 3;
int PRINCIPAL_OPERATION_COUNT = 0;

int ROLE = 3;
int ROLE__NAME = 0;
int ROLE__DESCRIPTION = 1;
int ROLE__PERMISSIONS = 2;
int ROLE_FEATURE_COUNT = 3;
int ROLE_OPERATION_COUNT = 0;

int PERMISSION = 4;
int PERMISSION__WILDCARD_STRING = 0;
int PERMISSION__DESCRIPTION = 1;
int PERMISSION_FEATURE_COUNT = 2;
int PERMISSION_OPERATION_COUNT = 0;

int REALM = 5;
int REALM__NAME = 0;
int REALM__DESCRIPTION = 1;
int REALM__CACHING_ENABLED = 2;
int REALM__AUTHENTICATION_CACHING_ENABLED = 3;
int REALM__AUTHORIZATION_CACHING_ENABLED = 4;
int REALM_FEATURE_COUNT = 5;
int REALM_OPERATION_COUNT = 0;

int SESSION = 6;
int SESSION__ID = 0;
int SESSION__HOST = 1;
int SESSION__START_TIMESTAMP = 2;
int SESSION__LAST_ACCESS_TIME = 3;
int SESSION__TIMEOUT = 4;
int SESSION_FEATURE_COUNT = 5;
int SESSION_OPERATION_COUNT = 0;

EClass getSecurityManager();
EReference getSecurityManager_Realms();
EReference getSecurityManager_Roles();
EReference getSecurityManager_Permissions();

EClass getSubject();
EAttribute getSubject_Host();
EAttribute getSubject_Authenticated();
EReference getSubject_Principals();
EReference getSubject_Session();
EReference getSubject_Roles();
EReference getSubject_Permissions();

EClass getPrincipal();
EAttribute getPrincipal_RealmName();
EAttribute getPrincipal_Value();
EAttribute getPrincipal_Type();

EClass getRole();
EAttribute getRole_Name();
EAttribute getRole_Description();
EReference getRole_Permissions();

EClass getPermission();
EAttribute getPermission_WildcardString();
EAttribute getPermission_Description();

EClass getRealm();
EAttribute getRealm_Name();
EAttribute getRealm_Description();
EAttribute getRealm_CachingEnabled();
EAttribute getRealm_AuthenticationCachingEnabled();
EAttribute getRealm_AuthorizationCachingEnabled();

EClass getSession();
EAttribute getSession_Id();
EAttribute getSession_Host();
EAttribute getSession_StartTimestamp();
EAttribute getSession_LastAccessTime();
EAttribute getSession_Timeout();

ShiroFactory getShiroFactory();

interface Literals {
EClass SECURITY_MANAGER = eINSTANCE.getSecurityManager();
EReference SECURITY_MANAGER__REALMS = eINSTANCE.getSecurityManager_Realms();
EReference SECURITY_MANAGER__ROLES = eINSTANCE.getSecurityManager_Roles();
EReference SECURITY_MANAGER__PERMISSIONS = eINSTANCE.getSecurityManager_Permissions();

EClass SUBJECT = eINSTANCE.getSubject();
EAttribute SUBJECT__HOST = eINSTANCE.getSubject_Host();
EAttribute SUBJECT__AUTHENTICATED = eINSTANCE.getSubject_Authenticated();
EReference SUBJECT__PRINCIPALS = eINSTANCE.getSubject_Principals();
EReference SUBJECT__SESSION = eINSTANCE.getSubject_Session();
EReference SUBJECT__ROLES = eINSTANCE.getSubject_Roles();
EReference SUBJECT__PERMISSIONS = eINSTANCE.getSubject_Permissions();

EClass PRINCIPAL = eINSTANCE.getPrincipal();
EAttribute PRINCIPAL__REALM_NAME = eINSTANCE.getPrincipal_RealmName();
EAttribute PRINCIPAL__VALUE = eINSTANCE.getPrincipal_Value();
EAttribute PRINCIPAL__TYPE = eINSTANCE.getPrincipal_Type();

EClass ROLE = eINSTANCE.getRole();
EAttribute ROLE__NAME = eINSTANCE.getRole_Name();
EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();
EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

EClass PERMISSION = eINSTANCE.getPermission();
EAttribute PERMISSION__WILDCARD_STRING = eINSTANCE.getPermission_WildcardString();
EAttribute PERMISSION__DESCRIPTION = eINSTANCE.getPermission_Description();

EClass REALM = eINSTANCE.getRealm();
EAttribute REALM__NAME = eINSTANCE.getRealm_Name();
EAttribute REALM__DESCRIPTION = eINSTANCE.getRealm_Description();
EAttribute REALM__CACHING_ENABLED = eINSTANCE.getRealm_CachingEnabled();
EAttribute REALM__AUTHENTICATION_CACHING_ENABLED = eINSTANCE.getRealm_AuthenticationCachingEnabled();
EAttribute REALM__AUTHORIZATION_CACHING_ENABLED = eINSTANCE.getRealm_AuthorizationCachingEnabled();

EClass SESSION = eINSTANCE.getSession();
EAttribute SESSION__ID = eINSTANCE.getSession_Id();
EAttribute SESSION__HOST = eINSTANCE.getSession_Host();
EAttribute SESSION__START_TIMESTAMP = eINSTANCE.getSession_StartTimestamp();
EAttribute SESSION__LAST_ACCESS_TIME = eINSTANCE.getSession_LastAccessTime();
EAttribute SESSION__TIMEOUT = eINSTANCE.getSession_Timeout();
}

} //ShiroPackage
