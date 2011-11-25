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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_BOOLVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "','", "'='", "';'", "'.'", "'join'", "'('", "')'", "'['", "']'", "'ejoin'", "'filter'", "'split'", "'match'", "'sdif'", "'diff'", "'in'", "'tag'", "'WHERE'", "'?'", "'untag'", "'is'", "'class'", "'objectproperty'", "'datatype'", "'last'", "'min'", "'hrs'", "'sec'", "'elements'", "'now'", "'marker'", "'swrl'", "'Implies'", "'Antecedent'", "'Consequent'", "'ocl'", "'count'", "'std'", "'avg'", "'add'", "'sub'", "'mult'", "'div'", "'out'", "'structure'", "'stream'", "'use'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'int'", "'bool'", "'float'", "'string'", "'://'", "'#'", "'SELECT'", "'CONSTRUCT'", "'ASK'", "'DESCRIBE'", "'http'", "'ftp'", "'file'"
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
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
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

                if ( (LA2_0==RULE_ID||LA2_0==12||LA2_0==15||(LA2_0>=59 && LA2_0<=61)||(LA2_0>=75 && LA2_0<=78)) ) {
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:338:1: ruleStreamStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleStreamStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_operator_4_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:341:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) ) otherlv_6= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) ) otherlv_6= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) ) otherlv_6= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) ) otherlv_6= ';'
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
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:376:1: ( ( (lv_operator_4_0= ruleReturnTypeOperator ) ) | ( (lv_expression_5_0= ruleExpression ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20||(LA5_0>=25 && LA5_0<=32)||LA5_0==35||LA5_0==47||(LA5_0>=51 && LA5_0<=58)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==RULE_NUMBER||LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:376:2: ( (lv_operator_4_0= ruleReturnTypeOperator ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:376:2: ( (lv_operator_4_0= ruleReturnTypeOperator ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:377:1: (lv_operator_4_0= ruleReturnTypeOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:377:1: (lv_operator_4_0= ruleReturnTypeOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:378:3: lv_operator_4_0= ruleReturnTypeOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamStatementAccess().getOperatorReturnTypeOperatorParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement854);
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


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:395:6: ( (lv_expression_5_0= ruleExpression ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:395:6: ( (lv_expression_5_0= ruleExpression ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:396:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:396:1: (lv_expression_5_0= ruleExpression )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:397:3: lv_expression_5_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamStatementAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleStreamStatement881);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStreamStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleStreamStatement894); 

                	newLeafNode(otherlv_6, grammarAccess.getStreamStatementAccess().getSemicolonKeyword_4());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:427:1: entryRuleStreamAccess returns [EObject current=null] : iv_ruleStreamAccess= ruleStreamAccess EOF ;
    public final EObject entryRuleStreamAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamAccess = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:428:2: (iv_ruleStreamAccess= ruleStreamAccess EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:429:2: iv_ruleStreamAccess= ruleStreamAccess EOF
            {
             newCompositeNode(grammarAccess.getStreamAccessRule()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess932);
            iv_ruleStreamAccess=ruleStreamAccess();

            state._fsp--;

             current =iv_ruleStreamAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamAccess942); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:436:1: ruleStreamAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStreamAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:439:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:440:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:440:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:440:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:440:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:441:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:441:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:442:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess987); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStreamAccess999); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamAccessAccess().getFullStopKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:457:1: ( (otherlv_2= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:458:1: (otherlv_2= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:458:1: (otherlv_2= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:459:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess1019); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:480:1: entryRuleStreamDefinition returns [EObject current=null] : iv_ruleStreamDefinition= ruleStreamDefinition EOF ;
    public final EObject entryRuleStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:481:2: (iv_ruleStreamDefinition= ruleStreamDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:482:2: iv_ruleStreamDefinition= ruleStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1057);
            iv_ruleStreamDefinition=ruleStreamDefinition();

            state._fsp--;

             current =iv_ruleStreamDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDefinition1067); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:489:1: ruleStreamDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:492:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:493:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:493:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:493:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:493:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:494:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:494:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:495:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDefinitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1112); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:506:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:507:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:507:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:508:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1129); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStreamDefinition1146); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:536:1: entryRuleJoinOperator returns [EObject current=null] : iv_ruleJoinOperator= ruleJoinOperator EOF ;
    public final EObject entryRuleJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:537:2: (iv_ruleJoinOperator= ruleJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:538:2: iv_ruleJoinOperator= ruleJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1182);
            iv_ruleJoinOperator=ruleJoinOperator();

            state._fsp--;

             current =iv_ruleJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinOperator1192); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:545:1: ruleJoinOperator returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:548:28: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:549:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:549:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:549:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJoinOperator1229); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinOperatorAccess().getJoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinOperator1241); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:557:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:558:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:558:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:559:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1262);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1274); 

                	newLeafNode(otherlv_3, grammarAccess.getJoinOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:579:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:580:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:580:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:581:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1295);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:597:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:597:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1308); 

            	        	newLeafNode(otherlv_5, grammarAccess.getJoinOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:601:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:602:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:602:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:603:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1329);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleJoinOperator1343); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:631:1: entryRuleStreamOperatorParameter returns [EObject current=null] : iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF ;
    public final EObject entryRuleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:632:2: (iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:633:2: iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getStreamOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1379);
            iv_ruleStreamOperatorParameter=ruleStreamOperatorParameter();

            state._fsp--;

             current =iv_ruleStreamOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamOperatorParameter1389); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:1: ruleStreamOperatorParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_barrier_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:643:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:644:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:644:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:644:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:644:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:645:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:645:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:646:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamOperatorParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1434); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:657:2: (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:657:4: otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStreamOperatorParameter1447); 

                        	newLeafNode(otherlv_1, grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:661:1: ( (lv_barrier_2_0= ruleBarrierOperator ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:662:1: (lv_barrier_2_0= ruleBarrierOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:662:1: (lv_barrier_2_0= ruleBarrierOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:663:3: lv_barrier_2_0= ruleBarrierOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1468);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStreamOperatorParameter1480); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:691:1: entryRuleElementJoinOperator returns [EObject current=null] : iv_ruleElementJoinOperator= ruleElementJoinOperator EOF ;
    public final EObject entryRuleElementJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:692:2: (iv_ruleElementJoinOperator= ruleElementJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:2: iv_ruleElementJoinOperator= ruleElementJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getElementJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1518);
            iv_ruleElementJoinOperator=ruleElementJoinOperator();

            state._fsp--;

             current =iv_ruleElementJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementJoinOperator1528); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:700:1: ruleElementJoinOperator returns [EObject current=null] : (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:703:28: ( (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:704:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:704:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:704:3: otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleElementJoinOperator1565); 

                	newLeafNode(otherlv_0, grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleElementJoinOperator1577); 

                	newLeafNode(otherlv_1, grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:712:1: ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==19) ) {
                    alt8=1;
                }
                else if ( (LA8_1==16) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:712:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:712:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:713:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:713:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:714:3: lv_elementParameters_2_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1599);
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:731:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:731:6: ( (otherlv_3= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:732:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:732:1: (otherlv_3= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:733:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1625); 

                    		newLeafNode(otherlv_3, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableDefinitionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:744:3: (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID) ) {
                        int LA9_2 = input.LA(3);

                        if ( (LA9_2==19) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:744:5: otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1639); 

            	        	newLeafNode(otherlv_4, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:748:1: ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:749:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:749:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:750:3: lv_elementParameters_5_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1660);
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
            	    break loop9;
                }
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:766:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_2 = input.LA(3);

                        if ( (LA10_2==16) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:766:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1675); 

            	        	newLeafNode(otherlv_6, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:770:1: ( (otherlv_7= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:771:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:771:1: (otherlv_7= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:772:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1695); 

            	    		newLeafNode(otherlv_7, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableDefinitionCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1709); 

                	newLeafNode(otherlv_8, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:787:1: ( (lv_parameter_9_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:788:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:788:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:789:3: lv_parameter_9_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1730);
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

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleElementJoinOperator1742); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:817:1: entryRuleFilterOperator returns [EObject current=null] : iv_ruleFilterOperator= ruleFilterOperator EOF ;
    public final EObject entryRuleFilterOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:818:2: (iv_ruleFilterOperator= ruleFilterOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:819:2: iv_ruleFilterOperator= ruleFilterOperator EOF
            {
             newCompositeNode(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1778);
            iv_ruleFilterOperator=ruleFilterOperator();

            state._fsp--;

             current =iv_ruleFilterOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterOperator1788); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:826:1: ruleFilterOperator returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:829:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:830:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:830:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:830:3: otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFilterOperator1825); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterOperatorAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFilterOperator1837); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:838:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:839:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:839:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:840:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator1858);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:856:2: (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_NUMBER||LA11_1==21) ) {
                        alt11=1;
                    }
                    else if ( (LA11_1==RULE_ID) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==16||LA11_3==19||(LA11_3>=63 && LA11_3<=74)) ) {
                            alt11=1;
                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:856:4: otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator1871); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFilterOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:860:1: ( (lv_expression_4_0= ruleExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:861:1: (lv_expression_4_0= ruleExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:861:1: (lv_expression_4_0= ruleExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:862:3: lv_expression_4_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator1892);
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator1906); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:882:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:883:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:883:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:884:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator1927);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFilterOperator1939); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:912:1: entryRuleSplitOperator returns [EObject current=null] : iv_ruleSplitOperator= ruleSplitOperator EOF ;
    public final EObject entryRuleSplitOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:913:2: (iv_ruleSplitOperator= ruleSplitOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:914:2: iv_ruleSplitOperator= ruleSplitOperator EOF
            {
             newCompositeNode(grammarAccess.getSplitOperatorRule()); 
            pushFollow(FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator1975);
            iv_ruleSplitOperator=ruleSplitOperator();

            state._fsp--;

             current =iv_ruleSplitOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitOperator1985); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:921:1: ruleSplitOperator returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleSplitOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:924:28: ( (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:925:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:925:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:925:3: otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSplitOperator2022); 

                	newLeafNode(otherlv_0, grammarAccess.getSplitOperatorAccess().getSplitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSplitOperator2034); 

                	newLeafNode(otherlv_1, grammarAccess.getSplitOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:933:1: ( (lv_parameter_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:934:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:934:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:935:3: lv_parameter_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSplitOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2055);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSplitOperator2067); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:1: entryRuleMatchOperator returns [EObject current=null] : iv_ruleMatchOperator= ruleMatchOperator EOF ;
    public final EObject entryRuleMatchOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:964:2: (iv_ruleMatchOperator= ruleMatchOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:965:2: iv_ruleMatchOperator= ruleMatchOperator EOF
            {
             newCompositeNode(grammarAccess.getMatchOperatorRule()); 
            pushFollow(FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2103);
            iv_ruleMatchOperator=ruleMatchOperator();

            state._fsp--;

             current =iv_ruleMatchOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchOperator2113); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:972:1: ruleMatchOperator returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:975:28: ( (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:976:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:976:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:976:3: otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMatchOperator2150); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchOperatorAccess().getMatchKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMatchOperator2162); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:984:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:985:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:985:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:986:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2183);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2195); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1006:1: ( (lv_calculation_4_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1007:1: (lv_calculation_4_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1007:1: (lv_calculation_4_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1008:3: lv_calculation_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getCalculationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2216);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2228); 

                	newLeafNode(otherlv_5, grammarAccess.getMatchOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1028:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1029:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1029:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1030:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2249);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1046:2: (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1046:4: otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2262); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMatchOperatorAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1050:1: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1051:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1051:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1052:3: lv_stream_8_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2283);
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
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMatchOperator2297); 

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


    // $ANTLR start "entryRuleSymmetricDifferenceOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1080:1: entryRuleSymmetricDifferenceOperator returns [EObject current=null] : iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF ;
    public final EObject entryRuleSymmetricDifferenceOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymmetricDifferenceOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1081:2: (iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1082:2: iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF
            {
             newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorRule()); 
            pushFollow(FOLLOW_ruleSymmetricDifferenceOperator_in_entryRuleSymmetricDifferenceOperator2333);
            iv_ruleSymmetricDifferenceOperator=ruleSymmetricDifferenceOperator();

            state._fsp--;

             current =iv_ruleSymmetricDifferenceOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymmetricDifferenceOperator2343); 

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
    // $ANTLR end "entryRuleSymmetricDifferenceOperator"


    // $ANTLR start "ruleSymmetricDifferenceOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1089:1: ruleSymmetricDifferenceOperator returns [EObject current=null] : (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleSymmetricDifferenceOperator() throws RecognitionException {
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1092:28: ( (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1093:1: (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1093:1: (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1093:3: otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSymmetricDifferenceOperator2380); 

                	newLeafNode(otherlv_0, grammarAccess.getSymmetricDifferenceOperatorAccess().getSdifKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSymmetricDifferenceOperator2392); 

                	newLeafNode(otherlv_1, grammarAccess.getSymmetricDifferenceOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1101:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1102:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1102:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1103:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2413);
            lv_parameters_2_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSymmetricDifferenceOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSymmetricDifferenceOperator2425); 

                	newLeafNode(otherlv_3, grammarAccess.getSymmetricDifferenceOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1123:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1124:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1124:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1125:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2446);
            lv_parameters_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSymmetricDifferenceOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1141:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1141:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSymmetricDifferenceOperator2459); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSymmetricDifferenceOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1145:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1146:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1146:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1147:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2480);
            	    lv_parameters_6_0=ruleStreamOperatorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSymmetricDifferenceOperatorRule());
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
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSymmetricDifferenceOperator2494); 

                	newLeafNode(otherlv_7, grammarAccess.getSymmetricDifferenceOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleSymmetricDifferenceOperator"


    // $ANTLR start "entryRuleDifferenceOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1175:1: entryRuleDifferenceOperator returns [EObject current=null] : iv_ruleDifferenceOperator= ruleDifferenceOperator EOF ;
    public final EObject entryRuleDifferenceOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferenceOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1176:2: (iv_ruleDifferenceOperator= ruleDifferenceOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1177:2: iv_ruleDifferenceOperator= ruleDifferenceOperator EOF
            {
             newCompositeNode(grammarAccess.getDifferenceOperatorRule()); 
            pushFollow(FOLLOW_ruleDifferenceOperator_in_entryRuleDifferenceOperator2530);
            iv_ruleDifferenceOperator=ruleDifferenceOperator();

            state._fsp--;

             current =iv_ruleDifferenceOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDifferenceOperator2540); 

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
    // $ANTLR end "entryRuleDifferenceOperator"


    // $ANTLR start "ruleDifferenceOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1184:1: ruleDifferenceOperator returns [EObject current=null] : (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleDifferenceOperator() throws RecognitionException {
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1187:28: ( (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1188:1: (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1188:1: (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1188:3: otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDifferenceOperator2577); 

                	newLeafNode(otherlv_0, grammarAccess.getDifferenceOperatorAccess().getDiffKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDifferenceOperator2589); 

                	newLeafNode(otherlv_1, grammarAccess.getDifferenceOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1196:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1197:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1197:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1198:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2610);
            lv_parameters_2_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDifferenceOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDifferenceOperator2622); 

                	newLeafNode(otherlv_3, grammarAccess.getDifferenceOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1218:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1219:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1219:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1220:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2643);
            lv_parameters_4_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDifferenceOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_4_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1236:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1236:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDifferenceOperator2656); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDifferenceOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1240:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1241:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1241:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1242:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2677);
            	    lv_parameters_6_0=ruleStreamOperatorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDifferenceOperatorRule());
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
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleDifferenceOperator2691); 

                	newLeafNode(otherlv_7, grammarAccess.getDifferenceOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleDifferenceOperator"


    // $ANTLR start "entryRuleInputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1270:1: entryRuleInputOperator returns [EObject current=null] : iv_ruleInputOperator= ruleInputOperator EOF ;
    public final EObject entryRuleInputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1271:2: (iv_ruleInputOperator= ruleInputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1272:2: iv_ruleInputOperator= ruleInputOperator EOF
            {
             newCompositeNode(grammarAccess.getInputOperatorRule()); 
            pushFollow(FOLLOW_ruleInputOperator_in_entryRuleInputOperator2727);
            iv_ruleInputOperator=ruleInputOperator();

            state._fsp--;

             current =iv_ruleInputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperator2737); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1279:1: ruleInputOperator returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) ) (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleInputOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_port_6_0=null;
        Token otherlv_7=null;
        Token lv_socket_8_0=null;
        Token otherlv_9=null;
        EObject lv_iri_2_0 = null;

        EObject lv_iri_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1282:28: ( (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) ) (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1283:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) ) (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1283:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) ) (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1283:3: otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) ) (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInputOperator2774); 

                	newLeafNode(otherlv_0, grammarAccess.getInputOperatorAccess().getInKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInputOperator2786); 

                	newLeafNode(otherlv_1, grammarAccess.getInputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1291:1: ( (lv_iri_2_0= ruleInternationalizedResourceIdentifier ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1292:1: (lv_iri_2_0= ruleInternationalizedResourceIdentifier )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1292:1: (lv_iri_2_0= ruleInternationalizedResourceIdentifier )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1293:3: lv_iri_2_0= ruleInternationalizedResourceIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getInputOperatorAccess().getIriInternationalizedResourceIdentifierParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleInternationalizedResourceIdentifier_in_ruleInputOperator2807);
            lv_iri_2_0=ruleInternationalizedResourceIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"iri",
                    		lv_iri_2_0, 
                    		"InternationalizedResourceIdentifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1309:2: (otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=85 && LA15_1<=87)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1309:4: otherlv_3= ',' ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2820); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInputOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1313:1: ( (lv_iri_4_0= ruleInternationalizedResourceIdentifier ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1314:1: (lv_iri_4_0= ruleInternationalizedResourceIdentifier )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1314:1: (lv_iri_4_0= ruleInternationalizedResourceIdentifier )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1315:3: lv_iri_4_0= ruleInternationalizedResourceIdentifier
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInputOperatorAccess().getIriInternationalizedResourceIdentifierParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInternationalizedResourceIdentifier_in_ruleInputOperator2841);
            	    lv_iri_4_0=ruleInternationalizedResourceIdentifier();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInputOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"iri",
            	            		lv_iri_4_0, 
            	            		"InternationalizedResourceIdentifier");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2855); 

                	newLeafNode(otherlv_5, grammarAccess.getInputOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1335:1: ( (lv_port_6_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1336:1: (lv_port_6_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1336:1: (lv_port_6_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1337:3: lv_port_6_0= RULE_NUMBER
            {
            lv_port_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleInputOperator2872); 

            			newLeafNode(lv_port_6_0, grammarAccess.getInputOperatorAccess().getPortNUMBERTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_6_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator2889); 

                	newLeafNode(otherlv_7, grammarAccess.getInputOperatorAccess().getCommaKeyword_6());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1357:1: ( (lv_socket_8_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1358:1: (lv_socket_8_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1358:1: (lv_socket_8_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1359:3: lv_socket_8_0= RULE_STRING
            {
            lv_socket_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator2906); 

            			newLeafNode(lv_socket_8_0, grammarAccess.getInputOperatorAccess().getSocketSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"socket",
                    		lv_socket_8_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleInputOperator2923); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1387:1: entryRuleReturnTypeOperator returns [EObject current=null] : iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF ;
    public final EObject entryRuleReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1388:2: (iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1389:2: iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator2959);
            iv_ruleReturnTypeOperator=ruleReturnTypeOperator();

            state._fsp--;

             current =iv_ruleReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeOperator2969); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1396:1: ruleReturnTypeOperator returns [EObject current=null] : (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_OCLOperator_13= ruleOCLOperator | this_SWRLOperator_14= ruleSWRLOperator | this_AdditionOperator_15= ruleAdditionOperator | this_SubtractionOperator_16= ruleSubtractionOperator | this_MultiplicationOperator_17= ruleMultiplicationOperator | this_DivisionOperator_18= ruleDivisionOperator ) ;
    public final EObject ruleReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_InputOperator_0 = null;

        EObject this_JoinOperator_1 = null;

        EObject this_SymmetricDifferenceOperator_2 = null;

        EObject this_DifferenceOperator_3 = null;

        EObject this_TagOperator_4 = null;

        EObject this_UnTagOperator_5 = null;

        EObject this_FilterOperator_6 = null;

        EObject this_SplitOperator_7 = null;

        EObject this_CountOperator_8 = null;

        EObject this_StandardDeviationOperator_9 = null;

        EObject this_AverageOperator_10 = null;

        EObject this_ElementJoinOperator_11 = null;

        EObject this_MatchOperator_12 = null;

        EObject this_OCLOperator_13 = null;

        EObject this_SWRLOperator_14 = null;

        EObject this_AdditionOperator_15 = null;

        EObject this_SubtractionOperator_16 = null;

        EObject this_MultiplicationOperator_17 = null;

        EObject this_DivisionOperator_18 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1399:28: ( (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_OCLOperator_13= ruleOCLOperator | this_SWRLOperator_14= ruleSWRLOperator | this_AdditionOperator_15= ruleAdditionOperator | this_SubtractionOperator_16= ruleSubtractionOperator | this_MultiplicationOperator_17= ruleMultiplicationOperator | this_DivisionOperator_18= ruleDivisionOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1400:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_OCLOperator_13= ruleOCLOperator | this_SWRLOperator_14= ruleSWRLOperator | this_AdditionOperator_15= ruleAdditionOperator | this_SubtractionOperator_16= ruleSubtractionOperator | this_MultiplicationOperator_17= ruleMultiplicationOperator | this_DivisionOperator_18= ruleDivisionOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1400:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_OCLOperator_13= ruleOCLOperator | this_SWRLOperator_14= ruleSWRLOperator | this_AdditionOperator_15= ruleAdditionOperator | this_SubtractionOperator_16= ruleSubtractionOperator | this_MultiplicationOperator_17= ruleMultiplicationOperator | this_DivisionOperator_18= ruleDivisionOperator )
            int alt16=19;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 20:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            case 30:
                {
                alt16=4;
                }
                break;
            case 32:
                {
                alt16=5;
                }
                break;
            case 35:
                {
                alt16=6;
                }
                break;
            case 26:
                {
                alt16=7;
                }
                break;
            case 27:
                {
                alt16=8;
                }
                break;
            case 52:
                {
                alt16=9;
                }
                break;
            case 53:
                {
                alt16=10;
                }
                break;
            case 54:
                {
                alt16=11;
                }
                break;
            case 25:
                {
                alt16=12;
                }
                break;
            case 28:
                {
                alt16=13;
                }
                break;
            case 51:
                {
                alt16=14;
                }
                break;
            case 47:
                {
                alt16=15;
                }
                break;
            case 55:
                {
                alt16=16;
                }
                break;
            case 56:
                {
                alt16=17;
                }
                break;
            case 57:
                {
                alt16=18;
                }
                break;
            case 58:
                {
                alt16=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1401:5: this_InputOperator_0= ruleInputOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getInputOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator3016);
                    this_InputOperator_0=ruleInputOperator();

                    state._fsp--;

                     
                            current = this_InputOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1411:5: this_JoinOperator_1= ruleJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getJoinOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator3043);
                    this_JoinOperator_1=ruleJoinOperator();

                    state._fsp--;

                     
                            current = this_JoinOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1421:5: this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSymmetricDifferenceOperatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSymmetricDifferenceOperator_in_ruleReturnTypeOperator3070);
                    this_SymmetricDifferenceOperator_2=ruleSymmetricDifferenceOperator();

                    state._fsp--;

                     
                            current = this_SymmetricDifferenceOperator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1431:5: this_DifferenceOperator_3= ruleDifferenceOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getDifferenceOperatorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDifferenceOperator_in_ruleReturnTypeOperator3097);
                    this_DifferenceOperator_3=ruleDifferenceOperator();

                    state._fsp--;

                     
                            current = this_DifferenceOperator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1441:5: this_TagOperator_4= ruleTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getTagOperatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator3124);
                    this_TagOperator_4=ruleTagOperator();

                    state._fsp--;

                     
                            current = this_TagOperator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1451:5: this_UnTagOperator_5= ruleUnTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getUnTagOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator3151);
                    this_UnTagOperator_5=ruleUnTagOperator();

                    state._fsp--;

                     
                            current = this_UnTagOperator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1461:5: this_FilterOperator_6= ruleFilterOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getFilterOperatorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator3178);
                    this_FilterOperator_6=ruleFilterOperator();

                    state._fsp--;

                     
                            current = this_FilterOperator_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1471:5: this_SplitOperator_7= ruleSplitOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSplitOperatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator3205);
                    this_SplitOperator_7=ruleSplitOperator();

                    state._fsp--;

                     
                            current = this_SplitOperator_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1481:5: this_CountOperator_8= ruleCountOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getCountOperatorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator3232);
                    this_CountOperator_8=ruleCountOperator();

                    state._fsp--;

                     
                            current = this_CountOperator_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1491:5: this_StandardDeviationOperator_9= ruleStandardDeviationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getStandardDeviationOperatorParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator3259);
                    this_StandardDeviationOperator_9=ruleStandardDeviationOperator();

                    state._fsp--;

                     
                            current = this_StandardDeviationOperator_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1501:5: this_AverageOperator_10= ruleAverageOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getAverageOperatorParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator3286);
                    this_AverageOperator_10=ruleAverageOperator();

                    state._fsp--;

                     
                            current = this_AverageOperator_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1511:5: this_ElementJoinOperator_11= ruleElementJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getElementJoinOperatorParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator3313);
                    this_ElementJoinOperator_11=ruleElementJoinOperator();

                    state._fsp--;

                     
                            current = this_ElementJoinOperator_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1521:5: this_MatchOperator_12= ruleMatchOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMatchOperatorParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator3340);
                    this_MatchOperator_12=ruleMatchOperator();

                    state._fsp--;

                     
                            current = this_MatchOperator_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1531:5: this_OCLOperator_13= ruleOCLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getOCLOperatorParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator3367);
                    this_OCLOperator_13=ruleOCLOperator();

                    state._fsp--;

                     
                            current = this_OCLOperator_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1541:5: this_SWRLOperator_14= ruleSWRLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSWRLOperatorParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator3394);
                    this_SWRLOperator_14=ruleSWRLOperator();

                    state._fsp--;

                     
                            current = this_SWRLOperator_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:5: this_AdditionOperator_15= ruleAdditionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getAdditionOperatorParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleReturnTypeOperator3421);
                    this_AdditionOperator_15=ruleAdditionOperator();

                    state._fsp--;

                     
                            current = this_AdditionOperator_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1561:5: this_SubtractionOperator_16= ruleSubtractionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSubtractionOperatorParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleSubtractionOperator_in_ruleReturnTypeOperator3448);
                    this_SubtractionOperator_16=ruleSubtractionOperator();

                    state._fsp--;

                     
                            current = this_SubtractionOperator_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1571:5: this_MultiplicationOperator_17= ruleMultiplicationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMultiplicationOperatorParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleReturnTypeOperator3475);
                    this_MultiplicationOperator_17=ruleMultiplicationOperator();

                    state._fsp--;

                     
                            current = this_MultiplicationOperator_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1581:5: this_DivisionOperator_18= ruleDivisionOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getDivisionOperatorParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleDivisionOperator_in_ruleReturnTypeOperator3502);
                    this_DivisionOperator_18=ruleDivisionOperator();

                    state._fsp--;

                     
                            current = this_DivisionOperator_18; 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1597:1: entryRuleNoReturnTypeOperator returns [EObject current=null] : iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF ;
    public final EObject entryRuleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1598:2: (iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1599:2: iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getNoReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3537);
            iv_ruleNoReturnTypeOperator=ruleNoReturnTypeOperator();

            state._fsp--;

             current =iv_ruleNoReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3547); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1606:1: ruleNoReturnTypeOperator returns [EObject current=null] : this_OutputOperator_0= ruleOutputOperator ;
    public final EObject ruleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_OutputOperator_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1609:28: (this_OutputOperator_0= ruleOutputOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1611:5: this_OutputOperator_0= ruleOutputOperator
            {
             
                    newCompositeNode(grammarAccess.getNoReturnTypeOperatorAccess().getOutputOperatorParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator3593);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1627:1: entryRuleTagOperator returns [EObject current=null] : iv_ruleTagOperator= ruleTagOperator EOF ;
    public final EObject entryRuleTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:2: (iv_ruleTagOperator= ruleTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1629:2: iv_ruleTagOperator= ruleTagOperator EOF
            {
             newCompositeNode(grammarAccess.getTagOperatorRule()); 
            pushFollow(FOLLOW_ruleTagOperator_in_entryRuleTagOperator3627);
            iv_ruleTagOperator=ruleTagOperator();

            state._fsp--;

             current =iv_ruleTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagOperator3637); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1636:1: ruleTagOperator returns [EObject current=null] : (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1639:28: ( (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1640:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1640:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1640:3: otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTagOperator3674); 

                	newLeafNode(otherlv_0, grammarAccess.getTagOperatorAccess().getTagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTagOperator3686); 

                	newLeafNode(otherlv_1, grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1648:1: ( (lv_parameters_2_0= ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1649:1: (lv_parameters_2_0= ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1649:1: (lv_parameters_2_0= ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1650:3: lv_parameters_2_0= ruleTagElement
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator3707);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1666:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1666:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTagOperator3720); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1670:1: ( (lv_parameters_4_0= ruleTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1671:1: (lv_parameters_4_0= ruleTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1671:1: (lv_parameters_4_0= ruleTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1672:3: lv_parameters_4_0= ruleTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator3741);
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
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTagOperator3755); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1702:1: entryRuleQueryTagOperator returns [EObject current=null] : iv_ruleQueryTagOperator= ruleQueryTagOperator EOF ;
    public final EObject entryRuleQueryTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1703:2: (iv_ruleQueryTagOperator= ruleQueryTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1704:2: iv_ruleQueryTagOperator= ruleQueryTagOperator EOF
            {
             newCompositeNode(grammarAccess.getQueryTagOperatorRule()); 
            pushFollow(FOLLOW_ruleQueryTagOperator_in_entryRuleQueryTagOperator3793);
            iv_ruleQueryTagOperator=ruleQueryTagOperator();

            state._fsp--;

             current =iv_ruleQueryTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryTagOperator3803); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1711:1: ruleQueryTagOperator returns [EObject current=null] : (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' ) ;
    public final EObject ruleQueryTagOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_queryType_1_0 = null;

        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1714:28: ( (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1715:1: (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1715:1: (otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1715:3: otherlv_0= '{' ( (lv_queryType_1_0= ruleSparqlQueryType ) ) ( (lv_query_2_0= ruleSparqlQuery ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleQueryTagOperator3840); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryTagOperatorAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:1: ( (lv_queryType_1_0= ruleSparqlQueryType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_queryType_1_0= ruleSparqlQueryType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_queryType_1_0= ruleSparqlQueryType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1721:3: lv_queryType_1_0= ruleSparqlQueryType
            {
             
            	        newCompositeNode(grammarAccess.getQueryTagOperatorAccess().getQueryTypeSparqlQueryTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQueryType_in_ruleQueryTagOperator3861);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1737:2: ( (lv_query_2_0= ruleSparqlQuery ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1738:1: (lv_query_2_0= ruleSparqlQuery )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1738:1: (lv_query_2_0= ruleSparqlQuery )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1739:3: lv_query_2_0= ruleSparqlQuery
            {
             
            	        newCompositeNode(grammarAccess.getQueryTagOperatorAccess().getQuerySparqlQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQuery_in_ruleQueryTagOperator3882);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleQueryTagOperator3894); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1767:1: entryRuleSparqlQuery returns [EObject current=null] : iv_ruleSparqlQuery= ruleSparqlQuery EOF ;
    public final EObject entryRuleSparqlQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlQuery = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1768:2: (iv_ruleSparqlQuery= ruleSparqlQuery EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1769:2: iv_ruleSparqlQuery= ruleSparqlQuery EOF
            {
             newCompositeNode(grammarAccess.getSparqlQueryRule()); 
            pushFollow(FOLLOW_ruleSparqlQuery_in_entryRuleSparqlQuery3930);
            iv_ruleSparqlQuery=ruleSparqlQuery();

            state._fsp--;

             current =iv_ruleSparqlQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlQuery3940); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1776:1: ruleSparqlQuery returns [EObject current=null] : ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSparqlQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1779:28: ( ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:1: ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:1: ( ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:2: ( (lv_variable_0_0= ruleSparqlQueryVariable ) ) otherlv_1= 'WHERE' otherlv_2= '{' otherlv_3= '}'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1780:2: ( (lv_variable_0_0= ruleSparqlQueryVariable ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1781:1: (lv_variable_0_0= ruleSparqlQueryVariable )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1781:1: (lv_variable_0_0= ruleSparqlQueryVariable )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1782:3: lv_variable_0_0= ruleSparqlQueryVariable
            {
             
            	        newCompositeNode(grammarAccess.getSparqlQueryAccess().getVariableSparqlQueryVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSparqlQueryVariable_in_ruleSparqlQuery3986);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSparqlQuery3998); 

                	newLeafNode(otherlv_1, grammarAccess.getSparqlQueryAccess().getWHEREKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSparqlQuery4010); 

                	newLeafNode(otherlv_2, grammarAccess.getSparqlQueryAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSparqlQuery4022); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1818:1: entryRuleSparqlQueryVariable returns [EObject current=null] : iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF ;
    public final EObject entryRuleSparqlQueryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSparqlQueryVariable = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1819:2: (iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1820:2: iv_ruleSparqlQueryVariable= ruleSparqlQueryVariable EOF
            {
             newCompositeNode(grammarAccess.getSparqlQueryVariableRule()); 
            pushFollow(FOLLOW_ruleSparqlQueryVariable_in_entryRuleSparqlQueryVariable4058);
            iv_ruleSparqlQueryVariable=ruleSparqlQueryVariable();

            state._fsp--;

             current =iv_ruleSparqlQueryVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSparqlQueryVariable4068); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1827:1: ruleSparqlQueryVariable returns [EObject current=null] : (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSparqlQueryVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token otherlv_2=null;
        Token lv_variable_3_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1830:28: ( (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1831:1: (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1831:1: (otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1831:3: otherlv_0= '?' ( (lv_variable_1_0= RULE_STRING ) ) (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSparqlQueryVariable4105); 

                	newLeafNode(otherlv_0, grammarAccess.getSparqlQueryVariableAccess().getQuestionMarkKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1835:1: ( (lv_variable_1_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1836:1: (lv_variable_1_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1836:1: (lv_variable_1_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1837:3: lv_variable_1_0= RULE_STRING
            {
            lv_variable_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable4122); 

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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1853:2: (otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1853:4: otherlv_2= '?' ( (lv_variable_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleSparqlQueryVariable4140); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSparqlQueryVariableAccess().getQuestionMarkKeyword_2_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1857:1: ( (lv_variable_3_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1858:1: (lv_variable_3_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1858:1: (lv_variable_3_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1859:3: lv_variable_3_0= RULE_STRING
            	    {
            	    lv_variable_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable4157); 

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
            	    break loop18;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1883:1: entryRuleUnTagOperator returns [EObject current=null] : iv_ruleUnTagOperator= ruleUnTagOperator EOF ;
    public final EObject entryRuleUnTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1884:2: (iv_ruleUnTagOperator= ruleUnTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1885:2: iv_ruleUnTagOperator= ruleUnTagOperator EOF
            {
             newCompositeNode(grammarAccess.getUnTagOperatorRule()); 
            pushFollow(FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator4200);
            iv_ruleUnTagOperator=ruleUnTagOperator();

            state._fsp--;

             current =iv_ruleUnTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagOperator4210); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1892:1: ruleUnTagOperator returns [EObject current=null] : (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1895:28: ( (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1896:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1896:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1896:3: otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleUnTagOperator4247); 

                	newLeafNode(otherlv_0, grammarAccess.getUnTagOperatorAccess().getUntagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUnTagOperator4259); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1904:1: ( (lv_parameters_2_0= ruleUnTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1905:1: (lv_parameters_2_0= ruleUnTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1905:1: (lv_parameters_2_0= ruleUnTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1906:3: lv_parameters_2_0= ruleUnTagElement
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4280);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1922:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_STRING) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1922:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator4293); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1926:1: ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1927:1: (lv_parameters_4_0= ruleUnTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1927:1: (lv_parameters_4_0= ruleUnTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1928:3: lv_parameters_4_0= ruleUnTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4314);
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
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator4328); 

                	newLeafNode(otherlv_5, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1948:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1949:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1949:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1950:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator4349);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleUnTagOperator4361); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1978:1: entryRuleUnTagElement returns [EObject current=null] : iv_ruleUnTagElement= ruleUnTagElement EOF ;
    public final EObject entryRuleUnTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1979:2: (iv_ruleUnTagElement= ruleUnTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1980:2: iv_ruleUnTagElement= ruleUnTagElement EOF
            {
             newCompositeNode(grammarAccess.getUnTagElementRule()); 
            pushFollow(FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement4397);
            iv_ruleUnTagElement=ruleUnTagElement();

            state._fsp--;

             current =iv_ruleUnTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagElement4407); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1987:1: ruleUnTagElement returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) ;
    public final EObject ruleUnTagElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1990:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1991:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1991:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1991:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1991:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1992:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1992:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1993:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnTagElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUnTagElement4452); 

            		newLeafNode(otherlv_0, grammarAccess.getUnTagElementAccess().getElementOWLClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUnTagElement4464); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagElementAccess().getIsKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2008:1: ( (lv_reference_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2009:1: (lv_reference_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2009:1: (lv_reference_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2010:3: lv_reference_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getUnTagElementAccess().getReferenceStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleUnTagElement4485);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2034:1: entryRuleTagElement returns [EObject current=null] : iv_ruleTagElement= ruleTagElement EOF ;
    public final EObject entryRuleTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2035:2: (iv_ruleTagElement= ruleTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2036:2: iv_ruleTagElement= ruleTagElement EOF
            {
             newCompositeNode(grammarAccess.getTagElementRule()); 
            pushFollow(FOLLOW_ruleTagElement_in_entryRuleTagElement4521);
            iv_ruleTagElement=ruleTagElement();

            state._fsp--;

             current =iv_ruleTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagElement4531); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2043:1: ruleTagElement returns [EObject current=null] : (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) ;
    public final EObject ruleTagElement() throws RecognitionException {
        EObject current = null;

        EObject this_TagClassElement_0 = null;

        EObject this_TagObjectPropertyElement_1 = null;

        EObject this_TagDataTypePropertyElement_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2046:28: ( (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2047:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2047:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==19) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==RULE_ID) ) {
                        int LA20_3 = input.LA(4);

                        if ( (LA20_3==36) ) {
                            switch ( input.LA(5) ) {
                            case 39:
                                {
                                alt20=3;
                                }
                                break;
                            case 37:
                                {
                                alt20=1;
                                }
                                break;
                            case 38:
                                {
                                alt20=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2048:5: this_TagClassElement_0= ruleTagClassElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTagClassElement_in_ruleTagElement4578);
                    this_TagClassElement_0=ruleTagClassElement();

                    state._fsp--;

                     
                            current = this_TagClassElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2058:5: this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4605);
                    this_TagObjectPropertyElement_1=ruleTagObjectPropertyElement();

                    state._fsp--;

                     
                            current = this_TagObjectPropertyElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2068:5: this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4632);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2084:1: entryRuleTagClassElement returns [EObject current=null] : iv_ruleTagClassElement= ruleTagClassElement EOF ;
    public final EObject entryRuleTagClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagClassElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2085:2: (iv_ruleTagClassElement= ruleTagClassElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2086:2: iv_ruleTagClassElement= ruleTagClassElement EOF
            {
             newCompositeNode(grammarAccess.getTagClassElementRule()); 
            pushFollow(FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4667);
            iv_ruleTagClassElement=ruleTagClassElement();

            state._fsp--;

             current =iv_ruleTagClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagClassElement4677); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2093:1: ruleTagClassElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagClassElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2096:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2097:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2097:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2097:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2097:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2098:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2098:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2099:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagClassElement4723);
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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleTagClassElement4735); 

                	newLeafNode(otherlv_1, grammarAccess.getTagClassElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTagClassElement4747); 

                	newLeafNode(otherlv_2, grammarAccess.getTagClassElementAccess().getClassKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2123:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2124:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2124:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2125:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagClassElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagClassElement4767); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2144:1: entryRuleTagObjectPropertyElement returns [EObject current=null] : iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF ;
    public final EObject entryRuleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagObjectPropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2145:2: (iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2146:2: iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagObjectPropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4803);
            iv_ruleTagObjectPropertyElement=ruleTagObjectPropertyElement();

            state._fsp--;

             current =iv_ruleTagObjectPropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4813); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2153:1: ruleTagObjectPropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2156:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2157:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2157:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2157:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2157:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2158:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2158:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2159:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4859);
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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleTagObjectPropertyElement4871); 

                	newLeafNode(otherlv_1, grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTagObjectPropertyElement4883); 

                	newLeafNode(otherlv_2, grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2183:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2184:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2184:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2185:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagObjectPropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4903); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2204:1: entryRuleTagDataTypePropertyElement returns [EObject current=null] : iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF ;
    public final EObject entryRuleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagDataTypePropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2205:2: (iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2206:2: iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagDataTypePropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement4939);
            iv_ruleTagDataTypePropertyElement=ruleTagDataTypePropertyElement();

            state._fsp--;

             current =iv_ruleTagDataTypePropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement4949); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2213:1: ruleTagDataTypePropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2216:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2217:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2218:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2218:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2219:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement4995);
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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleTagDataTypePropertyElement5007); 

                	newLeafNode(otherlv_1, grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleTagDataTypePropertyElement5019); 

                	newLeafNode(otherlv_2, grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2243:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2244:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2244:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2245:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagDataTypePropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement5039); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2264:1: entryRuleBarrierOperator returns [EObject current=null] : iv_ruleBarrierOperator= ruleBarrierOperator EOF ;
    public final EObject entryRuleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrierOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2265:2: (iv_ruleBarrierOperator= ruleBarrierOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2266:2: iv_ruleBarrierOperator= ruleBarrierOperator EOF
            {
             newCompositeNode(grammarAccess.getBarrierOperatorRule()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator5075);
            iv_ruleBarrierOperator=ruleBarrierOperator();

            state._fsp--;

             current =iv_ruleBarrierOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrierOperator5085); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2273:1: ruleBarrierOperator returns [EObject current=null] : (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) ;
    public final EObject ruleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject this_WindowOperator_0 = null;

        EObject this_MarkerOperator_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2276:28: ( (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2277:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2277:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40||LA21_0==45) ) {
                alt21=1;
            }
            else if ( (LA21_0==46) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2278:5: this_WindowOperator_0= ruleWindowOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWindowOperator_in_ruleBarrierOperator5132);
                    this_WindowOperator_0=ruleWindowOperator();

                    state._fsp--;

                     
                            current = this_WindowOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2288:5: this_MarkerOperator_1= ruleMarkerOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getMarkerOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator5159);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2304:1: entryRuleWindowOperator returns [EObject current=null] : iv_ruleWindowOperator= ruleWindowOperator EOF ;
    public final EObject entryRuleWindowOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2305:2: (iv_ruleWindowOperator= ruleWindowOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2306:2: iv_ruleWindowOperator= ruleWindowOperator EOF
            {
             newCompositeNode(grammarAccess.getWindowOperatorRule()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator5194);
            iv_ruleWindowOperator=ruleWindowOperator();

            state._fsp--;

             current =iv_ruleWindowOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindowOperator5204); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2313:1: ruleWindowOperator returns [EObject current=null] : ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2316:28: ( ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:3: ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2317:3: ( (lv_setting_0_0= 'last' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2318:1: (lv_setting_0_0= 'last' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2318:1: (lv_setting_0_0= 'last' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2319:3: lv_setting_0_0= 'last'
                    {
                    lv_setting_0_0=(Token)match(input,40,FOLLOW_40_in_ruleWindowOperator5248); 

                            newLeafNode(lv_setting_0_0, grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "setting", lv_setting_0_0, "last");
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2332:2: ( (lv_value_1_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2333:1: (lv_value_1_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2333:1: (lv_value_1_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2334:3: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleWindowOperator5278); 

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

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2350:2: ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=41 && LA23_0<=44)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2351:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2351:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2352:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2352:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            int alt22=4;
                            switch ( input.LA(1) ) {
                            case 41:
                                {
                                alt22=1;
                                }
                                break;
                            case 42:
                                {
                                alt22=2;
                                }
                                break;
                            case 43:
                                {
                                alt22=3;
                                }
                                break;
                            case 44:
                                {
                                alt22=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 0, input);

                                throw nvae;
                            }

                            switch (alt22) {
                                case 1 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2353:3: lv_unit_2_1= 'min'
                                    {
                                    lv_unit_2_1=(Token)match(input,41,FOLLOW_41_in_ruleWindowOperator5303); 

                                            newLeafNode(lv_unit_2_1, grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2365:8: lv_unit_2_2= 'hrs'
                                    {
                                    lv_unit_2_2=(Token)match(input,42,FOLLOW_42_in_ruleWindowOperator5332); 

                                            newLeafNode(lv_unit_2_2, grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_2, null);
                                    	    

                                    }
                                    break;
                                case 3 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2377:8: lv_unit_2_3= 'sec'
                                    {
                                    lv_unit_2_3=(Token)match(input,43,FOLLOW_43_in_ruleWindowOperator5361); 

                                            newLeafNode(lv_unit_2_3, grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_3, null);
                                    	    

                                    }
                                    break;
                                case 4 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2389:8: lv_unit_2_4= 'elements'
                                    {
                                    lv_unit_2_4=(Token)match(input,44,FOLLOW_44_in_ruleWindowOperator5390); 

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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2405:6: ( (lv_setting_3_0= 'now' ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2405:6: ( (lv_setting_3_0= 'now' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2406:1: (lv_setting_3_0= 'now' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2406:1: (lv_setting_3_0= 'now' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2407:3: lv_setting_3_0= 'now'
                    {
                    lv_setting_3_0=(Token)match(input,45,FOLLOW_45_in_ruleWindowOperator5432); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2428:1: entryRuleMarkerOperator returns [EObject current=null] : iv_ruleMarkerOperator= ruleMarkerOperator EOF ;
    public final EObject entryRuleMarkerOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkerOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2429:2: (iv_ruleMarkerOperator= ruleMarkerOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2430:2: iv_ruleMarkerOperator= ruleMarkerOperator EOF
            {
             newCompositeNode(grammarAccess.getMarkerOperatorRule()); 
            pushFollow(FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5481);
            iv_ruleMarkerOperator=ruleMarkerOperator();

            state._fsp--;

             current =iv_ruleMarkerOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkerOperator5491); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2437:1: ruleMarkerOperator returns [EObject current=null] : (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleMarkerOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2440:28: ( (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2441:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2441:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2441:3: otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMarkerOperator5528); 

                	newLeafNode(otherlv_0, grammarAccess.getMarkerOperatorAccess().getMarkerKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2445:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2446:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2446:1: (lv_expression_1_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2447:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMarkerOperatorAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMarkerOperator5549);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2471:1: entryRuleSWRLOperator returns [EObject current=null] : iv_ruleSWRLOperator= ruleSWRLOperator EOF ;
    public final EObject entryRuleSWRLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2472:2: (iv_ruleSWRLOperator= ruleSWRLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2473:2: iv_ruleSWRLOperator= ruleSWRLOperator EOF
            {
             newCompositeNode(grammarAccess.getSWRLOperatorRule()); 
            pushFollow(FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5585);
            iv_ruleSWRLOperator=ruleSWRLOperator();

            state._fsp--;

             current =iv_ruleSWRLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLOperator5595); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2480:1: ruleSWRLOperator returns [EObject current=null] : (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2483:28: ( (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2484:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2484:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2484:3: otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSWRLOperator5632); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLOperatorAccess().getSwrlKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLOperator5644); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2492:1: ( (lv_rule_2_0= ruleSWRLRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2493:1: (lv_rule_2_0= ruleSWRLRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2493:1: (lv_rule_2_0= ruleSWRLRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2494:3: lv_rule_2_0= ruleSWRLRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getRuleSWRLRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5665);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5677); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2514:1: ( (lv_barrier_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2515:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2515:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2516:3: lv_barrier_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5698);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2532:2: (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2532:4: otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5711); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2536:1: ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2537:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2537:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2538:3: lv_barrier_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5732);
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
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSWRLOperator5746); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2566:1: entryRuleSWRLRule returns [EObject current=null] : iv_ruleSWRLRule= ruleSWRLRule EOF ;
    public final EObject entryRuleSWRLRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2567:2: (iv_ruleSWRLRule= ruleSWRLRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2568:2: iv_ruleSWRLRule= ruleSWRLRule EOF
            {
             newCompositeNode(grammarAccess.getSWRLRuleRule()); 
            pushFollow(FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5782);
            iv_ruleSWRLRule=ruleSWRLRule();

            state._fsp--;

             current =iv_ruleSWRLRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLRule5792); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2575:1: ruleSWRLRule returns [EObject current=null] : (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2578:28: ( (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2579:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2579:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2579:3: otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleSWRLRule5829); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLRuleAccess().getImpliesKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLRule5841); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2587:1: ( (lv_antecedent_2_0= ruleAntecedentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2588:1: (lv_antecedent_2_0= ruleAntecedentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2588:1: (lv_antecedent_2_0= ruleAntecedentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2589:3: lv_antecedent_2_0= ruleAntecedentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getAntecedentAntecedentRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5862);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLRule5874); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLRuleAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2609:1: ( (lv_consequent_4_0= ruleConsequentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2610:1: (lv_consequent_4_0= ruleConsequentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2610:1: (lv_consequent_4_0= ruleConsequentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2611:3: lv_consequent_4_0= ruleConsequentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getConsequentConsequentRuleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConsequentRule_in_ruleSWRLRule5895);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSWRLRule5907); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2639:1: entryRuleAntecedentRule returns [EObject current=null] : iv_ruleAntecedentRule= ruleAntecedentRule EOF ;
    public final EObject entryRuleAntecedentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntecedentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2640:2: (iv_ruleAntecedentRule= ruleAntecedentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2641:2: iv_ruleAntecedentRule= ruleAntecedentRule EOF
            {
             newCompositeNode(grammarAccess.getAntecedentRuleRule()); 
            pushFollow(FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule5943);
            iv_ruleAntecedentRule=ruleAntecedentRule();

            state._fsp--;

             current =iv_ruleAntecedentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntecedentRule5953); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2648:1: ruleAntecedentRule returns [EObject current=null] : (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2651:28: ( (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2652:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2652:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2652:3: otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleAntecedentRule5990); 

                	newLeafNode(otherlv_0, grammarAccess.getAntecedentRuleAccess().getAntecedentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAntecedentRule6002); 

                	newLeafNode(otherlv_1, grammarAccess.getAntecedentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2660:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2661:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2661:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2662:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule6023);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2678:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2678:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAntecedentRule6036); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAntecedentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2682:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2683:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2683:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2684:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule6057);
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
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAntecedentRule6071); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2712:1: entryRuleConsequentRule returns [EObject current=null] : iv_ruleConsequentRule= ruleConsequentRule EOF ;
    public final EObject entryRuleConsequentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsequentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2713:2: (iv_ruleConsequentRule= ruleConsequentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2714:2: iv_ruleConsequentRule= ruleConsequentRule EOF
            {
             newCompositeNode(grammarAccess.getConsequentRuleRule()); 
            pushFollow(FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule6107);
            iv_ruleConsequentRule=ruleConsequentRule();

            state._fsp--;

             current =iv_ruleConsequentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsequentRule6117); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2721:1: ruleConsequentRule returns [EObject current=null] : (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2724:28: ( (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2725:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2725:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2725:3: otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleConsequentRule6154); 

                	newLeafNode(otherlv_0, grammarAccess.getConsequentRuleAccess().getConsequentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConsequentRule6166); 

                	newLeafNode(otherlv_1, grammarAccess.getConsequentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2733:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2734:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2734:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2735:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule6187);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2751:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2751:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConsequentRule6200); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConsequentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2755:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2756:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2756:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2757:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule6221);
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
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleConsequentRule6235); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2785:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2786:2: (iv_ruleRule= ruleRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2787:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule6271);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule6281); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2794:1: ruleRule returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2797:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2798:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2798:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2798:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2798:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2799:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2799:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2800:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule6326); 

            		newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getNameOWLObjectPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRule6338); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleRule6350); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getQuestionMarkKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2819:1: ( (lv_variable_3_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2820:1: (lv_variable_3_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2820:1: (lv_variable_3_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2821:3: lv_variable_3_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule6371);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2837:2: (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2837:4: otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRule6384); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getCommaKeyword_4_0());
            	        
            	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleRule6396); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getQuestionMarkKeyword_4_1());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2845:1: ( (lv_variable_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2846:1: (lv_variable_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2846:1: (lv_variable_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2847:3: lv_variable_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule6417);
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
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleRule6431); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2875:1: entryRuleOCLOperator returns [EObject current=null] : iv_ruleOCLOperator= ruleOCLOperator EOF ;
    public final EObject entryRuleOCLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2876:2: (iv_ruleOCLOperator= ruleOCLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2877:2: iv_ruleOCLOperator= ruleOCLOperator EOF
            {
             newCompositeNode(grammarAccess.getOCLOperatorRule()); 
            pushFollow(FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator6467);
            iv_ruleOCLOperator=ruleOCLOperator();

            state._fsp--;

             current =iv_ruleOCLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperator6477); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2884:1: ruleOCLOperator returns [EObject current=null] : (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2887:28: ( (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2888:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2888:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2888:3: otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleOCLOperator6514); 

                	newLeafNode(otherlv_0, grammarAccess.getOCLOperatorAccess().getOclKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOCLOperator6526); 

                	newLeafNode(otherlv_1, grammarAccess.getOCLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2896:1: ( (lv_constraint_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2897:1: (lv_constraint_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2897:1: (lv_constraint_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2898:3: lv_constraint_2_0= RULE_STRING
            {
            lv_constraint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOCLOperator6543); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOCLOperator6560); 

                	newLeafNode(otherlv_3, grammarAccess.getOCLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2918:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2919:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2919:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2920:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOCLOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6581);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOCLOperator6593); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2948:1: entryRuleCountOperator returns [EObject current=null] : iv_ruleCountOperator= ruleCountOperator EOF ;
    public final EObject entryRuleCountOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2949:2: (iv_ruleCountOperator= ruleCountOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2950:2: iv_ruleCountOperator= ruleCountOperator EOF
            {
             newCompositeNode(grammarAccess.getCountOperatorRule()); 
            pushFollow(FOLLOW_ruleCountOperator_in_entryRuleCountOperator6629);
            iv_ruleCountOperator=ruleCountOperator();

            state._fsp--;

             current =iv_ruleCountOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountOperator6639); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2957:1: ruleCountOperator returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2960:28: ( (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2961:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2961:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2961:3: otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleCountOperator6676); 

                	newLeafNode(otherlv_0, grammarAccess.getCountOperatorAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCountOperator6688); 

                	newLeafNode(otherlv_1, grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2969:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2970:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2970:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2971:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleCountOperator6709);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCountOperator6721); 

                	newLeafNode(otherlv_3, grammarAccess.getCountOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2991:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2992:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2992:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2993:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6742);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCountOperator6754); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3021:1: entryRuleStandardDeviationOperator returns [EObject current=null] : iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF ;
    public final EObject entryRuleStandardDeviationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3022:2: (iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3023:2: iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF
            {
             newCompositeNode(grammarAccess.getStandardDeviationOperatorRule()); 
            pushFollow(FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6790);
            iv_ruleStandardDeviationOperator=ruleStandardDeviationOperator();

            state._fsp--;

             current =iv_ruleStandardDeviationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardDeviationOperator6800); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3030:1: ruleStandardDeviationOperator returns [EObject current=null] : (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3033:28: ( (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3034:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3034:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3034:3: otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleStandardDeviationOperator6837); 

                	newLeafNode(otherlv_0, grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStandardDeviationOperator6849); 

                	newLeafNode(otherlv_1, grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3042:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3043:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3043:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3044:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6870);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStandardDeviationOperator6882); 

                	newLeafNode(otherlv_3, grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3064:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3065:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3065:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3066:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6903);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleStandardDeviationOperator6915); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3094:1: entryRuleAverageOperator returns [EObject current=null] : iv_ruleAverageOperator= ruleAverageOperator EOF ;
    public final EObject entryRuleAverageOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3095:2: (iv_ruleAverageOperator= ruleAverageOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3096:2: iv_ruleAverageOperator= ruleAverageOperator EOF
            {
             newCompositeNode(grammarAccess.getAverageOperatorRule()); 
            pushFollow(FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator6951);
            iv_ruleAverageOperator=ruleAverageOperator();

            state._fsp--;

             current =iv_ruleAverageOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageOperator6961); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3103:1: ruleAverageOperator returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3106:28: ( (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3107:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3107:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3107:3: otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleAverageOperator6998); 

                	newLeafNode(otherlv_0, grammarAccess.getAverageOperatorAccess().getAvgKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAverageOperator7010); 

                	newLeafNode(otherlv_1, grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3115:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3116:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3116:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3117:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAverageOperator7031);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAverageOperator7043); 

                	newLeafNode(otherlv_3, grammarAccess.getAverageOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3137:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3138:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3138:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3139:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator7064);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAverageOperator7076); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3167:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3168:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3169:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
             newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7112);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;

             current =iv_ruleAdditionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator7122); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3176:1: ruleAdditionOperator returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literalList_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElementList_6_0 = null;

        EObject lv_stream_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3179:28: ( (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3180:1: (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3180:1: (otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3180:3: otherlv_0= 'add' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleAdditionOperator7159); 

                	newLeafNode(otherlv_0, grammarAccess.getAdditionOperatorAccess().getAddKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAdditionOperator7171); 

                	newLeafNode(otherlv_1, grammarAccess.getAdditionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3188:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3189:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3189:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3190:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAdditionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAdditionOperator7192);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAdditionOperator7204); 

                	newLeafNode(otherlv_3, grammarAccess.getAdditionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3210:1: ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==19) ) {
                        alt29=2;
                    }


                }
                else if ( (LA29_0==RULE_NUMBER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3210:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3210:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3210:3: ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3210:3: ( (lv_literalList_4_0= RULE_NUMBER ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3211:1: (lv_literalList_4_0= RULE_NUMBER )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3211:1: (lv_literalList_4_0= RULE_NUMBER )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3212:3: lv_literalList_4_0= RULE_NUMBER
            	    {
            	    lv_literalList_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAdditionOperator7223); 

            	    			newLeafNode(lv_literalList_4_0, grammarAccess.getAdditionOperatorAccess().getLiteralListNUMBERTerminalRuleCall_4_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAdditionOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"literalList",
            	            		lv_literalList_4_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAdditionOperator7240); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAdditionOperatorAccess().getCommaKeyword_4_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3233:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3233:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3233:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3233:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3234:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3234:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3235:3: lv_streamElementList_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionOperatorAccess().getStreamElementListStreamAccessParserRuleCall_4_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleAdditionOperator7269);
            	    lv_streamElementList_6_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"streamElementList",
            	            		lv_streamElementList_6_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleAdditionOperator7281); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAdditionOperatorAccess().getCommaKeyword_4_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3255:4: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3256:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3256:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:3: lv_stream_8_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getAdditionOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleAdditionOperator7305);
            lv_stream_8_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_8_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleAdditionOperator7317); 

                	newLeafNode(otherlv_9, grammarAccess.getAdditionOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3285:1: entryRuleSubtractionOperator returns [EObject current=null] : iv_ruleSubtractionOperator= ruleSubtractionOperator EOF ;
    public final EObject entryRuleSubtractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtractionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3286:2: (iv_ruleSubtractionOperator= ruleSubtractionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3287:2: iv_ruleSubtractionOperator= ruleSubtractionOperator EOF
            {
             newCompositeNode(grammarAccess.getSubtractionOperatorRule()); 
            pushFollow(FOLLOW_ruleSubtractionOperator_in_entryRuleSubtractionOperator7353);
            iv_ruleSubtractionOperator=ruleSubtractionOperator();

            state._fsp--;

             current =iv_ruleSubtractionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubtractionOperator7363); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3294:1: ruleSubtractionOperator returns [EObject current=null] : (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) ;
    public final EObject ruleSubtractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literalList_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElementList_6_0 = null;

        EObject lv_stream_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3297:28: ( (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3298:1: (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3298:1: (otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3298:3: otherlv_0= 'sub' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleSubtractionOperator7400); 

                	newLeafNode(otherlv_0, grammarAccess.getSubtractionOperatorAccess().getSubKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubtractionOperator7412); 

                	newLeafNode(otherlv_1, grammarAccess.getSubtractionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3306:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3307:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3307:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3308:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getSubtractionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator7433);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSubtractionOperator7445); 

                	newLeafNode(otherlv_3, grammarAccess.getSubtractionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:1: ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==19) ) {
                        alt30=2;
                    }


                }
                else if ( (LA30_0==RULE_NUMBER) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:3: ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3328:3: ( (lv_literalList_4_0= RULE_NUMBER ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3329:1: (lv_literalList_4_0= RULE_NUMBER )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3329:1: (lv_literalList_4_0= RULE_NUMBER )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3330:3: lv_literalList_4_0= RULE_NUMBER
            	    {
            	    lv_literalList_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSubtractionOperator7464); 

            	    			newLeafNode(lv_literalList_4_0, grammarAccess.getSubtractionOperatorAccess().getLiteralListNUMBERTerminalRuleCall_4_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubtractionOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"literalList",
            	            		lv_literalList_4_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSubtractionOperator7481); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSubtractionOperatorAccess().getCommaKeyword_4_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3351:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3351:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3351:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3351:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3352:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3352:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3353:3: lv_streamElementList_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubtractionOperatorAccess().getStreamElementListStreamAccessParserRuleCall_4_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator7510);
            	    lv_streamElementList_6_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubtractionOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"streamElementList",
            	            		lv_streamElementList_6_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSubtractionOperator7522); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSubtractionOperatorAccess().getCommaKeyword_4_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3373:4: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3374:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3374:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3375:3: lv_stream_8_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSubtractionOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSubtractionOperator7546);
            lv_stream_8_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubtractionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_8_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleSubtractionOperator7558); 

                	newLeafNode(otherlv_9, grammarAccess.getSubtractionOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3403:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3404:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3405:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7594);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;

             current =iv_ruleMultiplicationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator7604); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3412:1: ruleMultiplicationOperator returns [EObject current=null] : (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literalList_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElementList_6_0 = null;

        EObject lv_stream_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3415:28: ( (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3416:1: (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3416:1: (otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3416:3: otherlv_0= 'mult' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleMultiplicationOperator7641); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiplicationOperatorAccess().getMultKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMultiplicationOperator7653); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiplicationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3424:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3425:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3425:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3426:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7674);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMultiplicationOperator7686); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiplicationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3446:1: ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==19) ) {
                        alt31=2;
                    }


                }
                else if ( (LA31_0==RULE_NUMBER) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3446:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3446:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3446:3: ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3446:3: ( (lv_literalList_4_0= RULE_NUMBER ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3447:1: (lv_literalList_4_0= RULE_NUMBER )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3447:1: (lv_literalList_4_0= RULE_NUMBER )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3448:3: lv_literalList_4_0= RULE_NUMBER
            	    {
            	    lv_literalList_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMultiplicationOperator7705); 

            	    			newLeafNode(lv_literalList_4_0, grammarAccess.getMultiplicationOperatorAccess().getLiteralListNUMBERTerminalRuleCall_4_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"literalList",
            	            		lv_literalList_4_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMultiplicationOperator7722); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMultiplicationOperatorAccess().getCommaKeyword_4_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3469:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3469:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3469:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3469:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3470:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3470:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3471:3: lv_streamElementList_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationOperatorAccess().getStreamElementListStreamAccessParserRuleCall_4_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7751);
            	    lv_streamElementList_6_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"streamElementList",
            	            		lv_streamElementList_6_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMultiplicationOperator7763); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMultiplicationOperatorAccess().getCommaKeyword_4_1_1());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3491:4: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3492:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3492:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3493:3: lv_stream_8_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMultiplicationOperator7787);
            lv_stream_8_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicationOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_8_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicationOperator7799); 

                	newLeafNode(otherlv_9, grammarAccess.getMultiplicationOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3521:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3522:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3523:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
             newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7835);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;

             current =iv_ruleDivisionOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator7845); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3530:1: ruleDivisionOperator returns [EObject current=null] : (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_literalList_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_streamElementList_6_0 = null;

        EObject lv_stream_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3533:28: ( (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3534:1: (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3534:1: (otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3534:3: otherlv_0= 'div' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+ ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleDivisionOperator7882); 

                	newLeafNode(otherlv_0, grammarAccess.getDivisionOperatorAccess().getDivKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDivisionOperator7894); 

                	newLeafNode(otherlv_1, grammarAccess.getDivisionOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3542:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3543:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3543:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3544:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getDivisionOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7915);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDivisionOperator7927); 

                	newLeafNode(otherlv_3, grammarAccess.getDivisionOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3564:1: ( ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' ) | ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==19) ) {
                        alt32=2;
                    }


                }
                else if ( (LA32_0==RULE_NUMBER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3564:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3564:2: ( ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3564:3: ( (lv_literalList_4_0= RULE_NUMBER ) ) otherlv_5= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3564:3: ( (lv_literalList_4_0= RULE_NUMBER ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3565:1: (lv_literalList_4_0= RULE_NUMBER )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3565:1: (lv_literalList_4_0= RULE_NUMBER )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3566:3: lv_literalList_4_0= RULE_NUMBER
            	    {
            	    lv_literalList_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDivisionOperator7946); 

            	    			newLeafNode(lv_literalList_4_0, grammarAccess.getDivisionOperatorAccess().getLiteralListNUMBERTerminalRuleCall_4_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDivisionOperatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"literalList",
            	            		lv_literalList_4_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDivisionOperator7963); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDivisionOperatorAccess().getCommaKeyword_4_0_1());
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3587:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3587:6: ( ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ',' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3587:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) ) otherlv_7= ','
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3587:7: ( (lv_streamElementList_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3588:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3588:1: (lv_streamElementList_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3589:3: lv_streamElementList_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivisionOperatorAccess().getStreamElementListStreamAccessParserRuleCall_4_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7992);
            	    lv_streamElementList_6_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivisionOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"streamElementList",
            	            		lv_streamElementList_6_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDivisionOperator8004); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDivisionOperatorAccess().getCommaKeyword_4_1_1());
            	        

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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3609:4: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3610:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3610:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3611:3: lv_stream_8_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getDivisionOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDivisionOperator8028);
            lv_stream_8_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDivisionOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_8_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDivisionOperator8040); 

                	newLeafNode(otherlv_9, grammarAccess.getDivisionOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3639:1: entryRuleOutputOperator returns [EObject current=null] : iv_ruleOutputOperator= ruleOutputOperator EOF ;
    public final EObject entryRuleOutputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3640:2: (iv_ruleOutputOperator= ruleOutputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3641:2: iv_ruleOutputOperator= ruleOutputOperator EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorRule()); 
            pushFollow(FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator8076);
            iv_ruleOutputOperator=ruleOutputOperator();

            state._fsp--;

             current =iv_ruleOutputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperator8086); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3648:1: ruleOutputOperator returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleOutputOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_location_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_stream_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3651:28: ( (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3652:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3652:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3652:3: otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleOutputOperator8123); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputOperatorAccess().getOutKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOutputOperator8135); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3660:1: ( (lv_parameter_2_0= ruleOutputOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3661:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3661:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3662:3: lv_parameter_2_0= ruleOutputOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator8156);
            lv_parameter_2_0=ruleOutputOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_2_0, 
                    		"OutputOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator8168); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3682:1: ( (lv_location_4_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3683:1: (lv_location_4_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3683:1: (lv_location_4_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3684:3: lv_location_4_0= RULE_STRING
            {
            lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator8185); 

            			newLeafNode(lv_location_4_0, grammarAccess.getOutputOperatorAccess().getLocationSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator8202); 

                	newLeafNode(otherlv_5, grammarAccess.getOutputOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3704:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3705:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3705:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3706:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator8223);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleOutputOperator8235); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleOutputOperator8247); 

                	newLeafNode(otherlv_8, grammarAccess.getOutputOperatorAccess().getSemicolonKeyword_8());
                

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


    // $ANTLR start "entryRuleOutputOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3738:1: entryRuleOutputOperatorParameter returns [EObject current=null] : iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF ;
    public final EObject entryRuleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3739:2: (iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3740:2: iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter8283);
            iv_ruleOutputOperatorParameter=ruleOutputOperatorParameter();

            state._fsp--;

             current =iv_ruleOutputOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperatorParameter8293); 

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
    // $ANTLR end "entryRuleOutputOperatorParameter"


    // $ANTLR start "ruleOutputOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3747:1: ruleOutputOperatorParameter returns [EObject current=null] : ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) ;
    public final EObject ruleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_element_0_0 = null;

        EObject lv_element_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3750:28: ( ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3751:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3751:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3751:2: ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3751:2: ( (lv_element_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3752:1: (lv_element_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3752:1: (lv_element_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3753:3: lv_element_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter8339);
            lv_element_0_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputOperatorParameterRule());
            	        }
                   		add(
                   			current, 
                   			"element",
                    		lv_element_0_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3769:2: (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3769:4: otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperatorParameter8352); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorParameterAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3773:1: ( (lv_element_2_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3774:1: (lv_element_2_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3774:1: (lv_element_2_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3775:3: lv_element_2_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter8373);
            	    lv_element_2_0=ruleStreamAccess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutputOperatorParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"element",
            	            		lv_element_2_0, 
            	            		"StreamAccess");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleOutputOperatorParameter"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3799:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3800:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3801:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition8411);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition8421); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3808:1: ruleVariableDefinition returns [EObject current=null] : (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NumberVariableDefinition_0 = null;

        EObject this_StringVariableDefinition_1 = null;

        EObject this_BooleanVariableDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3811:28: ( (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3812:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3812:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 75:
            case 77:
                {
                alt34=1;
                }
                break;
            case 76:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==RULE_ID) ) {
                    int LA34_4 = input.LA(3);

                    if ( (LA34_4==17) ) {
                        int LA34_5 = input.LA(4);

                        if ( (LA34_5==RULE_BOOLVALUE) ) {
                            alt34=3;
                        }
                        else if ( (LA34_5==RULE_NUMBER) ) {
                            alt34=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                alt34=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3813:5: this_NumberVariableDefinition_0= ruleNumberVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNumberVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition8468);
                    this_NumberVariableDefinition_0=ruleNumberVariableDefinition();

                    state._fsp--;

                     
                            current = this_NumberVariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3823:5: this_StringVariableDefinition_1= ruleStringVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getStringVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition8495);
                    this_StringVariableDefinition_1=ruleStringVariableDefinition();

                    state._fsp--;

                     
                            current = this_StringVariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3833:5: this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBooleanVariableDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition8522);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3849:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3850:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3851:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration8557);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration8567); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3858:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3861:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3862:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3862:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3862:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3862:2: ( (lv_type_0_0= ruleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3863:1: (lv_type_0_0= ruleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3863:1: (lv_type_0_0= ruleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3864:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleVariableDeclaration8613);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3880:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3881:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3881:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3882:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration8630); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration8647); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3910:1: entryRuleNumberVariableDefinition returns [EObject current=null] : iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF ;
    public final EObject entryRuleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3911:2: (iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3912:2: iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getNumberVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition8683);
            iv_ruleNumberVariableDefinition=ruleNumberVariableDefinition();

            state._fsp--;

             current =iv_ruleNumberVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberVariableDefinition8693); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3919:1: ruleNumberVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) ;
    public final EObject ruleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3922:28: ( ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3923:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3923:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3923:2: ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3923:2: ( (lv_type_0_0= ruleSimpleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3924:1: (lv_type_0_0= ruleSimpleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3924:1: (lv_type_0_0= ruleSimpleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3925:3: lv_type_0_0= ruleSimpleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNumberVariableDefinitionAccess().getTypeSimpleDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition8739);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3941:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3942:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3942:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3943:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberVariableDefinition8756); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNumberVariableDefinition8773); 

                	newLeafNode(otherlv_2, grammarAccess.getNumberVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3963:1: ( (lv_value_3_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3964:1: (lv_value_3_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3964:1: (lv_value_3_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3965:3: lv_value_3_0= RULE_NUMBER
            {
            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition8790); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNumberVariableDefinition8807); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3993:1: entryRuleStringVariableDefinition returns [EObject current=null] : iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF ;
    public final EObject entryRuleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3994:2: (iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3995:2: iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getStringVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition8843);
            iv_ruleStringVariableDefinition=ruleStringVariableDefinition();

            state._fsp--;

             current =iv_ruleStringVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariableDefinition8853); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4002:1: ruleStringVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4005:28: ( ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4006:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4006:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4006:2: ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4006:2: ( (lv_type_0_0= ruleStringDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4007:1: (lv_type_0_0= ruleStringDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4007:1: (lv_type_0_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4008:3: lv_type_0_0= ruleStringDataType
            {
             
            	        newCompositeNode(grammarAccess.getStringVariableDefinitionAccess().getTypeStringDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition8899);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4024:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4025:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4025:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4026:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariableDefinition8916); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringVariableDefinition8933); 

                	newLeafNode(otherlv_2, grammarAccess.getStringVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4046:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4047:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4047:1: (lv_value_3_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4048:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringVariableDefinition8950); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStringVariableDefinition8967); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4076:1: entryRuleBooleanVariableDefinition returns [EObject current=null] : iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF ;
    public final EObject entryRuleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4077:2: (iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4078:2: iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition9003);
            iv_ruleBooleanVariableDefinition=ruleBooleanVariableDefinition();

            state._fsp--;

             current =iv_ruleBooleanVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanVariableDefinition9013); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4085:1: ruleBooleanVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) ;
    public final EObject ruleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4088:28: ( ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4089:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4089:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4089:2: ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4089:2: ( (lv_type_0_0= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4090:1: (lv_type_0_0= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4090:1: (lv_type_0_0= ruleBooleanDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4091:3: lv_type_0_0= ruleBooleanDataType
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableDefinitionAccess().getTypeBooleanDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition9059);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4107:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4108:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4108:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4109:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition9076); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanVariableDefinition9093); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4129:1: ( (lv_value_3_0= RULE_BOOLVALUE ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4130:1: (lv_value_3_0= RULE_BOOLVALUE )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4130:1: (lv_value_3_0= RULE_BOOLVALUE )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4131:3: lv_value_3_0= RULE_BOOLVALUE
            {
            lv_value_3_0=(Token)match(input,RULE_BOOLVALUE,FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition9110); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBooleanVariableDefinition9127); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4159:1: entryRuleStructureDeclaration returns [EObject current=null] : iv_ruleStructureDeclaration= ruleStructureDeclaration EOF ;
    public final EObject entryRuleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4160:2: (iv_ruleStructureDeclaration= ruleStructureDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4161:2: iv_ruleStructureDeclaration= ruleStructureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStructureDeclarationRule()); 
            pushFollow(FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration9163);
            iv_ruleStructureDeclaration=ruleStructureDeclaration();

            state._fsp--;

             current =iv_ruleStructureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDeclaration9173); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4168:1: ruleStructureDeclaration returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' ) ;
    public final EObject ruleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4171:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4172:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4172:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4172:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleStructureDeclaration9210); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureDeclarationAccess().getStructureKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4176:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4177:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4177:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4178:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureDeclaration9227); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStructureDeclaration9244); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4198:1: ( (lv_elements_3_0= ruleVariableDeclaration ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=75 && LA35_0<=78)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4199:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4199:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4200:3: lv_elements_3_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureDeclarationAccess().getElementsVariableDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration9265);
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStructureDeclaration9278); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4228:1: entryRuleStreamDeclaration returns [EObject current=null] : iv_ruleStreamDeclaration= ruleStreamDeclaration EOF ;
    public final EObject entryRuleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4229:2: (iv_ruleStreamDeclaration= ruleStreamDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4230:2: iv_ruleStreamDeclaration= ruleStreamDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStreamDeclarationRule()); 
            pushFollow(FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration9314);
            iv_ruleStreamDeclaration=ruleStreamDeclaration();

            state._fsp--;

             current =iv_ruleStreamDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDeclaration9324); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4237:1: ruleStreamDeclaration returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4240:28: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4241:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4241:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4241:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleStreamDeclaration9361); 

                	newLeafNode(otherlv_0, grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4245:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4246:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4246:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4247:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDeclaration9378); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStreamDeclaration9395); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4267:1: ( (lv_elements_3_0= ruleStreamElement ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62||(LA36_0>=75 && LA36_0<=78)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4268:1: (lv_elements_3_0= ruleStreamElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4268:1: (lv_elements_3_0= ruleStreamElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4269:3: lv_elements_3_0= ruleStreamElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamElement_in_ruleStreamDeclaration9416);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStreamDeclaration9429); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4297:1: entryRuleStreamElement returns [EObject current=null] : iv_ruleStreamElement= ruleStreamElement EOF ;
    public final EObject entryRuleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4298:2: (iv_ruleStreamElement= ruleStreamElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4299:2: iv_ruleStreamElement= ruleStreamElement EOF
            {
             newCompositeNode(grammarAccess.getStreamElementRule()); 
            pushFollow(FOLLOW_ruleStreamElement_in_entryRuleStreamElement9465);
            iv_ruleStreamElement=ruleStreamElement();

            state._fsp--;

             current =iv_ruleStreamElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamElement9475); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4306:1: ruleStreamElement returns [EObject current=null] : (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureElements_0 = null;

        EObject this_VariableDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4309:28: ( (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4310:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4310:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==62) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=75 && LA37_0<=78)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4311:5: this_StructureElements_0= ruleStructureElements
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getStructureElementsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructureElements_in_ruleStreamElement9522);
                    this_StructureElements_0=ruleStructureElements();

                    state._fsp--;

                     
                            current = this_StructureElements_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4321:5: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getVariableDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStreamElement9549);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4337:1: entryRuleStructureElements returns [EObject current=null] : iv_ruleStructureElements= ruleStructureElements EOF ;
    public final EObject entryRuleStructureElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureElements = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4338:2: (iv_ruleStructureElements= ruleStructureElements EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4339:2: iv_ruleStructureElements= ruleStructureElements EOF
            {
             newCompositeNode(grammarAccess.getStructureElementsRule()); 
            pushFollow(FOLLOW_ruleStructureElements_in_entryRuleStructureElements9584);
            iv_ruleStructureElements=ruleStructureElements();

            state._fsp--;

             current =iv_ruleStructureElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureElements9594); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4346:1: ruleStructureElements returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStructureElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4349:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4350:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4350:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4350:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleStructureElements9631); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureElementsAccess().getUseKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4354:1: ( (otherlv_1= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4355:1: (otherlv_1= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4355:1: (otherlv_1= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4356:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureElementsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureElements9651); 

            		newLeafNode(otherlv_1, grammarAccess.getStructureElementsAccess().getElementStructureDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStructureElements9663); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4379:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4380:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4381:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression9699);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression9709); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4388:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4391:28: (this_Or_0= ruleOr )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4393:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression9755);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4409:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4410:2: (iv_ruleOr= ruleOr EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4411:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr9789);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr9799); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4418:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4421:28: ( (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4422:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4422:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4423:5: this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr9846);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:1: ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==63) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:2: () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4431:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4432:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4437:2: ( (lv_operator_2_0= '||' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4438:1: (lv_operator_2_0= '||' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4438:1: (lv_operator_2_0= '||' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4439:3: lv_operator_2_0= '||'
            	    {
            	    lv_operator_2_0=(Token)match(input,63,FOLLOW_63_in_ruleOr9873); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getOrAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4452:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4453:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4453:1: (lv_right_3_0= ruleAnd )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4454:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr9907);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4478:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4479:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4480:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd9945);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd9955); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4487:1: ruleAnd returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4490:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4491:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4491:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4492:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getRelationalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd10002);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;

             
                    current = this_RelationalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4500:1: ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==64) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4500:2: () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4500:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4501:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4506:2: ( (lv_operator_2_0= '&&' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4507:1: (lv_operator_2_0= '&&' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4507:1: (lv_operator_2_0= '&&' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4508:3: lv_operator_2_0= '&&'
            	    {
            	    lv_operator_2_0=(Token)match(input,64,FOLLOW_64_in_ruleAnd10029); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getAndAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4521:2: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4522:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4522:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4523:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd10063);
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
            	    break loop39;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4547:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4548:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4549:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression10101);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression10111); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4556:1: ruleRelationalExpression returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4559:28: ( (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4560:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4560:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4561:5: this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression10158);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4569:1: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=65 && LA41_0<=70)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4569:2: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4569:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4570:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4575:2: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4576:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4576:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4577:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4577:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    int alt40=6;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt40=4;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt40=5;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt40=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4578:3: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,65,FOLLOW_65_in_ruleRelationalExpression10187); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getRelationalExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4590:8: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,66,FOLLOW_66_in_ruleRelationalExpression10216); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getRelationalExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4602:8: lv_operator_2_3= '>='
            	            {
            	            lv_operator_2_3=(Token)match(input,67,FOLLOW_67_in_ruleRelationalExpression10245); 

            	                    newLeafNode(lv_operator_2_3, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4614:8: lv_operator_2_4= '<='
            	            {
            	            lv_operator_2_4=(Token)match(input,68,FOLLOW_68_in_ruleRelationalExpression10274); 

            	                    newLeafNode(lv_operator_2_4, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4626:8: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,69,FOLLOW_69_in_ruleRelationalExpression10303); 

            	                    newLeafNode(lv_operator_2_5, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4638:8: lv_operator_2_6= '<'
            	            {
            	            lv_operator_2_6=(Token)match(input,70,FOLLOW_70_in_ruleRelationalExpression10332); 

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

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4653:2: ( (lv_right_3_0= ruleAddition ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4654:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4654:1: (lv_right_3_0= ruleAddition )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4655:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression10369);
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
            	    break loop41;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4679:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4680:2: (iv_ruleAddition= ruleAddition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4681:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition10407);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition10417); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4688:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4691:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4692:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4692:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4693:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition10464);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=71 && LA43_0<=72)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==71) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==72) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:3: ( () otherlv_2= '+' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:3: ( () otherlv_2= '+' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:4: () otherlv_2= '+'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4701:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4702:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleAddition10487); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4712:6: ( () otherlv_4= '-' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4712:6: ( () otherlv_4= '-' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4712:7: () otherlv_4= '-'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4712:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4713:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleAddition10516); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4722:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4723:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4723:1: (lv_right_5_0= ruleMultiplication )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4724:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition10539);
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
            	    break loop43;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4748:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4749:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4750:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication10577);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication10587); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4757:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4760:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4761:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4761:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4762:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication10634);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=73 && LA45_0<=74)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==73) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==74) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:3: ( () otherlv_2= '*' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:3: ( () otherlv_2= '*' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:4: () otherlv_2= '*'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4771:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,73,FOLLOW_73_in_ruleMultiplication10657); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4781:6: ( () otherlv_4= '/' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4781:6: ( () otherlv_4= '/' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4781:7: () otherlv_4= '/'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4781:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4782:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleMultiplication10686); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4791:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4792:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4792:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4793:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication10709);
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
            	    break loop45;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4817:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4818:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4819:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression10747);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression10757); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4826:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4829:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4830:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4830:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt46=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
                {
                int LA46_3 = input.LA(2);

                if ( (LA46_3==EOF||LA46_3==16||LA46_3==18||LA46_3==22||LA46_3==24||(LA46_3>=63 && LA46_3<=74)) ) {
                    alt46=3;
                }
                else if ( (LA46_3==19) ) {
                    alt46=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4830:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4830:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4830:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression10795); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression10817);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression10828); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4848:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4848:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4848:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4848:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4849:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4854:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4855:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4855:1: (lv_value_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4856:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression10862); 

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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4873:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4873:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4873:7: () ( (otherlv_6= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4873:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4874:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getVariableCallAction_2_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4879:2: ( (otherlv_6= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4880:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4880:1: (otherlv_6= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4881:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression10904); 

                    		newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getVariableVariableDefinitionCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4893:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4893:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4893:7: () ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4893:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4894:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getStreamAccessAction_3_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4899:2: ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4900:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4900:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4901:3: lv_streamVariable_8_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getStreamVariableStreamAccessParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_rulePrimaryExpression10942);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4925:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4926:2: (iv_ruleDataType= ruleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4927:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType10979);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType10989); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4934:1: ruleDataType returns [EObject current=null] : (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDataType_0 = null;

        EObject this_ComplexDataType_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4937:28: ( (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4938:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4938:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=75 && LA47_0<=77)) ) {
                alt47=1;
            }
            else if ( (LA47_0==78) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4939:5: this_SimpleDataType_0= ruleSimpleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleDataType_in_ruleDataType11036);
                    this_SimpleDataType_0=ruleSimpleDataType();

                    state._fsp--;

                     
                            current = this_SimpleDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4949:5: this_ComplexDataType_1= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getComplexDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexDataType_in_ruleDataType11063);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4965:1: entryRuleSimpleDataType returns [EObject current=null] : iv_ruleSimpleDataType= ruleSimpleDataType EOF ;
    public final EObject entryRuleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4966:2: (iv_ruleSimpleDataType= ruleSimpleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4967:2: iv_ruleSimpleDataType= ruleSimpleDataType EOF
            {
             newCompositeNode(grammarAccess.getSimpleDataTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType11098);
            iv_ruleSimpleDataType=ruleSimpleDataType();

            state._fsp--;

             current =iv_ruleSimpleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDataType11108); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4974:1: ruleSimpleDataType returns [EObject current=null] : (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) ;
    public final EObject ruleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDataType_0 = null;

        EObject this_FloatDataType_1 = null;

        EObject this_BooleanDataType_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4977:28: ( (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4978:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4978:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt48=1;
                }
                break;
            case 77:
                {
                alt48=2;
                }
                break;
            case 76:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4979:5: this_IntegerDataType_0= ruleIntegerDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getIntegerDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType11155);
                    this_IntegerDataType_0=ruleIntegerDataType();

                    state._fsp--;

                     
                            current = this_IntegerDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4989:5: this_FloatDataType_1= ruleFloatDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getFloatDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFloatDataType_in_ruleSimpleDataType11182);
                    this_FloatDataType_1=ruleFloatDataType();

                    state._fsp--;

                     
                            current = this_FloatDataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4999:5: this_BooleanDataType_2= ruleBooleanDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getBooleanDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType11209);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5015:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5016:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5017:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType11244);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexDataType11254); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5024:1: ruleComplexDataType returns [EObject current=null] : this_StringDataType_0= ruleStringDataType ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject this_StringDataType_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5027:28: (this_StringDataType_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5029:5: this_StringDataType_0= ruleStringDataType
            {
             
                    newCompositeNode(grammarAccess.getComplexDataTypeAccess().getStringDataTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleStringDataType_in_ruleComplexDataType11300);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5045:1: entryRuleIntegerDataType returns [EObject current=null] : iv_ruleIntegerDataType= ruleIntegerDataType EOF ;
    public final EObject entryRuleIntegerDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5046:2: (iv_ruleIntegerDataType= ruleIntegerDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5047:2: iv_ruleIntegerDataType= ruleIntegerDataType EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType11334);
            iv_ruleIntegerDataType=ruleIntegerDataType();

            state._fsp--;

             current =iv_ruleIntegerDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDataType11344); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5054:1: ruleIntegerDataType returns [EObject current=null] : (otherlv_0= 'int' () ) ;
    public final EObject ruleIntegerDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5057:28: ( (otherlv_0= 'int' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5058:1: (otherlv_0= 'int' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5058:1: (otherlv_0= 'int' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5058:3: otherlv_0= 'int' ()
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleIntegerDataType11381); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerDataTypeAccess().getIntKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5062:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5063:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5076:1: entryRuleBooleanDataType returns [EObject current=null] : iv_ruleBooleanDataType= ruleBooleanDataType EOF ;
    public final EObject entryRuleBooleanDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5077:2: (iv_ruleBooleanDataType= ruleBooleanDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5078:2: iv_ruleBooleanDataType= ruleBooleanDataType EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType11426);
            iv_ruleBooleanDataType=ruleBooleanDataType();

            state._fsp--;

             current =iv_ruleBooleanDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDataType11436); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5085:1: ruleBooleanDataType returns [EObject current=null] : (otherlv_0= 'bool' () ) ;
    public final EObject ruleBooleanDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5088:28: ( (otherlv_0= 'bool' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5089:1: (otherlv_0= 'bool' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5089:1: (otherlv_0= 'bool' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5089:3: otherlv_0= 'bool' ()
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleBooleanDataType11473); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanDataTypeAccess().getBoolKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5093:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5094:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5107:1: entryRuleFloatDataType returns [EObject current=null] : iv_ruleFloatDataType= ruleFloatDataType EOF ;
    public final EObject entryRuleFloatDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5108:2: (iv_ruleFloatDataType= ruleFloatDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5109:2: iv_ruleFloatDataType= ruleFloatDataType EOF
            {
             newCompositeNode(grammarAccess.getFloatDataTypeRule()); 
            pushFollow(FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType11518);
            iv_ruleFloatDataType=ruleFloatDataType();

            state._fsp--;

             current =iv_ruleFloatDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataType11528); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5116:1: ruleFloatDataType returns [EObject current=null] : (otherlv_0= 'float' () ) ;
    public final EObject ruleFloatDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5119:28: ( (otherlv_0= 'float' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5120:1: (otherlv_0= 'float' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5120:1: (otherlv_0= 'float' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5120:3: otherlv_0= 'float' ()
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleFloatDataType11565); 

                	newLeafNode(otherlv_0, grammarAccess.getFloatDataTypeAccess().getFloatKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5124:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5125:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5138:1: entryRuleStringDataType returns [EObject current=null] : iv_ruleStringDataType= ruleStringDataType EOF ;
    public final EObject entryRuleStringDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5139:2: (iv_ruleStringDataType= ruleStringDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5140:2: iv_ruleStringDataType= ruleStringDataType EOF
            {
             newCompositeNode(grammarAccess.getStringDataTypeRule()); 
            pushFollow(FOLLOW_ruleStringDataType_in_entryRuleStringDataType11610);
            iv_ruleStringDataType=ruleStringDataType();

            state._fsp--;

             current =iv_ruleStringDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDataType11620); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5147:1: ruleStringDataType returns [EObject current=null] : (otherlv_0= 'string' () ) ;
    public final EObject ruleStringDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5150:28: ( (otherlv_0= 'string' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5151:1: (otherlv_0= 'string' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5151:1: (otherlv_0= 'string' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5151:3: otherlv_0= 'string' ()
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleStringDataType11657); 

                	newLeafNode(otherlv_0, grammarAccess.getStringDataTypeAccess().getStringKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5155:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5156:5: 
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


    // $ANTLR start "entryRuleInternationalizedResourceIdentifier"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5169:1: entryRuleInternationalizedResourceIdentifier returns [EObject current=null] : iv_ruleInternationalizedResourceIdentifier= ruleInternationalizedResourceIdentifier EOF ;
    public final EObject entryRuleInternationalizedResourceIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternationalizedResourceIdentifier = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5170:2: (iv_ruleInternationalizedResourceIdentifier= ruleInternationalizedResourceIdentifier EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5171:2: iv_ruleInternationalizedResourceIdentifier= ruleInternationalizedResourceIdentifier EOF
            {
             newCompositeNode(grammarAccess.getInternationalizedResourceIdentifierRule()); 
            pushFollow(FOLLOW_ruleInternationalizedResourceIdentifier_in_entryRuleInternationalizedResourceIdentifier11702);
            iv_ruleInternationalizedResourceIdentifier=ruleInternationalizedResourceIdentifier();

            state._fsp--;

             current =iv_ruleInternationalizedResourceIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternationalizedResourceIdentifier11712); 

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
    // $ANTLR end "entryRuleInternationalizedResourceIdentifier"


    // $ANTLR start "ruleInternationalizedResourceIdentifier"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5178:1: ruleInternationalizedResourceIdentifier returns [EObject current=null] : ( ( (lv_scheme_0_0= ruleScheme ) ) otherlv_1= '://' ( (lv_authority_2_0= RULE_STRING ) ) (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )* (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) ) (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleInternationalizedResourceIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_authority_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;
        Token otherlv_5=null;
        Token lv_query_6_0=null;
        Token otherlv_7=null;
        Token lv_fragmentIRI_8_0=null;
        Enumerator lv_scheme_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5181:28: ( ( ( (lv_scheme_0_0= ruleScheme ) ) otherlv_1= '://' ( (lv_authority_2_0= RULE_STRING ) ) (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )* (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) ) (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5182:1: ( ( (lv_scheme_0_0= ruleScheme ) ) otherlv_1= '://' ( (lv_authority_2_0= RULE_STRING ) ) (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )* (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) ) (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5182:1: ( ( (lv_scheme_0_0= ruleScheme ) ) otherlv_1= '://' ( (lv_authority_2_0= RULE_STRING ) ) (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )* (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) ) (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5182:2: ( (lv_scheme_0_0= ruleScheme ) ) otherlv_1= '://' ( (lv_authority_2_0= RULE_STRING ) ) (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )* (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) ) (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5182:2: ( (lv_scheme_0_0= ruleScheme ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5183:1: (lv_scheme_0_0= ruleScheme )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5183:1: (lv_scheme_0_0= ruleScheme )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5184:3: lv_scheme_0_0= ruleScheme
            {
             
            	        newCompositeNode(grammarAccess.getInternationalizedResourceIdentifierAccess().getSchemeSchemeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleScheme_in_ruleInternationalizedResourceIdentifier11758);
            lv_scheme_0_0=ruleScheme();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternationalizedResourceIdentifierRule());
            	        }
                   		set(
                   			current, 
                   			"scheme",
                    		lv_scheme_0_0, 
                    		"Scheme");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleInternationalizedResourceIdentifier11770); 

                	newLeafNode(otherlv_1, grammarAccess.getInternationalizedResourceIdentifierAccess().getColonSolidusSolidusKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5204:1: ( (lv_authority_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5205:1: (lv_authority_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5205:1: (lv_authority_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5206:3: lv_authority_2_0= RULE_STRING
            {
            lv_authority_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11787); 

            			newLeafNode(lv_authority_2_0, grammarAccess.getInternationalizedResourceIdentifierAccess().getAuthoritySTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternationalizedResourceIdentifierRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"authority",
                    		lv_authority_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5222:2: (otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==74) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5222:4: otherlv_3= '/' ( (lv_path_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleInternationalizedResourceIdentifier11805); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInternationalizedResourceIdentifierAccess().getSolidusKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5226:1: ( (lv_path_4_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5227:1: (lv_path_4_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5227:1: (lv_path_4_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5228:3: lv_path_4_0= RULE_STRING
            	    {
            	    lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11822); 

            	    			newLeafNode(lv_path_4_0, grammarAccess.getInternationalizedResourceIdentifierAccess().getPathSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInternationalizedResourceIdentifierRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"path",
            	            		lv_path_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5244:4: (otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5244:6: otherlv_5= '?' ( (lv_query_6_0= RULE_STRING ) )
            {
            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleInternationalizedResourceIdentifier11842); 

                	newLeafNode(otherlv_5, grammarAccess.getInternationalizedResourceIdentifierAccess().getQuestionMarkKeyword_4_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5248:1: ( (lv_query_6_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5249:1: (lv_query_6_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5249:1: (lv_query_6_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5250:3: lv_query_6_0= RULE_STRING
            {
            lv_query_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11859); 

            			newLeafNode(lv_query_6_0, grammarAccess.getInternationalizedResourceIdentifierAccess().getQuerySTRINGTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternationalizedResourceIdentifierRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"query",
                    		lv_query_6_0, 
                    		"STRING");
            	    

            }


            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5266:3: (otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5266:5: otherlv_7= '#' ( (lv_fragmentIRI_8_0= RULE_STRING ) )
            {
            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleInternationalizedResourceIdentifier11878); 

                	newLeafNode(otherlv_7, grammarAccess.getInternationalizedResourceIdentifierAccess().getNumberSignKeyword_5_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5270:1: ( (lv_fragmentIRI_8_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5271:1: (lv_fragmentIRI_8_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5271:1: (lv_fragmentIRI_8_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5272:3: lv_fragmentIRI_8_0= RULE_STRING
            {
            lv_fragmentIRI_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11895); 

            			newLeafNode(lv_fragmentIRI_8_0, grammarAccess.getInternationalizedResourceIdentifierAccess().getFragmentIRISTRINGTerminalRuleCall_5_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInternationalizedResourceIdentifierRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fragmentIRI",
                    		lv_fragmentIRI_8_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleInternationalizedResourceIdentifier"


    // $ANTLR start "ruleSparqlQueryType"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5296:1: ruleSparqlQueryType returns [Enumerator current=null] : ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) ) ;
    public final Enumerator ruleSparqlQueryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5298:28: ( ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5299:1: ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5299:1: ( (enumLiteral_0= 'SELECT' ) | (enumLiteral_1= 'CONSTRUCT' ) | (enumLiteral_2= 'ASK' ) | (enumLiteral_3= 'DESCRIBE' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt50=1;
                }
                break;
            case 82:
                {
                alt50=2;
                }
                break;
            case 83:
                {
                alt50=3;
                }
                break;
            case 84:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5299:2: (enumLiteral_0= 'SELECT' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5299:2: (enumLiteral_0= 'SELECT' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5299:4: enumLiteral_0= 'SELECT'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleSparqlQueryType11951); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getSELECTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSparqlQueryTypeAccess().getSELECTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5305:6: (enumLiteral_1= 'CONSTRUCT' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5305:6: (enumLiteral_1= 'CONSTRUCT' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5305:8: enumLiteral_1= 'CONSTRUCT'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleSparqlQueryType11968); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getCONSTRUCTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSparqlQueryTypeAccess().getCONSTRUCTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5311:6: (enumLiteral_2= 'ASK' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5311:6: (enumLiteral_2= 'ASK' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5311:8: enumLiteral_2= 'ASK'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_83_in_ruleSparqlQueryType11985); 

                            current = grammarAccess.getSparqlQueryTypeAccess().getASKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSparqlQueryTypeAccess().getASKEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5317:6: (enumLiteral_3= 'DESCRIBE' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5317:6: (enumLiteral_3= 'DESCRIBE' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5317:8: enumLiteral_3= 'DESCRIBE'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_84_in_ruleSparqlQueryType12002); 

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


    // $ANTLR start "ruleScheme"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5327:1: ruleScheme returns [Enumerator current=null] : ( (enumLiteral_0= 'http' ) | (enumLiteral_1= 'ftp' ) | (enumLiteral_2= 'file' ) ) ;
    public final Enumerator ruleScheme() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5329:28: ( ( (enumLiteral_0= 'http' ) | (enumLiteral_1= 'ftp' ) | (enumLiteral_2= 'file' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5330:1: ( (enumLiteral_0= 'http' ) | (enumLiteral_1= 'ftp' ) | (enumLiteral_2= 'file' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5330:1: ( (enumLiteral_0= 'http' ) | (enumLiteral_1= 'ftp' ) | (enumLiteral_2= 'file' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt51=1;
                }
                break;
            case 86:
                {
                alt51=2;
                }
                break;
            case 87:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5330:2: (enumLiteral_0= 'http' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5330:2: (enumLiteral_0= 'http' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5330:4: enumLiteral_0= 'http'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleScheme12047); 

                            current = grammarAccess.getSchemeAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSchemeAccess().getHTTPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5336:6: (enumLiteral_1= 'ftp' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5336:6: (enumLiteral_1= 'ftp' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5336:8: enumLiteral_1= 'ftp'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleScheme12064); 

                            current = grammarAccess.getSchemeAccess().getFTPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSchemeAccess().getFTPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5342:6: (enumLiteral_2= 'file' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5342:6: (enumLiteral_2= 'file' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5342:8: enumLiteral_2= 'file'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleScheme12081); 

                            current = grammarAccess.getSchemeAccess().getFILEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSchemeAccess().getFILEEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleScheme"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\4\5\uffff\1\4\4\uffff";
    static final String DFA3_maxS =
        "\1\116\5\uffff\1\23\4\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\11\1\7\1\6\1\10";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\6\7\uffff\1\1\2\uffff\1\2\53\uffff\1\7\1\3\1\4\15\uffff\4"+
            "\5",
            "",
            "",
            "",
            "",
            "",
            "\1\10\13\uffff\2\11\1\uffff\1\12",
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
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration247 = new BitSet(new long[]{0x380000000000D010L,0x0000000000007800L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePackageDeclaration268 = new BitSet(new long[]{0x380000000000D010L,0x0000000000007800L});
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
    public static final BitSet FOLLOW_17_in_ruleStreamStatement832 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement854 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStreamStatement881 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamStatement894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamAccess942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess987 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStreamAccess999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDefinition1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1129 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamDefinition1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinOperator1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJoinOperator1229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJoinOperator1241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1262 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1295 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1329 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleJoinOperator1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamOperatorParameter1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1434 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStreamOperatorParameter1447 = new BitSet(new long[]{0x0000610000000000L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1468 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStreamOperatorParameter1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementJoinOperator1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleElementJoinOperator1565 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleElementJoinOperator1577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1599 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1695 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1730 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleElementJoinOperator1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterOperator1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFilterOperator1825 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFilterOperator1837 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator1858 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator1871 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator1892 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator1906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator1927 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFilterOperator1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator1975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitOperator1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSplitOperator2022 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSplitOperator2034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2055 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSplitOperator2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchOperator2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMatchOperator2150 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatchOperator2162 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2183 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2195 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2216 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2249 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2283 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleMatchOperator2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymmetricDifferenceOperator_in_entryRuleSymmetricDifferenceOperator2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymmetricDifferenceOperator2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSymmetricDifferenceOperator2380 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSymmetricDifferenceOperator2392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSymmetricDifferenceOperator2425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2446 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleSymmetricDifferenceOperator2459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2480 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleSymmetricDifferenceOperator2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDifferenceOperator_in_entryRuleDifferenceOperator2530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDifferenceOperator2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDifferenceOperator2577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDifferenceOperator2589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDifferenceOperator2622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2643 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleDifferenceOperator2656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2677 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleDifferenceOperator2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_entryRuleInputOperator2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperator2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInputOperator2774 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInputOperator2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleInternationalizedResourceIdentifier_in_ruleInputOperator2807 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleInternationalizedResourceIdentifier_in_ruleInputOperator2841 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleInputOperator2872 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator2889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator2906 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInputOperator2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator2959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeOperator2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymmetricDifferenceOperator_in_ruleReturnTypeOperator3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDifferenceOperator_in_ruleReturnTypeOperator3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleReturnTypeOperator3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractionOperator_in_ruleReturnTypeOperator3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleReturnTypeOperator3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleReturnTypeOperator3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_entryRuleTagOperator3627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagOperator3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTagOperator3674 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTagOperator3686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator3707 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleTagOperator3720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator3741 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleTagOperator3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryTagOperator_in_entryRuleQueryTagOperator3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryTagOperator3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleQueryTagOperator3840 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_ruleSparqlQueryType_in_ruleQueryTagOperator3861 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleSparqlQuery_in_ruleQueryTagOperator3882 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQueryTagOperator3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQuery_in_entryRuleSparqlQuery3930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlQuery3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQueryVariable_in_ruleSparqlQuery3986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSparqlQuery3998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSparqlQuery4010 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSparqlQuery4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSparqlQueryVariable_in_entryRuleSparqlQueryVariable4058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSparqlQueryVariable4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSparqlQueryVariable4105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable4122 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleSparqlQueryVariable4140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSparqlQueryVariable4157 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagOperator4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUnTagOperator4247 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUnTagOperator4259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4280 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator4293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4314 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator4328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator4349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUnTagOperator4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement4397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagElement4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUnTagElement4452 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUnTagElement4464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleUnTagElement4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_entryRuleTagElement4521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagElement4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_ruleTagElement4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagClassElement4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagClassElement4723 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTagClassElement4735 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTagClassElement4747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagClassElement4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4859 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTagObjectPropertyElement4871 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTagObjectPropertyElement4883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement4939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement4995 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTagDataTypePropertyElement5007 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTagDataTypePropertyElement5019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator5075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrierOperator5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_ruleBarrierOperator5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator5194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindowOperator5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWindowOperator5248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleWindowOperator5278 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleWindowOperator5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleWindowOperator5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWindowOperator5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWindowOperator5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleWindowOperator5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkerOperator5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMarkerOperator5528 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMarkerOperator5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLOperator5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSWRLOperator5632 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLOperator5644 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5665 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5698 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5732 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLOperator5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLRule5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSWRLRule5829 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLRule5841 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5862 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLRule5874 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_ruleSWRLRule5895 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLRule5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule5943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntecedentRule5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAntecedentRule5990 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAntecedentRule6002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule6023 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleAntecedentRule6036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule6057 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAntecedentRule6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule6107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsequentRule6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConsequentRule6154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConsequentRule6166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule6187 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleConsequentRule6200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule6221 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleConsequentRule6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule6271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule6326 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRule6338 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRule6350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule6371 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleRule6384 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRule6396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule6417 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleRule6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator6467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperator6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOCLOperator6514 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOCLOperator6526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOCLOperator6543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOCLOperator6560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6581 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOCLOperator6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_entryRuleCountOperator6629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountOperator6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCountOperator6676 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCountOperator6688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleCountOperator6709 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCountOperator6721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6742 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCountOperator6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardDeviationOperator6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleStandardDeviationOperator6837 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStandardDeviationOperator6849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6870 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStandardDeviationOperator6882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6903 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStandardDeviationOperator6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator6951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageOperator6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAverageOperator6998 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageOperator7010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAverageOperator7031 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAverageOperator7043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator7064 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAverageOperator7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAdditionOperator7159 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAdditionOperator7171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAdditionOperator7192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAdditionOperator7204 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAdditionOperator7223 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAdditionOperator7240 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAdditionOperator7269 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAdditionOperator7281 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleAdditionOperator7305 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAdditionOperator7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubtractionOperator_in_entryRuleSubtractionOperator7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubtractionOperator7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSubtractionOperator7400 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubtractionOperator7412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator7433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubtractionOperator7445 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSubtractionOperator7464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubtractionOperator7481 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleSubtractionOperator7510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubtractionOperator7522 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSubtractionOperator7546 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSubtractionOperator7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMultiplicationOperator7641 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicationOperator7653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7674 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultiplicationOperator7686 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMultiplicationOperator7705 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultiplicationOperator7722 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleMultiplicationOperator7751 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultiplicationOperator7763 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMultiplicationOperator7787 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicationOperator7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDivisionOperator7882 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDivisionOperator7894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7915 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDivisionOperator7927 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDivisionOperator7946 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDivisionOperator7963 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleDivisionOperator7992 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDivisionOperator8004 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDivisionOperator8028 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDivisionOperator8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator8076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperator8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOutputOperator8123 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOutputOperator8135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator8156 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator8168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator8185 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator8202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator8223 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOutputOperator8235 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOutputOperator8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter8283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperatorParameter8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter8339 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperatorParameter8352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter8373 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition8411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration8557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleVariableDeclaration8613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration8630 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition8683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberVariableDefinition8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition8739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberVariableDefinition8756 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNumberVariableDefinition8773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition8790 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNumberVariableDefinition8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition8843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariableDefinition8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition8899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariableDefinition8916 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringVariableDefinition8933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringVariableDefinition8950 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringVariableDefinition8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition9003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariableDefinition9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition9059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition9076 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanVariableDefinition9093 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition9110 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBooleanVariableDefinition9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration9163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDeclaration9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleStructureDeclaration9210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureDeclaration9227 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructureDeclaration9244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration9265 = new BitSet(new long[]{0x0000000000004000L,0x0000000000007800L});
    public static final BitSet FOLLOW_14_in_ruleStructureDeclaration9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration9314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDeclaration9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleStreamDeclaration9361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDeclaration9378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStreamDeclaration9395 = new BitSet(new long[]{0x4000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_ruleStreamElement_in_ruleStreamDeclaration9416 = new BitSet(new long[]{0x4000000000004000L,0x0000000000007800L});
    public static final BitSet FOLLOW_14_in_ruleStreamDeclaration9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_entryRuleStreamElement9465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamElement9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_ruleStreamElement9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStreamElement9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_entryRuleStructureElements9584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureElements9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleStructureElements9631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureElements9651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureElements9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression9699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr9846 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOr9873 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr9907 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd9955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd10002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleAnd10029 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd10063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression10101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression10158 = new BitSet(new long[]{0x0000000000000002L,0x000000000000007EL});
    public static final BitSet FOLLOW_65_in_ruleRelationalExpression10187 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_66_in_ruleRelationalExpression10216 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_67_in_ruleRelationalExpression10245 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_68_in_ruleRelationalExpression10274 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_69_in_ruleRelationalExpression10303 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_70_in_ruleRelationalExpression10332 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression10369 = new BitSet(new long[]{0x0000000000000002L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition10407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition10464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleAddition10487 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_72_in_ruleAddition10516 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition10539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication10577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication10634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleMultiplication10657 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_74_in_ruleMultiplication10686 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication10709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression10747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression10795 = new BitSet(new long[]{0x07F88009FE300050L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression10817 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression10828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rulePrimaryExpression10942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType10979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleDataType11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_ruleDataType11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType11098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDataType11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_ruleSimpleDataType11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType11244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleComplexDataType11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType11334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDataType11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleIntegerDataType11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType11426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDataType11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBooleanDataType11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType11518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataType11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleFloatDataType11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_entryRuleStringDataType11610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDataType11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleStringDataType11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternationalizedResourceIdentifier_in_entryRuleInternationalizedResourceIdentifier11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternationalizedResourceIdentifier11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleInternationalizedResourceIdentifier11758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleInternationalizedResourceIdentifier11770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11787 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleInternationalizedResourceIdentifier11805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11822 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_34_in_ruleInternationalizedResourceIdentifier11842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInternationalizedResourceIdentifier11878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInternationalizedResourceIdentifier11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSparqlQueryType11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSparqlQueryType11968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSparqlQueryType11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSparqlQueryType12002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleScheme12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleScheme12064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleScheme12081 = new BitSet(new long[]{0x0000000000000002L});

}