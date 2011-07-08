package owl.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * The class implements the Resource.Factory interface which defines
 * how resources are created.
 *
 * @author Michael Frey
 */
public class OWLResourceFactoryImpl implements Resource.Factory {
    /**
     * The methode creates a resource with the given URI and returns it.
     * 
     * @param uri The URI to the resource.
     * @see ResourceSet#createResource(URI)
     */
	@Override
	public Resource createResource(URI uri) {
		return new OWLResourceImpl(uri);
	}
}
