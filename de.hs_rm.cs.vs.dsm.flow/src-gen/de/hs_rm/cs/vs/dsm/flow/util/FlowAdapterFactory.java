/**
 * <copyright>
 * </copyright>
 *
 */
package de.hs_rm.cs.vs.dsm.flow.util;

import de.hs_rm.cs.vs.dsm.flow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hs_rm.cs.vs.dsm.flow.FlowPackage
 * @generated
 */
public class FlowAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowSwitch<Adapter> modelSwitch =
    new FlowSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseStreamStatement(StreamStatement object)
      {
        return createStreamStatementAdapter();
      }
      @Override
      public Adapter caseStreamVariableStatement(StreamVariableStatement object)
      {
        return createStreamVariableStatementAdapter();
      }
      @Override
      public Adapter caseStreamAccess(StreamAccess object)
      {
        return createStreamAccessAdapter();
      }
      @Override
      public Adapter caseStreamDeclarationAccess(StreamDeclarationAccess object)
      {
        return createStreamDeclarationAccessAdapter();
      }
      @Override
      public Adapter caseStreamDefinition(StreamDefinition object)
      {
        return createStreamDefinitionAdapter();
      }
      @Override
      public Adapter caseJoinOperator(JoinOperator object)
      {
        return createJoinOperatorAdapter();
      }
      @Override
      public Adapter caseStreamOperatorParameter(StreamOperatorParameter object)
      {
        return createStreamOperatorParameterAdapter();
      }
      @Override
      public Adapter caseElementJoinOperator(ElementJoinOperator object)
      {
        return createElementJoinOperatorAdapter();
      }
      @Override
      public Adapter caseFilterOperator(FilterOperator object)
      {
        return createFilterOperatorAdapter();
      }
      @Override
      public Adapter caseSplitOperator(SplitOperator object)
      {
        return createSplitOperatorAdapter();
      }
      @Override
      public Adapter caseMatchOperator(MatchOperator object)
      {
        return createMatchOperatorAdapter();
      }
      @Override
      public Adapter caseSymmetricDifferenceOperator(SymmetricDifferenceOperator object)
      {
        return createSymmetricDifferenceOperatorAdapter();
      }
      @Override
      public Adapter caseDifferenceOperator(DifferenceOperator object)
      {
        return createDifferenceOperatorAdapter();
      }
      @Override
      public Adapter caseInputOperator(InputOperator object)
      {
        return createInputOperatorAdapter();
      }
      @Override
      public Adapter caseReturnTypeOperator(ReturnTypeOperator object)
      {
        return createReturnTypeOperatorAdapter();
      }
      @Override
      public Adapter caseNoReturnTypeOperator(NoReturnTypeOperator object)
      {
        return createNoReturnTypeOperatorAdapter();
      }
      @Override
      public Adapter caseTagOperator(TagOperator object)
      {
        return createTagOperatorAdapter();
      }
      @Override
      public Adapter caseNewTagOperator(NewTagOperator object)
      {
        return createNewTagOperatorAdapter();
      }
      @Override
      public Adapter caseQueryTagOperator(QueryTagOperator object)
      {
        return createQueryTagOperatorAdapter();
      }
      @Override
      public Adapter caseSparqlQuery(SparqlQuery object)
      {
        return createSparqlQueryAdapter();
      }
      @Override
      public Adapter caseSparqlQueryVariable(SparqlQueryVariable object)
      {
        return createSparqlQueryVariableAdapter();
      }
      @Override
      public Adapter caseUnTagOperator(UnTagOperator object)
      {
        return createUnTagOperatorAdapter();
      }
      @Override
      public Adapter caseUnTagElement(UnTagElement object)
      {
        return createUnTagElementAdapter();
      }
      @Override
      public Adapter caseTagElement(TagElement object)
      {
        return createTagElementAdapter();
      }
      @Override
      public Adapter caseTagClassElement(TagClassElement object)
      {
        return createTagClassElementAdapter();
      }
      @Override
      public Adapter caseTagObjectPropertyElement(TagObjectPropertyElement object)
      {
        return createTagObjectPropertyElementAdapter();
      }
      @Override
      public Adapter caseTagDataTypePropertyElement(TagDataTypePropertyElement object)
      {
        return createTagDataTypePropertyElementAdapter();
      }
      @Override
      public Adapter caseBarrierOperator(BarrierOperator object)
      {
        return createBarrierOperatorAdapter();
      }
      @Override
      public Adapter caseWindowOperator(WindowOperator object)
      {
        return createWindowOperatorAdapter();
      }
      @Override
      public Adapter caseMarkerOperator(MarkerOperator object)
      {
        return createMarkerOperatorAdapter();
      }
      @Override
      public Adapter caseSWRLOperator(SWRLOperator object)
      {
        return createSWRLOperatorAdapter();
      }
      @Override
      public Adapter caseSWRLRule(SWRLRule object)
      {
        return createSWRLRuleAdapter();
      }
      @Override
      public Adapter caseAntecedentRule(AntecedentRule object)
      {
        return createAntecedentRuleAdapter();
      }
      @Override
      public Adapter caseConsequentRule(ConsequentRule object)
      {
        return createConsequentRuleAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseOCLOperator(OCLOperator object)
      {
        return createOCLOperatorAdapter();
      }
      @Override
      public Adapter caseCountOperator(CountOperator object)
      {
        return createCountOperatorAdapter();
      }
      @Override
      public Adapter caseStandardDeviationOperator(StandardDeviationOperator object)
      {
        return createStandardDeviationOperatorAdapter();
      }
      @Override
      public Adapter caseAverageOperator(AverageOperator object)
      {
        return createAverageOperatorAdapter();
      }
      @Override
      public Adapter caseOutputOperator(OutputOperator object)
      {
        return createOutputOperatorAdapter();
      }
      @Override
      public Adapter caseOutputOperatorParameter(OutputOperatorParameter object)
      {
        return createOutputOperatorParameterAdapter();
      }
      @Override
      public Adapter caseVariableDefinition(VariableDefinition object)
      {
        return createVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseNumberVariableDefinition(NumberVariableDefinition object)
      {
        return createNumberVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseStringVariableDefinition(StringVariableDefinition object)
      {
        return createStringVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseBooleanVariableDefinition(BooleanVariableDefinition object)
      {
        return createBooleanVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseStructureDeclaration(StructureDeclaration object)
      {
        return createStructureDeclarationAdapter();
      }
      @Override
      public Adapter caseStreamDeclaration(StreamDeclaration object)
      {
        return createStreamDeclarationAdapter();
      }
      @Override
      public Adapter caseStreamElement(StreamElement object)
      {
        return createStreamElementAdapter();
      }
      @Override
      public Adapter caseStructureElements(StructureElements object)
      {
        return createStructureElementsAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseSimpleDataType(SimpleDataType object)
      {
        return createSimpleDataTypeAdapter();
      }
      @Override
      public Adapter caseComplexDataType(ComplexDataType object)
      {
        return createComplexDataTypeAdapter();
      }
      @Override
      public Adapter caseIntegerDataType(IntegerDataType object)
      {
        return createIntegerDataTypeAdapter();
      }
      @Override
      public Adapter caseBooleanDataType(BooleanDataType object)
      {
        return createBooleanDataTypeAdapter();
      }
      @Override
      public Adapter caseFloatDataType(FloatDataType object)
      {
        return createFloatDataTypeAdapter();
      }
      @Override
      public Adapter caseStringDataType(StringDataType object)
      {
        return createStringDataTypeAdapter();
      }
      @Override
      public Adapter caseInternationalizedResourceIdentifier(InternationalizedResourceIdentifier object)
      {
        return createInternationalizedResourceIdentifierAdapter();
      }
      @Override
      public Adapter caseBooleanOperation(BooleanOperation object)
      {
        return createBooleanOperationAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseVariableCall(VariableCall object)
      {
        return createVariableCallAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamStatement <em>Stream Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamStatement
   * @generated
   */
  public Adapter createStreamStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement <em>Stream Variable Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamVariableStatement
   * @generated
   */
  public Adapter createStreamVariableStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamAccess <em>Stream Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamAccess
   * @generated
   */
  public Adapter createStreamAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess <em>Stream Declaration Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclarationAccess
   * @generated
   */
  public Adapter createStreamDeclarationAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDefinition <em>Stream Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDefinition
   * @generated
   */
  public Adapter createStreamDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.JoinOperator <em>Join Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.JoinOperator
   * @generated
   */
  public Adapter createJoinOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter <em>Stream Operator Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamOperatorParameter
   * @generated
   */
  public Adapter createStreamOperatorParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator <em>Element Join Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator
   * @generated
   */
  public Adapter createElementJoinOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.FilterOperator <em>Filter Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.FilterOperator
   * @generated
   */
  public Adapter createFilterOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SplitOperator <em>Split Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SplitOperator
   * @generated
   */
  public Adapter createSplitOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.MatchOperator <em>Match Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.MatchOperator
   * @generated
   */
  public Adapter createMatchOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator <em>Symmetric Difference Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SymmetricDifferenceOperator
   * @generated
   */
  public Adapter createSymmetricDifferenceOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.DifferenceOperator <em>Difference Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.DifferenceOperator
   * @generated
   */
  public Adapter createDifferenceOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.InputOperator <em>Input Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.InputOperator
   * @generated
   */
  public Adapter createInputOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator <em>Return Type Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator
   * @generated
   */
  public Adapter createReturnTypeOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.NoReturnTypeOperator <em>No Return Type Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.NoReturnTypeOperator
   * @generated
   */
  public Adapter createNoReturnTypeOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TagOperator <em>Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TagOperator
   * @generated
   */
  public Adapter createTagOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.NewTagOperator <em>New Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.NewTagOperator
   * @generated
   */
  public Adapter createNewTagOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.QueryTagOperator <em>Query Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.QueryTagOperator
   * @generated
   */
  public Adapter createQueryTagOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQuery <em>Sparql Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQuery
   * @generated
   */
  public Adapter createSparqlQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable <em>Sparql Query Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SparqlQueryVariable
   * @generated
   */
  public Adapter createSparqlQueryVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.UnTagOperator <em>Un Tag Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagOperator
   * @generated
   */
  public Adapter createUnTagOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.UnTagElement <em>Un Tag Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.UnTagElement
   * @generated
   */
  public Adapter createUnTagElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TagElement <em>Tag Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TagElement
   * @generated
   */
  public Adapter createTagElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TagClassElement <em>Tag Class Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TagClassElement
   * @generated
   */
  public Adapter createTagClassElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement <em>Tag Object Property Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TagObjectPropertyElement
   * @generated
   */
  public Adapter createTagObjectPropertyElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement <em>Tag Data Type Property Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TagDataTypePropertyElement
   * @generated
   */
  public Adapter createTagDataTypePropertyElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.BarrierOperator <em>Barrier Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.BarrierOperator
   * @generated
   */
  public Adapter createBarrierOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.WindowOperator <em>Window Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.WindowOperator
   * @generated
   */
  public Adapter createWindowOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.MarkerOperator <em>Marker Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.MarkerOperator
   * @generated
   */
  public Adapter createMarkerOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SWRLOperator <em>SWRL Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLOperator
   * @generated
   */
  public Adapter createSWRLOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SWRLRule <em>SWRL Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SWRLRule
   * @generated
   */
  public Adapter createSWRLRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.AntecedentRule <em>Antecedent Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.AntecedentRule
   * @generated
   */
  public Adapter createAntecedentRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.ConsequentRule <em>Consequent Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.ConsequentRule
   * @generated
   */
  public Adapter createConsequentRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.OCLOperator <em>OCL Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.OCLOperator
   * @generated
   */
  public Adapter createOCLOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.CountOperator <em>Count Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.CountOperator
   * @generated
   */
  public Adapter createCountOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator <em>Standard Deviation Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator
   * @generated
   */
  public Adapter createStandardDeviationOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.AverageOperator <em>Average Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.AverageOperator
   * @generated
   */
  public Adapter createAverageOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperator <em>Output Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperator
   * @generated
   */
  public Adapter createOutputOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter <em>Output Operator Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter
   * @generated
   */
  public Adapter createOutputOperatorParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDefinition
   * @generated
   */
  public Adapter createVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition <em>Number Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition
   * @generated
   */
  public Adapter createNumberVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition <em>String Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition
   * @generated
   */
  public Adapter createStringVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition <em>Boolean Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition
   * @generated
   */
  public Adapter createBooleanVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StructureDeclaration <em>Structure Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureDeclaration
   * @generated
   */
  public Adapter createStructureDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamDeclaration <em>Stream Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamDeclaration
   * @generated
   */
  public Adapter createStreamDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StreamElement <em>Stream Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StreamElement
   * @generated
   */
  public Adapter createStreamElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StructureElements <em>Structure Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StructureElements
   * @generated
   */
  public Adapter createStructureElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.SimpleDataType <em>Simple Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.SimpleDataType
   * @generated
   */
  public Adapter createSimpleDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.ComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.ComplexDataType
   * @generated
   */
  public Adapter createComplexDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.IntegerDataType <em>Integer Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.IntegerDataType
   * @generated
   */
  public Adapter createIntegerDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanDataType <em>Boolean Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanDataType
   * @generated
   */
  public Adapter createBooleanDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.FloatDataType <em>Float Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.FloatDataType
   * @generated
   */
  public Adapter createFloatDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.StringDataType <em>String Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.StringDataType
   * @generated
   */
  public Adapter createStringDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier <em>Internationalized Resource Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.InternationalizedResourceIdentifier
   * @generated
   */
  public Adapter createInternationalizedResourceIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.BooleanOperation <em>Boolean Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.BooleanOperation
   * @generated
   */
  public Adapter createBooleanOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.VariableCall
   * @generated
   */
  public Adapter createVariableCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FlowAdapterFactory
