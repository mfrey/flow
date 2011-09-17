package owl;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 *
 * 
 * @author Michael Frey
 */
public class OwlRuntimeModule extends AbstractGenericResourceRuntimeModule{

	@Override
	protected String getLanguageName() {
		return "owl";
	}

	@Override
	protected String getFileExtensions() {
		return "owl";
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return OwlQualifiedNameProvider.class;
	}
	
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return OwlResourceDescriptionStrategy.class;
	}
}
