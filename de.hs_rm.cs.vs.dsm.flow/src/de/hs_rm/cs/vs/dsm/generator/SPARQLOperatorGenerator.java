/**
 * 
 */
package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.SPARQLOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * 
 * @author Michael Frey
 */
public class SPARQLOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "SPARQL";
	/** The operator of the query language */
	private SPARQLOperator mOperator;
	/** The name of the stream */
	private String mStream;
	
	public SPARQLOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		// Store the operator in an attribute
		mOperator = (SPARQLOperator) pStatement.getOperator();
		// Set the operator type
		setOperatorType(OPERATOR_TYPE);
		// Set the name of the operator
		mStream = getOperatorStream();
	}
	
	/** 
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
