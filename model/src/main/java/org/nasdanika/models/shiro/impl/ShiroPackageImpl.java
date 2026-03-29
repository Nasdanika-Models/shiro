/**
 */
package org.nasdanika.models.shiro.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.shiro.Permission;
import org.nasdanika.models.shiro.Principal;
import org.nasdanika.models.shiro.Realm;
import org.nasdanika.models.shiro.Role;
import org.nasdanika.models.shiro.SecurityManager;
import org.nasdanika.models.shiro.Session;
import org.nasdanika.models.shiro.ShiroFactory;
import org.nasdanika.models.shiro.ShiroPackage;
import org.nasdanika.models.shiro.Subject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShiroPackageImpl extends EPackageImpl implements ShiroPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.shiro.ShiroPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShiroPackageImpl() {
		super(eNS_URI, ShiroFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ShiroPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShiroPackage init() {
		if (isInited) return (ShiroPackage)EPackage.Registry.INSTANCE.getEPackage(ShiroPackage.eNS_URI);

		Object registeredShiroPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ShiroPackageImpl theShiroPackage = registeredShiroPackage instanceof ShiroPackageImpl ? (ShiroPackageImpl)registeredShiroPackage : new ShiroPackageImpl();

		isInited = true;

		theShiroPackage.createPackageContents();
		theShiroPackage.initializePackageContents();
		theShiroPackage.freeze();

		EPackage.Registry.INSTANCE.put(ShiroPackage.eNS_URI, theShiroPackage);
		return theShiroPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityManager() {
		return securityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityManager_Realms() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityManager_Roles() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityManager_Permissions() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_Host() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_Authenticated() {
		return (EAttribute)subjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Principals() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Session() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Roles() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Permissions() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrincipal_RealmName() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrincipal_Value() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrincipal_Type() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Permissions() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_WildcardString() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Description() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealm() {
		return realmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealm_Name() {
		return (EAttribute)realmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealm_Description() {
		return (EAttribute)realmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealm_CachingEnabled() {
		return (EAttribute)realmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealm_AuthenticationCachingEnabled() {
		return (EAttribute)realmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRealm_AuthorizationCachingEnabled() {
		return (EAttribute)realmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Id() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Host() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_StartTimestamp() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_LastAccessTime() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSession_Timeout() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShiroFactory getShiroFactory() {
		return (ShiroFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		securityManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(securityManagerEClass, SECURITY_MANAGER__REALMS);
		createEReference(securityManagerEClass, SECURITY_MANAGER__ROLES);
		createEReference(securityManagerEClass, SECURITY_MANAGER__PERMISSIONS);

		subjectEClass = createEClass(SUBJECT);
		createEAttribute(subjectEClass, SUBJECT__HOST);
		createEAttribute(subjectEClass, SUBJECT__AUTHENTICATED);
		createEReference(subjectEClass, SUBJECT__PRINCIPALS);
		createEReference(subjectEClass, SUBJECT__SESSION);
		createEReference(subjectEClass, SUBJECT__ROLES);
		createEReference(subjectEClass, SUBJECT__PERMISSIONS);

		principalEClass = createEClass(PRINCIPAL);
		createEAttribute(principalEClass, PRINCIPAL__REALM_NAME);
		createEAttribute(principalEClass, PRINCIPAL__VALUE);
		createEAttribute(principalEClass, PRINCIPAL__TYPE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);
		createEReference(roleEClass, ROLE__PERMISSIONS);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__WILDCARD_STRING);
		createEAttribute(permissionEClass, PERMISSION__DESCRIPTION);

		realmEClass = createEClass(REALM);
		createEAttribute(realmEClass, REALM__NAME);
		createEAttribute(realmEClass, REALM__DESCRIPTION);
		createEAttribute(realmEClass, REALM__CACHING_ENABLED);
		createEAttribute(realmEClass, REALM__AUTHENTICATION_CACHING_ENABLED);
		createEAttribute(realmEClass, REALM__AUTHORIZATION_CACHING_ENABLED);

		sessionEClass = createEClass(SESSION);
		createEAttribute(sessionEClass, SESSION__ID);
		createEAttribute(sessionEClass, SESSION__HOST);
		createEAttribute(sessionEClass, SESSION__START_TIMESTAMP);
		createEAttribute(sessionEClass, SESSION__LAST_ACCESS_TIME);
		createEAttribute(sessionEClass, SESSION__TIMEOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize classes, features, and operations; add parameters
		initEClass(securityManagerEClass, SecurityManager.class, "SecurityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Realms(), this.getRealm(), null, "realms", null, 0, -1, SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Roles(), this.getRole(), null, "roles", null, 0, -1, SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityManager_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubject_Host(), ecorePackage.getEString(), "host", null, 0, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubject_Authenticated(), ecorePackage.getEBoolean(), "authenticated", "false", 0, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Principals(), this.getPrincipal(), null, "principals", null, 0, -1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Session(), this.getSession(), null, "session", null, 0, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Roles(), this.getRole(), null, "roles", null, 0, -1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principalEClass, Principal.class, "Principal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrincipal_RealmName(), ecorePackage.getEString(), "realmName", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Value(), ecorePackage.getEString(), "value", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Type(), ecorePackage.getEString(), "type", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_WildcardString(), ecorePackage.getEString(), "wildcardString", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Description(), ecorePackage.getEString(), "description", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realmEClass, Realm.class, "Realm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealm_Description(), ecorePackage.getEString(), "description", null, 0, 1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealm_CachingEnabled(), ecorePackage.getEBoolean(), "cachingEnabled", "true", 0, 1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealm_AuthenticationCachingEnabled(), ecorePackage.getEBoolean(), "authenticationCachingEnabled", "false", 0, 1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealm_AuthorizationCachingEnabled(), ecorePackage.getEBoolean(), "authorizationCachingEnabled", "true", 0, 1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSession_Id(), ecorePackage.getEString(), "id", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_Host(), ecorePackage.getEString(), "host", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_StartTimestamp(), ecorePackage.getEDate(), "startTimestamp", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_LastAccessTime(), ecorePackage.getEDate(), "lastAccessTime", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_Timeout(), ecorePackage.getELong(), "timeout", "1800000", 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ShiroPackageImpl
