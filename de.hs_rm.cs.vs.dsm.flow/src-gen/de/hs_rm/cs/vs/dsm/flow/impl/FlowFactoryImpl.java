/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowFactoryImpl extends EFactoryImpl implements FlowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FlowFactory init()
  {
    try
    {
      FlowFactory theFlowFactory = (FlowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.hs_rm.de/cs/vs/dsm/Flow"); 
      if (theFlowFactory != null)
      {
        return theFlowFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FlowFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FlowPackage.MODEL: return createModel();
      case FlowPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case FlowPackage.MODEL_ELEMENT: return createModelElement();
      case FlowPackage.IMPORT: return createImport();
      case FlowPackage.STREAM_STATEMENT: return createStreamStatement();
      case FlowPackage.STREAM_VARIABLE_STATEMENT: return createStreamVariableStatement();
      case FlowPackage.STREAM_ACCESS: return createStreamAccess();
      case FlowPackage.STREAM_DECLARATION_ACCESS: return createStreamDeclarationAccess();
      case FlowPackage.STREAM_DEFINITION: return createStreamDefinition();
      case FlowPackage.JOIN_OPERATOR: return createJoinOperator();
      case FlowPackage.STREAM_OPERATOR_PARAMETER: return createStreamOperatorParameter();
      case FlowPackage.ELEMENT_JOIN_OPERATOR: return createElementJoinOperator();
      case FlowPackage.FILTER_OPERATOR: return createFilterOperator();
      case FlowPackage.SPLIT_OPERATOR: return createSplitOperator();
      case FlowPackage.LOG_OPERATOR: return createLogOperator();
      case FlowPackage.RANDOM_OPERATOR: return createRandomOperator();
      case FlowPackage.DECISION_TREE_OPERATOR: return createDecisionTreeOperator();
      case FlowPackage.DECISION_TREE_ATTRIBUTE: return createDecisionTreeAttribute();
      case FlowPackage.MATCH_OPERATOR: return createMatchOperator();
      case FlowPackage.INPUT_OPERATOR: return createInputOperator();
      case FlowPackage.RETURN_TYPE_OPERATOR: return createReturnTypeOperator();
      case FlowPackage.TAG_OPERATOR: return createTagOperator();
      case FlowPackage.SPARQL_OPERATOR: return createSPARQLOperator();
      case FlowPackage.QUERY_TAG_OPERATOR: return createQueryTagOperator();
      case FlowPackage.SPARQL_QUERY: return createSparqlQuery();
      case FlowPackage.SPARQL_QUERY_VARIABLE: return createSparqlQueryVariable();
      case FlowPackage.UN_TAG_OPERATOR: return createUnTagOperator();
      case FlowPackage.UN_TAG_ELEMENT: return createUnTagElement();
      case FlowPackage.TAG_ELEMENT: return createTagElement();
      case FlowPackage.TAG_CLASS_ELEMENT: return createTagClassElement();
      case FlowPackage.TAG_OBJECT_PROPERTY_ELEMENT: return createTagObjectPropertyElement();
      case FlowPackage.TAG_DATA_TYPE_PROPERTY_ELEMENT: return createTagDataTypePropertyElement();
      case FlowPackage.BARRIER_OPERATOR: return createBarrierOperator();
      case FlowPackage.WINDOW_OPERATOR: return createWindowOperator();
      case FlowPackage.MARKER_OPERATOR: return createMarkerOperator();
      case FlowPackage.SWRL_OPERATOR: return createSWRLOperator();
      case FlowPackage.SWRL_RULE: return createSWRLRule();
      case FlowPackage.RULE: return createRule();
      case FlowPackage.COUNT_OPERATOR: return createCountOperator();
      case FlowPackage.STANDARD_DEVIATION_OPERATOR: return createStandardDeviationOperator();
      case FlowPackage.AVERAGE_OPERATOR: return createAverageOperator();
      case FlowPackage.ADDITION_OPERATOR: return createAdditionOperator();
      case FlowPackage.SUBTRACTION_OPERATOR: return createSubtractionOperator();
      case FlowPackage.MULTIPLICATION_OPERATOR: return createMultiplicationOperator();
      case FlowPackage.DIVISION_OPERATOR: return createDivisionOperator();
      case FlowPackage.MODULO_OPERATOR: return createModuloOperator();
      case FlowPackage.OUTPUT_OPERATOR: return createOutputOperator();
      case FlowPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case FlowPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case FlowPackage.NUMBER_VARIABLE_DEFINITION: return createNumberVariableDefinition();
      case FlowPackage.STRING_VARIABLE_DEFINITION: return createStringVariableDefinition();
      case FlowPackage.BOOLEAN_VARIABLE_DEFINITION: return createBooleanVariableDefinition();
      case FlowPackage.STRUCTURE_DECLARATION: return createStructureDeclaration();
      case FlowPackage.STREAM_DECLARATION: return createStreamDeclaration();
      case FlowPackage.STREAM_ELEMENT: return createStreamElement();
      case FlowPackage.STRUCTURE_ELEMENTS: return createStructureElements();
      case FlowPackage.EXPRESSION: return createExpression();
      case FlowPackage.DATA_TYPE: return createDataType();
      case FlowPackage.SIMPLE_DATA_TYPE: return createSimpleDataType();
      case FlowPackage.COMPLEX_DATA_TYPE: return createComplexDataType();
      case FlowPackage.INTEGER_DATA_TYPE: return createIntegerDataType();
      case FlowPackage.BOOLEAN_DATA_TYPE: return createBooleanDataType();
      case FlowPackage.FLOAT_DATA_TYPE: return createFloatDataType();
      case FlowPackage.STRING_DATA_TYPE: return createStringDataType();
      case FlowPackage.BOOLEAN_OPERATION: return createBooleanOperation();
      case FlowPackage.PLUS: return createPlus();
      case FlowPackage.MINUS: return createMinus();
      case FlowPackage.MULTI: return createMulti();
      case FlowPackage.DIV: return createDiv();
      case FlowPackage.NUMBER_LITERAL: return createNumberLiteral();
      case FlowPackage.VARIABLE_CALL: return createVariableCall();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FlowPackage.SPARQL_QUERY_TYPE:
        return createSparqlQueryTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FlowPackage.SPARQL_QUERY_TYPE:
        return convertSparqlQueryTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamStatement createStreamStatement()
  {
    StreamStatementImpl streamStatement = new StreamStatementImpl();
    return streamStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamVariableStatement createStreamVariableStatement()
  {
    StreamVariableStatementImpl streamVariableStatement = new StreamVariableStatementImpl();
    return streamVariableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamAccess createStreamAccess()
  {
    StreamAccessImpl streamAccess = new StreamAccessImpl();
    return streamAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDeclarationAccess createStreamDeclarationAccess()
  {
    StreamDeclarationAccessImpl streamDeclarationAccess = new StreamDeclarationAccessImpl();
    return streamDeclarationAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDefinition createStreamDefinition()
  {
    StreamDefinitionImpl streamDefinition = new StreamDefinitionImpl();
    return streamDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinOperator createJoinOperator()
  {
    JoinOperatorImpl joinOperator = new JoinOperatorImpl();
    return joinOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamOperatorParameter createStreamOperatorParameter()
  {
    StreamOperatorParameterImpl streamOperatorParameter = new StreamOperatorParameterImpl();
    return streamOperatorParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementJoinOperator createElementJoinOperator()
  {
    ElementJoinOperatorImpl elementJoinOperator = new ElementJoinOperatorImpl();
    return elementJoinOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterOperator createFilterOperator()
  {
    FilterOperatorImpl filterOperator = new FilterOperatorImpl();
    return filterOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplitOperator createSplitOperator()
  {
    SplitOperatorImpl splitOperator = new SplitOperatorImpl();
    return splitOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogOperator createLogOperator()
  {
    LogOperatorImpl logOperator = new LogOperatorImpl();
    return logOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomOperator createRandomOperator()
  {
    RandomOperatorImpl randomOperator = new RandomOperatorImpl();
    return randomOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTreeOperator createDecisionTreeOperator()
  {
    DecisionTreeOperatorImpl decisionTreeOperator = new DecisionTreeOperatorImpl();
    return decisionTreeOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTreeAttribute createDecisionTreeAttribute()
  {
    DecisionTreeAttributeImpl decisionTreeAttribute = new DecisionTreeAttributeImpl();
    return decisionTreeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchOperator createMatchOperator()
  {
    MatchOperatorImpl matchOperator = new MatchOperatorImpl();
    return matchOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputOperator createInputOperator()
  {
    InputOperatorImpl inputOperator = new InputOperatorImpl();
    return inputOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnTypeOperator createReturnTypeOperator()
  {
    ReturnTypeOperatorImpl returnTypeOperator = new ReturnTypeOperatorImpl();
    return returnTypeOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagOperator createTagOperator()
  {
    TagOperatorImpl tagOperator = new TagOperatorImpl();
    return tagOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPARQLOperator createSPARQLOperator()
  {
    SPARQLOperatorImpl sparqlOperator = new SPARQLOperatorImpl();
    return sparqlOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryTagOperator createQueryTagOperator()
  {
    QueryTagOperatorImpl queryTagOperator = new QueryTagOperatorImpl();
    return queryTagOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQuery createSparqlQuery()
  {
    SparqlQueryImpl sparqlQuery = new SparqlQueryImpl();
    return sparqlQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQueryVariable createSparqlQueryVariable()
  {
    SparqlQueryVariableImpl sparqlQueryVariable = new SparqlQueryVariableImpl();
    return sparqlQueryVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnTagOperator createUnTagOperator()
  {
    UnTagOperatorImpl unTagOperator = new UnTagOperatorImpl();
    return unTagOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnTagElement createUnTagElement()
  {
    UnTagElementImpl unTagElement = new UnTagElementImpl();
    return unTagElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagElement createTagElement()
  {
    TagElementImpl tagElement = new TagElementImpl();
    return tagElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagClassElement createTagClassElement()
  {
    TagClassElementImpl tagClassElement = new TagClassElementImpl();
    return tagClassElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagObjectPropertyElement createTagObjectPropertyElement()
  {
    TagObjectPropertyElementImpl tagObjectPropertyElement = new TagObjectPropertyElementImpl();
    return tagObjectPropertyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagDataTypePropertyElement createTagDataTypePropertyElement()
  {
    TagDataTypePropertyElementImpl tagDataTypePropertyElement = new TagDataTypePropertyElementImpl();
    return tagDataTypePropertyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarrierOperator createBarrierOperator()
  {
    BarrierOperatorImpl barrierOperator = new BarrierOperatorImpl();
    return barrierOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WindowOperator createWindowOperator()
  {
    WindowOperatorImpl windowOperator = new WindowOperatorImpl();
    return windowOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkerOperator createMarkerOperator()
  {
    MarkerOperatorImpl markerOperator = new MarkerOperatorImpl();
    return markerOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWRLOperator createSWRLOperator()
  {
    SWRLOperatorImpl swrlOperator = new SWRLOperatorImpl();
    return swrlOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWRLRule createSWRLRule()
  {
    SWRLRuleImpl swrlRule = new SWRLRuleImpl();
    return swrlRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountOperator createCountOperator()
  {
    CountOperatorImpl countOperator = new CountOperatorImpl();
    return countOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardDeviationOperator createStandardDeviationOperator()
  {
    StandardDeviationOperatorImpl standardDeviationOperator = new StandardDeviationOperatorImpl();
    return standardDeviationOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
<<<<<<< HEAD
  public AverageOperator createAverageOperator()
  {
    AverageOperatorImpl averageOperator = new AverageOperatorImpl();
    return averageOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOperator createAdditionOperator()
=======
  public CountOperator createCountOperator()
>>>>>>> master
  {
    AdditionOperatorImpl additionOperator = new AdditionOperatorImpl();
    return additionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtractionOperator createSubtractionOperator()
  {
    SubtractionOperatorImpl subtractionOperator = new SubtractionOperatorImpl();
    return subtractionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationOperator createMultiplicationOperator()
  {
    MultiplicationOperatorImpl multiplicationOperator = new MultiplicationOperatorImpl();
    return multiplicationOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivisionOperator createDivisionOperator()
  {
    DivisionOperatorImpl divisionOperator = new DivisionOperatorImpl();
    return divisionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuloOperator createModuloOperator()
  {
    ModuloOperatorImpl moduloOperator = new ModuloOperatorImpl();
    return moduloOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputOperator createOutputOperator()
  {
    OutputOperatorImpl outputOperator = new OutputOperatorImpl();
    return outputOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberVariableDefinition createNumberVariableDefinition()
  {
    NumberVariableDefinitionImpl numberVariableDefinition = new NumberVariableDefinitionImpl();
    return numberVariableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringVariableDefinition createStringVariableDefinition()
  {
    StringVariableDefinitionImpl stringVariableDefinition = new StringVariableDefinitionImpl();
    return stringVariableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanVariableDefinition createBooleanVariableDefinition()
  {
    BooleanVariableDefinitionImpl booleanVariableDefinition = new BooleanVariableDefinitionImpl();
    return booleanVariableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDeclaration createStructureDeclaration()
  {
    StructureDeclarationImpl structureDeclaration = new StructureDeclarationImpl();
    return structureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamDeclaration createStreamDeclaration()
  {
    StreamDeclarationImpl streamDeclaration = new StreamDeclarationImpl();
    return streamDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamElement createStreamElement()
  {
    StreamElementImpl streamElement = new StreamElementImpl();
    return streamElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureElements createStructureElements()
  {
    StructureElementsImpl structureElements = new StructureElementsImpl();
    return structureElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleDataType createSimpleDataType()
  {
    SimpleDataTypeImpl simpleDataType = new SimpleDataTypeImpl();
    return simpleDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexDataType createComplexDataType()
  {
    ComplexDataTypeImpl complexDataType = new ComplexDataTypeImpl();
    return complexDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDataType createIntegerDataType()
  {
    IntegerDataTypeImpl integerDataType = new IntegerDataTypeImpl();
    return integerDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanDataType createBooleanDataType()
  {
    BooleanDataTypeImpl booleanDataType = new BooleanDataTypeImpl();
    return booleanDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatDataType createFloatDataType()
  {
    FloatDataTypeImpl floatDataType = new FloatDataTypeImpl();
    return floatDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringDataType createStringDataType()
  {
    StringDataTypeImpl stringDataType = new StringDataTypeImpl();
    return stringDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperation createBooleanOperation()
  {
    BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
    return booleanOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall createVariableCall()
  {
    VariableCallImpl variableCall = new VariableCallImpl();
    return variableCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlQueryType createSparqlQueryTypeFromString(EDataType eDataType, String initialValue)
  {
    SparqlQueryType result = SparqlQueryType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSparqlQueryTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowPackage getFlowPackage()
  {
    return (FlowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FlowPackage getPackage()
  {
    return FlowPackage.eINSTANCE;
  }

} //FlowFactoryImpl
