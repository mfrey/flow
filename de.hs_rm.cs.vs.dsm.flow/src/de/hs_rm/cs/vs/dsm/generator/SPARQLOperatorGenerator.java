/**
 * 
 */
package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.SPARQLOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * This class provides a generator for the SPARQL query operator. The
 * operator is structured as follows:
 * 
 * SPARQLOperator:
 *	'sparql' '(' query=QueryTagOperator ',' target=STRING ')';
 *
 * The operator consists of a query and a target. Every query consists
 * is defined as follows: 
 * 
 * QueryTagOperator:
 *	'{'
 *		queryType = SparqlQueryType
 *		query = SparqlQuery
 *	'}';
 *
 * A query is surronded by curly brackets and consists of a specific 
 * query type and the actual query. The query type is of type of one
 * of the following:
 * 
 * enum SparqlQueryType:
 *	SELECT = 'SELECT' | CONSTRUCT = 'CONSTRUCT' | ASK = 'ASK' | DESCRIBE = 'DESCRIBE' ;
 * 
 * The query itself consists of a variable followed by the keyword 'WHERE' 
 * and again curly brackets which surrond a URI and an attribute.
 * 
 * SparqlQuery:
 *	variable=SparqlQueryVariable 'WHERE' '{' 
 *		uri=STRING attribute=STRING
 *	'}';
 * 
 * Query variables are specified as follows
 *
 * SparqlQueryVariable:
 *	'?' variable+=STRING ('?' variable+=STRING)*;
 *  
 * where each variable consists of a '?' followed by the actual variable.
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
		// Add the input stream to the list
		this.getInputStreams().add(this.mOperator.getInput().getStream().getName());
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
		// Set the query type
		String result = getQueryType();
		// Iterate over the query variables
		for(int i = 0; i < mOperator.getQuery().getQuery().getVariable().getVariable().size(); i++){
			String variable = mOperator.getQuery().getQuery().getVariable().getVariable().get(i);
			result += Util.getInstance().createParameter(mStream, "variable_" + i, variable);
		}
		
		for(int i = 0; i < mOperator.getQuery().getQuery().getObject().size(); i++){
			result += Util.getInstance().createParameter(mStream, "object_" + i, mOperator.getQuery().getQuery().getObject().get(i));
			result += Util.getInstance().createParameter(mStream, "predicate_" + i, mOperator.getQuery().getQuery().getPredicate().get(i));
			result += Util.getInstance().createParameter(mStream, "subject_" + i, mOperator.getQuery().getQuery().getSubject().get(i));
		}
		
		result += getTarget();
		
		// Return the result
		return result;
	}
	
	private String getTarget(){
		return Util.getInstance().createParameter(mStream, "target", mOperator.getTarget().getElement().getName());
	}
	
	private String getQueryType(){
		return Util.getInstance().createParameter(mStream, "query_type", mOperator.getQuery().getQueryType().getName());
	}
}
