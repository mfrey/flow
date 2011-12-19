package de.hs_rm.cs.vs.dsm.uml;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class UmlRuntimeModule extends AbstractGenericResourceRuntimeModule  {
	
	@Override
	protected String getLanguageName() {
		return "org.eclipse.uml2.uml.editor.presentation.UMLEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "uml";
	}

	public Class<UmlResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return UmlResourceDescriptionStrategy.class;
	}

	@Override
	public Class<UmlQualifiedNameProvider> bindIQualifiedNameProvider() {
		return UmlQualifiedNameProvider.class;
	}
}
