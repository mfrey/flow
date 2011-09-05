/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FlowFactory;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.Import;
import de.hs_rm.cs.vs.dsm.flow.Model;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.OWLTestElement;
import de.hs_rm.cs.vs.dsm.flow.Operator;
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
import de.hs_rm.cs.vs.dsm.flow.TagElement;
import de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;
import de.hs_rm.cs.vs.dsm.flow.TestAssign;
import de.hs_rm.cs.vs.dsm.flow.TestElement;
import de.hs_rm.cs.vs.dsm.flow.Variable;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import owl.OwlPackage;

import rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass owlTestElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamOperatorParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass standardDeviationOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass averageOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementJoinOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagClassElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagObjectPropertyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagDataTypePropertyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputOperatorParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass barrierOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass windowOperatorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FlowPackageImpl()
  {
    super(eNS_URI, FlowFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FlowPackage init()
  {
    if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

    // Obtain or create and register package
    FlowPackageImpl theFlowPackage = (FlowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlowPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    OwlPackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();
    RdfsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFlowPackage.createPackageContents();

    // Initialize created meta-data
    theFlowPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFlowPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);
    return theFlowPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Model()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamDeclaration()
  {
    return streamDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreamDeclaration_Name()
  {
    return (EAttribute)streamDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamDeclaration_Elements()
  {
    return (EReference)streamDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamElement()
  {
    return streamElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamElement_Type()
  {
    return (EReference)streamElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreamElement_Name()
  {
    return (EAttribute)streamElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestElement()
  {
    return testElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestElement_Name()
  {
    return (EAttribute)testElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestAssign()
  {
    return testAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestAssign_Left()
  {
    return (EReference)testAssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestAssign_Right()
  {
    return (EReference)testAssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOWLTestElement()
  {
    return owlTestElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOWLTestElement_Element()
  {
    return (EReference)owlTestElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Type()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamDefinition()
  {
    return streamDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamDefinition_Reference()
  {
    return (EReference)streamDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreamDefinition_Name()
  {
    return (EAttribute)streamDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamAccess()
  {
    return streamAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamAccess_Reference()
  {
    return (EReference)streamAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamAccess_Element()
  {
    return (EReference)streamAccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamOperatorParameter()
  {
    return streamOperatorParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamOperatorParameter_Stream()
  {
    return (EReference)streamOperatorParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamOperatorParameter_Barrier()
  {
    return (EReference)streamOperatorParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountOperator()
  {
    return countOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountOperator_Parameter()
  {
    return (EReference)countOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountOperator_Stream()
  {
    return (EReference)countOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStandardDeviationOperator()
  {
    return standardDeviationOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStandardDeviationOperator_Parameter()
  {
    return (EReference)standardDeviationOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStandardDeviationOperator_Stream()
  {
    return (EReference)standardDeviationOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAverageOperator()
  {
    return averageOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAverageOperator_Parameter()
  {
    return (EReference)averageOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAverageOperator_Stream()
  {
    return (EReference)averageOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementJoinOperator()
  {
    return elementJoinOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementJoinOperator_ElementParameters()
  {
    return (EReference)elementJoinOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementJoinOperator_VariableElementParameters()
  {
    return (EReference)elementJoinOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementJoinOperator_Parameter()
  {
    return (EReference)elementJoinOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagOperator()
  {
    return tagOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagOperator_Parameters()
  {
    return (EReference)tagOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagOperator_Stream()
  {
    return (EReference)tagOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagElement()
  {
    return tagElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagElement_Reference()
  {
    return (EReference)tagElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagClassElement()
  {
    return tagClassElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagClassElement_Element()
  {
    return (EReference)tagClassElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagObjectPropertyElement()
  {
    return tagObjectPropertyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagObjectPropertyElement_Element()
  {
    return (EReference)tagObjectPropertyElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagDataTypePropertyElement()
  {
    return tagDataTypePropertyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagDataTypePropertyElement_Element()
  {
    return (EReference)tagDataTypePropertyElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputOperator()
  {
    return outputOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOperator_Parameter()
  {
    return (EReference)outputOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputOperator_Location()
  {
    return (EAttribute)outputOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOperator_Stream()
  {
    return (EReference)outputOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputOperatorParameter()
  {
    return outputOperatorParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputOperatorParameter_Element()
  {
    return (EReference)outputOperatorParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBarrierOperator()
  {
    return barrierOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWindowOperator()
  {
    return windowOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWindowOperator_Setting()
  {
    return (EAttribute)windowOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWindowOperator_Value()
  {
    return (EAttribute)windowOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWindowOperator_Unit()
  {
    return (EAttribute)windowOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowFactory getFlowFactory()
  {
    return (FlowFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MODEL);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    modelElementEClass = createEClass(MODEL_ELEMENT);

    streamDeclarationEClass = createEClass(STREAM_DECLARATION);
    createEAttribute(streamDeclarationEClass, STREAM_DECLARATION__NAME);
    createEReference(streamDeclarationEClass, STREAM_DECLARATION__ELEMENTS);

    streamElementEClass = createEClass(STREAM_ELEMENT);
    createEReference(streamElementEClass, STREAM_ELEMENT__TYPE);
    createEAttribute(streamElementEClass, STREAM_ELEMENT__NAME);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    testElementEClass = createEClass(TEST_ELEMENT);
    createEAttribute(testElementEClass, TEST_ELEMENT__NAME);

    testAssignEClass = createEClass(TEST_ASSIGN);
    createEReference(testAssignEClass, TEST_ASSIGN__LEFT);
    createEReference(testAssignEClass, TEST_ASSIGN__RIGHT);

    owlTestElementEClass = createEClass(OWL_TEST_ELEMENT);
    createEReference(owlTestElementEClass, OWL_TEST_ELEMENT__ELEMENT);

    operatorEClass = createEClass(OPERATOR);

    variableEClass = createEClass(VARIABLE);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

    streamDefinitionEClass = createEClass(STREAM_DEFINITION);
    createEReference(streamDefinitionEClass, STREAM_DEFINITION__REFERENCE);
    createEAttribute(streamDefinitionEClass, STREAM_DEFINITION__NAME);

    streamAccessEClass = createEClass(STREAM_ACCESS);
    createEReference(streamAccessEClass, STREAM_ACCESS__REFERENCE);
    createEReference(streamAccessEClass, STREAM_ACCESS__ELEMENT);

    streamOperatorParameterEClass = createEClass(STREAM_OPERATOR_PARAMETER);
    createEReference(streamOperatorParameterEClass, STREAM_OPERATOR_PARAMETER__STREAM);
    createEReference(streamOperatorParameterEClass, STREAM_OPERATOR_PARAMETER__BARRIER);

    countOperatorEClass = createEClass(COUNT_OPERATOR);
    createEReference(countOperatorEClass, COUNT_OPERATOR__PARAMETER);
    createEReference(countOperatorEClass, COUNT_OPERATOR__STREAM);

    standardDeviationOperatorEClass = createEClass(STANDARD_DEVIATION_OPERATOR);
    createEReference(standardDeviationOperatorEClass, STANDARD_DEVIATION_OPERATOR__PARAMETER);
    createEReference(standardDeviationOperatorEClass, STANDARD_DEVIATION_OPERATOR__STREAM);

    averageOperatorEClass = createEClass(AVERAGE_OPERATOR);
    createEReference(averageOperatorEClass, AVERAGE_OPERATOR__PARAMETER);
    createEReference(averageOperatorEClass, AVERAGE_OPERATOR__STREAM);

    elementJoinOperatorEClass = createEClass(ELEMENT_JOIN_OPERATOR);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__PARAMETER);

    tagOperatorEClass = createEClass(TAG_OPERATOR);
    createEReference(tagOperatorEClass, TAG_OPERATOR__PARAMETERS);
    createEReference(tagOperatorEClass, TAG_OPERATOR__STREAM);

    tagElementEClass = createEClass(TAG_ELEMENT);
    createEReference(tagElementEClass, TAG_ELEMENT__REFERENCE);

    tagClassElementEClass = createEClass(TAG_CLASS_ELEMENT);
    createEReference(tagClassElementEClass, TAG_CLASS_ELEMENT__ELEMENT);

    tagObjectPropertyElementEClass = createEClass(TAG_OBJECT_PROPERTY_ELEMENT);
    createEReference(tagObjectPropertyElementEClass, TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT);

    tagDataTypePropertyElementEClass = createEClass(TAG_DATA_TYPE_PROPERTY_ELEMENT);
    createEReference(tagDataTypePropertyElementEClass, TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT);

    outputOperatorEClass = createEClass(OUTPUT_OPERATOR);
    createEReference(outputOperatorEClass, OUTPUT_OPERATOR__PARAMETER);
    createEAttribute(outputOperatorEClass, OUTPUT_OPERATOR__LOCATION);
    createEReference(outputOperatorEClass, OUTPUT_OPERATOR__STREAM);

    outputOperatorParameterEClass = createEClass(OUTPUT_OPERATOR_PARAMETER);
    createEReference(outputOperatorParameterEClass, OUTPUT_OPERATOR_PARAMETER__ELEMENT);

    barrierOperatorEClass = createEClass(BARRIER_OPERATOR);

    windowOperatorEClass = createEClass(WINDOW_OPERATOR);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__SETTING);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__VALUE);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__UNIT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    OwlPackage theOwlPackage = (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getModelElement());
    streamDeclarationEClass.getESuperTypes().add(this.getModelElement());
    importEClass.getESuperTypes().add(this.getModelElement());
    testElementEClass.getESuperTypes().add(this.getModelElement());
    testAssignEClass.getESuperTypes().add(this.getModelElement());
    operatorEClass.getESuperTypes().add(this.getModelElement());
    variableDeclarationEClass.getESuperTypes().add(this.getVariable());
    streamDefinitionEClass.getESuperTypes().add(this.getModelElement());
    countOperatorEClass.getESuperTypes().add(this.getOperator());
    standardDeviationOperatorEClass.getESuperTypes().add(this.getOperator());
    averageOperatorEClass.getESuperTypes().add(this.getOperator());
    elementJoinOperatorEClass.getESuperTypes().add(this.getOperator());
    tagOperatorEClass.getESuperTypes().add(this.getOperator());
    tagClassElementEClass.getESuperTypes().add(this.getTagElement());
    tagObjectPropertyElementEClass.getESuperTypes().add(this.getTagElement());
    tagDataTypePropertyElementEClass.getESuperTypes().add(this.getTagElement());
    outputOperatorEClass.getESuperTypes().add(this.getOperator());
    windowOperatorEClass.getESuperTypes().add(this.getBarrierOperator());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Model(), this.getPackageDeclaration(), null, "model", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getModelElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(streamDeclarationEClass, StreamDeclaration.class, "StreamDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStreamDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamDeclaration_Elements(), this.getStreamElement(), null, "elements", null, 0, -1, StreamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamElementEClass, StreamElement.class, "StreamElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamElement_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, StreamElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStreamElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testElementEClass, TestElement.class, "TestElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testAssignEClass, TestAssign.class, "TestAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestAssign_Left(), this.getTestElement(), null, "left", null, 0, 1, TestAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestAssign_Right(), this.getTestElement(), null, "right", null, 0, 1, TestAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(owlTestElementEClass, OWLTestElement.class, "OWLTestElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOWLTestElement_Element(), theOwlPackage.getOWLClass(), null, "element", null, 0, 1, OWLTestElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamDefinitionEClass, StreamDefinition.class, "StreamDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamDefinition_Reference(), this.getStreamDeclaration(), null, "reference", null, 0, 1, StreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStreamDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamAccessEClass, StreamAccess.class, "StreamAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamAccess_Reference(), this.getStreamDefinition(), null, "reference", null, 0, 1, StreamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamAccess_Element(), this.getVariableDeclaration(), null, "element", null, 0, 1, StreamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamOperatorParameterEClass, StreamOperatorParameter.class, "StreamOperatorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamOperatorParameter_Stream(), this.getStreamDefinition(), null, "stream", null, 0, 1, StreamOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamOperatorParameter_Barrier(), this.getBarrierOperator(), null, "barrier", null, 0, 1, StreamOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countOperatorEClass, CountOperator.class, "CountOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCountOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, CountOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, CountOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardDeviationOperatorEClass, StandardDeviationOperator.class, "StandardDeviationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStandardDeviationOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, StandardDeviationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStandardDeviationOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, StandardDeviationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(averageOperatorEClass, AverageOperator.class, "AverageOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAverageOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, AverageOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAverageOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, AverageOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementJoinOperatorEClass, ElementJoinOperator.class, "ElementJoinOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementJoinOperator_ElementParameters(), this.getStreamAccess(), null, "elementParameters", null, 0, -1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementJoinOperator_VariableElementParameters(), this.getVariable(), null, "variableElementParameters", null, 0, -1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementJoinOperator_Parameter(), this.getStreamOperatorParameter(), null, "parameter", null, 0, 1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagOperatorEClass, TagOperator.class, "TagOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagOperator_Parameters(), this.getTagElement(), null, "parameters", null, 0, -1, TagOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTagOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, TagOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagElementEClass, TagElement.class, "TagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagElement_Reference(), this.getStreamAccess(), null, "reference", null, 0, 1, TagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagClassElementEClass, TagClassElement.class, "TagClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagClassElement_Element(), theOwlPackage.getOWLClass(), null, "element", null, 0, 1, TagClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagObjectPropertyElementEClass, TagObjectPropertyElement.class, "TagObjectPropertyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagObjectPropertyElement_Element(), theOwlPackage.getOWLObjectProperty(), null, "element", null, 0, 1, TagObjectPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagDataTypePropertyElementEClass, TagDataTypePropertyElement.class, "TagDataTypePropertyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagDataTypePropertyElement_Element(), theOwlPackage.getOWLDatatypeProperty(), null, "element", null, 0, 1, TagDataTypePropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOperatorEClass, OutputOperator.class, "OutputOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOperator_Parameter(), this.getOutputOperatorParameter(), null, "parameter", null, 0, 1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputOperator_Location(), ecorePackage.getEString(), "location", null, 0, 1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOperatorParameterEClass, OutputOperatorParameter.class, "OutputOperatorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOperatorParameter_Element(), this.getStreamAccess(), null, "element", null, 0, -1, OutputOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(barrierOperatorEClass, BarrierOperator.class, "BarrierOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(windowOperatorEClass, WindowOperator.class, "WindowOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWindowOperator_Setting(), ecorePackage.getEString(), "setting", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWindowOperator_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWindowOperator_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FlowPackageImpl
