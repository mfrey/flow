package de.hs_rm.cs.vs.dsm.generator;

import com.google.inject.Inject;
import de.hs_rm.cs.vs.dsm.flow.ModelElement;
import de.hs_rm.cs.vs.dsm.flow.OutputOperator;
import de.hs_rm.cs.vs.dsm.flow.OutputOperatorParameter;
import de.hs_rm.cs.vs.dsm.flow.PackageDeclaration;
import de.hs_rm.cs.vs.dsm.flow.StreamAccess;
import de.hs_rm.cs.vs.dsm.flow.StreamDefinition;
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
    return _builder;
  }
  
  public StringConcatenation compile(final OutputOperator o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("output");
    int _hashCode = o.hashCode();
    _builder.append(_hashCode, "");
    _builder.append(" = fm:create_operator_of_type(cacheout,output");
    int _hashCode_1 = o.hashCode();
    _builder.append(_hashCode_1, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    {
      OutputOperatorParameter _parameter = o.getParameter();
      EList<StreamAccess> _element = _parameter.getElement();
      for(StreamAccess s : _element) {
        _builder.append("fm:connect_operators(");
        StreamDefinition _reference = s.getReference();
        String _name = _reference.getName();
        _builder.append(_name, "");
        _builder.append(", \"out\", output");
        int _hashCode_2 = o.hashCode();
        _builder.append(_hashCode_2, "");
        _builder.append(", \"in\");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}