/*
* generated by Xtext
*/
package de.hs_rm.cs.vs.dsm.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.hs_rm.cs.vs.dsm.services.FlowGrammarAccess;

public class FlowParser extends AbstractContentAssistParser {
	
	@Inject
	private FlowGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal.InternalFlowParser createParser() {
		de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal.InternalFlowParser result = new de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal.InternalFlowParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelElementAccess().getAlternatives(), "rule__ModelElement__Alternatives");
					put(grammarAccess.getStreamStatementAccess().getAlternatives_3(), "rule__StreamStatement__Alternatives_3");
					put(grammarAccess.getElementJoinOperatorAccess().getAlternatives_2(), "rule__ElementJoinOperator__Alternatives_2");
					put(grammarAccess.getReturnTypeOperatorAccess().getAlternatives(), "rule__ReturnTypeOperator__Alternatives");
					put(grammarAccess.getTagElementAccess().getAlternatives(), "rule__TagElement__Alternatives");
					put(grammarAccess.getBarrierOperatorAccess().getAlternatives(), "rule__BarrierOperator__Alternatives");
					put(grammarAccess.getWindowOperatorAccess().getAlternatives(), "rule__WindowOperator__Alternatives");
					put(grammarAccess.getWindowOperatorAccess().getUnitAlternatives_0_2_0(), "rule__WindowOperator__UnitAlternatives_0_2_0");
					put(grammarAccess.getVariableDefinitionAccess().getAlternatives(), "rule__VariableDefinition__Alternatives");
					put(grammarAccess.getStreamElementAccess().getAlternatives(), "rule__StreamElement__Alternatives");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAlternatives_1_1_0(), "rule__RelationalExpression__OperatorAlternatives_1_1_0");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getSimpleDataTypeAccess().getAlternatives(), "rule__SimpleDataType__Alternatives");
					put(grammarAccess.getSparqlQueryTypeAccess().getAlternatives(), "rule__SparqlQueryType__Alternatives");
					put(grammarAccess.getSchemeAccess().getAlternatives(), "rule__Scheme__Alternatives");
					put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getStreamStatementAccess().getGroup(), "rule__StreamStatement__Group__0");
					put(grammarAccess.getStreamStatementAccess().getGroup_1(), "rule__StreamStatement__Group_1__0");
					put(grammarAccess.getStreamVariableStatementAccess().getGroup(), "rule__StreamVariableStatement__Group__0");
					put(grammarAccess.getStreamAccessAccess().getGroup(), "rule__StreamAccess__Group__0");
					put(grammarAccess.getStreamDeclarationAccessAccess().getGroup(), "rule__StreamDeclarationAccess__Group__0");
					put(grammarAccess.getStreamDefinitionAccess().getGroup(), "rule__StreamDefinition__Group__0");
					put(grammarAccess.getJoinOperatorAccess().getGroup(), "rule__JoinOperator__Group__0");
					put(grammarAccess.getJoinOperatorAccess().getGroup_5(), "rule__JoinOperator__Group_5__0");
					put(grammarAccess.getStreamOperatorParameterAccess().getGroup(), "rule__StreamOperatorParameter__Group__0");
					put(grammarAccess.getStreamOperatorParameterAccess().getGroup_1(), "rule__StreamOperatorParameter__Group_1__0");
					put(grammarAccess.getElementJoinOperatorAccess().getGroup(), "rule__ElementJoinOperator__Group__0");
					put(grammarAccess.getElementJoinOperatorAccess().getGroup_3(), "rule__ElementJoinOperator__Group_3__0");
					put(grammarAccess.getElementJoinOperatorAccess().getGroup_4(), "rule__ElementJoinOperator__Group_4__0");
					put(grammarAccess.getFilterOperatorAccess().getGroup(), "rule__FilterOperator__Group__0");
					put(grammarAccess.getFilterOperatorAccess().getGroup_3(), "rule__FilterOperator__Group_3__0");
					put(grammarAccess.getSplitOperatorAccess().getGroup(), "rule__SplitOperator__Group__0");
					put(grammarAccess.getMatchOperatorAccess().getGroup(), "rule__MatchOperator__Group__0");
					put(grammarAccess.getMatchOperatorAccess().getGroup_7(), "rule__MatchOperator__Group_7__0");
					put(grammarAccess.getSymmetricDifferenceOperatorAccess().getGroup(), "rule__SymmetricDifferenceOperator__Group__0");
					put(grammarAccess.getSymmetricDifferenceOperatorAccess().getGroup_5(), "rule__SymmetricDifferenceOperator__Group_5__0");
					put(grammarAccess.getDifferenceOperatorAccess().getGroup(), "rule__DifferenceOperator__Group__0");
					put(grammarAccess.getDifferenceOperatorAccess().getGroup_5(), "rule__DifferenceOperator__Group_5__0");
					put(grammarAccess.getInputOperatorAccess().getGroup(), "rule__InputOperator__Group__0");
					put(grammarAccess.getInputOperatorAccess().getGroup_3(), "rule__InputOperator__Group_3__0");
					put(grammarAccess.getTagOperatorAccess().getGroup(), "rule__TagOperator__Group__0");
					put(grammarAccess.getTagOperatorAccess().getGroup_3(), "rule__TagOperator__Group_3__0");
					put(grammarAccess.getNewTagOperatorAccess().getGroup(), "rule__NewTagOperator__Group__0");
					put(grammarAccess.getQueryTagOperatorAccess().getGroup(), "rule__QueryTagOperator__Group__0");
					put(grammarAccess.getSparqlQueryAccess().getGroup(), "rule__SparqlQuery__Group__0");
					put(grammarAccess.getSparqlQueryVariableAccess().getGroup(), "rule__SparqlQueryVariable__Group__0");
					put(grammarAccess.getSparqlQueryVariableAccess().getGroup_2(), "rule__SparqlQueryVariable__Group_2__0");
					put(grammarAccess.getUnTagOperatorAccess().getGroup(), "rule__UnTagOperator__Group__0");
					put(grammarAccess.getUnTagOperatorAccess().getGroup_3(), "rule__UnTagOperator__Group_3__0");
					put(grammarAccess.getUnTagElementAccess().getGroup(), "rule__UnTagElement__Group__0");
					put(grammarAccess.getTagClassElementAccess().getGroup(), "rule__TagClassElement__Group__0");
					put(grammarAccess.getTagObjectPropertyElementAccess().getGroup(), "rule__TagObjectPropertyElement__Group__0");
					put(grammarAccess.getTagDataTypePropertyElementAccess().getGroup(), "rule__TagDataTypePropertyElement__Group__0");
					put(grammarAccess.getWindowOperatorAccess().getGroup_0(), "rule__WindowOperator__Group_0__0");
					put(grammarAccess.getMarkerOperatorAccess().getGroup(), "rule__MarkerOperator__Group__0");
					put(grammarAccess.getSWRLOperatorAccess().getGroup(), "rule__SWRLOperator__Group__0");
					put(grammarAccess.getSWRLOperatorAccess().getGroup_5(), "rule__SWRLOperator__Group_5__0");
					put(grammarAccess.getSWRLRuleAccess().getGroup(), "rule__SWRLRule__Group__0");
					put(grammarAccess.getAntecedentRuleAccess().getGroup(), "rule__AntecedentRule__Group__0");
					put(grammarAccess.getAntecedentRuleAccess().getGroup_3(), "rule__AntecedentRule__Group_3__0");
					put(grammarAccess.getConsequentRuleAccess().getGroup(), "rule__ConsequentRule__Group__0");
					put(grammarAccess.getConsequentRuleAccess().getGroup_3(), "rule__ConsequentRule__Group_3__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_4(), "rule__Rule__Group_4__0");
					put(grammarAccess.getOCLOperatorAccess().getGroup(), "rule__OCLOperator__Group__0");
					put(grammarAccess.getCountOperatorAccess().getGroup(), "rule__CountOperator__Group__0");
					put(grammarAccess.getStandardDeviationOperatorAccess().getGroup(), "rule__StandardDeviationOperator__Group__0");
					put(grammarAccess.getAverageOperatorAccess().getGroup(), "rule__AverageOperator__Group__0");
					put(grammarAccess.getOutputOperatorAccess().getGroup(), "rule__OutputOperator__Group__0");
					put(grammarAccess.getOutputOperatorParameterAccess().getGroup(), "rule__OutputOperatorParameter__Group__0");
					put(grammarAccess.getOutputOperatorParameterAccess().getGroup_1(), "rule__OutputOperatorParameter__Group_1__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getNumberVariableDefinitionAccess().getGroup(), "rule__NumberVariableDefinition__Group__0");
					put(grammarAccess.getStringVariableDefinitionAccess().getGroup(), "rule__StringVariableDefinition__Group__0");
					put(grammarAccess.getBooleanVariableDefinitionAccess().getGroup(), "rule__BooleanVariableDefinition__Group__0");
					put(grammarAccess.getStructureDeclarationAccess().getGroup(), "rule__StructureDeclaration__Group__0");
					put(grammarAccess.getStreamDeclarationAccess().getGroup(), "rule__StreamDeclaration__Group__0");
					put(grammarAccess.getStructureElementsAccess().getGroup(), "rule__StructureElements__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getIntegerDataTypeAccess().getGroup(), "rule__IntegerDataType__Group__0");
					put(grammarAccess.getBooleanDataTypeAccess().getGroup(), "rule__BooleanDataType__Group__0");
					put(grammarAccess.getFloatDataTypeAccess().getGroup(), "rule__FloatDataType__Group__0");
					put(grammarAccess.getStringDataTypeAccess().getGroup(), "rule__StringDataType__Group__0");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getGroup(), "rule__InternationalizedResourceIdentifier__Group__0");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getGroup_3(), "rule__InternationalizedResourceIdentifier__Group_3__0");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getGroup_4(), "rule__InternationalizedResourceIdentifier__Group_4__0");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getGroup_5(), "rule__InternationalizedResourceIdentifier__Group_5__0");
					put(grammarAccess.getModelAccess().getModelsAssignment(), "rule__Model__ModelsAssignment");
					put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
					put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3(), "rule__PackageDeclaration__ElementsAssignment_3");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getStreamStatementAccess().getReturnStreamAssignment_0(), "rule__StreamStatement__ReturnStreamAssignment_0");
					put(grammarAccess.getStreamStatementAccess().getReturnStreamAssignment_1_1(), "rule__StreamStatement__ReturnStreamAssignment_1_1");
					put(grammarAccess.getStreamStatementAccess().getOperatorAssignment_3_0(), "rule__StreamStatement__OperatorAssignment_3_0");
					put(grammarAccess.getStreamStatementAccess().getExpressionAssignment_3_1(), "rule__StreamStatement__ExpressionAssignment_3_1");
					put(grammarAccess.getStreamVariableStatementAccess().getReferenceAssignment_0(), "rule__StreamVariableStatement__ReferenceAssignment_0");
					put(grammarAccess.getStreamVariableStatementAccess().getExpressionAssignment_2(), "rule__StreamVariableStatement__ExpressionAssignment_2");
					put(grammarAccess.getStreamAccessAccess().getReferenceAssignment_0(), "rule__StreamAccess__ReferenceAssignment_0");
					put(grammarAccess.getStreamAccessAccess().getElementAssignment_2(), "rule__StreamAccess__ElementAssignment_2");
					put(grammarAccess.getStreamDeclarationAccessAccess().getReferenceAssignment_0(), "rule__StreamDeclarationAccess__ReferenceAssignment_0");
					put(grammarAccess.getStreamDeclarationAccessAccess().getElementAssignment_2(), "rule__StreamDeclarationAccess__ElementAssignment_2");
					put(grammarAccess.getStreamDefinitionAccess().getReferenceAssignment_0(), "rule__StreamDefinition__ReferenceAssignment_0");
					put(grammarAccess.getStreamDefinitionAccess().getNameAssignment_1(), "rule__StreamDefinition__NameAssignment_1");
					put(grammarAccess.getJoinOperatorAccess().getParametersAssignment_2(), "rule__JoinOperator__ParametersAssignment_2");
					put(grammarAccess.getJoinOperatorAccess().getParametersAssignment_4(), "rule__JoinOperator__ParametersAssignment_4");
					put(grammarAccess.getJoinOperatorAccess().getParametersAssignment_5_1(), "rule__JoinOperator__ParametersAssignment_5_1");
					put(grammarAccess.getStreamOperatorParameterAccess().getStreamAssignment_0(), "rule__StreamOperatorParameter__StreamAssignment_0");
					put(grammarAccess.getStreamOperatorParameterAccess().getBarrierAssignment_1_1(), "rule__StreamOperatorParameter__BarrierAssignment_1_1");
					put(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_2_0(), "rule__ElementJoinOperator__ElementParametersAssignment_2_0");
					put(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_2_1(), "rule__ElementJoinOperator__VariableElementParametersAssignment_2_1");
					put(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_3_1(), "rule__ElementJoinOperator__ElementParametersAssignment_3_1");
					put(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_4_1(), "rule__ElementJoinOperator__VariableElementParametersAssignment_4_1");
					put(grammarAccess.getElementJoinOperatorAccess().getParameterAssignment_6(), "rule__ElementJoinOperator__ParameterAssignment_6");
					put(grammarAccess.getFilterOperatorAccess().getExpressionAssignment_2(), "rule__FilterOperator__ExpressionAssignment_2");
					put(grammarAccess.getFilterOperatorAccess().getExpressionAssignment_3_1(), "rule__FilterOperator__ExpressionAssignment_3_1");
					put(grammarAccess.getFilterOperatorAccess().getStreamAssignment_5(), "rule__FilterOperator__StreamAssignment_5");
					put(grammarAccess.getSplitOperatorAccess().getParameterAssignment_2(), "rule__SplitOperator__ParameterAssignment_2");
					put(grammarAccess.getMatchOperatorAccess().getExpressionAssignment_2(), "rule__MatchOperator__ExpressionAssignment_2");
					put(grammarAccess.getMatchOperatorAccess().getCalculationAssignment_4(), "rule__MatchOperator__CalculationAssignment_4");
					put(grammarAccess.getMatchOperatorAccess().getStreamAssignment_6(), "rule__MatchOperator__StreamAssignment_6");
					put(grammarAccess.getMatchOperatorAccess().getStreamAssignment_7_1(), "rule__MatchOperator__StreamAssignment_7_1");
					put(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersAssignment_2(), "rule__SymmetricDifferenceOperator__ParametersAssignment_2");
					put(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersAssignment_4(), "rule__SymmetricDifferenceOperator__ParametersAssignment_4");
					put(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersAssignment_5_1(), "rule__SymmetricDifferenceOperator__ParametersAssignment_5_1");
					put(grammarAccess.getDifferenceOperatorAccess().getParametersAssignment_2(), "rule__DifferenceOperator__ParametersAssignment_2");
					put(grammarAccess.getDifferenceOperatorAccess().getParametersAssignment_4(), "rule__DifferenceOperator__ParametersAssignment_4");
					put(grammarAccess.getDifferenceOperatorAccess().getParametersAssignment_5_1(), "rule__DifferenceOperator__ParametersAssignment_5_1");
					put(grammarAccess.getInputOperatorAccess().getIriAssignment_2(), "rule__InputOperator__IriAssignment_2");
					put(grammarAccess.getInputOperatorAccess().getIriAssignment_3_1(), "rule__InputOperator__IriAssignment_3_1");
					put(grammarAccess.getInputOperatorAccess().getPortAssignment_5(), "rule__InputOperator__PortAssignment_5");
					put(grammarAccess.getInputOperatorAccess().getSocketAssignment_7(), "rule__InputOperator__SocketAssignment_7");
					put(grammarAccess.getTagOperatorAccess().getParametersAssignment_2(), "rule__TagOperator__ParametersAssignment_2");
					put(grammarAccess.getTagOperatorAccess().getParametersAssignment_3_1(), "rule__TagOperator__ParametersAssignment_3_1");
					put(grammarAccess.getNewTagOperatorAccess().getQueryAssignment_2(), "rule__NewTagOperator__QueryAssignment_2");
					put(grammarAccess.getNewTagOperatorAccess().getTargetAssignment_4(), "rule__NewTagOperator__TargetAssignment_4");
					put(grammarAccess.getQueryTagOperatorAccess().getQueryTypeAssignment_1(), "rule__QueryTagOperator__QueryTypeAssignment_1");
					put(grammarAccess.getQueryTagOperatorAccess().getQueryAssignment_2(), "rule__QueryTagOperator__QueryAssignment_2");
					put(grammarAccess.getSparqlQueryAccess().getVariableAssignment_0(), "rule__SparqlQuery__VariableAssignment_0");
					put(grammarAccess.getSparqlQueryVariableAccess().getVariableAssignment_1(), "rule__SparqlQueryVariable__VariableAssignment_1");
					put(grammarAccess.getSparqlQueryVariableAccess().getVariableAssignment_2_1(), "rule__SparqlQueryVariable__VariableAssignment_2_1");
					put(grammarAccess.getUnTagOperatorAccess().getParametersAssignment_2(), "rule__UnTagOperator__ParametersAssignment_2");
					put(grammarAccess.getUnTagOperatorAccess().getParametersAssignment_3_1(), "rule__UnTagOperator__ParametersAssignment_3_1");
					put(grammarAccess.getUnTagOperatorAccess().getStreamAssignment_5(), "rule__UnTagOperator__StreamAssignment_5");
					put(grammarAccess.getUnTagElementAccess().getElementAssignment_0(), "rule__UnTagElement__ElementAssignment_0");
					put(grammarAccess.getUnTagElementAccess().getReferenceAssignment_2(), "rule__UnTagElement__ReferenceAssignment_2");
					put(grammarAccess.getTagClassElementAccess().getReferenceAssignment_0(), "rule__TagClassElement__ReferenceAssignment_0");
					put(grammarAccess.getTagClassElementAccess().getElementAssignment_3(), "rule__TagClassElement__ElementAssignment_3");
					put(grammarAccess.getTagObjectPropertyElementAccess().getReferenceAssignment_0(), "rule__TagObjectPropertyElement__ReferenceAssignment_0");
					put(grammarAccess.getTagObjectPropertyElementAccess().getElementAssignment_3(), "rule__TagObjectPropertyElement__ElementAssignment_3");
					put(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceAssignment_0(), "rule__TagDataTypePropertyElement__ReferenceAssignment_0");
					put(grammarAccess.getTagDataTypePropertyElementAccess().getElementAssignment_3(), "rule__TagDataTypePropertyElement__ElementAssignment_3");
					put(grammarAccess.getWindowOperatorAccess().getSettingAssignment_0_0(), "rule__WindowOperator__SettingAssignment_0_0");
					put(grammarAccess.getWindowOperatorAccess().getValueAssignment_0_1(), "rule__WindowOperator__ValueAssignment_0_1");
					put(grammarAccess.getWindowOperatorAccess().getUnitAssignment_0_2(), "rule__WindowOperator__UnitAssignment_0_2");
					put(grammarAccess.getWindowOperatorAccess().getSettingAssignment_1(), "rule__WindowOperator__SettingAssignment_1");
					put(grammarAccess.getMarkerOperatorAccess().getExpressionAssignment_1(), "rule__MarkerOperator__ExpressionAssignment_1");
					put(grammarAccess.getSWRLOperatorAccess().getRuleAssignment_2(), "rule__SWRLOperator__RuleAssignment_2");
					put(grammarAccess.getSWRLOperatorAccess().getBarrierAssignment_4(), "rule__SWRLOperator__BarrierAssignment_4");
					put(grammarAccess.getSWRLOperatorAccess().getBarrierAssignment_5_1(), "rule__SWRLOperator__BarrierAssignment_5_1");
					put(grammarAccess.getSWRLRuleAccess().getAntecedentAssignment_2(), "rule__SWRLRule__AntecedentAssignment_2");
					put(grammarAccess.getSWRLRuleAccess().getConsequentAssignment_4(), "rule__SWRLRule__ConsequentAssignment_4");
					put(grammarAccess.getAntecedentRuleAccess().getAtomsAssignment_2(), "rule__AntecedentRule__AtomsAssignment_2");
					put(grammarAccess.getAntecedentRuleAccess().getAtomsAssignment_3_1(), "rule__AntecedentRule__AtomsAssignment_3_1");
					put(grammarAccess.getConsequentRuleAccess().getAtomsAssignment_2(), "rule__ConsequentRule__AtomsAssignment_2");
					put(grammarAccess.getConsequentRuleAccess().getAtomsAssignment_3_1(), "rule__ConsequentRule__AtomsAssignment_3_1");
					put(grammarAccess.getRuleAccess().getNameAssignment_0(), "rule__Rule__NameAssignment_0");
					put(grammarAccess.getRuleAccess().getVariableAssignment_3(), "rule__Rule__VariableAssignment_3");
					put(grammarAccess.getRuleAccess().getVariableAssignment_4_2(), "rule__Rule__VariableAssignment_4_2");
					put(grammarAccess.getOCLOperatorAccess().getConstraintAssignment_2(), "rule__OCLOperator__ConstraintAssignment_2");
					put(grammarAccess.getOCLOperatorAccess().getStreamAssignment_4(), "rule__OCLOperator__StreamAssignment_4");
					put(grammarAccess.getCountOperatorAccess().getParameterAssignment_2(), "rule__CountOperator__ParameterAssignment_2");
					put(grammarAccess.getCountOperatorAccess().getStreamAssignment_4(), "rule__CountOperator__StreamAssignment_4");
					put(grammarAccess.getStandardDeviationOperatorAccess().getParameterAssignment_2(), "rule__StandardDeviationOperator__ParameterAssignment_2");
					put(grammarAccess.getStandardDeviationOperatorAccess().getStreamAssignment_4(), "rule__StandardDeviationOperator__StreamAssignment_4");
					put(grammarAccess.getAverageOperatorAccess().getParameterAssignment_2(), "rule__AverageOperator__ParameterAssignment_2");
					put(grammarAccess.getAverageOperatorAccess().getStreamAssignment_4(), "rule__AverageOperator__StreamAssignment_4");
					put(grammarAccess.getOutputOperatorAccess().getParameterAssignment_2(), "rule__OutputOperator__ParameterAssignment_2");
					put(grammarAccess.getOutputOperatorAccess().getLocationAssignment_4(), "rule__OutputOperator__LocationAssignment_4");
					put(grammarAccess.getOutputOperatorAccess().getStreamAssignment_6(), "rule__OutputOperator__StreamAssignment_6");
					put(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_0(), "rule__OutputOperatorParameter__ElementAssignment_0");
					put(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_1_1(), "rule__OutputOperatorParameter__ElementAssignment_1_1");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0(), "rule__VariableDeclaration__TypeAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getNumberVariableDefinitionAccess().getTypeAssignment_0(), "rule__NumberVariableDefinition__TypeAssignment_0");
					put(grammarAccess.getNumberVariableDefinitionAccess().getNameAssignment_1(), "rule__NumberVariableDefinition__NameAssignment_1");
					put(grammarAccess.getNumberVariableDefinitionAccess().getValueAssignment_3(), "rule__NumberVariableDefinition__ValueAssignment_3");
					put(grammarAccess.getStringVariableDefinitionAccess().getTypeAssignment_0(), "rule__StringVariableDefinition__TypeAssignment_0");
					put(grammarAccess.getStringVariableDefinitionAccess().getNameAssignment_1(), "rule__StringVariableDefinition__NameAssignment_1");
					put(grammarAccess.getStringVariableDefinitionAccess().getValueAssignment_3(), "rule__StringVariableDefinition__ValueAssignment_3");
					put(grammarAccess.getBooleanVariableDefinitionAccess().getTypeAssignment_0(), "rule__BooleanVariableDefinition__TypeAssignment_0");
					put(grammarAccess.getBooleanVariableDefinitionAccess().getNameAssignment_1(), "rule__BooleanVariableDefinition__NameAssignment_1");
					put(grammarAccess.getBooleanVariableDefinitionAccess().getValueAssignment_3(), "rule__BooleanVariableDefinition__ValueAssignment_3");
					put(grammarAccess.getStructureDeclarationAccess().getNameAssignment_1(), "rule__StructureDeclaration__NameAssignment_1");
					put(grammarAccess.getStructureDeclarationAccess().getElementsAssignment_3(), "rule__StructureDeclaration__ElementsAssignment_3");
					put(grammarAccess.getStreamDeclarationAccess().getNameAssignment_1(), "rule__StreamDeclaration__NameAssignment_1");
					put(grammarAccess.getStreamDeclarationAccess().getElementsAssignment_3(), "rule__StreamDeclaration__ElementsAssignment_3");
					put(grammarAccess.getStructureElementsAccess().getElementAssignment_1(), "rule__StructureElements__ElementAssignment_1");
					put(grammarAccess.getOrAccess().getOperatorAssignment_1_1(), "rule__Or__OperatorAssignment_1_1");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getOperatorAssignment_1_1(), "rule__And__OperatorAssignment_1_1");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1(), "rule__RelationalExpression__OperatorAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2(), "rule__RelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_2_1(), "rule__PrimaryExpression__VariableAssignment_2_1");
					put(grammarAccess.getPrimaryExpressionAccess().getStreamVariableAssignment_3_1(), "rule__PrimaryExpression__StreamVariableAssignment_3_1");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getSchemeAssignment_0(), "rule__InternationalizedResourceIdentifier__SchemeAssignment_0");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getAuthorityAssignment_2(), "rule__InternationalizedResourceIdentifier__AuthorityAssignment_2");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getPathAssignment_3_1(), "rule__InternationalizedResourceIdentifier__PathAssignment_3_1");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getQueryAssignment_4_1(), "rule__InternationalizedResourceIdentifier__QueryAssignment_4_1");
					put(grammarAccess.getInternationalizedResourceIdentifierAccess().getFragmentIRIAssignment_5_1(), "rule__InternationalizedResourceIdentifier__FragmentIRIAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal.InternalFlowParser typedParser = (de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal.InternalFlowParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FlowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
