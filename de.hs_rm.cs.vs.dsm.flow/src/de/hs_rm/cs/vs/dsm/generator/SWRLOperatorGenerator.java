package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.Rule;
import de.hs_rm.cs.vs.dsm.flow.SWRLOperator;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;

/**
 * The class provides the LUA code generator for the SWRL operator. The operator is
 * structured as follows:
 * 
 * SWRLOperator:
 *	'swrl''('rule=SWRLRule ',' stream=StreamOperatorParameter')';
 *
 * SWRLRule:
 *	atoms+=Rule ('∧' '(' atoms+=Rule)* '⇒' consequent=Rule;
 *
 * Rule:
 *  name=[OWL::OWLObjectProperty|STRING] '(' '?' variable+=StreamAccess (','  '?' variable+=StreamAccess )* ')';
 * 
 * 
 * 
 * @author Michael Frey
 */
public class SWRLOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "SWRL";
	/** The instance of the operator */
	private SWRLOperator mOperator;
	/** The name of the operators stream */
	private String mStream = "";
	
	/**
	 * The constructor initializes the members of the class, which includes input and
	 * output streams
	 * 
	 * @param pStatement The statement of the operator which includes the operator and the return stream
	 */
	public SWRLOperatorGenerator(final StreamStatement pStatement){
		super(pStatement);
		// Set the type of the operator
		this.setOperatorType(OPERATOR_TYPE);
		// Save an instance of the operator
		mOperator = (SWRLOperator) pStatement.getOperator();
		// Set the input stream
		this.getInputStreams().add(mOperator.getStream().getStream().getName());
		// Set the name of the operator stream
		mStream = this.getOperatorStream();
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < mOperator.getRule().getAtoms().size(); i++){
			result += createRule(mOperator.getRule().getAtoms().get(i), "antecedent");
		}
		
		return result += createRule(mOperator.getRule().getConsequent(), "consequent");
	}
	
	/**
	 * The method creates a string representation of the atoms of an rule used in a SWRL statement, 
	 * whereas the string contains the method calls for the SWRL operator in LUA
	 * 
	 * @param pRule The corresponding atom which should be transformed into a method call in LUA
	 * @param pType The type of atom (antecedent or consequent)
	 * 
	 * @return A string representation of the atoms in a SWRL rule
	 */
	private String createRule(final Rule pRule, final String pType){
		String result = Util.getInstance().createParameter(mStream, pType + "_object_property", pRule.getName().getLocalName());
		
		for(int i = 0; i < pRule.getVariable().size(); i++){
			result += Util.getInstance().createParameter(mStream, pType + "_stream", pRule.getVariable().get(i).getReference().getName());
			result += Util.getInstance().createParameter(mStream, pType + "_element", pRule.getVariable().get(i).getElement().getName());
		}
		
		return result;
	}
}
