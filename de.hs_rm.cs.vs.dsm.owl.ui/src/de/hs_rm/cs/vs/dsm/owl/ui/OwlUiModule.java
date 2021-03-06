package de.hs_rm.cs.vs.dsm.owl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

public class OwlUiModule extends EmfUiModule {

	public OwlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
		binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(OwlEditorOpener.class);
	}

}
