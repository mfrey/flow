package de.hs_rm.cs.vs.dsm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration
import de.hs_rm.cs.vs.dsm.flow.ModelElement
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration

import de.hs_rm.cs.vs.dsm.flow.OutputOperator
import de.hs_rm.cs.vs.dsm.flow.StreamStatement
import de.hs_rm.cs.vs.dsm.flow.JoinOperator
import de.hs_rm.cs.vs.dsm.flow.SplitOperator

import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject
import de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
import de.hs_rm.cs.vs.dsm.flow.StreamAccess

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
                	model.compile
                )
    	}
    }
    
    def compile(PackageDeclaration e) ''' 
      fm = get_instance();
      
      «FOR elements : e.elements»
      	«elements.compile»
      «ENDFOR»
    '''
    
    def compile(ModelElement m)'''
    	«IF m.eClass.name.equals("OutputOperator")»
    	«(m as OutputOperator).compile»
    	«ENDIF»
    	
    	«IF m.eClass.name.equals("StreamStatement")»
    	«(m as StreamStatement).compile»
    	«ENDIF»
	'''
		
	def compile(StreamStatement statement)'''
		«IF statement.expression.eClass.name.equals("JoinOperator")»
		
		«ELSEIF statement.expression.eClass.name.equals("SplitOperator")»
		«write((statement.expression as SplitOperator),statement)»
		«ENDIF»
	'''
	
	def dispatch String write(JoinOperator pOperator, StreamStatement pStatement){
		new JoinOperatorGenerator(
			de::hs_rm::cs::vs::dsm::generator::Util::getInstance.getStreamFrom(pStatement.returnStream),
			pOperator
			).toString()
	}
	
	def dispatch String write(SplitOperator pOperator, StreamStatement pStatement){
		var SplitOperatorGenerator split = new SplitOperatorGenerator(
			pStatement
		)
		
		split.toString()
	}
	
    def compile(OutputOperator output)'''
    	«{
    		val OutputOperatorGenerator o = new OutputOperatorGenerator(output);
    		o.toString();
    	}»
    '''     
}
