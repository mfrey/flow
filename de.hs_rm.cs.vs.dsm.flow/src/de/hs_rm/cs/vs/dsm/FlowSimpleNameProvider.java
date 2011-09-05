package de.hs_rm.cs.vs.dsm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;

import com.google.inject.Inject;

import owl.OWLClass;
import owl.OWLDatatypeProperty;
import owl.OWLObjectProperty;

public class FlowSimpleNameProvider extends SimpleNameProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	/**
	 * The function returns a qualified name for a eobject.
	 * 
	 * @param pObject The object which name should be determined
	 * @return The name of the object
	 */
	@Override
	public QualifiedName getFullyQualifiedName(EObject pObject){
		if(pObject instanceof OWLClass) {
			System.err.println("OWL Class");
			return qualifiedNameConverter.toQualifiedName(((OWLClass)pObject).getLocalName());
		}
		
		if(pObject instanceof OWLObjectProperty) {
			System.err.println("OWL Object Property");
			return qualifiedNameConverter.toQualifiedName(((OWLObjectProperty)pObject).getLocalName());
		}
		
		if(pObject instanceof OWLDatatypeProperty) {
			System.err.println("OWL Datatype Property");
			return qualifiedNameConverter.toQualifiedName(((OWLDatatypeProperty)pObject).getLocalName());
		}
		
		return super.getFullyQualifiedName(pObject);
	}
}
