/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 0;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl <em>Stream Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDeclaration()
   * @generated
   */
  int STREAM_DECLARATION = 3;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl <em>Stream Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamElement()
   * @generated
   */
  int STREAM_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ELEMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Stream Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ImportImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 5;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TestElementImpl <em>Test Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TestElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTestElement()
   * @generated
   */
  int TEST_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Test Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TestAssignImpl <em>Test Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TestAssignImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTestAssign()
   * @generated
   */
  int TEST_ASSIGN = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ASSIGN__LEFT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ASSIGN__RIGHT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Test Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_ASSIGN_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OWLTestElementImpl <em>OWL Test Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OWLTestElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOWLTestElement()
   * @generated
   */
  int OWL_TEST_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWL_TEST_ELEMENT__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>OWL Test Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWL_TEST_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 9;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 10;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableDeclarationImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl <em>Stream Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamDefinitionImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamDefinition()
   * @generated
   */
  int STREAM_DEFINITION = 12;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl <em>Stream Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamAccessImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamAccess()
   * @generated
   */
  int STREAM_ACCESS = 13;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS__ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Stream Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_ACCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl <em>Stream Operator Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StreamOperatorParameterImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStreamOperatorParameter()
   * @generated
   */
  int STREAM_OPERATOR_PARAMETER = 14;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl <em>Count Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.CountOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getCountOperator()
   * @generated
   */
  int COUNT_OPERATOR = 15;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR__PARAMETER = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR__STREAM = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Count Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl <em>Standard Deviation Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.StandardDeviationOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getStandardDeviationOperator()
   * @generated
   */
  int STANDARD_DEVIATION_OPERATOR = 16;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR__PARAMETER = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR__STREAM = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Standard Deviation Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STANDARD_DEVIATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl <em>Average Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.AverageOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getAverageOperator()
   * @generated
   */
  int AVERAGE_OPERATOR = 17;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR__PARAMETER = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR__STREAM = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Average Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVERAGE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl <em>Element Join Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.ElementJoinOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getElementJoinOperator()
   * @generated
   */
  int ELEMENT_JOIN_OPERATOR = 18;

  /**
   * The feature id for the '<em><b>Element Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Element Parameters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR__PARAMETER = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Element Join Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_JOIN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl <em>Tag Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagOperator()
   * @generated
   */
  int TAG_OPERATOR = 19;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATOR__PARAMETERS = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATOR__STREAM = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tag Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl <em>Tag Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.TagElementImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTagElement()
   * @generated
   */
  int TAG_ELEMENT = 20;

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
  int TAG_CLASS_ELEMENT = 21;

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
  int TAG_OBJECT_PROPERTY_ELEMENT = 22;

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
  int TAG_DATA_TYPE_PROPERTY_ELEMENT = 23;

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
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl <em>Output Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperator()
   * @generated
   */
  int OUTPUT_OPERATOR = 24;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__PARAMETER = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__LOCATION = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stream</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR__STREAM = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Output Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorParameterImpl <em>Output Operator Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorParameterImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperatorParameter()
   * @generated
   */
  int OUTPUT_OPERATOR_PARAMETER = 25;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR_PARAMETER__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Output Operator Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_OPERATOR_PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl <em>Barrier Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hs_rm.cs.vs.dsm.flow.impl.BarrierOperatorImpl
   * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getBarrierOperator()
   * @generated
   */
  int BARRIER_OPERATOR = 26;

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
  int WINDOW_OPERATOR = 27;

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
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Model#getModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Model();

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
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.StreamElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamElement#getType()
   * @see #getStreamElement()
   * @generated
   */
  EReference getStreamElement_Type();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.StreamElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamElement#getName()
   * @see #getStreamElement()
   * @generated
   */
  EAttribute getStreamElement_Name();

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
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TestElement <em>Test Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TestElement
   * @generated
   */
  EClass getTestElement();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.TestElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TestElement#getName()
   * @see #getTestElement()
   * @generated
   */
  EAttribute getTestElement_Name();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.TestAssign <em>Test Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Assign</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TestAssign
   * @generated
   */
  EClass getTestAssign();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.TestAssign#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TestAssign#getLeft()
   * @see #getTestAssign()
   * @generated
   */
  EReference getTestAssign_Left();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.TestAssign#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TestAssign#getRight()
   * @see #getTestAssign()
   * @generated
   */
  EReference getTestAssign_Right();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.OWLTestElement <em>OWL Test Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OWL Test Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OWLTestElement
   * @generated
   */
  EClass getOWLTestElement();

  /**
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.OWLTestElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OWLTestElement#getElement()
   * @see #getOWLTestElement()
   * @generated
   */
  EReference getOWLTestElement_Element();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.Variable
   * @generated
   */
  EClass getVariable();

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
   * Returns the meta object for the reference '{@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
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
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.TagOperator#getStream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stream</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.TagOperator#getStream()
   * @see #getTagOperator()
   * @generated
   */
  EReference getTagOperator_Stream();

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
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator <em>Output Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Operator</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator
   * @generated
   */
  EClass getOutputOperator();

  /**
   * Returns the meta object for the containment reference '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getParameter()
   * @see #getOutputOperator()
   * @generated
   */
  EReference getOutputOperator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator#getLocation()
   * @see #getOutputOperator()
   * @generated
   */
  EAttribute getOutputOperator_Location();

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
   * Returns the meta object for class '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter <em>Output Operator Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Operator Parameter</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter
   * @generated
   */
  EClass getOutputOperatorParameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter#getElement()
   * @see #getOutputOperatorParameter()
   * @generated
   */
  EReference getOutputOperatorParameter_Element();

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
     * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODEL = eINSTANCE.getModel_Model();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_ELEMENT__TYPE = eINSTANCE.getStreamElement_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREAM_ELEMENT__NAME = eINSTANCE.getStreamElement_Name();

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
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TestElementImpl <em>Test Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TestElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTestElement()
     * @generated
     */
    EClass TEST_ELEMENT = eINSTANCE.getTestElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_ELEMENT__NAME = eINSTANCE.getTestElement_Name();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.TestAssignImpl <em>Test Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.TestAssignImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getTestAssign()
     * @generated
     */
    EClass TEST_ASSIGN = eINSTANCE.getTestAssign();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_ASSIGN__LEFT = eINSTANCE.getTestAssign_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_ASSIGN__RIGHT = eINSTANCE.getTestAssign_Right();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OWLTestElementImpl <em>OWL Test Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OWLTestElementImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOWLTestElement()
     * @generated
     */
    EClass OWL_TEST_ELEMENT = eINSTANCE.getOWLTestElement();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OWL_TEST_ELEMENT__ELEMENT = eINSTANCE.getOWLTestElement_Element();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.VariableImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
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
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG_OPERATOR__STREAM = eINSTANCE.getTagOperator_Stream();

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
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl <em>Output Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperator()
     * @generated
     */
    EClass OUTPUT_OPERATOR = eINSTANCE.getOutputOperator();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATOR__PARAMETER = eINSTANCE.getOutputOperator_Parameter();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_OPERATOR__LOCATION = eINSTANCE.getOutputOperator_Location();

    /**
     * The meta object literal for the '<em><b>Stream</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATOR__STREAM = eINSTANCE.getOutputOperator_Stream();

    /**
     * The meta object literal for the '{@link de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorParameterImpl <em>Output Operator Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hs_rm.cs.vs.dsm.flow.impl.OutputOperatorParameterImpl
     * @see de.hs_rm.cs.vs.dsm.flow.impl.FlowPackageImpl#getOutputOperatorParameter()
     * @generated
     */
    EClass OUTPUT_OPERATOR_PARAMETER = eINSTANCE.getOutputOperatorParameter();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_OPERATOR_PARAMETER__ELEMENT = eINSTANCE.getOutputOperatorParameter_Element();

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

  }

} //FlowPackage
