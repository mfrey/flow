package de.hs_rm.cs.vs.dsm.generator;

import com.google.inject.Inject;
import de.hs_rm.cs.vs.dsm.flow.JoinOperator;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.ReturnTypeOperator;
import de.hs_rm.cs.vs.dsm.flow.SplitOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.generator.JoinOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.OutputOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.SplitOperatorGenerator;
import de.hs_rm.cs.vs.dsm.generator.Util;
import java.util.ArrayList;
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
    for (PackageDeclaration model : _filter) {
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
    _builder.newLine();
    {
      EList<ModelElement> _elements = e.getElements();
      for(ModelElement elements : _elements) {
        StringConcatenation _compile = this.compile(elements);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
      ReturnTypeOperator _expression = statement.getExpression();
      EClass _eClass = _expression.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("JoinOperator");
      if (_equals) {
        _builder.newLine();} else {
        ReturnTypeOperator _expression_1 = statement.getExpression();
        EClass _eClass_1 = _expression_1.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_1 = _name_1.equals("SplitOperator");
        if (_equals_1) {
          ReturnTypeOperator _expression_2 = statement.getExpression();
          String _write = this.write(((SplitOperator) _expression_2), statement);
          _builder.append(_write, "");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  protected String _write(final JoinOperator pOperator, final StreamStatement pStatement) {
    Util _instance = Util.getInstance();
    EList<StreamDefinition> _returnStream = pStatement.getReturnStream();
    ArrayList<String> _streamFrom = _instance.getStreamFrom(_returnStream);
    JoinOperatorGenerator _joinOperatorGenerator = new JoinOperatorGenerator(_streamFrom, pOperator);
    String _string = _joinOperatorGenerator.toString();
    return _string;
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
  
  public String write(final ReturnTypeOperator pOperator, final StreamStatement pStatement) {
    if ((pOperator instanceof JoinOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((JoinOperator)pOperator, (StreamStatement)pStatement);
    } else if ((pOperator instanceof SplitOperator)
         && (pStatement instanceof StreamStatement)) {
      return _write((SplitOperator)pOperator, (StreamStatement)pStatement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(pOperator, pStatement).toString());
    }
  }
}