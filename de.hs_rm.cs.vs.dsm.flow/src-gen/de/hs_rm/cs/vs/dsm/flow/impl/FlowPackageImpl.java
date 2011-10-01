/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.impl;

import de.hs_rm.cs.vs.dsm.flow.AntecedentRule;
import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.BarrierOperator;
import de.hs_rm.cs.vs.dsm.flow.BlockExpression;
import de.hs_rm.cs.vs.dsm.flow.BooleanDataType;
import de.hs_rm.cs.vs.dsm.flow.BooleanOperation;
import de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.ComplexDataType;
import de.hs_rm.cs.vs.dsm.flow.ConsequentRule;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.DataType;
import de.hs_rm.cs.vs.dsm.flow.DifferenceOperator;
import de.hs_rm.cs.vs.dsm.flow.Div;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.Expression;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.FloatDataType;
import de.hs_rm.cs.vs.dsm.flow.FlowFactory;
import de.hs_rm.cs.vs.dsm.flow.FlowPackage;
import de.hs_rm.cs.vs.dsm.flow.Import;
import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.MarkerOperator;
import de.hs_rm.cs.vs.dsm.flow.MatchOperator;
import de.hs_rm.cs.vs.dsm.flow.Minus;
import de.hs_rm.cs.vs.dsm.flow.Model;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.Multi;
import de.hs_rm.cs.vs.dsm.flow.NoReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.NumberLiteral;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.OCLOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.Plus;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.ReturnVariable;
import de.hs_rm.cs.vs.dsm.flow.Returnable;
import de.hs_rm.cs.vs.dsm.flow.Rule;
import de.hs_rm.cs.vs.dsm.flow.SWRLOperator;
import de.hs_rm.cs.vs.dsm.flow.SWRLRule;
import de.hs_rm.cs.vs.dsm.flow.SimpleDataType;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamElement;
import de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement;
import de.hs_rm.cs.vs.dsm.flow.StringDataType;
import de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StructureDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StructureElements;
import de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator;
import de.hs_rm.cs.vs.dsm.flow.TagClassElement;
import de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagElement;
import de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;
import de.hs_rm.cs.vs.dsm.flow.UnTagElement;
import de.hs_rm.cs.vs.dsm.flow.UnTagOperator;
import de.hs_rm.cs.vs.dsm.flow.Variable;
import de.hs_rm.cs.vs.dsm.flow.VariableCall;
import de.hs_rm.cs.vs.dsm.flow.VariableDeclaration;
import de.hs_rm.cs.vs.dsm.flow.VariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.WhileLoopDefinition;
import de.hs_rm.cs.vs.dsm.flow.WindowOperator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamVariableStatementEClass = null;

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
  private EClass streamDeclarationAccessEClass = null;

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
  private EClass joinOperatorEClass = null;

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
  private EClass elementJoinOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splitOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symmetricDifferenceOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass differenceOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnTypeOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noReturnTypeOperatorEClass = null;

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
  private EClass unTagOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unTagElementEClass = null;

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
  private EClass barrierOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass windowOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markerOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swrlOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swrlRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antecedentRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consequentRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclOperatorEClass = null;

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
  private EClass blockExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnableEClass = null;

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
  private EClass whileLoopDefinitionEClass = null;

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
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberVariableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVariableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanVariableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureDeclarationEClass = null;

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
  private EClass structureElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableCallEClass = null;

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
  public EReference getModel_Models()
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
  public EClass getStreamStatement()
  {
    return streamStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamStatement_ReturnStream()
  {
    return (EReference)streamStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamStatement_Expression()
  {
    return (EReference)streamStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamStatement_Statement()
  {
    return (EReference)streamStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamVariableStatement()
  {
    return streamVariableStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamVariableStatement_Reference()
  {
    return (EReference)streamVariableStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamVariableStatement_Expression()
  {
    return (EReference)streamVariableStatementEClass.getEStructuralFeatures().get(1);
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
  public EReference getStreamAccess_StreamVariable()
  {
    return (EReference)streamAccessEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamDeclarationAccess()
  {
    return streamDeclarationAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamDeclarationAccess_Reference()
  {
    return (EReference)streamDeclarationAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamDeclarationAccess_Element()
  {
    return (EReference)streamDeclarationAccessEClass.getEStructuralFeatures().get(1);
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
  public EClass getJoinOperator()
  {
    return joinOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinOperator_Parameters()
  {
    return (EReference)joinOperatorEClass.getEStructuralFeatures().get(0);
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
  public EClass getFilterOperator()
  {
    return filterOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterOperator_Expression()
  {
    return (EReference)filterOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterOperator_Stream()
  {
    return (EReference)filterOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplitOperator()
  {
    return splitOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitOperator_Parameter()
  {
    return (EReference)splitOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchOperator()
  {
    return matchOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchOperator_Expression()
  {
    return (EReference)matchOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchOperator_Calculation()
  {
    return (EReference)matchOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchOperator_Stream()
  {
    return (EReference)matchOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymmetricDifferenceOperator()
  {
    return symmetricDifferenceOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymmetricDifferenceOperator_Parameters()
  {
    return (EReference)symmetricDifferenceOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifferenceOperator()
  {
    return differenceOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferenceOperator_Parameters()
  {
    return (EReference)differenceOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputOperator()
  {
    return inputOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOperator_Iri()
  {
    return (EAttribute)inputOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOperator_Port()
  {
    return (EAttribute)inputOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputOperator_Socket()
  {
    return (EAttribute)inputOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnTypeOperator()
  {
    return returnTypeOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoReturnTypeOperator()
  {
    return noReturnTypeOperatorEClass;
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
  public EClass getUnTagOperator()
  {
    return unTagOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnTagOperator_Parameters()
  {
    return (EReference)unTagOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnTagOperator_Stream()
  {
    return (EReference)unTagOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnTagElement()
  {
    return unTagElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnTagElement_Element()
  {
    return (EReference)unTagElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnTagElement_Reference()
  {
    return (EReference)unTagElementEClass.getEStructuralFeatures().get(1);
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
  public EClass getMarkerOperator()
  {
    return markerOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarkerOperator_Expression()
  {
    return (EReference)markerOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSWRLOperator()
  {
    return swrlOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSWRLOperator_Rule()
  {
    return (EReference)swrlOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSWRLOperator_Barrier()
  {
    return (EReference)swrlOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSWRLRule()
  {
    return swrlRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSWRLRule_Antecedent()
  {
    return (EReference)swrlRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSWRLRule_Consequent()
  {
    return (EReference)swrlRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntecedentRule()
  {
    return antecedentRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAntecedentRule_Atoms()
  {
    return (EReference)antecedentRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsequentRule()
  {
    return consequentRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsequentRule_Atoms()
  {
    return (EReference)consequentRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Name()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Variable()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOCLOperator()
  {
    return oclOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperator_Constraint()
  {
    return (EAttribute)oclOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperator_Stream()
  {
    return (EReference)oclOperatorEClass.getEStructuralFeatures().get(1);
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
  public EClass getBlockExpression()
  {
    return blockExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnVariable()
  {
    return returnVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnVariable_Returnable()
  {
    return (EReference)returnVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnable()
  {
    return returnableEClass;
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
  public EClass getWhileLoopDefinition()
  {
    return whileLoopDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoopDefinition_Condition()
  {
    return (EReference)whileLoopDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoopDefinition_Statements()
  {
    return (EReference)whileLoopDefinitionEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberVariableDefinition()
  {
    return numberVariableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberVariableDefinition_Type()
  {
    return (EReference)numberVariableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberVariableDefinition_Value()
  {
    return (EAttribute)numberVariableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVariableDefinition()
  {
    return stringVariableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringVariableDefinition_Type()
  {
    return (EReference)stringVariableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringVariableDefinition_Value()
  {
    return (EAttribute)stringVariableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanVariableDefinition()
  {
    return booleanVariableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanVariableDefinition_Type()
  {
    return (EReference)booleanVariableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanVariableDefinition_Value()
  {
    return (EAttribute)booleanVariableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureDeclaration()
  {
    return structureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureDeclaration_Name()
  {
    return (EAttribute)structureDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureDeclaration_Elements()
  {
    return (EReference)structureDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EClass getStructureElements()
  {
    return structureElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureElements_Element()
  {
    return (EReference)structureElementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleDataType()
  {
    return simpleDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexDataType()
  {
    return complexDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerDataType()
  {
    return integerDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanDataType()
  {
    return booleanDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatDataType()
  {
    return floatDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringDataType()
  {
    return stringDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanOperation()
  {
    return booleanOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanOperation_Left()
  {
    return (EReference)booleanOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanOperation_Operator()
  {
    return (EAttribute)booleanOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanOperation_Right()
  {
    return (EReference)booleanOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulti()
  {
    return multiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Left()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Right()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Left()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Right()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableCall()
  {
    return variableCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableCall_Variable()
  {
    return (EReference)variableCallEClass.getEStructuralFeatures().get(0);
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
    createEReference(modelEClass, MODEL__MODELS);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    modelElementEClass = createEClass(MODEL_ELEMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    streamStatementEClass = createEClass(STREAM_STATEMENT);
    createEReference(streamStatementEClass, STREAM_STATEMENT__RETURN_STREAM);
    createEReference(streamStatementEClass, STREAM_STATEMENT__EXPRESSION);
    createEReference(streamStatementEClass, STREAM_STATEMENT__STATEMENT);

    streamVariableStatementEClass = createEClass(STREAM_VARIABLE_STATEMENT);
    createEReference(streamVariableStatementEClass, STREAM_VARIABLE_STATEMENT__REFERENCE);
    createEReference(streamVariableStatementEClass, STREAM_VARIABLE_STATEMENT__EXPRESSION);

    streamAccessEClass = createEClass(STREAM_ACCESS);
    createEReference(streamAccessEClass, STREAM_ACCESS__REFERENCE);
    createEReference(streamAccessEClass, STREAM_ACCESS__ELEMENT);
    createEReference(streamAccessEClass, STREAM_ACCESS__STREAM_VARIABLE);

    streamDeclarationAccessEClass = createEClass(STREAM_DECLARATION_ACCESS);
    createEReference(streamDeclarationAccessEClass, STREAM_DECLARATION_ACCESS__REFERENCE);
    createEReference(streamDeclarationAccessEClass, STREAM_DECLARATION_ACCESS__ELEMENT);

    streamDefinitionEClass = createEClass(STREAM_DEFINITION);
    createEReference(streamDefinitionEClass, STREAM_DEFINITION__REFERENCE);
    createEAttribute(streamDefinitionEClass, STREAM_DEFINITION__NAME);

    joinOperatorEClass = createEClass(JOIN_OPERATOR);
    createEReference(joinOperatorEClass, JOIN_OPERATOR__PARAMETERS);

    streamOperatorParameterEClass = createEClass(STREAM_OPERATOR_PARAMETER);
    createEReference(streamOperatorParameterEClass, STREAM_OPERATOR_PARAMETER__STREAM);
    createEReference(streamOperatorParameterEClass, STREAM_OPERATOR_PARAMETER__BARRIER);

    elementJoinOperatorEClass = createEClass(ELEMENT_JOIN_OPERATOR);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__ELEMENT_PARAMETERS);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__VARIABLE_ELEMENT_PARAMETERS);
    createEReference(elementJoinOperatorEClass, ELEMENT_JOIN_OPERATOR__PARAMETER);

    filterOperatorEClass = createEClass(FILTER_OPERATOR);
    createEReference(filterOperatorEClass, FILTER_OPERATOR__EXPRESSION);
    createEReference(filterOperatorEClass, FILTER_OPERATOR__STREAM);

    splitOperatorEClass = createEClass(SPLIT_OPERATOR);
    createEReference(splitOperatorEClass, SPLIT_OPERATOR__PARAMETER);

    matchOperatorEClass = createEClass(MATCH_OPERATOR);
    createEReference(matchOperatorEClass, MATCH_OPERATOR__EXPRESSION);
    createEReference(matchOperatorEClass, MATCH_OPERATOR__CALCULATION);
    createEReference(matchOperatorEClass, MATCH_OPERATOR__STREAM);

    symmetricDifferenceOperatorEClass = createEClass(SYMMETRIC_DIFFERENCE_OPERATOR);
    createEReference(symmetricDifferenceOperatorEClass, SYMMETRIC_DIFFERENCE_OPERATOR__PARAMETERS);

    differenceOperatorEClass = createEClass(DIFFERENCE_OPERATOR);
    createEReference(differenceOperatorEClass, DIFFERENCE_OPERATOR__PARAMETERS);

    inputOperatorEClass = createEClass(INPUT_OPERATOR);
    createEAttribute(inputOperatorEClass, INPUT_OPERATOR__IRI);
    createEAttribute(inputOperatorEClass, INPUT_OPERATOR__PORT);
    createEAttribute(inputOperatorEClass, INPUT_OPERATOR__SOCKET);

    returnTypeOperatorEClass = createEClass(RETURN_TYPE_OPERATOR);

    noReturnTypeOperatorEClass = createEClass(NO_RETURN_TYPE_OPERATOR);

    tagOperatorEClass = createEClass(TAG_OPERATOR);
    createEReference(tagOperatorEClass, TAG_OPERATOR__PARAMETERS);

    unTagOperatorEClass = createEClass(UN_TAG_OPERATOR);
    createEReference(unTagOperatorEClass, UN_TAG_OPERATOR__PARAMETERS);
    createEReference(unTagOperatorEClass, UN_TAG_OPERATOR__STREAM);

    unTagElementEClass = createEClass(UN_TAG_ELEMENT);
    createEReference(unTagElementEClass, UN_TAG_ELEMENT__ELEMENT);
    createEReference(unTagElementEClass, UN_TAG_ELEMENT__REFERENCE);

    tagElementEClass = createEClass(TAG_ELEMENT);
    createEReference(tagElementEClass, TAG_ELEMENT__REFERENCE);

    tagClassElementEClass = createEClass(TAG_CLASS_ELEMENT);
    createEReference(tagClassElementEClass, TAG_CLASS_ELEMENT__ELEMENT);

    tagObjectPropertyElementEClass = createEClass(TAG_OBJECT_PROPERTY_ELEMENT);
    createEReference(tagObjectPropertyElementEClass, TAG_OBJECT_PROPERTY_ELEMENT__ELEMENT);

    tagDataTypePropertyElementEClass = createEClass(TAG_DATA_TYPE_PROPERTY_ELEMENT);
    createEReference(tagDataTypePropertyElementEClass, TAG_DATA_TYPE_PROPERTY_ELEMENT__ELEMENT);

    barrierOperatorEClass = createEClass(BARRIER_OPERATOR);

    windowOperatorEClass = createEClass(WINDOW_OPERATOR);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__SETTING);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__VALUE);
    createEAttribute(windowOperatorEClass, WINDOW_OPERATOR__UNIT);

    markerOperatorEClass = createEClass(MARKER_OPERATOR);
    createEReference(markerOperatorEClass, MARKER_OPERATOR__EXPRESSION);

    swrlOperatorEClass = createEClass(SWRL_OPERATOR);
    createEReference(swrlOperatorEClass, SWRL_OPERATOR__RULE);
    createEReference(swrlOperatorEClass, SWRL_OPERATOR__BARRIER);

    swrlRuleEClass = createEClass(SWRL_RULE);
    createEReference(swrlRuleEClass, SWRL_RULE__ANTECEDENT);
    createEReference(swrlRuleEClass, SWRL_RULE__CONSEQUENT);

    antecedentRuleEClass = createEClass(ANTECEDENT_RULE);
    createEReference(antecedentRuleEClass, ANTECEDENT_RULE__ATOMS);

    consequentRuleEClass = createEClass(CONSEQUENT_RULE);
    createEReference(consequentRuleEClass, CONSEQUENT_RULE__ATOMS);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__VARIABLE);

    oclOperatorEClass = createEClass(OCL_OPERATOR);
    createEAttribute(oclOperatorEClass, OCL_OPERATOR__CONSTRAINT);
    createEReference(oclOperatorEClass, OCL_OPERATOR__STREAM);

    countOperatorEClass = createEClass(COUNT_OPERATOR);
    createEReference(countOperatorEClass, COUNT_OPERATOR__PARAMETER);
    createEReference(countOperatorEClass, COUNT_OPERATOR__STREAM);

    standardDeviationOperatorEClass = createEClass(STANDARD_DEVIATION_OPERATOR);
    createEReference(standardDeviationOperatorEClass, STANDARD_DEVIATION_OPERATOR__PARAMETER);
    createEReference(standardDeviationOperatorEClass, STANDARD_DEVIATION_OPERATOR__STREAM);

    averageOperatorEClass = createEClass(AVERAGE_OPERATOR);
    createEReference(averageOperatorEClass, AVERAGE_OPERATOR__PARAMETER);
    createEReference(averageOperatorEClass, AVERAGE_OPERATOR__STREAM);

    outputOperatorEClass = createEClass(OUTPUT_OPERATOR);
    createEReference(outputOperatorEClass, OUTPUT_OPERATOR__PARAMETER);
    createEAttribute(outputOperatorEClass, OUTPUT_OPERATOR__LOCATION);
    createEReference(outputOperatorEClass, OUTPUT_OPERATOR__STREAM);

    outputOperatorParameterEClass = createEClass(OUTPUT_OPERATOR_PARAMETER);
    createEReference(outputOperatorParameterEClass, OUTPUT_OPERATOR_PARAMETER__ELEMENT);

    blockExpressionEClass = createEClass(BLOCK_EXPRESSION);

    returnVariableEClass = createEClass(RETURN_VARIABLE);
    createEReference(returnVariableEClass, RETURN_VARIABLE__RETURNABLE);

    returnableEClass = createEClass(RETURNABLE);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);

    whileLoopDefinitionEClass = createEClass(WHILE_LOOP_DEFINITION);
    createEReference(whileLoopDefinitionEClass, WHILE_LOOP_DEFINITION__CONDITION);
    createEReference(whileLoopDefinitionEClass, WHILE_LOOP_DEFINITION__STATEMENTS);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);

    numberVariableDefinitionEClass = createEClass(NUMBER_VARIABLE_DEFINITION);
    createEReference(numberVariableDefinitionEClass, NUMBER_VARIABLE_DEFINITION__TYPE);
    createEAttribute(numberVariableDefinitionEClass, NUMBER_VARIABLE_DEFINITION__VALUE);

    stringVariableDefinitionEClass = createEClass(STRING_VARIABLE_DEFINITION);
    createEReference(stringVariableDefinitionEClass, STRING_VARIABLE_DEFINITION__TYPE);
    createEAttribute(stringVariableDefinitionEClass, STRING_VARIABLE_DEFINITION__VALUE);

    booleanVariableDefinitionEClass = createEClass(BOOLEAN_VARIABLE_DEFINITION);
    createEReference(booleanVariableDefinitionEClass, BOOLEAN_VARIABLE_DEFINITION__TYPE);
    createEAttribute(booleanVariableDefinitionEClass, BOOLEAN_VARIABLE_DEFINITION__VALUE);

    structureDeclarationEClass = createEClass(STRUCTURE_DECLARATION);
    createEAttribute(structureDeclarationEClass, STRUCTURE_DECLARATION__NAME);
    createEReference(structureDeclarationEClass, STRUCTURE_DECLARATION__ELEMENTS);

    streamDeclarationEClass = createEClass(STREAM_DECLARATION);
    createEAttribute(streamDeclarationEClass, STREAM_DECLARATION__NAME);
    createEReference(streamDeclarationEClass, STREAM_DECLARATION__ELEMENTS);

    streamElementEClass = createEClass(STREAM_ELEMENT);

    structureElementsEClass = createEClass(STRUCTURE_ELEMENTS);
    createEReference(structureElementsEClass, STRUCTURE_ELEMENTS__ELEMENT);

    expressionEClass = createEClass(EXPRESSION);

    dataTypeEClass = createEClass(DATA_TYPE);

    simpleDataTypeEClass = createEClass(SIMPLE_DATA_TYPE);

    complexDataTypeEClass = createEClass(COMPLEX_DATA_TYPE);

    integerDataTypeEClass = createEClass(INTEGER_DATA_TYPE);

    booleanDataTypeEClass = createEClass(BOOLEAN_DATA_TYPE);

    floatDataTypeEClass = createEClass(FLOAT_DATA_TYPE);

    stringDataTypeEClass = createEClass(STRING_DATA_TYPE);

    booleanOperationEClass = createEClass(BOOLEAN_OPERATION);
    createEReference(booleanOperationEClass, BOOLEAN_OPERATION__LEFT);
    createEAttribute(booleanOperationEClass, BOOLEAN_OPERATION__OPERATOR);
    createEReference(booleanOperationEClass, BOOLEAN_OPERATION__RIGHT);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    multiEClass = createEClass(MULTI);
    createEReference(multiEClass, MULTI__LEFT);
    createEReference(multiEClass, MULTI__RIGHT);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__LEFT);
    createEReference(divEClass, DIV__RIGHT);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    variableCallEClass = createEClass(VARIABLE_CALL);
    createEReference(variableCallEClass, VARIABLE_CALL__VARIABLE);
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
    OwlPackage theOwlPackage = (OwlPackage)EPackage.Registry.INSTANCE.getEPackage(OwlPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getModelElement());
    importEClass.getESuperTypes().add(this.getModelElement());
    streamStatementEClass.getESuperTypes().add(this.getModelElement());
    streamAccessEClass.getESuperTypes().add(this.getModelElement());
    streamAccessEClass.getESuperTypes().add(this.getExpression());
    streamDefinitionEClass.getESuperTypes().add(this.getModelElement());
    joinOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    elementJoinOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    filterOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    splitOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    matchOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    symmetricDifferenceOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    differenceOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    inputOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    noReturnTypeOperatorEClass.getESuperTypes().add(this.getModelElement());
    tagOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    unTagOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    tagClassElementEClass.getESuperTypes().add(this.getTagElement());
    tagObjectPropertyElementEClass.getESuperTypes().add(this.getTagElement());
    tagDataTypePropertyElementEClass.getESuperTypes().add(this.getTagElement());
    windowOperatorEClass.getESuperTypes().add(this.getBarrierOperator());
    markerOperatorEClass.getESuperTypes().add(this.getBarrierOperator());
    swrlOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    oclOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    countOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    standardDeviationOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    averageOperatorEClass.getESuperTypes().add(this.getReturnTypeOperator());
    outputOperatorEClass.getESuperTypes().add(this.getNoReturnTypeOperator());
    variableDeclarationEClass.getESuperTypes().add(this.getReturnable());
    variableDeclarationEClass.getESuperTypes().add(this.getVariable());
    variableDeclarationEClass.getESuperTypes().add(this.getStreamElement());
    whileLoopDefinitionEClass.getESuperTypes().add(this.getBlockExpression());
    variableEClass.getESuperTypes().add(this.getModelElement());
    variableEClass.getESuperTypes().add(this.getBlockExpression());
    variableEClass.getESuperTypes().add(this.getReturnable());
    variableDefinitionEClass.getESuperTypes().add(this.getVariable());
    numberVariableDefinitionEClass.getESuperTypes().add(this.getVariableDefinition());
    stringVariableDefinitionEClass.getESuperTypes().add(this.getVariableDefinition());
    booleanVariableDefinitionEClass.getESuperTypes().add(this.getVariableDefinition());
    structureDeclarationEClass.getESuperTypes().add(this.getModelElement());
    streamDeclarationEClass.getESuperTypes().add(this.getModelElement());
    structureElementsEClass.getESuperTypes().add(this.getStreamElement());
    simpleDataTypeEClass.getESuperTypes().add(this.getDataType());
    complexDataTypeEClass.getESuperTypes().add(this.getDataType());
    integerDataTypeEClass.getESuperTypes().add(this.getSimpleDataType());
    booleanDataTypeEClass.getESuperTypes().add(this.getSimpleDataType());
    floatDataTypeEClass.getESuperTypes().add(this.getSimpleDataType());
    stringDataTypeEClass.getESuperTypes().add(this.getComplexDataType());
    booleanOperationEClass.getESuperTypes().add(this.getExpression());
    plusEClass.getESuperTypes().add(this.getExpression());
    minusEClass.getESuperTypes().add(this.getExpression());
    multiEClass.getESuperTypes().add(this.getExpression());
    divEClass.getESuperTypes().add(this.getExpression());
    numberLiteralEClass.getESuperTypes().add(this.getExpression());
    variableCallEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Models(), this.getPackageDeclaration(), null, "models", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getModelElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamStatementEClass, StreamStatement.class, "StreamStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamStatement_ReturnStream(), this.getStreamDefinition(), null, "returnStream", null, 0, -1, StreamStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamStatement_Expression(), this.getReturnTypeOperator(), null, "expression", null, 0, 1, StreamStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamStatement_Statement(), this.getExpression(), null, "statement", null, 0, 1, StreamStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamVariableStatementEClass, StreamVariableStatement.class, "StreamVariableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamVariableStatement_Reference(), this.getStreamDefinition(), null, "reference", null, 0, 1, StreamVariableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamVariableStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, StreamVariableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamAccessEClass, StreamAccess.class, "StreamAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamAccess_Reference(), this.getStreamDefinition(), null, "reference", null, 0, 1, StreamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamAccess_Element(), this.getVariableDeclaration(), null, "element", null, 0, 1, StreamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamAccess_StreamVariable(), this.getStreamAccess(), null, "streamVariable", null, 0, 1, StreamAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamDeclarationAccessEClass, StreamDeclarationAccess.class, "StreamDeclarationAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamDeclarationAccess_Reference(), this.getStreamDeclaration(), null, "reference", null, 0, 1, StreamDeclarationAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamDeclarationAccess_Element(), this.getVariableDeclaration(), null, "element", null, 0, 1, StreamDeclarationAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamDefinitionEClass, StreamDefinition.class, "StreamDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamDefinition_Reference(), this.getStreamDeclaration(), null, "reference", null, 0, 1, StreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStreamDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinOperatorEClass, JoinOperator.class, "JoinOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinOperator_Parameters(), this.getStreamOperatorParameter(), null, "parameters", null, 0, -1, JoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamOperatorParameterEClass, StreamOperatorParameter.class, "StreamOperatorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStreamOperatorParameter_Stream(), this.getStreamDefinition(), null, "stream", null, 0, 1, StreamOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamOperatorParameter_Barrier(), this.getBarrierOperator(), null, "barrier", null, 0, 1, StreamOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementJoinOperatorEClass, ElementJoinOperator.class, "ElementJoinOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementJoinOperator_ElementParameters(), this.getStreamAccess(), null, "elementParameters", null, 0, -1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementJoinOperator_VariableElementParameters(), this.getVariable(), null, "variableElementParameters", null, 0, -1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementJoinOperator_Parameter(), this.getStreamOperatorParameter(), null, "parameter", null, 0, 1, ElementJoinOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterOperatorEClass, FilterOperator.class, "FilterOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterOperator_Expression(), this.getExpression(), null, "expression", null, 0, -1, FilterOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, FilterOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splitOperatorEClass, SplitOperator.class, "SplitOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSplitOperator_Parameter(), this.getStreamOperatorParameter(), null, "parameter", null, 0, 1, SplitOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchOperatorEClass, MatchOperator.class, "MatchOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchOperator_Expression(), this.getExpression(), null, "expression", null, 0, 1, MatchOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchOperator_Calculation(), this.getExpression(), null, "calculation", null, 0, 1, MatchOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, -1, MatchOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symmetricDifferenceOperatorEClass, SymmetricDifferenceOperator.class, "SymmetricDifferenceOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymmetricDifferenceOperator_Parameters(), this.getStreamOperatorParameter(), null, "parameters", null, 0, -1, SymmetricDifferenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(differenceOperatorEClass, DifferenceOperator.class, "DifferenceOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferenceOperator_Parameters(), this.getStreamOperatorParameter(), null, "parameters", null, 0, -1, DifferenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputOperatorEClass, InputOperator.class, "InputOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputOperator_Iri(), ecorePackage.getEString(), "iri", null, 0, -1, InputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOperator_Port(), ecorePackage.getEBigDecimal(), "port", null, 0, 1, InputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputOperator_Socket(), ecorePackage.getEString(), "socket", null, 0, 1, InputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnTypeOperatorEClass, ReturnTypeOperator.class, "ReturnTypeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noReturnTypeOperatorEClass, NoReturnTypeOperator.class, "NoReturnTypeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tagOperatorEClass, TagOperator.class, "TagOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagOperator_Parameters(), this.getTagElement(), null, "parameters", null, 0, -1, TagOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unTagOperatorEClass, UnTagOperator.class, "UnTagOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnTagOperator_Parameters(), this.getUnTagElement(), null, "parameters", null, 0, -1, UnTagOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnTagOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, UnTagOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unTagElementEClass, UnTagElement.class, "UnTagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnTagElement_Element(), theOwlPackage.getOWLClass(), null, "element", null, 0, 1, UnTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnTagElement_Reference(), this.getStreamAccess(), null, "reference", null, 0, 1, UnTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagElementEClass, TagElement.class, "TagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagElement_Reference(), this.getStreamAccess(), null, "reference", null, 0, 1, TagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagClassElementEClass, TagClassElement.class, "TagClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagClassElement_Element(), theOwlPackage.getOWLClass(), null, "element", null, 0, 1, TagClassElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagObjectPropertyElementEClass, TagObjectPropertyElement.class, "TagObjectPropertyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagObjectPropertyElement_Element(), theOwlPackage.getOWLObjectProperty(), null, "element", null, 0, 1, TagObjectPropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagDataTypePropertyElementEClass, TagDataTypePropertyElement.class, "TagDataTypePropertyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTagDataTypePropertyElement_Element(), theOwlPackage.getOWLDatatypeProperty(), null, "element", null, 0, 1, TagDataTypePropertyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(barrierOperatorEClass, BarrierOperator.class, "BarrierOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(windowOperatorEClass, WindowOperator.class, "WindowOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWindowOperator_Setting(), ecorePackage.getEString(), "setting", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWindowOperator_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWindowOperator_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, WindowOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(markerOperatorEClass, MarkerOperator.class, "MarkerOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMarkerOperator_Expression(), this.getExpression(), null, "expression", null, 0, 1, MarkerOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(swrlOperatorEClass, SWRLOperator.class, "SWRLOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSWRLOperator_Rule(), this.getSWRLRule(), null, "rule", null, 0, 1, SWRLOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSWRLOperator_Barrier(), this.getStreamOperatorParameter(), null, "barrier", null, 0, -1, SWRLOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(swrlRuleEClass, SWRLRule.class, "SWRLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSWRLRule_Antecedent(), this.getAntecedentRule(), null, "antecedent", null, 0, 1, SWRLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSWRLRule_Consequent(), this.getConsequentRule(), null, "consequent", null, 0, 1, SWRLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antecedentRuleEClass, AntecedentRule.class, "AntecedentRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAntecedentRule_Atoms(), this.getRule(), null, "atoms", null, 0, -1, AntecedentRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(consequentRuleEClass, ConsequentRule.class, "ConsequentRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConsequentRule_Atoms(), this.getRule(), null, "atoms", null, 0, -1, ConsequentRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_Name(), theOwlPackage.getOWLObjectProperty(), null, "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Variable(), this.getStreamAccess(), null, "variable", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclOperatorEClass, OCLOperator.class, "OCLOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOCLOperator_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, OCLOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, OCLOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countOperatorEClass, CountOperator.class, "CountOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCountOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, CountOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, CountOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(standardDeviationOperatorEClass, StandardDeviationOperator.class, "StandardDeviationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStandardDeviationOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, StandardDeviationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStandardDeviationOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, StandardDeviationOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(averageOperatorEClass, AverageOperator.class, "AverageOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAverageOperator_Parameter(), this.getStreamAccess(), null, "parameter", null, 0, 1, AverageOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAverageOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, 1, AverageOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOperatorEClass, OutputOperator.class, "OutputOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOperator_Parameter(), this.getOutputOperatorParameter(), null, "parameter", null, 0, 1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputOperator_Location(), ecorePackage.getEString(), "location", null, 0, 1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputOperator_Stream(), this.getStreamOperatorParameter(), null, "stream", null, 0, -1, OutputOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputOperatorParameterEClass, OutputOperatorParameter.class, "OutputOperatorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputOperatorParameter_Element(), this.getStreamAccess(), null, "element", null, 0, -1, OutputOperatorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockExpressionEClass, BlockExpression.class, "BlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnVariableEClass, ReturnVariable.class, "ReturnVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturnVariable_Returnable(), this.getReturnable(), null, "returnable", null, 0, 1, ReturnVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnableEClass, Returnable.class, "Returnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Type(), this.getDataType(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileLoopDefinitionEClass, WhileLoopDefinition.class, "WhileLoopDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileLoopDefinition_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhileLoopDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileLoopDefinition_Statements(), this.getBlockExpression(), null, "statements", null, 0, -1, WhileLoopDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberVariableDefinitionEClass, NumberVariableDefinition.class, "NumberVariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberVariableDefinition_Type(), this.getSimpleDataType(), null, "type", null, 0, 1, NumberVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberVariableDefinition_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, NumberVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringVariableDefinitionEClass, StringVariableDefinition.class, "StringVariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringVariableDefinition_Type(), this.getStringDataType(), null, "type", null, 0, 1, StringVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringVariableDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanVariableDefinitionEClass, BooleanVariableDefinition.class, "BooleanVariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanVariableDefinition_Type(), this.getBooleanDataType(), null, "type", null, 0, 1, BooleanVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanVariableDefinition_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanVariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureDeclarationEClass, StructureDeclaration.class, "StructureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructureDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructureDeclaration_Elements(), this.getVariableDeclaration(), null, "elements", null, 0, -1, StructureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamDeclarationEClass, StreamDeclaration.class, "StreamDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStreamDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamDeclaration_Elements(), this.getStreamElement(), null, "elements", null, 0, -1, StreamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamElementEClass, StreamElement.class, "StreamElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structureElementsEClass, StructureElements.class, "StructureElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureElements_Element(), this.getStructureDeclaration(), null, "element", null, 0, 1, StructureElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleDataTypeEClass, SimpleDataType.class, "SimpleDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexDataTypeEClass, ComplexDataType.class, "ComplexDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerDataTypeEClass, IntegerDataType.class, "IntegerDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanDataTypeEClass, BooleanDataType.class, "BooleanDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatDataTypeEClass, FloatDataType.class, "FloatDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringDataTypeEClass, StringDataType.class, "StringDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanOperationEClass, BooleanOperation.class, "BooleanOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanOperation_Left(), this.getExpression(), null, "left", null, 0, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanOperation_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanOperation_Right(), this.getExpression(), null, "right", null, 0, 1, BooleanOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiEClass, Multi.class, "Multi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulti_Left(), this.getExpression(), null, "left", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulti_Right(), this.getExpression(), null, "right", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiv_Left(), this.getExpression(), null, "left", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiv_Right(), this.getExpression(), null, "right", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableCallEClass, VariableCall.class, "VariableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableCall_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FlowPackageImpl
