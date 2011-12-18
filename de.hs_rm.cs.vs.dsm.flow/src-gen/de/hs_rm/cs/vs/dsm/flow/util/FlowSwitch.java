/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.util;

import de.hs_rm.cs.vs.dsm.flow.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FlowPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseModelElement(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseModelElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_STATEMENT:
      {
        StreamStatement streamStatement = (StreamStatement)theEObject;
        T result = caseStreamStatement(streamStatement);
        if (result == null) result = caseModelElement(streamStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_VARIABLE_STATEMENT:
      {
        StreamVariableStatement streamVariableStatement = (StreamVariableStatement)theEObject;
        T result = caseStreamVariableStatement(streamVariableStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_ACCESS:
      {
        StreamAccess streamAccess = (StreamAccess)theEObject;
        T result = caseStreamAccess(streamAccess);
        if (result == null) result = caseModelElement(streamAccess);
        if (result == null) result = caseExpression(streamAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_DECLARATION_ACCESS:
      {
        StreamDeclarationAccess streamDeclarationAccess = (StreamDeclarationAccess)theEObject;
        T result = caseStreamDeclarationAccess(streamDeclarationAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_DEFINITION:
      {
        StreamDefinition streamDefinition = (StreamDefinition)theEObject;
        T result = caseStreamDefinition(streamDefinition);
        if (result == null) result = caseModelElement(streamDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.JOIN_OPERATOR:
      {
        JoinOperator joinOperator = (JoinOperator)theEObject;
        T result = caseJoinOperator(joinOperator);
        if (result == null) result = caseReturnTypeOperator(joinOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_OPERATOR_PARAMETER:
      {
        StreamOperatorParameter streamOperatorParameter = (StreamOperatorParameter)theEObject;
        T result = caseStreamOperatorParameter(streamOperatorParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.ELEMENT_JOIN_OPERATOR:
      {
        ElementJoinOperator elementJoinOperator = (ElementJoinOperator)theEObject;
        T result = caseElementJoinOperator(elementJoinOperator);
        if (result == null) result = caseReturnTypeOperator(elementJoinOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.FILTER_OPERATOR:
      {
        FilterOperator filterOperator = (FilterOperator)theEObject;
        T result = caseFilterOperator(filterOperator);
        if (result == null) result = caseReturnTypeOperator(filterOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SPLIT_OPERATOR:
      {
        SplitOperator splitOperator = (SplitOperator)theEObject;
        T result = caseSplitOperator(splitOperator);
        if (result == null) result = caseReturnTypeOperator(splitOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.LOG_OPERATOR:
      {
        LogOperator logOperator = (LogOperator)theEObject;
        T result = caseLogOperator(logOperator);
        if (result == null) result = caseReturnTypeOperator(logOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.RANDOM_OPERATOR:
      {
        RandomOperator randomOperator = (RandomOperator)theEObject;
        T result = caseRandomOperator(randomOperator);
        if (result == null) result = caseReturnTypeOperator(randomOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.DECISION_TREE_OPERATOR:
      {
        DecisionTreeOperator decisionTreeOperator = (DecisionTreeOperator)theEObject;
        T result = caseDecisionTreeOperator(decisionTreeOperator);
        if (result == null) result = caseReturnTypeOperator(decisionTreeOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.DECISION_TREE_ATTRIBUTE:
      {
        DecisionTreeAttribute decisionTreeAttribute = (DecisionTreeAttribute)theEObject;
        T result = caseDecisionTreeAttribute(decisionTreeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MATCH_OPERATOR:
      {
        MatchOperator matchOperator = (MatchOperator)theEObject;
        T result = caseMatchOperator(matchOperator);
        if (result == null) result = caseReturnTypeOperator(matchOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.INPUT_OPERATOR:
      {
        InputOperator inputOperator = (InputOperator)theEObject;
        T result = caseInputOperator(inputOperator);
        if (result == null) result = caseReturnTypeOperator(inputOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.RETURN_TYPE_OPERATOR:
      {
        ReturnTypeOperator returnTypeOperator = (ReturnTypeOperator)theEObject;
        T result = caseReturnTypeOperator(returnTypeOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_OPERATOR:
      {
        TagOperator tagOperator = (TagOperator)theEObject;
        T result = caseTagOperator(tagOperator);
        if (result == null) result = caseReturnTypeOperator(tagOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SPARQL_OPERATOR:
      {
        SPARQLOperator sparqlOperator = (SPARQLOperator)theEObject;
        T result = caseSPARQLOperator(sparqlOperator);
        if (result == null) result = caseReturnTypeOperator(sparqlOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.QUERY_TAG_OPERATOR:
      {
        QueryTagOperator queryTagOperator = (QueryTagOperator)theEObject;
        T result = caseQueryTagOperator(queryTagOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SPARQL_QUERY:
      {
        SparqlQuery sparqlQuery = (SparqlQuery)theEObject;
        T result = caseSparqlQuery(sparqlQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SPARQL_QUERY_VARIABLE:
      {
        SparqlQueryVariable sparqlQueryVariable = (SparqlQueryVariable)theEObject;
        T result = caseSparqlQueryVariable(sparqlQueryVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.UN_TAG_OPERATOR:
      {
        UnTagOperator unTagOperator = (UnTagOperator)theEObject;
        T result = caseUnTagOperator(unTagOperator);
        if (result == null) result = caseReturnTypeOperator(unTagOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.UN_TAG_ELEMENT:
      {
        UnTagElement unTagElement = (UnTagElement)theEObject;
        T result = caseUnTagElement(unTagElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_ELEMENT:
      {
        TagElement tagElement = (TagElement)theEObject;
        T result = caseTagElement(tagElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_CLASS_ELEMENT:
      {
        TagClassElement tagClassElement = (TagClassElement)theEObject;
        T result = caseTagClassElement(tagClassElement);
        if (result == null) result = caseTagElement(tagClassElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_OBJECT_PROPERTY_ELEMENT:
      {
        TagObjectPropertyElement tagObjectPropertyElement = (TagObjectPropertyElement)theEObject;
        T result = caseTagObjectPropertyElement(tagObjectPropertyElement);
        if (result == null) result = caseTagElement(tagObjectPropertyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_DATA_TYPE_PROPERTY_ELEMENT:
      {
        TagDataTypePropertyElement tagDataTypePropertyElement = (TagDataTypePropertyElement)theEObject;
        T result = caseTagDataTypePropertyElement(tagDataTypePropertyElement);
        if (result == null) result = caseTagElement(tagDataTypePropertyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.BARRIER_OPERATOR:
      {
        BarrierOperator barrierOperator = (BarrierOperator)theEObject;
        T result = caseBarrierOperator(barrierOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.WINDOW_OPERATOR:
      {
        WindowOperator windowOperator = (WindowOperator)theEObject;
        T result = caseWindowOperator(windowOperator);
        if (result == null) result = caseBarrierOperator(windowOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MARKER_OPERATOR:
      {
        MarkerOperator markerOperator = (MarkerOperator)theEObject;
        T result = caseMarkerOperator(markerOperator);
        if (result == null) result = caseBarrierOperator(markerOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SWRL_OPERATOR:
      {
        SWRLOperator swrlOperator = (SWRLOperator)theEObject;
        T result = caseSWRLOperator(swrlOperator);
        if (result == null) result = caseReturnTypeOperator(swrlOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SWRL_RULE:
      {
        SWRLRule swrlRule = (SWRLRule)theEObject;
        T result = caseSWRLRule(swrlRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.COUNT_OPERATOR:
      {
        CountOperator countOperator = (CountOperator)theEObject;
        T result = caseCountOperator(countOperator);
        if (result == null) result = caseReturnTypeOperator(countOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STANDARD_DEVIATION_OPERATOR:
      {
        StandardDeviationOperator standardDeviationOperator = (StandardDeviationOperator)theEObject;
        T result = caseStandardDeviationOperator(standardDeviationOperator);
        if (result == null) result = caseReturnTypeOperator(standardDeviationOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.AVERAGE_OPERATOR:
      {
        AverageOperator averageOperator = (AverageOperator)theEObject;
        T result = caseAverageOperator(averageOperator);
        if (result == null) result = caseReturnTypeOperator(averageOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.ADDITION_OPERATOR:
      {
        AdditionOperator additionOperator = (AdditionOperator)theEObject;
        T result = caseAdditionOperator(additionOperator);
        if (result == null) result = caseReturnTypeOperator(additionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SUBTRACTION_OPERATOR:
      {
        SubtractionOperator subtractionOperator = (SubtractionOperator)theEObject;
        T result = caseSubtractionOperator(subtractionOperator);
        if (result == null) result = caseReturnTypeOperator(subtractionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MULTIPLICATION_OPERATOR:
      {
        MultiplicationOperator multiplicationOperator = (MultiplicationOperator)theEObject;
        T result = caseMultiplicationOperator(multiplicationOperator);
        if (result == null) result = caseReturnTypeOperator(multiplicationOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.DIVISION_OPERATOR:
      {
        DivisionOperator divisionOperator = (DivisionOperator)theEObject;
        T result = caseDivisionOperator(divisionOperator);
        if (result == null) result = caseReturnTypeOperator(divisionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MODULO_OPERATOR:
      {
        ModuloOperator moduloOperator = (ModuloOperator)theEObject;
        T result = caseModuloOperator(moduloOperator);
        if (result == null) result = caseReturnTypeOperator(moduloOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OUTPUT_OPERATOR:
      {
        OutputOperator outputOperator = (OutputOperator)theEObject;
        T result = caseOutputOperator(outputOperator);
        if (result == null) result = caseReturnTypeOperator(outputOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.VARIABLE_DEFINITION:
      {
        VariableDefinition variableDefinition = (VariableDefinition)theEObject;
        T result = caseVariableDefinition(variableDefinition);
        if (result == null) result = caseModelElement(variableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseStreamElement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.NUMBER_VARIABLE_DEFINITION:
      {
        NumberVariableDefinition numberVariableDefinition = (NumberVariableDefinition)theEObject;
        T result = caseNumberVariableDefinition(numberVariableDefinition);
        if (result == null) result = caseVariableDefinition(numberVariableDefinition);
        if (result == null) result = caseModelElement(numberVariableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STRING_VARIABLE_DEFINITION:
      {
        StringVariableDefinition stringVariableDefinition = (StringVariableDefinition)theEObject;
        T result = caseStringVariableDefinition(stringVariableDefinition);
        if (result == null) result = caseVariableDefinition(stringVariableDefinition);
        if (result == null) result = caseModelElement(stringVariableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.BOOLEAN_VARIABLE_DEFINITION:
      {
        BooleanVariableDefinition booleanVariableDefinition = (BooleanVariableDefinition)theEObject;
        T result = caseBooleanVariableDefinition(booleanVariableDefinition);
        if (result == null) result = caseVariableDefinition(booleanVariableDefinition);
        if (result == null) result = caseModelElement(booleanVariableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STRUCTURE_DECLARATION:
      {
        StructureDeclaration structureDeclaration = (StructureDeclaration)theEObject;
        T result = caseStructureDeclaration(structureDeclaration);
        if (result == null) result = caseModelElement(structureDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_DECLARATION:
      {
        StreamDeclaration streamDeclaration = (StreamDeclaration)theEObject;
        T result = caseStreamDeclaration(streamDeclaration);
        if (result == null) result = caseModelElement(streamDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM_ELEMENT:
      {
        StreamElement streamElement = (StreamElement)theEObject;
        T result = caseStreamElement(streamElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STRUCTURE_ELEMENTS:
      {
        StructureElements structureElements = (StructureElements)theEObject;
        T result = caseStructureElements(structureElements);
        if (result == null) result = caseStreamElement(structureElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SIMPLE_DATA_TYPE:
      {
        SimpleDataType simpleDataType = (SimpleDataType)theEObject;
        T result = caseSimpleDataType(simpleDataType);
        if (result == null) result = caseDataType(simpleDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.COMPLEX_DATA_TYPE:
      {
        ComplexDataType complexDataType = (ComplexDataType)theEObject;
        T result = caseComplexDataType(complexDataType);
        if (result == null) result = caseDataType(complexDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.INTEGER_DATA_TYPE:
      {
        IntegerDataType integerDataType = (IntegerDataType)theEObject;
        T result = caseIntegerDataType(integerDataType);
        if (result == null) result = caseSimpleDataType(integerDataType);
        if (result == null) result = caseDataType(integerDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.BOOLEAN_DATA_TYPE:
      {
        BooleanDataType booleanDataType = (BooleanDataType)theEObject;
        T result = caseBooleanDataType(booleanDataType);
        if (result == null) result = caseSimpleDataType(booleanDataType);
        if (result == null) result = caseDataType(booleanDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.FLOAT_DATA_TYPE:
      {
        FloatDataType floatDataType = (FloatDataType)theEObject;
        T result = caseFloatDataType(floatDataType);
        if (result == null) result = caseSimpleDataType(floatDataType);
        if (result == null) result = caseDataType(floatDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STRING_DATA_TYPE:
      {
        StringDataType stringDataType = (StringDataType)theEObject;
        T result = caseStringDataType(stringDataType);
        if (result == null) result = caseComplexDataType(stringDataType);
        if (result == null) result = caseDataType(stringDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.BOOLEAN_OPERATION:
      {
        BooleanOperation booleanOperation = (BooleanOperation)theEObject;
        T result = caseBooleanOperation(booleanOperation);
        if (result == null) result = caseExpression(booleanOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.VARIABLE_CALL:
      {
        VariableCall variableCall = (VariableCall)theEObject;
        T result = caseVariableCall(variableCall);
        if (result == null) result = caseExpression(variableCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamStatement(StreamStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Variable Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Variable Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamVariableStatement(StreamVariableStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamAccess(StreamAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Declaration Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Declaration Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamDeclarationAccess(StreamDeclarationAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamDefinition(StreamDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinOperator(JoinOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Operator Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Operator Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamOperatorParameter(StreamOperatorParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Join Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Join Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementJoinOperator(ElementJoinOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterOperator(FilterOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Split Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Split Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSplitOperator(SplitOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Log Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Log Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogOperator(LogOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Random Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Random Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRandomOperator(RandomOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Tree Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Tree Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTreeOperator(DecisionTreeOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Tree Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Tree Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTreeAttribute(DecisionTreeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchOperator(MatchOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputOperator(InputOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Type Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Type Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnTypeOperator(ReturnTypeOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagOperator(TagOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPARQL Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPARQL Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPARQLOperator(SPARQLOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Tag Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryTagOperator(QueryTagOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sparql Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sparql Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSparqlQuery(SparqlQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sparql Query Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sparql Query Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSparqlQueryVariable(SparqlQueryVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Un Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Un Tag Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnTagOperator(UnTagOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Un Tag Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Un Tag Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnTagElement(UnTagElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagElement(TagElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag Class Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag Class Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagClassElement(TagClassElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag Object Property Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag Object Property Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagObjectPropertyElement(TagObjectPropertyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag Data Type Property Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag Data Type Property Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagDataTypePropertyElement(TagDataTypePropertyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Barrier Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Barrier Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBarrierOperator(BarrierOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Window Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Window Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWindowOperator(WindowOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Marker Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Marker Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarkerOperator(MarkerOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SWRL Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SWRL Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSWRLOperator(SWRLOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SWRL Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SWRL Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSWRLRule(SWRLRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountOperator(CountOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard Deviation Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard Deviation Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardDeviationOperator(StandardDeviationOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Average Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Average Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAverageOperator(AverageOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionOperator(AdditionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtraction Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtraction Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtractionOperator(SubtractionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationOperator(MultiplicationOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivisionOperator(DivisionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modulo Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modulo Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuloOperator(ModuloOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputOperator(OutputOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinition(VariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberVariableDefinition(NumberVariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVariableDefinition(StringVariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanVariableDefinition(BooleanVariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureDeclaration(StructureDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamDeclaration(StreamDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamElement(StreamElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureElements(StructureElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleDataType(SimpleDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexDataType(ComplexDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerDataType(IntegerDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanDataType(BooleanDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatDataType(FloatDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringDataType(StringDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanOperation(BooleanOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableCall(VariableCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FlowSwitch
