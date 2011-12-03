/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage
 * @generated
 */
public interface FlowFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowFactory eINSTANCE = de.hs_rm.cs.vs.dsm.flow.impl.FlowFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Element</em>'.
   * @generated
   */
  ModelElement createModelElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Stream Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Statement</em>'.
   * @generated
   */
  StreamStatement createStreamStatement();

  /**
   * Returns a new object of class '<em>Stream Variable Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Variable Statement</em>'.
   * @generated
   */
  StreamVariableStatement createStreamVariableStatement();

  /**
   * Returns a new object of class '<em>Stream Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Access</em>'.
   * @generated
   */
  StreamAccess createStreamAccess();

  /**
   * Returns a new object of class '<em>Stream Declaration Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Declaration Access</em>'.
   * @generated
   */
  StreamDeclarationAccess createStreamDeclarationAccess();

  /**
   * Returns a new object of class '<em>Stream Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Definition</em>'.
   * @generated
   */
  StreamDefinition createStreamDefinition();

  /**
   * Returns a new object of class '<em>Join Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Operator</em>'.
   * @generated
   */
  JoinOperator createJoinOperator();

  /**
   * Returns a new object of class '<em>Stream Operator Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Operator Parameter</em>'.
   * @generated
   */
  StreamOperatorParameter createStreamOperatorParameter();

  /**
   * Returns a new object of class '<em>Element Join Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Join Operator</em>'.
   * @generated
   */
  ElementJoinOperator createElementJoinOperator();

  /**
   * Returns a new object of class '<em>Filter Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Operator</em>'.
   * @generated
   */
  FilterOperator createFilterOperator();

  /**
   * Returns a new object of class '<em>Split Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Split Operator</em>'.
   * @generated
   */
  SplitOperator createSplitOperator();

  /**
   * Returns a new object of class '<em>Log Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Log Operator</em>'.
   * @generated
   */
  LogOperator createLogOperator();

  /**
   * Returns a new object of class '<em>Random Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Random Operator</em>'.
   * @generated
   */
  RandomOperator createRandomOperator();

  /**
   * Returns a new object of class '<em>Match Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Operator</em>'.
   * @generated
   */
  MatchOperator createMatchOperator();

  /**
   * Returns a new object of class '<em>Input Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Operator</em>'.
   * @generated
   */
  InputOperator createInputOperator();

  /**
   * Returns a new object of class '<em>Return Type Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Type Operator</em>'.
   * @generated
   */
  ReturnTypeOperator createReturnTypeOperator();

  /**
   * Returns a new object of class '<em>No Return Type Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Return Type Operator</em>'.
   * @generated
   */
  NoReturnTypeOperator createNoReturnTypeOperator();

  /**
   * Returns a new object of class '<em>Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Operator</em>'.
   * @generated
   */
  TagOperator createTagOperator();

  /**
   * Returns a new object of class '<em>New Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Tag Operator</em>'.
   * @generated
   */
  NewTagOperator createNewTagOperator();

  /**
   * Returns a new object of class '<em>Query Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Tag Operator</em>'.
   * @generated
   */
  QueryTagOperator createQueryTagOperator();

  /**
   * Returns a new object of class '<em>Sparql Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sparql Query</em>'.
   * @generated
   */
  SparqlQuery createSparqlQuery();

  /**
   * Returns a new object of class '<em>Sparql Query Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sparql Query Variable</em>'.
   * @generated
   */
  SparqlQueryVariable createSparqlQueryVariable();

  /**
   * Returns a new object of class '<em>Un Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Tag Operator</em>'.
   * @generated
   */
  UnTagOperator createUnTagOperator();

  /**
   * Returns a new object of class '<em>Un Tag Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Tag Element</em>'.
   * @generated
   */
  UnTagElement createUnTagElement();

  /**
   * Returns a new object of class '<em>Tag Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Element</em>'.
   * @generated
   */
  TagElement createTagElement();

  /**
   * Returns a new object of class '<em>Tag Class Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Class Element</em>'.
   * @generated
   */
  TagClassElement createTagClassElement();

  /**
   * Returns a new object of class '<em>Tag Object Property Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Object Property Element</em>'.
   * @generated
   */
  TagObjectPropertyElement createTagObjectPropertyElement();

  /**
   * Returns a new object of class '<em>Tag Data Type Property Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Data Type Property Element</em>'.
   * @generated
   */
  TagDataTypePropertyElement createTagDataTypePropertyElement();

  /**
   * Returns a new object of class '<em>Barrier Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Barrier Operator</em>'.
   * @generated
   */
  BarrierOperator createBarrierOperator();

  /**
   * Returns a new object of class '<em>Window Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Window Operator</em>'.
   * @generated
   */
  WindowOperator createWindowOperator();

  /**
   * Returns a new object of class '<em>Marker Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Marker Operator</em>'.
   * @generated
   */
  MarkerOperator createMarkerOperator();

  /**
   * Returns a new object of class '<em>SWRL Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SWRL Operator</em>'.
   * @generated
   */
  SWRLOperator createSWRLOperator();

  /**
   * Returns a new object of class '<em>SWRL Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SWRL Rule</em>'.
   * @generated
   */
  SWRLRule createSWRLRule();

  /**
   * Returns a new object of class '<em>Antecedent Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Antecedent Rule</em>'.
   * @generated
   */
  AntecedentRule createAntecedentRule();

  /**
   * Returns a new object of class '<em>Consequent Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Consequent Rule</em>'.
   * @generated
   */
  ConsequentRule createConsequentRule();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Count Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Operator</em>'.
   * @generated
   */
  CountOperator createCountOperator();

  /**
   * Returns a new object of class '<em>Standard Deviation Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standard Deviation Operator</em>'.
   * @generated
   */
  StandardDeviationOperator createStandardDeviationOperator();

  /**
   * Returns a new object of class '<em>Average Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Average Operator</em>'.
   * @generated
   */
  AverageOperator createAverageOperator();

  /**
   * Returns a new object of class '<em>Addition Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Operator</em>'.
   * @generated
   */
  AdditionOperator createAdditionOperator();

  /**
   * Returns a new object of class '<em>Subtraction Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtraction Operator</em>'.
   * @generated
   */
  SubtractionOperator createSubtractionOperator();

  /**
   * Returns a new object of class '<em>Multiplication Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Operator</em>'.
   * @generated
   */
  MultiplicationOperator createMultiplicationOperator();

  /**
   * Returns a new object of class '<em>Division Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division Operator</em>'.
   * @generated
   */
  DivisionOperator createDivisionOperator();

  /**
   * Returns a new object of class '<em>Output Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Operator</em>'.
   * @generated
   */
  OutputOperator createOutputOperator();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Number Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Variable Definition</em>'.
   * @generated
   */
  NumberVariableDefinition createNumberVariableDefinition();

  /**
   * Returns a new object of class '<em>String Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Variable Definition</em>'.
   * @generated
   */
  StringVariableDefinition createStringVariableDefinition();

  /**
   * Returns a new object of class '<em>Boolean Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Variable Definition</em>'.
   * @generated
   */
  BooleanVariableDefinition createBooleanVariableDefinition();

  /**
   * Returns a new object of class '<em>Structure Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Declaration</em>'.
   * @generated
   */
  StructureDeclaration createStructureDeclaration();

  /**
   * Returns a new object of class '<em>Stream Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Declaration</em>'.
   * @generated
   */
  StreamDeclaration createStreamDeclaration();

  /**
   * Returns a new object of class '<em>Stream Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Element</em>'.
   * @generated
   */
  StreamElement createStreamElement();

  /**
   * Returns a new object of class '<em>Structure Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Elements</em>'.
   * @generated
   */
  StructureElements createStructureElements();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Simple Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Data Type</em>'.
   * @generated
   */
  SimpleDataType createSimpleDataType();

  /**
   * Returns a new object of class '<em>Complex Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Data Type</em>'.
   * @generated
   */
  ComplexDataType createComplexDataType();

  /**
   * Returns a new object of class '<em>Integer Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Data Type</em>'.
   * @generated
   */
  IntegerDataType createIntegerDataType();

  /**
   * Returns a new object of class '<em>Boolean Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Data Type</em>'.
   * @generated
   */
  BooleanDataType createBooleanDataType();

  /**
   * Returns a new object of class '<em>Float Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Data Type</em>'.
   * @generated
   */
  FloatDataType createFloatDataType();

  /**
   * Returns a new object of class '<em>String Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Data Type</em>'.
   * @generated
   */
  StringDataType createStringDataType();

  /**
   * Returns a new object of class '<em>Boolean Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Operation</em>'.
   * @generated
   */
  BooleanOperation createBooleanOperation();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Variable Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Call</em>'.
   * @generated
   */
  VariableCall createVariableCall();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FlowPackage getFlowPackage();

} //FlowFactory
