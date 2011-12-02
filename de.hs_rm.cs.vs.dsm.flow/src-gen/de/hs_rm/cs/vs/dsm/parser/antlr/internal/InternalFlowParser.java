package de.hs_rm.cs.vs.dsm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.hs_rm.cs.vs.dsm.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_BOOLVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "','", "'='", "';'", "'.'", "'join'", "'('", "')'", "'['", "']'", "'ejoin'", "'filter'", "'split'", "'match'", "'in'", "'tag'", "'WHERE'", "'?'", "'untag'", "'is'", "'class'", "'objectproperty'", "'datatype'", "'last'", "'min'", "'hrs'", "'sec'", "'elements'", "'now'", "'marker'", "'swrl'", "'Implies'", "'Antecedent'", "'Consequent'", "'ocl'", "'count'", "'std'", "'avg'", "'add'", "'sub'", "'mult'", "'div'", "'out'", "'structure'", "'stream'", "'use'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'int'", "'bool'", "'float'", "'string'", "'SELECT'", "'CONSTRUCT'", "'ASK'", "'DESCRIBE'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_BOOLVALUE=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowParser.tokenNames; }
    public String getGrammarFileName() { return "../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g"; }



     	private FlowGrammarAccess grammarAccess;
     	
        public InternalFlowParser(TokenStream input, FlowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FlowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:77:1: ruleModel returns [EObject current=null] : ( (lv_models_0_0= rulePackageDeclaration ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:80:28: ( ( (lv_models_0_0= rulePackageDeclaration ) )+ )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: ( (lv_models_0_0= rulePackageDeclaration ) )+
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: ( (lv_models_0_0= rulePackageDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:82:1: (lv_models_0_0= rulePackageDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:82:1: (lv_models_0_0= rulePackageDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:83:3: lv_models_0_0= rulePackageDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getModelsPackageDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModel130);
            	    lv_models_0_0=rulePackageDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"models",
            	            		lv_models_0_0, 
            	            		"PackageDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:107:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:108:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:109:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:116:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:120:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:120:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:120:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration213); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:125:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageDeclaration230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration247); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:146:1: ( (lv_elements_3_0= ruleModelElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==12||LA2_0==15||(LA2_0>=57 && LA2_0<=59)||(LA2_0>=73 && LA2_0<=76)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:147:1: (lv_elements_3_0= ruleModelElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:147:1: (lv_elements_3_0= ruleModelElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:148:3: lv_elements_3_0= ruleModelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsModelElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelElement_in_rulePackageDeclaration268);
            	    lv_elements_3_0=ruleModelElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"ModelElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration281); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleModelElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:176:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:177:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:178:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement317);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:185:1: ruleModelElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_VariableDefinition_4= ruleVariableDefinition | this_StreamStatement_5= ruleStreamStatement | this_StreamDefinition_6= ruleStreamDefinition | this_StreamAccess_7= ruleStreamAccess | this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Import_1 = null;

        EObject this_StructureDeclaration_2 = null;

        EObject this_StreamDeclaration_3 = null;

        EObject this_VariableDefinition_4 = null;

        EObject this_StreamStatement_5 = null;

        EObject this_StreamDefinition_6 = null;

        EObject this_StreamAccess_7 = null;

        EObject this_NoReturnTypeOperator_8 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:188:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_VariableDefinition_4= ruleVariableDefinition | this_StreamStatement_5= ruleStreamStatement | this_StreamDefinition_6= ruleStreamDefinition | this_StreamAccess_7= ruleStreamAccess | this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:189:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_VariableDefinition_4= ruleVariableDefinition | this_StreamStatement_5= ruleStreamStatement | this_StreamDefinition_6= ruleStreamDefinition | this_StreamAccess_7= ruleStreamAccess | this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:189:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_VariableDefinition_4= ruleVariableDefinition | this_StreamStatement_5= ruleStreamStatement | this_StreamDefinition_6= ruleStreamDefinition | this_StreamAccess_7= ruleStreamAccess | this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:190:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModelElement374);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:200:5: this_Import_1= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getImportParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleModelElement401);
                    this_Import_1=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:210:5: this_StructureDeclaration_2= ruleStructureDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStructureDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStructureDeclaration_in_ruleModelElement428);
                    this_StructureDeclaration_2=ruleStructureDeclaration();

                    state._fsp--;

                     
                            current = this_StructureDeclaration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:220:5: this_StreamDeclaration_3= ruleStreamDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStreamDeclaration_in_ruleModelElement455);
                    this_StreamDeclaration_3=ruleStreamDeclaration();

                    state._fsp--;

                     
                            current = this_StreamDeclaration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:230:5: this_VariableDefinition_4= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getVariableDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleModelElement482);
                    this_VariableDefinition_4=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:240:5: this_StreamStatement_5= ruleStreamStatement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamStatementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleStreamStatement_in_ruleModelElement509);
                    this_StreamStatement_5=ruleStreamStatement();

                    state._fsp--;

                     
                            current = this_StreamStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:250:5: this_StreamDefinition_6= ruleStreamDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleStreamDefinition_in_ruleModelElement536);
                    this_StreamDefinition_6=ruleStreamDefinition();

                    state._fsp--;

                     
                            current = this_StreamDefinition_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:260:5: this_StreamAccess_7= ruleStreamAccess
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamAccessParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleModelElement563);
                    this_StreamAccess_7=ruleStreamAccess();

                    state._fsp--;

                     
                            current = this_StreamAccess_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:270:5: this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getNoReturnTypeOperatorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleNoReturnTypeOperator_in_ruleModelElement590);
                    this_NoReturnTypeOperator_8=ruleNoReturnTypeOperator();

                    state._fsp--;

                     
                            current = this_NoReturnTypeOperator_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleImport"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:286:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:287:2: (iv_ruleImport= ruleImport EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:288:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport625);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:295:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:298:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:299:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:299:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:299:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport672); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:303:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:304:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:304:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:305:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport689); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleStreamStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:329:1: entryRuleStreamStatement returns [EObject current=null] : iv_ruleStreamStatement= ruleStreamStatement EOF ;
    public final EObject entryRuleStreamStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:330:2: (iv_ruleStreamStatement= ruleStreamStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:331:2: iv_ruleStreamStatement= ruleStreamStatement EOF
            {
             newCompositeNode(grammarAccess.getStreamStatementRule()); 
            pushFollow(FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement730);
            iv_ruleStreamStatement=ruleStreamStatement();

            state._fsp--;

             current =iv_ruleStreamStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamStatement740); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamStatement"


    // $ANTLR start "ruleStreamStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:338:1: ruleStreamStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_operator_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' ) ;
    public final EObject ruleStreamStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:341:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_operator_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_operator_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_operator_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_operator_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:343:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:343:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:344:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamStatement785); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamStatementAccess().getReturnStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleStreamStatement798); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStreamStatementAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:359:1: ( (otherlv_2= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:360:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:360:1: (otherlv_2= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:361:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStreamStatementRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamStatement818); 

            	    		newLeafNode(otherlv_2, grammarAccess.getStreamStatementAccess().getReturnStreamStreamDefinitionCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleStreamStatement832); 

                	newLeafNode(otherlv_3, grammarAccess.getStreamStatementAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:376:1: ( (lv_operator_4_0= ruleReturnTypeOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:377:1: (lv_operator_4_0= ruleReturnTypeOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:377:1: (lv_operator_4_0= ruleReturnTypeOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:378:3: lv_operator_4_0= ruleReturnTypeOperator
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getOperatorReturnTypeOperatorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement853);
            lv_operator_4_0=ruleReturnTypeOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamStatementRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_4_0, 
                    		"ReturnTypeOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStreamStatement865); 

                	newLeafNode(otherlv_5, grammarAccess.getStreamStatementAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamStatement"


    // $ANTLR start "entryRuleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:408:1: entryRuleStreamAccess returns [EObject current=null] : iv_ruleStreamAccess= ruleStreamAccess EOF ;
    public final EObject entryRuleStreamAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamAccess = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:409:2: (iv_ruleStreamAccess= ruleStreamAccess EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:410:2: iv_ruleStreamAccess= ruleStreamAccess EOF
            {
             newCompositeNode(grammarAccess.getStreamAccessRule()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess903);
            iv_ruleStreamAccess=ruleStreamAccess();

            state._fsp--;

             current =iv_ruleStreamAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamAccess913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamAccess"


    // $ANTLR start "ruleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:417:1: ruleStreamAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStreamAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:420:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:421:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:421:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:421:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:421:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:422:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:422:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:423:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess958); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStreamAccess970); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamAccessAccess().getFullStopKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:438:1: ( (otherlv_2= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:439:1: (otherlv_2= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:439:1: (otherlv_2= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:440:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess990); 

            		newLeafNode(otherlv_2, grammarAccess.getStreamAccessAccess().getElementVariableDeclarationCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamAccess"


    // $ANTLR start "entryRuleStreamDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:461:1: entryRuleStreamDefinition returns [EObject current=null] : iv_ruleStreamDefinition= ruleStreamDefinition EOF ;
    public final EObject entryRuleStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:462:2: (iv_ruleStreamDefinition= ruleStreamDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:463:2: iv_ruleStreamDefinition= ruleStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1028);
            iv_ruleStreamDefinition=ruleStreamDefinition();

            state._fsp--;

             current =iv_ruleStreamDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDefinition1038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamDefinition"


    // $ANTLR start "ruleStreamDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:470:1: ruleStreamDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:473:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:474:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:474:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:474:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:474:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:475:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:475:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:476:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDefinitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1083); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:487:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:488:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1100); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStreamDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStreamDefinition1117); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDefinitionAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamDefinition"


    // $ANTLR start "entryRuleJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:517:1: entryRuleJoinOperator returns [EObject current=null] : iv_ruleJoinOperator= ruleJoinOperator EOF ;
    public final EObject entryRuleJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:518:2: (iv_ruleJoinOperator= ruleJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:519:2: iv_ruleJoinOperator= ruleJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1153);
            iv_ruleJoinOperator=ruleJoinOperator();

            state._fsp--;

             current =iv_ruleJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinOperator1163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinOperator"


    // $ANTLR start "ruleJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:526:1: ruleJoinOperator returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleJoinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:529:28: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:530:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:530:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:530:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJoinOperator1200); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinOperatorAccess().getJoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinOperator1212); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:538:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:539:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:539:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:540:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1233);
            lv_parameters_2_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1245); 

                	newLeafNode(otherlv_3, grammarAccess.getJoinOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:560:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:561:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:561:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:562:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1266);
            lv_parameters_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:578:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:578:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1279); 

            	        	newLeafNode(otherlv_5, grammarAccess.getJoinOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:582:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:583:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:583:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:584:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1300);
            	    lv_parameters_6_0=ruleStreamOperatorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJoinOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_6_0, 
            	            		"StreamOperatorParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleJoinOperator1314); 

                	newLeafNode(otherlv_7, grammarAccess.getJoinOperatorAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinOperator"


    // $ANTLR start "entryRuleStreamOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:612:1: entryRuleStreamOperatorParameter returns [EObject current=null] : iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF ;
    public final EObject entryRuleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:613:2: (iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:614:2: iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getStreamOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1350);
            iv_ruleStreamOperatorParameter=ruleStreamOperatorParameter();

            state._fsp--;

             current =iv_ruleStreamOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamOperatorParameter1360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamOperatorParameter"


    // $ANTLR start "ruleStreamOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:621:1: ruleStreamOperatorParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_barrier_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:624:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:625:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:625:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:625:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:625:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:626:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:626:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:627:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamOperatorParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1405); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:638:2: (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:638:4: otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStreamOperatorParameter1418); 

                        	newLeafNode(otherlv_1, grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:642:1: ( (lv_barrier_2_0= ruleBarrierOperator ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:643:1: (lv_barrier_2_0= ruleBarrierOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:643:1: (lv_barrier_2_0= ruleBarrierOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:644:3: lv_barrier_2_0= ruleBarrierOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1439);
                    lv_barrier_2_0=ruleBarrierOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStreamOperatorParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"barrier",
                            		lv_barrier_2_0, 
                            		"BarrierOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStreamOperatorParameter1451); 

                        	newLeafNode(otherlv_3, grammarAccess.getStreamOperatorParameterAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamOperatorParameter"


    // $ANTLR start "entryRuleElementJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:672:1: entryRuleElementJoinOperator returns [EObject current=null] : iv_ruleElementJoinOperator= ruleElementJoinOperator EOF ;
    public final EObject entryRuleElementJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:673:2: (iv_ruleElementJoinOperator= ruleElementJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:674:2: iv_ruleElementJoinOperator= ruleElementJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getElementJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1489);
            iv_ruleElementJoinOperator=ruleElementJoinOperator();

            state._fsp--;

             current =iv_ruleElementJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementJoinOperator1499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementJoinOperator"


    // $ANTLR start "ruleElementJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:681:1: ruleElementJoinOperator returns [EObject current=null] : (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) ;
    public final EObject ruleElementJoinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_elementParameters_2_0 = null;

        EObject lv_elementParameters_5_0 = null;

        EObject lv_parameter_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:684:28: ( (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:685:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:685:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:685:3: otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleElementJoinOperator1536); 

                	newLeafNode(otherlv_0, grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleElementJoinOperator1548); 

                	newLeafNode(otherlv_1, grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:1: ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:694:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:694:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:695:3: lv_elementParameters_2_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1570);
                    lv_elementParameters_2_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementJoinOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"elementParameters",
                            		lv_elementParameters_2_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:712:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:712:6: ( (otherlv_3= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:713:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:713:1: (otherlv_3= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:714:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1596); 

                    		newLeafNode(otherlv_3, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableDefinitionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:725:3: (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        int LA8_2 = input.LA(3);

                        if ( (LA8_2==19) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:725:5: otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1610); 

            	        	newLeafNode(otherlv_4, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:729:1: ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:730:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:730:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:731:3: lv_elementParameters_5_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1631);
            	    lv_elementParameters_5_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElementJoinOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elementParameters",
            	            		lv_elementParameters_5_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:747:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID) ) {
                        int LA9_2 = input.LA(3);

                        if ( (LA9_2==16) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:747:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1646); 

            	        	newLeafNode(otherlv_6, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:751:1: ( (otherlv_7= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:752:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:752:1: (otherlv_7= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:753:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1666); 

            	    		newLeafNode(otherlv_7, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableDefinitionCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1680); 

                	newLeafNode(otherlv_8, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:768:1: ( (lv_parameter_9_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:769:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:769:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:770:3: lv_parameter_9_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1701);
            lv_parameter_9_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementJoinOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_9_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleElementJoinOperator1713); 

                	newLeafNode(otherlv_10, grammarAccess.getElementJoinOperatorAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementJoinOperator"


    // $ANTLR start "entryRuleFilterOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:798:1: entryRuleFilterOperator returns [EObject current=null] : iv_ruleFilterOperator= ruleFilterOperator EOF ;
    public final EObject entryRuleFilterOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:799:2: (iv_ruleFilterOperator= ruleFilterOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:800:2: iv_ruleFilterOperator= ruleFilterOperator EOF
            {
             newCompositeNode(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1749);
            iv_ruleFilterOperator=ruleFilterOperator();

            state._fsp--;

             current =iv_ruleFilterOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterOperator1759); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterOperator"


    // $ANTLR start "ruleFilterOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:807:1: ruleFilterOperator returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
    public final EObject ruleFilterOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_stream_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:810:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:811:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:811:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:811:3: otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFilterOperator1796); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterOperatorAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFilterOperator1808); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:819:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:820:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:820:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:821:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator1829);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:837:2: (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_NUMBER||LA10_1==21) ) {
                        alt10=1;
                    }
                    else if ( (LA10_1==RULE_ID) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==16||LA10_3==19||(LA10_3>=61 && LA10_3<=72)) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:837:4: otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator1842); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFilterOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:841:1: ( (lv_expression_4_0= ruleExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:842:1: (lv_expression_4_0= ruleExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:842:1: (lv_expression_4_0= ruleExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:843:3: lv_expression_4_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator1863);
            	    lv_expression_4_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFilterOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expression",
            	            		lv_expression_4_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator1877); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:863:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:864:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:864:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:865:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator1898);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFilterOperator1910); 

                	newLeafNode(otherlv_7, grammarAccess.getFilterOperatorAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterOperator"


    // $ANTLR start "entryRuleSplitOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:893:1: entryRuleSplitOperator returns [EObject current=null] : iv_ruleSplitOperator= ruleSplitOperator EOF ;
    public final EObject entryRuleSplitOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:894:2: (iv_ruleSplitOperator= ruleSplitOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:895:2: iv_ruleSplitOperator= ruleSplitOperator EOF
            {
             newCompositeNode(grammarAccess.getSplitOperatorRule()); 
            pushFollow(FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator1946);
            iv_ruleSplitOperator=ruleSplitOperator();

            state._fsp--;

             current =iv_ruleSplitOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitOperator1956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSplitOperator"


    // $ANTLR start "ruleSplitOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:902:1: ruleSplitOperator returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleSplitOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:905:28: ( (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:906:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:906:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:906:3: otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSplitOperator1993); 

                	newLeafNode(otherlv_0, grammarAccess.getSplitOperatorAccess().getSplitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSplitOperator2005); 

                	newLeafNode(otherlv_1, grammarAccess.getSplitOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:914:1: ( (lv_parameter_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:915:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:915:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:916:3: lv_parameter_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSplitOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2026);
            lv_parameter_2_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplitOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSplitOperator2038); 

                	newLeafNode(otherlv_3, grammarAccess.getSplitOperatorAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSplitOperator"


    // $ANTLR start "entryRuleMatchOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:944:1: entryRuleMatchOperator returns [EObject current=null] : iv_ruleMatchOperator= ruleMatchOperator EOF ;
    public final EObject entryRuleMatchOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:945:2: (iv_ruleMatchOperator= ruleMatchOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:946:2: iv_ruleMatchOperator= ruleMatchOperator EOF
            {
             newCompositeNode(grammarAccess.getMatchOperatorRule()); 
            pushFollow(FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2074);
            iv_ruleMatchOperator=ruleMatchOperator();

            state._fsp--;

             current =iv_ruleMatchOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchOperator2084); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatchOperator"


    // $ANTLR start "ruleMatchOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:953:1: ruleMatchOperator returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleMatchOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_expression_2_0 = null;

        EObject lv_calculation_4_0 = null;

        EObject lv_stream_6_0 = null;

        EObject lv_stream_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:956:28: ( (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:957:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:957:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:957:3: otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMatchOperator2121); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchOperatorAccess().getMatchKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMatchOperator2133); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:965:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:966:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:966:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:967:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2154);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2166); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:987:1: ( (lv_calculation_4_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:988:1: (lv_calculation_4_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:988:1: (lv_calculation_4_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:989:3: lv_calculation_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getCalculationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2187);
            lv_calculation_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"calculation",
                    		lv_calculation_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2199); 

                	newLeafNode(otherlv_5, grammarAccess.getMatchOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1009:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1010:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1010:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1011:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2220);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatchOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1027:2: (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1027:4: otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2233); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMatchOperatorAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1031:1: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1032:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1032:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1033:3: lv_stream_8_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2254);
            	    lv_stream_8_0=ruleStreamOperatorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatchOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stream",
            	            		lv_stream_8_0, 
            	            		"StreamOperatorParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMatchOperator2268); 

                	newLeafNode(otherlv_9, grammarAccess.getMatchOperatorAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchOperator"


    // $ANTLR start "entryRuleInputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1061:1: entryRuleInputOperator returns [EObject current=null] : iv_ruleInputOperator= ruleInputOperator EOF ;
    public final EObject entryRuleInputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1062:2: (iv_ruleInputOperator= ruleInputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1063:2: iv_ruleInputOperator= ruleInputOperator EOF
            {
             newCompositeNode(grammarAccess.getInputOperatorRule()); 
            pushFollow(FOLLOW_ruleInputOperator_in_entryRuleInputOperator2304);
            iv_ruleInputOperator=ruleInputOperator();

            state._fsp--;

             current =iv_ruleInputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperator2314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputOperator"


    // $ANTLR start "ruleInputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1070:1: ruleInputOperator returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_address_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_port_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) ;
    public final EObject ruleInputOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_iri_2_0=null;
        Token otherlv_3=null;
        Token lv_iri_4_0=null;
        Token otherlv_5=null;
        Token lv_address_6_0=null;
        Token otherlv_7=null;
        Token lv_port_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1073:28: ( (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_address_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_port_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1074:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_address_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_port_8_0= RULE_NUMBER ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1074:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_address_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_port_8_0= RULE_NUMBER ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1074:3: otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_address_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_port_8_0= RULE_NUMBER ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleInputOperator2351); 

                	newLeafNode(otherlv_0, grammarAccess.getInputOperatorAccess().getInKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInputOperator2363); 

                	newLeafNode(otherlv_1, grammarAccess.getInputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1082:1: ( (lv_iri_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1083:1: (lv_iri_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1083:1: (lv_iri_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1084:3: lv_iri_2_0= RULE_STRING
            {
            lv_iri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator2380); 

            			newLeafNode(lv_iri_2_0, grammarAccess.getInputOperatorAccess().getIriSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"iri",
                    		lv_iri_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1100:2: (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_STRING) ) {
                        int LA12_2 = input.LA(3);

                        if ( (LA12_2==16) ) {
                            int LA12_3 = input.LA(4);

                            if ( (LA12_3==RULE_STRING) ) {
                                alt12=1;
                            }


                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1100:4: otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2398); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInputOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1104:1: ( (lv_iri_4_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1105:1: (lv_iri_4_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1105:1: (lv_iri_4_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1106:3: lv_iri_4_0= RULE_STRING
            	    {
            	    lv_iri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator2415); 

            	    			newLeafNode(lv_iri_4_0, grammarAccess.getInputOperatorAccess().getIriSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"iri",
            	            		lv_iri_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2434); 

                	newLeafNode(otherlv_5, grammarAccess.getInputOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1126:1: ( (lv_address_6_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1127:1: (lv_address_6_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1127:1: (lv_address_6_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1128:3: lv_address_6_0= RULE_STRING
            {
            lv_address_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator2451); 

            			newLeafNode(lv_address_6_0, grammarAccess.getInputOperatorAccess().getAddressSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2468); 

                	newLeafNode(otherlv_7, grammarAccess.getInputOperatorAccess().getCommaKeyword_6());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1148:1: ( (lv_port_8_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1149:1: (lv_port_8_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1149:1: (lv_port_8_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1150:3: lv_port_8_0= RULE_NUMBER
            {
            lv_port_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleInputOperator2485); 

            			newLeafNode(lv_port_8_0, grammarAccess.getInputOperatorAccess().getPortNUMBERTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_8_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleInputOperator2502); 

                	newLeafNode(otherlv_9, grammarAccess.getInputOperatorAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputOperator"


    // $ANTLR start "entryRuleReturnTypeOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1178:1: entryRuleReturnTypeOperator returns [EObject current=null] : iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF ;
    public final EObject entryRuleReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1179:2: (iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1180:2: iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator2538);
            iv_ruleReturnTypeOperator=ruleReturnTypeOperator();

            state._fsp--;

             current =iv_ruleReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeOperator2548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnTypeOperator"


    // $ANTLR start "ruleReturnTypeOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1187:1: ruleReturnTypeOperator returns [EObject current=null] : (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_TagOperator_2= ruleTagOperator | this_UnTagOperator_3= ruleUnTagOperator | this_FilterOperator_4= ruleFilterOperator | this_SplitOperator_5= ruleSplitOperator | this_CountOperator_6= ruleCountOperator | this_StandardDeviationOperator_7= ruleStandardDeviationOperator | this_AverageOperator_8= ruleAverageOperator | this_ElementJoinOperator_9= ruleElementJoinOperator | this_MatchOperator_10= ruleMatchOperator | this_OCLOperator_11= ruleOCLOperator | this_SWRLOperator_12= ruleSWRLOperator | this_AdditionOperator_13= ruleAdditionOperator | this_SubtractionOperator_14= ruleSubtractionOperator | this_MultiplicationOperator_15= ruleMultiplicationOperator | this_DivisionOperator_16= ruleDivisionOperator ) ;
    public final EObject ruleReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_InputOperator_0 = null;

        EObject this_JoinOperator_1 = null;

        EObject this_TagOperator_2 = null;

        EObject this_UnTagOperator_3 = null;

        EObject this_FilterOperator_4 = null;

        EObject this_SplitOperator_5 = null;

        EObject this_CountOperator_6 = null;

        EObject this_StandardDeviationOperator_7 = null;

        EObject this_AverageOperator_8 = null;

        EObject this_ElementJoinOperator_9 = null;

        EObject this_MatchOperator_10 = null;

        EObject this_OCLOperator_11 = null;

        EObject this_SWRLOperator_12 = null;

        EObject this_AdditionOperator_13 = null;

        EObject this_SubtractionOperator_14 = null;

        EObject this_MultiplicationOperator_15 = null;

        EObject this_DivisionOperator_16 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1190:28: ( (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_TagOperator_2= ruleTagOperator | this_UnTagOperator_3= ruleUnTagOperator | this_FilterOperator_4= ruleFilterOperator | this_SplitOperator_5= ruleSplitOperator | this_CountOperator_6= ruleCountOperator | this_StandardDeviationOperator_7= ruleStandardDeviationOperator | this_AverageOperator_8= ruleAverageOperator | this_ElementJoinOperator_9= ruleElementJoinOperator | this_MatchOperator_10= ruleMatchOperator | this_OCLOperator_11= ruleOCLOperator | this_SWRLOperator_12= ruleSWRLOperator | this_AdditionOperator_13= ruleAdditionOperator | this_SubtractionOperator_14= ruleSubtractionOperator | this_MultiplicationOperator_15= ruleMultiplicationOperator | this_DivisionOperator_16= ruleDivisionOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1191:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_TagOperator_2= ruleTagOperator | this_UnTagOperator_3= ruleUnTagOperator | this_FilterOperator_4= ruleFilterOperator | this_SplitOperator_5= ruleSplitOperator | this_CountOperator_6= ruleCountOperator | this_StandardDeviationOperator_7= ruleStandardDeviationOperator | this_AverageOperator_8= ruleAverageOperator | this_ElementJoinOperator_9= ruleElementJoinOperator | this_MatchOperator_10= ruleMatchOperator | this_OCLOperator_11= ruleOCLOperator | this_SWRLOperator_12= ruleSWRLOperator | this_AdditionOperator_13= ruleAdditionOperator | this_SubtractionOperator_14= ruleSubtractionOperator | this_MultiplicationOperator_15= ruleMultiplicationOperator | this_DivisionOperator_16= ruleDivisionOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1191:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_TagOperator_2= ruleTagOperator | this_UnTagOperator_3= ruleUnTagOperator | this_FilterOperator_4= ruleFilterOperator | this_SplitOperator_5= ruleSplitOperator | this_CountOperator_6= ruleCountOperator | this_StandardDeviationOperator_7= ruleStandardDeviationOperator | this_AverageOperator_8= ruleAverageOperator | this_ElementJoinOperator_9= ruleElementJoinOperator | this_MatchOperator_10= ruleMatchOperator | this_OCLOperator_11= ruleOCLOperator | this_SWRLOperator_12= ruleSWRLOperator | this_AdditionOperator_13= ruleAdditionOperator | this_SubtractionOperator_14= ruleSubtractionOperator | this_MultiplicationOperator_15= ruleMultiplicationOperator | this_DivisionOperator_16= ruleDivisionOperator )
            int alt13=17;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            case 27:
                {
                alt13=6;
                }
                break;
            case 50:
                {
                alt13=7;
                }
                break;
            case 51:
                {
                alt13=8;
                }
                break;
            case 52:
                {
                alt13=9;
                }
                break;
            case 25:
                {
                alt13=10;
                }
                break;
            case 28:
                {
                alt13=11;
                }
                break;
            case 49:
                {
                alt13=12;
                }
                break;
            case 45:
                {
                alt13=13;
                }
                break;
            case 53:
                {
                alt13=14;
                }
                break;
            case 54:
                {
                alt13=15;
                }
                break;
            case 55:
                {
                alt13=16;
                }
                break;
            case 56:
                {
                alt13=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1192:5: this_InputOperator_0= ruleInputOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getInputOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator2595);
                    this_InputOperator_0=ruleInputOperator();

                    state._fsp--;

                     
                            current = this_InputOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1202:5: this_JoinOperator_1= ruleJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getJoinOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator2622);
                    this_JoinOperator_1=ruleJoinOperator();

                    state._fsp--;

                     
                            current = this_JoinOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1212:5: this_TagOperator_2= ruleTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getTagOperatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator2649);
                    this_TagOperator_2=ruleTagOperator();

                    state._fsp--;

                     
                            current = this_TagOperator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1222:5: this_UnTagOperator_3= ruleUnTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getUnTagOperatorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator2676);
                    this_UnTagOperator_3=ruleUnTagOperator();

                    state._fsp--;

                     
                            current = this_UnTagOperator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1232:5: this_FilterOperator_4= ruleFilterOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getFilterOperatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator2703);
                    this_FilterOperator_4=ruleFilterOperator();

                    state._fsp--;

                     
                            current = this_FilterOperator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1242:5: this_SplitOperator_5= ruleSplitOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSplitOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator2730);
                    this_SplitOperator_5=ruleSplitOperator();

                    state._fsp--;

                     
                            current = this_SplitOperator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1252:5: this_CountOperator_6= ruleCountOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getCountOperatorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator2757);
                    this_CountOperator_6=ruleCountOperator();

                    state._fsp--;

                     
                            current = this_CountOperator_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1262:5: this_StandardDeviationOperator_7= ruleStandardDeviationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getStandardDeviationOperatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator2784);
                    this_StandardDeviationOperator_7=ruleStandardDeviationOperator();

                    state._fsp--;

                     
                            current = this_StandardDeviationOperator_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1272:5: this_AverageOperator_8= ruleAverageOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getAverageOperatorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator2811);
                    this_AverageOperator_8=ruleAverageOperator();

                    state._fsp--;

                     
                            current = this_AverageOperator_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1282:5: this_ElementJoinOperator_9= ruleElementJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getElementJoinOperatorParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator2838);
                    this_ElementJoinOperator_9=ruleElementJoinOperator();

                    state._fsp--;

                     
                            current = this_ElementJoinOperator_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1292:5: this_MatchOperator_10= ruleMatchOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMatchOperatorParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator2865);
                    this_MatchOperator_10=ruleMatchOperator();

                    state._fsp--;

                     
                            current = this_MatchOperator_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1302:5: this_OCLOperator_11= ruleOCLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getOCLOperatorParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator2892);
                    this_OCLOperator_11=ruleOCLOperator();

                    state._fsp--;

                     
                            current = this_OCLOperator_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1312:5: this_SWRLOperator_12= ruleSWRLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSWRLOperatorParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator2919);
                    this_SWRLOperator_12=ruleSWRLOperator();

                    state._fsp--;

                     
                            current = this_SWRLOperator_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1322:5: this_AdditionOperator_13= ruleAdditionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getAdditionOperatorParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleReturnTypeOperator2946);
                    this_AdditionOperator_13=ruleAdditionOperator();

                    state._fsp--;

                     
                            current = this_AdditionOperator_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1332:5: this_SubtractionOperator_14= ruleSubtractionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSubtractionOperatorParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleSubtractionOperator_in_ruleReturnTypeOperator2973);
                    this_SubtractionOperator_14=ruleSubtractionOperator();

                    state._fsp--;

                     
                            current = this_SubtractionOperator_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1342:5: this_MultiplicationOperator_15= ruleMultiplicationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMultiplicationOperatorParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleReturnTypeOperator3000);
                    this_MultiplicationOperator_15=ruleMultiplicationOperator();

                    state._fsp--;

                     
                            current = this_MultiplicationOperator_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1352:5: this_DivisionOperator_16= ruleDivisionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getDivisionOperatorParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleDivisionOperator_in_ruleReturnTypeOperator3027);
                    this_DivisionOperator_16=ruleDivisionOperator();

                    state._fsp--;

                     
                            current = this_DivisionOperator_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnTypeOperator"


    // $ANTLR start "entryRuleNoReturnTypeOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1368:1: entryRuleNoReturnTypeOperator returns [EObject current=null] : iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF ;
    public final EObject entryRuleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1369:2: (iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1370:2: iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getNoReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3062);
            iv_ruleNoReturnTypeOperator=ruleNoReturnTypeOperator();

            state._fsp--;

             current =iv_ruleNoReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3072); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoReturnTypeOperator"


    // $ANTLR start "ruleNoReturnTypeOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1377:1: ruleNoReturnTypeOperator returns [EObject current=null] : this_OutputOperator_0= ruleOutputOperator ;
    public final EObject ruleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_OutputOperator_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1380:28: (this_OutputOperator_0= ruleOutputOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1382:5: this_OutputOperator_0= ruleOutputOperator
            {
             
                    newCompositeNode(grammarAccess.getNoReturnTypeOperatorAccess().getOutputOperatorParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator3118);
            this_OutputOperator_0=ruleOutputOperator();

            state._fsp--;

             
                    current = this_OutputOperator_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoReturnTypeOperator"


    // $ANTLR start "entryRuleTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1398:1: entryRuleTagOperator returns [EObject current=null] : iv_ruleTagOperator= ruleTagOperator EOF ;
    public final EObject entryRuleTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1399:2: (iv_ruleTagOperator= ruleTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1400:2: iv_ruleTagOperator= ruleTagOperator EOF
            {
             newCompositeNode(grammarAccess.getTagOperatorRule()); 
            pushFollow(FOLLOW_ruleTagOperator_in_entryRuleTagOperator3152);
            iv_ruleTagOperator=ruleTagOperator();

            state._fsp--;

             current =iv_ruleTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagOperator3162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagOperator"


    // $ANTLR start "ruleTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1407:1: ruleTagOperator returns [EObject current=null] : (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleTagOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1410:28: ( (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1411:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1411:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1411:3: otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTagOperator3199); 

                	newLeafNode(otherlv_0, grammarAccess.getTagOperatorAccess().getTagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTagOperator3211); 

                	newLeafNode(otherlv_1, grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1419:1: ( (lv_parameters_2_0= ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1420:1: (lv_parameters_2_0= ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1420:1: (lv_parameters_2_0= ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1421:3: lv_parameters_2_0= ruleTagElement
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator3232);
            lv_parameters_2_0=ruleTagElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"TagElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1437:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1437:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTagOperator3245); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1441:1: ( (lv_parameters_4_0= ruleTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1442:1: (lv_parameters_4_0= ruleTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1442:1: (lv_parameters_4_0= ruleTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1443:3: lv_parameters_4_0= ruleTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator3266);
            	    lv_parameters_4_0=ruleTagElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTagOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"TagElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTagOperator3280); 

                	newLeafNode(otherlv_5, grammarAccess.getTagOperatorAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagOperator"


    // $ANTLR start "entryRuleQueryTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1473:1: entryRuleQueryTagOperator returns [EObject current=null] : iv_ruleQueryTagOperator= ruleQueryTagOperator EOF ;
    public final EObject entryRuleQueryTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1474:2: (iv_ruleQueryTagOperator= ruleQueryTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1475:2: iv_ruleQueryTagOperator= ruleQueryTagOperator EOF
            {
             newCompositeNode(grammarAccess.getQueryTagOperatorRule()); 
            pushFollow(FOLLOW_ruleQueryTagOperator_in_entryRuleQueryTagOperator3318);
            iv_ruleQueryTagOperator=ruleQueryTagOperator();

            state._fsp--;

             current =iv_ruleQueryTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryTagOperator3328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryTagOperator"


    // $ANTLR start "ruleQueryTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1482:1: ruleQueryTagOperator returns [EObject current=null] : (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' ) ;
    public final EObject ruleQueryTagOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_queryType_1_0 = null;

        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1485:28: ( (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1486:1: (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1486:1: (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1486:3: otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleQueryTagOperator3365); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryTagOperatorAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1490:1: ( (lv_queryType_1_0= ruleSparqlQueryType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1491:1: (lv_queryType_1_0= ruleSparqlQueryType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1491:1: (lv_queryType_1_0= ruleSparqlQueryType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1492:3: lv_queryType_1_0= ruleSparqlQueryType
            {
             
            	        newCompositeNode(grammarAccess.getQueryTagOperatorAccess().getQueryTypeSparqlQueryTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQueryType_in_ruleQueryTagOperator3386);
            lv_queryType_1_0=ruleSparqlQueryType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryTagOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"queryType",
                    		lv_queryType_1_0, 
                    		"SparqlQueryType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1508:2: ( (lv_query_2_0= ruleSparqlQuery ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1509:1: (lv_query_2_0= ruleSparqlQuery )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1509:1: (lv_query_2_0= ruleSparqlQuery )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1510:3: lv_query_2_0= ruleSparqlQuery
            {
             
            	        newCompositeNode(grammarAccess.getQueryTagOperatorAccess().getQuerySparqlQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQuery_in_ruleQueryTagOperator3407);
            lv_query_2_0=ruleSparqlQuery();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQueryTagOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"query",
                    		lv_query_2_0, 
                    		"SparqlQuery");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleQueryTagOperator3419); 

                	newLeafNode(otherlv_3, grammarAccess.getQueryTagOperatorAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryTagOperator"


    // $ANTLR start "entryRuleSparqlQuery"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1538:1: entryRuleSparqlQuery returns [EObject current=null] : iv_ruleSparqlQuery= ruleSparqlQuery EOF ;
    public final EObject entryRuleSparqlQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlQuery = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1539:2: (iv_ruleSparqlQuery= ruleSparqlQuery EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1540:2: iv_ruleSparqlQuery= ruleSparqlQuery EOF
            {
             newCompositeNode(grammarAccess.getSparqlQueryRule()); 
            pushFollow(FOLLOW_ruleSparqlQuery_in_entryRuleSparqlQuery3455);
            iv_ruleSparqlQuery=ruleSparqlQuery();

            state._fsp--;

             current =iv_ruleSparqlQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlQuery3465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSparqlQuery"


    // $ANTLR start "ruleSparqlQuery"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1547:1: ruleSparqlQuery returns [EObject current=null] : ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSparqlQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1550:28: ( ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:1: ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:1: ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:2: ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:2: ( (lv_variable_0_0= ruleSparqlQueryVariable ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1552:1: (lv_variable_0_0= ruleSparqlQueryVariable )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1552:1: (lv_variable_0_0= ruleSparqlQueryVariable )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1553:3: lv_variable_0_0= ruleSparqlQueryVariable
            {
             
            	        newCompositeNode(grammarAccess.getSparqlQueryAccess().getVariableSparqlQueryVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQueryVariable_in_ruleSparqlQuery3511);
            lv_variable_0_0=ruleSparqlQueryVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSparqlQueryRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"SparqlQueryVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSparqlQuery3523); 

                	newLeafNode(otherlv_1, grammarAccess.getSparqlQueryAccess().getWHEREKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSparqlQuery3535); 

                	newLeafNode(otherlv_2, grammarAccess.getSparqlQueryAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSparqlQuery3547); 

                	newLeafNode(otherlv_3, grammarAccess.getSparqlQueryAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSparqlQuery"


    // $ANTLR start "entryRuleSparqlQueryVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1589:1: entryRuleSparqlQueryVariable returns [EObject current=null] : iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF ;
    public final EObject entryRuleSparqlQueryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlQueryVariable = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1590:2: (iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1591:2: iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF
            {
             newCompositeNode(grammarAccess.getSparqlQueryVariableRule()); 
            pushFollow(FOLLOW_ruleSparqlQueryVariable_in_entryRuleSparqlQueryVariable3583);
            iv_ruleSparqlQueryVariable=ruleSparqlQueryVariable();

            state._fsp--;

             current =iv_ruleSparqlQueryVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlQueryVariable3593); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSparqlQueryVariable"


    // $ANTLR start "ruleSparqlQueryVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1598:1: ruleSparqlQueryVariable returns [EObject current=null] : (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSparqlQueryVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1601:28: ( (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1602:1: (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1602:1: (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1602:3: otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSparqlQueryVariable3630); 

                	newLeafNode(otherlv_0, grammarAccess.getSparqlQueryVariableAccess().getQuestionMarkKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1606:1: ( (lv_variable_1_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1607:1: (lv_variable_1_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1607:1: (lv_variable_1_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1608:3: lv_variable_1_0= RULE_STRING
            {
            lv_variable_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable3647); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getSparqlQueryVariableAccess().getVariableSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSparqlQueryVariableRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1624:2: (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1624:4: otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleSparqlQueryVariable3665); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSparqlQueryVariableAccess().getQuestionMarkKeyword_2_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:1: ( (lv_variable_3_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1629:1: (lv_variable_3_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1629:1: (lv_variable_3_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1630:3: lv_variable_3_0= RULE_STRING
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable3682); 

            	    			newLeafNode(lv_variable_3_0, grammarAccess.getSparqlQueryVariableAccess().getVariableSTRINGTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSparqlQueryVariableRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSparqlQueryVariable"


    // $ANTLR start "entryRuleUnTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1654:1: entryRuleUnTagOperator returns [EObject current=null] : iv_ruleUnTagOperator= ruleUnTagOperator EOF ;
    public final EObject entryRuleUnTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1655:2: (iv_ruleUnTagOperator= ruleUnTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1656:2: iv_ruleUnTagOperator= ruleUnTagOperator EOF
            {
             newCompositeNode(grammarAccess.getUnTagOperatorRule()); 
            pushFollow(FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator3725);
            iv_ruleUnTagOperator=ruleUnTagOperator();

            state._fsp--;

             current =iv_ruleUnTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagOperator3735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnTagOperator"


    // $ANTLR start "ruleUnTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1663:1: ruleUnTagOperator returns [EObject current=null] : (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
    public final EObject ruleUnTagOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_stream_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1666:28: ( (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1667:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1667:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1667:3: otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleUnTagOperator3772); 

                	newLeafNode(otherlv_0, grammarAccess.getUnTagOperatorAccess().getUntagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUnTagOperator3784); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1675:1: ( (lv_parameters_2_0= ruleUnTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1676:1: (lv_parameters_2_0= ruleUnTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1676:1: (lv_parameters_2_0= ruleUnTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1677:3: lv_parameters_2_0= ruleUnTagElement
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator3805);
            lv_parameters_2_0=ruleUnTagElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnTagOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"UnTagElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1693:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1693:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator3818); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1697:1: ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1698:1: (lv_parameters_4_0= ruleUnTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1698:1: (lv_parameters_4_0= ruleUnTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1699:3: lv_parameters_4_0= ruleUnTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator3839);
            	    lv_parameters_4_0=ruleUnTagElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnTagOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"UnTagElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator3853); 

                	newLeafNode(otherlv_5, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1721:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator3874);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnTagOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleUnTagOperator3886); 

                	newLeafNode(otherlv_7, grammarAccess.getUnTagOperatorAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnTagOperator"


    // $ANTLR start "entryRuleUnTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1749:1: entryRuleUnTagElement returns [EObject current=null] : iv_ruleUnTagElement= ruleUnTagElement EOF ;
    public final EObject entryRuleUnTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1750:2: (iv_ruleUnTagElement= ruleUnTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1751:2: iv_ruleUnTagElement= ruleUnTagElement EOF
            {
             newCompositeNode(grammarAccess.getUnTagElementRule()); 
            pushFollow(FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement3922);
            iv_ruleUnTagElement=ruleUnTagElement();

            state._fsp--;

             current =iv_ruleUnTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagElement3932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnTagElement"


    // $ANTLR start "ruleUnTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1758:1: ruleUnTagElement returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) ;
    public final EObject ruleUnTagElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1761:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1762:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1762:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1762:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1762:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1763:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1763:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1764:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnTagElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUnTagElement3977); 

            		newLeafNode(otherlv_0, grammarAccess.getUnTagElementAccess().getElementOWLClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUnTagElement3989); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagElementAccess().getIsKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1779:1: ( (lv_reference_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:1: (lv_reference_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:1: (lv_reference_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1781:3: lv_reference_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getUnTagElementAccess().getReferenceStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleUnTagElement4010);
            lv_reference_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnTagElementRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnTagElement"


    // $ANTLR start "entryRuleTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1805:1: entryRuleTagElement returns [EObject current=null] : iv_ruleTagElement= ruleTagElement EOF ;
    public final EObject entryRuleTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1806:2: (iv_ruleTagElement= ruleTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1807:2: iv_ruleTagElement= ruleTagElement EOF
            {
             newCompositeNode(grammarAccess.getTagElementRule()); 
            pushFollow(FOLLOW_ruleTagElement_in_entryRuleTagElement4046);
            iv_ruleTagElement=ruleTagElement();

            state._fsp--;

             current =iv_ruleTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagElement4056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagElement"


    // $ANTLR start "ruleTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1814:1: ruleTagElement returns [EObject current=null] : (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) ;
    public final EObject ruleTagElement() throws RecognitionException {
        EObject current = null;

        EObject this_TagClassElement_0 = null;

        EObject this_TagObjectPropertyElement_1 = null;

        EObject this_TagDataTypePropertyElement_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1817:28: ( (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1818:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1818:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==19) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==RULE_ID) ) {
                        int LA17_3 = input.LA(4);

                        if ( (LA17_3==34) ) {
                            switch ( input.LA(5) ) {
                            case 35:
                                {
                                alt17=1;
                                }
                                break;
                            case 36:
                                {
                                alt17=2;
                                }
                                break;
                            case 37:
                                {
                                alt17=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1819:5: this_TagClassElement_0= ruleTagClassElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTagClassElement_in_ruleTagElement4103);
                    this_TagClassElement_0=ruleTagClassElement();

                    state._fsp--;

                     
                            current = this_TagClassElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1829:5: this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4130);
                    this_TagObjectPropertyElement_1=ruleTagObjectPropertyElement();

                    state._fsp--;

                     
                            current = this_TagObjectPropertyElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1839:5: this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4157);
                    this_TagDataTypePropertyElement_2=ruleTagDataTypePropertyElement();

                    state._fsp--;

                     
                            current = this_TagDataTypePropertyElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagElement"


    // $ANTLR start "entryRuleTagClassElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1855:1: entryRuleTagClassElement returns [EObject current=null] : iv_ruleTagClassElement= ruleTagClassElement EOF ;
    public final EObject entryRuleTagClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagClassElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1856:2: (iv_ruleTagClassElement= ruleTagClassElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1857:2: iv_ruleTagClassElement= ruleTagClassElement EOF
            {
             newCompositeNode(grammarAccess.getTagClassElementRule()); 
            pushFollow(FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4192);
            iv_ruleTagClassElement=ruleTagClassElement();

            state._fsp--;

             current =iv_ruleTagClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagClassElement4202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagClassElement"


    // $ANTLR start "ruleTagClassElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1864:1: ruleTagClassElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagClassElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1867:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1868:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1868:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1868:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1868:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1869:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1869:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1870:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagClassElement4248);
            lv_reference_0_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagClassElementRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTagClassElement4260); 

                	newLeafNode(otherlv_1, grammarAccess.getTagClassElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTagClassElement4272); 

                	newLeafNode(otherlv_2, grammarAccess.getTagClassElementAccess().getClassKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1894:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1895:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1895:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1896:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagClassElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagClassElement4292); 

            		newLeafNode(otherlv_3, grammarAccess.getTagClassElementAccess().getElementOWLClassCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagClassElement"


    // $ANTLR start "entryRuleTagObjectPropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1915:1: entryRuleTagObjectPropertyElement returns [EObject current=null] : iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF ;
    public final EObject entryRuleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagObjectPropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1916:2: (iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1917:2: iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagObjectPropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4328);
            iv_ruleTagObjectPropertyElement=ruleTagObjectPropertyElement();

            state._fsp--;

             current =iv_ruleTagObjectPropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagObjectPropertyElement"


    // $ANTLR start "ruleTagObjectPropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1924:1: ruleTagObjectPropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1927:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1928:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1928:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1928:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1928:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1929:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1929:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1930:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4384);
            lv_reference_0_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagObjectPropertyElementRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTagObjectPropertyElement4396); 

                	newLeafNode(otherlv_1, grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleTagObjectPropertyElement4408); 

                	newLeafNode(otherlv_2, grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1954:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1955:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1955:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1956:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagObjectPropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4428); 

            		newLeafNode(otherlv_3, grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertyCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagObjectPropertyElement"


    // $ANTLR start "entryRuleTagDataTypePropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1975:1: entryRuleTagDataTypePropertyElement returns [EObject current=null] : iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF ;
    public final EObject entryRuleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagDataTypePropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1976:2: (iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1977:2: iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagDataTypePropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement4464);
            iv_ruleTagDataTypePropertyElement=ruleTagDataTypePropertyElement();

            state._fsp--;

             current =iv_ruleTagDataTypePropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement4474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagDataTypePropertyElement"


    // $ANTLR start "ruleTagDataTypePropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1984:1: ruleTagDataTypePropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1987:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1988:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1988:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1988:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1988:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1989:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1989:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1990:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement4520);
            lv_reference_0_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagDataTypePropertyElementRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTagDataTypePropertyElement4532); 

                	newLeafNode(otherlv_1, grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTagDataTypePropertyElement4544); 

                	newLeafNode(otherlv_2, grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2014:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2015:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2015:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2016:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagDataTypePropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement4564); 

            		newLeafNode(otherlv_3, grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertyCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagDataTypePropertyElement"


    // $ANTLR start "entryRuleBarrierOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2035:1: entryRuleBarrierOperator returns [EObject current=null] : iv_ruleBarrierOperator= ruleBarrierOperator EOF ;
    public final EObject entryRuleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrierOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2036:2: (iv_ruleBarrierOperator= ruleBarrierOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2037:2: iv_ruleBarrierOperator= ruleBarrierOperator EOF
            {
             newCompositeNode(grammarAccess.getBarrierOperatorRule()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator4600);
            iv_ruleBarrierOperator=ruleBarrierOperator();

            state._fsp--;

             current =iv_ruleBarrierOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrierOperator4610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBarrierOperator"


    // $ANTLR start "ruleBarrierOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2044:1: ruleBarrierOperator returns [EObject current=null] : (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) ;
    public final EObject ruleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject this_WindowOperator_0 = null;

        EObject this_MarkerOperator_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2047:28: ( (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2048:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2048:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38||LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2049:5: this_WindowOperator_0= ruleWindowOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWindowOperator_in_ruleBarrierOperator4657);
                    this_WindowOperator_0=ruleWindowOperator();

                    state._fsp--;

                     
                            current = this_WindowOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2059:5: this_MarkerOperator_1= ruleMarkerOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getMarkerOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator4684);
                    this_MarkerOperator_1=ruleMarkerOperator();

                    state._fsp--;

                     
                            current = this_MarkerOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBarrierOperator"


    // $ANTLR start "entryRuleWindowOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2075:1: entryRuleWindowOperator returns [EObject current=null] : iv_ruleWindowOperator= ruleWindowOperator EOF ;
    public final EObject entryRuleWindowOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2076:2: (iv_ruleWindowOperator= ruleWindowOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2077:2: iv_ruleWindowOperator= ruleWindowOperator EOF
            {
             newCompositeNode(grammarAccess.getWindowOperatorRule()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator4719);
            iv_ruleWindowOperator=ruleWindowOperator();

            state._fsp--;

             current =iv_ruleWindowOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindowOperator4729); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindowOperator"


    // $ANTLR start "ruleWindowOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2084:1: ruleWindowOperator returns [EObject current=null] : ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) ;
    public final EObject ruleWindowOperator() throws RecognitionException {
        EObject current = null;

        Token lv_setting_0_0=null;
        Token lv_value_1_0=null;
        Token lv_unit_2_1=null;
        Token lv_unit_2_2=null;
        Token lv_unit_2_3=null;
        Token lv_unit_2_4=null;
        Token lv_setting_3_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2087:28: ( ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:3: ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2088:3: ( (lv_setting_0_0= 'last' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2089:1: (lv_setting_0_0= 'last' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2089:1: (lv_setting_0_0= 'last' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2090:3: lv_setting_0_0= 'last'
                    {
                    lv_setting_0_0=(Token)match(input,38,FOLLOW_38_in_ruleWindowOperator4773); 

                            newLeafNode(lv_setting_0_0, grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "setting", lv_setting_0_0, "last");
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2103:2: ( (lv_value_1_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2104:1: (lv_value_1_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2104:1: (lv_value_1_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2105:3: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleWindowOperator4803); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getWindowOperatorAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"NUMBER");
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2121:2: ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=39 && LA20_0<=42)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2122:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2122:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2123:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2123:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            int alt19=4;
                            switch ( input.LA(1) ) {
                            case 39:
                                {
                                alt19=1;
                                }
                                break;
                            case 40:
                                {
                                alt19=2;
                                }
                                break;
                            case 41:
                                {
                                alt19=3;
                                }
                                break;
                            case 42:
                                {
                                alt19=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 0, input);

                                throw nvae;
                            }

                            switch (alt19) {
                                case 1 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2124:3: lv_unit_2_1= 'min'
                                    {
                                    lv_unit_2_1=(Token)match(input,39,FOLLOW_39_in_ruleWindowOperator4828); 

                                            newLeafNode(lv_unit_2_1, grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2136:8: lv_unit_2_2= 'hrs'
                                    {
                                    lv_unit_2_2=(Token)match(input,40,FOLLOW_40_in_ruleWindowOperator4857); 

                                            newLeafNode(lv_unit_2_2, grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_2, null);
                                    	    

                                    }
                                    break;
                                case 3 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2148:8: lv_unit_2_3= 'sec'
                                    {
                                    lv_unit_2_3=(Token)match(input,41,FOLLOW_41_in_ruleWindowOperator4886); 

                                            newLeafNode(lv_unit_2_3, grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_3, null);
                                    	    

                                    }
                                    break;
                                case 4 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2160:8: lv_unit_2_4= 'elements'
                                    {
                                    lv_unit_2_4=(Token)match(input,42,FOLLOW_42_in_ruleWindowOperator4915); 

                                            newLeafNode(lv_unit_2_4, grammarAccess.getWindowOperatorAccess().getUnitElementsKeyword_0_2_0_3());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_4, null);
                                    	    

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2176:6: ( (lv_setting_3_0= 'now' ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2176:6: ( (lv_setting_3_0= 'now' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2177:1: (lv_setting_3_0= 'now' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2177:1: (lv_setting_3_0= 'now' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2178:3: lv_setting_3_0= 'now'
                    {
                    lv_setting_3_0=(Token)match(input,43,FOLLOW_43_in_ruleWindowOperator4957); 

                            newLeafNode(lv_setting_3_0, grammarAccess.getWindowOperatorAccess().getSettingNowKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "setting", lv_setting_3_0, "now");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowOperator"


    // $ANTLR start "entryRuleMarkerOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2199:1: entryRuleMarkerOperator returns [EObject current=null] : iv_ruleMarkerOperator= ruleMarkerOperator EOF ;
    public final EObject entryRuleMarkerOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkerOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2200:2: (iv_ruleMarkerOperator= ruleMarkerOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2201:2: iv_ruleMarkerOperator= ruleMarkerOperator EOF
            {
             newCompositeNode(grammarAccess.getMarkerOperatorRule()); 
            pushFollow(FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5006);
            iv_ruleMarkerOperator=ruleMarkerOperator();

            state._fsp--;

             current =iv_ruleMarkerOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkerOperator5016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkerOperator"


    // $ANTLR start "ruleMarkerOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2208:1: ruleMarkerOperator returns [EObject current=null] : (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleMarkerOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2211:28: ( (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2212:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2212:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2212:3: otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleMarkerOperator5053); 

                	newLeafNode(otherlv_0, grammarAccess.getMarkerOperatorAccess().getMarkerKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2216:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:1: (lv_expression_1_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2218:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMarkerOperatorAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMarkerOperator5074);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMarkerOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkerOperator"


    // $ANTLR start "entryRuleSWRLOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2242:1: entryRuleSWRLOperator returns [EObject current=null] : iv_ruleSWRLOperator= ruleSWRLOperator EOF ;
    public final EObject entryRuleSWRLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2243:2: (iv_ruleSWRLOperator= ruleSWRLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2244:2: iv_ruleSWRLOperator= ruleSWRLOperator EOF
            {
             newCompositeNode(grammarAccess.getSWRLOperatorRule()); 
            pushFollow(FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5110);
            iv_ruleSWRLOperator=ruleSWRLOperator();

            state._fsp--;

             current =iv_ruleSWRLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLOperator5120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSWRLOperator"


    // $ANTLR start "ruleSWRLOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2251:1: ruleSWRLOperator returns [EObject current=null] : (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleSWRLOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rule_2_0 = null;

        EObject lv_barrier_4_0 = null;

        EObject lv_barrier_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2254:28: ( (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2255:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2255:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2255:3: otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleSWRLOperator5157); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLOperatorAccess().getSwrlKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLOperator5169); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2263:1: ( (lv_rule_2_0= ruleSWRLRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2264:1: (lv_rule_2_0= ruleSWRLRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2264:1: (lv_rule_2_0= ruleSWRLRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2265:3: lv_rule_2_0= ruleSWRLRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getRuleSWRLRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5190);
            lv_rule_2_0=ruleSWRLRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSWRLOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"rule",
                    		lv_rule_2_0, 
                    		"SWRLRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5202); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2285:1: ( (lv_barrier_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2286:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2286:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2287:3: lv_barrier_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5223);
            lv_barrier_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSWRLOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"barrier",
                    		lv_barrier_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2303:2: (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2303:4: otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5236); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2307:1: ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2308:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2308:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2309:3: lv_barrier_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5257);
            	    lv_barrier_6_0=ruleStreamOperatorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSWRLOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"barrier",
            	            		lv_barrier_6_0, 
            	            		"StreamOperatorParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSWRLOperator5271); 

                	newLeafNode(otherlv_7, grammarAccess.getSWRLOperatorAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSWRLOperator"


    // $ANTLR start "entryRuleSWRLRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2337:1: entryRuleSWRLRule returns [EObject current=null] : iv_ruleSWRLRule= ruleSWRLRule EOF ;
    public final EObject entryRuleSWRLRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2338:2: (iv_ruleSWRLRule= ruleSWRLRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2339:2: iv_ruleSWRLRule= ruleSWRLRule EOF
            {
             newCompositeNode(grammarAccess.getSWRLRuleRule()); 
            pushFollow(FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5307);
            iv_ruleSWRLRule=ruleSWRLRule();

            state._fsp--;

             current =iv_ruleSWRLRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLRule5317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSWRLRule"


    // $ANTLR start "ruleSWRLRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2346:1: ruleSWRLRule returns [EObject current=null] : (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) ;
    public final EObject ruleSWRLRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_antecedent_2_0 = null;

        EObject lv_consequent_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2349:28: ( (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2350:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2350:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2350:3: otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSWRLRule5354); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLRuleAccess().getImpliesKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLRule5366); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2358:1: ( (lv_antecedent_2_0= ruleAntecedentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2359:1: (lv_antecedent_2_0= ruleAntecedentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2359:1: (lv_antecedent_2_0= ruleAntecedentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2360:3: lv_antecedent_2_0= ruleAntecedentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getAntecedentAntecedentRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5387);
            lv_antecedent_2_0=ruleAntecedentRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSWRLRuleRule());
            	        }
                   		set(
                   			current, 
                   			"antecedent",
                    		lv_antecedent_2_0, 
                    		"AntecedentRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLRule5399); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLRuleAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2380:1: ( (lv_consequent_4_0= ruleConsequentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2381:1: (lv_consequent_4_0= ruleConsequentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2381:1: (lv_consequent_4_0= ruleConsequentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2382:3: lv_consequent_4_0= ruleConsequentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getConsequentConsequentRuleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConsequentRule_in_ruleSWRLRule5420);
            lv_consequent_4_0=ruleConsequentRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSWRLRuleRule());
            	        }
                   		set(
                   			current, 
                   			"consequent",
                    		lv_consequent_4_0, 
                    		"ConsequentRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSWRLRule5432); 

                	newLeafNode(otherlv_5, grammarAccess.getSWRLRuleAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSWRLRule"


    // $ANTLR start "entryRuleAntecedentRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2410:1: entryRuleAntecedentRule returns [EObject current=null] : iv_ruleAntecedentRule= ruleAntecedentRule EOF ;
    public final EObject entryRuleAntecedentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntecedentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2411:2: (iv_ruleAntecedentRule= ruleAntecedentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2412:2: iv_ruleAntecedentRule= ruleAntecedentRule EOF
            {
             newCompositeNode(grammarAccess.getAntecedentRuleRule()); 
            pushFollow(FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule5468);
            iv_ruleAntecedentRule=ruleAntecedentRule();

            state._fsp--;

             current =iv_ruleAntecedentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntecedentRule5478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAntecedentRule"


    // $ANTLR start "ruleAntecedentRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2419:1: ruleAntecedentRule returns [EObject current=null] : (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleAntecedentRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atoms_2_0 = null;

        EObject lv_atoms_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2422:28: ( (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2423:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2423:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2423:3: otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleAntecedentRule5515); 

                	newLeafNode(otherlv_0, grammarAccess.getAntecedentRuleAccess().getAntecedentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAntecedentRule5527); 

                	newLeafNode(otherlv_1, grammarAccess.getAntecedentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2431:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2432:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2432:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2433:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule5548);
            lv_atoms_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAntecedentRuleRule());
            	        }
                   		add(
                   			current, 
                   			"atoms",
                    		lv_atoms_2_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2449:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2449:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAntecedentRule5561); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAntecedentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2453:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2454:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2454:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2455:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule5582);
            	    lv_atoms_4_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAntecedentRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atoms",
            	            		lv_atoms_4_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAntecedentRule5596); 

                	newLeafNode(otherlv_5, grammarAccess.getAntecedentRuleAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAntecedentRule"


    // $ANTLR start "entryRuleConsequentRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2483:1: entryRuleConsequentRule returns [EObject current=null] : iv_ruleConsequentRule= ruleConsequentRule EOF ;
    public final EObject entryRuleConsequentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsequentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2484:2: (iv_ruleConsequentRule= ruleConsequentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2485:2: iv_ruleConsequentRule= ruleConsequentRule EOF
            {
             newCompositeNode(grammarAccess.getConsequentRuleRule()); 
            pushFollow(FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule5632);
            iv_ruleConsequentRule=ruleConsequentRule();

            state._fsp--;

             current =iv_ruleConsequentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsequentRule5642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConsequentRule"


    // $ANTLR start "ruleConsequentRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2492:1: ruleConsequentRule returns [EObject current=null] : (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleConsequentRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atoms_2_0 = null;

        EObject lv_atoms_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2495:28: ( (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2496:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2496:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2496:3: otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleConsequentRule5679); 

                	newLeafNode(otherlv_0, grammarAccess.getConsequentRuleAccess().getConsequentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConsequentRule5691); 

                	newLeafNode(otherlv_1, grammarAccess.getConsequentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2504:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2505:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2505:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2506:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule5712);
            lv_atoms_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConsequentRuleRule());
            	        }
                   		add(
                   			current, 
                   			"atoms",
                    		lv_atoms_2_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2522:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2522:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConsequentRule5725); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConsequentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2526:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2527:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2527:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2528:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule5746);
            	    lv_atoms_4_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConsequentRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atoms",
            	            		lv_atoms_4_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleConsequentRule5760); 

                	newLeafNode(otherlv_5, grammarAccess.getConsequentRuleAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsequentRule"


    // $ANTLR start "entryRuleRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2556:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2557:2: (iv_ruleRule= ruleRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2558:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule5796);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule5806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2565:1: ruleRule returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_3_0 = null;

        EObject lv_variable_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2568:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2569:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2569:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2569:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2569:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2570:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2570:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2571:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule5851); 

            		newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getNameOWLObjectPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRule5863); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRule5875); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getQuestionMarkKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2590:1: ( (lv_variable_3_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2591:1: (lv_variable_3_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2591:1: (lv_variable_3_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2592:3: lv_variable_3_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule5896);
            lv_variable_3_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2608:2: (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2608:4: otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRule5909); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getCommaKeyword_4_0());
            	        
            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleRule5921); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getQuestionMarkKeyword_4_1());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2616:1: ( (lv_variable_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2617:1: (lv_variable_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2617:1: (lv_variable_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2618:3: lv_variable_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule5942);
            	    lv_variable_6_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_6_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleRule5956); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOCLOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2646:1: entryRuleOCLOperator returns [EObject current=null] : iv_ruleOCLOperator= ruleOCLOperator EOF ;
    public final EObject entryRuleOCLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2647:2: (iv_ruleOCLOperator= ruleOCLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2648:2: iv_ruleOCLOperator= ruleOCLOperator EOF
            {
             newCompositeNode(grammarAccess.getOCLOperatorRule()); 
            pushFollow(FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator5992);
            iv_ruleOCLOperator=ruleOCLOperator();

            state._fsp--;

             current =iv_ruleOCLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperator6002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOCLOperator"


    // $ANTLR start "ruleOCLOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2655:1: ruleOCLOperator returns [EObject current=null] : (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
    public final EObject ruleOCLOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_constraint_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_stream_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2658:28: ( (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2659:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2659:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2659:3: otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleOCLOperator6039); 

                	newLeafNode(otherlv_0, grammarAccess.getOCLOperatorAccess().getOclKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOCLOperator6051); 

                	newLeafNode(otherlv_1, grammarAccess.getOCLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2667:1: ( (lv_constraint_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2668:1: (lv_constraint_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2668:1: (lv_constraint_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2669:3: lv_constraint_2_0= RULE_STRING
            {
            lv_constraint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOCLOperator6068); 

            			newLeafNode(lv_constraint_2_0, grammarAccess.getOCLOperatorAccess().getConstraintSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOCLOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constraint",
                    		lv_constraint_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOCLOperator6085); 

                	newLeafNode(otherlv_3, grammarAccess.getOCLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2689:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2690:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2690:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2691:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOCLOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6106);
            lv_stream_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOCLOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOCLOperator6118); 

                	newLeafNode(otherlv_5, grammarAccess.getOCLOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOCLOperator"


    // $ANTLR start "entryRuleCountOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2719:1: entryRuleCountOperator returns [EObject current=null] : iv_ruleCountOperator= ruleCountOperator EOF ;
    public final EObject entryRuleCountOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2720:2: (iv_ruleCountOperator= ruleCountOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2721:2: iv_ruleCountOperator= ruleCountOperator EOF
            {
             newCompositeNode(grammarAccess.getCountOperatorRule()); 
            pushFollow(FOLLOW_ruleCountOperator_in_entryRuleCountOperator6154);
            iv_ruleCountOperator=ruleCountOperator();

            state._fsp--;

             current =iv_ruleCountOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountOperator6164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountOperator"


    // $ANTLR start "ruleCountOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2728:1: ruleCountOperator returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
    public final EObject ruleCountOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_stream_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2731:28: ( (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2732:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2732:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2732:3: otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleCountOperator6201); 

                	newLeafNode(otherlv_0, grammarAccess.getCountOperatorAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCountOperator6213); 

                	newLeafNode(otherlv_1, grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2740:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2741:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2741:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2742:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleCountOperator6234);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCountOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCountOperator6246); 

                	newLeafNode(otherlv_3, grammarAccess.getCountOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2762:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2763:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2763:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2764:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6267);
            lv_stream_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCountOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCountOperator6279); 

                	newLeafNode(otherlv_5, grammarAccess.getCountOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCountOperator"


    // $ANTLR start "entryRuleStandardDeviationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2792:1: entryRuleStandardDeviationOperator returns [EObject current=null] : iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF ;
    public final EObject entryRuleStandardDeviationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2793:2: (iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2794:2: iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF
            {
             newCompositeNode(grammarAccess.getStandardDeviationOperatorRule()); 
            pushFollow(FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6315);
            iv_ruleStandardDeviationOperator=ruleStandardDeviationOperator();

            state._fsp--;

             current =iv_ruleStandardDeviationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardDeviationOperator6325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardDeviationOperator"


    // $ANTLR start "ruleStandardDeviationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2801:1: ruleStandardDeviationOperator returns [EObject current=null] : (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
    public final EObject ruleStandardDeviationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_stream_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2804:28: ( (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2805:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2805:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2805:3: otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleStandardDeviationOperator6362); 

                	newLeafNode(otherlv_0, grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStandardDeviationOperator6374); 

                	newLeafNode(otherlv_1, grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2813:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2814:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2814:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2815:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6395);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStandardDeviationOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStandardDeviationOperator6407); 

                	newLeafNode(otherlv_3, grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2835:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2836:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2836:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2837:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6428);
            lv_stream_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStandardDeviationOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleStandardDeviationOperator6440); 

                	newLeafNode(otherlv_5, grammarAccess.getStandardDeviationOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardDeviationOperator"


    // $ANTLR start "entryRuleAverageOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2865:1: entryRuleAverageOperator returns [EObject current=null] : iv_ruleAverageOperator= ruleAverageOperator EOF ;
    public final EObject entryRuleAverageOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2866:2: (iv_ruleAverageOperator= ruleAverageOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2867:2: iv_ruleAverageOperator= ruleAverageOperator EOF
            {
             newCompositeNode(grammarAccess.getAverageOperatorRule()); 
            pushFollow(FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator6476);
            iv_ruleAverageOperator=ruleAverageOperator();

            state._fsp--;

             current =iv_ruleAverageOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageOperator6486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAverageOperator"


    // $ANTLR start "ruleAverageOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2874:1: ruleAverageOperator returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
    public final EObject ruleAverageOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_stream_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2877:28: ( (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2878:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2878:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2878:3: otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleAverageOperator6523); 

                	newLeafNode(otherlv_0, grammarAccess.getAverageOperatorAccess().getAvgKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAverageOperator6535); 

                	newLeafNode(otherlv_1, grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2886:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2887:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2887:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2888:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAverageOperator6556);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAverageOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAverageOperator6568); 

                	newLeafNode(otherlv_3, grammarAccess.getAverageOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2908:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2909:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2909:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2910:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator6589);
            lv_stream_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAverageOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAverageOperator6601); 

                	newLeafNode(otherlv_5, grammarAccess.getAverageOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAverageOperator"


    // $ANTLR start "entryRuleAdditionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2938:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2939:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2940:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
             newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6637);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;

             current =iv_ruleAdditionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator6647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionOperator"


    // $ANTLR start "ruleAdditionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2947:1: ruleAdditionOperator returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_6=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2950:28: ( (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2951:1: (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2951:1: (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2951:3: otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAdditionOperator6684); 

                	newLeafNode(otherlv_0, grammarAccess.getAdditionOperatorAccess().getAddKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAdditionOperator6696); 

                	newLeafNode(otherlv_1, grammarAccess.getAdditionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2959:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2960:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2960:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2961:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAdditionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAdditionOperator6717);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAdditionOperator6729); 

                	newLeafNode(otherlv_3, grammarAccess.getAdditionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2981:1: ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NUMBER) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2981:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2981:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2982:1: (lv_literal_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2982:1: (lv_literal_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2983:3: lv_literal_4_0= RULE_NUMBER
                    {
                    lv_literal_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAdditionOperator6747); 

                    			newLeafNode(lv_literal_4_0, grammarAccess.getAdditionOperatorAccess().getLiteralNUMBERTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAdditionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3000:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3000:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3001:1: (lv_streamElements_5_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3001:1: (lv_streamElements_5_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3002:3: lv_streamElements_5_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getAdditionOperatorAccess().getStreamElementsStreamAccessParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleAdditionOperator6779);
                    lv_streamElements_5_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAdditionOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"streamElements",
                            		lv_streamElements_5_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleAdditionOperator6792); 

                	newLeafNode(otherlv_6, grammarAccess.getAdditionOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "entryRuleSubtractionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3030:1: entryRuleSubtractionOperator returns [EObject current=null] : iv_ruleSubtractionOperator= ruleSubtractionOperator EOF ;
    public final EObject entryRuleSubtractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3031:2: (iv_ruleSubtractionOperator= ruleSubtractionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3032:2: iv_ruleSubtractionOperator= ruleSubtractionOperator EOF
            {
             newCompositeNode(grammarAccess.getSubtractionOperatorRule()); 
            pushFollow(FOLLOW_ruleSubtractionOperator_in_entryRuleSubtractionOperator6828);
            iv_ruleSubtractionOperator=ruleSubtractionOperator();

            state._fsp--;

             current =iv_ruleSubtractionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtractionOperator6838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtractionOperator"


    // $ANTLR start "ruleSubtractionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3039:1: ruleSubtractionOperator returns [EObject current=null] : (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleSubtractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_6=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3042:28: ( (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3043:1: (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3043:1: (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3043:3: otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleSubtractionOperator6875); 

                	newLeafNode(otherlv_0, grammarAccess.getSubtractionOperatorAccess().getSubKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubtractionOperator6887); 

                	newLeafNode(otherlv_1, grammarAccess.getSubtractionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3051:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3052:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3052:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3053:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getSubtractionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator6908);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubtractionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSubtractionOperator6920); 

                	newLeafNode(otherlv_3, grammarAccess.getSubtractionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3073:1: ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NUMBER) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3073:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3073:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3074:1: (lv_literal_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3074:1: (lv_literal_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3075:3: lv_literal_4_0= RULE_NUMBER
                    {
                    lv_literal_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSubtractionOperator6938); 

                    			newLeafNode(lv_literal_4_0, grammarAccess.getSubtractionOperatorAccess().getLiteralNUMBERTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubtractionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3092:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3092:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3093:1: (lv_streamElements_5_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3093:1: (lv_streamElements_5_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3094:3: lv_streamElements_5_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubtractionOperatorAccess().getStreamElementsStreamAccessParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator6970);
                    lv_streamElements_5_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubtractionOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"streamElements",
                            		lv_streamElements_5_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleSubtractionOperator6983); 

                	newLeafNode(otherlv_6, grammarAccess.getSubtractionOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtractionOperator"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3122:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3123:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3124:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7019);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;

             current =iv_ruleMultiplicationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator7029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3131:1: ruleMultiplicationOperator returns [EObject current=null] : (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_6=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3134:28: ( (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3135:1: (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3135:1: (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3135:3: otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleMultiplicationOperator7066); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicationOperatorAccess().getMultKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMultiplicationOperator7078); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiplicationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3143:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3144:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3144:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3145:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7099);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicationOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMultiplicationOperator7111); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiplicationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3165:1: ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NUMBER) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3165:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3165:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3166:1: (lv_literal_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3166:1: (lv_literal_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3167:3: lv_literal_4_0= RULE_NUMBER
                    {
                    lv_literal_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMultiplicationOperator7129); 

                    			newLeafNode(lv_literal_4_0, grammarAccess.getMultiplicationOperatorAccess().getLiteralNUMBERTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3184:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3184:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3185:1: (lv_streamElements_5_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3185:1: (lv_streamElements_5_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3186:3: lv_streamElements_5_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationOperatorAccess().getStreamElementsStreamAccessParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7161);
                    lv_streamElements_5_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"streamElements",
                            		lv_streamElements_5_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicationOperator7174); 

                	newLeafNode(otherlv_6, grammarAccess.getMultiplicationOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleDivisionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3214:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3215:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3216:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
             newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7210);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;

             current =iv_ruleDivisionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator7220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionOperator"


    // $ANTLR start "ruleDivisionOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3223:1: ruleDivisionOperator returns [EObject current=null] : (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_6=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3226:28: ( (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3227:1: (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3227:1: (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3227:3: otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleDivisionOperator7257); 

                	newLeafNode(otherlv_0, grammarAccess.getDivisionOperatorAccess().getDivKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDivisionOperator7269); 

                	newLeafNode(otherlv_1, grammarAccess.getDivisionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3235:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3236:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3236:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3237:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getDivisionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7290);
            lv_parameter_2_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivisionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDivisionOperator7302); 

                	newLeafNode(otherlv_3, grammarAccess.getDivisionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:1: ( ( (lv_literal_4_0= RULE_NUMBER ) ) | ( (lv_streamElements_5_0= ruleStreamAccess ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NUMBER) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:2: ( (lv_literal_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3258:1: (lv_literal_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3258:1: (lv_literal_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3259:3: lv_literal_4_0= RULE_NUMBER
                    {
                    lv_literal_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDivisionOperator7320); 

                    			newLeafNode(lv_literal_4_0, grammarAccess.getDivisionOperatorAccess().getLiteralNUMBERTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDivisionOperatorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3276:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3276:6: ( (lv_streamElements_5_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3277:1: (lv_streamElements_5_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3277:1: (lv_streamElements_5_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3278:3: lv_streamElements_5_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getDivisionOperatorAccess().getStreamElementsStreamAccessParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7352);
                    lv_streamElements_5_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDivisionOperatorRule());
                    	        }
                           		add(
                           			current, 
                           			"streamElements",
                            		lv_streamElements_5_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleDivisionOperator7365); 

                	newLeafNode(otherlv_6, grammarAccess.getDivisionOperatorAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionOperator"


    // $ANTLR start "entryRuleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3306:1: entryRuleOutputOperator returns [EObject current=null] : iv_ruleOutputOperator= ruleOutputOperator EOF ;
    public final EObject entryRuleOutputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3307:2: (iv_ruleOutputOperator= ruleOutputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3308:2: iv_ruleOutputOperator= ruleOutputOperator EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorRule()); 
            pushFollow(FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator7401);
            iv_ruleOutputOperator=ruleOutputOperator();

            state._fsp--;

             current =iv_ruleOutputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperator7411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputOperator"


    // $ANTLR start "ruleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3315:1: ruleOutputOperator returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '(' ( (lv_stream_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )* otherlv_7= ',' ( (lv_address_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_port_10_0= RULE_NUMBER ) ) otherlv_11= ')' otherlv_12= ';' ) ;
    public final EObject ruleOutputOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_iri_4_0=null;
        Token otherlv_5=null;
        Token lv_iri_6_0=null;
        Token otherlv_7=null;
        Token lv_address_8_0=null;
        Token otherlv_9=null;
        Token lv_port_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_stream_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3318:28: ( (otherlv_0= 'out' otherlv_1= '(' ( (lv_stream_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )* otherlv_7= ',' ( (lv_address_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_port_10_0= RULE_NUMBER ) ) otherlv_11= ')' otherlv_12= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3319:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_stream_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )* otherlv_7= ',' ( (lv_address_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_port_10_0= RULE_NUMBER ) ) otherlv_11= ')' otherlv_12= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3319:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_stream_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )* otherlv_7= ',' ( (lv_address_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_port_10_0= RULE_NUMBER ) ) otherlv_11= ')' otherlv_12= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3319:3: otherlv_0= 'out' otherlv_1= '(' ( (lv_stream_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )* otherlv_7= ',' ( (lv_address_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_port_10_0= RULE_NUMBER ) ) otherlv_11= ')' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleOutputOperator7448); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputOperatorAccess().getOutKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOutputOperator7460); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3327:1: ( (lv_stream_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:1: (lv_stream_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:1: (lv_stream_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3329:3: lv_stream_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator7481);
            lv_stream_2_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_2_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7493); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3349:1: ( (lv_iri_4_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3350:1: (lv_iri_4_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3350:1: (lv_iri_4_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3351:3: lv_iri_4_0= RULE_STRING
            {
            lv_iri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator7510); 

            			newLeafNode(lv_iri_4_0, grammarAccess.getOutputOperatorAccess().getIriSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputOperatorRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"iri",
                    		lv_iri_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3367:2: (otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_STRING) ) {
                        int LA30_2 = input.LA(3);

                        if ( (LA30_2==16) ) {
                            int LA30_3 = input.LA(4);

                            if ( (LA30_3==RULE_STRING) ) {
                                alt30=1;
                            }


                        }


                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3367:4: otherlv_5= ',' ( (lv_iri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7528); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOutputOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3371:1: ( (lv_iri_6_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3372:1: (lv_iri_6_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3372:1: (lv_iri_6_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3373:3: lv_iri_6_0= RULE_STRING
            	    {
            	    lv_iri_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator7545); 

            	    			newLeafNode(lv_iri_6_0, grammarAccess.getOutputOperatorAccess().getIriSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOutputOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"iri",
            	            		lv_iri_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7564); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputOperatorAccess().getCommaKeyword_6());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3393:1: ( (lv_address_8_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3394:1: (lv_address_8_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3394:1: (lv_address_8_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3395:3: lv_address_8_0= RULE_STRING
            {
            lv_address_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator7581); 

            			newLeafNode(lv_address_8_0, grammarAccess.getOutputOperatorAccess().getAddressSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7598); 

                	newLeafNode(otherlv_9, grammarAccess.getOutputOperatorAccess().getCommaKeyword_8());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3415:1: ( (lv_port_10_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3416:1: (lv_port_10_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3416:1: (lv_port_10_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3417:3: lv_port_10_0= RULE_NUMBER
            {
            lv_port_10_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOutputOperator7615); 

            			newLeafNode(lv_port_10_0, grammarAccess.getOutputOperatorAccess().getPortNUMBERTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_10_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleOutputOperator7632); 

                	newLeafNode(otherlv_11, grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_10());
                
            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleOutputOperator7644); 

                	newLeafNode(otherlv_12, grammarAccess.getOutputOperatorAccess().getSemicolonKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputOperator"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3449:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3450:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3451:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition7680);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition7690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3458:1: ruleVariableDefinition returns [EObject current=null] : (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NumberVariableDefinition_0 = null;

        EObject this_StringVariableDefinition_1 = null;

        EObject this_BooleanVariableDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3461:28: ( (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3462:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3462:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 73:
            case 75:
                {
                alt31=1;
                }
                break;
            case 74:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_ID) ) {
                    int LA31_4 = input.LA(3);

                    if ( (LA31_4==17) ) {
                        int LA31_5 = input.LA(4);

                        if ( (LA31_5==RULE_BOOLVALUE) ) {
                            alt31=3;
                        }
                        else if ( (LA31_5==RULE_NUMBER) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3463:5: this_NumberVariableDefinition_0= ruleNumberVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNumberVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition7737);
                    this_NumberVariableDefinition_0=ruleNumberVariableDefinition();

                    state._fsp--;

                     
                            current = this_NumberVariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3473:5: this_StringVariableDefinition_1= ruleStringVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getStringVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition7764);
                    this_StringVariableDefinition_1=ruleStringVariableDefinition();

                    state._fsp--;

                     
                            current = this_StringVariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3483:5: this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBooleanVariableDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition7791);
                    this_BooleanVariableDefinition_2=ruleBooleanVariableDefinition();

                    state._fsp--;

                     
                            current = this_BooleanVariableDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3499:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3500:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3501:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration7826);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration7836); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3508:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3511:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3512:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3512:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3512:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3512:2: ( (lv_type_0_0= ruleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3513:1: (lv_type_0_0= ruleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3513:1: (lv_type_0_0= ruleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3514:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleVariableDeclaration7882);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3530:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3531:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3531:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3532:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration7899); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration7916); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleNumberVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3560:1: entryRuleNumberVariableDefinition returns [EObject current=null] : iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF ;
    public final EObject entryRuleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3561:2: (iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3562:2: iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getNumberVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition7952);
            iv_ruleNumberVariableDefinition=ruleNumberVariableDefinition();

            state._fsp--;

             current =iv_ruleNumberVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberVariableDefinition7962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberVariableDefinition"


    // $ANTLR start "ruleNumberVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3569:1: ruleNumberVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) ;
    public final EObject ruleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3572:28: ( ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3573:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3573:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3573:2: ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3573:2: ( (lv_type_0_0= ruleSimpleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3574:1: (lv_type_0_0= ruleSimpleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3574:1: (lv_type_0_0= ruleSimpleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3575:3: lv_type_0_0= ruleSimpleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNumberVariableDefinitionAccess().getTypeSimpleDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition8008);
            lv_type_0_0=ruleSimpleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberVariableDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"SimpleDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3591:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3592:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3592:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3593:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberVariableDefinition8025); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNumberVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNumberVariableDefinition8042); 

                	newLeafNode(otherlv_2, grammarAccess.getNumberVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3613:1: ( (lv_value_3_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3614:1: (lv_value_3_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3614:1: (lv_value_3_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3615:3: lv_value_3_0= RULE_NUMBER
            {
            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition8059); 

            			newLeafNode(lv_value_3_0, grammarAccess.getNumberVariableDefinitionAccess().getValueNUMBERTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNumberVariableDefinition8076); 

                	newLeafNode(otherlv_4, grammarAccess.getNumberVariableDefinitionAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberVariableDefinition"


    // $ANTLR start "entryRuleStringVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3643:1: entryRuleStringVariableDefinition returns [EObject current=null] : iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF ;
    public final EObject entryRuleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3644:2: (iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3645:2: iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getStringVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition8112);
            iv_ruleStringVariableDefinition=ruleStringVariableDefinition();

            state._fsp--;

             current =iv_ruleStringVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariableDefinition8122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringVariableDefinition"


    // $ANTLR start "ruleStringVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3652:1: ruleStringVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3655:28: ( ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3656:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3656:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3656:2: ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3656:2: ( (lv_type_0_0= ruleStringDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3657:1: (lv_type_0_0= ruleStringDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3657:1: (lv_type_0_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3658:3: lv_type_0_0= ruleStringDataType
            {
             
            	        newCompositeNode(grammarAccess.getStringVariableDefinitionAccess().getTypeStringDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition8168);
            lv_type_0_0=ruleStringDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringVariableDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"StringDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3674:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3675:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3675:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3676:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariableDefinition8185); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringVariableDefinition8202); 

                	newLeafNode(otherlv_2, grammarAccess.getStringVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3696:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3697:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3697:1: (lv_value_3_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3698:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringVariableDefinition8219); 

            			newLeafNode(lv_value_3_0, grammarAccess.getStringVariableDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStringVariableDefinition8236); 

                	newLeafNode(otherlv_4, grammarAccess.getStringVariableDefinitionAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringVariableDefinition"


    // $ANTLR start "entryRuleBooleanVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3726:1: entryRuleBooleanVariableDefinition returns [EObject current=null] : iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF ;
    public final EObject entryRuleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3727:2: (iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3728:2: iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition8272);
            iv_ruleBooleanVariableDefinition=ruleBooleanVariableDefinition();

            state._fsp--;

             current =iv_ruleBooleanVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanVariableDefinition8282); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanVariableDefinition"


    // $ANTLR start "ruleBooleanVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3735:1: ruleBooleanVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) ;
    public final EObject ruleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3738:28: ( ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3739:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3739:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3739:2: ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3739:2: ( (lv_type_0_0= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3740:1: (lv_type_0_0= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3740:1: (lv_type_0_0= ruleBooleanDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3741:3: lv_type_0_0= ruleBooleanDataType
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableDefinitionAccess().getTypeBooleanDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition8328);
            lv_type_0_0=ruleBooleanDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanVariableDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"BooleanDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3757:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3758:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3758:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3759:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition8345); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBooleanVariableDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanVariableDefinition8362); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3779:1: ( (lv_value_3_0= RULE_BOOLVALUE ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3780:1: (lv_value_3_0= RULE_BOOLVALUE )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3780:1: (lv_value_3_0= RULE_BOOLVALUE )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3781:3: lv_value_3_0= RULE_BOOLVALUE
            {
            lv_value_3_0=(Token)match(input,RULE_BOOLVALUE,FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition8379); 

            			newLeafNode(lv_value_3_0, grammarAccess.getBooleanVariableDefinitionAccess().getValueBOOLVALUETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanVariableDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"BOOLVALUE");
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBooleanVariableDefinition8396); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanVariableDefinitionAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanVariableDefinition"


    // $ANTLR start "entryRuleStructureDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3809:1: entryRuleStructureDeclaration returns [EObject current=null] : iv_ruleStructureDeclaration= ruleStructureDeclaration EOF ;
    public final EObject entryRuleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3810:2: (iv_ruleStructureDeclaration= ruleStructureDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3811:2: iv_ruleStructureDeclaration= ruleStructureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStructureDeclarationRule()); 
            pushFollow(FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration8432);
            iv_ruleStructureDeclaration=ruleStructureDeclaration();

            state._fsp--;

             current =iv_ruleStructureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDeclaration8442); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructureDeclaration"


    // $ANTLR start "ruleStructureDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3818:1: ruleStructureDeclaration returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' ) ;
    public final EObject ruleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3821:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3822:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3822:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3822:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleStructureDeclaration8479); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureDeclarationAccess().getStructureKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3826:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3827:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3827:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3828:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureDeclaration8496); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructureDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStructureDeclaration8513); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3848:1: ( (lv_elements_3_0= ruleVariableDeclaration ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=73 && LA32_0<=76)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3849:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3849:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3850:3: lv_elements_3_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureDeclarationAccess().getElementsVariableDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration8534);
            	    lv_elements_3_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructureDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"VariableDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStructureDeclaration8547); 

                	newLeafNode(otherlv_4, grammarAccess.getStructureDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructureDeclaration"


    // $ANTLR start "entryRuleStreamDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3878:1: entryRuleStreamDeclaration returns [EObject current=null] : iv_ruleStreamDeclaration= ruleStreamDeclaration EOF ;
    public final EObject entryRuleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3879:2: (iv_ruleStreamDeclaration= ruleStreamDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3880:2: iv_ruleStreamDeclaration= ruleStreamDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStreamDeclarationRule()); 
            pushFollow(FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration8583);
            iv_ruleStreamDeclaration=ruleStreamDeclaration();

            state._fsp--;

             current =iv_ruleStreamDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDeclaration8593); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamDeclaration"


    // $ANTLR start "ruleStreamDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3887:1: ruleStreamDeclaration returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3890:28: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3891:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3891:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3891:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleStreamDeclaration8630); 

                	newLeafNode(otherlv_0, grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3895:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3896:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3896:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3897:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDeclaration8647); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStreamDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStreamDeclaration8664); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3917:1: ( (lv_elements_3_0= ruleStreamElement ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==60||(LA33_0>=73 && LA33_0<=76)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3918:1: (lv_elements_3_0= ruleStreamElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3918:1: (lv_elements_3_0= ruleStreamElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3919:3: lv_elements_3_0= ruleStreamElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamElement_in_ruleStreamDeclaration8685);
            	    lv_elements_3_0=ruleStreamElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStreamDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"StreamElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStreamDeclaration8698); 

                	newLeafNode(otherlv_4, grammarAccess.getStreamDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamDeclaration"


    // $ANTLR start "entryRuleStreamElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3947:1: entryRuleStreamElement returns [EObject current=null] : iv_ruleStreamElement= ruleStreamElement EOF ;
    public final EObject entryRuleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3948:2: (iv_ruleStreamElement= ruleStreamElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3949:2: iv_ruleStreamElement= ruleStreamElement EOF
            {
             newCompositeNode(grammarAccess.getStreamElementRule()); 
            pushFollow(FOLLOW_ruleStreamElement_in_entryRuleStreamElement8734);
            iv_ruleStreamElement=ruleStreamElement();

            state._fsp--;

             current =iv_ruleStreamElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamElement8744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamElement"


    // $ANTLR start "ruleStreamElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3956:1: ruleStreamElement returns [EObject current=null] : (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureElements_0 = null;

        EObject this_VariableDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3959:28: ( (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3960:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3960:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=73 && LA34_0<=76)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3961:5: this_StructureElements_0= ruleStructureElements
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getStructureElementsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructureElements_in_ruleStreamElement8791);
                    this_StructureElements_0=ruleStructureElements();

                    state._fsp--;

                     
                            current = this_StructureElements_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3971:5: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getVariableDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStreamElement8818);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;

                     
                            current = this_VariableDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamElement"


    // $ANTLR start "entryRuleStructureElements"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3987:1: entryRuleStructureElements returns [EObject current=null] : iv_ruleStructureElements= ruleStructureElements EOF ;
    public final EObject entryRuleStructureElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureElements = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3988:2: (iv_ruleStructureElements= ruleStructureElements EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3989:2: iv_ruleStructureElements= ruleStructureElements EOF
            {
             newCompositeNode(grammarAccess.getStructureElementsRule()); 
            pushFollow(FOLLOW_ruleStructureElements_in_entryRuleStructureElements8853);
            iv_ruleStructureElements=ruleStructureElements();

            state._fsp--;

             current =iv_ruleStructureElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureElements8863); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructureElements"


    // $ANTLR start "ruleStructureElements"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3996:1: ruleStructureElements returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStructureElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3999:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4000:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4000:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4000:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleStructureElements8900); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureElementsAccess().getUseKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4004:1: ( (otherlv_1= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4005:1: (otherlv_1= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4005:1: (otherlv_1= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4006:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureElementsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureElements8920); 

            		newLeafNode(otherlv_1, grammarAccess.getStructureElementsAccess().getElementStructureDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStructureElements8932); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureElementsAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructureElements"


    // $ANTLR start "entryRuleExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4029:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4030:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4031:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression8968);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression8978); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4038:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4041:28: (this_Or_0= ruleOr )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4043:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression9024);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4059:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4060:2: (iv_ruleOr= ruleOr EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4061:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr9058);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr9068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4068:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4071:28: ( (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4072:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4072:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4073:5: this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr9115);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4081:1: ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4081:2: () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4081:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4082:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4087:2: ( (lv_operator_2_0= '||' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4088:1: (lv_operator_2_0= '||' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4088:1: (lv_operator_2_0= '||' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4089:3: lv_operator_2_0= '||'
            	    {
            	    lv_operator_2_0=(Token)match(input,61,FOLLOW_61_in_ruleOr9142); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getOrAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4102:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4103:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4103:1: (lv_right_3_0= ruleAnd )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4104:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr9176);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4128:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4129:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4130:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd9214);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd9224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4137:1: ruleAnd returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4140:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4141:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4141:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4142:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getRelationalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd9271);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;

             
                    current = this_RelationalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4150:1: ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4150:2: () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4150:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4151:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4156:2: ( (lv_operator_2_0= '&&' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4157:1: (lv_operator_2_0= '&&' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4157:1: (lv_operator_2_0= '&&' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4158:3: lv_operator_2_0= '&&'
            	    {
            	    lv_operator_2_0=(Token)match(input,62,FOLLOW_62_in_ruleAnd9298); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getAndAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4171:2: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4172:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4172:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4173:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd9332);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"RelationalExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4197:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4198:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4199:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression9370);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression9380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4206:1: ruleRelationalExpression returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4209:28: ( (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4210:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4210:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4211:5: this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression9427);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4219:1: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=63 && LA38_0<=68)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4219:2: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4219:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4220:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4225:2: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4226:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4226:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4227:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4227:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    int alt37=6;
            	    switch ( input.LA(1) ) {
            	    case 63:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt37=5;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt37=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4228:3: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,63,FOLLOW_63_in_ruleRelationalExpression9456); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getRelationalExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4240:8: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,64,FOLLOW_64_in_ruleRelationalExpression9485); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getRelationalExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4252:8: lv_operator_2_3= '>='
            	            {
            	            lv_operator_2_3=(Token)match(input,65,FOLLOW_65_in_ruleRelationalExpression9514); 

            	                    newLeafNode(lv_operator_2_3, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4264:8: lv_operator_2_4= '<='
            	            {
            	            lv_operator_2_4=(Token)match(input,66,FOLLOW_66_in_ruleRelationalExpression9543); 

            	                    newLeafNode(lv_operator_2_4, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4276:8: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,67,FOLLOW_67_in_ruleRelationalExpression9572); 

            	                    newLeafNode(lv_operator_2_5, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4288:8: lv_operator_2_6= '<'
            	            {
            	            lv_operator_2_6=(Token)match(input,68,FOLLOW_68_in_ruleRelationalExpression9601); 

            	                    newLeafNode(lv_operator_2_6, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4303:2: ( (lv_right_3_0= ruleAddition ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4304:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4304:1: (lv_right_3_0= ruleAddition )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4305:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression9638);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Addition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAddition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4329:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4330:2: (iv_ruleAddition= ruleAddition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4331:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition9676);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition9686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4338:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4341:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4342:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4342:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4343:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition9733);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=69 && LA40_0<=70)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==69) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==70) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:3: ( () otherlv_2= '+' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:3: ( () otherlv_2= '+' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:4: () otherlv_2= '+'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4351:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4352:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleAddition9756); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4362:6: ( () otherlv_4= '-' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4362:6: ( () otherlv_4= '-' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4362:7: () otherlv_4= '-'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4362:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4363:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleAddition9785); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4372:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4373:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4373:1: (lv_right_5_0= ruleMultiplication )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4374:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition9808);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4398:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4399:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4400:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication9846);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication9856); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4407:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4410:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4411:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4411:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4412:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication9903);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=71 && LA42_0<=72)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==71) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==72) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:3: ( () otherlv_2= '*' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:3: ( () otherlv_2= '*' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:4: () otherlv_2= '*'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4420:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4421:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleMultiplication9926); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:6: ( () otherlv_4= '/' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:6: ( () otherlv_4= '/' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:7: () otherlv_4= '/'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4432:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleMultiplication9955); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4441:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4442:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4442:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4443:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication9978);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"PrimaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4467:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4468:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4469:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression10016);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression10026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4476:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token otherlv_6=null;
        EObject this_Expression_1 = null;

        EObject lv_streamVariable_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4479:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt43=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
                {
                int LA43_3 = input.LA(2);

                if ( (LA43_3==19) ) {
                    alt43=4;
                }
                else if ( (LA43_3==EOF||LA43_3==16||LA43_3==22||LA43_3==24||(LA43_3>=61 && LA43_3<=72)) ) {
                    alt43=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression10064); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression10086);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression10097); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4498:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4498:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4498:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4498:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4499:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4504:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4505:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4505:1: (lv_value_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4506:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression10131); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4523:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4523:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4523:7: () ( (otherlv_6= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4523:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4524:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getVariableCallAction_2_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4529:2: ( (otherlv_6= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4530:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4530:1: (otherlv_6= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4531:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression10173); 

                    		newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getVariableVariableDefinitionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:7: () ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4544:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getStreamAccessAction_3_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4549:2: ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4550:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4550:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4551:3: lv_streamVariable_8_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getStreamVariableStreamAccessParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_rulePrimaryExpression10211);
                    lv_streamVariable_8_0=ruleStreamAccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"streamVariable",
                            		lv_streamVariable_8_0, 
                            		"StreamAccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4575:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4576:2: (iv_ruleDataType= ruleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4577:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType10248);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType10258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4584:1: ruleDataType returns [EObject current=null] : (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDataType_0 = null;

        EObject this_ComplexDataType_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4587:28: ( (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4588:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4588:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=73 && LA44_0<=75)) ) {
                alt44=1;
            }
            else if ( (LA44_0==76) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4589:5: this_SimpleDataType_0= ruleSimpleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleDataType_in_ruleDataType10305);
                    this_SimpleDataType_0=ruleSimpleDataType();

                    state._fsp--;

                     
                            current = this_SimpleDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4599:5: this_ComplexDataType_1= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getComplexDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexDataType_in_ruleDataType10332);
                    this_ComplexDataType_1=ruleComplexDataType();

                    state._fsp--;

                     
                            current = this_ComplexDataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleSimpleDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4615:1: entryRuleSimpleDataType returns [EObject current=null] : iv_ruleSimpleDataType= ruleSimpleDataType EOF ;
    public final EObject entryRuleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4616:2: (iv_ruleSimpleDataType= ruleSimpleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4617:2: iv_ruleSimpleDataType= ruleSimpleDataType EOF
            {
             newCompositeNode(grammarAccess.getSimpleDataTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType10367);
            iv_ruleSimpleDataType=ruleSimpleDataType();

            state._fsp--;

             current =iv_ruleSimpleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDataType10377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleDataType"


    // $ANTLR start "ruleSimpleDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4624:1: ruleSimpleDataType returns [EObject current=null] : (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) ;
    public final EObject ruleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDataType_0 = null;

        EObject this_FloatDataType_1 = null;

        EObject this_BooleanDataType_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4627:28: ( (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4628:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4628:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt45=1;
                }
                break;
            case 75:
                {
                alt45=2;
                }
                break;
            case 74:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4629:5: this_IntegerDataType_0= ruleIntegerDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getIntegerDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType10424);
                    this_IntegerDataType_0=ruleIntegerDataType();

                    state._fsp--;

                     
                            current = this_IntegerDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4639:5: this_FloatDataType_1= ruleFloatDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getFloatDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFloatDataType_in_ruleSimpleDataType10451);
                    this_FloatDataType_1=ruleFloatDataType();

                    state._fsp--;

                     
                            current = this_FloatDataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4649:5: this_BooleanDataType_2= ruleBooleanDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getBooleanDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType10478);
                    this_BooleanDataType_2=ruleBooleanDataType();

                    state._fsp--;

                     
                            current = this_BooleanDataType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4665:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4666:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4667:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType10513);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexDataType10523); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4674:1: ruleComplexDataType returns [EObject current=null] : this_StringDataType_0= ruleStringDataType ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject this_StringDataType_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4677:28: (this_StringDataType_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4679:5: this_StringDataType_0= ruleStringDataType
            {
             
                    newCompositeNode(grammarAccess.getComplexDataTypeAccess().getStringDataTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleStringDataType_in_ruleComplexDataType10569);
            this_StringDataType_0=ruleStringDataType();

            state._fsp--;

             
                    current = this_StringDataType_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleIntegerDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4695:1: entryRuleIntegerDataType returns [EObject current=null] : iv_ruleIntegerDataType= ruleIntegerDataType EOF ;
    public final EObject entryRuleIntegerDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4696:2: (iv_ruleIntegerDataType= ruleIntegerDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4697:2: iv_ruleIntegerDataType= ruleIntegerDataType EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType10603);
            iv_ruleIntegerDataType=ruleIntegerDataType();

            state._fsp--;

             current =iv_ruleIntegerDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDataType10613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerDataType"


    // $ANTLR start "ruleIntegerDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4704:1: ruleIntegerDataType returns [EObject current=null] : (otherlv_0= 'int' () ) ;
    public final EObject ruleIntegerDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4707:28: ( (otherlv_0= 'int' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4708:1: (otherlv_0= 'int' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4708:1: (otherlv_0= 'int' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4708:3: otherlv_0= 'int' ()
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleIntegerDataType10650); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerDataTypeAccess().getIntKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4712:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerDataTypeAccess().getIntegerDataTypeAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerDataType"


    // $ANTLR start "entryRuleBooleanDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4726:1: entryRuleBooleanDataType returns [EObject current=null] : iv_ruleBooleanDataType= ruleBooleanDataType EOF ;
    public final EObject entryRuleBooleanDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4727:2: (iv_ruleBooleanDataType= ruleBooleanDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4728:2: iv_ruleBooleanDataType= ruleBooleanDataType EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType10695);
            iv_ruleBooleanDataType=ruleBooleanDataType();

            state._fsp--;

             current =iv_ruleBooleanDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDataType10705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanDataType"


    // $ANTLR start "ruleBooleanDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4735:1: ruleBooleanDataType returns [EObject current=null] : (otherlv_0= 'bool' () ) ;
    public final EObject ruleBooleanDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4738:28: ( (otherlv_0= 'bool' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4739:1: (otherlv_0= 'bool' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4739:1: (otherlv_0= 'bool' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4739:3: otherlv_0= 'bool' ()
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleBooleanDataType10742); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanDataTypeAccess().getBoolKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4743:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4744:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanDataTypeAccess().getBooleanDataTypeAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanDataType"


    // $ANTLR start "entryRuleFloatDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4757:1: entryRuleFloatDataType returns [EObject current=null] : iv_ruleFloatDataType= ruleFloatDataType EOF ;
    public final EObject entryRuleFloatDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4758:2: (iv_ruleFloatDataType= ruleFloatDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4759:2: iv_ruleFloatDataType= ruleFloatDataType EOF
            {
             newCompositeNode(grammarAccess.getFloatDataTypeRule()); 
            pushFollow(FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType10787);
            iv_ruleFloatDataType=ruleFloatDataType();

            state._fsp--;

             current =iv_ruleFloatDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataType10797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatDataType"


    // $ANTLR start "ruleFloatDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4766:1: ruleFloatDataType returns [EObject current=null] : (otherlv_0= 'float' () ) ;
    public final EObject ruleFloatDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4769:28: ( (otherlv_0= 'float' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:1: (otherlv_0= 'float' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:1: (otherlv_0= 'float' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:3: otherlv_0= 'float' ()
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleFloatDataType10834); 

                	newLeafNode(otherlv_0, grammarAccess.getFloatDataTypeAccess().getFloatKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4774:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4775:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatDataTypeAccess().getFloatDataTypeAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatDataType"


    // $ANTLR start "entryRuleStringDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4788:1: entryRuleStringDataType returns [EObject current=null] : iv_ruleStringDataType= ruleStringDataType EOF ;
    public final EObject entryRuleStringDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4789:2: (iv_ruleStringDataType= ruleStringDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4790:2: iv_ruleStringDataType= ruleStringDataType EOF
            {
             newCompositeNode(grammarAccess.getStringDataTypeRule()); 
            pushFollow(FOLLOW_ruleStringDataType_in_entryRuleStringDataType10879);
            iv_ruleStringDataType=ruleStringDataType();

            state._fsp--;

             current =iv_ruleStringDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDataType10889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringDataType"


    // $ANTLR start "ruleStringDataType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4797:1: ruleStringDataType returns [EObject current=null] : (otherlv_0= 'string' () ) ;
    public final EObject ruleStringDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4800:28: ( (otherlv_0= 'string' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4801:1: (otherlv_0= 'string' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4801:1: (otherlv_0= 'string' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4801:3: otherlv_0= 'string' ()
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleStringDataType10926); 

                	newLeafNode(otherlv_0, grammarAccess.getStringDataTypeAccess().getStringKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4805:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4806:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringDataTypeAccess().getStringDataTypeAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringDataType"


    // $ANTLR start "ruleSparqlQueryType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4819:1: ruleSparqlQueryType returns [Enumerator current=null] : ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) ) ;
    public final Enumerator ruleSparqlQueryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4821:28: ( ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4822:1: ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4822:1: ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt46=1;
                }
                break;
            case 78:
                {
                alt46=2;
                }
                break;
            case 79:
                {
                alt46=3;
                }
                break;
            case 80:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4822:2: (enumLiteral_0= 'SELECT' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4822:2: (enumLiteral_0= 'SELECT' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4822:4: enumLiteral_0= 'SELECT'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleSparqlQueryType10985); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getSELECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSparqlQueryTypeAccess().getSELECTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4828:6: (enumLiteral_1= 'CONSTRUCT' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4828:6: (enumLiteral_1= 'CONSTRUCT' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4828:8: enumLiteral_1= 'CONSTRUCT'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleSparqlQueryType11002); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getCONSTRUCTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSparqlQueryTypeAccess().getCONSTRUCTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4834:6: (enumLiteral_2= 'ASK' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4834:6: (enumLiteral_2= 'ASK' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4834:8: enumLiteral_2= 'ASK'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleSparqlQueryType11019); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getASKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSparqlQueryTypeAccess().getASKEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4840:6: (enumLiteral_3= 'DESCRIBE' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4840:6: (enumLiteral_3= 'DESCRIBE' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4840:8: enumLiteral_3= 'DESCRIBE'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleSparqlQueryType11036); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getDESCRIBEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSparqlQueryTypeAccess().getDESCRIBEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSparqlQueryType"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\4\5\uffff\1\4\4\uffff";
    static final String DFA3_maxS =
        "\1\114\5\uffff\1\23\4\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\11\1\7\1\10\1\6";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\6\7\uffff\1\1\2\uffff\1\2\51\uffff\1\7\1\3\1\4\15\uffff\4"+
            "\5",
            "",
            "",
            "",
            "",
            "",
            "\1\10\13\uffff\2\12\1\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "189:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_VariableDefinition_4= ruleVariableDefinition | this_StreamStatement_5= ruleStreamStatement | this_StreamDefinition_6= ruleStreamDefinition | this_StreamAccess_7= ruleStreamAccess | this_NoReturnTypeOperator_8= ruleNoReturnTypeOperator )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageDeclaration230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration247 = new BitSet(new long[]{0x0E0000000000D010L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePackageDeclaration268 = new BitSet(new long[]{0x0E0000000000D010L,0x0000000000001E00L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModelElement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModelElement401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDeclaration_in_ruleModelElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_ruleModelElement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleModelElement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_ruleModelElement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_ruleModelElement536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleModelElement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoReturnTypeOperator_in_ruleModelElement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamStatement740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamStatement785 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleStreamStatement798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamStatement818 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleStreamStatement832 = new BitSet(new long[]{0x01FE20027E100000L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamStatement865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamAccess913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess958 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStreamAccess970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDefinition1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1100 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamDefinition1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinOperator1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJoinOperator1200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJoinOperator1212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1233 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1266 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1300 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleJoinOperator1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamOperatorParameter1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1405 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStreamOperatorParameter1418 = new BitSet(new long[]{0x0000184000000000L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1439 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStreamOperatorParameter1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementJoinOperator1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleElementJoinOperator1536 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleElementJoinOperator1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1596 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1631 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1701 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleElementJoinOperator1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterOperator1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFilterOperator1796 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFilterOperator1808 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator1829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator1842 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator1863 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator1877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator1898 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFilterOperator1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitOperator1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSplitOperator1993 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSplitOperator2005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2026 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSplitOperator2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchOperator2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMatchOperator2121 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatchOperator2133 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2154 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2166 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2187 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2220 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2254 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleMatchOperator2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_entryRuleInputOperator2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperator2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInputOperator2351 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInputOperator2363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator2380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator2415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator2451 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2468 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleInputOperator2485 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInputOperator2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeOperator2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleReturnTypeOperator2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractionOperator_in_ruleReturnTypeOperator2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleReturnTypeOperator3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleReturnTypeOperator3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_entryRuleTagOperator3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagOperator3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTagOperator3199 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTagOperator3211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator3232 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleTagOperator3245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator3266 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleTagOperator3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryTagOperator_in_entryRuleQueryTagOperator3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryTagOperator3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleQueryTagOperator3365 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleSparqlQueryType_in_ruleQueryTagOperator3386 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSparqlQuery_in_ruleQueryTagOperator3407 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQueryTagOperator3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQuery_in_entryRuleSparqlQuery3455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlQuery3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQueryVariable_in_ruleSparqlQuery3511 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSparqlQuery3523 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSparqlQuery3535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSparqlQuery3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQueryVariable_in_entryRuleSparqlQueryVariable3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlQueryVariable3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSparqlQueryVariable3630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable3647 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleSparqlQueryVariable3665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable3682 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator3725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagOperator3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleUnTagOperator3772 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUnTagOperator3784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator3805 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator3818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator3839 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator3853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator3874 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUnTagOperator3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement3922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagElement3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUnTagElement3977 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUnTagElement3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleUnTagElement4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_entryRuleTagElement4046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagElement4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_ruleTagElement4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagClassElement4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagClassElement4248 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTagClassElement4260 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTagClassElement4272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagClassElement4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4384 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTagObjectPropertyElement4396 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTagObjectPropertyElement4408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement4520 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTagDataTypePropertyElement4532 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTagDataTypePropertyElement4544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator4600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrierOperator4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_ruleBarrierOperator4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator4719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindowOperator4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleWindowOperator4773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleWindowOperator4803 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_39_in_ruleWindowOperator4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWindowOperator4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleWindowOperator4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleWindowOperator4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWindowOperator4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkerOperator5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMarkerOperator5053 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMarkerOperator5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLOperator5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSWRLOperator5157 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLOperator5169 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5190 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5223 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5257 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLOperator5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLRule5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSWRLRule5354 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLRule5366 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5387 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLRule5399 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_ruleSWRLRule5420 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLRule5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule5468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntecedentRule5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAntecedentRule5515 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAntecedentRule5527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule5548 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleAntecedentRule5561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule5582 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAntecedentRule5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule5632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsequentRule5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleConsequentRule5679 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConsequentRule5691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule5712 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleConsequentRule5725 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule5746 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleConsequentRule5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule5796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule5851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRule5863 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRule5875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule5896 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleRule5909 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRule5921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule5942 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleRule5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator5992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperator6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOCLOperator6039 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOCLOperator6051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOCLOperator6068 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOCLOperator6085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6106 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOCLOperator6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_entryRuleCountOperator6154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountOperator6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCountOperator6201 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCountOperator6213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleCountOperator6234 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCountOperator6246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6267 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCountOperator6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardDeviationOperator6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStandardDeviationOperator6362 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStandardDeviationOperator6374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStandardDeviationOperator6407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6428 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStandardDeviationOperator6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator6476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageOperator6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAverageOperator6523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageOperator6535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAverageOperator6556 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAverageOperator6568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator6589 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAverageOperator6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAdditionOperator6684 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAdditionOperator6696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAdditionOperator6717 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAdditionOperator6729 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAdditionOperator6747 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAdditionOperator6779 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAdditionOperator6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractionOperator_in_entryRuleSubtractionOperator6828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtractionOperator6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSubtractionOperator6875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubtractionOperator6887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator6908 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubtractionOperator6920 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSubtractionOperator6938 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator6970 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSubtractionOperator6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMultiplicationOperator7066 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicationOperator7078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7099 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultiplicationOperator7111 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMultiplicationOperator7129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7161 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicationOperator7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDivisionOperator7257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDivisionOperator7269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDivisionOperator7302 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDivisionOperator7320 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7352 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDivisionOperator7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator7401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperator7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOutputOperator7448 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOutputOperator7460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator7481 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator7510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator7545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator7581 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOutputOperator7615 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOutputOperator7632 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOutputOperator7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition7680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration7826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleVariableDeclaration7882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration7899 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition7952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberVariableDefinition7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition8008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberVariableDefinition8025 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNumberVariableDefinition8042 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition8059 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNumberVariableDefinition8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition8112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariableDefinition8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition8168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariableDefinition8185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringVariableDefinition8202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringVariableDefinition8219 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringVariableDefinition8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition8272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariableDefinition8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition8328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition8345 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanVariableDefinition8362 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition8379 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBooleanVariableDefinition8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration8432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDeclaration8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleStructureDeclaration8479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureDeclaration8496 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructureDeclaration8513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration8534 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_14_in_ruleStructureDeclaration8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration8583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDeclaration8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleStreamDeclaration8630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDeclaration8647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStreamDeclaration8664 = new BitSet(new long[]{0x1000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleStreamElement_in_ruleStreamDeclaration8685 = new BitSet(new long[]{0x1000000000004000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_14_in_ruleStreamDeclaration8698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_entryRuleStreamElement8734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamElement8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_ruleStreamElement8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStreamElement8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_entryRuleStructureElements8853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureElements8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStructureElements8900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureElements8920 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureElements8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression8968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr9115 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOr9142 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr9176 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd9224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd9271 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAnd9298 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd9332 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression9370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression9427 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_63_in_ruleRelationalExpression9456 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_64_in_ruleRelationalExpression9485 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_65_in_ruleRelationalExpression9514 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_66_in_ruleRelationalExpression9543 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_67_in_ruleRelationalExpression9572 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_68_in_ruleRelationalExpression9601 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression9638 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition9676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition9733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleAddition9756 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_70_in_ruleAddition9785 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition9808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication9846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication9903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleMultiplication9926 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_72_in_ruleMultiplication9955 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication9978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression10016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression10064 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression10086 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression10173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rulePrimaryExpression10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType10248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleDataType10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_ruleDataType10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType10367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDataType10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_ruleSimpleDataType10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType10513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleComplexDataType10569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType10603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDataType10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleIntegerDataType10650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType10695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDataType10705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBooleanDataType10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType10787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataType10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleFloatDataType10834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_entryRuleStringDataType10879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDataType10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleStringDataType10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleSparqlQueryType10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSparqlQueryType11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleSparqlQueryType11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleSparqlQueryType11036 = new BitSet(new long[]{0x0000000000000002L});

}