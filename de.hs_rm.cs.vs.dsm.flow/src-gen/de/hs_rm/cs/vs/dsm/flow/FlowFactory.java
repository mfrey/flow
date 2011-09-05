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
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Test Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Element</em>'.
   * @generated
   */
  TestElement createTestElement();

  /**
   * Returns a new object of class '<em>Test Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Assign</em>'.
   * @generated
   */
  TestAssign createTestAssign();

  /**
   * Returns a new object of class '<em>OWL Test Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OWL Test Element</em>'.
   * @generated
   */
  OWLTestElement createOWLTestElement();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Stream Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Definition</em>'.
   * @generated
   */
  StreamDefinition createStreamDefinition();

  /**
   * Returns a new object of class '<em>Stream Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Access</em>'.
   * @generated
   */
  StreamAccess createStreamAccess();

  /**
   * Returns a new object of class '<em>Stream Operator Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Operator Parameter</em>'.
   * @generated
   */
  StreamOperatorParameter createStreamOperatorParameter();

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
   * Returns a new object of class '<em>Element Join Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Join Operator</em>'.
   * @generated
   */
  ElementJoinOperator createElementJoinOperator();

  /**
   * Returns a new object of class '<em>Tag Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Operator</em>'.
   * @generated
   */
  TagOperator createTagOperator();

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
   * Returns a new object of class '<em>Output Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Operator</em>'.
   * @generated
   */
  OutputOperator createOutputOperator();

  /**
   * Returns a new object of class '<em>Output Operator Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Operator Parameter</em>'.
   * @generated
   */
  OutputOperatorParameter createOutputOperatorParameter();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FlowPackage getFlowPackage();

} //FlowFactory
