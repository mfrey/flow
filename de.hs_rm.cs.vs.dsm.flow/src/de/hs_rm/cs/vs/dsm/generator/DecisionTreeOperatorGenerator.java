package de.hs_rm.cs.vs.dsm.generator;

import org.eclipse.emf.common.util.EList;

import de.hs_rm.cs.vs.dsm.flow.DecisionTreeAttribute;
import de.hs_rm.cs.vs.dsm.flow.DecisionTreeOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class implements the generator for the decision tree operator of the
 * query language. The operator is defined as follows:
 * 
 * 	'dtree' '('attributes+=DecisionTreeAttribute ',' (attributes+=DecisionTreeAttribute ',')* delta=NUMBER ',' 
 *      tau=NUMBER ',' barrier= NUMBER ',' frequency= NUMBER 
 *		classAttributes+=DecisionTreeAttribute (',' classAttributes+=DecisionTreeAttribute)* ',' 
 *		stream=StreamOperatorParameter ')';
 *
 * Parameters of the operator are among others a list of attributes which are 
 * defined as follows: 
 * 
 *	 key = STRING '{' value+=STRING (',' value+=STRING)* '}';
 *
 * Each attribut consists of a key and a single value or a list of
 * values. Values are enclosed by curley bracelets. Multiple values
 * are seperated by a comma, e.g.
 * 
 *   TEMPERATURE = { NORMAL, HIGH, LOW }
 * 
 * In addition the operator specifies parameters in number format such as
 * 'delta', 'tau' and 'frequency'. Another parameter of the operator is the 
 * class attribute which has the same attribute format as the previously
 * mentioned list of attributes.
 * 
 * @author Michael Frey 
 */
public class DecisionTreeOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "DecisionTree";
	/** The decision tree operator */
	private DecisionTreeOperator mOperator;
	/** The name of the output stream */
	private String mStream;
	
	/**
	 * The constructor sets the input and output streams and stores a internal
	 * representation of the operator. 
	 * 
	 * @param pStatement The statement which contains the decision tree operator 
	 */
	public DecisionTreeOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		mOperator = (DecisionTreeOperator) pStatement.getOperator();
		this.getInputStreams().add(mOperator.getStream().getStream().getName());
		
		this.setOperatorType(OPERATOR_TYPE);
		mStream = this.getOperatorStream();
	}
	
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = Util.getInstance().createParameter(mStream, "attributes", this.buildAttributes(mOperator.getAttributes()));
		
		result += Util.getInstance().createParameter(mStream, "classAttribute", this.buildAttributes(mOperator.getClassAttributes()));
		result += Util.getInstance().createParameter(mStream, "delta", mOperator.getDelta().toPlainString());
		result += Util.getInstance().createParameter(mStream, "classHomogenityBarrier", mOperator.getBarrier().toPlainString());
		result += Util.getInstance().createParameter(mStream, "checkFrequency", mOperator.getFrequency().toPlainString());
		result += Util.getInstance().createParameter(mStream, "tau", mOperator.getTau().toPlainString());
		
		return result;
	}

	/**
	 * The method builds from a list of attributes a 'string' representation of the
	 * attributes. 
	 * 
	 * @param pAttribute A list with attributes which should be transformed into the
	 * LUA string representation of the operator attributes
	 * 
	 * @return A string representation of the attributes which can be handled in LUA
	 */
	private String buildAttributes(final EList<DecisionTreeAttribute> pAttribute){
		String attributes = "";
		for(int i = 0; i < pAttribute.size(); i++){
			attributes += pAttribute.get(i).getKey() + " = {";
			for(int j = 0; j < pAttribute.get(i).getValue().size(); j++){
				if(j != 0){
					attributes += "," + pAttribute.get(i).getValue().get(j);
				}else{
				 attributes += pAttribute.get(i).getValue().get(j);
				}
			}
			attributes += "}";
		}
		return attributes;
	}
	
	/**
	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorConnection()
	 */
	@Override
	public String setOperatorConnection() {
		return Util.getInstance().connectOperator(getInputStreams(), "in", getOutputStreams(), "out");
	}

}
