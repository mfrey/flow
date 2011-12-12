package de.hs_rm.cs.vs.dsm.generator;

import org.eclipse.emf.common.util.EList;

/**
 * 
 * @author Michael Frey
 */
public class IOOperatorGenerator extends AbstractOperatorGenerator {
	/** A list which stores the internationalized resource identifiers of a system operator */
	private EList<String> mIRI;
	/** The address of a system */
	private String mAddress;
	/** The port of a system */
	private String mPort;
	/** The name of the stream of the operator */
	private String mStream;
	
	public IOOperatorGenerator(final EList<String> pIRI,final String pAddress, final String pPort){
		this.mIRI = pIRI;
		this.mAddress = pAddress;
		this.mPort = pPort;
	}
	
	public void setStream(final String pStream){
		this.mStream = pStream;
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public String initializeOperator() {
		return "";
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String internationalizedResourceIdentifier = "";
		// Set the address from the operator
		final String address = mAddress;
		// Set the port
		final String port = mPort;
		// Iterate over the list of IRIs
		for(int i = 0; i < mIRI.size(); i++){
			// IRIs are seperated by a whitespace in the parameter list of the lua operator
			internationalizedResourceIdentifier += mIRI.get(i) + " ";
		}
		// Add the IRI to the result string
		String result = Util.getInstance().createParameter(mStream, "list_iris", internationalizedResourceIdentifier);
		// Add the socket address to the result string
		result +=  Util.getInstance().createParameter(mStream, "connector_socket_address", address);
		// Add the port to the addres
		result +=  Util.getInstance().createParameter(mStream, "connector_socket_port", port);
		// Return the result
		return result;
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return "";
	}

}
