
package de.hs_rm.cs.vs.dsm;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlowStandaloneSetup extends FlowStandaloneSetupGenerated{

	public static void doSetup() {
		new FlowStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	/**
	 * The function registers a service provider for ecore extensions
	 * 
	 * @param pInjector The Guice injector
	 */
	@Override
	public void register(Injector pInjector) {
		super.register(pInjector);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = pInjector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("owl", serviceProvider);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ocl", serviceProvider);
	}
}

