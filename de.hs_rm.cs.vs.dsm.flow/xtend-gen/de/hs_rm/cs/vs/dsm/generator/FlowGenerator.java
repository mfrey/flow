package de.hs_rm.cs.vs.dsm.generator;

import com.google.inject.Inject;
import de.hs_rm.cs.vs.dsm.flow.AdditionOperator;
import de.hs_rm.cs.vs.dsm.flow.AverageOperator;
import de.hs_rm.cs.vs.dsm.flow.CountOperator;
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator;
import de.hs_rm.cs.vs.dsm.flow.DivisionOperator;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FilterOperator;
import de.hs_rm.cs.vs.dsm.flow.InputOperator;
import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.LogOperator;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.ModuloOperator;
import de.hs_rm.cs.vs.dsm.flow.MultiplicationOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.RandomOperator;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StandardDeviationOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.SubtractionOperator;
import de.hs_rm.cs.vs.dsm.flow.TagOperator;
import de.hs_rm.cs.vs.dsm.flow.UnTagOperator;
import de.hs_rm.cs.vs.dsm.generator.AdditionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.AverageOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.CountOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.DecisionTreeOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.DivisionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.ElementJoinOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.FilterOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.InputOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.JoinOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.LogOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.ModuloOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.MultiplicationOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.OutputOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.RandomOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.SplitOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.StandardDeviationOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.SubtractionOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.TagOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.UnTagOperatorGenerator;
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
    Util _instance_2 = Util.getInstance();
    _instance_2.clearNetwork();
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation compile(final ModelElement m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EClass _eClass = m.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("StreamStatement");
      if (_equals) {
        StringConcatenation _compile = this.compile(((StreamStatement) m));
        _builder.append(_compile, "");
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
                              _builder.newLineIfNotEmpty();} else {
                              ReturnTypeOperator _operator_24 = statement.getOperator();
                              EClass _eClass_12 = _operator_24.eClass();
                              String _name_12 = _eClass_12.getName();
                              boolean _equals_12 = _name_12.equals("LogOperator");
                              if (_equals_12) {
                                ReturnTypeOperator _operator_25 = statement.getOperator();
                                String _write_12 = this.write(((LogOperator) _operator_25), statement);
                                _builder.append(_write_12, "");
                                _builder.newLineIfNotEmpty();} else {
                                ReturnTypeOperator _operator_26 = statement.getOperator();
                                EClass _eClass_13 = _operator_26.eClass();
                                String _name_13 = _eClass_13.getName();
                                boolean _equals_13 = _name_13.equals("RandomOperator");
                                if (_equals_13) {
                                  ReturnTypeOperator _operator_27 = statement.getOperator();
                                  String _write_13 = this.write(((RandomOperator) _operator_27), statement);
                                  _builder.append(_write_13, "");
                                  _builder.newLineIfNotEmpty();} else {
                                  ReturnTypeOperator _operator_28 = statement.getOperator();
                                  EClass _eClass_14 = _operator_28.eClass();
                                  String _name_14 = _eClass_14.getName();
                                  boolean _equals_14 = _name_14.equals("DecisionTreeOperator");
                                  if (_equals_14) {
                                    ReturnTypeOperator _operator_29 = statement.getOperator();
                                    String _write_14 = this.write(((DecisionTreeOperator) _operator_29), statement);
                                    _builder.append(_write_14, "");
                                    _builder.newLineIfNotEmpty();} else {
                                    ReturnTypeOperator _operator_30 = statement.getOperator();
                                    EClass _eClass_15 = _operator_30.eClass();
                                    String _name_15 = _eClass_15.getName();
                                    boolean _equals_15 = _name_15.equals("ModuloOperator");
                                    if (_equals_15) {
                                      ReturnTypeOperator _operator_31 = statement.getOperator();
                                      String _write_15 = this.write(((ModuloOperator) _operator_31), statement);
                                      _builder.append(_write_15, "");
                                      _builder.newLineIfNotEmpty();} else {
                                      ReturnTypeOperator _operator_32 = statement.getOperator();
                                      EClass _eClass_16 = _operator_32.eClass();
                                      String _name_16 = _eClass_16.getName();
                                      boolean _equals_16 = _name_16.equals("OutputOperator");
                                      if (_equals_16) {
                                        ReturnTypeOperator _operator_33 = statement.getOperator();
                                        String _write_16 = this.write(((OutputOperator) _operator_33), statement);
                                        _builder.append(_write_16, "");
                                        _builder.newLineIfNotEmpty();} else {
                                        ReturnTypeOperator _operator_34 = statement.getOperator();
                                        EClass _eClass_17 = _operator_34.eClass();
                                        String _name_17 = _eClass_17.getName();
                                        boolean _equals_17 = _name_17.equals("TagOperator");
                                        if (_equals_17) {
                                          ReturnTypeOperator _operator_35 = statement.getOperator();
                                          String _write_17 = this.write(((TagOperator) _operator_35), statement);
                                          _builder.append(_write_17, "");
                                          _builder.newLineIfNotEmpty();} else {
                                          ReturnTypeOperator _operator_36 = statement.getOperator();
                                          EClass _eClass_18 = _operator_36.eClass();
                                          String _name_18 = _eClass_18.getName();
                                          boolean _equals_18 = _name_18.equals("UnTagOperator");
                                          if (_equals_18) {
                                            ReturnTypeOperator _operator_37 = statement.getOperator();
                                            String _write_18 = this.write(((UnTagOperator) _operator_37), statement);
                                            _builder.append(_write_18, "");
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
      InputOperatorGenerator in = _inputOperatorGenerator;
      String _string = in.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final OutputOperator output, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      OutputOperatorGenerator _outputOperatorGenerator = new OutputOperatorGenerator(pStatement);
      OutputOperatorGenerator o = _outputOperatorGenerator;
      String _string = o.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final LogOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      LogOperatorGenerator _logOperatorGenerator = new LogOperatorGenerator(pStatement);
      LogOperatorGenerator log = _logOperatorGenerator;
      String _string = log.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final RandomOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      RandomOperatorGenerator _randomOperatorGenerator = new RandomOperatorGenerator(pStatement);
      RandomOperatorGenerator rand = _randomOperatorGenerator;
      String _string = rand.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
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
  
  protected String _write(final DecisionTreeOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      DecisionTreeOperatorGenerator _decisionTreeOperatorGenerator = new DecisionTreeOperatorGenerator(pStatement);
      DecisionTreeOperatorGenerator dtree = _decisionTreeOperatorGenerator;
      String _string = dtree.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final ModuloOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      ModuloOperatorGenerator _moduloOperatorGenerator = new ModuloOperatorGenerator(pStatement);
      ModuloOperatorGenerator modulo = _moduloOperatorGenerator;
      String _string = modulo.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final TagOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      TagOperatorGenerator _tagOperatorGenerator = new TagOperatorGenerator(pStatement);
      TagOperatorGenerator tag = _tagOperatorGenerator;
      String _string = tag.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  protected String _write(final UnTagOperator pOperator, final StreamStatement pStatement) {
    String _xblockexpression = null;
    {
      UnTagOperatorGenerator _unTagOperatorGenerator = new UnTagOperatorGenerator(pStatement);
      UnTagOperatorGenerator untag = _unTagOperatorGenerator;
      String _string = untag.toString();
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
    } else if ((pOperator instanceof DecisionTreeOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((DecisionTreeOperator)pOperator, (StreamStatement)pStatement);
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
    } else if ((pOperator instanceof LogOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((LogOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof ModuloOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((ModuloOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof MultiplicationOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((MultiplicationOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof OutputOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((OutputOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof RandomOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((RandomOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof SplitOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((SplitOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof StandardDeviationOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((StandardDeviationOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof SubtractionOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((SubtractionOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof TagOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((TagOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof UnTagOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((UnTagOperator)pOperator, (StreamStatement)pStatement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(pOperator, pStatement).toString());
    }
  }
}