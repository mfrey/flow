package owl.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.UnparsableOntologyException;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.OWLOntologyWalker;
import org.semanticweb.owlapi.util.OWLOntologyWalkerVisitor;

import owl.OwlFactory;


/**
 * A resource implementation for loading owl files.
 * 
 * @author Michael Frey
 */
public class OWLResourceImpl extends ResourceImpl {
	protected URI mURI;
	
	public OWLResourceImpl(){
		super();
	}

	public OWLResourceImpl(URI pURI){
		super(pURI);
		this.mURI = pURI;
	}
	
	@Override
	protected void doSave(OutputStream pOutputStream, Map<?, ?> pOptions) throws IOException {
		try {
			final OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		} catch (NoClassDefFoundError e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doLoad(InputStream pInputStream, Map<?, ?> pOptions) throws IOException {
		try {
			// 
			Resource resource = resourceSet.getResource(this.mURI, true);
			
			// Create an instance of the OWL ontology manager
			OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
			// Load the ontology from the input stream
			OWLOntology ontology = manager.loadOntologyFromOntologyDocument(pInputStream);

			this.createOWLClasses(resource, ontology);
			
			this.createOWLObjectProperties(resource, ontology);

			this.createOWLDataTypeProperties(resource, ontology);

			
			// Create a walker for walking through the ontology
			OWLOntologyWalker walker = new OWLOntologyWalker(Collections.singleton(ontology));
			// Create a visitor in order to walk the structure
			OWLOntologyWalkerVisitor<Object> visitor = new OWLOntologyWalkerVisitor<Object>(walker) {
				 public Object visit(OWLClass desc) {
					 System.out.println(desc.toStringID());
					 return null;
				 }
				 
				 public Object visit(OWLObjectProperty desc) {
					 System.out.println(desc.toStringID());
					 return null;
				 }
			};
			// Walk the structure with the visitor
			walker.walkStructure(visitor);
		} catch (UnparsableOntologyException e) {
			e.printStackTrace();
		} catch (OWLOntologyCreationException e) { 
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * 
	 * @param pResource A resource for storing OWL ecore entities
	 * @param pOntology A OWL ontology 
	 */
	public void createOWLClasses(Resource pResource, OWLOntology pOntology){
		// Get the OWL classes which are in the signature of the OWL ontology
		Set<OWLClass> classSet = pOntology.getClassesInSignature();
		// Iterate through the set and add for each class a resource
		for(OWLClass c : classSet){		
			if(!c.toString().equals("owl:Thing")){
				owl.OWLClass owlClass = OwlFactory.eINSTANCE.createOWLClass();
				owlClass.setLocalName(c.toString());
				pResource.getContents().add(owlClass);
			}
		}
	}
	
	/**
	 * 
	 * 
	 * @param pResource A resource for storing OWL ecore entities
	 * @param pOntology A OWL ontology 
	 */
	public void createOWLObjectProperties(Resource pResource, OWLOntology pOntology){
		// Get the OWL object properties which are in the signature of the OWL ontology
		Set<OWLObjectProperty> objectPropertySet = pOntology.getObjectPropertiesInSignature();
		// Iterate through the set and add for each class a resource
		for(OWLObjectProperty p : objectPropertySet){
			if(!p.toString().equals("owl:topObjectProperty")){
				owl.OWLObjectProperty objectProperty = OwlFactory.eINSTANCE.createOWLObjectProperty();
				objectProperty.setLocalName(p.toString());
				pResource.getContents().add(objectProperty);
			}
		}
	}
	
	/**
	 * 
	 * 
	 * @param pResource A resource for storing OWL ecore entities
	 * @param pOntology A OWL ontology 
	 */
	public void createOWLDataTypeProperties(Resource pResource, OWLOntology pOntology){
		// Get the OWL object properties which are in the signature of the OWL ontology
		Set<OWLDataProperty> dataPropertySet = pOntology.getDataPropertiesInSignature();
		// Iterate through the set and add for each class a resource
		for(OWLDataProperty p : dataPropertySet){
			if(!p.toString().equals("owl:topDataProperty")){
				owl.OWLDatatypeProperty datatypeProperty = OwlFactory.eINSTANCE.createOWLDatatypeProperty();
				datatypeProperty.setLocalName(p.toString());
				pResource.getContents().add(datatypeProperty);
			}
		}
	}
}
