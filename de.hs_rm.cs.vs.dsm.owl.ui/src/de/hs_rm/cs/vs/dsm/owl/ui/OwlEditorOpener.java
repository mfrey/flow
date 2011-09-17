package de.hs_rm.cs.vs.dsm.owl.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import owl.presentation.OwlEditor;


public class OwlEditorOpener extends LanguageSpecificURIEditorOpener {

	@Override
	protected void selectAndReveal(IEditorPart openEditor, URI uri,
			EReference crossReference, int indexInList, boolean select) {
		OwlEditor owlEditor = (OwlEditor) openEditor.getAdapter(OwlEditor.class);
		if (owlEditor != null) {
			EObject eObject = owlEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
			owlEditor.setSelectionToViewer(Collections.singletonList(eObject));
		}
	}

}

