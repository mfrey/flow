package de.hs_rm.cs.vs.dsm.uml;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class UmlSupport extends AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new UmlRuntimeModule();
	}

}