package de.hs_rm.cs.vs.dsm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.Import;
import de.hs_rm.cs.vs.dsm.flow.Model;
import de.hs_rm.cs.vs.dsm.flow.OWLTestElement;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamElement;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.TagClassElement;
import de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;
import de.hs_rm.cs.vs.dsm.flow.TestAssign;
import de.hs_rm.cs.vs.dsm.flow.TestElement;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;
import de.hs_rm.cs.vs.dsm.services.FlowGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractFlowSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected FlowGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FlowPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FlowPackage.AVERAGE_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getAverageOperatorRule()) {
					sequence_AverageOperator_AverageOperator(context, (AverageOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.COUNT_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getCountOperatorRule()) {
					sequence_CountOperator_CountOperator(context, (CountOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.ELEMENT_JOIN_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getElementJoinOperatorRule()) {
					sequence_ElementJoinOperator_ElementJoinOperator(context, (ElementJoinOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.IMPORT:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.OWL_TEST_ELEMENT:
				if(context == grammarAccess.getOWLTestElementRule()) {
					sequence_OWLTestElement_OWLTestElement(context, (OWLTestElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.OUTPUT_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getOutputOperatorRule()) {
					sequence_OutputOperator_OutputOperator(context, (OutputOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.OUTPUT_OPERATOR_PARAMETER:
				if(context == grammarAccess.getOutputOperatorParameterRule()) {
					sequence_OutputOperatorParameter_OutputOperatorParameter(context, (OutputOperatorParameter) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_PackageDeclaration_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STANDARD_DEVIATION_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getStandardDeviationOperatorRule()) {
					sequence_StandardDeviationOperator_StandardDeviationOperator(context, (StandardDeviationOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_ACCESS:
				if(context == grammarAccess.getStreamAccessRule()) {
					sequence_StreamAccess_StreamAccess(context, (StreamAccess) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_DECLARATION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamDeclarationRule()) {
					sequence_StreamDeclaration_StreamDeclaration(context, (StreamDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_DEFINITION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamDefinitionRule()) {
					sequence_StreamDefinition_StreamDefinition(context, (StreamDefinition) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_ELEMENT:
				if(context == grammarAccess.getStreamElementRule()) {
					sequence_StreamElement_StreamElement(context, (StreamElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_OPERATOR_PARAMETER:
				if(context == grammarAccess.getStreamOperatorParameterRule()) {
					sequence_StreamOperatorParameter_StreamOperatorParameter(context, (StreamOperatorParameter) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_CLASS_ELEMENT:
				if(context == grammarAccess.getTagElementRule() ||
				   context == grammarAccess.getTagClassElementRule()) {
					sequence_TagClassElement_TagClassElement(context, (TagClassElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_DATA_TYPE_PROPERTY_ELEMENT:
				if(context == grammarAccess.getTagElementRule() ||
				   context == grammarAccess.getTagDataTypePropertyElementRule()) {
					sequence_TagDataTypePropertyElement_TagDataTypePropertyElement(context, (TagDataTypePropertyElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_OBJECT_PROPERTY_ELEMENT:
				if(context == grammarAccess.getTagElementRule() ||
				   context == grammarAccess.getTagObjectPropertyElementRule()) {
					sequence_TagObjectPropertyElement_TagObjectPropertyElement(context, (TagObjectPropertyElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_OPERATOR:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getTagOperatorRule()) {
					sequence_TagOperator_TagOperator(context, (TagOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TEST_ASSIGN:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getTestAssignRule()) {
					sequence_TestAssign_TestAssign(context, (TestAssign) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TEST_ELEMENT:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getTestElementRule()) {
					sequence_TestElement_TestElement(context, (TestElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.WINDOW_OPERATOR:
				if(context == grammarAccess.getBarrierOperatorRule() ||
				   context == grammarAccess.getWindowOperatorRule()) {
					sequence_WindowOperator_WindowOperator(context, (WindowOperator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_AverageOperator_AverageOperator(EObject context, AverageOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.AVERAGE_OPERATOR__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.AVERAGE_OPERATOR__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.AVERAGE_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.AVERAGE_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_CountOperator_CountOperator(EObject context, CountOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.COUNT_OPERATOR__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.COUNT_OPERATOR__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.COUNT_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.COUNT_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (elementParameters+=StreamAccess | variableElementParameters+=[Variable|ID]) 
	 *         elementParameters+=StreamAccess* 
	 *         variableElementParameters+=[Variable|ID]* 
	 *         parameter=StreamOperatorParameter
	 *     )
	 *
	 * Features:
	 *    elementParameters[0, *]
	 *    variableElementParameters[0, *]
	 *    parameter[1, 1]
	 */
	protected void sequence_ElementJoinOperator_ElementJoinOperator(EObject context, ElementJoinOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 *
	 * Features:
	 *    importURI[1, 1]
	 */
	protected void sequence_Import_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     model+=PackageDeclaration+
	 *
	 * Features:
	 *    model[1, *]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     element=[OWLClass|ID]
	 *
	 * Features:
	 *    element[1, 1]
	 */
	protected void sequence_OWLTestElement_OWLTestElement(EObject context, OWLTestElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OWL_TEST_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OWL_TEST_ELEMENT__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOWLTestElementAccess().getElementOWLClassIDTerminalRuleCall_1_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=StreamAccess element+=StreamAccess*)
	 *
	 * Features:
	 *    element[1, *]
	 */
	protected void sequence_OutputOperatorParameter_OutputOperatorParameter(EObject context, OutputOperatorParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=OutputOperatorParameter location=STRING stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    location[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_OutputOperator_OutputOperator(EObject context, OutputOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__LOCATION));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OUTPUT_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getOutputOperatorAccess().getLocationSTRINGTerminalRuleCall_4_0(), semanticObject.getLocation());
		feeder.accept(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ModelElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    elements[0, *]
	 */
	protected void sequence_PackageDeclaration_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_StandardDeviationOperator_StandardDeviationOperator(EObject context, StandardDeviationOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STANDARD_DEVIATION_OPERATOR__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STANDARD_DEVIATION_OPERATOR__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STANDARD_DEVIATION_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STANDARD_DEVIATION_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[StreamDefinition|ID] element=[VariableDeclaration|ID])
	 *
	 * Features:
	 *    reference[1, 1]
	 *    element[1, 1]
	 */
	protected void sequence_StreamAccess_StreamAccess(EObject context, StreamAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_ACCESS__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_ACCESS__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_ACCESS__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_ACCESS__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getStreamAccessAccess().getElementVariableDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=StreamElement+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    elements[1, *]
	 */
	protected void sequence_StreamDeclaration_StreamDeclaration(EObject context, StreamDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[StreamDeclaration|ID] name=ID)
	 *
	 * Features:
	 *    reference[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_StreamDefinition_StreamDefinition(EObject context, StreamDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_DEFINITION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_DEFINITION__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getStreamDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[JvmType|ID] name=ID)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_StreamElement_StreamElement(EObject context, StreamElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_ELEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamElementAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getStreamElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stream=[StreamDefinition|ID] barrier=BarrierOperator?)
	 *
	 * Features:
	 *    stream[1, 1]
	 *    barrier[0, 1]
	 */
	protected void sequence_StreamOperatorParameter_StreamOperatorParameter(EObject context, StreamOperatorParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=StreamAccess element=[OWLClass|STRING])
	 *
	 * Features:
	 *    reference[1, 1]
	 *    element[1, 1]
	 */
	protected void sequence_TagClassElement_TagClassElement(EObject context, TagClassElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_CLASS_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_CLASS_ELEMENT__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getTagClassElementAccess().getElementOWLClassSTRINGTerminalRuleCall_3_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=StreamAccess element=[OWLDatatypeProperty|STRING])
	 *
	 * Features:
	 *    reference[1, 1]
	 *    element[1, 1]
	 */
	protected void sequence_TagDataTypePropertyElement_TagDataTypePropertyElement(EObject context, TagDataTypePropertyElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertySTRINGTerminalRuleCall_3_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=StreamAccess element=[OWLObjectProperty|STRING])
	 *
	 * Features:
	 *    reference[1, 1]
	 *    element[1, 1]
	 */
	protected void sequence_TagObjectPropertyElement_TagObjectPropertyElement(EObject context, TagObjectPropertyElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_ELEMENT__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertySTRINGTerminalRuleCall_3_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=TagElement parameters+=TagElement* stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameters[1, *]
	 *    stream[1, 1]
	 */
	protected void sequence_TagOperator_TagOperator(EObject context, TagOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=[TestElement|ID] right=[TestElement|ID])
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_TestAssign_TestAssign(EObject context, TestAssign semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TEST_ASSIGN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TEST_ASSIGN__LEFT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TEST_ASSIGN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TEST_ASSIGN__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestAssignAccess().getLeftTestElementIDTerminalRuleCall_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTestAssignAccess().getRightTestElementIDTerminalRuleCall_3_0_1(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_TestElement_TestElement(EObject context, TestElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.TEST_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.TEST_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[JvmType|ID] name=ID)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_VariableDeclaration_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((setting='last' value=NUMBER (unit='min' | unit='hrs' | unit='sec' | unit='elements')?) | setting='now')
	 *
	 * Features:
	 *    setting[1, 2]
	 *    value[1, 1]
	 *         EXCLUDE_IF_UNSET setting
	 *         MANDATORY_IF_SET setting
	 *         MANDATORY_IF_SET unit
	 *         MANDATORY_IF_SET unit
	 *         MANDATORY_IF_SET unit
	 *         MANDATORY_IF_SET unit
	 *         EXCLUDE_IF_SET setting
	 *    unit[0, 4]
	 *         EXCLUDE_IF_UNSET setting
	 *         EXCLUDE_IF_UNSET value
	 *         EXCLUDE_IF_SET setting
	 */
	protected void sequence_WindowOperator_WindowOperator(EObject context, WindowOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
