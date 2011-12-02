package de.hs_rm.cs.vs.dsm.generator;

import com.google.inject.Inject;
import de.hs_rm.cs.vs.dsm.flow.AdditionOperator;
import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.DivisionOperator;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator;
import de.hs_rm.cs.vs.dsm.generator.AdditionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.AverageOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.CountOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.DivisionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.ElementJoinOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.FilterOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.InputOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.JoinOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.MultiplicationOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.OutputOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.SplitOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.StandardDeviationOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.SubtractionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FlowGenerator implements IGenerator {
  
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<PackageDeclaration> _filter = IterableExtensions.<PackageDeclaration>filter(_allContentsIterable, de.hs_rm.cs.vs.dsm.flow.PackageDeclaration.class);
    for (final PackageDeclaration model : _filter) {
      QualifiedName _fullyQualifiedName = this.nameProvider.getFullyQualifiedName(model);
      String _string = _fullyQualifiedName.toString();
      String _replace = _string.replace(".", "/");
      String _operator_plus = StringExtensions.operator_plus(_replace, ".lua");
      StringConcatenation _compile = this.compile(model);
      fsa.generateFile(_operator_plus, _compile);
    }
  }
  
  public StringConcatenation compile(final PackageDeclaration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fm = get_instance();");
    _builder.newLine();
    {
      EList<ModelElement> _elements = e.getElements();
      for(final ModelElement elements : _elements) {
        StringConcatenation _compile = this.compile(elements);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    Util _instance = Util.getInstance();
    String _startOperators = _instance.getStartOperators();
    _builder.append(_startOperators, "");
    _builder.newLineIfNotEmpty();
    Util _instance_1 = Util.getInstance();
    String _stopOperators = _instance_1.getStopOperators();
    _builder.append(_stopOperators, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation compile(final ModelElement m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EClass _eClass = m.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("OutputOperator");
      if (_equals) {
        StringConcatenation _compile = this.compile(((OutputOperator) m));
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EClass _eClass_1 = m.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("StreamStatement");
      if (_equals_1) {
        StringConcatenation _compile_1 = this.compile(((StreamStatement) m));
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation compile(final StreamStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ReturnTypeOperator _operator = statement.getOperator();
      EClass _eClass = _operator.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("JoinOperator");
      if (_equals) {
        ReturnTypeOperator _operator_1 = statement.getOperator();
        String _write = this.write(((JoinOperator) _operator_1), statement);
        _builder.append(_write, "");
        _builder.newLineIfNotEmpty();} else {
        ReturnTypeOperator _operator_2 = statement.getOperator();
        EClass _eClass_1 = _operator_2.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_1 = _name_1.equals("SplitOperator");
        if (_equals_1) {
          ReturnTypeOperator _operator_3 = statement.getOperator();
          String _write_1 = this.write(((SplitOperator) _operator_3), statement);
          _builder.append(_write_1, "");
          _builder.newLineIfNotEmpty();} else {
          ReturnTypeOperator _operator_4 = statement.getOperator();
          EClass _eClass_2 = _operator_4.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_2 = _name_2.equals("CountOperator");
          if (_equals_2) {
            ReturnTypeOperator _operator_5 = statement.getOperator();
            String _write_2 = this.write(((CountOperator) _operator_5), statement);
            _builder.append(_write_2, "");
            _builder.newLineIfNotEmpty();} else {
            ReturnTypeOperator _operator_6 = statement.getOperator();
            EClass _eClass_3 = _operator_6.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("AverageOperator");
            if (_equals_3) {
              ReturnTypeOperator _operator_7 = statement.getOperator();
              String _write_3 = this.write(((AverageOperator) _operator_7), statement);
              _builder.append(_write_3, "");
              _builder.newLineIfNotEmpty();} else {
              ReturnTypeOperator _operator_8 = statement.getOperator();
              EClass _eClass_4 = _operator_8.eClass();
              String _name_4 = _eClass_4.getName();
              boolean _equals_4 = _name_4.equals("StandardDeviationOperator");
              if (_equals_4) {
                ReturnTypeOperator _operator_9 = statement.getOperator();
                String _write_4 = this.write(((StandardDeviationOperator) _operator_9), statement);
                _builder.append(_write_4, "");
                _builder.newLineIfNotEmpty();} else {
                ReturnTypeOperator _operator_10 = statement.getOperator();
                EClass _eClass_5 = _operator_10.eClass();
                String _name_5 = _eClass_5.getName();
                boolean _equals_5 = _name_5.equals("ElementJoinOperator");
                if (_equals_5) {
                  ReturnTypeOperator _operator_11 = statement.getOperator();
                  String _write_5 = this.write(((ElementJoinOperator) _operator_11), statement);
                  _builder.append(_write_5, "");
                  _builder.newLineIfNotEmpty();} else {
                  ReturnTypeOperator _operator_12 = statement.getOperator();
                  EClass _eClass_6 = _operator_12.eClass();
                  String _name_6 = _eClass_6.getName();
                  boolean _equals_6 = _name_6.equals("AdditionOperator");
                  if (_equals_6) {
                    ReturnTypeOperator _operator_13 = statement.getOperator();
                    String _write_6 = this.write(((AdditionOperator) _operator_13), statement);
                    _builder.append(_write_6, "");
                    _builder.newLineIfNotEmpty();} else {
                    ReturnTypeOperator _operator_14 = statement.getOperator();
                    EClass _eClass_7 = _operator_14.eClass();
                    String _name_7 = _eClass_7.getName();
                    boolean _equals_7 = _name_7.equals("SubtractionOperator");
                    if (_equals_7) {
                      ReturnTypeOperator _operator_15 = statement.getOperator();
                      String _write_7 = this.write(((SubtractionOperator) _operator_15), statement);
                      _builder.append(_write_7, "");
                      _builder.newLineIfNotEmpty();} else {
                      ReturnTypeOperator _operator_16 = statement.getOperator();
                      EClass _eClass_8 = _operator_16.eClass();
                      String _name_8 = _eClass_8.getName();
                      boolean _equals_8 = _name_8.equals("MultiplicationOperator");
                      if (_equals_8) {
                        ReturnTypeOperator _operator_17 = statement.getOperator();
                        String _write_8 = this.write(((MultiplicationOperator) _operator_17), statement);
                        _builder.append(_write_8, "");
                        _builder.newLineIfNotEmpty();} else {
                        ReturnTypeOperator _operator_18 = statement.getOperator();
                        EClass _eClass_9 = _operator_18.eClass();
                        String _name_9 = _eClass_9.getName();
                        boolean _equals_9 = _name_9.equals("DivisionOperator");
                        if (_equals_9) {
                          ReturnTypeOperator _operator_19 = statement.getOperator();
                          String _write_9 = this.write(((DivisionOperator) _operator_19), statement);
                          _builder.append(_write_9, "");
                          _builder.newLineIfNotEmpty();} else {
                          ReturnTypeOperator _operator_20 = statement.getOperator();
                          EClass _eClass_10 = _operator_20.eClass();
                          String _name_10 = _eClass_10.getName();
                          boolean _equals_10 = _name_10.equals("FilterOperator");
                          if (_equals_10) {
                            ReturnTypeOperator _operator_21 = statement.getOperator();
                            String _write_10 = this.write(((FilterOperator) _operator_21), statement);
                            _builder.append(_write_10, "");
                            _builder.newLineIfNotEmpty();} else {
                            ReturnTypeOperator _operator_22 = statement.getOperator();
                            EClass _eClass_11 = _operator_22.eClass();
                            String _name_11 = _eClass_11.getName();
                            boolean _equals_11 = _name_11.equals("InputOperator");
                            if (_equals_11) {
                              ReturnTypeOperator _operator_23 = statement.getOperator();
                              String _write_11 = this.write(((InputOperator) _operator_23), statement);
                              _builder.append(_write_11, "");
                              _builder.newLineIfNotEmpty();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected String _write(final JoinOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      JoinOperatorGenerator _joinOperatorGenerator = new JoinOperatorGenerator(pStatement);
      JoinOperatorGenerator join = _joinOperatorGenerator;
      String _string = join.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final SplitOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      SplitOperatorGenerator _splitOperatorGenerator = new SplitOperatorGenerator(pStatement);
      SplitOperatorGenerator split = _splitOperatorGenerator;
      String _string = split.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final AdditionOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      AdditionOperatorGenerator _additionOperatorGenerator = new AdditionOperatorGenerator(pStatement);
      AdditionOperatorGenerator addition = _additionOperatorGenerator;
      String _string = addition.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final MultiplicationOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      MultiplicationOperatorGenerator _multiplicationOperatorGenerator = new MultiplicationOperatorGenerator(pStatement);
      MultiplicationOperatorGenerator multiplication = _multiplicationOperatorGenerator;
      String _string = multiplication.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final SubtractionOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      SubtractionOperatorGenerator _subtractionOperatorGenerator = new SubtractionOperatorGenerator(pStatement);
      SubtractionOperatorGenerator subtraction = _subtractionOperatorGenerator;
      String _string = subtraction.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final DivisionOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      DivisionOperatorGenerator _divisionOperatorGenerator = new DivisionOperatorGenerator(pStatement);
      DivisionOperatorGenerator division = _divisionOperatorGenerator;
      String _string = division.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final ElementJoinOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      ElementJoinOperatorGenerator _elementJoinOperatorGenerator = new ElementJoinOperatorGenerator(pStatement);
      ElementJoinOperatorGenerator split = _elementJoinOperatorGenerator;
      String _string = split.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final CountOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      CountOperatorGenerator _countOperatorGenerator = new CountOperatorGenerator(pStatement);
      CountOperatorGenerator count = _countOperatorGenerator;
      String _string = count.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final AverageOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      AverageOperatorGenerator _averageOperatorGenerator = new AverageOperatorGenerator(pStatement);
      AverageOperatorGenerator average = _averageOperatorGenerator;
      String _string = average.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final StandardDeviationOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      StandardDeviationOperatorGenerator _standardDeviationOperatorGenerator = new StandardDeviationOperatorGenerator(pStatement);
      StandardDeviationOperatorGenerator std = _standardDeviationOperatorGenerator;
      String _string = std.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final InputOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      InputOperatorGenerator _inputOperatorGenerator = new InputOperatorGenerator(pStatement);
      InputOperatorGenerator std = _inputOperatorGenerator;
      String _string = std.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compile(final OutputOperator output) {
    StringConcatenation _builder = new StringConcatenation();
    String _xblockexpression = null;
    {
      OutputOperatorGenerator _outputOperatorGenerator = new OutputOperatorGenerator(output);
      final OutputOperatorGenerator o = _outputOperatorGenerator;
      String _string = o.toString();
      _xblockexpression = (_string);
    }
    _builder.append(_xblockexpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _write(final FilterOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      FilterOperatorGenerator _filterOperatorGenerator = new FilterOperatorGenerator(pStatement);
      FilterOperatorGenerator filter = _filterOperatorGenerator;
      String _string = filter.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public String write(final ReturnTypeOperator pOperator, final StreamStatement pStatement) {
    if ((pOperator instanceof AdditionOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((AdditionOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof AverageOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((AverageOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof CountOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((CountOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof DivisionOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((DivisionOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof ElementJoinOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((ElementJoinOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof FilterOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((FilterOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof InputOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((InputOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof JoinOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((JoinOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof MultiplicationOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((MultiplicationOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof SplitOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((SplitOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof StandardDeviationOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((StandardDeviationOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof SubtractionOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((SubtractionOperator)pOperator, (StreamStatement)pStatement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(pOperator, pStatement).toString());
    }
  }
}