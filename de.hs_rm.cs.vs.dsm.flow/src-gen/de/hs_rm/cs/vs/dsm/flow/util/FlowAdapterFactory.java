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
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseTestElement(TestElement object)
      {
        return createTestElementAdapter();
      }
      @Override
      public Adapter caseTestAssign(TestAssign object)
      {
        return createTestAssignAdapter();
      }
      @Override
      public Adapter caseOWLTestElement(OWLTestElement object)
      {
        return createOWLTestElementAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseStreamDefinition(StreamDefinition object)
      {
        return createStreamDefinitionAdapter();
      }
      @Override
      public Adapter caseStreamAccess(StreamAccess object)
      {
        return createStreamAccessAdapter();
      }
      @Override
      public Adapter caseStreamOperatorParameter(StreamOperatorParameter object)
      {
        return createStreamOperatorParameterAdapter();
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
      public Adapter caseElementJoinOperator(ElementJoinOperator object)
      {
        return createElementJoinOperatorAdapter();
      }
      @Override
      public Adapter caseTagOperator(TagOperator object)
      {
        return createTagOperatorAdapter();
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
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TestElement <em>Test Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TestElement
   * @generated
   */
  public Adapter createTestElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.TestAssign <em>Test Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.TestAssign
   * @generated
   */
  public Adapter createTestAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.OWLTestElement <em>OWL Test Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.OWLTestElement
   * @generated
   */
  public Adapter createOWLTestElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hs_rm.cs.vs.dsm.flow.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hs_rm.cs.vs.dsm.flow.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
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
