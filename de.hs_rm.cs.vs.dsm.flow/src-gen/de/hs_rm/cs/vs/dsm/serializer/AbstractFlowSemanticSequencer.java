package de.hs_rm.cs.vs.dsm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.hs_rm.cs.vs.dsm.flow.AdditionOperator;
import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.BooleanDataType;
import de.hs_rm.cs.vs.dsm.flow.BooleanOperation;
import de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute;
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator;
import de.hs_rm.cs.vs.dsm.flow.Div;
import de.hs_rm.cs.vs.dsm.flow.DivisionOperator;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.FloatDataType;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.Import;
import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.LogOperator;
import de.hs_rm.cs.vs.dsm.flow.MarkerOperator;
import de.hs_rm.cs.vs.dsm.flow.MatchOperator;
import de.hs_rm.cs.vs.dsm.flow.Minus;
import de.hs_rm.cs.vs.dsm.flow.Model;
import de.hs_rm.cs.vs.dsm.flow.ModuloOperator;
import de.hs_rm.cs.vs.dsm.flow.Multi;
import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.Plus;
import de.hs_rm.cs.vs.dsm.flow.QueryTagOperator;
import de.hs_rm.cs.vs.dsm.flow.RandomOperator;
import de.hs_rm.cs.vs.dsm.flow.Rule;
import de.hs_rm.cs.vs.dsm.flow.SPARQLOperator;
import de.hs_rm.cs.vs.dsm.flow.SWRLOperator;
import de.hs_rm.cs.vs.dsm.flow.SWRLRule;
import de.hs_rm.cs.vs.dsm.flow.SparqlQuery;
import de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement;
import de.hs_rm.cs.vs.dsm.flow.StringDataType;
import de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StructureDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StructureElements;
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator;
import de.hs_rm.cs.vs.dsm.flow.TagClassElement;
import de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;
import de.hs_rm.cs.vs.dsm.flow.UnTagElement;
import de.hs_rm.cs.vs.dsm.flow.UnTagOperator;
import de.hs_rm.cs.vs.dsm.flow.VariableCall;
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
			case FlowPackage.ADDITION_OPERATOR:
				if(context == grammarAccess.getAdditionOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_AdditionOperator(context, (AdditionOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.AVERAGE_OPERATOR:
				if(context == grammarAccess.getAverageOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_AverageOperator(context, (AverageOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.BOOLEAN_DATA_TYPE:
				if(context == grammarAccess.getBooleanDataTypeRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getSimpleDataTypeRule()) {
					sequence_DataType(context, (BooleanDataType) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.BOOLEAN_OPERATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_And(context, (BooleanOperation) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.BOOLEAN_VARIABLE_DEFINITION:
				if(context == grammarAccess.getBooleanVariableDefinitionRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getVariableDefinitionRule()) {
					sequence_BooleanVariableDefinition(context, (BooleanVariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.COUNT_OPERATOR:
				if(context == grammarAccess.getCountOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_CountOperator(context, (CountOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.DECISION_TREE_ATTRIBUTE:
				if(context == grammarAccess.getDecisionTreeAttributeRule()) {
					sequence_DecisionTreeAttribute(context, (DecisionTreeAttribute) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.DECISION_TREE_OPERATOR:
				if(context == grammarAccess.getDecisionTreeOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_DecisionTreeOperator(context, (DecisionTreeOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.DIVISION_OPERATOR:
				if(context == grammarAccess.getDivisionOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_DivisionOperator(context, (DivisionOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.ELEMENT_JOIN_OPERATOR:
				if(context == grammarAccess.getElementJoinOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_ElementJoinOperator(context, (ElementJoinOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.FILTER_OPERATOR:
				if(context == grammarAccess.getFilterOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_FilterOperator(context, (FilterOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.FLOAT_DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFloatDataTypeRule() ||
				   context == grammarAccess.getSimpleDataTypeRule()) {
					sequence_DataType(context, (FloatDataType) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.IMPORT:
				if(context == grammarAccess.getImportRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.INPUT_OPERATOR:
				if(context == grammarAccess.getInputOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_InputOperator(context, (InputOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.INTEGER_DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getIntegerDataTypeRule() ||
				   context == grammarAccess.getSimpleDataTypeRule()) {
					sequence_DataType(context, (IntegerDataType) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.JOIN_OPERATOR:
				if(context == grammarAccess.getJoinOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_JoinOperator(context, (JoinOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.LOG_OPERATOR:
				if(context == grammarAccess.getLogOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_LogOperator(context, (LogOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MARKER_OPERATOR:
				if(context == grammarAccess.getBarrierOperatorRule() ||
				   context == grammarAccess.getMarkerOperatorRule()) {
					sequence_MarkerOperator(context, (MarkerOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MATCH_OPERATOR:
				if(context == grammarAccess.getMatchOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_MatchOperator(context, (MatchOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MODULO_OPERATOR:
				if(context == grammarAccess.getModuloOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_ModuloOperator(context, (ModuloOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MULTIPLICATION_OPERATOR:
				if(context == grammarAccess.getMultiplicationOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_MultiplicationOperator(context, (MultiplicationOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.NUMBER_VARIABLE_DEFINITION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getNumberVariableDefinitionRule() ||
				   context == grammarAccess.getVariableDefinitionRule()) {
					sequence_NumberVariableDefinition(context, (NumberVariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.OUTPUT_OPERATOR:
				if(context == grammarAccess.getNoReturnTypeOperatorRule() ||
				   context == grammarAccess.getOutputOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_OutputOperator(context, (OutputOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.QUERY_TAG_OPERATOR:
				if(context == grammarAccess.getQueryTagOperatorRule()) {
					sequence_QueryTagOperator(context, (QueryTagOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.RANDOM_OPERATOR:
				if(context == grammarAccess.getRandomOperatorRule() ||
				   context == grammarAccess.getReturnTypeOperatorRule()) {
					sequence_RandomOperator(context, (RandomOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SPARQL_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getSPARQLOperatorRule()) {
					sequence_SPARQLOperator(context, (SPARQLOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SWRL_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getSWRLOperatorRule()) {
					sequence_SWRLOperator(context, (SWRLOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SWRL_RULE:
				if(context == grammarAccess.getSWRLRuleRule()) {
					sequence_SWRLRule(context, (SWRLRule) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SPARQL_QUERY:
				if(context == grammarAccess.getSparqlQueryRule()) {
					sequence_SparqlQuery(context, (SparqlQuery) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SPARQL_QUERY_VARIABLE:
				if(context == grammarAccess.getSparqlQueryVariableRule()) {
					sequence_SparqlQueryVariable(context, (SparqlQueryVariable) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SPLIT_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getSplitOperatorRule()) {
					sequence_SplitOperator(context, (SplitOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STANDARD_DEVIATION_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getStandardDeviationOperatorRule()) {
					sequence_StandardDeviationOperator(context, (StandardDeviationOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_ACCESS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (StreamAccess) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamAccessRule()) {
					sequence_StreamAccess(context, (StreamAccess) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_DECLARATION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamDeclarationRule()) {
					sequence_StreamDeclaration(context, (StreamDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_DECLARATION_ACCESS:
				if(context == grammarAccess.getStreamDeclarationAccessRule()) {
					sequence_StreamDeclarationAccess(context, (StreamDeclarationAccess) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_DEFINITION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamDefinitionRule()) {
					sequence_StreamDefinition(context, (StreamDefinition) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_OPERATOR_PARAMETER:
				if(context == grammarAccess.getStreamOperatorParameterRule()) {
					sequence_StreamOperatorParameter(context, (StreamOperatorParameter) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_STATEMENT:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStreamStatementRule()) {
					sequence_StreamStatement(context, (StreamStatement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM_VARIABLE_STATEMENT:
				if(context == grammarAccess.getStreamVariableStatementRule()) {
					sequence_StreamVariableStatement(context, (StreamVariableStatement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STRING_DATA_TYPE:
				if(context == grammarAccess.getComplexDataTypeRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getStringDataTypeRule()) {
					sequence_DataType(context, (StringDataType) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STRING_VARIABLE_DEFINITION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStringVariableDefinitionRule() ||
				   context == grammarAccess.getVariableDefinitionRule()) {
					sequence_StringVariableDefinition(context, (StringVariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STRUCTURE_DECLARATION:
				if(context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getStructureDeclarationRule()) {
					sequence_StructureDeclaration(context, (StructureDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STRUCTURE_ELEMENTS:
				if(context == grammarAccess.getStreamElementRule() ||
				   context == grammarAccess.getStructureElementsRule()) {
					sequence_StructureElements(context, (StructureElements) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.SUBTRACTION_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getSubtractionOperatorRule()) {
					sequence_SubtractionOperator(context, (SubtractionOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_CLASS_ELEMENT:
				if(context == grammarAccess.getTagClassElementRule() ||
				   context == grammarAccess.getTagElementRule()) {
					sequence_TagClassElement(context, (TagClassElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_DATA_TYPE_PROPERTY_ELEMENT:
				if(context == grammarAccess.getTagDataTypePropertyElementRule() ||
				   context == grammarAccess.getTagElementRule()) {
					sequence_TagDataTypePropertyElement(context, (TagDataTypePropertyElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_OBJECT_PROPERTY_ELEMENT:
				if(context == grammarAccess.getTagElementRule() ||
				   context == grammarAccess.getTagObjectPropertyElementRule()) {
					sequence_TagObjectPropertyElement(context, (TagObjectPropertyElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.TAG_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getTagOperatorRule()) {
					sequence_TagOperator(context, (TagOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.UN_TAG_ELEMENT:
				if(context == grammarAccess.getUnTagElementRule()) {
					sequence_UnTagElement(context, (UnTagElement) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.UN_TAG_OPERATOR:
				if(context == grammarAccess.getReturnTypeOperatorRule() ||
				   context == grammarAccess.getUnTagOperatorRule()) {
					sequence_UnTagOperator(context, (UnTagOperator) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.VARIABLE_CALL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (VariableCall) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getStreamElementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.WINDOW_OPERATOR:
				if(context == grammarAccess.getBarrierOperatorRule() ||
				   context == grammarAccess.getWindowOperatorRule()) {
					sequence_WindowOperator(context, (WindowOperator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess (literal=NUMBER | streamElement=StreamAccess | variable=[VariableDefinition|ID]))
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    literal[0, 1]
	 *         EXCLUDE_IF_SET streamElement
	 *         EXCLUDE_IF_SET variable
	 *    streamElement[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET variable
	 *    variable[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET streamElement
	 */
	protected void sequence_AdditionOperator(EObject context, AdditionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=And_BooleanOperation_1_0 operator='&&' right=RelationalExpression) | 
	 *         (
	 *             left=RelationalExpression_BooleanOperation_1_0 
	 *             (
	 *                 operator='==' | 
	 *                 operator='!=' | 
	 *                 operator='>=' | 
	 *                 operator='<=' | 
	 *                 operator='>' | 
	 *                 operator='<'
	 *             ) 
	 *             right=Addition
	 *         ) | 
	 *         (left=Or_BooleanOperation_1_0 operator='||' right=And)
	 *     )
	 *
	 * Features:
	 *    left[0, 3]
	 *    operator[0, 8]
	 *    right[0, 3]
	 */
	protected void sequence_And(EObject context, BooleanOperation semanticObject) {
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
	protected void sequence_AverageOperator(EObject context, AverageOperator semanticObject) {
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
	 *     (type=BooleanDataType name=ID value=BOOLVALUE)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_BooleanVariableDefinition(EObject context, BooleanVariableDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.BOOLEAN_VARIABLE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.BOOLEAN_VARIABLE_DEFINITION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.BOOLEAN_VARIABLE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.BOOLEAN_VARIABLE_DEFINITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanVariableDefinitionAccess().getTypeBooleanDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBooleanVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBooleanVariableDefinitionAccess().getValueBOOLVALUETerminalRuleCall_3_0(), semanticObject.isValue());
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
	protected void sequence_CountOperator(EObject context, CountOperator semanticObject) {
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
	 *     {BooleanDataType}
	 *
	 * Features:
	 */
	protected void sequence_DataType(EObject context, BooleanDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatDataType}
	 *
	 * Features:
	 */
	protected void sequence_DataType(EObject context, FloatDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntegerDataType}
	 *
	 * Features:
	 */
	protected void sequence_DataType(EObject context, IntegerDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringDataType}
	 *
	 * Features:
	 */
	protected void sequence_DataType(EObject context, StringDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value+=STRING value+=STRING*)
	 *
	 * Features:
	 *    key[1, 1]
	 *    value[1, *]
	 */
	protected void sequence_DecisionTreeAttribute(EObject context, DecisionTreeAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         attributes+=DecisionTreeAttribute 
	 *         attributes+=DecisionTreeAttribute* 
	 *         delta=NUMBER 
	 *         tau=NUMBER 
	 *         barrier=NUMBER 
	 *         frequency=NUMBER 
	 *         classAttributes+=DecisionTreeAttribute 
	 *         classAttributes+=DecisionTreeAttribute* 
	 *         stream=StreamOperatorParameter
	 *     )
	 *
	 * Features:
	 *    attributes[1, *]
	 *    delta[1, 1]
	 *    tau[1, 1]
	 *    barrier[1, 1]
	 *    frequency[1, 1]
	 *    classAttributes[1, *]
	 *    stream[1, 1]
	 */
	protected void sequence_DecisionTreeOperator(EObject context, DecisionTreeOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess (literal=NUMBER | streamElement=StreamAccess | variable=[VariableDefinition|ID]))
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    literal[0, 1]
	 *         EXCLUDE_IF_SET streamElement
	 *         EXCLUDE_IF_SET variable
	 *    streamElement[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET variable
	 *    variable[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET streamElement
	 */
	protected void sequence_DivisionOperator(EObject context, DivisionOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (elementParameters+=StreamAccess | variableElementParameters+=[VariableDefinition|ID]) 
	 *         elementParameters+=StreamAccess* 
	 *         variableElementParameters+=[VariableDefinition|ID]* 
	 *         parameter=StreamOperatorParameter
	 *     )
	 *
	 * Features:
	 *    elementParameters[0, *]
	 *    variableElementParameters[0, *]
	 *    parameter[1, 1]
	 */
	protected void sequence_ElementJoinOperator(EObject context, ElementJoinOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=Expression expression+=Expression* stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    expression[1, *]
	 *    stream[1, 1]
	 */
	protected void sequence_FilterOperator(EObject context, FilterOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 *
	 * Features:
	 *    importURI[1, 1]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
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
	 *     (iri+=STRING iri+=STRING* address=STRING port=NUMBER)
	 *
	 * Features:
	 *    iri[1, *]
	 *    address[1, 1]
	 *    port[1, 1]
	 */
	protected void sequence_InputOperator(EObject context, InputOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=StreamOperatorParameter parameters+=StreamOperatorParameter parameters+=StreamOperatorParameter*)
	 *
	 * Features:
	 *    parameters[2, *]
	 */
	protected void sequence_JoinOperator(EObject context, JoinOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location=STRING format=STRING stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    location[1, 1]
	 *    format[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_LogOperator(EObject context, LogOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.LOG_OPERATOR__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.LOG_OPERATOR__LOCATION));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.LOG_OPERATOR__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.LOG_OPERATOR__FORMAT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.LOG_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.LOG_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogOperatorAccess().getLocationSTRINGTerminalRuleCall_2_0(), semanticObject.getLocation());
		feeder.accept(grammarAccess.getLogOperatorAccess().getFormatSTRINGTerminalRuleCall_4_0(), semanticObject.getFormat());
		feeder.accept(grammarAccess.getLogOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_MarkerOperator(EObject context, MarkerOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.MARKER_OPERATOR__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.MARKER_OPERATOR__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarkerOperatorAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression calculation=Expression stream+=StreamOperatorParameter stream+=StreamOperatorParameter*)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    calculation[1, 1]
	 *    stream[1, *]
	 */
	protected void sequence_MatchOperator(EObject context, MatchOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     models+=PackageDeclaration+
	 *
	 * Features:
	 *    models[1, *]
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess (literal=NUMBER | streamElement=StreamAccess | variable=[VariableDefinition|ID]))
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    literal[0, 1]
	 *         EXCLUDE_IF_SET streamElement
	 *         EXCLUDE_IF_SET variable
	 *    streamElement[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET variable
	 *    variable[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET streamElement
	 */
	protected void sequence_ModuloOperator(EObject context, ModuloOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess (literal=NUMBER | streamElement=StreamAccess | variable=[VariableDefinition|ID]))
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    literal[0, 1]
	 *         EXCLUDE_IF_SET streamElement
	 *         EXCLUDE_IF_SET variable
	 *    streamElement[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET variable
	 *    variable[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET streamElement
	 */
	protected void sequence_MultiplicationOperator(EObject context, MultiplicationOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=SimpleDataType name=ID value=NUMBER)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_NumberVariableDefinition(EObject context, NumberVariableDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NUMBER_VARIABLE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NUMBER_VARIABLE_DEFINITION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NUMBER_VARIABLE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NUMBER_VARIABLE_DEFINITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberVariableDefinitionAccess().getTypeSimpleDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getNumberVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNumberVariableDefinitionAccess().getValueNUMBERTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stream=StreamOperatorParameter iri+=STRING iri+=STRING* address=STRING port=NUMBER)
	 *
	 * Features:
	 *    stream[1, 1]
	 *    iri[1, *]
	 *    address[1, 1]
	 *    port[1, 1]
	 */
	protected void sequence_OutputOperator(EObject context, OutputOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ModelElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    elements[0, *]
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_PrimaryExpression(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     streamVariable=StreamAccess
	 *
	 * Features:
	 *    streamVariable[1, 1]
	 */
	protected void sequence_PrimaryExpression(EObject context, StreamAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[VariableDefinition|ID]
	 *
	 * Features:
	 *    variable[1, 1]
	 */
	protected void sequence_PrimaryExpression(EObject context, VariableCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_CALL__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_CALL__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDefinitionIDTerminalRuleCall_2_1_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (queryType=SparqlQueryType query=SparqlQuery)
	 *
	 * Features:
	 *    queryType[1, 1]
	 *    query[1, 1]
	 */
	protected void sequence_QueryTagOperator(EObject context, QueryTagOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.QUERY_TAG_OPERATOR__QUERY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.QUERY_TAG_OPERATOR__QUERY_TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.QUERY_TAG_OPERATOR__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.QUERY_TAG_OPERATOR__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQueryTagOperatorAccess().getQueryTypeSparqlQueryTypeEnumRuleCall_1_0(), semanticObject.getQueryType());
		feeder.accept(grammarAccess.getQueryTagOperatorAccess().getQuerySparqlQueryParserRuleCall_2_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (maximum=NUMBER sleep=NUMBER stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    maximum[1, 1]
	 *    sleep[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_RandomOperator(EObject context, RandomOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__MAXIMUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__MAXIMUM));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__SLEEP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__SLEEP));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.RANDOM_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRandomOperatorAccess().getMaximumNUMBERTerminalRuleCall_2_0(), semanticObject.getMaximum());
		feeder.accept(grammarAccess.getRandomOperatorAccess().getSleepNUMBERTerminalRuleCall_4_0(), semanticObject.getSleep());
		feeder.accept(grammarAccess.getRandomOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[OWLObjectProperty|STRING] variable+=StreamAccess variable+=StreamAccess*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    variable[1, *]
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=QueryTagOperator target=STRING stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    query[1, 1]
	 *    target[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_SPARQLOperator(EObject context, SPARQLOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__QUERY));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__TARGET));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSPARQLOperatorAccess().getQueryQueryTagOperatorParserRuleCall_2_0(), semanticObject.getQuery());
		feeder.accept(grammarAccess.getSPARQLOperatorAccess().getTargetSTRINGTerminalRuleCall_4_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getSPARQLOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (rule=SWRLRule stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    rule[1, 1]
	 *    stream[1, 1]
	 */
	protected void sequence_SWRLOperator(EObject context, SWRLOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SWRL_OPERATOR__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SWRL_OPERATOR__RULE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SWRL_OPERATOR__STREAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SWRL_OPERATOR__STREAM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSWRLOperatorAccess().getRuleSWRLRuleParserRuleCall_2_0(), semanticObject.getRule());
		feeder.accept(grammarAccess.getSWRLOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0(), semanticObject.getStream());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (atoms+=Rule atoms+=Rule* consequent=Rule)
	 *
	 * Features:
	 *    atoms[1, *]
	 *    consequent[1, 1]
	 */
	protected void sequence_SWRLRule(EObject context, SWRLRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable+=STRING variable+=STRING*)
	 *
	 * Features:
	 *    variable[1, *]
	 */
	protected void sequence_SparqlQueryVariable(EObject context, SparqlQueryVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=SparqlQueryVariable uri=STRING attribute=STRING)
	 *
	 * Features:
	 *    variable[1, 1]
	 *    uri[1, 1]
	 *    attribute[1, 1]
	 */
	protected void sequence_SparqlQuery(EObject context, SparqlQuery semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_QUERY__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_QUERY__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_QUERY__URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_QUERY__URI));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPARQL_QUERY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPARQL_QUERY__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSparqlQueryAccess().getVariableSparqlQueryVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getSparqlQueryAccess().getUriSTRINGTerminalRuleCall_3_0(), semanticObject.getUri());
		feeder.accept(grammarAccess.getSparqlQueryAccess().getAttributeSTRINGTerminalRuleCall_4_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameter=StreamOperatorParameter
	 *
	 * Features:
	 *    parameter[1, 1]
	 */
	protected void sequence_SplitOperator(EObject context, SplitOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.SPLIT_OPERATOR__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.SPLIT_OPERATOR__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSplitOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_2_0(), semanticObject.getParameter());
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
	protected void sequence_StandardDeviationOperator(EObject context, StandardDeviationOperator semanticObject) {
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
	protected void sequence_StreamAccess(EObject context, StreamAccess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[StreamDeclaration|ID] element=[VariableDeclaration|ID])
	 *
	 * Features:
	 *    reference[1, 1]
	 *    element[1, 1]
	 */
	protected void sequence_StreamDeclarationAccess(EObject context, StreamDeclarationAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_DECLARATION_ACCESS__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_DECLARATION_ACCESS__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_DECLARATION_ACCESS__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_DECLARATION_ACCESS__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamDeclarationAccessAccess().getReferenceStreamDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getStreamDeclarationAccessAccess().getElementVariableDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getElement());
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
	protected void sequence_StreamDeclaration(EObject context, StreamDeclaration semanticObject) {
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
	protected void sequence_StreamDefinition(EObject context, StreamDefinition semanticObject) {
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
	 *     (stream=[StreamDefinition|ID] barrier=BarrierOperator?)
	 *
	 * Features:
	 *    stream[1, 1]
	 *    barrier[0, 1]
	 */
	protected void sequence_StreamOperatorParameter(EObject context, StreamOperatorParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnStream+=[StreamDefinition|ID] returnStream+=[StreamDefinition|ID]* operator=ReturnTypeOperator)
	 *
	 * Features:
	 *    returnStream[1, *]
	 *    operator[1, 1]
	 */
	protected void sequence_StreamStatement(EObject context, StreamStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[StreamDefinition|ID] expression=Expression)
	 *
	 * Features:
	 *    reference[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_StreamVariableStatement(EObject context, StreamVariableStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_VARIABLE_STATEMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_VARIABLE_STATEMENT__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM_VARIABLE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM_VARIABLE_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamVariableStatementAccess().getReferenceStreamDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getStreamVariableStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=StringDataType name=ID value=STRING)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_StringVariableDefinition(EObject context, StringVariableDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STRING_VARIABLE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STRING_VARIABLE_DEFINITION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STRING_VARIABLE_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STRING_VARIABLE_DEFINITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringVariableDefinitionAccess().getTypeStringDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getStringVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStringVariableDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=VariableDeclaration+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    elements[1, *]
	 */
	protected void sequence_StructureDeclaration(EObject context, StructureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     element=[StructureDeclaration|ID]
	 *
	 * Features:
	 *    element[1, 1]
	 */
	protected void sequence_StructureElements(EObject context, StructureElements semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STRUCTURE_ELEMENTS__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STRUCTURE_ELEMENTS__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructureElementsAccess().getElementStructureDeclarationIDTerminalRuleCall_1_0_1(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=StreamAccess (literal=NUMBER | streamElement=StreamAccess | variable=[VariableDefinition|ID]))
	 *
	 * Features:
	 *    parameter[1, 1]
	 *    literal[0, 1]
	 *         EXCLUDE_IF_SET streamElement
	 *         EXCLUDE_IF_SET variable
	 *    streamElement[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET variable
	 *    variable[0, 1]
	 *         EXCLUDE_IF_SET literal
	 *         EXCLUDE_IF_SET streamElement
	 */
	protected void sequence_SubtractionOperator(EObject context, SubtractionOperator semanticObject) {
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
	protected void sequence_TagClassElement(EObject context, TagClassElement semanticObject) {
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
	protected void sequence_TagDataTypePropertyElement(EObject context, TagDataTypePropertyElement semanticObject) {
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
	protected void sequence_TagObjectPropertyElement(EObject context, TagObjectPropertyElement semanticObject) {
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
	protected void sequence_TagOperator(EObject context, TagOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=[OWLClass|STRING] reference=StreamAccess)
	 *
	 * Features:
	 *    element[1, 1]
	 *    reference[1, 1]
	 */
	protected void sequence_UnTagElement(EObject context, UnTagElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.UN_TAG_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.UN_TAG_ELEMENT__ELEMENT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.UN_TAG_ELEMENT__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.UN_TAG_ELEMENT__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnTagElementAccess().getElementOWLClassSTRINGTerminalRuleCall_0_0_1(), semanticObject.getElement());
		feeder.accept(grammarAccess.getUnTagElementAccess().getReferenceStreamAccessParserRuleCall_2_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=UnTagElement parameters+=UnTagElement* stream=StreamOperatorParameter)
	 *
	 * Features:
	 *    parameters[1, *]
	 *    stream[1, 1]
	 */
	protected void sequence_UnTagOperator(EObject context, UnTagOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getTypeDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((setting='last' value=NUMBER (unit='min' | unit='hrs' | unit='sec' | unit='elements')?) | setting='now')
	 *
	 * Features:
	 *    setting[0, 2]
	 *    value[0, 1]
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
	protected void sequence_WindowOperator(EObject context, WindowOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
