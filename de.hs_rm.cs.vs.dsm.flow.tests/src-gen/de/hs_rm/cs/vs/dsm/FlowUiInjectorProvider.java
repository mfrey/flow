/*
* generated by Xtext
*/
package de.hs_rm.cs.vs.dsm;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FlowUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.hs_rm.cs.vs.dsm.ui.internal.FlowActivator.getInstance().getInjector("de.hs_rm.cs.vs.dsm.Flow");
	}
	
}
