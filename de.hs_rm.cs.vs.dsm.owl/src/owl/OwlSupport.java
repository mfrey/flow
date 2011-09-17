package owl;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class OwlSupport extends AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new OwlRuntimeModule();
	}
}

