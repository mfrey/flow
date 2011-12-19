package de.hs_rm.cs.vs.dsm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration
import de.hs_rm.cs.vs.dsm.flow.ModelElement
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration

import de.hs_rm.cs.vs.dsm.flow.VariableDefinition

import de.hs_rm.cs.vs.dsm.flow.InputOperator
import de.hs_rm.cs.vs.dsm.flow.OutputOperator
import de.hs_rm.cs.vs.dsm.flow.LogOperator
import de.hs_rm.cs.vs.dsm.flow.RandomOperator

import de.hs_rm.cs.vs.dsm.flow.TagOperator
import de.hs_rm.cs.vs.dsm.flow.UnTagOperator
import de.hs_rm.cs.vs.dsm.flow.SWRLOperator
import de.hs_rm.cs.vs.dsm.flow.SPARQLOperator
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator

import de.hs_rm.cs.vs.dsm.flow.StreamStatement

import de.hs_rm.cs.vs.dsm.flow.CountOperator
import de.hs_rm.cs.vs.dsm.flow.AverageOperator
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator

import de.hs_rm.cs.vs.dsm.flow.JoinOperator
import de.hs_rm.cs.vs.dsm.flow.SplitOperator
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator

import de.hs_rm.cs.vs.dsm.flow.FilterOperator


import de.hs_rm.cs.vs.dsm.flow.AdditionOperator
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator
import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator
import de.hs_rm.cs.vs.dsm.flow.DivisionOperator
import de.hs_rm.cs.vs.dsm.flow.ModuloOperator

import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject
import de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
import de.hs_rm.cs.vs.dsm.flow.StreamAccess

class FlowGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider nameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		/** Iterate through the elements */
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
      «{ Util::instance.startOperators }»
      «{ Util::instance.stopOperators }»
      «{ Util::instance.clearNetwork }»
    '''
    
    def compile(ModelElement m)'''  	
    	«IF m.eClass.name.equals("StreamStatement")»
    	«(m as StreamStatement).compile»
    	«ENDIF»
	'''
		
	def compile(StreamStatement statement)'''
		«IF statement.operator.eClass.name.equals("JoinOperator")»
		«write((statement.operator as JoinOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("SplitOperator")»			
		«write((statement.operator as SplitOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("CountOperator")»
		«write((statement.operator as CountOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("AverageOperator")»
		«write((statement.operator as AverageOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("StandardDeviationOperator")»
		«write((statement.operator as StandardDeviationOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("ElementJoinOperator")»
		«write((statement.operator as ElementJoinOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("AdditionOperator")»
		«write((statement.operator as AdditionOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("SubtractionOperator")»
		«write((statement.operator as SubtractionOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("MultiplicationOperator")»
		«write((statement.operator as MultiplicationOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("DivisionOperator")»
		«write((statement.operator as DivisionOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("FilterOperator")»
		«write((statement.operator as FilterOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("InputOperator")»
		«write((statement.operator as InputOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("LogOperator")»
		«write((statement.operator as LogOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("RandomOperator")»
		«write((statement.operator as RandomOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("DecisionTreeOperator")»
		«write((statement.operator as DecisionTreeOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("ModuloOperator")»
		«write((statement.operator as ModuloOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("OutputOperator")»
		«write((statement.operator as OutputOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("TagOperator")»
		«write((statement.operator as TagOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("UnTagOperator")»
		«write((statement.operator as UnTagOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("SPARQLOperator")»
		«write((statement.operator as SPARQLOperator),statement)»
		«ELSEIF statement.operator.eClass.name.equals("SWRLOperator")»
		«write((statement.operator as SWRLOperator),statement)»
		«ENDIF»
	'''

	
	def dispatch String write(JoinOperator pOperator, StreamStatement pStatement){
		var JoinOperatorGenerator join = new JoinOperatorGenerator(
			pStatement
		)	
		join.toString()
	}
	
	def dispatch String write(SplitOperator pOperator, StreamStatement pStatement){
		var SplitOperatorGenerator split = new SplitOperatorGenerator(
			pStatement
		)	
		split.toString()
	}
	
	def dispatch String write(AdditionOperator pOperator, StreamStatement pStatement){
		var AdditionOperatorGenerator addition = new AdditionOperatorGenerator(
			pStatement
		)	
		addition.toString()
	}
	
	def dispatch String write(MultiplicationOperator pOperator, StreamStatement pStatement){
		var MultiplicationOperatorGenerator multiplication = new MultiplicationOperatorGenerator(
			pStatement
		)	
		multiplication.toString()
	}
	
	def dispatch String write(SubtractionOperator pOperator, StreamStatement pStatement){
		var SubtractionOperatorGenerator subtraction = new SubtractionOperatorGenerator(
			pStatement
		)	
		subtraction.toString()
	}
	
	def dispatch String write(DivisionOperator pOperator, StreamStatement pStatement){
		var DivisionOperatorGenerator division = new DivisionOperatorGenerator(
			pStatement
		)	
		division.toString()
	}
	
	def dispatch String write(ElementJoinOperator pOperator, StreamStatement pStatement){
		var ElementJoinOperatorGenerator split = new ElementJoinOperatorGenerator(
			pStatement
		)	
		split.toString()
	}
	
	def dispatch String write(CountOperator pOperator, StreamStatement pStatement){
		var CountOperatorGenerator count = new CountOperatorGenerator(
			pStatement
		)
		count.toString()
	}
	
	def dispatch String write(AverageOperator pOperator, StreamStatement pStatement){
		var AverageOperatorGenerator average = new AverageOperatorGenerator(
			pStatement
		)
		average.toString()
	}
	
	def dispatch String write(StandardDeviationOperator pOperator, StreamStatement pStatement){
		var StandardDeviationOperatorGenerator std = new StandardDeviationOperatorGenerator(
			pStatement
		)
		std.toString()
	}
	
	def dispatch String write(InputOperator pOperator, StreamStatement pStatement){
		var InputOperatorGenerator in = new InputOperatorGenerator(
			pStatement
		)
		in.toString()
	}
	
    def dispatch String write(OutputOperator output, StreamStatement pStatement){
    	var OutputOperatorGenerator o = new OutputOperatorGenerator(
    		pStatement
    	)
    	o.toString();
    }  
    
    def dispatch String write(LogOperator pOperator, StreamStatement pStatement){
		var LogOperatorGenerator log = new LogOperatorGenerator(
			pStatement
		)
		log.toString()
	}
	
	def dispatch String write(RandomOperator pOperator, StreamStatement pStatement){
		var RandomOperatorGenerator rand = new RandomOperatorGenerator(
			pStatement
		)
		rand.toString()
	}
    
    def dispatch String write(FilterOperator pOperator, StreamStatement pStatement){
		var FilterOperatorGenerator filter = new FilterOperatorGenerator(
			pStatement
		)
		filter.toString()
	}   
	
	def dispatch String write(DecisionTreeOperator pOperator, StreamStatement pStatement){
		var DecisionTreeOperatorGenerator dtree = new DecisionTreeOperatorGenerator(
			pStatement
		)
		dtree.toString()
	}
	
	def dispatch String write(ModuloOperator pOperator, StreamStatement pStatement){
		var ModuloOperatorGenerator modulo = new ModuloOperatorGenerator(
			pStatement
		)	
		modulo.toString()
	}
	
	def dispatch String write(TagOperator pOperator, StreamStatement pStatement){
		var TagOperatorGenerator tag = new TagOperatorGenerator(
			pStatement
		)	
		tag.toString()
	}
	
	def dispatch String write(UnTagOperator pOperator, StreamStatement pStatement){
		var UnTagOperatorGenerator untag = new UnTagOperatorGenerator(
			pStatement
		)	
		untag.toString()
	}
	
		
	def dispatch String write(SPARQLOperator pOperator, StreamStatement pStatement){
		var SPARQLOperatorGenerator sparql = new SPARQLOperatorGenerator(
			pStatement
		)	
		sparql.toString()
	}
	
	def dispatch String write(SWRLOperator pOperator, StreamStatement pStatement){
		var SWRLOperatorGenerator swrl = new SWRLOperatorGenerator(
			pStatement
		)	
		swrl.toString()
	}
}
