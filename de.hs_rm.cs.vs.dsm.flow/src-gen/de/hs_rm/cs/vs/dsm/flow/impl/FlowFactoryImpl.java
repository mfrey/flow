/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.*;

import org.eclipse.emf.ecore.EClass;
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
      case FlowPackage.STREAM_DECLARATION: return createStreamDeclaration();
      case FlowPackage.STREAM_ELEMENT: return createStreamElement();
      case FlowPackage.IMPORT: return createImport();
      case FlowPackage.TEST_ELEMENT: return createTestElement();
      case FlowPackage.TEST_ASSIGN: return createTestAssign();
      case FlowPackage.OWL_TEST_ELEMENT: return createOWLTestElement();
      case FlowPackage.OPERATOR: return createOperator();
      case FlowPackage.VARIABLE: return createVariable();
      case FlowPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case FlowPackage.STREAM_DEFINITION: return createStreamDefinition();
      case FlowPackage.STREAM_ACCESS: return createStreamAccess();
      case FlowPackage.STREAM_OPERATOR_PARAMETER: return createStreamOperatorParameter();
      case FlowPackage.COUNT_OPERATOR: return createCountOperator();
      case FlowPackage.STANDARD_DEVIATION_OPERATOR: return createStandardDeviationOperator();
      case FlowPackage.AVERAGE_OPERATOR: return createAverageOperator();
      case FlowPackage.ELEMENT_JOIN_OPERATOR: return createElementJoinOperator();
      case FlowPackage.TAG_OPERATOR: return createTagOperator();
      case FlowPackage.TAG_ELEMENT: return createTagElement();
      case FlowPackage.TAG_CLASS_ELEMENT: return createTagClassElement();
      case FlowPackage.TAG_OBJECT_PROPERTY_ELEMENT: return createTagObjectPropertyElement();
      case FlowPackage.TAG_DATA_TYPE_PROPERTY_ELEMENT: return createTagDataTypePropertyElement();
      case FlowPackage.OUTPUT_OPERATOR: return createOutputOperator();
      case FlowPackage.OUTPUT_OPERATOR_PARAMETER: return createOutputOperatorParameter();
      case FlowPackage.BARRIER_OPERATOR: return createBarrierOperator();
      case FlowPackage.WINDOW_OPERATOR: return createWindowOperator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public TestElement createTestElement()
  {
    TestElementImpl testElement = new TestElementImpl();
    return testElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestAssign createTestAssign()
  {
    TestAssignImpl testAssign = new TestAssignImpl();
    return testAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OWLTestElement createOWLTestElement()
  {
    OWLTestElementImpl owlTestElement = new OWLTestElementImpl();
    return owlTestElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
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
  public OutputOperatorParameter createOutputOperatorParameter()
  {
    OutputOperatorParameterImpl outputOperatorParameter = new OutputOperatorParameterImpl();
    return outputOperatorParameter;
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
