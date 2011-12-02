/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hs_rm.cs.vs.dsm.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "flow";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hs_rm.de/cs/vs/dsm/Flow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "flow";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowPackage eINSTANCE = de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl.init();

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ModelImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODELS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ModelElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.PackageDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamStatementImpl <em>Stream Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamStatementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamStatement()
   * @generated
   */
  int STREAM_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Return Stream</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT__RETURN_STREAM = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT__OPERATOR = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamVariableStatementImpl <em>Stream Variable Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamVariableStatementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamVariableStatement()
   * @generated
   */
  int STREAM_VARIABLE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_VARIABLE_STATEMENT__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_VARIABLE_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Stream Variable Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_VARIABLE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl <em>Stream Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamAccess()
   * @generated
   */
  int STREAM_ACCESS = 6;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS__REFERENCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS__ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS__STREAM_VARIABLE = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Stream Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationAccessImpl <em>Stream Declaration Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationAccessImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDeclarationAccess()
   * @generated
   */
  int STREAM_DECLARATION_ACCESS = 7;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION_ACCESS__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION_ACCESS__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Stream Declaration Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION_ACCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl <em>Stream Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDefinition()
   * @generated
   */
  int STREAM_DEFINITION = 8;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DEFINITION__REFERENCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DEFINITION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DEFINITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ReturnTypeOperatorImpl <em>Return Type Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ReturnTypeOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getReturnTypeOperator()
   * @generated
   */
  int RETURN_TYPE_OPERATOR = 18;

  /**
   * The number of structural features of the '<em>Return Type Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE_OPERATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.JoinOperatorImpl <em>Join Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.JoinOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getJoinOperator()
   * @generated
   */
  int JOIN_OPERATOR = 9;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_OPERATOR__PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Join Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl <em>Stream Operator Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamOperatorParameter()
   * @generated
   */
  int STREAM_OPERATOR_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>Stream</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_OPERATOR_PARAMETER__STREAM = 0;

  /**
   * The feature id for the '<em><b>Barrier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_OPERATOR_PARAMETER__BARRIER = 1;

  /**
   * The number of structural features of the '<em>Stream Operator Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_OPERATOR_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl <em>Element Join Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getElementJoinOperator()
   * @generated
   */
  int ELEMENT_JOIN_OPERATOR = 11;

  /**
   * The feature id for the '<em><b>Element Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Element Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Element Join Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.FilterOperatorImpl <em>Filter Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FilterOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getFilterOperator()
   * @generated
   */
  int FILTER_OPERATOR = 12;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_OPERATOR__EXPRESSION = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Filter Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SplitOperatorImpl <em>Split Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SplitOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSplitOperator()
   * @generated
   */
  int SPLIT_OPERATOR = 13;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Split Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl <em>Match Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMatchOperator()
   * @generated
   */
  int MATCH_OPERATOR = 14;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_OPERATOR__EXPRESSION = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Calculation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_OPERATOR__CALCULATION = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Match Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SymmetricDifferenceOperatorImpl <em>Symmetric Difference Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SymmetricDifferenceOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSymmetricDifferenceOperator()
   * @generated
   */
  int SYMMETRIC_DIFFERENCE_OPERATOR = 15;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMMETRIC_DIFFERENCE_OPERATOR__PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symmetric Difference Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMMETRIC_DIFFERENCE_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DifferenceOperatorImpl <em>Difference Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.DifferenceOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDifferenceOperator()
   * @generated
   */
  int DIFFERENCE_OPERATOR = 16;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENCE_OPERATOR__PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Difference Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENCE_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl <em>Input Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getInputOperator()
   * @generated
   */
  int INPUT_OPERATOR = 17;

  /**
   * The feature id for the '<em><b>Iri</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATOR__IRI = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATOR__ADDRESS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATOR__PORT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Input Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NoReturnTypeOperatorImpl <em>No Return Type Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.NoReturnTypeOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNoReturnTypeOperator()
   * @generated
   */
  int NO_RETURN_TYPE_OPERATOR = 19;

  /**
   * The number of structural features of the '<em>No Return Type Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl <em>Tag Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagOperator()
   * @generated
   */
  int TAG_OPERATOR = 20;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATOR__PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tag Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NewTagOperatorImpl <em>New Tag Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.NewTagOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNewTagOperator()
   * @generated
   */
  int NEW_TAG_OPERATOR = 21;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TAG_OPERATOR__QUERY = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TAG_OPERATOR__TARGET = 1;

  /**
   * The number of structural features of the '<em>New Tag Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TAG_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl <em>Query Tag Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getQueryTagOperator()
   * @generated
   */
  int QUERY_TAG_OPERATOR = 22;

  /**
   * The feature id for the '<em><b>Query Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TAG_OPERATOR__QUERY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TAG_OPERATOR__QUERY = 1;

  /**
   * The number of structural features of the '<em>Query Tag Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_TAG_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl <em>Sparql Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQuery()
   * @generated
   */
  int SPARQL_QUERY = 23;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Sparql Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryVariableImpl <em>Sparql Query Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryVariableImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQueryVariable()
   * @generated
   */
  int SPARQL_QUERY_VARIABLE = 24;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY_VARIABLE__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Sparql Query Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPARQL_QUERY_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.UnTagOperatorImpl <em>Un Tag Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.UnTagOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getUnTagOperator()
   * @generated
   */
  int UN_TAG_OPERATOR = 25;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_OPERATOR__PARAMETERS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Un Tag Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.UnTagElementImpl <em>Un Tag Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.UnTagElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getUnTagElement()
   * @generated
   */
  int UN_TAG_ELEMENT = 26;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_ELEMENT__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_ELEMENT__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Un Tag Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_TAG_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl <em>Tag Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagElement()
   * @generated
   */
  int TAG_ELEMENT = 27;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_ELEMENT__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Tag Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagClassElementImpl <em>Tag Class Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagClassElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagClassElement()
   * @generated
   */
  int TAG_CLASS_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_CLASS_ELEMENT__REFERENCE = TAG_ELEMENT__REFERENCE;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_CLASS_ELEMENT__ELEMENT = TAG_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tag Class Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_CLASS_ELEMENT_FEATURE_COUNT = TAG_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagObjectPropertyElementImpl <em>Tag Object Property Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagObjectPropertyElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagObjectPropertyElement()
   * @generated
   */
  int TAG_OBJECT_PROPERTY_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OBJECT_PROPERTY_ELEMENT__REFERENCE = TAG_ELEMENT__REFERENCE;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT = TAG_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tag Object Property Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OBJECT_PROPERTY_ELEMENT_FEATURE_COUNT = TAG_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagDataTypePropertyElementImpl <em>Tag Data Type Property Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagDataTypePropertyElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagDataTypePropertyElement()
   * @generated
   */
  int TAG_DATA_TYPE_PROPERTY_ELEMENT = 30;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_DATA_TYPE_PROPERTY_ELEMENT__REFERENCE = TAG_ELEMENT__REFERENCE;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT = TAG_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tag Data Type Property Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_DATA_TYPE_PROPERTY_ELEMENT_FEATURE_COUNT = TAG_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl <em>Barrier Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBarrierOperator()
   * @generated
   */
  int BARRIER_OPERATOR = 31;

  /**
   * The number of structural features of the '<em>Barrier Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARRIER_OPERATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.WindowOperatorImpl <em>Window Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.WindowOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getWindowOperator()
   * @generated
   */
  int WINDOW_OPERATOR = 32;

  /**
   * The feature id for the '<em><b>Setting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_OPERATOR__SETTING = BARRIER_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_OPERATOR__VALUE = BARRIER_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_OPERATOR__UNIT = BARRIER_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Window Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_OPERATOR_FEATURE_COUNT = BARRIER_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MarkerOperatorImpl <em>Marker Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.MarkerOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMarkerOperator()
   * @generated
   */
  int MARKER_OPERATOR = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER_OPERATOR__EXPRESSION = BARRIER_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Marker Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKER_OPERATOR_FEATURE_COUNT = BARRIER_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl <em>SWRL Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSWRLOperator()
   * @generated
   */
  int SWRL_OPERATOR = 34;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_OPERATOR__RULE = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Barrier</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_OPERATOR__BARRIER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SWRL Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl <em>SWRL Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSWRLRule()
   * @generated
   */
  int SWRL_RULE = 35;

  /**
   * The feature id for the '<em><b>Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_RULE__ANTECEDENT = 0;

  /**
   * The feature id for the '<em><b>Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_RULE__CONSEQUENT = 1;

  /**
   * The number of structural features of the '<em>SWRL Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWRL_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AntecedentRuleImpl <em>Antecedent Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.AntecedentRuleImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAntecedentRule()
   * @generated
   */
  int ANTECEDENT_RULE = 36;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTECEDENT_RULE__ATOMS = 0;

  /**
   * The number of structural features of the '<em>Antecedent Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTECEDENT_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ConsequentRuleImpl <em>Consequent Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ConsequentRuleImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getConsequentRule()
   * @generated
   */
  int CONSEQUENT_RULE = 37;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSEQUENT_RULE__ATOMS = 0;

  /**
   * The number of structural features of the '<em>Consequent Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSEQUENT_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.RuleImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getRule()
   * @generated
   */
  int RULE = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OCLOperatorImpl <em>OCL Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OCLOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOCLOperator()
   * @generated
   */
  int OCL_OPERATOR = 39;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATOR__CONSTRAINT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>OCL Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl <em>Count Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getCountOperator()
   * @generated
   */
  int COUNT_OPERATOR = 40;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Count Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl <em>Standard Deviation Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStandardDeviationOperator()
   * @generated
   */
  int STANDARD_DEVIATION_OPERATOR = 41;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Standard Deviation Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl <em>Average Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAverageOperator()
   * @generated
   */
  int AVERAGE_OPERATOR = 42;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR__STREAM = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Average Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl <em>Addition Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAdditionOperator()
   * @generated
   */
  int ADDITION_OPERATOR = 43;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OPERATOR__LITERAL = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OPERATOR__STREAM_ELEMENTS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Addition Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl <em>Subtraction Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSubtractionOperator()
   * @generated
   */
  int SUBTRACTION_OPERATOR = 44;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_OPERATOR__LITERAL = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_OPERATOR__STREAM_ELEMENTS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Subtraction Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MultiplicationOperatorImpl <em>Multiplication Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.MultiplicationOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMultiplicationOperator()
   * @generated
   */
  int MULTIPLICATION_OPERATOR = 45;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_OPERATOR__LITERAL = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_OPERATOR__STREAM_ELEMENTS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplication Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DivisionOperatorImpl <em>Division Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.DivisionOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDivisionOperator()
   * @generated
   */
  int DIVISION_OPERATOR = 46;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_OPERATOR__PARAMETER = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_OPERATOR__LITERAL = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_OPERATOR__STREAM_ELEMENTS = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Division Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_OPERATOR_FEATURE_COUNT = RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl <em>Output Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperator()
   * @generated
   */
  int OUTPUT_OPERATOR = 47;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__STREAM = NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iri</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__IRI = NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__ADDRESS = NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__PORT = NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Output Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR_FEATURE_COUNT = NO_RETURN_TYPE_OPERATOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl <em>Stream Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamElement()
   * @generated
   */
  int STREAM_ELEMENT = 55;

  /**
   * The number of structural features of the '<em>Stream Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 49;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = STREAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = STREAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = STREAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NumberVariableDefinitionImpl <em>Number Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.NumberVariableDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNumberVariableDefinition()
   * @generated
   */
  int NUMBER_VARIABLE_DEFINITION = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VARIABLE_DEFINITION__NAME = VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VARIABLE_DEFINITION__TYPE = VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VARIABLE_DEFINITION__VALUE = VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VARIABLE_DEFINITION_FEATURE_COUNT = VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StringVariableDefinitionImpl <em>String Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StringVariableDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStringVariableDefinition()
   * @generated
   */
  int STRING_VARIABLE_DEFINITION = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE_DEFINITION__NAME = VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE_DEFINITION__TYPE = VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE_DEFINITION__VALUE = VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE_DEFINITION_FEATURE_COUNT = VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanVariableDefinitionImpl <em>Boolean Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanVariableDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanVariableDefinition()
   * @generated
   */
  int BOOLEAN_VARIABLE_DEFINITION = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VARIABLE_DEFINITION__NAME = VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VARIABLE_DEFINITION__TYPE = VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VARIABLE_DEFINITION__VALUE = VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VARIABLE_DEFINITION_FEATURE_COUNT = VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StructureDeclarationImpl <em>Structure Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StructureDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStructureDeclaration()
   * @generated
   */
  int STRUCTURE_DECLARATION = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_DECLARATION__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl <em>Stream Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDeclaration()
   * @generated
   */
  int STREAM_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_DECLARATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StructureElementsImpl <em>Structure Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StructureElementsImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStructureElements()
   * @generated
   */
  int STRUCTURE_ELEMENTS = 56;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENTS__ELEMENT = STREAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Structure Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_ELEMENTS_FEATURE_COUNT = STREAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ExpressionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 57;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.DataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 58;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.SimpleDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSimpleDataType()
   * @generated
   */
  int SIMPLE_DATA_TYPE = 59;

  /**
   * The number of structural features of the '<em>Simple Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ComplexDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getComplexDataType()
   * @generated
   */
  int COMPLEX_DATA_TYPE = 60;

  /**
   * The number of structural features of the '<em>Complex Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.IntegerDataTypeImpl <em>Integer Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.IntegerDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getIntegerDataType()
   * @generated
   */
  int INTEGER_DATA_TYPE = 61;

  /**
   * The number of structural features of the '<em>Integer Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DATA_TYPE_FEATURE_COUNT = SIMPLE_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanDataTypeImpl <em>Boolean Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanDataType()
   * @generated
   */
  int BOOLEAN_DATA_TYPE = 62;

  /**
   * The number of structural features of the '<em>Boolean Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DATA_TYPE_FEATURE_COUNT = SIMPLE_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.FloatDataTypeImpl <em>Float Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FloatDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getFloatDataType()
   * @generated
   */
  int FLOAT_DATA_TYPE = 63;

  /**
   * The number of structural features of the '<em>Float Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_DATA_TYPE_FEATURE_COUNT = SIMPLE_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StringDataTypeImpl <em>String Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StringDataTypeImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStringDataType()
   * @generated
   */
  int STRING_DATA_TYPE = 64;

  /**
   * The number of structural features of the '<em>String Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_DATA_TYPE_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanOperationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanOperation()
   * @generated
   */
  int BOOLEAN_OPERATION = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Boolean Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.PlusImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.MinusImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 67;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.MultiImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 68;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.DivImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDiv()
   * @generated
   */
  int DIV = 69;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.NumberLiteralImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableCallImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 71;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryType <em>Sparql Query Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryType
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQueryType()
   * @generated
   */
  int SPARQL_QUERY_TYPE = 72;


  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.Model#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Model#getModels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Models();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement <em>Stream Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Statement</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamStatement
   * @generated
   */
  EClass getStreamStatement();

  /**
   * Returns the meta object for the reference list '{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement#getReturnStream <em>Return Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Return Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamStatement#getReturnStream()
   * @see #getStreamStatement()
   * @generated
   */
  EReference getStreamStatement_ReturnStream();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamStatement#getOperator()
   * @see #getStreamStatement()
   * @generated
   */
  EReference getStreamStatement_Operator();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement <em>Stream Variable Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Variable Statement</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement
   * @generated
   */
  EClass getStreamVariableStatement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement#getReference()
   * @see #getStreamVariableStatement()
   * @generated
   */
  EReference getStreamVariableStatement_Reference();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement#getExpression()
   * @see #getStreamVariableStatement()
   * @generated
   */
  EReference getStreamVariableStatement_Expression();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess <em>Stream Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Access</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamAccess
   * @generated
   */
  EClass getStreamAccess();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamAccess#getReference()
   * @see #getStreamAccess()
   * @generated
   */
  EReference getStreamAccess_Reference();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamAccess#getElement()
   * @see #getStreamAccess()
   * @generated
   */
  EReference getStreamAccess_Element();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess#getStreamVariable <em>Stream Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamAccess#getStreamVariable()
   * @see #getStreamAccess()
   * @generated
   */
  EReference getStreamAccess_StreamVariable();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess <em>Stream Declaration Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Declaration Access</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess
   * @generated
   */
  EClass getStreamDeclarationAccess();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getReference()
   * @see #getStreamDeclarationAccess()
   * @generated
   */
  EReference getStreamDeclarationAccess_Reference();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess#getElement()
   * @see #getStreamDeclarationAccess()
   * @generated
   */
  EReference getStreamDeclarationAccess_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDefinition <em>Stream Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Definition</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDefinition
   * @generated
   */
  EClass getStreamDefinition();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamDefinition#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDefinition#getReference()
   * @see #getStreamDefinition()
   * @generated
   */
  EReference getStreamDefinition_Reference();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.StreamDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDefinition#getName()
   * @see #getStreamDefinition()
   * @generated
   */
  EAttribute getStreamDefinition_Name();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.JoinOperator <em>Join Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.JoinOperator
   * @generated
   */
  EClass getJoinOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.JoinOperator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.JoinOperator#getParameters()
   * @see #getJoinOperator()
   * @generated
   */
  EReference getJoinOperator_Parameters();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter <em>Stream Operator Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Operator Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter
   * @generated
   */
  EClass getStreamOperatorParameter();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getStream()
   * @see #getStreamOperatorParameter()
   * @generated
   */
  EReference getStreamOperatorParameter_Stream();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getBarrier <em>Barrier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Barrier</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter#getBarrier()
   * @see #getStreamOperatorParameter()
   * @generated
   */
  EReference getStreamOperatorParameter_Barrier();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator <em>Element Join Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Join Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator
   * @generated
   */
  EClass getElementJoinOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getElementParameters <em>Element Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getElementParameters()
   * @see #getElementJoinOperator()
   * @generated
   */
  EReference getElementJoinOperator_ElementParameters();

  /**
   * Returns the meta object for the reference list '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getVariableElementParameters <em>Variable Element Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Variable Element Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getVariableElementParameters()
   * @see #getElementJoinOperator()
   * @generated
   */
  EReference getElementJoinOperator_VariableElementParameters();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator#getParameter()
   * @see #getElementJoinOperator()
   * @generated
   */
  EReference getElementJoinOperator_Parameter();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.FilterOperator <em>Filter Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.FilterOperator
   * @generated
   */
  EClass getFilterOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.FilterOperator#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.FilterOperator#getExpression()
   * @see #getFilterOperator()
   * @generated
   */
  EReference getFilterOperator_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.FilterOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.FilterOperator#getStream()
   * @see #getFilterOperator()
   * @generated
   */
  EReference getFilterOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SplitOperator <em>Split Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SplitOperator
   * @generated
   */
  EClass getSplitOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SplitOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SplitOperator#getParameter()
   * @see #getSplitOperator()
   * @generated
   */
  EReference getSplitOperator_Parameter();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator <em>Match Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MatchOperator
   * @generated
   */
  EClass getMatchOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MatchOperator#getExpression()
   * @see #getMatchOperator()
   * @generated
   */
  EReference getMatchOperator_Expression();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getCalculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Calculation</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MatchOperator#getCalculation()
   * @see #getMatchOperator()
   * @generated
   */
  EReference getMatchOperator_Calculation();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MatchOperator#getStream()
   * @see #getMatchOperator()
   * @generated
   */
  EReference getMatchOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator <em>Symmetric Difference Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symmetric Difference Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator
   * @generated
   */
  EClass getSymmetricDifferenceOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator#getParameters()
   * @see #getSymmetricDifferenceOperator()
   * @generated
   */
  EReference getSymmetricDifferenceOperator_Parameters();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.DifferenceOperator <em>Difference Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Difference Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DifferenceOperator
   * @generated
   */
  EClass getDifferenceOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.DifferenceOperator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DifferenceOperator#getParameters()
   * @see #getDifferenceOperator()
   * @generated
   */
  EReference getDifferenceOperator_Parameters();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator <em>Input Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.InputOperator
   * @generated
   */
  EClass getInputOperator();

  /**
   * Returns the meta object for the attribute list '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Iri</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.InputOperator#getIri()
   * @see #getInputOperator()
   * @generated
   */
  EAttribute getInputOperator_Iri();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.InputOperator#getAddress()
   * @see #getInputOperator()
   * @generated
   */
  EAttribute getInputOperator_Address();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.InputOperator#getPort()
   * @see #getInputOperator()
   * @generated
   */
  EAttribute getInputOperator_Port();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator <em>Return Type Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Type Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator
   * @generated
   */
  EClass getReturnTypeOperator();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.NoReturnTypeOperator <em>No Return Type Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Return Type Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NoReturnTypeOperator
   * @generated
   */
  EClass getNoReturnTypeOperator();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TagOperator <em>Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagOperator
   * @generated
   */
  EClass getTagOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.TagOperator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagOperator#getParameters()
   * @see #getTagOperator()
   * @generated
   */
  EReference getTagOperator_Parameters();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.NewTagOperator <em>New Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Tag Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NewTagOperator
   * @generated
   */
  EClass getNewTagOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.NewTagOperator#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NewTagOperator#getQuery()
   * @see #getNewTagOperator()
   * @generated
   */
  EReference getNewTagOperator_Query();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.NewTagOperator#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NewTagOperator#getTarget()
   * @see #getNewTagOperator()
   * @generated
   */
  EAttribute getNewTagOperator_Target();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator <em>Query Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Tag Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.QueryTagOperator
   * @generated
   */
  EClass getQueryTagOperator();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQueryType <em>Query Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQueryType()
   * @see #getQueryTagOperator()
   * @generated
   */
  EAttribute getQueryTagOperator_QueryType();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.QueryTagOperator#getQuery()
   * @see #getQueryTagOperator()
   * @generated
   */
  EReference getQueryTagOperator_Query();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery <em>Sparql Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sparql Query</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQuery
   * @generated
   */
  EClass getSparqlQuery();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQuery#getVariable()
   * @see #getSparqlQuery()
   * @generated
   */
  EReference getSparqlQuery_Variable();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable <em>Sparql Query Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sparql Query Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable
   * @generated
   */
  EClass getSparqlQueryVariable();

  /**
   * Returns the meta object for the attribute list '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable#getVariable()
   * @see #getSparqlQueryVariable()
   * @generated
   */
  EAttribute getSparqlQueryVariable_Variable();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.UnTagOperator <em>Un Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Tag Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagOperator
   * @generated
   */
  EClass getUnTagOperator();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.UnTagOperator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagOperator#getParameters()
   * @see #getUnTagOperator()
   * @generated
   */
  EReference getUnTagOperator_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.UnTagOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagOperator#getStream()
   * @see #getUnTagOperator()
   * @generated
   */
  EReference getUnTagOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement <em>Un Tag Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Tag Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagElement
   * @generated
   */
  EClass getUnTagElement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagElement#getElement()
   * @see #getUnTagElement()
   * @generated
   */
  EReference getUnTagElement_Element();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagElement#getReference()
   * @see #getUnTagElement()
   * @generated
   */
  EReference getUnTagElement_Reference();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TagElement <em>Tag Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagElement
   * @generated
   */
  EClass getTagElement();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.TagElement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagElement#getReference()
   * @see #getTagElement()
   * @generated
   */
  EReference getTagElement_Reference();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TagClassElement <em>Tag Class Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Class Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagClassElement
   * @generated
   */
  EClass getTagClassElement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.TagClassElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagClassElement#getElement()
   * @see #getTagClassElement()
   * @generated
   */
  EReference getTagClassElement_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement <em>Tag Object Property Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Object Property Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement
   * @generated
   */
  EClass getTagObjectPropertyElement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement#getElement()
   * @see #getTagObjectPropertyElement()
   * @generated
   */
  EReference getTagObjectPropertyElement_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement <em>Tag Data Type Property Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Data Type Property Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement
   * @generated
   */
  EClass getTagDataTypePropertyElement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement#getElement()
   * @see #getTagDataTypePropertyElement()
   * @generated
   */
  EReference getTagDataTypePropertyElement_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.BarrierOperator <em>Barrier Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Barrier Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BarrierOperator
   * @generated
   */
  EClass getBarrierOperator();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator <em>Window Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Window Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.WindowOperator
   * @generated
   */
  EClass getWindowOperator();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getSetting <em>Setting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Setting</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.WindowOperator#getSetting()
   * @see #getWindowOperator()
   * @generated
   */
  EAttribute getWindowOperator_Setting();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.WindowOperator#getValue()
   * @see #getWindowOperator()
   * @generated
   */
  EAttribute getWindowOperator_Value();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.WindowOperator#getUnit()
   * @see #getWindowOperator()
   * @generated
   */
  EAttribute getWindowOperator_Unit();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.MarkerOperator <em>Marker Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Marker Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MarkerOperator
   * @generated
   */
  EClass getMarkerOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.MarkerOperator#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MarkerOperator#getExpression()
   * @see #getMarkerOperator()
   * @generated
   */
  EReference getMarkerOperator_Expression();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator <em>SWRL Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SWRL Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLOperator
   * @generated
   */
  EClass getSWRLOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getRule()
   * @see #getSWRLOperator()
   * @generated
   */
  EReference getSWRLOperator_Rule();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getBarrier <em>Barrier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Barrier</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLOperator#getBarrier()
   * @see #getSWRLOperator()
   * @generated
   */
  EReference getSWRLOperator_Barrier();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule <em>SWRL Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SWRL Rule</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLRule
   * @generated
   */
  EClass getSWRLRule();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getAntecedent <em>Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Antecedent</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLRule#getAntecedent()
   * @see #getSWRLRule()
   * @generated
   */
  EReference getSWRLRule_Antecedent();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule#getConsequent <em>Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Consequent</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLRule#getConsequent()
   * @see #getSWRLRule()
   * @generated
   */
  EReference getSWRLRule_Consequent();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.AntecedentRule <em>Antecedent Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Antecedent Rule</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AntecedentRule
   * @generated
   */
  EClass getAntecedentRule();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.AntecedentRule#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AntecedentRule#getAtoms()
   * @see #getAntecedentRule()
   * @generated
   */
  EReference getAntecedentRule_Atoms();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.ConsequentRule <em>Consequent Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consequent Rule</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ConsequentRule
   * @generated
   */
  EClass getConsequentRule();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.ConsequentRule#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ConsequentRule#getAtoms()
   * @see #getConsequentRule()
   * @generated
   */
  EReference getConsequentRule_Atoms();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.Rule#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Rule#getVariable()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Variable();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.OCLOperator <em>OCL Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OCL Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OCLOperator
   * @generated
   */
  EClass getOCLOperator();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.OCLOperator#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OCLOperator#getConstraint()
   * @see #getOCLOperator()
   * @generated
   */
  EAttribute getOCLOperator_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.OCLOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OCLOperator#getStream()
   * @see #getOCLOperator()
   * @generated
   */
  EReference getOCLOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.CountOperator <em>Count Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.CountOperator
   * @generated
   */
  EClass getCountOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.CountOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.CountOperator#getParameter()
   * @see #getCountOperator()
   * @generated
   */
  EReference getCountOperator_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.CountOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.CountOperator#getStream()
   * @see #getCountOperator()
   * @generated
   */
  EReference getCountOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator <em>Standard Deviation Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Standard Deviation Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator
   * @generated
   */
  EClass getStandardDeviationOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator#getParameter()
   * @see #getStandardDeviationOperator()
   * @generated
   */
  EReference getStandardDeviationOperator_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator#getStream()
   * @see #getStandardDeviationOperator()
   * @generated
   */
  EReference getStandardDeviationOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator <em>Average Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Average Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AverageOperator
   * @generated
   */
  EClass getAverageOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AverageOperator#getParameter()
   * @see #getAverageOperator()
   * @generated
   */
  EReference getAverageOperator_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AverageOperator#getStream()
   * @see #getAverageOperator()
   * @generated
   */
  EReference getAverageOperator_Stream();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.AdditionOperator <em>Addition Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AdditionOperator
   * @generated
   */
  EClass getAdditionOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getParameter()
   * @see #getAdditionOperator()
   * @generated
   */
  EReference getAdditionOperator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getLiteral()
   * @see #getAdditionOperator()
   * @generated
   */
  EAttribute getAdditionOperator_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getStreamElements <em>Stream Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stream Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.AdditionOperator#getStreamElements()
   * @see #getAdditionOperator()
   * @generated
   */
  EReference getAdditionOperator_StreamElements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator <em>Subtraction Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtraction Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SubtractionOperator
   * @generated
   */
  EClass getSubtractionOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getParameter()
   * @see #getSubtractionOperator()
   * @generated
   */
  EReference getSubtractionOperator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getLiteral()
   * @see #getSubtractionOperator()
   * @generated
   */
  EAttribute getSubtractionOperator_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getStreamElements <em>Stream Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stream Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SubtractionOperator#getStreamElements()
   * @see #getSubtractionOperator()
   * @generated
   */
  EReference getSubtractionOperator_StreamElements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator
   * @generated
   */
  EClass getMultiplicationOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getParameter()
   * @see #getMultiplicationOperator()
   * @generated
   */
  EReference getMultiplicationOperator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getLiteral()
   * @see #getMultiplicationOperator()
   * @generated
   */
  EAttribute getMultiplicationOperator_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getStreamElements <em>Stream Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stream Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator#getStreamElements()
   * @see #getMultiplicationOperator()
   * @generated
   */
  EReference getMultiplicationOperator_StreamElements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.DivisionOperator <em>Division Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DivisionOperator
   * @generated
   */
  EClass getDivisionOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getParameter()
   * @see #getDivisionOperator()
   * @generated
   */
  EReference getDivisionOperator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getLiteral()
   * @see #getDivisionOperator()
   * @generated
   */
  EAttribute getDivisionOperator_Literal();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getStreamElements <em>Stream Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stream Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DivisionOperator#getStreamElements()
   * @see #getDivisionOperator()
   * @generated
   */
  EReference getDivisionOperator_StreamElements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator <em>Output Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator
   * @generated
   */
  EClass getOutputOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getStream()
   * @see #getOutputOperator()
   * @generated
   */
  EReference getOutputOperator_Stream();

  /**
   * Returns the meta object for the attribute list '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Iri</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getIri()
   * @see #getOutputOperator()
   * @generated
   */
  EAttribute getOutputOperator_Iri();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getAddress()
   * @see #getOutputOperator()
   * @generated
   */
  EAttribute getOutputOperator_Address();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getPort()
   * @see #getOutputOperator()
   * @generated
   */
  EAttribute getOutputOperator_Port();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition <em>Number Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Variable Definition</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition
   * @generated
   */
  EClass getNumberVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition#getType()
   * @see #getNumberVariableDefinition()
   * @generated
   */
  EReference getNumberVariableDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition#getValue()
   * @see #getNumberVariableDefinition()
   * @generated
   */
  EAttribute getNumberVariableDefinition_Value();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition <em>String Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Variable Definition</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition
   * @generated
   */
  EClass getStringVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition#getType()
   * @see #getStringVariableDefinition()
   * @generated
   */
  EReference getStringVariableDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition#getValue()
   * @see #getStringVariableDefinition()
   * @generated
   */
  EAttribute getStringVariableDefinition_Value();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition <em>Boolean Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Variable Definition</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition
   * @generated
   */
  EClass getBooleanVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition#getType()
   * @see #getBooleanVariableDefinition()
   * @generated
   */
  EReference getBooleanVariableDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition#isValue()
   * @see #getBooleanVariableDefinition()
   * @generated
   */
  EAttribute getBooleanVariableDefinition_Value();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StructureDeclaration <em>Structure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Declaration</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureDeclaration
   * @generated
   */
  EClass getStructureDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.StructureDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureDeclaration#getName()
   * @see #getStructureDeclaration()
   * @generated
   */
  EAttribute getStructureDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.StructureDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureDeclaration#getElements()
   * @see #getStructureDeclaration()
   * @generated
   */
  EReference getStructureDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclaration <em>Stream Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Declaration</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclaration
   * @generated
   */
  EClass getStreamDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclaration#getName()
   * @see #getStreamDeclaration()
   * @generated
   */
  EAttribute getStreamDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclaration#getElements()
   * @see #getStreamDeclaration()
   * @generated
   */
  EReference getStreamDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StreamElement <em>Stream Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamElement
   * @generated
   */
  EClass getStreamElement();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StructureElements <em>Structure Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Elements</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureElements
   * @generated
   */
  EClass getStructureElements();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StructureElements#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureElements#getElement()
   * @see #getStructureElements()
   * @generated
   */
  EReference getStructureElements_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.SimpleDataType <em>Simple Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SimpleDataType
   * @generated
   */
  EClass getSimpleDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.ComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.ComplexDataType
   * @generated
   */
  EClass getComplexDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.IntegerDataType <em>Integer Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.IntegerDataType
   * @generated
   */
  EClass getIntegerDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanDataType <em>Boolean Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanDataType
   * @generated
   */
  EClass getBooleanDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.FloatDataType <em>Float Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.FloatDataType
   * @generated
   */
  EClass getFloatDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.StringDataType <em>String Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Data Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StringDataType
   * @generated
   */
  EClass getStringDataType();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanOperation <em>Boolean Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Operation</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanOperation
   * @generated
   */
  EClass getBooleanOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getLeft()
   * @see #getBooleanOperation()
   * @generated
   */
  EReference getBooleanOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getOperator()
   * @see #getBooleanOperation()
   * @generated
   */
  EAttribute getBooleanOperation_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanOperation#getRight()
   * @see #getBooleanOperation()
   * @generated
   */
  EReference getBooleanOperation_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Call</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableCall
   * @generated
   */
  EClass getVariableCall();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.VariableCall#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableCall#getVariable()
   * @see #getVariableCall()
   * @generated
   */
  EReference getVariableCall_Variable();

  /**
   * Returns the meta object for enum '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryType <em>Sparql Query Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sparql Query Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryType
   * @generated
   */
  EEnum getSparqlQueryType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FlowFactory getFlowFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ModelImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODELS = eINSTANCE.getModel_Models();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.PackageDeclarationImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ModelElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamStatementImpl <em>Stream Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamStatementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamStatement()
     * @generated
     */
    EClass STREAM_STATEMENT = eINSTANCE.getStreamStatement();

    /**
     * The meta object literal for the '<em><b>Return Stream</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_STATEMENT__RETURN_STREAM = eINSTANCE.getStreamStatement_ReturnStream();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_STATEMENT__OPERATOR = eINSTANCE.getStreamStatement_Operator();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamVariableStatementImpl <em>Stream Variable Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamVariableStatementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamVariableStatement()
     * @generated
     */
    EClass STREAM_VARIABLE_STATEMENT = eINSTANCE.getStreamVariableStatement();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_VARIABLE_STATEMENT__REFERENCE = eINSTANCE.getStreamVariableStatement_Reference();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_VARIABLE_STATEMENT__EXPRESSION = eINSTANCE.getStreamVariableStatement_Expression();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl <em>Stream Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamAccess()
     * @generated
     */
    EClass STREAM_ACCESS = eINSTANCE.getStreamAccess();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_ACCESS__REFERENCE = eINSTANCE.getStreamAccess_Reference();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_ACCESS__ELEMENT = eINSTANCE.getStreamAccess_Element();

    /**
     * The meta object literal for the '<em><b>Stream Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_ACCESS__STREAM_VARIABLE = eINSTANCE.getStreamAccess_StreamVariable();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationAccessImpl <em>Stream Declaration Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationAccessImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDeclarationAccess()
     * @generated
     */
    EClass STREAM_DECLARATION_ACCESS = eINSTANCE.getStreamDeclarationAccess();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_DECLARATION_ACCESS__REFERENCE = eINSTANCE.getStreamDeclarationAccess_Reference();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_DECLARATION_ACCESS__ELEMENT = eINSTANCE.getStreamDeclarationAccess_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl <em>Stream Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDefinition()
     * @generated
     */
    EClass STREAM_DEFINITION = eINSTANCE.getStreamDefinition();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_DEFINITION__REFERENCE = eINSTANCE.getStreamDefinition_Reference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREAM_DEFINITION__NAME = eINSTANCE.getStreamDefinition_Name();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.JoinOperatorImpl <em>Join Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.JoinOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getJoinOperator()
     * @generated
     */
    EClass JOIN_OPERATOR = eINSTANCE.getJoinOperator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_OPERATOR__PARAMETERS = eINSTANCE.getJoinOperator_Parameters();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl <em>Stream Operator Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamOperatorParameter()
     * @generated
     */
    EClass STREAM_OPERATOR_PARAMETER = eINSTANCE.getStreamOperatorParameter();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_OPERATOR_PARAMETER__STREAM = eINSTANCE.getStreamOperatorParameter_Stream();

    /**
     * The meta object literal for the '<em><b>Barrier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_OPERATOR_PARAMETER__BARRIER = eINSTANCE.getStreamOperatorParameter_Barrier();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl <em>Element Join Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getElementJoinOperator()
     * @generated
     */
    EClass ELEMENT_JOIN_OPERATOR = eINSTANCE.getElementJoinOperator();

    /**
     * The meta object literal for the '<em><b>Element Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS = eINSTANCE.getElementJoinOperator_ElementParameters();

    /**
     * The meta object literal for the '<em><b>Variable Element Parameters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS = eINSTANCE.getElementJoinOperator_VariableElementParameters();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_JOIN_OPERATOR__PARAMETER = eINSTANCE.getElementJoinOperator_Parameter();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.FilterOperatorImpl <em>Filter Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FilterOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getFilterOperator()
     * @generated
     */
    EClass FILTER_OPERATOR = eINSTANCE.getFilterOperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_OPERATOR__EXPRESSION = eINSTANCE.getFilterOperator_Expression();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_OPERATOR__STREAM = eINSTANCE.getFilterOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SplitOperatorImpl <em>Split Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SplitOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSplitOperator()
     * @generated
     */
    EClass SPLIT_OPERATOR = eINSTANCE.getSplitOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_OPERATOR__PARAMETER = eINSTANCE.getSplitOperator_Parameter();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl <em>Match Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.MatchOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMatchOperator()
     * @generated
     */
    EClass MATCH_OPERATOR = eINSTANCE.getMatchOperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_OPERATOR__EXPRESSION = eINSTANCE.getMatchOperator_Expression();

    /**
     * The meta object literal for the '<em><b>Calculation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_OPERATOR__CALCULATION = eINSTANCE.getMatchOperator_Calculation();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_OPERATOR__STREAM = eINSTANCE.getMatchOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SymmetricDifferenceOperatorImpl <em>Symmetric Difference Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SymmetricDifferenceOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSymmetricDifferenceOperator()
     * @generated
     */
    EClass SYMMETRIC_DIFFERENCE_OPERATOR = eINSTANCE.getSymmetricDifferenceOperator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMMETRIC_DIFFERENCE_OPERATOR__PARAMETERS = eINSTANCE.getSymmetricDifferenceOperator_Parameters();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DifferenceOperatorImpl <em>Difference Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.DifferenceOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDifferenceOperator()
     * @generated
     */
    EClass DIFFERENCE_OPERATOR = eINSTANCE.getDifferenceOperator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENCE_OPERATOR__PARAMETERS = eINSTANCE.getDifferenceOperator_Parameters();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl <em>Input Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.InputOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getInputOperator()
     * @generated
     */
    EClass INPUT_OPERATOR = eINSTANCE.getInputOperator();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPERATOR__IRI = eINSTANCE.getInputOperator_Iri();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPERATOR__ADDRESS = eINSTANCE.getInputOperator_Address();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_OPERATOR__PORT = eINSTANCE.getInputOperator_Port();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ReturnTypeOperatorImpl <em>Return Type Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ReturnTypeOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getReturnTypeOperator()
     * @generated
     */
    EClass RETURN_TYPE_OPERATOR = eINSTANCE.getReturnTypeOperator();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NoReturnTypeOperatorImpl <em>No Return Type Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.NoReturnTypeOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNoReturnTypeOperator()
     * @generated
     */
    EClass NO_RETURN_TYPE_OPERATOR = eINSTANCE.getNoReturnTypeOperator();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl <em>Tag Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagOperator()
     * @generated
     */
    EClass TAG_OPERATOR = eINSTANCE.getTagOperator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_OPERATOR__PARAMETERS = eINSTANCE.getTagOperator_Parameters();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NewTagOperatorImpl <em>New Tag Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.NewTagOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNewTagOperator()
     * @generated
     */
    EClass NEW_TAG_OPERATOR = eINSTANCE.getNewTagOperator();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_TAG_OPERATOR__QUERY = eINSTANCE.getNewTagOperator_Query();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_TAG_OPERATOR__TARGET = eINSTANCE.getNewTagOperator_Target();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl <em>Query Tag Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.QueryTagOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getQueryTagOperator()
     * @generated
     */
    EClass QUERY_TAG_OPERATOR = eINSTANCE.getQueryTagOperator();

    /**
     * The meta object literal for the '<em><b>Query Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY_TAG_OPERATOR__QUERY_TYPE = eINSTANCE.getQueryTagOperator_QueryType();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_TAG_OPERATOR__QUERY = eINSTANCE.getQueryTagOperator_Query();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl <em>Sparql Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQuery()
     * @generated
     */
    EClass SPARQL_QUERY = eINSTANCE.getSparqlQuery();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPARQL_QUERY__VARIABLE = eINSTANCE.getSparqlQuery_Variable();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryVariableImpl <em>Sparql Query Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SparqlQueryVariableImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQueryVariable()
     * @generated
     */
    EClass SPARQL_QUERY_VARIABLE = eINSTANCE.getSparqlQueryVariable();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPARQL_QUERY_VARIABLE__VARIABLE = eINSTANCE.getSparqlQueryVariable_Variable();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.UnTagOperatorImpl <em>Un Tag Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.UnTagOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getUnTagOperator()
     * @generated
     */
    EClass UN_TAG_OPERATOR = eINSTANCE.getUnTagOperator();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_TAG_OPERATOR__PARAMETERS = eINSTANCE.getUnTagOperator_Parameters();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_TAG_OPERATOR__STREAM = eINSTANCE.getUnTagOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.UnTagElementImpl <em>Un Tag Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.UnTagElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getUnTagElement()
     * @generated
     */
    EClass UN_TAG_ELEMENT = eINSTANCE.getUnTagElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_TAG_ELEMENT__ELEMENT = eINSTANCE.getUnTagElement_Element();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_TAG_ELEMENT__REFERENCE = eINSTANCE.getUnTagElement_Reference();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl <em>Tag Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagElement()
     * @generated
     */
    EClass TAG_ELEMENT = eINSTANCE.getTagElement();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_ELEMENT__REFERENCE = eINSTANCE.getTagElement_Reference();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagClassElementImpl <em>Tag Class Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TagClassElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagClassElement()
     * @generated
     */
    EClass TAG_CLASS_ELEMENT = eINSTANCE.getTagClassElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_CLASS_ELEMENT__ELEMENT = eINSTANCE.getTagClassElement_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagObjectPropertyElementImpl <em>Tag Object Property Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TagObjectPropertyElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagObjectPropertyElement()
     * @generated
     */
    EClass TAG_OBJECT_PROPERTY_ELEMENT = eINSTANCE.getTagObjectPropertyElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT = eINSTANCE.getTagObjectPropertyElement_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagDataTypePropertyElementImpl <em>Tag Data Type Property Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TagDataTypePropertyElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagDataTypePropertyElement()
     * @generated
     */
    EClass TAG_DATA_TYPE_PROPERTY_ELEMENT = eINSTANCE.getTagDataTypePropertyElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT = eINSTANCE.getTagDataTypePropertyElement_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl <em>Barrier Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBarrierOperator()
     * @generated
     */
    EClass BARRIER_OPERATOR = eINSTANCE.getBarrierOperator();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.WindowOperatorImpl <em>Window Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.WindowOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getWindowOperator()
     * @generated
     */
    EClass WINDOW_OPERATOR = eINSTANCE.getWindowOperator();

    /**
     * The meta object literal for the '<em><b>Setting</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW_OPERATOR__SETTING = eINSTANCE.getWindowOperator_Setting();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW_OPERATOR__VALUE = eINSTANCE.getWindowOperator_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WINDOW_OPERATOR__UNIT = eINSTANCE.getWindowOperator_Unit();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MarkerOperatorImpl <em>Marker Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.MarkerOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMarkerOperator()
     * @generated
     */
    EClass MARKER_OPERATOR = eINSTANCE.getMarkerOperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKER_OPERATOR__EXPRESSION = eINSTANCE.getMarkerOperator_Expression();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl <em>SWRL Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SWRLOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSWRLOperator()
     * @generated
     */
    EClass SWRL_OPERATOR = eINSTANCE.getSWRLOperator();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWRL_OPERATOR__RULE = eINSTANCE.getSWRLOperator_Rule();

    /**
     * The meta object literal for the '<em><b>Barrier</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWRL_OPERATOR__BARRIER = eINSTANCE.getSWRLOperator_Barrier();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl <em>SWRL Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SWRLRuleImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSWRLRule()
     * @generated
     */
    EClass SWRL_RULE = eINSTANCE.getSWRLRule();

    /**
     * The meta object literal for the '<em><b>Antecedent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWRL_RULE__ANTECEDENT = eINSTANCE.getSWRLRule_Antecedent();

    /**
     * The meta object literal for the '<em><b>Consequent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWRL_RULE__CONSEQUENT = eINSTANCE.getSWRLRule_Consequent();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AntecedentRuleImpl <em>Antecedent Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.AntecedentRuleImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAntecedentRule()
     * @generated
     */
    EClass ANTECEDENT_RULE = eINSTANCE.getAntecedentRule();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANTECEDENT_RULE__ATOMS = eINSTANCE.getAntecedentRule_Atoms();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ConsequentRuleImpl <em>Consequent Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ConsequentRuleImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getConsequentRule()
     * @generated
     */
    EClass CONSEQUENT_RULE = eINSTANCE.getConsequentRule();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSEQUENT_RULE__ATOMS = eINSTANCE.getConsequentRule_Atoms();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.RuleImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__VARIABLE = eINSTANCE.getRule_Variable();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OCLOperatorImpl <em>OCL Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OCLOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOCLOperator()
     * @generated
     */
    EClass OCL_OPERATOR = eINSTANCE.getOCLOperator();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATOR__CONSTRAINT = eINSTANCE.getOCLOperator_Constraint();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATOR__STREAM = eINSTANCE.getOCLOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl <em>Count Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getCountOperator()
     * @generated
     */
    EClass COUNT_OPERATOR = eINSTANCE.getCountOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNT_OPERATOR__PARAMETER = eINSTANCE.getCountOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNT_OPERATOR__STREAM = eINSTANCE.getCountOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl <em>Standard Deviation Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStandardDeviationOperator()
     * @generated
     */
    EClass STANDARD_DEVIATION_OPERATOR = eINSTANCE.getStandardDeviationOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STANDARD_DEVIATION_OPERATOR__PARAMETER = eINSTANCE.getStandardDeviationOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STANDARD_DEVIATION_OPERATOR__STREAM = eINSTANCE.getStandardDeviationOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl <em>Average Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAverageOperator()
     * @generated
     */
    EClass AVERAGE_OPERATOR = eINSTANCE.getAverageOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVERAGE_OPERATOR__PARAMETER = eINSTANCE.getAverageOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVERAGE_OPERATOR__STREAM = eINSTANCE.getAverageOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl <em>Addition Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.AdditionOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAdditionOperator()
     * @generated
     */
    EClass ADDITION_OPERATOR = eINSTANCE.getAdditionOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_OPERATOR__PARAMETER = eINSTANCE.getAdditionOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITION_OPERATOR__LITERAL = eINSTANCE.getAdditionOperator_Literal();

    /**
     * The meta object literal for the '<em><b>Stream Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_OPERATOR__STREAM_ELEMENTS = eINSTANCE.getAdditionOperator_StreamElements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl <em>Subtraction Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SubtractionOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSubtractionOperator()
     * @generated
     */
    EClass SUBTRACTION_OPERATOR = eINSTANCE.getSubtractionOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION_OPERATOR__PARAMETER = eINSTANCE.getSubtractionOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBTRACTION_OPERATOR__LITERAL = eINSTANCE.getSubtractionOperator_Literal();

    /**
     * The meta object literal for the '<em><b>Stream Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION_OPERATOR__STREAM_ELEMENTS = eINSTANCE.getSubtractionOperator_StreamElements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MultiplicationOperatorImpl <em>Multiplication Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.MultiplicationOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMultiplicationOperator()
     * @generated
     */
    EClass MULTIPLICATION_OPERATOR = eINSTANCE.getMultiplicationOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_OPERATOR__PARAMETER = eINSTANCE.getMultiplicationOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION_OPERATOR__LITERAL = eINSTANCE.getMultiplicationOperator_Literal();

    /**
     * The meta object literal for the '<em><b>Stream Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_OPERATOR__STREAM_ELEMENTS = eINSTANCE.getMultiplicationOperator_StreamElements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DivisionOperatorImpl <em>Division Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.DivisionOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDivisionOperator()
     * @generated
     */
    EClass DIVISION_OPERATOR = eINSTANCE.getDivisionOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_OPERATOR__PARAMETER = eINSTANCE.getDivisionOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIVISION_OPERATOR__LITERAL = eINSTANCE.getDivisionOperator_Literal();

    /**
     * The meta object literal for the '<em><b>Stream Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_OPERATOR__STREAM_ELEMENTS = eINSTANCE.getDivisionOperator_StreamElements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl <em>Output Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperator()
     * @generated
     */
    EClass OUTPUT_OPERATOR = eINSTANCE.getOutputOperator();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATOR__STREAM = eINSTANCE.getOutputOperator_Stream();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPERATOR__IRI = eINSTANCE.getOutputOperator_Iri();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPERATOR__ADDRESS = eINSTANCE.getOutputOperator_Address();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPERATOR__PORT = eINSTANCE.getOutputOperator_Port();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableDefinitionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NAME = eINSTANCE.getVariableDefinition_Name();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NumberVariableDefinitionImpl <em>Number Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.NumberVariableDefinitionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNumberVariableDefinition()
     * @generated
     */
    EClass NUMBER_VARIABLE_DEFINITION = eINSTANCE.getNumberVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_VARIABLE_DEFINITION__TYPE = eINSTANCE.getNumberVariableDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VARIABLE_DEFINITION__VALUE = eINSTANCE.getNumberVariableDefinition_Value();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StringVariableDefinitionImpl <em>String Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StringVariableDefinitionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStringVariableDefinition()
     * @generated
     */
    EClass STRING_VARIABLE_DEFINITION = eINSTANCE.getStringVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_VARIABLE_DEFINITION__TYPE = eINSTANCE.getStringVariableDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VARIABLE_DEFINITION__VALUE = eINSTANCE.getStringVariableDefinition_Value();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanVariableDefinitionImpl <em>Boolean Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanVariableDefinitionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanVariableDefinition()
     * @generated
     */
    EClass BOOLEAN_VARIABLE_DEFINITION = eINSTANCE.getBooleanVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_VARIABLE_DEFINITION__TYPE = eINSTANCE.getBooleanVariableDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VARIABLE_DEFINITION__VALUE = eINSTANCE.getBooleanVariableDefinition_Value();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StructureDeclarationImpl <em>Structure Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StructureDeclarationImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStructureDeclaration()
     * @generated
     */
    EClass STRUCTURE_DECLARATION = eINSTANCE.getStructureDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_DECLARATION__NAME = eINSTANCE.getStructureDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_DECLARATION__ELEMENTS = eINSTANCE.getStructureDeclaration_Elements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl <em>Stream Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDeclaration()
     * @generated
     */
    EClass STREAM_DECLARATION = eINSTANCE.getStreamDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREAM_DECLARATION__NAME = eINSTANCE.getStreamDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_DECLARATION__ELEMENTS = eINSTANCE.getStreamDeclaration_Elements();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl <em>Stream Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamElement()
     * @generated
     */
    EClass STREAM_ELEMENT = eINSTANCE.getStreamElement();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StructureElementsImpl <em>Structure Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StructureElementsImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStructureElements()
     * @generated
     */
    EClass STRUCTURE_ELEMENTS = eINSTANCE.getStructureElements();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_ELEMENTS__ELEMENT = eINSTANCE.getStructureElements_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ExpressionImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.DataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.SimpleDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSimpleDataType()
     * @generated
     */
    EClass SIMPLE_DATA_TYPE = eINSTANCE.getSimpleDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.ComplexDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getComplexDataType()
     * @generated
     */
    EClass COMPLEX_DATA_TYPE = eINSTANCE.getComplexDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.IntegerDataTypeImpl <em>Integer Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.IntegerDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getIntegerDataType()
     * @generated
     */
    EClass INTEGER_DATA_TYPE = eINSTANCE.getIntegerDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanDataTypeImpl <em>Boolean Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanDataType()
     * @generated
     */
    EClass BOOLEAN_DATA_TYPE = eINSTANCE.getBooleanDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.FloatDataTypeImpl <em>Float Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FloatDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getFloatDataType()
     * @generated
     */
    EClass FLOAT_DATA_TYPE = eINSTANCE.getFloatDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StringDataTypeImpl <em>String Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.StringDataTypeImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStringDataType()
     * @generated
     */
    EClass STRING_DATA_TYPE = eINSTANCE.getStringDataType();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.BooleanOperationImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBooleanOperation()
     * @generated
     */
    EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_OPERATION__LEFT = eINSTANCE.getBooleanOperation_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_OPERATION__OPERATOR = eINSTANCE.getBooleanOperation_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_OPERATION__RIGHT = eINSTANCE.getBooleanOperation_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.PlusImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.MinusImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.MultiImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.DivImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.NumberLiteralImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableCallImpl <em>Variable Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableCallImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableCall()
     * @generated
     */
    EClass VARIABLE_CALL = eINSTANCE.getVariableCall();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_CALL__VARIABLE = eINSTANCE.getVariableCall_Variable();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryType <em>Sparql Query Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryType
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getSparqlQueryType()
     * @generated
     */
    EEnum SPARQL_QUERY_TYPE = eINSTANCE.getSparqlQueryType();

  }

} //FlowPackage
