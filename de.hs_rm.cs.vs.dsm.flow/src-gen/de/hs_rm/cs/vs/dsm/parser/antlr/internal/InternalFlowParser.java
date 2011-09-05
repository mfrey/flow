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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "';'", "'stream'", "'import'", "'var'", "'let'", "'='", "'.'", "'['", "']'", "'count'", "'('", "','", "')'", "'std'", "'avg'", "'ejoin'", "'tag'", "'is'", "'class'", "'objectproperty'", "'datatype'", "'out'", "'last'", "'min'", "'hrs'", "'sec'", "'elements'", "'now'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:76:1: ruleModel returns [EObject current=null] : ( (lv_model_0_0= rulePackageDeclaration ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:79:28: ( ( (lv_model_0_0= rulePackageDeclaration ) )+ )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:80:1: ( (lv_model_0_0= rulePackageDeclaration ) )+
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:80:1: ( (lv_model_0_0= rulePackageDeclaration ) )+
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
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: (lv_model_0_0= rulePackageDeclaration )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:81:1: (lv_model_0_0= rulePackageDeclaration )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:82:3: lv_model_0_0= rulePackageDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getModelPackageDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModel130);
            	    lv_model_0_0=rulePackageDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"model",
            	            		lv_model_0_0, 
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:115:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleModelElement ) )* otherlv_4= '}' otherlv_5= ';'
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

                if ( (LA2_0==RULE_ID||LA2_0==12||(LA2_0>=16 && LA2_0<=19)||LA2_0==24||(LA2_0>=28 && LA2_0<=31)||LA2_0==36) ) {
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
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration293); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_5());
                

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:179:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:180:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:181:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement329);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement339); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:188:1: ruleModelElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_TestElement_2= ruleTestElement | this_TestAssign_3= ruleTestAssign | this_StreamDeclaration_4= ruleStreamDeclaration | this_Operator_5= ruleOperator | this_StreamDefinition_6= ruleStreamDefinition ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Import_1 = null;

        EObject this_TestElement_2 = null;

        EObject this_TestAssign_3 = null;

        EObject this_StreamDeclaration_4 = null;

        EObject this_Operator_5 = null;

        EObject this_StreamDefinition_6 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:191:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_TestElement_2= ruleTestElement | this_TestAssign_3= ruleTestAssign | this_StreamDeclaration_4= ruleStreamDeclaration | this_Operator_5= ruleOperator | this_StreamDefinition_6= ruleStreamDefinition ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:192:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_TestElement_2= ruleTestElement | this_TestAssign_3= ruleTestAssign | this_StreamDeclaration_4= ruleStreamDeclaration | this_Operator_5= ruleOperator | this_StreamDefinition_6= ruleStreamDefinition )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:192:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Import_1= ruleImport | this_TestElement_2= ruleTestElement | this_TestAssign_3= ruleTestAssign | this_StreamDeclaration_4= ruleStreamDeclaration | this_Operator_5= ruleOperator | this_StreamDefinition_6= ruleStreamDefinition )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 24:
            case 28:
            case 29:
            case 30:
            case 31:
            case 36:
                {
                alt3=6;
                }
                break;
            case RULE_ID:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:193:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleModelElement386);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:203:5: this_Import_1= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getImportParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleModelElement413);
                    this_Import_1=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:213:5: this_TestElement_2= ruleTestElement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getTestElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTestElement_in_ruleModelElement440);
                    this_TestElement_2=ruleTestElement();

                    state._fsp--;

                     
                            current = this_TestElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:223:5: this_TestAssign_3= ruleTestAssign
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getTestAssignParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTestAssign_in_ruleModelElement467);
                    this_TestAssign_3=ruleTestAssign();

                    state._fsp--;

                     
                            current = this_TestAssign_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:233:5: this_StreamDeclaration_4= ruleStreamDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStreamDeclaration_in_ruleModelElement494);
                    this_StreamDeclaration_4=ruleStreamDeclaration();

                    state._fsp--;

                     
                            current = this_StreamDeclaration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:243:5: this_Operator_5= ruleOperator
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOperator_in_ruleModelElement521);
                    this_Operator_5=ruleOperator();

                    state._fsp--;

                     
                            current = this_Operator_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:253:5: this_StreamDefinition_6= ruleStreamDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getStreamDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleStreamDefinition_in_ruleModelElement548);
                    this_StreamDefinition_6=ruleStreamDefinition();

                    state._fsp--;

                     
                            current = this_StreamDefinition_6; 
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


    // $ANTLR start "entryRuleStreamDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:269:1: entryRuleStreamDeclaration returns [EObject current=null] : iv_ruleStreamDeclaration= ruleStreamDeclaration EOF ;
    public final EObject entryRuleStreamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:270:2: (iv_ruleStreamDeclaration= ruleStreamDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:271:2: iv_ruleStreamDeclaration= ruleStreamDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStreamDeclarationRule()); 
            pushFollow(FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration583);
            iv_ruleStreamDeclaration=ruleStreamDeclaration();

            state._fsp--;

             current =iv_ruleStreamDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDeclaration593); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:278:1: ruleStreamDeclaration returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:281:28: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:282:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:282:1: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:282:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStreamElement ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStreamDeclaration630); 

                	newLeafNode(otherlv_0, grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:286:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:287:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:287:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:288:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDeclaration647); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStreamDeclaration664); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:308:1: ( (lv_elements_3_0= ruleStreamElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:309:1: (lv_elements_3_0= ruleStreamElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:309:1: (lv_elements_3_0= ruleStreamElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:310:3: lv_elements_3_0= ruleStreamElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamElement_in_ruleStreamDeclaration685);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStreamDeclaration698); 

                	newLeafNode(otherlv_4, grammarAccess.getStreamDeclarationAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStreamDeclaration710); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:342:1: entryRuleStreamElement returns [EObject current=null] : iv_ruleStreamElement= ruleStreamElement EOF ;
    public final EObject entryRuleStreamElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:343:2: (iv_ruleStreamElement= ruleStreamElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:344:2: iv_ruleStreamElement= ruleStreamElement EOF
            {
             newCompositeNode(grammarAccess.getStreamElementRule()); 
            pushFollow(FOLLOW_ruleStreamElement_in_entryRuleStreamElement746);
            iv_ruleStreamElement=ruleStreamElement();

            state._fsp--;

             current =iv_ruleStreamElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamElement756); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:351:1: ruleStreamElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStreamElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:354:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:355:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:356:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:356:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:357:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamElement801); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamElementAccess().getTypeJvmTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:368:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:369:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:369:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:370:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamElement818); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStreamElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStreamElement835); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamElementAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleImport"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:398:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:399:2: (iv_ruleImport= ruleImport EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:400:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport871);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport881); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:407:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:410:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:411:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:411:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:411:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport918); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:415:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:416:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:416:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:417:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport935); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImport952); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleTestElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:445:1: entryRuleTestElement returns [EObject current=null] : iv_ruleTestElement= ruleTestElement EOF ;
    public final EObject entryRuleTestElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:446:2: (iv_ruleTestElement= ruleTestElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:447:2: iv_ruleTestElement= ruleTestElement EOF
            {
             newCompositeNode(grammarAccess.getTestElementRule()); 
            pushFollow(FOLLOW_ruleTestElement_in_entryRuleTestElement988);
            iv_ruleTestElement=ruleTestElement();

            state._fsp--;

             current =iv_ruleTestElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestElement998); 

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
    // $ANTLR end "entryRuleTestElement"


    // $ANTLR start "ruleTestElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:454:1: ruleTestElement returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTestElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:457:28: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:458:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:458:1: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:458:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTestElement1035); 

                	newLeafNode(otherlv_0, grammarAccess.getTestElementAccess().getVarKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:463:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:463:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:464:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestElement1052); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTestElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestElementRule());
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
    // $ANTLR end "ruleTestElement"


    // $ANTLR start "entryRuleTestAssign"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:488:1: entryRuleTestAssign returns [EObject current=null] : iv_ruleTestAssign= ruleTestAssign EOF ;
    public final EObject entryRuleTestAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestAssign = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:489:2: (iv_ruleTestAssign= ruleTestAssign EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:490:2: iv_ruleTestAssign= ruleTestAssign EOF
            {
             newCompositeNode(grammarAccess.getTestAssignRule()); 
            pushFollow(FOLLOW_ruleTestAssign_in_entryRuleTestAssign1093);
            iv_ruleTestAssign=ruleTestAssign();

            state._fsp--;

             current =iv_ruleTestAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestAssign1103); 

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
    // $ANTLR end "entryRuleTestAssign"


    // $ANTLR start "ruleTestAssign"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:497:1: ruleTestAssign returns [EObject current=null] : (otherlv_0= 'let' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTestAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:500:28: ( (otherlv_0= 'let' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:501:1: (otherlv_0= 'let' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:501:1: (otherlv_0= 'let' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:501:3: otherlv_0= 'let' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTestAssign1140); 

                	newLeafNode(otherlv_0, grammarAccess.getTestAssignAccess().getLetKeyword_0());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:505:1: ( (otherlv_1= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:506:1: (otherlv_1= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:506:1: (otherlv_1= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:507:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTestAssignRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestAssign1160); 

            		newLeafNode(otherlv_1, grammarAccess.getTestAssignAccess().getLeftTestElementCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTestAssign1172); 

                	newLeafNode(otherlv_2, grammarAccess.getTestAssignAccess().getEqualsSignKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:522:1: ( (otherlv_3= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:523:1: (otherlv_3= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:523:1: (otherlv_3= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:524:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTestAssignRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestAssign1192); 

            		newLeafNode(otherlv_3, grammarAccess.getTestAssignAccess().getRightTestElementCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleTestAssign"


    // $ANTLR start "entryRuleOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:545:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:546:2: (iv_ruleOperator= ruleOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:547:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1230);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1240); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:554:1: ruleOperator returns [EObject current=null] : (this_ElementJoinOperator_0= ruleElementJoinOperator | this_TagOperator_1= ruleTagOperator | this_CountOperator_2= ruleCountOperator | this_StandardDeviationOperator_3= ruleStandardDeviationOperator | this_AverageOperator_4= ruleAverageOperator | this_OutputOperator_5= ruleOutputOperator ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_ElementJoinOperator_0 = null;

        EObject this_TagOperator_1 = null;

        EObject this_CountOperator_2 = null;

        EObject this_StandardDeviationOperator_3 = null;

        EObject this_AverageOperator_4 = null;

        EObject this_OutputOperator_5 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:557:28: ( (this_ElementJoinOperator_0= ruleElementJoinOperator | this_TagOperator_1= ruleTagOperator | this_CountOperator_2= ruleCountOperator | this_StandardDeviationOperator_3= ruleStandardDeviationOperator | this_AverageOperator_4= ruleAverageOperator | this_OutputOperator_5= ruleOutputOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:558:1: (this_ElementJoinOperator_0= ruleElementJoinOperator | this_TagOperator_1= ruleTagOperator | this_CountOperator_2= ruleCountOperator | this_StandardDeviationOperator_3= ruleStandardDeviationOperator | this_AverageOperator_4= ruleAverageOperator | this_OutputOperator_5= ruleOutputOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:558:1: (this_ElementJoinOperator_0= ruleElementJoinOperator | this_TagOperator_1= ruleTagOperator | this_CountOperator_2= ruleCountOperator | this_StandardDeviationOperator_3= ruleStandardDeviationOperator | this_AverageOperator_4= ruleAverageOperator | this_OutputOperator_5= ruleOutputOperator )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 36:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:559:5: this_ElementJoinOperator_0= ruleElementJoinOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getElementJoinOperatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleElementJoinOperator_in_ruleOperator1287);
                    this_ElementJoinOperator_0=ruleElementJoinOperator();

                    state._fsp--;

                     
                            current = this_ElementJoinOperator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:569:5: this_TagOperator_1= ruleTagOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getTagOperatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTagOperator_in_ruleOperator1314);
                    this_TagOperator_1=ruleTagOperator();

                    state._fsp--;

                     
                            current = this_TagOperator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:579:5: this_CountOperator_2= ruleCountOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getCountOperatorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCountOperator_in_ruleOperator1341);
                    this_CountOperator_2=ruleCountOperator();

                    state._fsp--;

                     
                            current = this_CountOperator_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:589:5: this_StandardDeviationOperator_3= ruleStandardDeviationOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getStandardDeviationOperatorParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStandardDeviationOperator_in_ruleOperator1368);
                    this_StandardDeviationOperator_3=ruleStandardDeviationOperator();

                    state._fsp--;

                     
                            current = this_StandardDeviationOperator_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:599:5: this_AverageOperator_4= ruleAverageOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getAverageOperatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAverageOperator_in_ruleOperator1395);
                    this_AverageOperator_4=ruleAverageOperator();

                    state._fsp--;

                     
                            current = this_AverageOperator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:609:5: this_OutputOperator_5= ruleOutputOperator
                    {
                     
                            newCompositeNode(grammarAccess.getOperatorAccess().getOutputOperatorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleOutputOperator_in_ruleOperator1422);
                    this_OutputOperator_5=ruleOutputOperator();

                    state._fsp--;

                     
                            current = this_OutputOperator_5; 
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:627:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:628:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:629:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1459);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1469); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:636:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:639:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:640:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:641:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:641:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:642:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1514); 

            		newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:653:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:654:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:654:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1531); 

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


    // $ANTLR start "entryRuleStreamDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:679:1: entryRuleStreamDefinition returns [EObject current=null] : iv_ruleStreamDefinition= ruleStreamDefinition EOF ;
    public final EObject entryRuleStreamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamDefinition = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:680:2: (iv_ruleStreamDefinition= ruleStreamDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:681:2: iv_ruleStreamDefinition= ruleStreamDefinition EOF
            {
             newCompositeNode(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1572);
            iv_ruleStreamDefinition=ruleStreamDefinition();

            state._fsp--;

             current =iv_ruleStreamDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDefinition1582); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:688:1: ruleStreamDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStreamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:691:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:692:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:692:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:692:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:692:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:693:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:694:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamDefinitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1627); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:705:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:706:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:706:1: (lv_name_1_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:707:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamDefinition1644); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStreamDefinition1661); 

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


    // $ANTLR start "entryRuleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:735:1: entryRuleStreamAccess returns [EObject current=null] : iv_ruleStreamAccess= ruleStreamAccess EOF ;
    public final EObject entryRuleStreamAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamAccess = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:736:2: (iv_ruleStreamAccess= ruleStreamAccess EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:737:2: iv_ruleStreamAccess= ruleStreamAccess EOF
            {
             newCompositeNode(grammarAccess.getStreamAccessRule()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess1697);
            iv_ruleStreamAccess=ruleStreamAccess();

            state._fsp--;

             current =iv_ruleStreamAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamAccess1707); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:744:1: ruleStreamAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStreamAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:747:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:748:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:748:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:748:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:748:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:749:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:749:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:750:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess1752); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStreamAccess1764); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamAccessAccess().getFullStopKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:765:1: ( (otherlv_2= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:766:1: (otherlv_2= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:766:1: (otherlv_2= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:767:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamAccessRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamAccess1784); 

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


    // $ANTLR start "entryRuleStreamOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:786:1: entryRuleStreamOperatorParameter returns [EObject current=null] : iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF ;
    public final EObject entryRuleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:787:2: (iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:788:2: iv_ruleStreamOperatorParameter= ruleStreamOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getStreamOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1820);
            iv_ruleStreamOperatorParameter=ruleStreamOperatorParameter();

            state._fsp--;

             current =iv_ruleStreamOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamOperatorParameter1830); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:795:1: ruleStreamOperatorParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleStreamOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_barrier_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:798:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:799:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:799:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )? )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:799:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:799:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:800:1: (otherlv_0= RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:800:1: (otherlv_0= RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:801:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStreamOperatorParameterRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1875); 

            		newLeafNode(otherlv_0, grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 
            	

            }


            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:812:2: (otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:812:4: otherlv_1= '[' ( (lv_barrier_2_0= ruleBarrierOperator ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStreamOperatorParameter1888); 

                        	newLeafNode(otherlv_1, grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:816:1: ( (lv_barrier_2_0= ruleBarrierOperator ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:817:1: (lv_barrier_2_0= ruleBarrierOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:817:1: (lv_barrier_2_0= ruleBarrierOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:818:3: lv_barrier_2_0= ruleBarrierOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1909);
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

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStreamOperatorParameter1921); 

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


    // $ANTLR start "entryRuleCountOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:846:1: entryRuleCountOperator returns [EObject current=null] : iv_ruleCountOperator= ruleCountOperator EOF ;
    public final EObject entryRuleCountOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:847:2: (iv_ruleCountOperator= ruleCountOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:848:2: iv_ruleCountOperator= ruleCountOperator EOF
            {
             newCompositeNode(grammarAccess.getCountOperatorRule()); 
            pushFollow(FOLLOW_ruleCountOperator_in_entryRuleCountOperator1959);
            iv_ruleCountOperator=ruleCountOperator();

            state._fsp--;

             current =iv_ruleCountOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountOperator1969); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:855:1: ruleCountOperator returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:858:28: ( (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:859:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:859:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:859:3: otherlv_0= 'count' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCountOperator2006); 

                	newLeafNode(otherlv_0, grammarAccess.getCountOperatorAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCountOperator2018); 

                	newLeafNode(otherlv_1, grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:867:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:868:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:868:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:869:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleCountOperator2039);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCountOperator2051); 

                	newLeafNode(otherlv_3, grammarAccess.getCountOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:889:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:890:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:890:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:891:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator2072);
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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleCountOperator2084); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:919:1: entryRuleStandardDeviationOperator returns [EObject current=null] : iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF ;
    public final EObject entryRuleStandardDeviationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviationOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:920:2: (iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:921:2: iv_ruleStandardDeviationOperator= ruleStandardDeviationOperator EOF
            {
             newCompositeNode(grammarAccess.getStandardDeviationOperatorRule()); 
            pushFollow(FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator2120);
            iv_ruleStandardDeviationOperator=ruleStandardDeviationOperator();

            state._fsp--;

             current =iv_ruleStandardDeviationOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardDeviationOperator2130); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:928:1: ruleStandardDeviationOperator returns [EObject current=null] : (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:931:28: ( (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:932:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:932:1: (otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:932:3: otherlv_0= 'std' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleStandardDeviationOperator2167); 

                	newLeafNode(otherlv_0, grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleStandardDeviationOperator2179); 

                	newLeafNode(otherlv_1, grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:940:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:941:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:941:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:942:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator2200);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleStandardDeviationOperator2212); 

                	newLeafNode(otherlv_3, grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:962:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:963:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:964:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator2233);
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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleStandardDeviationOperator2245); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:992:1: entryRuleAverageOperator returns [EObject current=null] : iv_ruleAverageOperator= ruleAverageOperator EOF ;
    public final EObject entryRuleAverageOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:993:2: (iv_ruleAverageOperator= ruleAverageOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:994:2: iv_ruleAverageOperator= ruleAverageOperator EOF
            {
             newCompositeNode(grammarAccess.getAverageOperatorRule()); 
            pushFollow(FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator2281);
            iv_ruleAverageOperator=ruleAverageOperator();

            state._fsp--;

             current =iv_ruleAverageOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageOperator2291); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1001:1: ruleAverageOperator returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1004:28: ( (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1005:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1005:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1005:3: otherlv_0= 'avg' otherlv_1= '(' ( (lv_parameter_2_0= ruleStreamAccess ) ) otherlv_3= ',' ( (lv_stream_4_0= ruleStreamOperatorParameter ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAverageOperator2328); 

                	newLeafNode(otherlv_0, grammarAccess.getAverageOperatorAccess().getAvgKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAverageOperator2340); 

                	newLeafNode(otherlv_1, grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1013:1: ( (lv_parameter_2_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1014:1: (lv_parameter_2_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1014:1: (lv_parameter_2_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1015:3: lv_parameter_2_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleAverageOperator2361);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleAverageOperator2373); 

                	newLeafNode(otherlv_3, grammarAccess.getAverageOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1035:1: ( (lv_stream_4_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1036:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1036:1: (lv_stream_4_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1037:3: lv_stream_4_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator2394);
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

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleAverageOperator2406); 

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


    // $ANTLR start "entryRuleElementJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1065:1: entryRuleElementJoinOperator returns [EObject current=null] : iv_ruleElementJoinOperator= ruleElementJoinOperator EOF ;
    public final EObject entryRuleElementJoinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementJoinOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1066:2: (iv_ruleElementJoinOperator= ruleElementJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1067:2: iv_ruleElementJoinOperator= ruleElementJoinOperator EOF
            {
             newCompositeNode(grammarAccess.getElementJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator2442);
            iv_ruleElementJoinOperator=ruleElementJoinOperator();

            state._fsp--;

             current =iv_ruleElementJoinOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementJoinOperator2452); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1074:1: ruleElementJoinOperator returns [EObject current=null] : (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1077:28: ( (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1078:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1078:1: (otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1078:3: otherlv_0= 'ejoin' otherlv_1= '(' ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )* (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ',' ( (lv_parameter_9_0= ruleStreamOperatorParameter ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleElementJoinOperator2489); 

                	newLeafNode(otherlv_0, grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleElementJoinOperator2501); 

                	newLeafNode(otherlv_1, grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1086:1: ( ( (lv_elementParameters_2_0= ruleStreamAccess ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==26) ) {
                    alt7=2;
                }
                else if ( (LA7_1==21) ) {
                    alt7=1;
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1086:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1086:2: ( (lv_elementParameters_2_0= ruleStreamAccess ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1087:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1087:1: (lv_elementParameters_2_0= ruleStreamAccess )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1088:3: lv_elementParameters_2_0= ruleStreamAccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator2523);
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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1105:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1105:6: ( (otherlv_3= RULE_ID ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1106:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1106:1: (otherlv_3= RULE_ID )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1107:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator2549); 

                    		newLeafNode(otherlv_3, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1118:3: (otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        int LA8_2 = input.LA(3);

                        if ( (LA8_2==21) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1118:5: otherlv_4= ',' ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleElementJoinOperator2563); 

            	        	newLeafNode(otherlv_4, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1122:1: ( (lv_elementParameters_5_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1123:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1123:1: (lv_elementParameters_5_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1124:3: lv_elementParameters_5_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator2584);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1140:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID) ) {
                        int LA9_2 = input.LA(3);

                        if ( (LA9_2==26) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1140:6: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleElementJoinOperator2599); 

            	        	newLeafNode(otherlv_6, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1144:1: ( (otherlv_7= RULE_ID ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1145:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1145:1: (otherlv_7= RULE_ID )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1146:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getElementJoinOperatorRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementJoinOperator2619); 

            	    		newLeafNode(otherlv_7, grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleElementJoinOperator2633); 

                	newLeafNode(otherlv_8, grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1161:1: ( (lv_parameter_9_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1162:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1162:1: (lv_parameter_9_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1163:3: lv_parameter_9_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator2654);
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

            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleElementJoinOperator2666); 

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


    // $ANTLR start "entryRuleTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1191:1: entryRuleTagOperator returns [EObject current=null] : iv_ruleTagOperator= ruleTagOperator EOF ;
    public final EObject entryRuleTagOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1192:2: (iv_ruleTagOperator= ruleTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1193:2: iv_ruleTagOperator= ruleTagOperator EOF
            {
             newCompositeNode(grammarAccess.getTagOperatorRule()); 
            pushFollow(FOLLOW_ruleTagOperator_in_entryRuleTagOperator2702);
            iv_ruleTagOperator=ruleTagOperator();

            state._fsp--;

             current =iv_ruleTagOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagOperator2712); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1200:1: ruleTagOperator returns [EObject current=null] : (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1203:28: ( (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1204:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1204:1: (otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1204:3: otherlv_0= 'tag' otherlv_1= '(' ( (lv_parameters_2_0= ruleTagElement ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )* otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTagOperator2749); 

                	newLeafNode(otherlv_0, grammarAccess.getTagOperatorAccess().getTagKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTagOperator2761); 

                	newLeafNode(otherlv_1, grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1212:1: ( (lv_parameters_2_0= ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1213:1: (lv_parameters_2_0= ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1213:1: (lv_parameters_2_0= ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1214:3: lv_parameters_2_0= ruleTagElement
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator2782);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1230:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        int LA10_2 = input.LA(3);

                        if ( (LA10_2==21) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1230:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleTagElement ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTagOperator2795); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1234:1: ( (lv_parameters_4_0= ruleTagElement ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1235:1: (lv_parameters_4_0= ruleTagElement )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1235:1: (lv_parameters_4_0= ruleTagElement )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1236:3: lv_parameters_4_0= ruleTagElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTagElement_in_ruleTagOperator2816);
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
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleTagOperator2830); 

                	newLeafNode(otherlv_5, grammarAccess.getTagOperatorAccess().getCommaKeyword_4());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1256:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1257:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1257:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1258:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleTagOperator2851);
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

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleTagOperator2863); 

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


    // $ANTLR start "entryRuleTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1286:1: entryRuleTagElement returns [EObject current=null] : iv_ruleTagElement= ruleTagElement EOF ;
    public final EObject entryRuleTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1287:2: (iv_ruleTagElement= ruleTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1288:2: iv_ruleTagElement= ruleTagElement EOF
            {
             newCompositeNode(grammarAccess.getTagElementRule()); 
            pushFollow(FOLLOW_ruleTagElement_in_entryRuleTagElement2899);
            iv_ruleTagElement=ruleTagElement();

            state._fsp--;

             current =iv_ruleTagElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagElement2909); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1295:1: ruleTagElement returns [EObject current=null] : (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) ;
    public final EObject ruleTagElement() throws RecognitionException {
        EObject current = null;

        EObject this_TagClassElement_0 = null;

        EObject this_TagObjectPropertyElement_1 = null;

        EObject this_TagDataTypePropertyElement_2 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1298:28: ( (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1299:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1299:1: (this_TagClassElement_0= ruleTagClassElement | this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement | this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RULE_ID) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==32) ) {
                            switch ( input.LA(5) ) {
                            case 33:
                                {
                                alt11=1;
                                }
                                break;
                            case 34:
                                {
                                alt11=2;
                                }
                                break;
                            case 35:
                                {
                                alt11=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1300:5: this_TagClassElement_0= ruleTagClassElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTagClassElement_in_ruleTagElement2956);
                    this_TagClassElement_0=ruleTagClassElement();

                    state._fsp--;

                     
                            current = this_TagClassElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1310:5: this_TagObjectPropertyElement_1= ruleTagObjectPropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement2983);
                    this_TagObjectPropertyElement_1=ruleTagObjectPropertyElement();

                    state._fsp--;

                     
                            current = this_TagObjectPropertyElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1320:5: this_TagDataTypePropertyElement_2= ruleTagDataTypePropertyElement
                    {
                     
                            newCompositeNode(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement3010);
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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1336:1: entryRuleTagClassElement returns [EObject current=null] : iv_ruleTagClassElement= ruleTagClassElement EOF ;
    public final EObject entryRuleTagClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagClassElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1337:2: (iv_ruleTagClassElement= ruleTagClassElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1338:2: iv_ruleTagClassElement= ruleTagClassElement EOF
            {
             newCompositeNode(grammarAccess.getTagClassElementRule()); 
            pushFollow(FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement3045);
            iv_ruleTagClassElement=ruleTagClassElement();

            state._fsp--;

             current =iv_ruleTagClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagClassElement3055); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1345:1: ruleTagClassElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagClassElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1348:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1349:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1349:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1349:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'class' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1349:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1350:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1350:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1351:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagClassElement3101);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTagClassElement3113); 

                	newLeafNode(otherlv_1, grammarAccess.getTagClassElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTagClassElement3125); 

                	newLeafNode(otherlv_2, grammarAccess.getTagClassElementAccess().getClassKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1375:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1376:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1376:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1377:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagClassElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagClassElement3145); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1396:1: entryRuleTagObjectPropertyElement returns [EObject current=null] : iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF ;
    public final EObject entryRuleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagObjectPropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1397:2: (iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1398:2: iv_ruleTagObjectPropertyElement= ruleTagObjectPropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagObjectPropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement3181);
            iv_ruleTagObjectPropertyElement=ruleTagObjectPropertyElement();

            state._fsp--;

             current =iv_ruleTagObjectPropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagObjectPropertyElement3191); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1405:1: ruleTagObjectPropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagObjectPropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1408:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1409:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1409:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1409:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'objectproperty' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1409:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1410:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1410:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1411:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement3237);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTagObjectPropertyElement3249); 

                	newLeafNode(otherlv_1, grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleTagObjectPropertyElement3261); 

                	newLeafNode(otherlv_2, grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1435:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1436:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1436:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1437:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagObjectPropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement3281); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1456:1: entryRuleTagDataTypePropertyElement returns [EObject current=null] : iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF ;
    public final EObject entryRuleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagDataTypePropertyElement = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1457:2: (iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1458:2: iv_ruleTagDataTypePropertyElement= ruleTagDataTypePropertyElement EOF
            {
             newCompositeNode(grammarAccess.getTagDataTypePropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement3317);
            iv_ruleTagDataTypePropertyElement=ruleTagDataTypePropertyElement();

            state._fsp--;

             current =iv_ruleTagDataTypePropertyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement3327); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1465:1: ruleTagDataTypePropertyElement returns [EObject current=null] : ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleTagDataTypePropertyElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1468:28: ( ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1469:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1469:1: ( ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1469:2: ( (lv_reference_0_0= ruleStreamAccess ) ) otherlv_1= 'is' otherlv_2= 'datatype' ( (otherlv_3= RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1469:2: ( (lv_reference_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1470:1: (lv_reference_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1470:1: (lv_reference_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1471:3: lv_reference_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement3373);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTagDataTypePropertyElement3385); 

                	newLeafNode(otherlv_1, grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTagDataTypePropertyElement3397); 

                	newLeafNode(otherlv_2, grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1495:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1496:1: (otherlv_3= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1496:1: (otherlv_3= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1497:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTagDataTypePropertyElementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement3417); 

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


    // $ANTLR start "entryRuleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1516:1: entryRuleOutputOperator returns [EObject current=null] : iv_ruleOutputOperator= ruleOutputOperator EOF ;
    public final EObject entryRuleOutputOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1517:2: (iv_ruleOutputOperator= ruleOutputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1518:2: iv_ruleOutputOperator= ruleOutputOperator EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorRule()); 
            pushFollow(FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator3453);
            iv_ruleOutputOperator=ruleOutputOperator();

            state._fsp--;

             current =iv_ruleOutputOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperator3463); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1525:1: ruleOutputOperator returns [EObject current=null] : (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1528:28: ( (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1529:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1529:1: (otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';' )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1529:3: otherlv_0= 'out' otherlv_1= '(' ( (lv_parameter_2_0= ruleOutputOperatorParameter ) ) otherlv_3= ',' ( (lv_location_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_stream_6_0= ruleStreamOperatorParameter ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleOutputOperator3500); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputOperatorAccess().getOutKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleOutputOperator3512); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1537:1: ( (lv_parameter_2_0= ruleOutputOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1538:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1538:1: (lv_parameter_2_0= ruleOutputOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1539:3: lv_parameter_2_0= ruleOutputOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator3533);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleOutputOperator3545); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputOperatorAccess().getCommaKeyword_3());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1559:1: ( (lv_location_4_0= RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1560:1: (lv_location_4_0= RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1560:1: (lv_location_4_0= RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1561:3: lv_location_4_0= RULE_STRING
            {
            lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOutputOperator3562); 

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

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleOutputOperator3579); 

                	newLeafNode(otherlv_5, grammarAccess.getOutputOperatorAccess().getCommaKeyword_5());
                
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1581:1: ( (lv_stream_6_0= ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1582:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1582:1: (lv_stream_6_0= ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1583:3: lv_stream_6_0= ruleStreamOperatorParameter
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator3600);
            lv_stream_6_0=ruleStreamOperatorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"stream",
                    		lv_stream_6_0, 
                    		"StreamOperatorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleOutputOperator3612); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleOutputOperator3624); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1615:1: entryRuleOutputOperatorParameter returns [EObject current=null] : iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF ;
    public final EObject entryRuleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOperatorParameter = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1616:2: (iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1617:2: iv_ruleOutputOperatorParameter= ruleOutputOperatorParameter EOF
            {
             newCompositeNode(grammarAccess.getOutputOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter3660);
            iv_ruleOutputOperatorParameter=ruleOutputOperatorParameter();

            state._fsp--;

             current =iv_ruleOutputOperatorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperatorParameter3670); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1624:1: ruleOutputOperatorParameter returns [EObject current=null] : ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) ;
    public final EObject ruleOutputOperatorParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_element_0_0 = null;

        EObject lv_element_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1627:28: ( ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:1: ( ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )* )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:2: ( (lv_element_0_0= ruleStreamAccess ) ) (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1628:2: ( (lv_element_0_0= ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1629:1: (lv_element_0_0= ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1629:1: (lv_element_0_0= ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1630:3: lv_element_0_0= ruleStreamAccess
            {
             
            	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter3716);
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

            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1646:2: (otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1646:4: otherlv_1= ',' ( (lv_element_2_0= ruleStreamAccess ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleOutputOperatorParameter3729); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOutputOperatorParameterAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1650:1: ( (lv_element_2_0= ruleStreamAccess ) )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1651:1: (lv_element_2_0= ruleStreamAccess )
            	    {
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1651:1: (lv_element_2_0= ruleStreamAccess )
            	    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1652:3: lv_element_2_0= ruleStreamAccess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter3750);
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
            	    break loop12;
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


    // $ANTLR start "entryRuleBarrierOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1676:1: entryRuleBarrierOperator returns [EObject current=null] : iv_ruleBarrierOperator= ruleBarrierOperator EOF ;
    public final EObject entryRuleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrierOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1677:2: (iv_ruleBarrierOperator= ruleBarrierOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1678:2: iv_ruleBarrierOperator= ruleBarrierOperator EOF
            {
             newCompositeNode(grammarAccess.getBarrierOperatorRule()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator3788);
            iv_ruleBarrierOperator=ruleBarrierOperator();

            state._fsp--;

             current =iv_ruleBarrierOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrierOperator3798); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1685:1: ruleBarrierOperator returns [EObject current=null] : this_WindowOperator_0= ruleWindowOperator ;
    public final EObject ruleBarrierOperator() throws RecognitionException {
        EObject current = null;

        EObject this_WindowOperator_0 = null;


         enterRule(); 
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1688:28: (this_WindowOperator_0= ruleWindowOperator )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1690:5: this_WindowOperator_0= ruleWindowOperator
            {
             
                    newCompositeNode(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleWindowOperator_in_ruleBarrierOperator3844);
            this_WindowOperator_0=ruleWindowOperator();

            state._fsp--;

             
                    current = this_WindowOperator_0; 
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
    // $ANTLR end "ruleBarrierOperator"


    // $ANTLR start "entryRuleWindowOperator"
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1706:1: entryRuleWindowOperator returns [EObject current=null] : iv_ruleWindowOperator= ruleWindowOperator EOF ;
    public final EObject entryRuleWindowOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindowOperator = null;


        try {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1707:2: (iv_ruleWindowOperator= ruleWindowOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1708:2: iv_ruleWindowOperator= ruleWindowOperator EOF
            {
             newCompositeNode(grammarAccess.getWindowOperatorRule()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator3878);
            iv_ruleWindowOperator=ruleWindowOperator();

            state._fsp--;

             current =iv_ruleWindowOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindowOperator3888); 

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
    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1715:1: ruleWindowOperator returns [EObject current=null] : ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) ;
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
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1718:28: ( ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:1: ( ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? ) | ( (lv_setting_3_0= 'now' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==42) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:2: ( ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )? )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:3: ( (lv_setting_0_0= 'last' ) ) ( (lv_value_1_0= RULE_NUMBER ) ) ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1719:3: ( (lv_setting_0_0= 'last' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_setting_0_0= 'last' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1720:1: (lv_setting_0_0= 'last' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1721:3: lv_setting_0_0= 'last'
                    {
                    lv_setting_0_0=(Token)match(input,37,FOLLOW_37_in_ruleWindowOperator3932); 

                            newLeafNode(lv_setting_0_0, grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "setting", lv_setting_0_0, "last");
                    	    

                    }


                    }

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1734:2: ( (lv_value_1_0= RULE_NUMBER ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1735:1: (lv_value_1_0= RULE_NUMBER )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1735:1: (lv_value_1_0= RULE_NUMBER )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1736:3: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleWindowOperator3962); 

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

                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1752:2: ( ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=38 && LA14_0<=41)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1753:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1753:1: ( (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' ) )
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1754:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            {
                            // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1754:1: (lv_unit_2_1= 'min' | lv_unit_2_2= 'hrs' | lv_unit_2_3= 'sec' | lv_unit_2_4= 'elements' )
                            int alt13=4;
                            switch ( input.LA(1) ) {
                            case 38:
                                {
                                alt13=1;
                                }
                                break;
                            case 39:
                                {
                                alt13=2;
                                }
                                break;
                            case 40:
                                {
                                alt13=3;
                                }
                                break;
                            case 41:
                                {
                                alt13=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;
                            }

                            switch (alt13) {
                                case 1 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1755:3: lv_unit_2_1= 'min'
                                    {
                                    lv_unit_2_1=(Token)match(input,38,FOLLOW_38_in_ruleWindowOperator3987); 

                                            newLeafNode(lv_unit_2_1, grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_1, null);
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1767:8: lv_unit_2_2= 'hrs'
                                    {
                                    lv_unit_2_2=(Token)match(input,39,FOLLOW_39_in_ruleWindowOperator4016); 

                                            newLeafNode(lv_unit_2_2, grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_2, null);
                                    	    

                                    }
                                    break;
                                case 3 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1779:8: lv_unit_2_3= 'sec'
                                    {
                                    lv_unit_2_3=(Token)match(input,40,FOLLOW_40_in_ruleWindowOperator4045); 

                                            newLeafNode(lv_unit_2_3, grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWindowOperatorRule());
                                    	        }
                                           		setWithLastConsumed(current, "unit", lv_unit_2_3, null);
                                    	    

                                    }
                                    break;
                                case 4 :
                                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1791:8: lv_unit_2_4= 'elements'
                                    {
                                    lv_unit_2_4=(Token)match(input,41,FOLLOW_41_in_ruleWindowOperator4074); 

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
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1807:6: ( (lv_setting_3_0= 'now' ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1807:6: ( (lv_setting_3_0= 'now' ) )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1808:1: (lv_setting_3_0= 'now' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1808:1: (lv_setting_3_0= 'now' )
                    // ../de.hs_rm.cs.vs.dsm.flow/src-gen/de/hs_rm/cs/vs/dsm/parser/antlr/internal/InternalFlow.g:1809:3: lv_setting_3_0= 'now'
                    {
                    lv_setting_3_0=(Token)match(input,42,FOLLOW_42_in_ruleWindowOperator4116); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageDeclaration230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration247 = new BitSet(new long[]{0x00000010F10F5010L});
    public static final BitSet FOLLOW_ruleModelElement_in_rulePackageDeclaration268 = new BitSet(new long[]{0x00000010F10F5010L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration281 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleModelElement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModelElement413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestElement_in_ruleModelElement440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestAssign_in_ruleModelElement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_ruleModelElement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleModelElement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_ruleModelElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDeclaration593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStreamDeclaration630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDeclaration647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStreamDeclaration664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamElement_in_ruleStreamDeclaration685 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleStreamDeclaration698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStreamDeclaration710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_entryRuleStreamElement746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamElement756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamElement801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamElement818 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStreamElement835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport935 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestElement_in_entryRuleTestElement988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestElement998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTestElement1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestElement1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestAssign_in_entryRuleTestAssign1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestAssign1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTestAssign1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestAssign1160 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTestAssign1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestAssign1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_ruleOperator1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_ruleOperator1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_ruleOperator1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_ruleOperator1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_ruleOperator1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_ruleOperator1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDefinition1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamDefinition1644 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStreamDefinition1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamAccess1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess1752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStreamAccess1764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamAccess1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter1820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamOperatorParameter1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreamOperatorParameter1875 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStreamOperatorParameter1888 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_ruleStreamOperatorParameter1909 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStreamOperatorParameter1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_entryRuleCountOperator1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountOperator1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCountOperator2006 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCountOperator2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleCountOperator2039 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCountOperator2051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleCountOperator2072 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCountOperator2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator2120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardDeviationOperator2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStandardDeviationOperator2167 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStandardDeviationOperator2179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleStandardDeviationOperator2200 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStandardDeviationOperator2212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleStandardDeviationOperator2233 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStandardDeviationOperator2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageOperator2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAverageOperator2328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAverageOperator2340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleAverageOperator2361 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAverageOperator2373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleAverageOperator2394 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAverageOperator2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementJoinOperator2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleElementJoinOperator2489 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleElementJoinOperator2501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator2523 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator2549 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleElementJoinOperator2563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleElementJoinOperator2584 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleElementJoinOperator2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementJoinOperator2619 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleElementJoinOperator2633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleElementJoinOperator2654 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleElementJoinOperator2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_entryRuleTagOperator2702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagOperator2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTagOperator2749 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTagOperator2761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator2782 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTagOperator2795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagElement_in_ruleTagOperator2816 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTagOperator2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleTagOperator2851 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTagOperator2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_entryRuleTagElement2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagElement2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_ruleTagElement2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_ruleTagElement2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_ruleTagElement3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagClassElement3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagClassElement3101 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTagClassElement3113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTagClassElement3125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagClassElement3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement3181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagObjectPropertyElement3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagObjectPropertyElement3237 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTagObjectPropertyElement3249 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTagObjectPropertyElement3261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagObjectPropertyElement3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleTagDataTypePropertyElement3373 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTagDataTypePropertyElement3385 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTagDataTypePropertyElement3397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTagDataTypePropertyElement3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperator3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOutputOperator3500 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOutputOperator3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_ruleOutputOperator3533 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOutputOperator3545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOutputOperator3562 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOutputOperator3579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_ruleOutputOperator3600 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOutputOperator3612 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOutputOperator3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter3660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperatorParameter3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter3716 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleOutputOperatorParameter3729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_ruleOutputOperatorParameter3750 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrierOperator3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_ruleBarrierOperator3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator3878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindowOperator3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleWindowOperator3932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleWindowOperator3962 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_38_in_ruleWindowOperator3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleWindowOperator4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleWindowOperator4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleWindowOperator4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleWindowOperator4116 = new BitSet(new long[]{0x0000000000000002L});

}