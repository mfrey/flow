package de.hs_rm.cs.vs.dsm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration

import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject

class FlowGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider nameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		/***
		 * Iterate through the elements
		 */
    	for(model : resource.allContentsIterable.filter(typeof(PackageDeclaration))) {
    		    fsa.generateFile(
    		    /** Generate a *.lua file for each package */
                model.fullyQualifiedName.toString.replace(".", "/") + ".lua",
                /** Create the content of the package */
                model.compile)
    	}
    }
    
    def compile(PackageDeclaration e) ''' 
      fm = get_instance();  
    '''
}
