package de.hs_rm.cs.vs.dsm;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlowStandaloneSetup extends FlowStandaloneSetupGenerated{

	public static void doSetup() {
		new FlowStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

