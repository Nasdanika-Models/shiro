import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.shiro.util.ShiroEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.shiro {
	exports org.nasdanika.models.shiro;
	exports org.nasdanika.models.shiro.impl;
	exports org.nasdanika.models.shiro.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with ShiroEPackageResourceSetCapabilityFactory;
	
}
