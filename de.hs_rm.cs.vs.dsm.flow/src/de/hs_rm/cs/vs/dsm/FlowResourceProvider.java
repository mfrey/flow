package de.hs_rm.cs.vs.dsm;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;

/**
 * The resource providers is responsible for resource requests. It determines 
 * if a resource can be loaded. 
 */
public class FlowResourceProvider extends DefaultResourceServiceProvider {
	/**
	 * The function specifies if the language can handle a specific resource.  
	 * 
	 * @param uri The URI of the resource which should be loaded
	 */
	@Override
	public boolean canHandle(URI uri) {
		if (uri.toPlatformString(true).endsWith("owl")) {
			return true;
		} 
		
		if (uri.toPlatformString(true).endsWith("ocl")) {
			return true;
		}
		
		return super.canHandle(uri);
	}
}
