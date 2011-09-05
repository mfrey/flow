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
      case FlowPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseModelElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TEST_ELEMENT:
      {
        TestElement testElement = (TestElement)theEObject;
        T result = caseTestElement(testElement);
        if (result == null) result = caseModelElement(testElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TEST_ASSIGN:
      {
        TestAssign testAssign = (TestAssign)theEObject;
        T result = caseTestAssign(testAssign);
        if (result == null) result = caseModelElement(testAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OWL_TEST_ELEMENT:
      {
        OWLTestElement owlTestElement = (OWLTestElement)theEObject;
        T result = caseOWLTestElement(owlTestElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = caseModelElement(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseVariable(variableDeclaration);
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
      case FlowPackage.STREAM_ACCESS:
      {
        StreamAccess streamAccess = (StreamAccess)theEObject;
        T result = caseStreamAccess(streamAccess);
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
      case FlowPackage.COUNT_OPERATOR:
      {
        CountOperator countOperator = (CountOperator)theEObject;
        T result = caseCountOperator(countOperator);
        if (result == null) result = caseOperator(countOperator);
        if (result == null) result = caseModelElement(countOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STANDARD_DEVIATION_OPERATOR:
      {
        StandardDeviationOperator standardDeviationOperator = (StandardDeviationOperator)theEObject;
        T result = caseStandardDeviationOperator(standardDeviationOperator);
        if (result == null) result = caseOperator(standardDeviationOperator);
        if (result == null) result = caseModelElement(standardDeviationOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.AVERAGE_OPERATOR:
      {
        AverageOperator averageOperator = (AverageOperator)theEObject;
        T result = caseAverageOperator(averageOperator);
        if (result == null) result = caseOperator(averageOperator);
        if (result == null) result = caseModelElement(averageOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.ELEMENT_JOIN_OPERATOR:
      {
        ElementJoinOperator elementJoinOperator = (ElementJoinOperator)theEObject;
        T result = caseElementJoinOperator(elementJoinOperator);
        if (result == null) result = caseOperator(elementJoinOperator);
        if (result == null) result = caseModelElement(elementJoinOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TAG_OPERATOR:
      {
        TagOperator tagOperator = (TagOperator)theEObject;
        T result = caseTagOperator(tagOperator);
        if (result == null) result = caseOperator(tagOperator);
        if (result == null) result = caseModelElement(tagOperator);
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
      case FlowPackage.OUTPUT_OPERATOR:
      {
        OutputOperator outputOperator = (OutputOperator)theEObject;
        T result = caseOutputOperator(outputOperator);
        if (result == null) result = caseOperator(outputOperator);
        if (result == null) result = caseModelElement(outputOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OUTPUT_OPERATOR_PARAMETER:
      {
        OutputOperatorParameter outputOperatorParameter = (OutputOperatorParameter)theEObject;
        T result = caseOutputOperatorParameter(outputOperatorParameter);
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
   * Returns the result of interpreting the object as an instance of '<em>Test Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestElement(TestElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestAssign(TestAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OWL Test Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OWL Test Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOWLTestElement(OWLTestElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
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
   * Returns the result of interpreting the object as an instance of '<em>Output Operator Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Operator Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputOperatorParameter(OutputOperatorParameter object)
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
