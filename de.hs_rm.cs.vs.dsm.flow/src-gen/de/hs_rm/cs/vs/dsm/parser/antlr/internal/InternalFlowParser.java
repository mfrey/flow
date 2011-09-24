package de.hs_rm.cs.vs.dsm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_BOOLVALUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'import'", "','", "'='", "';'", "'.'", "'join'", "'('", "')'", "'['", "']'", "'ejoin'", "'filter'", "'split'", "'match'", "'sdif'", "'diff'", "'map'", "'in'", "'tag'", "'untag'", "'is'", "'class'", "'objectproperty'", "'datatype'", "'last'", "'min'", "'hrs'", "'sec'", "'elements'", "'now'", "'marker'", "'swrl'", "'Implies'", "'Antecedent'", "'Consequent'", "'?'", "'ocl'", "'count'", "'std'", "'avg'", "'out'", "'return'", "'if'", "'else'", "'switch'", "'default'", "':'", "'case'", "'while'", "'structure'", "'stream'", "'use'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'int'", "'bool'", "'float'", "'string'"
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:76:1: ruleModel returns [EObject current=null] : ( (lv_models_0_0= rulePackageDeclaration ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:79:28: ( ( (lv_models_0_0= rulePackageDeclaration ) )+ )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:80:1: ( (lv_models_0_0= rulePackageDeclaration ) )+
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:80:1: ( (lv_models_0_0= rulePackageDeclaration ) )+
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
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: (lv_models_0_0= rulePackageDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: (lv_models_0_0= rulePackageDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:82:3: lv_models_0_0= rulePackageDeclaration
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:106:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:107:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:108:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:115:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration213); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:124:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:125:3: lv_name_1_0= RULE_ID
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
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:145:1: ( (lv_elements_3_0= ruleModelElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==12||LA2_0==15||LA2_0==55||(LA2_0>=64 && LA2_0<=65)||(LA2_0>=79 && LA2_0<=82)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:146:1: (lv_elements_3_0= ruleModelElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:146:1: (lv_elements_3_0= ruleModelElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:147:3: lv_elements_3_0= ruleModelElement
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:175:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:176:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:177:2: iv_ruleModelElement= ruleModelElement EOF
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:184:1: ruleModelElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_FunctionDefinition_4= ruleFunctionDefinition | this_ProcessingExpression_5= ruleProcessingExpression ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Import_1 = null;

        EObject this_StructureDeclaration_2 = null;

        EObject this_StreamDeclaration_3 = null;

        EObject this_FunctionDefinition_4 = null;

        EObject this_ProcessingExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:187:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_FunctionDefinition_4= ruleFunctionDefinition | this_ProcessingExpression_5= ruleProcessingExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:188:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_FunctionDefinition_4= ruleFunctionDefinition | this_ProcessingExpression_5= ruleProcessingExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:188:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_FunctionDefinition_4= ruleFunctionDefinition | this_ProcessingExpression_5= ruleProcessingExpression )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:189:5: this_PackageDeclaration_0= rulePackageDeclaration
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:199:5: this_Import_1= ruleImport
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:209:5: this_StructureDeclaration_2= ruleStructureDeclaration
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:219:5: this_StreamDeclaration_3= ruleStreamDeclaration
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:229:5: this_FunctionDefinition_4= ruleFunctionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getFunctionDefinitionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleModelElement482);
                    this_FunctionDefinition_4=ruleFunctionDefinition();

                    state._fsp--;

                     
                            current = this_FunctionDefinition_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:239:5: this_ProcessingExpression_5= ruleProcessingExpression
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getProcessingExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleProcessingExpression_in_ruleModelElement509);
                    this_ProcessingExpression_5=ruleProcessingExpression();

                    state._fsp--;

                     
                            current = this_ProcessingExpression_5; 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:255:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:256:2: (iv_ruleImport= ruleImport EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:257:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport544);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport554); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:264:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:267:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:268:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:268:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:268:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport591); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:272:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:273:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:273:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:274:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport608); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:298:1: entryRuleStreamStatement returns [EObject current=null] : iv_ruleStreamStatement= ruleStreamStatement EOF ;
    public final EObject entryRuleStreamStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:299:2: (iv_ruleStreamStatement= ruleStreamStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:300:2: iv_ruleStreamStatement= ruleStreamStatement EOF
            {
             newCompositeNode(grammarAccess.getStreamStatementRule()); 
            pushFollow(FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement649);
            iv_ruleStreamStatement=ruleStreamStatement();

            state._fsp--;

             current =iv_ruleStreamStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamStatement659); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:307:1: ruleStreamStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_expression_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' ) ;
    public final EObject ruleStreamStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:310:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_expression_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:311:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_expression_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:311:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_expression_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:311:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '=' ( (lv_expression_4_0= ruleReturnTypeOperator ) ) otherlv_5= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:311:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:312:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:312:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:313:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamStatement704); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamStatementAccess().getReturnStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:324:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:324:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleStreamStatement717); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStreamStatementAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:328:1: ( (otherlv_2= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:329:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:329:1: (otherlv_2= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:330:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStreamStatementRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamStatement737); 

            	    		newLeafNode(otherlv_2, grammarAccess.getStreamStatementAccess().getReturnStreamStreamDefinitionCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleStreamStatement751); 

                	newLeafNode(otherlv_3, grammarAccess.getStreamStatementAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:345:1: ( (lv_expression_4_0= ruleReturnTypeOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:346:1: (lv_expression_4_0= ruleReturnTypeOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:346:1: (lv_expression_4_0= ruleReturnTypeOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:347:3: lv_expression_4_0= ruleReturnTypeOperator
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getExpressionReturnTypeOperatorParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement772);
            lv_expression_4_0=ruleReturnTypeOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"ReturnTypeOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStreamStatement784); 

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


    // $ANTLR start "entryRuleStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:375:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:376:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:377:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement820);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement830); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:384:1: ruleStatement returns [EObject current=null] : this_VariableStatement_0= ruleVariableStatement ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableStatement_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:387:28: (this_VariableStatement_0= ruleVariableStatement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:389:5: this_VariableStatement_0= ruleVariableStatement
            {
             
                    newCompositeNode(grammarAccess.getStatementAccess().getVariableStatementParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleVariableStatement_in_ruleStatement876);
            this_VariableStatement_0=ruleVariableStatement();

            state._fsp--;

             
                    current = this_VariableStatement_0; 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:405:1: entryRuleVariableStatement returns [EObject current=null] : iv_ruleVariableStatement= ruleVariableStatement EOF ;
    public final EObject entryRuleVariableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:406:2: (iv_ruleVariableStatement= ruleVariableStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:407:2: iv_ruleVariableStatement= ruleVariableStatement EOF
            {
             newCompositeNode(grammarAccess.getVariableStatementRule()); 
            pushFollow(FOLLOW_ruleVariableStatement_in_entryRuleVariableStatement910);
            iv_ruleVariableStatement=ruleVariableStatement();

            state._fsp--;

             current =iv_ruleVariableStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableStatement920); 

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
    // $ANTLR end "entryRuleVariableStatement"


    // $ANTLR start "ruleVariableStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:414:1: ruleVariableStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:417:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:418:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:418:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:418:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:418:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:419:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:419:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:420:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStatementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableStatement965); 

            		newLeafNode(otherlv_0, grammarAccess.getVariableStatementAccess().getReferenceVariableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVariableStatement977); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableStatementAccess().getEqualsSignKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:435:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:436:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:436:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:437:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableStatement998);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVariableStatement1010); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableStatementAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleVariableStatement"


    // $ANTLR start "entryRuleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:465:1: entryRuleStreamAccess returns [EObject current=null] : iv_ruleStreamAccess= ruleStreamAccess EOF ;
    public final EObject entryRuleStreamAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamAccess = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:466:2: (iv_ruleStreamAccess= ruleStreamAccess EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:467:2: iv_ruleStreamAccess= ruleStreamAccess EOF
            {
             newCompositeNode(grammarAccess.getStreamAccessRule()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess1046);
            iv_ruleStreamAccess=ruleStreamAccess();

            state._fsp--;

             current =iv_ruleStreamAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamAccess1056); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:474:1: ruleStreamAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStreamAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:477:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:478:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:478:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:478:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:478:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:479:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:479:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:480:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess1101); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStreamAccess1113); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamAccessAccess().getFullStopKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:495:1: ( (otherlv_2= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:496:1: (otherlv_2= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:496:1: (otherlv_2= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:497:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess1133); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:518:1: entryRuleStreamDefinition returns [EObject current=null] : iv_ruleStreamDefinition= ruleStreamDefinition EOF ;
    public final EObject entryRuleStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:519:2: (iv_ruleStreamDefinition= ruleStreamDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:520:2: iv_ruleStreamDefinition= ruleStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1171);
            iv_ruleStreamDefinition=ruleStreamDefinition();

            state._fsp--;

             current =iv_ruleStreamDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDefinition1181); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:527:1: ruleStreamDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:530:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:531:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:531:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:531:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:531:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:532:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:532:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:533:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDefinitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1226); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:544:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:545:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:545:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:546:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1243); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStreamDefinition1260); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:574:1: entryRuleJoinOperator returns [EObject current=null] : iv_ruleJoinOperator= ruleJoinOperator EOF ;
    public final EObject entryRuleJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:575:2: (iv_ruleJoinOperator= ruleJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:576:2: iv_ruleJoinOperator= ruleJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1296);
            iv_ruleJoinOperator=ruleJoinOperator();

            state._fsp--;

             current =iv_ruleJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinOperator1306); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:583:1: ruleJoinOperator returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:586:28: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:587:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:587:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:587:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJoinOperator1343); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinOperatorAccess().getJoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinOperator1355); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:595:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:596:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:596:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:597:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1376);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1388); 

                	newLeafNode(otherlv_3, grammarAccess.getJoinOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:617:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:618:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:618:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:619:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1409);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:635:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:635:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleJoinOperator1422); 

            	        	newLeafNode(otherlv_5, grammarAccess.getJoinOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:639:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:641:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1443);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleJoinOperator1457); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:669:1: entryRuleStreamOperatorParameter returns [EObject current=null] : iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF ;
    public final EObject entryRuleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:670:2: (iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:671:2: iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getStreamOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1493);
            iv_ruleStreamOperatorParameter=ruleStreamOperatorParameter();

            state._fsp--;

             current =iv_ruleStreamOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamOperatorParameter1503); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:678:1: ruleStreamOperatorParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_barrier_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:681:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:682:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:682:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:682:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:682:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:683:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:683:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:684:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamOperatorParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1548); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:695:2: (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:695:4: otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleStreamOperatorParameter1561); 

                        	newLeafNode(otherlv_1, grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:699:1: ( (lv_barrier_2_0= ruleBarrierOperator ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:700:1: (lv_barrier_2_0= ruleBarrierOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:700:1: (lv_barrier_2_0= ruleBarrierOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:701:3: lv_barrier_2_0= ruleBarrierOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1582);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStreamOperatorParameter1594); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:729:1: entryRuleElementJoinOperator returns [EObject current=null] : iv_ruleElementJoinOperator= ruleElementJoinOperator EOF ;
    public final EObject entryRuleElementJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:730:2: (iv_ruleElementJoinOperator= ruleElementJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:731:2: iv_ruleElementJoinOperator= ruleElementJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getElementJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1632);
            iv_ruleElementJoinOperator=ruleElementJoinOperator();

            state._fsp--;

             current =iv_ruleElementJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementJoinOperator1642); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:738:1: ruleElementJoinOperator returns [EObject current=null] : (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:741:28: ( (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:742:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:742:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:742:3: otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleElementJoinOperator1679); 

                	newLeafNode(otherlv_0, grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleElementJoinOperator1691); 

                	newLeafNode(otherlv_1, grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:750:1: ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:750:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:750:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:751:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:751:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:752:3: lv_elementParameters_2_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1713);
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:769:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:769:6: ( (otherlv_3= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:770:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:770:1: (otherlv_3= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:771:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1739); 

                    		newLeafNode(otherlv_3, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:782:3: (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )*
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
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:782:5: otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1753); 

            	        	newLeafNode(otherlv_4, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:786:1: ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:787:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:787:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:788:3: lv_elementParameters_5_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1774);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:804:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
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
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:804:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1789); 

            	        	newLeafNode(otherlv_6, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:808:1: ( (otherlv_7= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:809:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:809:1: (otherlv_7= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:810:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator1809); 

            	    		newLeafNode(otherlv_7, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleElementJoinOperator1823); 

                	newLeafNode(otherlv_8, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:825:1: ( (lv_parameter_9_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:826:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:826:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:827:3: lv_parameter_9_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1844);
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

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleElementJoinOperator1856); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:855:1: entryRuleFilterOperator returns [EObject current=null] : iv_ruleFilterOperator= ruleFilterOperator EOF ;
    public final EObject entryRuleFilterOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:856:2: (iv_ruleFilterOperator= ruleFilterOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:857:2: iv_ruleFilterOperator= ruleFilterOperator EOF
            {
             newCompositeNode(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1892);
            iv_ruleFilterOperator=ruleFilterOperator();

            state._fsp--;

             current =iv_ruleFilterOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterOperator1902); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:864:1: ruleFilterOperator returns [EObject current=null] : (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:867:28: ( (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:868:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:868:1: (otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:868:3: otherlv_0= 'filter' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFilterOperator1939); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterOperatorAccess().getFilterKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFilterOperator1951); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:876:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:877:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:877:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:878:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator1972);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:894:2: (otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_2 = input.LA(3);

                        if ( (LA10_2==16||LA10_2==19||LA10_2==21||(LA10_2>=67 && LA10_2<=78)) ) {
                            alt10=1;
                        }


                    }
                    else if ( (LA10_1==RULE_NUMBER||LA10_1==21) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:894:4: otherlv_3= ',' ( (lv_expression_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator1985); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFilterOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:898:1: ( (lv_expression_4_0= ruleExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:899:1: (lv_expression_4_0= ruleExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:899:1: (lv_expression_4_0= ruleExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:900:3: lv_expression_4_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFilterOperator2006);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFilterOperator2020); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:920:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:921:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:921:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:922:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getFilterOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator2041);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFilterOperator2053); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:950:1: entryRuleSplitOperator returns [EObject current=null] : iv_ruleSplitOperator= ruleSplitOperator EOF ;
    public final EObject entryRuleSplitOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:951:2: (iv_ruleSplitOperator= ruleSplitOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:952:2: iv_ruleSplitOperator= ruleSplitOperator EOF
            {
             newCompositeNode(grammarAccess.getSplitOperatorRule()); 
            pushFollow(FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator2089);
            iv_ruleSplitOperator=ruleSplitOperator();

            state._fsp--;

             current =iv_ruleSplitOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitOperator2099); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:959:1: ruleSplitOperator returns [EObject current=null] : (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) ;
    public final EObject ruleSplitOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:962:28: ( (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:1: (otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:3: otherlv_0= 'split' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSplitOperator2136); 

                	newLeafNode(otherlv_0, grammarAccess.getSplitOperatorAccess().getSplitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSplitOperator2148); 

                	newLeafNode(otherlv_1, grammarAccess.getSplitOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:971:1: ( (lv_parameter_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:972:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:972:1: (lv_parameter_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:973:3: lv_parameter_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSplitOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2169);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSplitOperator2181); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1001:1: entryRuleMatchOperator returns [EObject current=null] : iv_ruleMatchOperator= ruleMatchOperator EOF ;
    public final EObject entryRuleMatchOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1002:2: (iv_ruleMatchOperator= ruleMatchOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1003:2: iv_ruleMatchOperator= ruleMatchOperator EOF
            {
             newCompositeNode(grammarAccess.getMatchOperatorRule()); 
            pushFollow(FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2217);
            iv_ruleMatchOperator=ruleMatchOperator();

            state._fsp--;

             current =iv_ruleMatchOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchOperator2227); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1010:1: ruleMatchOperator returns [EObject current=null] : (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1013:28: ( (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1014:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1014:1: (otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1014:3: otherlv_0= 'match' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_calculation_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMatchOperator2264); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchOperatorAccess().getMatchKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMatchOperator2276); 

                	newLeafNode(otherlv_1, grammarAccess.getMatchOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1022:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1023:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1023:1: (lv_expression_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1024:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2297);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2309); 

                	newLeafNode(otherlv_3, grammarAccess.getMatchOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1044:1: ( (lv_calculation_4_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1045:1: (lv_calculation_4_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1045:1: (lv_calculation_4_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1046:3: lv_calculation_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getCalculationExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMatchOperator2330);
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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2342); 

                	newLeafNode(otherlv_5, grammarAccess.getMatchOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1066:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1067:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1067:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1068:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2363);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1084:2: (otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1084:4: otherlv_7= ',' ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleMatchOperator2376); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMatchOperatorAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1088:1: ( (lv_stream_8_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1089:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1089:1: (lv_stream_8_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1090:3: lv_stream_8_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatchOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2397);
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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleMatchOperator2411); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1118:1: entryRuleSymmetricDifferenceOperator returns [EObject current=null] : iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF ;
    public final EObject entryRuleSymmetricDifferenceOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymmetricDifferenceOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1119:2: (iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1120:2: iv_ruleSymmetricDifferenceOperator= ruleSymmetricDifferenceOperator EOF
            {
             newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorRule()); 
            pushFollow(FOLLOW_ruleSymmetricDifferenceOperator_in_entryRuleSymmetricDifferenceOperator2447);
            iv_ruleSymmetricDifferenceOperator=ruleSymmetricDifferenceOperator();

            state._fsp--;

             current =iv_ruleSymmetricDifferenceOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymmetricDifferenceOperator2457); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1127:1: ruleSymmetricDifferenceOperator returns [EObject current=null] : (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1130:28: ( (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1131:1: (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1131:1: (otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1131:3: otherlv_0= 'sdif' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSymmetricDifferenceOperator2494); 

                	newLeafNode(otherlv_0, grammarAccess.getSymmetricDifferenceOperatorAccess().getSdifKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSymmetricDifferenceOperator2506); 

                	newLeafNode(otherlv_1, grammarAccess.getSymmetricDifferenceOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1139:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1140:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1140:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1141:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2527);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSymmetricDifferenceOperator2539); 

                	newLeafNode(otherlv_3, grammarAccess.getSymmetricDifferenceOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1161:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1162:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1162:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1163:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2560);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1179:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1179:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSymmetricDifferenceOperator2573); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSymmetricDifferenceOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1183:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1184:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1184:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1185:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSymmetricDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2594);
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
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSymmetricDifferenceOperator2608); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1213:1: entryRuleDifferenceOperator returns [EObject current=null] : iv_ruleDifferenceOperator= ruleDifferenceOperator EOF ;
    public final EObject entryRuleDifferenceOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferenceOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1214:2: (iv_ruleDifferenceOperator= ruleDifferenceOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1215:2: iv_ruleDifferenceOperator= ruleDifferenceOperator EOF
            {
             newCompositeNode(grammarAccess.getDifferenceOperatorRule()); 
            pushFollow(FOLLOW_ruleDifferenceOperator_in_entryRuleDifferenceOperator2644);
            iv_ruleDifferenceOperator=ruleDifferenceOperator();

            state._fsp--;

             current =iv_ruleDifferenceOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDifferenceOperator2654); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1222:1: ruleDifferenceOperator returns [EObject current=null] : (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1225:28: ( (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1226:1: (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1226:1: (otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1226:3: otherlv_0= 'diff' otherlv_1= '(' ( (lv_parameters_2_0= ruleStreamOperatorParameter ) ) otherlv_3= ',' ( (lv_parameters_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDifferenceOperator2691); 

                	newLeafNode(otherlv_0, grammarAccess.getDifferenceOperatorAccess().getDiffKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDifferenceOperator2703); 

                	newLeafNode(otherlv_1, grammarAccess.getDifferenceOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1234:1: ( (lv_parameters_2_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1235:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1235:1: (lv_parameters_2_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1236:3: lv_parameters_2_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2724);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDifferenceOperator2736); 

                	newLeafNode(otherlv_3, grammarAccess.getDifferenceOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1256:1: ( (lv_parameters_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1257:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1257:1: (lv_parameters_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1258:3: lv_parameters_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2757);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1274:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1274:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDifferenceOperator2770); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDifferenceOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1278:1: ( (lv_parameters_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1279:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1279:1: (lv_parameters_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1280:3: lv_parameters_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDifferenceOperatorAccess().getParametersStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2791);
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
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleDifferenceOperator2805); 

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


    // $ANTLR start "entryRuleMapOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1308:1: entryRuleMapOperator returns [EObject current=null] : iv_ruleMapOperator= ruleMapOperator EOF ;
    public final EObject entryRuleMapOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1309:2: (iv_ruleMapOperator= ruleMapOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1310:2: iv_ruleMapOperator= ruleMapOperator EOF
            {
             newCompositeNode(grammarAccess.getMapOperatorRule()); 
            pushFollow(FOLLOW_ruleMapOperator_in_entryRuleMapOperator2841);
            iv_ruleMapOperator=ruleMapOperator();

            state._fsp--;

             current =iv_ruleMapOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapOperator2851); 

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
    // $ANTLR end "entryRuleMapOperator"


    // $ANTLR start "ruleMapOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1317:1: ruleMapOperator returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '(' ( (lv_functionList_2_0= ruleFunctionStatement ) ) (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
    public final EObject ruleMapOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_functionList_2_0 = null;

        EObject lv_functionList_4_0 = null;

        EObject lv_stream_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1320:28: ( (otherlv_0= 'map' otherlv_1= '(' ( (lv_functionList_2_0= ruleFunctionStatement ) ) (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1321:1: (otherlv_0= 'map' otherlv_1= '(' ( (lv_functionList_2_0= ruleFunctionStatement ) ) (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1321:1: (otherlv_0= 'map' otherlv_1= '(' ( (lv_functionList_2_0= ruleFunctionStatement ) ) (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1321:3: otherlv_0= 'map' otherlv_1= '(' ( (lv_functionList_2_0= ruleFunctionStatement ) ) (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMapOperator2888); 

                	newLeafNode(otherlv_0, grammarAccess.getMapOperatorAccess().getMapKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMapOperator2900); 

                	newLeafNode(otherlv_1, grammarAccess.getMapOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1329:1: ( (lv_functionList_2_0= ruleFunctionStatement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1330:1: (lv_functionList_2_0= ruleFunctionStatement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1330:1: (lv_functionList_2_0= ruleFunctionStatement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1331:3: lv_functionList_2_0= ruleFunctionStatement
            {
             
            	        newCompositeNode(grammarAccess.getMapOperatorAccess().getFunctionListFunctionStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionStatement_in_ruleMapOperator2921);
            lv_functionList_2_0=ruleFunctionStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapOperatorRule());
            	        }
                   		add(
                   			current, 
                   			"functionList",
                    		lv_functionList_2_0, 
                    		"FunctionStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1347:2: (otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        int LA14_2 = input.LA(3);

                        if ( (LA14_2==19) ) {
                            alt14=1;
                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1347:4: otherlv_3= ',' ( (lv_functionList_4_0= ruleFunctionStatement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMapOperator2934); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMapOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1351:1: ( (lv_functionList_4_0= ruleFunctionStatement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1352:1: (lv_functionList_4_0= ruleFunctionStatement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1352:1: (lv_functionList_4_0= ruleFunctionStatement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1353:3: lv_functionList_4_0= ruleFunctionStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapOperatorAccess().getFunctionListFunctionStatementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionStatement_in_ruleMapOperator2955);
            	    lv_functionList_4_0=ruleFunctionStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionList",
            	            		lv_functionList_4_0, 
            	            		"FunctionStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleMapOperator2969); 

                	newLeafNode(otherlv_5, grammarAccess.getMapOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1373:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1374:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1374:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1375:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getMapOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleMapOperator2990);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMapOperator3002); 

                	newLeafNode(otherlv_7, grammarAccess.getMapOperatorAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleMapOperator"


    // $ANTLR start "entryRuleFunctionStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1403:1: entryRuleFunctionStatement returns [EObject current=null] : iv_ruleFunctionStatement= ruleFunctionStatement EOF ;
    public final EObject entryRuleFunctionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1404:2: (iv_ruleFunctionStatement= ruleFunctionStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1405:2: iv_ruleFunctionStatement= ruleFunctionStatement EOF
            {
             newCompositeNode(grammarAccess.getFunctionStatementRule()); 
            pushFollow(FOLLOW_ruleFunctionStatement_in_entryRuleFunctionStatement3038);
            iv_ruleFunctionStatement=ruleFunctionStatement();

            state._fsp--;

             current =iv_ruleFunctionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionStatement3048); 

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
    // $ANTLR end "entryRuleFunctionStatement"


    // $ANTLR start "ruleFunctionStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1412:1: ruleFunctionStatement returns [EObject current=null] : ( ( (lv_element_0_0= ruleStreamAccess ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ) ;
    public final EObject ruleFunctionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_element_0_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1415:28: ( ( ( (lv_element_0_0= ruleStreamAccess ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1416:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1416:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1416:2: ( (lv_element_0_0= ruleStreamAccess ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1416:2: ( (lv_element_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1417:1: (lv_element_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1417:1: (lv_element_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1418:3: lv_element_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getFunctionStatementAccess().getElementStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleFunctionStatement3094);
            lv_element_0_0=ruleStreamAccess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_0_0, 
                    		"StreamAccess");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleFunctionStatement3106); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionStatementAccess().getEqualsSignKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1438:1: ( (otherlv_2= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1439:1: (otherlv_2= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1439:1: (otherlv_2= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1440:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionStatementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionStatement3126); 

            		newLeafNode(otherlv_2, grammarAccess.getFunctionStatementAccess().getFunctionFunctionDefinitionCrossReference_2_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1451:2: (otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1451:4: otherlv_3= '(' ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )? otherlv_7= ')'
            {
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionStatement3139); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionStatementAccess().getLeftParenthesisKeyword_3_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1455:1: ( ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_NUMBER||LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1455:2: ( (lv_arguments_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )*
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1455:2: ( (lv_arguments_4_0= ruleExpression ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1456:1: (lv_arguments_4_0= ruleExpression )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1456:1: (lv_arguments_4_0= ruleExpression )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1457:3: lv_arguments_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionStatementAccess().getArgumentsExpressionParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionStatement3161);
                    lv_arguments_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1473:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1473:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFunctionStatement3174); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionStatementAccess().getCommaKeyword_3_1_1_0());
                    	        
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1477:1: ( (lv_arguments_6_0= ruleExpression ) )
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1478:1: (lv_arguments_6_0= ruleExpression )
                    	    {
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1478:1: (lv_arguments_6_0= ruleExpression )
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1479:3: lv_arguments_6_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionStatementAccess().getArgumentsExpressionParserRuleCall_3_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionStatement3195);
                    	    lv_arguments_6_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionStatementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFunctionStatement3211); 

                	newLeafNode(otherlv_7, grammarAccess.getFunctionStatementAccess().getRightParenthesisKeyword_3_2());
                

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
    // $ANTLR end "ruleFunctionStatement"


    // $ANTLR start "entryRuleInputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1507:1: entryRuleInputOperator returns [EObject current=null] : iv_ruleInputOperator= ruleInputOperator EOF ;
    public final EObject entryRuleInputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1508:2: (iv_ruleInputOperator= ruleInputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1509:2: iv_ruleInputOperator= ruleInputOperator EOF
            {
             newCompositeNode(grammarAccess.getInputOperatorRule()); 
            pushFollow(FOLLOW_ruleInputOperator_in_entryRuleInputOperator3248);
            iv_ruleInputOperator=ruleInputOperator();

            state._fsp--;

             current =iv_ruleInputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOperator3258); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1516:1: ruleInputOperator returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' ) ;
    public final EObject ruleInputOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_iri_2_0=null;
        Token otherlv_3=null;
        Token lv_iri_4_0=null;
        Token otherlv_5=null;
        Token lv_port_6_0=null;
        Token otherlv_7=null;
        Token lv_socket_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1519:28: ( (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1520:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1520:1: (otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1520:3: otherlv_0= 'in' otherlv_1= '(' ( (lv_iri_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )* otherlv_5= ',' ( (lv_port_6_0= RULE_NUMBER ) ) otherlv_7= ',' ( (lv_socket_8_0= RULE_STRING ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInputOperator3295); 

                	newLeafNode(otherlv_0, grammarAccess.getInputOperatorAccess().getInKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInputOperator3307); 

                	newLeafNode(otherlv_1, grammarAccess.getInputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1528:1: ( (lv_iri_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1529:1: (lv_iri_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1529:1: (lv_iri_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1530:3: lv_iri_2_0= RULE_STRING
            {
            lv_iri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator3324); 

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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1546:2: (otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1546:4: otherlv_3= ',' ( (lv_iri_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator3342); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInputOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1550:1: ( (lv_iri_4_0= RULE_STRING ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:1: (lv_iri_4_0= RULE_STRING )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1551:1: (lv_iri_4_0= RULE_STRING )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1552:3: lv_iri_4_0= RULE_STRING
            	    {
            	    lv_iri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator3359); 

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
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator3378); 

                	newLeafNode(otherlv_5, grammarAccess.getInputOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1572:1: ( (lv_port_6_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1573:1: (lv_port_6_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1573:1: (lv_port_6_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1574:3: lv_port_6_0= RULE_NUMBER
            {
            lv_port_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleInputOperator3395); 

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

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleInputOperator3412); 

                	newLeafNode(otherlv_7, grammarAccess.getInputOperatorAccess().getCommaKeyword_6());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1594:1: ( (lv_socket_8_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1595:1: (lv_socket_8_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1595:1: (lv_socket_8_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1596:3: lv_socket_8_0= RULE_STRING
            {
            lv_socket_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputOperator3429); 

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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleInputOperator3446); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1624:1: entryRuleReturnTypeOperator returns [EObject current=null] : iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF ;
    public final EObject entryRuleReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1625:2: (iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1626:2: iv_ruleReturnTypeOperator= ruleReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator3482);
            iv_ruleReturnTypeOperator=ruleReturnTypeOperator();

            state._fsp--;

             current =iv_ruleReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnTypeOperator3492); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1633:1: ruleReturnTypeOperator returns [EObject current=null] : (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_MapOperator_13= ruleMapOperator | this_OCLOperator_14= ruleOCLOperator | this_SWRLOperator_15= ruleSWRLOperator ) ;
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

        EObject this_MapOperator_13 = null;

        EObject this_OCLOperator_14 = null;

        EObject this_SWRLOperator_15 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1636:28: ( (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_MapOperator_13= ruleMapOperator | this_OCLOperator_14= ruleOCLOperator | this_SWRLOperator_15= ruleSWRLOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1637:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_MapOperator_13= ruleMapOperator | this_OCLOperator_14= ruleOCLOperator | this_SWRLOperator_15= ruleSWRLOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1637:1: (this_InputOperator_0= ruleInputOperator | this_JoinOperator_1= ruleJoinOperator | this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator | this_DifferenceOperator_3= ruleDifferenceOperator | this_TagOperator_4= ruleTagOperator | this_UnTagOperator_5= ruleUnTagOperator | this_FilterOperator_6= ruleFilterOperator | this_SplitOperator_7= ruleSplitOperator | this_CountOperator_8= ruleCountOperator | this_StandardDeviationOperator_9= ruleStandardDeviationOperator | this_AverageOperator_10= ruleAverageOperator | this_ElementJoinOperator_11= ruleElementJoinOperator | this_MatchOperator_12= ruleMatchOperator | this_MapOperator_13= ruleMapOperator | this_OCLOperator_14= ruleOCLOperator | this_SWRLOperator_15= ruleSWRLOperator )
            int alt18=16;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            case 30:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            case 26:
                {
                alt18=7;
                }
                break;
            case 27:
                {
                alt18=8;
                }
                break;
            case 52:
                {
                alt18=9;
                }
                break;
            case 53:
                {
                alt18=10;
                }
                break;
            case 54:
                {
                alt18=11;
                }
                break;
            case 25:
                {
                alt18=12;
                }
                break;
            case 28:
                {
                alt18=13;
                }
                break;
            case 31:
                {
                alt18=14;
                }
                break;
            case 51:
                {
                alt18=15;
                }
                break;
            case 46:
                {
                alt18=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1638:5: this_InputOperator_0= ruleInputOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getInputOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator3539);
                    this_InputOperator_0=ruleInputOperator();

                    state._fsp--;

                     
                            current = this_InputOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1648:5: this_JoinOperator_1= ruleJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getJoinOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator3566);
                    this_JoinOperator_1=ruleJoinOperator();

                    state._fsp--;

                     
                            current = this_JoinOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1658:5: this_SymmetricDifferenceOperator_2= ruleSymmetricDifferenceOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSymmetricDifferenceOperatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSymmetricDifferenceOperator_in_ruleReturnTypeOperator3593);
                    this_SymmetricDifferenceOperator_2=ruleSymmetricDifferenceOperator();

                    state._fsp--;

                     
                            current = this_SymmetricDifferenceOperator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1668:5: this_DifferenceOperator_3= ruleDifferenceOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getDifferenceOperatorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDifferenceOperator_in_ruleReturnTypeOperator3620);
                    this_DifferenceOperator_3=ruleDifferenceOperator();

                    state._fsp--;

                     
                            current = this_DifferenceOperator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1678:5: this_TagOperator_4= ruleTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getTagOperatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator3647);
                    this_TagOperator_4=ruleTagOperator();

                    state._fsp--;

                     
                            current = this_TagOperator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1688:5: this_UnTagOperator_5= ruleUnTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getUnTagOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator3674);
                    this_UnTagOperator_5=ruleUnTagOperator();

                    state._fsp--;

                     
                            current = this_UnTagOperator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1698:5: this_FilterOperator_6= ruleFilterOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getFilterOperatorParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator3701);
                    this_FilterOperator_6=ruleFilterOperator();

                    state._fsp--;

                     
                            current = this_FilterOperator_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1708:5: this_SplitOperator_7= ruleSplitOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSplitOperatorParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator3728);
                    this_SplitOperator_7=ruleSplitOperator();

                    state._fsp--;

                     
                            current = this_SplitOperator_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1718:5: this_CountOperator_8= ruleCountOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getCountOperatorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator3755);
                    this_CountOperator_8=ruleCountOperator();

                    state._fsp--;

                     
                            current = this_CountOperator_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1728:5: this_StandardDeviationOperator_9= ruleStandardDeviationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getStandardDeviationOperatorParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator3782);
                    this_StandardDeviationOperator_9=ruleStandardDeviationOperator();

                    state._fsp--;

                     
                            current = this_StandardDeviationOperator_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1738:5: this_AverageOperator_10= ruleAverageOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getAverageOperatorParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator3809);
                    this_AverageOperator_10=ruleAverageOperator();

                    state._fsp--;

                     
                            current = this_AverageOperator_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1748:5: this_ElementJoinOperator_11= ruleElementJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getElementJoinOperatorParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator3836);
                    this_ElementJoinOperator_11=ruleElementJoinOperator();

                    state._fsp--;

                     
                            current = this_ElementJoinOperator_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1758:5: this_MatchOperator_12= ruleMatchOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMatchOperatorParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator3863);
                    this_MatchOperator_12=ruleMatchOperator();

                    state._fsp--;

                     
                            current = this_MatchOperator_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1768:5: this_MapOperator_13= ruleMapOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getMapOperatorParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleMapOperator_in_ruleReturnTypeOperator3890);
                    this_MapOperator_13=ruleMapOperator();

                    state._fsp--;

                     
                            current = this_MapOperator_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1778:5: this_OCLOperator_14= ruleOCLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getOCLOperatorParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator3917);
                    this_OCLOperator_14=ruleOCLOperator();

                    state._fsp--;

                     
                            current = this_OCLOperator_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1788:5: this_SWRLOperator_15= ruleSWRLOperator
                    {
                     
                            newCompositeNode(grammarAccess.getReturnTypeOperatorAccess().getSWRLOperatorParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator3944);
                    this_SWRLOperator_15=ruleSWRLOperator();

                    state._fsp--;

                     
                            current = this_SWRLOperator_15; 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1804:1: entryRuleNoReturnTypeOperator returns [EObject current=null] : iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF ;
    public final EObject entryRuleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoReturnTypeOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1805:2: (iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1806:2: iv_ruleNoReturnTypeOperator= ruleNoReturnTypeOperator EOF
            {
             newCompositeNode(grammarAccess.getNoReturnTypeOperatorRule()); 
            pushFollow(FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3979);
            iv_ruleNoReturnTypeOperator=ruleNoReturnTypeOperator();

            state._fsp--;

             current =iv_ruleNoReturnTypeOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3989); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1813:1: ruleNoReturnTypeOperator returns [EObject current=null] : this_OutputOperator_0= ruleOutputOperator ;
    public final EObject ruleNoReturnTypeOperator() throws RecognitionException {
        EObject current = null;

        EObject this_OutputOperator_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1816:28: (this_OutputOperator_0= ruleOutputOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1818:5: this_OutputOperator_0= ruleOutputOperator
            {
             
                    newCompositeNode(grammarAccess.getNoReturnTypeOperatorAccess().getOutputOperatorParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator4035);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1834:1: entryRuleTagOperator returns [EObject current=null] : iv_ruleTagOperator= ruleTagOperator EOF ;
    public final EObject entryRuleTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1835:2: (iv_ruleTagOperator= ruleTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1836:2: iv_ruleTagOperator= ruleTagOperator EOF
            {
             newCompositeNode(grammarAccess.getTagOperatorRule()); 
            pushFollow(FOLLOW_ruleTagOperator_in_entryRuleTagOperator4069);
            iv_ruleTagOperator=ruleTagOperator();

            state._fsp--;

             current =iv_ruleTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagOperator4079); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1843:1: ruleTagOperator returns [EObject current=null] : (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
    public final EObject ruleTagOperator() throws RecognitionException {
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1846:28: ( (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1847:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1847:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1847:3: otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleTagOperator4116); 

                	newLeafNode(otherlv_0, grammarAccess.getTagOperatorAccess().getTagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTagOperator4128); 

                	newLeafNode(otherlv_1, grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1855:1: ( (lv_parameters_2_0= ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1856:1: (lv_parameters_2_0= ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1856:1: (lv_parameters_2_0= ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1857:3: lv_parameters_2_0= ruleTagElement
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator4149);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1873:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_ID) ) {
                        int LA19_2 = input.LA(3);

                        if ( (LA19_2==19) ) {
                            alt19=1;
                        }


                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1873:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTagOperator4162); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1877:1: ( (lv_parameters_4_0= ruleTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1878:1: (lv_parameters_4_0= ruleTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1878:1: (lv_parameters_4_0= ruleTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1879:3: lv_parameters_4_0= ruleTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator4183);
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
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleTagOperator4197); 

                	newLeafNode(otherlv_5, grammarAccess.getTagOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1899:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1900:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1900:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1901:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleTagOperator4218);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTagOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleTagOperator4230); 

                	newLeafNode(otherlv_7, grammarAccess.getTagOperatorAccess().getRightParenthesisKeyword_6());
                

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


    // $ANTLR start "entryRuleUnTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1929:1: entryRuleUnTagOperator returns [EObject current=null] : iv_ruleUnTagOperator= ruleUnTagOperator EOF ;
    public final EObject entryRuleUnTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1930:2: (iv_ruleUnTagOperator= ruleUnTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1931:2: iv_ruleUnTagOperator= ruleUnTagOperator EOF
            {
             newCompositeNode(grammarAccess.getUnTagOperatorRule()); 
            pushFollow(FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator4266);
            iv_ruleUnTagOperator=ruleUnTagOperator();

            state._fsp--;

             current =iv_ruleUnTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagOperator4276); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1938:1: ruleUnTagOperator returns [EObject current=null] : (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1941:28: ( (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1942:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1942:1: (otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1942:3: otherlv_0= 'untag' otherlv_1= '(' ( (lv_parameters_2_0= ruleUnTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleUnTagOperator4313); 

                	newLeafNode(otherlv_0, grammarAccess.getUnTagOperatorAccess().getUntagKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUnTagOperator4325); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1950:1: ( (lv_parameters_2_0= ruleUnTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1951:1: (lv_parameters_2_0= ruleUnTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1951:1: (lv_parameters_2_0= ruleUnTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1952:3: lv_parameters_2_0= ruleUnTagElement
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4346);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1968:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_STRING) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1968:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator4359); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1972:1: ( (lv_parameters_4_0= ruleUnTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1973:1: (lv_parameters_4_0= ruleUnTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1973:1: (lv_parameters_4_0= ruleUnTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1974:3: lv_parameters_4_0= ruleUnTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getParametersUnTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4380);
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
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUnTagOperator4394); 

                	newLeafNode(otherlv_5, grammarAccess.getUnTagOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1994:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1995:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1995:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1996:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getUnTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator4415);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleUnTagOperator4427); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2024:1: entryRuleUnTagElement returns [EObject current=null] : iv_ruleUnTagElement= ruleUnTagElement EOF ;
    public final EObject entryRuleUnTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2025:2: (iv_ruleUnTagElement= ruleUnTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2026:2: iv_ruleUnTagElement= ruleUnTagElement EOF
            {
             newCompositeNode(grammarAccess.getUnTagElementRule()); 
            pushFollow(FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement4463);
            iv_ruleUnTagElement=ruleUnTagElement();

            state._fsp--;

             current =iv_ruleUnTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnTagElement4473); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2033:1: ruleUnTagElement returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) ;
    public final EObject ruleUnTagElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2036:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2037:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2037:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2037:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= 'is' ( (lv_reference_2_0= ruleStreamAccess ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2037:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2038:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2038:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2039:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnTagElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUnTagElement4518); 

            		newLeafNode(otherlv_0, grammarAccess.getUnTagElementAccess().getElementOWLClassCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleUnTagElement4530); 

                	newLeafNode(otherlv_1, grammarAccess.getUnTagElementAccess().getIsKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2054:1: ( (lv_reference_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2055:1: (lv_reference_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2055:1: (lv_reference_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2056:3: lv_reference_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getUnTagElementAccess().getReferenceStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleUnTagElement4551);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2080:1: entryRuleTagElement returns [EObject current=null] : iv_ruleTagElement= ruleTagElement EOF ;
    public final EObject entryRuleTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2081:2: (iv_ruleTagElement= ruleTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2082:2: iv_ruleTagElement= ruleTagElement EOF
            {
             newCompositeNode(grammarAccess.getTagElementRule()); 
            pushFollow(FOLLOW_ruleTagElement_in_entryRuleTagElement4587);
            iv_ruleTagElement=ruleTagElement();

            state._fsp--;

             current =iv_ruleTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagElement4597); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2089:1: ruleTagElement returns [EObject current=null] : (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) ;
    public final EObject ruleTagElement() throws RecognitionException {
        EObject current = null;

        EObject this_TagClassElement_0 = null;

        EObject this_TagObjectPropertyElement_1 = null;

        EObject this_TagDataTypePropertyElement_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2092:28: ( (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2093:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2093:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==19) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==RULE_ID) ) {
                        int LA21_3 = input.LA(4);

                        if ( (LA21_3==35) ) {
                            switch ( input.LA(5) ) {
                            case 36:
                                {
                                alt21=1;
                                }
                                break;
                            case 38:
                                {
                                alt21=3;
                                }
                                break;
                            case 37:
                                {
                                alt21=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 21, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2094:5: this_TagClassElement_0= ruleTagClassElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTagClassElement_in_ruleTagElement4644);
                    this_TagClassElement_0=ruleTagClassElement();

                    state._fsp--;

                     
                            current = this_TagClassElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2104:5: this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4671);
                    this_TagObjectPropertyElement_1=ruleTagObjectPropertyElement();

                    state._fsp--;

                     
                            current = this_TagObjectPropertyElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2114:5: this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4698);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2130:1: entryRuleTagClassElement returns [EObject current=null] : iv_ruleTagClassElement= ruleTagClassElement EOF ;
    public final EObject entryRuleTagClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagClassElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2131:2: (iv_ruleTagClassElement= ruleTagClassElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2132:2: iv_ruleTagClassElement= ruleTagClassElement EOF
            {
             newCompositeNode(grammarAccess.getTagClassElementRule()); 
            pushFollow(FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4733);
            iv_ruleTagClassElement=ruleTagClassElement();

            state._fsp--;

             current =iv_ruleTagClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagClassElement4743); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2139:1: ruleTagClassElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagClassElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2142:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2143:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2143:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2143:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2143:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2144:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2144:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2145:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagClassElement4789);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTagClassElement4801); 

                	newLeafNode(otherlv_1, grammarAccess.getTagClassElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleTagClassElement4813); 

                	newLeafNode(otherlv_2, grammarAccess.getTagClassElementAccess().getClassKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2169:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2170:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2170:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2171:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagClassElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagClassElement4833); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2190:1: entryRuleTagObjectPropertyElement returns [EObject current=null] : iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF ;
    public final EObject entryRuleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagObjectPropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2191:2: (iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2192:2: iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagObjectPropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4869);
            iv_ruleTagObjectPropertyElement=ruleTagObjectPropertyElement();

            state._fsp--;

             current =iv_ruleTagObjectPropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4879); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2199:1: ruleTagObjectPropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2202:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2203:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2203:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2203:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2203:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2204:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2204:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2205:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4925);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTagObjectPropertyElement4937); 

                	newLeafNode(otherlv_1, grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTagObjectPropertyElement4949); 

                	newLeafNode(otherlv_2, grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2229:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2230:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2230:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2231:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagObjectPropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4969); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2250:1: entryRuleTagDataTypePropertyElement returns [EObject current=null] : iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF ;
    public final EObject entryRuleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagDataTypePropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2251:2: (iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2252:2: iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagDataTypePropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement5005);
            iv_ruleTagDataTypePropertyElement=ruleTagDataTypePropertyElement();

            state._fsp--;

             current =iv_ruleTagDataTypePropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement5015); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2259:1: ruleTagDataTypePropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2262:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2263:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2263:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2263:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2263:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2264:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2264:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2265:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement5061);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTagDataTypePropertyElement5073); 

                	newLeafNode(otherlv_1, grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleTagDataTypePropertyElement5085); 

                	newLeafNode(otherlv_2, grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2289:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2290:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2290:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2291:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagDataTypePropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement5105); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2310:1: entryRuleBarrierOperator returns [EObject current=null] : iv_ruleBarrierOperator= ruleBarrierOperator EOF ;
    public final EObject entryRuleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrierOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2311:2: (iv_ruleBarrierOperator= ruleBarrierOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2312:2: iv_ruleBarrierOperator= ruleBarrierOperator EOF
            {
             newCompositeNode(grammarAccess.getBarrierOperatorRule()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator5141);
            iv_ruleBarrierOperator=ruleBarrierOperator();

            state._fsp--;

             current =iv_ruleBarrierOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrierOperator5151); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2319:1: ruleBarrierOperator returns [EObject current=null] : (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) ;
    public final EObject ruleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject this_WindowOperator_0 = null;

        EObject this_MarkerOperator_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2322:28: ( (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2323:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2323:1: (this_WindowOperator_0= ruleWindowOperator | this_MarkerOperator_1= ruleMarkerOperator )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39||LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2324:5: this_WindowOperator_0= ruleWindowOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWindowOperator_in_ruleBarrierOperator5198);
                    this_WindowOperator_0=ruleWindowOperator();

                    state._fsp--;

                     
                            current = this_WindowOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2334:5: this_MarkerOperator_1= ruleMarkerOperator
                    {
                     
                            newCompositeNode(grammarAccess.getBarrierOperatorAccess().getMarkerOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator5225);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2350:1: entryRuleWindowOperator returns [EObject current=null] : iv_ruleWindowOperator= ruleWindowOperator EOF ;
    public final EObject entryRuleWindowOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2351:2: (iv_ruleWindowOperator= ruleWindowOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2352:2: iv_ruleWindowOperator= ruleWindowOperator EOF
            {
             newCompositeNode(grammarAccess.getWindowOperatorRule()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator5260);
            iv_ruleWindowOperator=ruleWindowOperator();

            state._fsp--;

             current =iv_ruleWindowOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindowOperator5270); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2359:1: ruleWindowOperator returns [EObject current=null] : ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2362:28: ( ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:3: ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2363:3: ( (lv_setting_0_0= 'last' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2364:1: (lv_setting_0_0= 'last' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2364:1: (lv_setting_0_0= 'last' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2365:3: lv_setting_0_0= 'last'
                    {
                    lv_setting_0_0=(Token)match(input,39,FOLLOW_39_in_ruleWindowOperator5314); 

                            newLeafNode(lv_setting_0_0, grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "setting", lv_setting_0_0, "last");
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2378:2: ( (lv_value_1_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2379:1: (lv_value_1_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2379:1: (lv_value_1_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2380:3: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleWindowOperator5344); 

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

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2396:2: ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=40 && LA24_0<=43)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2397:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2397:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2398:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2398:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            int alt23=4;
                            switch ( input.LA(1) ) {
                            case 40:
                                {
                                alt23=1;
                                }
                                break;
                            case 41:
                                {
                                alt23=2;
                                }
                                break;
                            case 42:
                                {
                                alt23=3;
                                }
                                break;
                            case 43:
                                {
                                alt23=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 0, input);

                                throw nvae;
                            }

                            switch (alt23) {
                                case 1 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2399:3: lv_unit_2_1= 'min'
                                    {
                                    lv_unit_2_1=(Token)match(input,40,FOLLOW_40_in_ruleWindowOperator5369); 

                                            newLeafNode(lv_unit_2_1, grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2411:8: lv_unit_2_2= 'hrs'
                                    {
                                    lv_unit_2_2=(Token)match(input,41,FOLLOW_41_in_ruleWindowOperator5398); 

                                            newLeafNode(lv_unit_2_2, grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_2, null);
                                    	    

                                    }
                                    break;
                                case 3 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2423:8: lv_unit_2_3= 'sec'
                                    {
                                    lv_unit_2_3=(Token)match(input,42,FOLLOW_42_in_ruleWindowOperator5427); 

                                            newLeafNode(lv_unit_2_3, grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_3, null);
                                    	    

                                    }
                                    break;
                                case 4 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2435:8: lv_unit_2_4= 'elements'
                                    {
                                    lv_unit_2_4=(Token)match(input,43,FOLLOW_43_in_ruleWindowOperator5456); 

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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2451:6: ( (lv_setting_3_0= 'now' ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2451:6: ( (lv_setting_3_0= 'now' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2452:1: (lv_setting_3_0= 'now' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2452:1: (lv_setting_3_0= 'now' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2453:3: lv_setting_3_0= 'now'
                    {
                    lv_setting_3_0=(Token)match(input,44,FOLLOW_44_in_ruleWindowOperator5498); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2474:1: entryRuleMarkerOperator returns [EObject current=null] : iv_ruleMarkerOperator= ruleMarkerOperator EOF ;
    public final EObject entryRuleMarkerOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkerOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2475:2: (iv_ruleMarkerOperator= ruleMarkerOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2476:2: iv_ruleMarkerOperator= ruleMarkerOperator EOF
            {
             newCompositeNode(grammarAccess.getMarkerOperatorRule()); 
            pushFollow(FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5547);
            iv_ruleMarkerOperator=ruleMarkerOperator();

            state._fsp--;

             current =iv_ruleMarkerOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkerOperator5557); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2483:1: ruleMarkerOperator returns [EObject current=null] : (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleMarkerOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2486:28: ( (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2487:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2487:1: (otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2487:3: otherlv_0= 'marker' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleMarkerOperator5594); 

                	newLeafNode(otherlv_0, grammarAccess.getMarkerOperatorAccess().getMarkerKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2491:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2492:1: (lv_expression_1_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2492:1: (lv_expression_1_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2493:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMarkerOperatorAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMarkerOperator5615);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2517:1: entryRuleSWRLOperator returns [EObject current=null] : iv_ruleSWRLOperator= ruleSWRLOperator EOF ;
    public final EObject entryRuleSWRLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2518:2: (iv_ruleSWRLOperator= ruleSWRLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2519:2: iv_ruleSWRLOperator= ruleSWRLOperator EOF
            {
             newCompositeNode(grammarAccess.getSWRLOperatorRule()); 
            pushFollow(FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5651);
            iv_ruleSWRLOperator=ruleSWRLOperator();

            state._fsp--;

             current =iv_ruleSWRLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLOperator5661); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2526:1: ruleSWRLOperator returns [EObject current=null] : (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2529:28: ( (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2530:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2530:1: (otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2530:3: otherlv_0= 'swrl' otherlv_1= '(' ( (lv_rule_2_0= ruleSWRLRule ) ) otherlv_3= ',' ( (lv_barrier_4_0= ruleStreamOperatorParameter ) ) (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSWRLOperator5698); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLOperatorAccess().getSwrlKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLOperator5710); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2538:1: ( (lv_rule_2_0= ruleSWRLRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2539:1: (lv_rule_2_0= ruleSWRLRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2539:1: (lv_rule_2_0= ruleSWRLRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2540:3: lv_rule_2_0= ruleSWRLRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getRuleSWRLRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5731);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5743); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2560:1: ( (lv_barrier_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2561:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2561:1: (lv_barrier_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2562:3: lv_barrier_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5764);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2578:2: (otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2578:4: otherlv_5= ',' ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSWRLOperator5777); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSWRLOperatorAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2582:1: ( (lv_barrier_6_0= ruleStreamOperatorParameter ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2583:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2583:1: (lv_barrier_6_0= ruleStreamOperatorParameter )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2584:3: lv_barrier_6_0= ruleStreamOperatorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSWRLOperatorAccess().getBarrierStreamOperatorParameterParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5798);
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
            	    break loop26;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSWRLOperator5812); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2612:1: entryRuleSWRLRule returns [EObject current=null] : iv_ruleSWRLRule= ruleSWRLRule EOF ;
    public final EObject entryRuleSWRLRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSWRLRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2613:2: (iv_ruleSWRLRule= ruleSWRLRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2614:2: iv_ruleSWRLRule= ruleSWRLRule EOF
            {
             newCompositeNode(grammarAccess.getSWRLRuleRule()); 
            pushFollow(FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5848);
            iv_ruleSWRLRule=ruleSWRLRule();

            state._fsp--;

             current =iv_ruleSWRLRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSWRLRule5858); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2621:1: ruleSWRLRule returns [EObject current=null] : (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2624:28: ( (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2625:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2625:1: (otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2625:3: otherlv_0= 'Implies' otherlv_1= '(' ( (lv_antecedent_2_0= ruleAntecedentRule ) ) otherlv_3= ',' ( (lv_consequent_4_0= ruleConsequentRule ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSWRLRule5895); 

                	newLeafNode(otherlv_0, grammarAccess.getSWRLRuleAccess().getImpliesKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSWRLRule5907); 

                	newLeafNode(otherlv_1, grammarAccess.getSWRLRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2633:1: ( (lv_antecedent_2_0= ruleAntecedentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2634:1: (lv_antecedent_2_0= ruleAntecedentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2634:1: (lv_antecedent_2_0= ruleAntecedentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2635:3: lv_antecedent_2_0= ruleAntecedentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getAntecedentAntecedentRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5928);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSWRLRule5940); 

                	newLeafNode(otherlv_3, grammarAccess.getSWRLRuleAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2655:1: ( (lv_consequent_4_0= ruleConsequentRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2656:1: (lv_consequent_4_0= ruleConsequentRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2656:1: (lv_consequent_4_0= ruleConsequentRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2657:3: lv_consequent_4_0= ruleConsequentRule
            {
             
            	        newCompositeNode(grammarAccess.getSWRLRuleAccess().getConsequentConsequentRuleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleConsequentRule_in_ruleSWRLRule5961);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSWRLRule5973); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2685:1: entryRuleAntecedentRule returns [EObject current=null] : iv_ruleAntecedentRule= ruleAntecedentRule EOF ;
    public final EObject entryRuleAntecedentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntecedentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2686:2: (iv_ruleAntecedentRule= ruleAntecedentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2687:2: iv_ruleAntecedentRule= ruleAntecedentRule EOF
            {
             newCompositeNode(grammarAccess.getAntecedentRuleRule()); 
            pushFollow(FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule6009);
            iv_ruleAntecedentRule=ruleAntecedentRule();

            state._fsp--;

             current =iv_ruleAntecedentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntecedentRule6019); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2694:1: ruleAntecedentRule returns [EObject current=null] : (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2697:28: ( (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2698:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2698:1: (otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2698:3: otherlv_0= 'Antecedent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleAntecedentRule6056); 

                	newLeafNode(otherlv_0, grammarAccess.getAntecedentRuleAccess().getAntecedentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAntecedentRule6068); 

                	newLeafNode(otherlv_1, grammarAccess.getAntecedentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2706:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2707:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2707:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2708:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule6089);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2724:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2724:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAntecedentRule6102); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAntecedentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2728:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2729:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2729:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2730:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAntecedentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleAntecedentRule6123);
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
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAntecedentRule6137); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2758:1: entryRuleConsequentRule returns [EObject current=null] : iv_ruleConsequentRule= ruleConsequentRule EOF ;
    public final EObject entryRuleConsequentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsequentRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2759:2: (iv_ruleConsequentRule= ruleConsequentRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2760:2: iv_ruleConsequentRule= ruleConsequentRule EOF
            {
             newCompositeNode(grammarAccess.getConsequentRuleRule()); 
            pushFollow(FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule6173);
            iv_ruleConsequentRule=ruleConsequentRule();

            state._fsp--;

             current =iv_ruleConsequentRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsequentRule6183); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2767:1: ruleConsequentRule returns [EObject current=null] : (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2770:28: ( (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2771:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2771:1: (otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2771:3: otherlv_0= 'Consequent' otherlv_1= '(' ( (lv_atoms_2_0= ruleRule ) ) (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleConsequentRule6220); 

                	newLeafNode(otherlv_0, grammarAccess.getConsequentRuleAccess().getConsequentKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleConsequentRule6232); 

                	newLeafNode(otherlv_1, grammarAccess.getConsequentRuleAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2779:1: ( (lv_atoms_2_0= ruleRule ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2780:1: (lv_atoms_2_0= ruleRule )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2780:1: (lv_atoms_2_0= ruleRule )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2781:3: lv_atoms_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule6253);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2797:2: (otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2797:4: otherlv_3= ',' ( (lv_atoms_4_0= ruleRule ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConsequentRule6266); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConsequentRuleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2801:1: ( (lv_atoms_4_0= ruleRule ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2802:1: (lv_atoms_4_0= ruleRule )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2802:1: (lv_atoms_4_0= ruleRule )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2803:3: lv_atoms_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConsequentRuleAccess().getAtomsRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleConsequentRule6287);
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
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleConsequentRule6301); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2831:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2832:2: (iv_ruleRule= ruleRule EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2833:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule6337);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule6347); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2840:1: ruleRule returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2843:28: ( ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2844:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2844:1: ( ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2844:2: ( (otherlv_0= RULE_STRING ) ) otherlv_1= '(' otherlv_2= '?' ( (lv_variable_3_0= ruleStreamAccess ) ) (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )* otherlv_7= ')'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2844:2: ( (otherlv_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2845:1: (otherlv_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2845:1: (otherlv_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2846:3: otherlv_0= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule6392); 

            		newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getNameOWLObjectPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRule6404); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleRule6416); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getQuestionMarkKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2865:1: ( (lv_variable_3_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2866:1: (lv_variable_3_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2866:1: (lv_variable_3_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2867:3: lv_variable_3_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule6437);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2883:2: (otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2883:4: otherlv_4= ',' otherlv_5= '?' ( (lv_variable_6_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRule6450); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getCommaKeyword_4_0());
            	        
            	    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleRule6462); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getQuestionMarkKeyword_4_1());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2891:1: ( (lv_variable_6_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2892:1: (lv_variable_6_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2892:1: (lv_variable_6_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2893:3: lv_variable_6_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getVariableStreamAccessParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleRule6483);
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
            	    break loop29;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleRule6497); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2921:1: entryRuleOCLOperator returns [EObject current=null] : iv_ruleOCLOperator= ruleOCLOperator EOF ;
    public final EObject entryRuleOCLOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2922:2: (iv_ruleOCLOperator= ruleOCLOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2923:2: iv_ruleOCLOperator= ruleOCLOperator EOF
            {
             newCompositeNode(grammarAccess.getOCLOperatorRule()); 
            pushFollow(FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator6533);
            iv_ruleOCLOperator=ruleOCLOperator();

            state._fsp--;

             current =iv_ruleOCLOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperator6543); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2930:1: ruleOCLOperator returns [EObject current=null] : (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2933:28: ( (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2934:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2934:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2934:3: otherlv_0= 'ocl' otherlv_1= '(' ( (lv_constraint_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleOCLOperator6580); 

                	newLeafNode(otherlv_0, grammarAccess.getOCLOperatorAccess().getOclKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOCLOperator6592); 

                	newLeafNode(otherlv_1, grammarAccess.getOCLOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2942:1: ( (lv_constraint_2_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2943:1: (lv_constraint_2_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2943:1: (lv_constraint_2_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2944:3: lv_constraint_2_0= RULE_STRING
            {
            lv_constraint_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOCLOperator6609); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOCLOperator6626); 

                	newLeafNode(otherlv_3, grammarAccess.getOCLOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2964:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2965:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2965:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2966:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOCLOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6647);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOCLOperator6659); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2994:1: entryRuleCountOperator returns [EObject current=null] : iv_ruleCountOperator= ruleCountOperator EOF ;
    public final EObject entryRuleCountOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2995:2: (iv_ruleCountOperator= ruleCountOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:2996:2: iv_ruleCountOperator= ruleCountOperator EOF
            {
             newCompositeNode(grammarAccess.getCountOperatorRule()); 
            pushFollow(FOLLOW_ruleCountOperator_in_entryRuleCountOperator6695);
            iv_ruleCountOperator=ruleCountOperator();

            state._fsp--;

             current =iv_ruleCountOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountOperator6705); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3003:1: ruleCountOperator returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3006:28: ( (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3007:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3007:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3007:3: otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleCountOperator6742); 

                	newLeafNode(otherlv_0, grammarAccess.getCountOperatorAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCountOperator6754); 

                	newLeafNode(otherlv_1, grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3015:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3016:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3016:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3017:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleCountOperator6775);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCountOperator6787); 

                	newLeafNode(otherlv_3, grammarAccess.getCountOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3037:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3038:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3038:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3039:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6808);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCountOperator6820); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3067:1: entryRuleStandardDeviationOperator returns [EObject current=null] : iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF ;
    public final EObject entryRuleStandardDeviationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3068:2: (iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3069:2: iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF
            {
             newCompositeNode(grammarAccess.getStandardDeviationOperatorRule()); 
            pushFollow(FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6856);
            iv_ruleStandardDeviationOperator=ruleStandardDeviationOperator();

            state._fsp--;

             current =iv_ruleStandardDeviationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardDeviationOperator6866); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3076:1: ruleStandardDeviationOperator returns [EObject current=null] : (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3079:28: ( (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3080:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3080:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3080:3: otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleStandardDeviationOperator6903); 

                	newLeafNode(otherlv_0, grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStandardDeviationOperator6915); 

                	newLeafNode(otherlv_1, grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3088:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3089:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3089:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3090:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6936);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStandardDeviationOperator6948); 

                	newLeafNode(otherlv_3, grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3110:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3111:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3111:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3112:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6969);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleStandardDeviationOperator6981); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3140:1: entryRuleAverageOperator returns [EObject current=null] : iv_ruleAverageOperator= ruleAverageOperator EOF ;
    public final EObject entryRuleAverageOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3141:2: (iv_ruleAverageOperator= ruleAverageOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3142:2: iv_ruleAverageOperator= ruleAverageOperator EOF
            {
             newCompositeNode(grammarAccess.getAverageOperatorRule()); 
            pushFollow(FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator7017);
            iv_ruleAverageOperator=ruleAverageOperator();

            state._fsp--;

             current =iv_ruleAverageOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageOperator7027); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3149:1: ruleAverageOperator returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3152:28: ( (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3153:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3153:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3153:3: otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleAverageOperator7064); 

                	newLeafNode(otherlv_0, grammarAccess.getAverageOperatorAccess().getAvgKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAverageOperator7076); 

                	newLeafNode(otherlv_1, grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3161:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3162:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3162:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3163:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAverageOperator7097);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAverageOperator7109); 

                	newLeafNode(otherlv_3, grammarAccess.getAverageOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3183:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3184:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3184:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3185:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator7130);
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

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleAverageOperator7142); 

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


    // $ANTLR start "entryRuleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3213:1: entryRuleOutputOperator returns [EObject current=null] : iv_ruleOutputOperator= ruleOutputOperator EOF ;
    public final EObject entryRuleOutputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3214:2: (iv_ruleOutputOperator= ruleOutputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3215:2: iv_ruleOutputOperator= ruleOutputOperator EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorRule()); 
            pushFollow(FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator7178);
            iv_ruleOutputOperator=ruleOutputOperator();

            state._fsp--;

             current =iv_ruleOutputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperator7188); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3222:1: ruleOutputOperator returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3225:28: ( (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3226:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3226:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3226:3: otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleOutputOperator7225); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputOperatorAccess().getOutKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOutputOperator7237); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3234:1: ( (lv_parameter_2_0= ruleOutputOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3235:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3235:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3236:3: lv_parameter_2_0= ruleOutputOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator7258);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7270); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3256:1: ( (lv_location_4_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:1: (lv_location_4_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3257:1: (lv_location_4_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3258:3: lv_location_4_0= RULE_STRING
            {
            lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator7287); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperator7304); 

                	newLeafNode(otherlv_5, grammarAccess.getOutputOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3278:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3279:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3279:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3280:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator7325);
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

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleOutputOperator7337); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleOutputOperator7349); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3312:1: entryRuleOutputOperatorParameter returns [EObject current=null] : iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF ;
    public final EObject entryRuleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3313:2: (iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3314:2: iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter7385);
            iv_ruleOutputOperatorParameter=ruleOutputOperatorParameter();

            state._fsp--;

             current =iv_ruleOutputOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperatorParameter7395); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3321:1: ruleOutputOperatorParameter returns [EObject current=null] : ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) ;
    public final EObject ruleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_element_0_0 = null;

        EObject lv_element_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3324:28: ( ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3325:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3325:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3325:2: ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3325:2: ( (lv_element_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3326:1: (lv_element_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3326:1: (lv_element_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3327:3: lv_element_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter7441);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3343:2: (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3343:4: otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOutputOperatorParameter7454); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorParameterAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3347:1: ( (lv_element_2_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3348:1: (lv_element_2_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3348:1: (lv_element_2_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3349:3: lv_element_2_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter7475);
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
            	    break loop30;
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


    // $ANTLR start "entryRuleProcessingExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3373:1: entryRuleProcessingExpression returns [EObject current=null] : iv_ruleProcessingExpression= ruleProcessingExpression EOF ;
    public final EObject entryRuleProcessingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3374:2: (iv_ruleProcessingExpression= ruleProcessingExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3375:2: iv_ruleProcessingExpression= ruleProcessingExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessingExpressionRule()); 
            pushFollow(FOLLOW_ruleProcessingExpression_in_entryRuleProcessingExpression7513);
            iv_ruleProcessingExpression=ruleProcessingExpression();

            state._fsp--;

             current =iv_ruleProcessingExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingExpression7523); 

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
    // $ANTLR end "entryRuleProcessingExpression"


    // $ANTLR start "ruleProcessingExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3382:1: ruleProcessingExpression returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_StreamStatement_2= ruleStreamStatement | this_StreamDefinition_3= ruleStreamDefinition | this_StreamAccess_4= ruleStreamAccess | this_NoReturnTypeOperator_5= ruleNoReturnTypeOperator ) ;
    public final EObject ruleProcessingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Statement_1 = null;

        EObject this_StreamStatement_2 = null;

        EObject this_StreamDefinition_3 = null;

        EObject this_StreamAccess_4 = null;

        EObject this_NoReturnTypeOperator_5 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3385:28: ( (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_StreamStatement_2= ruleStreamStatement | this_StreamDefinition_3= ruleStreamDefinition | this_StreamAccess_4= ruleStreamAccess | this_NoReturnTypeOperator_5= ruleNoReturnTypeOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3386:1: (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_StreamStatement_2= ruleStreamStatement | this_StreamDefinition_3= ruleStreamDefinition | this_StreamAccess_4= ruleStreamAccess | this_NoReturnTypeOperator_5= ruleNoReturnTypeOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3386:1: (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_StreamStatement_2= ruleStreamStatement | this_StreamDefinition_3= ruleStreamDefinition | this_StreamAccess_4= ruleStreamAccess | this_NoReturnTypeOperator_5= ruleNoReturnTypeOperator )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt31=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt31=5;
                    }
                    break;
                case 16:
                    {
                    alt31=3;
                    }
                    break;
                case 17:
                    {
                    int LA31_6 = input.LA(3);

                    if ( (LA31_6==20||(LA31_6>=25 && LA31_6<=34)||LA31_6==46||(LA31_6>=51 && LA31_6<=54)) ) {
                        alt31=3;
                    }
                    else if ( (LA31_6==RULE_ID||LA31_6==RULE_NUMBER||LA31_6==21) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    alt31=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3387:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleProcessingExpression7570);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3397:5: this_Statement_1= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleProcessingExpression7597);
                    this_Statement_1=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3407:5: this_StreamStatement_2= ruleStreamStatement
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getStreamStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStreamStatement_in_ruleProcessingExpression7624);
                    this_StreamStatement_2=ruleStreamStatement();

                    state._fsp--;

                     
                            current = this_StreamStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3417:5: this_StreamDefinition_3= ruleStreamDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getStreamDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStreamDefinition_in_ruleProcessingExpression7651);
                    this_StreamDefinition_3=ruleStreamDefinition();

                    state._fsp--;

                     
                            current = this_StreamDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3427:5: this_StreamAccess_4= ruleStreamAccess
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getStreamAccessParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleProcessingExpression7678);
                    this_StreamAccess_4=ruleStreamAccess();

                    state._fsp--;

                     
                            current = this_StreamAccess_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3437:5: this_NoReturnTypeOperator_5= ruleNoReturnTypeOperator
                    {
                     
                            newCompositeNode(grammarAccess.getProcessingExpressionAccess().getNoReturnTypeOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleNoReturnTypeOperator_in_ruleProcessingExpression7705);
                    this_NoReturnTypeOperator_5=ruleNoReturnTypeOperator();

                    state._fsp--;

                     
                            current = this_NoReturnTypeOperator_5; 
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
    // $ANTLR end "ruleProcessingExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3453:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3454:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3455:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
             newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression7740);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;

             current =iv_ruleBlockExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression7750); 

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3462:1: ruleBlockExpression returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_WhileLoopDefinition_2= ruleWhileLoopDefinition | this_ConditionalExpressions_3= ruleConditionalExpressions | this_ReturnStatement_4= ruleReturnStatement ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Statement_1 = null;

        EObject this_WhileLoopDefinition_2 = null;

        EObject this_ConditionalExpressions_3 = null;

        EObject this_ReturnStatement_4 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3465:28: ( (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_WhileLoopDefinition_2= ruleWhileLoopDefinition | this_ConditionalExpressions_3= ruleConditionalExpressions | this_ReturnStatement_4= ruleReturnStatement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3466:1: (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_WhileLoopDefinition_2= ruleWhileLoopDefinition | this_ConditionalExpressions_3= ruleConditionalExpressions | this_ReturnStatement_4= ruleReturnStatement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3466:1: (this_Variable_0= ruleVariable | this_Statement_1= ruleStatement | this_WhileLoopDefinition_2= ruleWhileLoopDefinition | this_ConditionalExpressions_3= ruleConditionalExpressions | this_ReturnStatement_4= ruleReturnStatement )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case 63:
                {
                alt32=3;
                }
                break;
            case 57:
            case 59:
                {
                alt32=4;
                }
                break;
            case 56:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3467:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getBlockExpressionAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleBlockExpression7797);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3477:5: this_Statement_1= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getBlockExpressionAccess().getStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_ruleBlockExpression7824);
                    this_Statement_1=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3487:5: this_WhileLoopDefinition_2= ruleWhileLoopDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBlockExpressionAccess().getWhileLoopDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWhileLoopDefinition_in_ruleBlockExpression7851);
                    this_WhileLoopDefinition_2=ruleWhileLoopDefinition();

                    state._fsp--;

                     
                            current = this_WhileLoopDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3497:5: this_ConditionalExpressions_3= ruleConditionalExpressions
                    {
                     
                            newCompositeNode(grammarAccess.getBlockExpressionAccess().getConditionalExpressionsParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConditionalExpressions_in_ruleBlockExpression7878);
                    this_ConditionalExpressions_3=ruleConditionalExpressions();

                    state._fsp--;

                     
                            current = this_ConditionalExpressions_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3507:5: this_ReturnStatement_4= ruleReturnStatement
                    {
                     
                            newCompositeNode(grammarAccess.getBlockExpressionAccess().getReturnStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleBlockExpression7905);
                    this_ReturnStatement_4=ruleReturnStatement();

                    state._fsp--;

                     
                            current = this_ReturnStatement_4; 
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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleReturnStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3523:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3524:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3525:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement7940);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement7950); 

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3532:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_returnVariable_1_0= ruleReturnVariable ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_returnVariable_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3535:28: ( (otherlv_0= 'return' ( (lv_returnVariable_1_0= ruleReturnVariable ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3536:1: (otherlv_0= 'return' ( (lv_returnVariable_1_0= ruleReturnVariable ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3536:1: (otherlv_0= 'return' ( (lv_returnVariable_1_0= ruleReturnVariable ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3536:3: otherlv_0= 'return' ( (lv_returnVariable_1_0= ruleReturnVariable ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleReturnStatement7987); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3540:1: ( (lv_returnVariable_1_0= ruleReturnVariable ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3541:1: (lv_returnVariable_1_0= ruleReturnVariable )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3541:1: (lv_returnVariable_1_0= ruleReturnVariable )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3542:3: lv_returnVariable_1_0= ruleReturnVariable
            {
             
            	        newCompositeNode(grammarAccess.getReturnStatementAccess().getReturnVariableReturnVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnVariable_in_ruleReturnStatement8008);
            lv_returnVariable_1_0=ruleReturnVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            	        }
                   		set(
                   			current, 
                   			"returnVariable",
                    		lv_returnVariable_1_0, 
                    		"ReturnVariable");
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleConditionalExpressions"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3566:1: entryRuleConditionalExpressions returns [EObject current=null] : iv_ruleConditionalExpressions= ruleConditionalExpressions EOF ;
    public final EObject entryRuleConditionalExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpressions = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3567:2: (iv_ruleConditionalExpressions= ruleConditionalExpressions EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3568:2: iv_ruleConditionalExpressions= ruleConditionalExpressions EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionsRule()); 
            pushFollow(FOLLOW_ruleConditionalExpressions_in_entryRuleConditionalExpressions8044);
            iv_ruleConditionalExpressions=ruleConditionalExpressions();

            state._fsp--;

             current =iv_ruleConditionalExpressions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpressions8054); 

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
    // $ANTLR end "entryRuleConditionalExpressions"


    // $ANTLR start "ruleConditionalExpressions"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3575:1: ruleConditionalExpressions returns [EObject current=null] : (this_IfElseCondition_0= ruleIfElseCondition | this_SwitchCaseCondition_1= ruleSwitchCaseCondition ) ;
    public final EObject ruleConditionalExpressions() throws RecognitionException {
        EObject current = null;

        EObject this_IfElseCondition_0 = null;

        EObject this_SwitchCaseCondition_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3578:28: ( (this_IfElseCondition_0= ruleIfElseCondition | this_SwitchCaseCondition_1= ruleSwitchCaseCondition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3579:1: (this_IfElseCondition_0= ruleIfElseCondition | this_SwitchCaseCondition_1= ruleSwitchCaseCondition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3579:1: (this_IfElseCondition_0= ruleIfElseCondition | this_SwitchCaseCondition_1= ruleSwitchCaseCondition )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            else if ( (LA33_0==59) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3580:5: this_IfElseCondition_0= ruleIfElseCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalExpressionsAccess().getIfElseConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfElseCondition_in_ruleConditionalExpressions8101);
                    this_IfElseCondition_0=ruleIfElseCondition();

                    state._fsp--;

                     
                            current = this_IfElseCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3590:5: this_SwitchCaseCondition_1= ruleSwitchCaseCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalExpressionsAccess().getSwitchCaseConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSwitchCaseCondition_in_ruleConditionalExpressions8128);
                    this_SwitchCaseCondition_1=ruleSwitchCaseCondition();

                    state._fsp--;

                     
                            current = this_SwitchCaseCondition_1; 
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
    // $ANTLR end "ruleConditionalExpressions"


    // $ANTLR start "entryRuleIfElseCondition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3606:1: entryRuleIfElseCondition returns [EObject current=null] : iv_ruleIfElseCondition= ruleIfElseCondition EOF ;
    public final EObject entryRuleIfElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseCondition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3607:2: (iv_ruleIfElseCondition= ruleIfElseCondition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3608:2: iv_ruleIfElseCondition= ruleIfElseCondition EOF
            {
             newCompositeNode(grammarAccess.getIfElseConditionRule()); 
            pushFollow(FOLLOW_ruleIfElseCondition_in_entryRuleIfElseCondition8163);
            iv_ruleIfElseCondition=ruleIfElseCondition();

            state._fsp--;

             current =iv_ruleIfElseCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseCondition8173); 

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
    // $ANTLR end "entryRuleIfElseCondition"


    // $ANTLR start "ruleIfElseCondition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3615:1: ruleIfElseCondition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifAction_5_0= ruleBlockExpression ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleIfElseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ifAction_5_0 = null;

        EObject lv_elseAction_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3618:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifAction_5_0= ruleBlockExpression ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3619:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifAction_5_0= ruleBlockExpression ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3619:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifAction_5_0= ruleBlockExpression ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )? )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3619:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ifAction_5_0= ruleBlockExpression ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleIfElseCondition8210); 

                	newLeafNode(otherlv_0, grammarAccess.getIfElseConditionAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIfElseCondition8222); 

                	newLeafNode(otherlv_1, grammarAccess.getIfElseConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3627:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3628:1: (lv_condition_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3628:1: (lv_condition_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3629:3: lv_condition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfElseConditionAccess().getConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleIfElseCondition8243);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfElseConditionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIfElseCondition8255); 

                	newLeafNode(otherlv_3, grammarAccess.getIfElseConditionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleIfElseCondition8267); 

                	newLeafNode(otherlv_4, grammarAccess.getIfElseConditionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3653:1: ( (lv_ifAction_5_0= ruleBlockExpression ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=56 && LA34_0<=57)||LA34_0==59||LA34_0==63||(LA34_0>=79 && LA34_0<=82)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3654:1: (lv_ifAction_5_0= ruleBlockExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3654:1: (lv_ifAction_5_0= ruleBlockExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3655:3: lv_ifAction_5_0= ruleBlockExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfElseConditionAccess().getIfActionBlockExpressionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBlockExpression_in_ruleIfElseCondition8288);
            	    lv_ifAction_5_0=ruleBlockExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfElseConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ifAction",
            	            		lv_ifAction_5_0, 
            	            		"BlockExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleIfElseCondition8301); 

                	newLeafNode(otherlv_6, grammarAccess.getIfElseConditionAccess().getRightCurlyBracketKeyword_6());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3675:1: (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3675:3: otherlv_7= 'else' otherlv_8= '{' ( (lv_elseAction_9_0= ruleBlockExpression ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleIfElseCondition8314); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfElseConditionAccess().getElseKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleIfElseCondition8326); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfElseConditionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3683:1: ( (lv_elseAction_9_0= ruleBlockExpression ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ID||(LA35_0>=56 && LA35_0<=57)||LA35_0==59||LA35_0==63||(LA35_0>=79 && LA35_0<=82)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3684:1: (lv_elseAction_9_0= ruleBlockExpression )
                    	    {
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3684:1: (lv_elseAction_9_0= ruleBlockExpression )
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3685:3: lv_elseAction_9_0= ruleBlockExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfElseConditionAccess().getElseActionBlockExpressionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBlockExpression_in_ruleIfElseCondition8347);
                    	    lv_elseAction_9_0=ruleBlockExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfElseConditionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseAction",
                    	            		lv_elseAction_9_0, 
                    	            		"BlockExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleIfElseCondition8360); 

                        	newLeafNode(otherlv_10, grammarAccess.getIfElseConditionAccess().getRightCurlyBracketKeyword_7_3());
                        

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
    // $ANTLR end "ruleIfElseCondition"


    // $ANTLR start "entryRuleSwitchCaseCondition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3713:1: entryRuleSwitchCaseCondition returns [EObject current=null] : iv_ruleSwitchCaseCondition= ruleSwitchCaseCondition EOF ;
    public final EObject entryRuleSwitchCaseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseCondition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3714:2: (iv_ruleSwitchCaseCondition= ruleSwitchCaseCondition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3715:2: iv_ruleSwitchCaseCondition= ruleSwitchCaseCondition EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseConditionRule()); 
            pushFollow(FOLLOW_ruleSwitchCaseCondition_in_entryRuleSwitchCaseCondition8398);
            iv_ruleSwitchCaseCondition=ruleSwitchCaseCondition();

            state._fsp--;

             current =iv_ruleSwitchCaseCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCaseCondition8408); 

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
    // $ANTLR end "entryRuleSwitchCaseCondition"


    // $ANTLR start "ruleSwitchCaseCondition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3722:1: ruleSwitchCaseCondition returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_caseExpression_5_0= ruleCaseStatement ) )* otherlv_6= 'default' otherlv_7= ':' ( (lv_defaultExpression_8_0= ruleExpression ) ) otherlv_9= ';' otherlv_10= '}' ) ;
    public final EObject ruleSwitchCaseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_caseExpression_5_0 = null;

        EObject lv_defaultExpression_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3725:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_caseExpression_5_0= ruleCaseStatement ) )* otherlv_6= 'default' otherlv_7= ':' ( (lv_defaultExpression_8_0= ruleExpression ) ) otherlv_9= ';' otherlv_10= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3726:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_caseExpression_5_0= ruleCaseStatement ) )* otherlv_6= 'default' otherlv_7= ':' ( (lv_defaultExpression_8_0= ruleExpression ) ) otherlv_9= ';' otherlv_10= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3726:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_caseExpression_5_0= ruleCaseStatement ) )* otherlv_6= 'default' otherlv_7= ':' ( (lv_defaultExpression_8_0= ruleExpression ) ) otherlv_9= ';' otherlv_10= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3726:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_caseExpression_5_0= ruleCaseStatement ) )* otherlv_6= 'default' otherlv_7= ':' ( (lv_defaultExpression_8_0= ruleExpression ) ) otherlv_9= ';' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleSwitchCaseCondition8445); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseConditionAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSwitchCaseCondition8457); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchCaseConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3734:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3735:1: (lv_condition_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3735:1: (lv_condition_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3736:3: lv_condition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchCaseConditionAccess().getConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchCaseCondition8478);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchCaseConditionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSwitchCaseCondition8490); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchCaseConditionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSwitchCaseCondition8502); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchCaseConditionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3760:1: ( (lv_caseExpression_5_0= ruleCaseStatement ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==62) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3761:1: (lv_caseExpression_5_0= ruleCaseStatement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3761:1: (lv_caseExpression_5_0= ruleCaseStatement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3762:3: lv_caseExpression_5_0= ruleCaseStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchCaseConditionAccess().getCaseExpressionCaseStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseStatement_in_ruleSwitchCaseCondition8523);
            	    lv_caseExpression_5_0=ruleCaseStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchCaseConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"caseExpression",
            	            		lv_caseExpression_5_0, 
            	            		"CaseStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleSwitchCaseCondition8536); 

                	newLeafNode(otherlv_6, grammarAccess.getSwitchCaseConditionAccess().getDefaultKeyword_6());
                
            otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleSwitchCaseCondition8548); 

                	newLeafNode(otherlv_7, grammarAccess.getSwitchCaseConditionAccess().getColonKeyword_7());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3786:1: ( (lv_defaultExpression_8_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3787:1: (lv_defaultExpression_8_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3787:1: (lv_defaultExpression_8_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3788:3: lv_defaultExpression_8_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchCaseConditionAccess().getDefaultExpressionExpressionParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchCaseCondition8569);
            lv_defaultExpression_8_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchCaseConditionRule());
            	        }
                   		set(
                   			current, 
                   			"defaultExpression",
                    		lv_defaultExpression_8_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSwitchCaseCondition8581); 

                	newLeafNode(otherlv_9, grammarAccess.getSwitchCaseConditionAccess().getSemicolonKeyword_9());
                
            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleSwitchCaseCondition8593); 

                	newLeafNode(otherlv_10, grammarAccess.getSwitchCaseConditionAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleSwitchCaseCondition"


    // $ANTLR start "entryRuleCaseStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3820:1: entryRuleCaseStatement returns [EObject current=null] : iv_ruleCaseStatement= ruleCaseStatement EOF ;
    public final EObject entryRuleCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3821:2: (iv_ruleCaseStatement= ruleCaseStatement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3822:2: iv_ruleCaseStatement= ruleCaseStatement EOF
            {
             newCompositeNode(grammarAccess.getCaseStatementRule()); 
            pushFollow(FOLLOW_ruleCaseStatement_in_entryRuleCaseStatement8629);
            iv_ruleCaseStatement=ruleCaseStatement();

            state._fsp--;

             current =iv_ruleCaseStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseStatement8639); 

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
    // $ANTLR end "entryRuleCaseStatement"


    // $ANTLR start "ruleCaseStatement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3829:1: ruleCaseStatement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_action_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3832:28: ( (otherlv_0= 'case' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_action_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3833:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_action_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3833:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_action_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3833:3: otherlv_0= 'case' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_action_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleCaseStatement8676); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseStatementAccess().getCaseKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3837:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3838:1: (lv_condition_1_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3838:1: (lv_condition_1_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3839:3: lv_condition_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseStatementAccess().getConditionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseStatement8697);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleCaseStatement8709); 

                	newLeafNode(otherlv_2, grammarAccess.getCaseStatementAccess().getColonKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3859:1: ( (lv_action_3_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3860:1: (lv_action_3_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3860:1: (lv_action_3_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3861:3: lv_action_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseStatementAccess().getActionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseStatement8730);
            lv_action_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleCaseStatement8742); 

                	newLeafNode(otherlv_4, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleCaseStatement"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3889:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3890:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3891:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition8778);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition8788); 

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3898:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleBlockExpression ) )* ( (lv_returnValue_9_0= ruleReturnStatement ) ) otherlv_10= '}' ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_statements_8_0 = null;

        EObject lv_returnValue_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3901:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleBlockExpression ) )* ( (lv_returnValue_9_0= ruleReturnStatement ) ) otherlv_10= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3902:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleBlockExpression ) )* ( (lv_returnValue_9_0= ruleReturnStatement ) ) otherlv_10= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3902:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleBlockExpression ) )* ( (lv_returnValue_9_0= ruleReturnStatement ) ) otherlv_10= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3902:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleBlockExpression ) )* ( (lv_returnValue_9_0= ruleReturnStatement ) ) otherlv_10= '}'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3902:2: ( (lv_type_0_0= ruleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3903:1: (lv_type_0_0= ruleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3903:1: (lv_type_0_0= ruleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3904:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionDefinition8834);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3920:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3921:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3921:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3922:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDefinition8851); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionDefinition8868); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3942:1: ( ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=79 && LA39_0<=82)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3942:2: ( (lv_arguments_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3942:2: ( (lv_arguments_3_0= ruleParameterDeclaration ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3943:1: (lv_arguments_3_0= ruleParameterDeclaration )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3943:1: (lv_arguments_3_0= ruleParameterDeclaration )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3944:3: lv_arguments_3_0= ruleParameterDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getArgumentsParameterDeclarationParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition8890);
                    lv_arguments_3_0=ruleParameterDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_3_0, 
                            		"ParameterDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3960:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3960:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition8903); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3964:1: ( (lv_arguments_5_0= ruleParameterDeclaration ) )
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3965:1: (lv_arguments_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3965:1: (lv_arguments_5_0= ruleParameterDeclaration )
                    	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3966:3: lv_arguments_5_0= ruleParameterDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getArgumentsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition8924);
                    	    lv_arguments_5_0=ruleParameterDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_5_0, 
                    	            		"ParameterDeclaration");
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
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleFunctionDefinition8940); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDefinition8952); 

                	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3990:1: ( (lv_statements_8_0= ruleBlockExpression ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==RULE_ID) ) {
                        int LA40_3 = input.LA(3);

                        if ( (LA40_3==18) ) {
                            int LA40_4 = input.LA(4);

                            if ( (LA40_4==RULE_ID||(LA40_4>=56 && LA40_4<=57)||LA40_4==59||LA40_4==63||(LA40_4>=79 && LA40_4<=82)) ) {
                                alt40=1;
                            }


                        }


                    }


                }
                else if ( (LA40_0==RULE_ID||LA40_0==57||LA40_0==59||LA40_0==63||(LA40_0>=79 && LA40_0<=82)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3991:1: (lv_statements_8_0= ruleBlockExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3991:1: (lv_statements_8_0= ruleBlockExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:3992:3: lv_statements_8_0= ruleBlockExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getStatementsBlockExpressionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBlockExpression_in_ruleFunctionDefinition8973);
            	    lv_statements_8_0=ruleBlockExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_8_0, 
            	            		"BlockExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4008:3: ( (lv_returnValue_9_0= ruleReturnStatement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4009:1: (lv_returnValue_9_0= ruleReturnStatement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4009:1: (lv_returnValue_9_0= ruleReturnStatement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4010:3: lv_returnValue_9_0= ruleReturnStatement
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnValueReturnStatementParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnStatement_in_ruleFunctionDefinition8995);
            lv_returnValue_9_0=ruleReturnStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"returnValue",
                    		lv_returnValue_9_0, 
                    		"ReturnStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDefinition9007); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleReturnVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4038:1: entryRuleReturnVariable returns [EObject current=null] : iv_ruleReturnVariable= ruleReturnVariable EOF ;
    public final EObject entryRuleReturnVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnVariable = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4039:2: (iv_ruleReturnVariable= ruleReturnVariable EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4040:2: iv_ruleReturnVariable= ruleReturnVariable EOF
            {
             newCompositeNode(grammarAccess.getReturnVariableRule()); 
            pushFollow(FOLLOW_ruleReturnVariable_in_entryRuleReturnVariable9043);
            iv_ruleReturnVariable=ruleReturnVariable();

            state._fsp--;

             current =iv_ruleReturnVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnVariable9053); 

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
    // $ANTLR end "entryRuleReturnVariable"


    // $ANTLR start "ruleReturnVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4047:1: ruleReturnVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleReturnVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4050:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4051:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4051:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4051:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4051:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4052:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4052:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4053:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnVariableRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReturnVariable9098); 

            		newLeafNode(otherlv_0, grammarAccess.getReturnVariableAccess().getReturnableReturnableCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleReturnVariable9110); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnVariableAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleReturnVariable"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4078:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4079:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4080:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration9148);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration9158); 

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4087:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4090:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4091:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4091:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4091:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4091:2: ( (lv_type_0_0= ruleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4092:1: (lv_type_0_0= ruleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4092:1: (lv_type_0_0= ruleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4093:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleParameterDeclaration9204);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4109:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4110:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4110:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4111:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration9221); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleWhileLoopDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4135:1: entryRuleWhileLoopDefinition returns [EObject current=null] : iv_ruleWhileLoopDefinition= ruleWhileLoopDefinition EOF ;
    public final EObject entryRuleWhileLoopDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoopDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4136:2: (iv_ruleWhileLoopDefinition= ruleWhileLoopDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4137:2: iv_ruleWhileLoopDefinition= ruleWhileLoopDefinition EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopDefinitionRule()); 
            pushFollow(FOLLOW_ruleWhileLoopDefinition_in_entryRuleWhileLoopDefinition9262);
            iv_ruleWhileLoopDefinition=ruleWhileLoopDefinition();

            state._fsp--;

             current =iv_ruleWhileLoopDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileLoopDefinition9272); 

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
    // $ANTLR end "entryRuleWhileLoopDefinition"


    // $ANTLR start "ruleWhileLoopDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4144:1: ruleWhileLoopDefinition returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleBlockExpression ) )* otherlv_6= '}' ) ;
    public final EObject ruleWhileLoopDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4147:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleBlockExpression ) )* otherlv_6= '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4148:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleBlockExpression ) )* otherlv_6= '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4148:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleBlockExpression ) )* otherlv_6= '}' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4148:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleBlockExpression ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleWhileLoopDefinition9309); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileLoopDefinitionAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleWhileLoopDefinition9321); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileLoopDefinitionAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4156:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4157:1: (lv_condition_2_0= ruleExpression )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4157:1: (lv_condition_2_0= ruleExpression )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4158:3: lv_condition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopDefinitionAccess().getConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileLoopDefinition9342);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleWhileLoopDefinition9354); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileLoopDefinitionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleWhileLoopDefinition9366); 

                	newLeafNode(otherlv_4, grammarAccess.getWhileLoopDefinitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4182:1: ( (lv_statements_5_0= ruleBlockExpression ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||(LA41_0>=56 && LA41_0<=57)||LA41_0==59||LA41_0==63||(LA41_0>=79 && LA41_0<=82)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4183:1: (lv_statements_5_0= ruleBlockExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4183:1: (lv_statements_5_0= ruleBlockExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4184:3: lv_statements_5_0= ruleBlockExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhileLoopDefinitionAccess().getStatementsBlockExpressionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBlockExpression_in_ruleWhileLoopDefinition9387);
            	    lv_statements_5_0=ruleBlockExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhileLoopDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_5_0, 
            	            		"BlockExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleWhileLoopDefinition9400); 

                	newLeafNode(otherlv_6, grammarAccess.getWhileLoopDefinitionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleWhileLoopDefinition"


    // $ANTLR start "entryRuleVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4212:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4213:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4214:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable9436);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable9446); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4221:1: ruleVariable returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableDefinition_1= ruleVariableDefinition ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_VariableDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4224:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableDefinition_1= ruleVariableDefinition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4225:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableDefinition_1= ruleVariableDefinition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4225:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableDefinition_1= ruleVariableDefinition )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4226:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getVariableDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariable9493);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;

                     
                            current = this_VariableDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4236:5: this_VariableDefinition_1= ruleVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariable9520);
                    this_VariableDefinition_1=ruleVariableDefinition();

                    state._fsp--;

                     
                            current = this_VariableDefinition_1; 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4252:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4253:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4254:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition9555);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition9565); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4261:1: ruleVariableDefinition returns [EObject current=null] : (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NumberVariableDefinition_0 = null;

        EObject this_StringVariableDefinition_1 = null;

        EObject this_BooleanVariableDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4264:28: ( (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4265:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4265:1: (this_NumberVariableDefinition_0= ruleNumberVariableDefinition | this_StringVariableDefinition_1= ruleStringVariableDefinition | this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 79:
            case 81:
                {
                alt43=1;
                }
                break;
            case 80:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_4 = input.LA(3);

                    if ( (LA43_4==17) ) {
                        int LA43_5 = input.LA(4);

                        if ( (LA43_5==RULE_BOOLVALUE) ) {
                            alt43=3;
                        }
                        else if ( (LA43_5==RULE_NUMBER) ) {
                            alt43=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case 82:
                {
                alt43=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4266:5: this_NumberVariableDefinition_0= ruleNumberVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getNumberVariableDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition9612);
                    this_NumberVariableDefinition_0=ruleNumberVariableDefinition();

                    state._fsp--;

                     
                            current = this_NumberVariableDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4276:5: this_StringVariableDefinition_1= ruleStringVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getStringVariableDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition9639);
                    this_StringVariableDefinition_1=ruleStringVariableDefinition();

                    state._fsp--;

                     
                            current = this_StringVariableDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4286:5: this_BooleanVariableDefinition_2= ruleBooleanVariableDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBooleanVariableDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition9666);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4302:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4303:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4304:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration9701);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration9711); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4311:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4314:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4315:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4315:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4315:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4315:2: ( (lv_type_0_0= ruleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4316:1: (lv_type_0_0= ruleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4316:1: (lv_type_0_0= ruleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4317:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleVariableDeclaration9757);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4333:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4334:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4334:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4335:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration9774); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration9791); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4363:1: entryRuleNumberVariableDefinition returns [EObject current=null] : iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF ;
    public final EObject entryRuleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4364:2: (iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4365:2: iv_ruleNumberVariableDefinition= ruleNumberVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getNumberVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition9827);
            iv_ruleNumberVariableDefinition=ruleNumberVariableDefinition();

            state._fsp--;

             current =iv_ruleNumberVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberVariableDefinition9837); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4372:1: ruleNumberVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) ;
    public final EObject ruleNumberVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4375:28: ( ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4376:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4376:1: ( ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4376:2: ( (lv_type_0_0= ruleSimpleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4376:2: ( (lv_type_0_0= ruleSimpleDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4377:1: (lv_type_0_0= ruleSimpleDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4377:1: (lv_type_0_0= ruleSimpleDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4378:3: lv_type_0_0= ruleSimpleDataType
            {
             
            	        newCompositeNode(grammarAccess.getNumberVariableDefinitionAccess().getTypeSimpleDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition9883);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4394:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4395:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4395:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4396:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNumberVariableDefinition9900); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNumberVariableDefinition9917); 

                	newLeafNode(otherlv_2, grammarAccess.getNumberVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4416:1: ( (lv_value_3_0= RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4417:1: (lv_value_3_0= RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4417:1: (lv_value_3_0= RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4418:3: lv_value_3_0= RULE_NUMBER
            {
            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition9934); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNumberVariableDefinition9951); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4446:1: entryRuleStringVariableDefinition returns [EObject current=null] : iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF ;
    public final EObject entryRuleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4447:2: (iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4448:2: iv_ruleStringVariableDefinition= ruleStringVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getStringVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition9987);
            iv_ruleStringVariableDefinition=ruleStringVariableDefinition();

            state._fsp--;

             current =iv_ruleStringVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVariableDefinition9997); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4455:1: ruleStringVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleStringVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4458:28: ( ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4459:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4459:1: ( ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4459:2: ( (lv_type_0_0= ruleStringDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4459:2: ( (lv_type_0_0= ruleStringDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4460:1: (lv_type_0_0= ruleStringDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4460:1: (lv_type_0_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4461:3: lv_type_0_0= ruleStringDataType
            {
             
            	        newCompositeNode(grammarAccess.getStringVariableDefinitionAccess().getTypeStringDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition10043);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4477:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4478:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4478:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4479:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVariableDefinition10060); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStringVariableDefinition10077); 

                	newLeafNode(otherlv_2, grammarAccess.getStringVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4499:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4500:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4500:1: (lv_value_3_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4501:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringVariableDefinition10094); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStringVariableDefinition10111); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4529:1: entryRuleBooleanVariableDefinition returns [EObject current=null] : iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF ;
    public final EObject entryRuleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4530:2: (iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4531:2: iv_ruleBooleanVariableDefinition= ruleBooleanVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableDefinitionRule()); 
            pushFollow(FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition10147);
            iv_ruleBooleanVariableDefinition=ruleBooleanVariableDefinition();

            state._fsp--;

             current =iv_ruleBooleanVariableDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanVariableDefinition10157); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4538:1: ruleBooleanVariableDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) ;
    public final EObject ruleBooleanVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4541:28: ( ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4542:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4542:1: ( ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4542:2: ( (lv_type_0_0= ruleBooleanDataType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_BOOLVALUE ) ) otherlv_4= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4542:2: ( (lv_type_0_0= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:1: (lv_type_0_0= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4543:1: (lv_type_0_0= ruleBooleanDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4544:3: lv_type_0_0= ruleBooleanDataType
            {
             
            	        newCompositeNode(grammarAccess.getBooleanVariableDefinitionAccess().getTypeBooleanDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition10203);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4560:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4561:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4561:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4562:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition10220); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanVariableDefinition10237); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanVariableDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4582:1: ( (lv_value_3_0= RULE_BOOLVALUE ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4583:1: (lv_value_3_0= RULE_BOOLVALUE )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4583:1: (lv_value_3_0= RULE_BOOLVALUE )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4584:3: lv_value_3_0= RULE_BOOLVALUE
            {
            lv_value_3_0=(Token)match(input,RULE_BOOLVALUE,FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition10254); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleBooleanVariableDefinition10271); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4612:1: entryRuleStructureDeclaration returns [EObject current=null] : iv_ruleStructureDeclaration= ruleStructureDeclaration EOF ;
    public final EObject entryRuleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4613:2: (iv_ruleStructureDeclaration= ruleStructureDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4614:2: iv_ruleStructureDeclaration= ruleStructureDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStructureDeclarationRule()); 
            pushFollow(FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration10307);
            iv_ruleStructureDeclaration=ruleStructureDeclaration();

            state._fsp--;

             current =iv_ruleStructureDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDeclaration10317); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4621:1: ruleStructureDeclaration returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleStructureDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4624:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4625:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4625:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4625:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleVariableDeclaration ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleStructureDeclaration10354); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureDeclarationAccess().getStructureKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4629:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4630:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4630:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4631:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureDeclaration10371); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStructureDeclaration10388); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4651:1: ( (lv_elements_3_0= ruleVariableDeclaration ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=79 && LA44_0<=82)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4652:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4652:1: (lv_elements_3_0= ruleVariableDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4653:3: lv_elements_3_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureDeclarationAccess().getElementsVariableDeclarationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration10409);
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStructureDeclaration10422); 

                	newLeafNode(otherlv_4, grammarAccess.getStructureDeclarationAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStructureDeclaration10434); 

                	newLeafNode(otherlv_5, grammarAccess.getStructureDeclarationAccess().getSemicolonKeyword_5());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4685:1: entryRuleStreamDeclaration returns [EObject current=null] : iv_ruleStreamDeclaration= ruleStreamDeclaration EOF ;
    public final EObject entryRuleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4686:2: (iv_ruleStreamDeclaration= ruleStreamDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4687:2: iv_ruleStreamDeclaration= ruleStreamDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStreamDeclarationRule()); 
            pushFollow(FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration10470);
            iv_ruleStreamDeclaration=ruleStreamDeclaration();

            state._fsp--;

             current =iv_ruleStreamDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDeclaration10480); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4694:1: ruleStreamDeclaration returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4697:28: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4698:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4698:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4698:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleStreamDeclaration10517); 

                	newLeafNode(otherlv_0, grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4702:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4703:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4703:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4704:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDeclaration10534); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStreamDeclaration10551); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4724:1: ( (lv_elements_3_0= ruleStreamElement ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==66||(LA45_0>=79 && LA45_0<=82)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4725:1: (lv_elements_3_0= ruleStreamElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4725:1: (lv_elements_3_0= ruleStreamElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4726:3: lv_elements_3_0= ruleStreamElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamElement_in_ruleStreamDeclaration10572);
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
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStreamDeclaration10585); 

                	newLeafNode(otherlv_4, grammarAccess.getStreamDeclarationAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStreamDeclaration10597); 

                	newLeafNode(otherlv_5, grammarAccess.getStreamDeclarationAccess().getSemicolonKeyword_5());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4758:1: entryRuleStreamElement returns [EObject current=null] : iv_ruleStreamElement= ruleStreamElement EOF ;
    public final EObject entryRuleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4759:2: (iv_ruleStreamElement= ruleStreamElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4760:2: iv_ruleStreamElement= ruleStreamElement EOF
            {
             newCompositeNode(grammarAccess.getStreamElementRule()); 
            pushFollow(FOLLOW_ruleStreamElement_in_entryRuleStreamElement10633);
            iv_ruleStreamElement=ruleStreamElement();

            state._fsp--;

             current =iv_ruleStreamElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamElement10643); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4767:1: ruleStreamElement returns [EObject current=null] : (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject this_StructureElements_0 = null;

        EObject this_VariableDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4770:28: ( (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4771:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4771:1: (this_StructureElements_0= ruleStructureElements | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=79 && LA46_0<=82)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4772:5: this_StructureElements_0= ruleStructureElements
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getStructureElementsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructureElements_in_ruleStreamElement10690);
                    this_StructureElements_0=ruleStructureElements();

                    state._fsp--;

                     
                            current = this_StructureElements_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4782:5: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getStreamElementAccess().getVariableDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStreamElement10717);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4798:1: entryRuleStructureElements returns [EObject current=null] : iv_ruleStructureElements= ruleStructureElements EOF ;
    public final EObject entryRuleStructureElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureElements = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4799:2: (iv_ruleStructureElements= ruleStructureElements EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4800:2: iv_ruleStructureElements= ruleStructureElements EOF
            {
             newCompositeNode(grammarAccess.getStructureElementsRule()); 
            pushFollow(FOLLOW_ruleStructureElements_in_entryRuleStructureElements10752);
            iv_ruleStructureElements=ruleStructureElements();

            state._fsp--;

             current =iv_ruleStructureElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureElements10762); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4807:1: ruleStructureElements returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStructureElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4810:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4811:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4811:1: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4811:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleStructureElements10799); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureElementsAccess().getUseKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4815:1: ( (otherlv_1= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4816:1: (otherlv_1= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4816:1: (otherlv_1= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4817:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureElementsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureElements10819); 

            		newLeafNode(otherlv_1, grammarAccess.getStructureElementsAccess().getElementStructureDeclarationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStructureElements10831); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4840:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4841:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4842:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression10867);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression10877); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4849:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4852:28: (this_Or_0= ruleOr )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4854:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression10923);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4870:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4871:2: (iv_ruleOr= ruleOr EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4872:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr10957);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr10967); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4879:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4882:28: ( (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4883:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4883:1: (this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4884:5: this_And_0= ruleAnd ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr11014);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4892:1: ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==67) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4892:2: () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4892:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4893:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4898:2: ( (lv_operator_2_0= '||' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4899:1: (lv_operator_2_0= '||' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4899:1: (lv_operator_2_0= '||' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4900:3: lv_operator_2_0= '||'
            	    {
            	    lv_operator_2_0=(Token)match(input,67,FOLLOW_67_in_ruleOr11041); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getOrAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4913:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4914:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4914:1: (lv_right_3_0= ruleAnd )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4915:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr11075);
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
            	    break loop47;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4939:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4940:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4941:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd11113);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd11123); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4948:1: ruleAnd returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4951:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4952:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4952:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4953:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getRelationalExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd11170);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;

             
                    current = this_RelationalExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4961:1: ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==68) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4961:2: () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4961:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4962:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4967:2: ( (lv_operator_2_0= '&&' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4968:1: (lv_operator_2_0= '&&' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4968:1: (lv_operator_2_0= '&&' )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4969:3: lv_operator_2_0= '&&'
            	    {
            	    lv_operator_2_0=(Token)match(input,68,FOLLOW_68_in_ruleAnd11197); 

            	            newLeafNode(lv_operator_2_0, grammarAccess.getAndAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
            	    	    

            	    }


            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4982:2: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4983:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4983:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:4984:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightRelationalExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAnd11231);
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
            	    break loop48;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5008:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5009:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5010:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression11269);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression11279); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5017:1: ruleRelationalExpression returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5020:28: ( (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5021:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5021:1: (this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5022:5: this_Addition_0= ruleAddition ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression11326);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5030:1: ( () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=69 && LA50_0<=74)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5030:2: () ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5030:2: ()
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5031:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getRelationalExpressionAccess().getBooleanOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5036:2: ( ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5037:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5037:1: ( (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5038:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5038:1: (lv_operator_2_1= '==' | lv_operator_2_2= '!=' | lv_operator_2_3= '>=' | lv_operator_2_4= '<=' | lv_operator_2_5= '>' | lv_operator_2_6= '<' )
            	    int alt49=6;
            	    switch ( input.LA(1) ) {
            	    case 69:
            	        {
            	        alt49=1;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt49=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt49=3;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt49=4;
            	        }
            	        break;
            	    case 73:
            	        {
            	        alt49=5;
            	        }
            	        break;
            	    case 74:
            	        {
            	        alt49=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt49) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5039:3: lv_operator_2_1= '=='
            	            {
            	            lv_operator_2_1=(Token)match(input,69,FOLLOW_69_in_ruleRelationalExpression11355); 

            	                    newLeafNode(lv_operator_2_1, grammarAccess.getRelationalExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5051:8: lv_operator_2_2= '!='
            	            {
            	            lv_operator_2_2=(Token)match(input,70,FOLLOW_70_in_ruleRelationalExpression11384); 

            	                    newLeafNode(lv_operator_2_2, grammarAccess.getRelationalExpressionAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5063:8: lv_operator_2_3= '>='
            	            {
            	            lv_operator_2_3=(Token)match(input,71,FOLLOW_71_in_ruleRelationalExpression11413); 

            	                    newLeafNode(lv_operator_2_3, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5075:8: lv_operator_2_4= '<='
            	            {
            	            lv_operator_2_4=(Token)match(input,72,FOLLOW_72_in_ruleRelationalExpression11442); 

            	                    newLeafNode(lv_operator_2_4, grammarAccess.getRelationalExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5087:8: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,73,FOLLOW_73_in_ruleRelationalExpression11471); 

            	                    newLeafNode(lv_operator_2_5, grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5099:8: lv_operator_2_6= '<'
            	            {
            	            lv_operator_2_6=(Token)match(input,74,FOLLOW_74_in_ruleRelationalExpression11500); 

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

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5114:2: ( (lv_right_3_0= ruleAddition ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5115:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5115:1: (lv_right_3_0= ruleAddition )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5116:3: lv_right_3_0= ruleAddition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddition_in_ruleRelationalExpression11537);
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
            	    break loop50;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5140:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5141:2: (iv_ruleAddition= ruleAddition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5142:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition11575);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition11585); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5149:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5152:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5153:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5153:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5154:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition11632);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=75 && LA52_0<=76)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==75) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==76) ) {
            	        alt51=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:3: ( () otherlv_2= '+' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:3: ( () otherlv_2= '+' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:4: () otherlv_2= '+'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5162:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5163:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,75,FOLLOW_75_in_ruleAddition11655); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5173:6: ( () otherlv_4= '-' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5173:6: ( () otherlv_4= '-' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5173:7: () otherlv_4= '-'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5173:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5174:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleAddition11684); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5183:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5184:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5184:1: (lv_right_5_0= ruleMultiplication )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5185:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition11707);
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
            	    break loop52;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5209:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5210:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5211:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication11745);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication11755); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5218:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5221:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5222:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5222:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5223:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication11802);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=77 && LA54_0<=78)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==77) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==78) ) {
            	        alt53=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:3: ( () otherlv_2= '*' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:3: ( () otherlv_2= '*' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:4: () otherlv_2= '*'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5231:4: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5232:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleMultiplication11825); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5242:6: ( () otherlv_4= '/' )
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5242:6: ( () otherlv_4= '/' )
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5242:7: () otherlv_4= '/'
            	            {
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5242:7: ()
            	            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5243:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleMultiplication11854); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5252:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5253:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5253:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5254:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication11877);
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
            	    break loop54;
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5278:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5279:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5280:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11915);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression11925); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5287:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_Expression_1 = null;

        EObject lv_streamVariable_8_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5290:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5291:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5291:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) | ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt57=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt57=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 16:
                case 18:
                case 22:
                case 24:
                case 61:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt57=3;
                    }
                    break;
                case 19:
                    {
                    alt57=4;
                    }
                    break;
                case 21:
                    {
                    alt57=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5291:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5291:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5291:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression11963); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression11985);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression11996); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5309:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5309:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5309:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5309:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5310:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5315:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5316:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5316:1: (lv_value_4_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5317:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression12030); 

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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5334:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5334:6: ( () ( (otherlv_6= RULE_ID ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5334:7: () ( (otherlv_6= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5334:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5335:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getVariableCallAction_2_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5340:2: ( (otherlv_6= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5341:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5341:1: (otherlv_6= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5342:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression12072); 

                    		newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getVariableVariableCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5354:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5354:6: ( () ( (lv_streamVariable_8_0= ruleStreamAccess ) ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5354:7: () ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5354:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5355:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getStreamAccessAction_3_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5360:2: ( (lv_streamVariable_8_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5361:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5361:1: (lv_streamVariable_8_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5362:3: lv_streamVariable_8_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getStreamVariableStreamAccessParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_rulePrimaryExpression12110);
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
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5379:6: ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5379:6: ( () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5379:7: () ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5379:7: ()
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5380:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_4_0(),
                                current);
                        

                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5385:2: ( (otherlv_10= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5386:1: (otherlv_10= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5386:1: (otherlv_10= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5387:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression12147); 

                    		newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFuncFunctionDefinitionCrossReference_4_1_0()); 
                    	

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5398:2: (otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5398:4: otherlv_11= '(' ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression12160); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_2_0());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5402:1: ( ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_ID||LA56_0==RULE_NUMBER||LA56_0==21) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5402:2: ( (lv_arguments_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )*
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5402:2: ( (lv_arguments_12_0= ruleExpression ) )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5403:1: (lv_arguments_12_0= ruleExpression )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5403:1: (lv_arguments_12_0= ruleExpression )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5404:3: lv_arguments_12_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression12182);
                            lv_arguments_12_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"arguments",
                                    		lv_arguments_12_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5420:2: (otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==16) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5420:4: otherlv_13= ',' ( (lv_arguments_14_0= ruleExpression ) )
                            	    {
                            	    otherlv_13=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression12195); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_4_2_1_1_0());
                            	        
                            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5424:1: ( (lv_arguments_14_0= ruleExpression ) )
                            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5425:1: (lv_arguments_14_0= ruleExpression )
                            	    {
                            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5425:1: (lv_arguments_14_0= ruleExpression )
                            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5426:3: lv_arguments_14_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsExpressionParserRuleCall_4_2_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression12216);
                            	    lv_arguments_14_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"arguments",
                            	            		lv_arguments_14_0, 
                            	            		"Expression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression12232); 

                        	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2_2());
                        

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5454:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5455:2: (iv_ruleDataType= ruleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5456:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType12270);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType12280); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5463:1: ruleDataType returns [EObject current=null] : (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleDataType_0 = null;

        EObject this_ComplexDataType_1 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5466:28: ( (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5467:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5467:1: (this_SimpleDataType_0= ruleSimpleDataType | this_ComplexDataType_1= ruleComplexDataType )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=79 && LA58_0<=81)) ) {
                alt58=1;
            }
            else if ( (LA58_0==82) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5468:5: this_SimpleDataType_0= ruleSimpleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleDataType_in_ruleDataType12327);
                    this_SimpleDataType_0=ruleSimpleDataType();

                    state._fsp--;

                     
                            current = this_SimpleDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5478:5: this_ComplexDataType_1= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getComplexDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexDataType_in_ruleDataType12354);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5494:1: entryRuleSimpleDataType returns [EObject current=null] : iv_ruleSimpleDataType= ruleSimpleDataType EOF ;
    public final EObject entryRuleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5495:2: (iv_ruleSimpleDataType= ruleSimpleDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5496:2: iv_ruleSimpleDataType= ruleSimpleDataType EOF
            {
             newCompositeNode(grammarAccess.getSimpleDataTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType12389);
            iv_ruleSimpleDataType=ruleSimpleDataType();

            state._fsp--;

             current =iv_ruleSimpleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDataType12399); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5503:1: ruleSimpleDataType returns [EObject current=null] : (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) ;
    public final EObject ruleSimpleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDataType_0 = null;

        EObject this_FloatDataType_1 = null;

        EObject this_BooleanDataType_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5506:28: ( (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5507:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5507:1: (this_IntegerDataType_0= ruleIntegerDataType | this_FloatDataType_1= ruleFloatDataType | this_BooleanDataType_2= ruleBooleanDataType )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt59=1;
                }
                break;
            case 81:
                {
                alt59=2;
                }
                break;
            case 80:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5508:5: this_IntegerDataType_0= ruleIntegerDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getIntegerDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType12446);
                    this_IntegerDataType_0=ruleIntegerDataType();

                    state._fsp--;

                     
                            current = this_IntegerDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5518:5: this_FloatDataType_1= ruleFloatDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getFloatDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFloatDataType_in_ruleSimpleDataType12473);
                    this_FloatDataType_1=ruleFloatDataType();

                    state._fsp--;

                     
                            current = this_FloatDataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5528:5: this_BooleanDataType_2= ruleBooleanDataType
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDataTypeAccess().getBooleanDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType12500);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5544:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5545:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5546:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType12535);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexDataType12545); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5553:1: ruleComplexDataType returns [EObject current=null] : this_StringDataType_0= ruleStringDataType ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject this_StringDataType_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5556:28: (this_StringDataType_0= ruleStringDataType )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5558:5: this_StringDataType_0= ruleStringDataType
            {
             
                    newCompositeNode(grammarAccess.getComplexDataTypeAccess().getStringDataTypeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleStringDataType_in_ruleComplexDataType12591);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5574:1: entryRuleIntegerDataType returns [EObject current=null] : iv_ruleIntegerDataType= ruleIntegerDataType EOF ;
    public final EObject entryRuleIntegerDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5575:2: (iv_ruleIntegerDataType= ruleIntegerDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5576:2: iv_ruleIntegerDataType= ruleIntegerDataType EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType12625);
            iv_ruleIntegerDataType=ruleIntegerDataType();

            state._fsp--;

             current =iv_ruleIntegerDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDataType12635); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5583:1: ruleIntegerDataType returns [EObject current=null] : (otherlv_0= 'int' () ) ;
    public final EObject ruleIntegerDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5586:28: ( (otherlv_0= 'int' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5587:1: (otherlv_0= 'int' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5587:1: (otherlv_0= 'int' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5587:3: otherlv_0= 'int' ()
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleIntegerDataType12672); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerDataTypeAccess().getIntKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5591:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5592:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5605:1: entryRuleBooleanDataType returns [EObject current=null] : iv_ruleBooleanDataType= ruleBooleanDataType EOF ;
    public final EObject entryRuleBooleanDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5606:2: (iv_ruleBooleanDataType= ruleBooleanDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5607:2: iv_ruleBooleanDataType= ruleBooleanDataType EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType12717);
            iv_ruleBooleanDataType=ruleBooleanDataType();

            state._fsp--;

             current =iv_ruleBooleanDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDataType12727); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5614:1: ruleBooleanDataType returns [EObject current=null] : (otherlv_0= 'bool' () ) ;
    public final EObject ruleBooleanDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5617:28: ( (otherlv_0= 'bool' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5618:1: (otherlv_0= 'bool' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5618:1: (otherlv_0= 'bool' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5618:3: otherlv_0= 'bool' ()
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleBooleanDataType12764); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanDataTypeAccess().getBoolKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5622:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5623:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5636:1: entryRuleFloatDataType returns [EObject current=null] : iv_ruleFloatDataType= ruleFloatDataType EOF ;
    public final EObject entryRuleFloatDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5637:2: (iv_ruleFloatDataType= ruleFloatDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5638:2: iv_ruleFloatDataType= ruleFloatDataType EOF
            {
             newCompositeNode(grammarAccess.getFloatDataTypeRule()); 
            pushFollow(FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType12809);
            iv_ruleFloatDataType=ruleFloatDataType();

            state._fsp--;

             current =iv_ruleFloatDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatDataType12819); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5645:1: ruleFloatDataType returns [EObject current=null] : (otherlv_0= 'float' () ) ;
    public final EObject ruleFloatDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5648:28: ( (otherlv_0= 'float' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5649:1: (otherlv_0= 'float' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5649:1: (otherlv_0= 'float' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5649:3: otherlv_0= 'float' ()
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleFloatDataType12856); 

                	newLeafNode(otherlv_0, grammarAccess.getFloatDataTypeAccess().getFloatKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5653:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5654:5: 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5667:1: entryRuleStringDataType returns [EObject current=null] : iv_ruleStringDataType= ruleStringDataType EOF ;
    public final EObject entryRuleStringDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringDataType = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5668:2: (iv_ruleStringDataType= ruleStringDataType EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5669:2: iv_ruleStringDataType= ruleStringDataType EOF
            {
             newCompositeNode(grammarAccess.getStringDataTypeRule()); 
            pushFollow(FOLLOW_ruleStringDataType_in_entryRuleStringDataType12901);
            iv_ruleStringDataType=ruleStringDataType();

            state._fsp--;

             current =iv_ruleStringDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDataType12911); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5676:1: ruleStringDataType returns [EObject current=null] : (otherlv_0= 'string' () ) ;
    public final EObject ruleStringDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5679:28: ( (otherlv_0= 'string' () ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5680:1: (otherlv_0= 'string' () )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5680:1: (otherlv_0= 'string' () )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5680:3: otherlv_0= 'string' ()
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleStringDataType12948); 

                	newLeafNode(otherlv_0, grammarAccess.getStringDataTypeAccess().getStringKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5684:1: ()
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:5685:5: 
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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\4\4\uffff\4\4\1\uffff\3\21\1\uffff";
    static final String DFA3_maxS =
        "\1\122\4\uffff\4\4\1\uffff\3\25\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\4\uffff\1\6\3\uffff\1\5";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\11\7\uffff\1\1\2\uffff\1\2\47\uffff\1\11\10\uffff\1\3\1\4"+
            "\15\uffff\1\5\1\7\1\6\1\10",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\2\11\2\uffff\1\15",
            "\2\11\2\uffff\1\15",
            "\2\11\2\uffff\1\15",
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
            return "188:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_StructureDeclaration_2= ruleStructureDeclaration | this_StreamDeclaration_3= ruleStreamDeclaration | this_FunctionDefinition_4= ruleFunctionDefinition | this_ProcessingExpression_5= ruleProcessingExpression )";
        }
    }
    static final String DFA42_eotS =
        "\12\uffff";
    static final String DFA42_eofS =
        "\12\uffff";
    static final String DFA42_minS =
        "\1\117\4\4\3\21\2\uffff";
    static final String DFA42_maxS =
        "\1\122\4\4\3\22\2\uffff";
    static final String DFA42_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\12\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1\1\3\1\2\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "4225:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableDefinition_1= ruleVariableDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageDeclaration230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration247 = new BitSet(new long[]{0x008000000000D010L,0x0000000000078003L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePackageDeclaration268 = new BitSet(new long[]{0x008000000000D010L,0x0000000000078003L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModelElement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModelElement401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDeclaration_in_ruleModelElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_ruleModelElement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleModelElement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingExpression_in_ruleModelElement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamStatement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamStatement704 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleStreamStatement717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamStatement737 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleStreamStatement751 = new BitSet(new long[]{0x00784007FE100000L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_ruleStreamStatement772 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamStatement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableStatement_in_ruleStatement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableStatement_in_entryRuleVariableStatement910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableStatement920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableStatement965 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableStatement977 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableStatement998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableStatement1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamAccess1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess1101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStreamAccess1113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDefinition1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamDefinition1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_entryRuleJoinOperator1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinOperator1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJoinOperator1343 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJoinOperator1355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1409 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleJoinOperator1422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleJoinOperator1443 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleJoinOperator1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamOperatorParameter1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1548 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStreamOperatorParameter1561 = new BitSet(new long[]{0x0000308000000000L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStreamOperatorParameter1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementJoinOperator1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleElementJoinOperator1679 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleElementJoinOperator1691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1713 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1739 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator1774 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator1809 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementJoinOperator1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator1844 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleElementJoinOperator1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_entryRuleFilterOperator1892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterOperator1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFilterOperator1939 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFilterOperator1951 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator1972 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator1985 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFilterOperator2006 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFilterOperator2020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleFilterOperator2041 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFilterOperator2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_entryRuleSplitOperator2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitOperator2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSplitOperator2136 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSplitOperator2148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSplitOperator2169 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSplitOperator2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_entryRuleMatchOperator2217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchOperator2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMatchOperator2264 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatchOperator2276 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2309 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMatchOperator2330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2363 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleMatchOperator2376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMatchOperator2397 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleMatchOperator2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymmetricDifferenceOperator_in_entryRuleSymmetricDifferenceOperator2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymmetricDifferenceOperator2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSymmetricDifferenceOperator2494 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSymmetricDifferenceOperator2506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2527 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSymmetricDifferenceOperator2539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2560 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleSymmetricDifferenceOperator2573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSymmetricDifferenceOperator2594 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleSymmetricDifferenceOperator2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDifferenceOperator_in_entryRuleDifferenceOperator2644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDifferenceOperator2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDifferenceOperator2691 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDifferenceOperator2703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2724 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDifferenceOperator2736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2757 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleDifferenceOperator2770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleDifferenceOperator2791 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleDifferenceOperator2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapOperator_in_entryRuleMapOperator2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapOperator2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMapOperator2888 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMapOperator2900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionStatement_in_ruleMapOperator2921 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapOperator2934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionStatement_in_ruleMapOperator2955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapOperator2969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleMapOperator2990 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMapOperator3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionStatement_in_entryRuleFunctionStatement3038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionStatement3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleFunctionStatement3094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionStatement3106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionStatement3126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionStatement3139 = new BitSet(new long[]{0x0000000000600050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionStatement3161 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionStatement3174 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionStatement3195 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionStatement3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_entryRuleInputOperator3248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOperator3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInputOperator3295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInputOperator3307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator3324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator3342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator3359 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator3378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleInputOperator3395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInputOperator3412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputOperator3429 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInputOperator3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnTypeOperator_in_entryRuleReturnTypeOperator3482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnTypeOperator3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOperator_in_ruleReturnTypeOperator3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinOperator_in_ruleReturnTypeOperator3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymmetricDifferenceOperator_in_ruleReturnTypeOperator3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDifferenceOperator_in_ruleReturnTypeOperator3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_ruleReturnTypeOperator3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_ruleReturnTypeOperator3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterOperator_in_ruleReturnTypeOperator3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitOperator_in_ruleReturnTypeOperator3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_ruleReturnTypeOperator3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_ruleReturnTypeOperator3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_ruleReturnTypeOperator3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_ruleReturnTypeOperator3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchOperator_in_ruleReturnTypeOperator3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapOperator_in_ruleReturnTypeOperator3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_ruleReturnTypeOperator3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_ruleReturnTypeOperator3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoReturnTypeOperator_in_entryRuleNoReturnTypeOperator3979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoReturnTypeOperator3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_ruleNoReturnTypeOperator4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_entryRuleTagOperator4069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagOperator4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTagOperator4116 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTagOperator4128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator4149 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTagOperator4162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator4183 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTagOperator4197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleTagOperator4218 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTagOperator4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagOperator_in_entryRuleUnTagOperator4266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagOperator4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleUnTagOperator4313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUnTagOperator4325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4346 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator4359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_ruleUnTagOperator4380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnTagOperator4394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleUnTagOperator4415 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleUnTagOperator4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnTagElement_in_entryRuleUnTagElement4463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnTagElement4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUnTagElement4518 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleUnTagElement4530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleUnTagElement4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_entryRuleTagElement4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagElement4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_ruleTagElement4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement4733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagClassElement4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagClassElement4789 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTagClassElement4801 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTagClassElement4813 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagClassElement4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement4869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagObjectPropertyElement4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement4925 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTagObjectPropertyElement4937 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTagObjectPropertyElement4949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement5005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement5061 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTagDataTypePropertyElement5073 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTagDataTypePropertyElement5085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator5141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrierOperator5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_ruleBarrierOperator5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_ruleBarrierOperator5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator5260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindowOperator5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleWindowOperator5314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleWindowOperator5344 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_40_in_ruleWindowOperator5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleWindowOperator5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleWindowOperator5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWindowOperator5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWindowOperator5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkerOperator_in_entryRuleMarkerOperator5547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkerOperator5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMarkerOperator5594 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMarkerOperator5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLOperator_in_entryRuleSWRLOperator5651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLOperator5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSWRLOperator5698 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLOperator5710 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_ruleSWRLOperator5731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5764 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLOperator5777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleSWRLOperator5798 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLOperator5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSWRLRule_in_entryRuleSWRLRule5848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSWRLRule5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSWRLRule5895 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSWRLRule5907 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_ruleSWRLRule5928 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSWRLRule5940 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_ruleSWRLRule5961 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSWRLRule5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntecedentRule_in_entryRuleAntecedentRule6009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntecedentRule6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAntecedentRule6056 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAntecedentRule6068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule6089 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleAntecedentRule6102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleAntecedentRule6123 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAntecedentRule6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsequentRule_in_entryRuleConsequentRule6173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsequentRule6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleConsequentRule6220 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConsequentRule6232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule6253 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleConsequentRule6266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleConsequentRule6287 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleConsequentRule6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule6337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule6392 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRule6404 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRule6416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule6437 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleRule6450 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleRule6462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleRule6483 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleRule6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperator_in_entryRuleOCLOperator6533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperator6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOCLOperator6580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOCLOperator6592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOCLOperator6609 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOCLOperator6626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOCLOperator6647 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOCLOperator6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_entryRuleCountOperator6695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountOperator6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCountOperator6742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCountOperator6754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleCountOperator6775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCountOperator6787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator6808 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCountOperator6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator6856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardDeviationOperator6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleStandardDeviationOperator6903 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStandardDeviationOperator6915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator6936 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStandardDeviationOperator6948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator6969 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStandardDeviationOperator6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator7017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageOperator7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAverageOperator7064 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageOperator7076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAverageOperator7097 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAverageOperator7109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator7130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAverageOperator7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator7178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperator7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOutputOperator7225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOutputOperator7237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator7258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator7287 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperator7304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator7325 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOutputOperator7337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOutputOperator7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter7385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperatorParameter7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter7441 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOutputOperatorParameter7454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter7475 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleProcessingExpression_in_entryRuleProcessingExpression7513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingExpression7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleProcessingExpression7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProcessingExpression7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_ruleProcessingExpression7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_ruleProcessingExpression7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleProcessingExpression7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoReturnTypeOperator_in_ruleProcessingExpression7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression7740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBlockExpression7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlockExpression7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileLoopDefinition_in_ruleBlockExpression7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpressions_in_ruleBlockExpression7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleBlockExpression7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement7940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReturnStatement7987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReturnVariable_in_ruleReturnStatement8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpressions_in_entryRuleConditionalExpressions8044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpressions8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseCondition_in_ruleConditionalExpressions8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCaseCondition_in_ruleConditionalExpressions8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseCondition_in_entryRuleIfElseCondition8163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseCondition8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleIfElseCondition8210 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIfElseCondition8222 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfElseCondition8243 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIfElseCondition8255 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIfElseCondition8267 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleIfElseCondition8288 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_14_in_ruleIfElseCondition8301 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleIfElseCondition8314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIfElseCondition8326 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleIfElseCondition8347 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_14_in_ruleIfElseCondition8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCaseCondition_in_entryRuleSwitchCaseCondition8398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCaseCondition8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSwitchCaseCondition8445 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSwitchCaseCondition8457 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchCaseCondition8478 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSwitchCaseCondition8490 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSwitchCaseCondition8502 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_ruleCaseStatement_in_ruleSwitchCaseCondition8523 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleSwitchCaseCondition8536 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleSwitchCaseCondition8548 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchCaseCondition8569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitchCaseCondition8581 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSwitchCaseCondition8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseStatement_in_entryRuleCaseStatement8629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseStatement8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCaseStatement8676 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseStatement8697 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleCaseStatement8709 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseStatement8730 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCaseStatement8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition8778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionDefinition8834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDefinition8851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDefinition8868 = new BitSet(new long[]{0x0000000000400000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition8890 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition8903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition8924 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDefinition8940 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDefinition8952 = new BitSet(new long[]{0x8B00000000000010L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleFunctionDefinition8973 = new BitSet(new long[]{0x8B00000000000010L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleFunctionDefinition8995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDefinition9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnVariable_in_entryRuleReturnVariable9043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnVariable9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReturnVariable9098 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReturnVariable9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration9148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleParameterDeclaration9204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileLoopDefinition_in_entryRuleWhileLoopDefinition9262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoopDefinition9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleWhileLoopDefinition9309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWhileLoopDefinition9321 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoopDefinition9342 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhileLoopDefinition9354 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleWhileLoopDefinition9366 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleWhileLoopDefinition9387 = new BitSet(new long[]{0x8B00000000004010L,0x0000000000078000L});
    public static final BitSet FOLLOW_14_in_ruleWhileLoopDefinition9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable9436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariable9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariable9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition9555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_ruleVariableDefinition9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_ruleVariableDefinition9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_ruleVariableDefinition9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration9701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleVariableDeclaration9757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration9774 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVariableDefinition_in_entryRuleNumberVariableDefinition9827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberVariableDefinition9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleNumberVariableDefinition9883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNumberVariableDefinition9900 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNumberVariableDefinition9917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberVariableDefinition9934 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNumberVariableDefinition9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVariableDefinition_in_entryRuleStringVariableDefinition9987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVariableDefinition9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleStringVariableDefinition10043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVariableDefinition10060 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStringVariableDefinition10077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringVariableDefinition10094 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringVariableDefinition10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariableDefinition_in_entryRuleBooleanVariableDefinition10147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariableDefinition10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleBooleanVariableDefinition10203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanVariableDefinition10220 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanVariableDefinition10237 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLVALUE_in_ruleBooleanVariableDefinition10254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBooleanVariableDefinition10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDeclaration_in_entryRuleStructureDeclaration10307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDeclaration10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStructureDeclaration10354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureDeclaration10371 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructureDeclaration10388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStructureDeclaration10409 = new BitSet(new long[]{0x0000000000004000L,0x0000000000078000L});
    public static final BitSet FOLLOW_14_in_ruleStructureDeclaration10422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureDeclaration10434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration10470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDeclaration10480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStreamDeclaration10517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDeclaration10534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStreamDeclaration10551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078004L});
    public static final BitSet FOLLOW_ruleStreamElement_in_ruleStreamDeclaration10572 = new BitSet(new long[]{0x0000000000004000L,0x0000000000078004L});
    public static final BitSet FOLLOW_14_in_ruleStreamDeclaration10585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStreamDeclaration10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_entryRuleStreamElement10633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamElement10643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_ruleStreamElement10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStreamElement10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureElements_in_entryRuleStructureElements10752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureElements10762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStructureElements10799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureElements10819 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureElements10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression10867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr10957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr11014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleOr11041 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr11075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd11113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd11170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleAnd11197 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAnd11231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression11269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression11326 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007E0L});
    public static final BitSet FOLLOW_69_in_ruleRelationalExpression11355 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_70_in_ruleRelationalExpression11384 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_71_in_ruleRelationalExpression11413 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_72_in_ruleRelationalExpression11442 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_73_in_ruleRelationalExpression11471 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_74_in_ruleRelationalExpression11500 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelationalExpression11537 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition11575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition11632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleAddition11655 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_76_in_ruleAddition11684 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition11707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication11745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication11755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication11802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleMultiplication11825 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_78_in_ruleMultiplication11854 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication11877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression11925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression11963 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression11985 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression12030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rulePrimaryExpression12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression12147 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression12160 = new BitSet(new long[]{0x0000000000600050L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression12182 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression12195 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression12216 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType12270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_ruleDataType12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_ruleDataType12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDataType_in_entryRuleSimpleDataType12389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDataType12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_ruleSimpleDataType12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_ruleSimpleDataType12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_ruleSimpleDataType12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType12535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType12545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_ruleComplexDataType12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDataType_in_entryRuleIntegerDataType12625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDataType12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleIntegerDataType12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDataType_in_entryRuleBooleanDataType12717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDataType12727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBooleanDataType12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatDataType_in_entryRuleFloatDataType12809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatDataType12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleFloatDataType12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDataType_in_entryRuleStringDataType12901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDataType12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleStringDataType12948 = new BitSet(new long[]{0x0000000000000002L});

}