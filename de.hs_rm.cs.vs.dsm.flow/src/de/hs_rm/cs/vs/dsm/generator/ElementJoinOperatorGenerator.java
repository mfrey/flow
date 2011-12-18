package de.hs_rm.cs.vs.dsm.generator;

import de.hs_rm.cs.vs.dsm.flow.BooleanDataType;
import de.hs_rm.cs.vs.dsm.flow.BooleanVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.ElementJoinOperator;
import de.hs_rm.cs.vs.dsm.flow.FloatDataType;
import de.hs_rm.cs.vs.dsm.flow.IntegerDataType;
import de.hs_rm.cs.vs.dsm.flow.NumberVariableDefinition;
import de.hs_rm.cs.vs.dsm.flow.StreamStatement;
import de.hs_rm.cs.vs.dsm.flow.StringDataType;
import de.hs_rm.cs.vs.dsm.flow.StringVariableDefinition;

/**
 * The class generates a LUA code representation of the element join operation
 * which is defined as follows:
 * 
 *	'ejoin''('(elementParameters+=StreamAccess | variableElementParameters+=[VariableDefinition]) 
 *	  (',' elementParameters+=StreamAccess)* (',' variableElementParameters+=[VariableDefinition])*
 *	  ',' parameter=StreamOperatorParameter ')';
 *
 * The operator adds elements to an already existing stream. Possible sources of these elements 
 * can be variables or elements of other existing streams. The operator is initialized via the 
 * 'ejoin' keyword followed by a list of arguments which are of type variable or stream element.
 * 
 * @author Michael Frey 
 */
public class ElementJoinOperatorGenerator extends AbstractOperatorGenerator {
	/** The type of the operator */
	private final String OPERATOR_TYPE = "ElementMerge";
	/** The internal representation of the count operator */
	private ElementJoinOperator mOperator = null;
	/** The name of the stream */
	private String mStream = "";
	
	/**
	 * The constructor sets the name of the operator, parses the input and
	 * output streams and determines the name of the operator in LUA.
	 * 
	 * @param pStatement The statement which contains the operator
	 */
	public ElementJoinOperatorGenerator(final StreamStatement pStatement) {
		// Call the constructor of the abstract operator class
		super(pStatement);
		// Store the operator in the attribute
		this.mOperator = (ElementJoinOperator) pStatement.getOperator();	
		// Add the input streams to the list
		for(int i = 0; i < this.mOperator.getElementParameters().size(); i++){
			this.getInputStreams().add(this.mOperator.getElementParameters().get(i).getReference().getName());
		}
		// Add the parameter stream to the list
		this.getInputStreams().add(this.mOperator.getParameter().getStream().getName());
		// Set the operator type
		this.setOperatorType(OPERATOR_TYPE);
		// Set the name of the stream
		mStream = this.getOperatorStream();
	}

	/**
	 * (non-Javadoc)
	 * @see de.hs_rm.cs.vs.dsm.generator.AbstractOperatorGenerator#setOperatorProperties()
	 */
	@Override
	public String setOperatorProperties() {
		String result = "";
		
		for(int i = 0; i < this.mOperator.getVariableElementParameters().size(); i++){
			if(this.mOperator.getVariableElementParameters().get(i) instanceof NumberVariableDefinition){
				NumberVariableDefinition variable = (NumberVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "number");
				result += Util.getInstance().createParameter(mStream, "value", variable.getValue().toPlainString());
			}else if(this.mOperator.getVariableElementParameters().get(i) instanceof StringVariableDefinition){
				StringVariableDefinition variable = (StringVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "string");
				result += Util.getInstance().createParameter(mStream, "value", variable.getValue());
			}else if(this.mOperator.getVariableElementParameters().get(i) instanceof BooleanVariableDefinition){
				BooleanVariableDefinition variable = (BooleanVariableDefinition) this.mOperator.getVariableElementParameters().get(i);
				result += Util.getInstance().createParameter(mStream, "name", variable.getName());
				result += Util.getInstance().createParameter(mStream, "type", "boolean");
				result += Util.getInstance().createParameter(mStream, "value", variable.isValue() + "");
			}else{
				// This should not happen
			}
		}
		
		for(int i = 0; i < this.mOperator.getElementParameters().size(); i++){
			result += Util.getInstance().createParameter(mStream, "stream_name", this.mOperator.getElementParameters().get(i).getReference().getName());
			result += Util.getInstance().createParameter(mStream, "stream_element", this.mOperator.getElementParameters().get(i).getElement().getName());

			if(this.mOperator.getElementParameters().get(i).getElement().getType() instanceof IntegerDataType){
				result += Util.getInstance().createParameter(mStream, "stream_element_type", "int");
			}else if(this.mOperator.getElementParameters().get(i).getElement().getType() instanceof FloatDataType){
				result += Util.getInstance().createParameter(mStream, "stream_element_type", "float");
			}else if(this.mOperator.getElementParameters().get(i).getElement().getType() instanceof BooleanDataType){
				result += Util.getInstance().createParameter(mStream, "stream_element_type", "bool");
			}else if(this.mOperator.getElementParameters().get(i).getElement().getType() instanceof StringDataType){
				result += Util.getInstance().createParameter(mStream, "stream_element_type", "string");
			}else{
				// This should not happen
			}
		}

		return result;
	}
}
