package de.hs_rm.cs.vs.dsm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.hs_rm.cs.vs.dsm.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'hrs'", "'sec'", "'elements'", "'package'", "'{'", "'}'", "';'", "'stream'", "'import'", "'var'", "'let'", "'='", "'.'", "'['", "']'", "'count'", "'('", "','", "')'", "'std'", "'avg'", "'ejoin'", "'tag'", "'is'", "'class'", "'objectproperty'", "'datatype'", "'out'", "'last'", "'now'"
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
    public String getGrammarFileName() { return "../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g"; }


     
     	private FlowGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:62:1: ( ruleModel EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:70:1: ruleModel : ( ( ( rule__Model__ModelAssignment ) ) ( ( rule__Model__ModelAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:74:2: ( ( ( ( rule__Model__ModelAssignment ) ) ( ( rule__Model__ModelAssignment )* ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:75:1: ( ( ( rule__Model__ModelAssignment ) ) ( ( rule__Model__ModelAssignment )* ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:75:1: ( ( ( rule__Model__ModelAssignment ) ) ( ( rule__Model__ModelAssignment )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:76:1: ( ( rule__Model__ModelAssignment ) ) ( ( rule__Model__ModelAssignment )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:76:1: ( ( rule__Model__ModelAssignment ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:77:1: ( rule__Model__ModelAssignment )
            {
             before(grammarAccess.getModelAccess().getModelAssignment()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:78:1: ( rule__Model__ModelAssignment )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:78:2: rule__Model__ModelAssignment
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_in_ruleModel96);
            rule__Model__ModelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getModelAssignment()); 

            }

            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:81:1: ( ( rule__Model__ModelAssignment )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:82:1: ( rule__Model__ModelAssignment )*
            {
             before(grammarAccess.getModelAccess().getModelAssignment()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:83:1: ( rule__Model__ModelAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:83:2: rule__Model__ModelAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ModelAssignment_in_ruleModel108);
            	    rule__Model__ModelAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getModelAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:96:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:97:1: ( rulePackageDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:98:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration138);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:105:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:109:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:110:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:110:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:111:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:112:1: ( rule__PackageDeclaration__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:112:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration171);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleModelElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:124:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:125:1: ( ruleModelElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:126:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement198);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:133:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:137:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:138:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:138:1: ( ( rule__ModelElement__Alternatives ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:139:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:140:1: ( rule__ModelElement__Alternatives )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:140:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement231);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleStreamDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:152:1: entryRuleStreamDeclaration : ruleStreamDeclaration EOF ;
    public final void entryRuleStreamDeclaration() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:153:1: ( ruleStreamDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:154:1: ruleStreamDeclaration EOF
            {
             before(grammarAccess.getStreamDeclarationRule()); 
            pushFollow(FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration258);
            ruleStreamDeclaration();

            state._fsp--;

             after(grammarAccess.getStreamDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDeclaration265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamDeclaration"


    // $ANTLR start "ruleStreamDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:161:1: ruleStreamDeclaration : ( ( rule__StreamDeclaration__Group__0 ) ) ;
    public final void ruleStreamDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:165:2: ( ( ( rule__StreamDeclaration__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:166:1: ( ( rule__StreamDeclaration__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:166:1: ( ( rule__StreamDeclaration__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:167:1: ( rule__StreamDeclaration__Group__0 )
            {
             before(grammarAccess.getStreamDeclarationAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:168:1: ( rule__StreamDeclaration__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:168:2: rule__StreamDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__0_in_ruleStreamDeclaration291);
            rule__StreamDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamDeclaration"


    // $ANTLR start "entryRuleStreamElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:180:1: entryRuleStreamElement : ruleStreamElement EOF ;
    public final void entryRuleStreamElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:181:1: ( ruleStreamElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:182:1: ruleStreamElement EOF
            {
             before(grammarAccess.getStreamElementRule()); 
            pushFollow(FOLLOW_ruleStreamElement_in_entryRuleStreamElement318);
            ruleStreamElement();

            state._fsp--;

             after(grammarAccess.getStreamElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamElement325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamElement"


    // $ANTLR start "ruleStreamElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:189:1: ruleStreamElement : ( ( rule__StreamElement__Group__0 ) ) ;
    public final void ruleStreamElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:193:2: ( ( ( rule__StreamElement__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:194:1: ( ( rule__StreamElement__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:194:1: ( ( rule__StreamElement__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:195:1: ( rule__StreamElement__Group__0 )
            {
             before(grammarAccess.getStreamElementAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:196:1: ( rule__StreamElement__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:196:2: rule__StreamElement__Group__0
            {
            pushFollow(FOLLOW_rule__StreamElement__Group__0_in_ruleStreamElement351);
            rule__StreamElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamElement"


    // $ANTLR start "entryRuleImport"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:208:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:209:1: ( ruleImport EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:210:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport378);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport385); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:217:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:221:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:222:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:222:1: ( ( rule__Import__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:223:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:224:1: ( rule__Import__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:224:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport411);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTestElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:236:1: entryRuleTestElement : ruleTestElement EOF ;
    public final void entryRuleTestElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:237:1: ( ruleTestElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:238:1: ruleTestElement EOF
            {
             before(grammarAccess.getTestElementRule()); 
            pushFollow(FOLLOW_ruleTestElement_in_entryRuleTestElement438);
            ruleTestElement();

            state._fsp--;

             after(grammarAccess.getTestElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestElement445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestElement"


    // $ANTLR start "ruleTestElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:245:1: ruleTestElement : ( ( rule__TestElement__Group__0 ) ) ;
    public final void ruleTestElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:249:2: ( ( ( rule__TestElement__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:250:1: ( ( rule__TestElement__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:250:1: ( ( rule__TestElement__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:251:1: ( rule__TestElement__Group__0 )
            {
             before(grammarAccess.getTestElementAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:252:1: ( rule__TestElement__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:252:2: rule__TestElement__Group__0
            {
            pushFollow(FOLLOW_rule__TestElement__Group__0_in_ruleTestElement471);
            rule__TestElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestElement"


    // $ANTLR start "entryRuleTestAssign"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:264:1: entryRuleTestAssign : ruleTestAssign EOF ;
    public final void entryRuleTestAssign() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:265:1: ( ruleTestAssign EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:266:1: ruleTestAssign EOF
            {
             before(grammarAccess.getTestAssignRule()); 
            pushFollow(FOLLOW_ruleTestAssign_in_entryRuleTestAssign498);
            ruleTestAssign();

            state._fsp--;

             after(grammarAccess.getTestAssignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestAssign505); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestAssign"


    // $ANTLR start "ruleTestAssign"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:273:1: ruleTestAssign : ( ( rule__TestAssign__Group__0 ) ) ;
    public final void ruleTestAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:277:2: ( ( ( rule__TestAssign__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:278:1: ( ( rule__TestAssign__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:278:1: ( ( rule__TestAssign__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:279:1: ( rule__TestAssign__Group__0 )
            {
             before(grammarAccess.getTestAssignAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:280:1: ( rule__TestAssign__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:280:2: rule__TestAssign__Group__0
            {
            pushFollow(FOLLOW_rule__TestAssign__Group__0_in_ruleTestAssign531);
            rule__TestAssign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAssignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestAssign"


    // $ANTLR start "entryRuleOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:294:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:295:1: ( ruleOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:296:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator560);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:303:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:307:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:308:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:308:1: ( ( rule__Operator__Alternatives ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:309:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:310:1: ( rule__Operator__Alternatives )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:310:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator593);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:324:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:325:1: ( ruleVariableDeclaration EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration622);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration629); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:333:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:337:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:338:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:338:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:339:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:340:1: ( rule__VariableDeclaration__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:340:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration655);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleStreamDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:352:1: entryRuleStreamDefinition : ruleStreamDefinition EOF ;
    public final void entryRuleStreamDefinition() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:353:1: ( ruleStreamDefinition EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ruleStreamDefinition EOF
            {
             before(grammarAccess.getStreamDefinitionRule()); 
            pushFollow(FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition682);
            ruleStreamDefinition();

            state._fsp--;

             after(grammarAccess.getStreamDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamDefinition689); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamDefinition"


    // $ANTLR start "ruleStreamDefinition"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:361:1: ruleStreamDefinition : ( ( rule__StreamDefinition__Group__0 ) ) ;
    public final void ruleStreamDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:365:2: ( ( ( rule__StreamDefinition__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:366:1: ( ( rule__StreamDefinition__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:366:1: ( ( rule__StreamDefinition__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:367:1: ( rule__StreamDefinition__Group__0 )
            {
             before(grammarAccess.getStreamDefinitionAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:368:1: ( rule__StreamDefinition__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:368:2: rule__StreamDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StreamDefinition__Group__0_in_ruleStreamDefinition715);
            rule__StreamDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamDefinition"


    // $ANTLR start "entryRuleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:380:1: entryRuleStreamAccess : ruleStreamAccess EOF ;
    public final void entryRuleStreamAccess() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:381:1: ( ruleStreamAccess EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ruleStreamAccess EOF
            {
             before(grammarAccess.getStreamAccessRule()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess742);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getStreamAccessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamAccess749); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamAccess"


    // $ANTLR start "ruleStreamAccess"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:389:1: ruleStreamAccess : ( ( rule__StreamAccess__Group__0 ) ) ;
    public final void ruleStreamAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:393:2: ( ( ( rule__StreamAccess__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:394:1: ( ( rule__StreamAccess__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:394:1: ( ( rule__StreamAccess__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:395:1: ( rule__StreamAccess__Group__0 )
            {
             before(grammarAccess.getStreamAccessAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:396:1: ( rule__StreamAccess__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:396:2: rule__StreamAccess__Group__0
            {
            pushFollow(FOLLOW_rule__StreamAccess__Group__0_in_ruleStreamAccess775);
            rule__StreamAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamAccess"


    // $ANTLR start "entryRuleStreamOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:408:1: entryRuleStreamOperatorParameter : ruleStreamOperatorParameter EOF ;
    public final void entryRuleStreamOperatorParameter() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:409:1: ( ruleStreamOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ruleStreamOperatorParameter EOF
            {
             before(grammarAccess.getStreamOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter802);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getStreamOperatorParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamOperatorParameter809); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamOperatorParameter"


    // $ANTLR start "ruleStreamOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:417:1: ruleStreamOperatorParameter : ( ( rule__StreamOperatorParameter__Group__0 ) ) ;
    public final void ruleStreamOperatorParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:421:2: ( ( ( rule__StreamOperatorParameter__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:422:1: ( ( rule__StreamOperatorParameter__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:422:1: ( ( rule__StreamOperatorParameter__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:423:1: ( rule__StreamOperatorParameter__Group__0 )
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:424:1: ( rule__StreamOperatorParameter__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:424:2: rule__StreamOperatorParameter__Group__0
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group__0_in_ruleStreamOperatorParameter835);
            rule__StreamOperatorParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamOperatorParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamOperatorParameter"


    // $ANTLR start "entryRuleCountOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:436:1: entryRuleCountOperator : ruleCountOperator EOF ;
    public final void entryRuleCountOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:437:1: ( ruleCountOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ruleCountOperator EOF
            {
             before(grammarAccess.getCountOperatorRule()); 
            pushFollow(FOLLOW_ruleCountOperator_in_entryRuleCountOperator862);
            ruleCountOperator();

            state._fsp--;

             after(grammarAccess.getCountOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountOperator869); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountOperator"


    // $ANTLR start "ruleCountOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:445:1: ruleCountOperator : ( ( rule__CountOperator__Group__0 ) ) ;
    public final void ruleCountOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:449:2: ( ( ( rule__CountOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:450:1: ( ( rule__CountOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:450:1: ( ( rule__CountOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:451:1: ( rule__CountOperator__Group__0 )
            {
             before(grammarAccess.getCountOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:452:1: ( rule__CountOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:452:2: rule__CountOperator__Group__0
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__0_in_ruleCountOperator895);
            rule__CountOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountOperator"


    // $ANTLR start "entryRuleStandardDeviationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:464:1: entryRuleStandardDeviationOperator : ruleStandardDeviationOperator EOF ;
    public final void entryRuleStandardDeviationOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:465:1: ( ruleStandardDeviationOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ruleStandardDeviationOperator EOF
            {
             before(grammarAccess.getStandardDeviationOperatorRule()); 
            pushFollow(FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator922);
            ruleStandardDeviationOperator();

            state._fsp--;

             after(grammarAccess.getStandardDeviationOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStandardDeviationOperator929); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStandardDeviationOperator"


    // $ANTLR start "ruleStandardDeviationOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:473:1: ruleStandardDeviationOperator : ( ( rule__StandardDeviationOperator__Group__0 ) ) ;
    public final void ruleStandardDeviationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:477:2: ( ( ( rule__StandardDeviationOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:478:1: ( ( rule__StandardDeviationOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:478:1: ( ( rule__StandardDeviationOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:479:1: ( rule__StandardDeviationOperator__Group__0 )
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:480:1: ( rule__StandardDeviationOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:480:2: rule__StandardDeviationOperator__Group__0
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__0_in_ruleStandardDeviationOperator955);
            rule__StandardDeviationOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardDeviationOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandardDeviationOperator"


    // $ANTLR start "entryRuleAverageOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:492:1: entryRuleAverageOperator : ruleAverageOperator EOF ;
    public final void entryRuleAverageOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:493:1: ( ruleAverageOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ruleAverageOperator EOF
            {
             before(grammarAccess.getAverageOperatorRule()); 
            pushFollow(FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator982);
            ruleAverageOperator();

            state._fsp--;

             after(grammarAccess.getAverageOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageOperator989); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAverageOperator"


    // $ANTLR start "ruleAverageOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:501:1: ruleAverageOperator : ( ( rule__AverageOperator__Group__0 ) ) ;
    public final void ruleAverageOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:505:2: ( ( ( rule__AverageOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:506:1: ( ( rule__AverageOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:506:1: ( ( rule__AverageOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:507:1: ( rule__AverageOperator__Group__0 )
            {
             before(grammarAccess.getAverageOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:508:1: ( rule__AverageOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:508:2: rule__AverageOperator__Group__0
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__0_in_ruleAverageOperator1015);
            rule__AverageOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAverageOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAverageOperator"


    // $ANTLR start "entryRuleElementJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:520:1: entryRuleElementJoinOperator : ruleElementJoinOperator EOF ;
    public final void entryRuleElementJoinOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:521:1: ( ruleElementJoinOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ruleElementJoinOperator EOF
            {
             before(grammarAccess.getElementJoinOperatorRule()); 
            pushFollow(FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1042);
            ruleElementJoinOperator();

            state._fsp--;

             after(grammarAccess.getElementJoinOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementJoinOperator1049); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementJoinOperator"


    // $ANTLR start "ruleElementJoinOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:529:1: ruleElementJoinOperator : ( ( rule__ElementJoinOperator__Group__0 ) ) ;
    public final void ruleElementJoinOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:533:2: ( ( ( rule__ElementJoinOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:534:1: ( ( rule__ElementJoinOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:534:1: ( ( rule__ElementJoinOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:535:1: ( rule__ElementJoinOperator__Group__0 )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:536:1: ( rule__ElementJoinOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:536:2: rule__ElementJoinOperator__Group__0
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__0_in_ruleElementJoinOperator1075);
            rule__ElementJoinOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementJoinOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementJoinOperator"


    // $ANTLR start "entryRuleTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:548:1: entryRuleTagOperator : ruleTagOperator EOF ;
    public final void entryRuleTagOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:549:1: ( ruleTagOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ruleTagOperator EOF
            {
             before(grammarAccess.getTagOperatorRule()); 
            pushFollow(FOLLOW_ruleTagOperator_in_entryRuleTagOperator1102);
            ruleTagOperator();

            state._fsp--;

             after(grammarAccess.getTagOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagOperator1109); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagOperator"


    // $ANTLR start "ruleTagOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:557:1: ruleTagOperator : ( ( rule__TagOperator__Group__0 ) ) ;
    public final void ruleTagOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:561:2: ( ( ( rule__TagOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:562:1: ( ( rule__TagOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:562:1: ( ( rule__TagOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:563:1: ( rule__TagOperator__Group__0 )
            {
             before(grammarAccess.getTagOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:564:1: ( rule__TagOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:564:2: rule__TagOperator__Group__0
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__0_in_ruleTagOperator1135);
            rule__TagOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagOperator"


    // $ANTLR start "entryRuleTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:576:1: entryRuleTagElement : ruleTagElement EOF ;
    public final void entryRuleTagElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:577:1: ( ruleTagElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:578:1: ruleTagElement EOF
            {
             before(grammarAccess.getTagElementRule()); 
            pushFollow(FOLLOW_ruleTagElement_in_entryRuleTagElement1162);
            ruleTagElement();

            state._fsp--;

             after(grammarAccess.getTagElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagElement1169); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagElement"


    // $ANTLR start "ruleTagElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:585:1: ruleTagElement : ( ( rule__TagElement__Alternatives ) ) ;
    public final void ruleTagElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:589:2: ( ( ( rule__TagElement__Alternatives ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:590:1: ( ( rule__TagElement__Alternatives ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:590:1: ( ( rule__TagElement__Alternatives ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:591:1: ( rule__TagElement__Alternatives )
            {
             before(grammarAccess.getTagElementAccess().getAlternatives()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:592:1: ( rule__TagElement__Alternatives )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:592:2: rule__TagElement__Alternatives
            {
            pushFollow(FOLLOW_rule__TagElement__Alternatives_in_ruleTagElement1195);
            rule__TagElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTagElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagElement"


    // $ANTLR start "entryRuleTagClassElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:604:1: entryRuleTagClassElement : ruleTagClassElement EOF ;
    public final void entryRuleTagClassElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:605:1: ( ruleTagClassElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:606:1: ruleTagClassElement EOF
            {
             before(grammarAccess.getTagClassElementRule()); 
            pushFollow(FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement1222);
            ruleTagClassElement();

            state._fsp--;

             after(grammarAccess.getTagClassElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagClassElement1229); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagClassElement"


    // $ANTLR start "ruleTagClassElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:613:1: ruleTagClassElement : ( ( rule__TagClassElement__Group__0 ) ) ;
    public final void ruleTagClassElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:617:2: ( ( ( rule__TagClassElement__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:618:1: ( ( rule__TagClassElement__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:618:1: ( ( rule__TagClassElement__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:619:1: ( rule__TagClassElement__Group__0 )
            {
             before(grammarAccess.getTagClassElementAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:620:1: ( rule__TagClassElement__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:620:2: rule__TagClassElement__Group__0
            {
            pushFollow(FOLLOW_rule__TagClassElement__Group__0_in_ruleTagClassElement1255);
            rule__TagClassElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagClassElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagClassElement"


    // $ANTLR start "entryRuleTagObjectPropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:632:1: entryRuleTagObjectPropertyElement : ruleTagObjectPropertyElement EOF ;
    public final void entryRuleTagObjectPropertyElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:633:1: ( ruleTagObjectPropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:634:1: ruleTagObjectPropertyElement EOF
            {
             before(grammarAccess.getTagObjectPropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement1282);
            ruleTagObjectPropertyElement();

            state._fsp--;

             after(grammarAccess.getTagObjectPropertyElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagObjectPropertyElement1289); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagObjectPropertyElement"


    // $ANTLR start "ruleTagObjectPropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:641:1: ruleTagObjectPropertyElement : ( ( rule__TagObjectPropertyElement__Group__0 ) ) ;
    public final void ruleTagObjectPropertyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:645:2: ( ( ( rule__TagObjectPropertyElement__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:646:1: ( ( rule__TagObjectPropertyElement__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:646:1: ( ( rule__TagObjectPropertyElement__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:647:1: ( rule__TagObjectPropertyElement__Group__0 )
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:648:1: ( rule__TagObjectPropertyElement__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:648:2: rule__TagObjectPropertyElement__Group__0
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__0_in_ruleTagObjectPropertyElement1315);
            rule__TagObjectPropertyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagObjectPropertyElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagObjectPropertyElement"


    // $ANTLR start "entryRuleTagDataTypePropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:660:1: entryRuleTagDataTypePropertyElement : ruleTagDataTypePropertyElement EOF ;
    public final void entryRuleTagDataTypePropertyElement() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:661:1: ( ruleTagDataTypePropertyElement EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:662:1: ruleTagDataTypePropertyElement EOF
            {
             before(grammarAccess.getTagDataTypePropertyElementRule()); 
            pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement1342);
            ruleTagDataTypePropertyElement();

            state._fsp--;

             after(grammarAccess.getTagDataTypePropertyElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement1349); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTagDataTypePropertyElement"


    // $ANTLR start "ruleTagDataTypePropertyElement"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:669:1: ruleTagDataTypePropertyElement : ( ( rule__TagDataTypePropertyElement__Group__0 ) ) ;
    public final void ruleTagDataTypePropertyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:673:2: ( ( ( rule__TagDataTypePropertyElement__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:674:1: ( ( rule__TagDataTypePropertyElement__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:674:1: ( ( rule__TagDataTypePropertyElement__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:675:1: ( rule__TagDataTypePropertyElement__Group__0 )
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:676:1: ( rule__TagDataTypePropertyElement__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:676:2: rule__TagDataTypePropertyElement__Group__0
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__0_in_ruleTagDataTypePropertyElement1375);
            rule__TagDataTypePropertyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagDataTypePropertyElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagDataTypePropertyElement"


    // $ANTLR start "entryRuleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:688:1: entryRuleOutputOperator : ruleOutputOperator EOF ;
    public final void entryRuleOutputOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:689:1: ( ruleOutputOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:690:1: ruleOutputOperator EOF
            {
             before(grammarAccess.getOutputOperatorRule()); 
            pushFollow(FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator1402);
            ruleOutputOperator();

            state._fsp--;

             after(grammarAccess.getOutputOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperator1409); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputOperator"


    // $ANTLR start "ruleOutputOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:697:1: ruleOutputOperator : ( ( rule__OutputOperator__Group__0 ) ) ;
    public final void ruleOutputOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:701:2: ( ( ( rule__OutputOperator__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:702:1: ( ( rule__OutputOperator__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:702:1: ( ( rule__OutputOperator__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:703:1: ( rule__OutputOperator__Group__0 )
            {
             before(grammarAccess.getOutputOperatorAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:704:1: ( rule__OutputOperator__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:704:2: rule__OutputOperator__Group__0
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__0_in_ruleOutputOperator1435);
            rule__OutputOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputOperator"


    // $ANTLR start "entryRuleOutputOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:716:1: entryRuleOutputOperatorParameter : ruleOutputOperatorParameter EOF ;
    public final void entryRuleOutputOperatorParameter() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:717:1: ( ruleOutputOperatorParameter EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:718:1: ruleOutputOperatorParameter EOF
            {
             before(grammarAccess.getOutputOperatorParameterRule()); 
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter1462);
            ruleOutputOperatorParameter();

            state._fsp--;

             after(grammarAccess.getOutputOperatorParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOperatorParameter1469); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputOperatorParameter"


    // $ANTLR start "ruleOutputOperatorParameter"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:725:1: ruleOutputOperatorParameter : ( ( rule__OutputOperatorParameter__Group__0 ) ) ;
    public final void ruleOutputOperatorParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:729:2: ( ( ( rule__OutputOperatorParameter__Group__0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:730:1: ( ( rule__OutputOperatorParameter__Group__0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:730:1: ( ( rule__OutputOperatorParameter__Group__0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:731:1: ( rule__OutputOperatorParameter__Group__0 )
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getGroup()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:732:1: ( rule__OutputOperatorParameter__Group__0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:732:2: rule__OutputOperatorParameter__Group__0
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group__0_in_ruleOutputOperatorParameter1495);
            rule__OutputOperatorParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputOperatorParameter"


    // $ANTLR start "entryRuleBarrierOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:744:1: entryRuleBarrierOperator : ruleBarrierOperator EOF ;
    public final void entryRuleBarrierOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:745:1: ( ruleBarrierOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:746:1: ruleBarrierOperator EOF
            {
             before(grammarAccess.getBarrierOperatorRule()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator1522);
            ruleBarrierOperator();

            state._fsp--;

             after(grammarAccess.getBarrierOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrierOperator1529); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarrierOperator"


    // $ANTLR start "ruleBarrierOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:753:1: ruleBarrierOperator : ( ruleWindowOperator ) ;
    public final void ruleBarrierOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:757:2: ( ( ruleWindowOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:758:1: ( ruleWindowOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:758:1: ( ruleWindowOperator )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:759:1: ruleWindowOperator
            {
             before(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_ruleBarrierOperator1555);
            ruleWindowOperator();

            state._fsp--;

             after(grammarAccess.getBarrierOperatorAccess().getWindowOperatorParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarrierOperator"


    // $ANTLR start "entryRuleWindowOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:772:1: entryRuleWindowOperator : ruleWindowOperator EOF ;
    public final void entryRuleWindowOperator() throws RecognitionException {
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:773:1: ( ruleWindowOperator EOF )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:774:1: ruleWindowOperator EOF
            {
             before(grammarAccess.getWindowOperatorRule()); 
            pushFollow(FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator1581);
            ruleWindowOperator();

            state._fsp--;

             after(grammarAccess.getWindowOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindowOperator1588); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindowOperator"


    // $ANTLR start "ruleWindowOperator"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:781:1: ruleWindowOperator : ( ( rule__WindowOperator__Alternatives ) ) ;
    public final void ruleWindowOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:785:2: ( ( ( rule__WindowOperator__Alternatives ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:786:1: ( ( rule__WindowOperator__Alternatives ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:786:1: ( ( rule__WindowOperator__Alternatives ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:787:1: ( rule__WindowOperator__Alternatives )
            {
             before(grammarAccess.getWindowOperatorAccess().getAlternatives()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:788:1: ( rule__WindowOperator__Alternatives )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:788:2: rule__WindowOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__WindowOperator__Alternatives_in_ruleWindowOperator1614);
            rule__WindowOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWindowOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindowOperator"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:800:1: rule__ModelElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleImport ) | ( ruleTestElement ) | ( ruleTestAssign ) | ( ruleStreamDeclaration ) | ( ruleOperator ) | ( ruleStreamDefinition ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:804:1: ( ( rulePackageDeclaration ) | ( ruleImport ) | ( ruleTestElement ) | ( ruleTestAssign ) | ( ruleStreamDeclaration ) | ( ruleOperator ) | ( ruleStreamDefinition ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 28:
            case 32:
            case 33:
            case 34:
            case 35:
            case 40:
                {
                alt2=6;
                }
                break;
            case RULE_ID:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:805:1: ( rulePackageDeclaration )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:805:1: ( rulePackageDeclaration )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:806:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getModelElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__ModelElement__Alternatives1650);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:811:6: ( ruleImport )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:811:6: ( ruleImport )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:812:1: ruleImport
                    {
                     before(grammarAccess.getModelElementAccess().getImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__ModelElement__Alternatives1667);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getImportParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:817:6: ( ruleTestElement )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:817:6: ( ruleTestElement )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:818:1: ruleTestElement
                    {
                     before(grammarAccess.getModelElementAccess().getTestElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTestElement_in_rule__ModelElement__Alternatives1684);
                    ruleTestElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getTestElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:823:6: ( ruleTestAssign )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:823:6: ( ruleTestAssign )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:824:1: ruleTestAssign
                    {
                     before(grammarAccess.getModelElementAccess().getTestAssignParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTestAssign_in_rule__ModelElement__Alternatives1701);
                    ruleTestAssign();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getTestAssignParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:829:6: ( ruleStreamDeclaration )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:829:6: ( ruleStreamDeclaration )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:830:1: ruleStreamDeclaration
                    {
                     before(grammarAccess.getModelElementAccess().getStreamDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStreamDeclaration_in_rule__ModelElement__Alternatives1718);
                    ruleStreamDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getStreamDeclarationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:835:6: ( ruleOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:835:6: ( ruleOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:836:1: ruleOperator
                    {
                     before(grammarAccess.getModelElementAccess().getOperatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleOperator_in_rule__ModelElement__Alternatives1735);
                    ruleOperator();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getOperatorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:841:6: ( ruleStreamDefinition )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:841:6: ( ruleStreamDefinition )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:842:1: ruleStreamDefinition
                    {
                     before(grammarAccess.getModelElementAccess().getStreamDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleStreamDefinition_in_rule__ModelElement__Alternatives1752);
                    ruleStreamDefinition();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getStreamDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:852:1: rule__Operator__Alternatives : ( ( ruleElementJoinOperator ) | ( ruleTagOperator ) | ( ruleCountOperator ) | ( ruleStandardDeviationOperator ) | ( ruleAverageOperator ) | ( ruleOutputOperator ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:856:1: ( ( ruleElementJoinOperator ) | ( ruleTagOperator ) | ( ruleCountOperator ) | ( ruleStandardDeviationOperator ) | ( ruleAverageOperator ) | ( ruleOutputOperator ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 40:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:857:1: ( ruleElementJoinOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:857:1: ( ruleElementJoinOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:858:1: ruleElementJoinOperator
                    {
                     before(grammarAccess.getOperatorAccess().getElementJoinOperatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleElementJoinOperator_in_rule__Operator__Alternatives1784);
                    ruleElementJoinOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getElementJoinOperatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:863:6: ( ruleTagOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:863:6: ( ruleTagOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:864:1: ruleTagOperator
                    {
                     before(grammarAccess.getOperatorAccess().getTagOperatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTagOperator_in_rule__Operator__Alternatives1801);
                    ruleTagOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getTagOperatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:869:6: ( ruleCountOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:869:6: ( ruleCountOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:870:1: ruleCountOperator
                    {
                     before(grammarAccess.getOperatorAccess().getCountOperatorParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCountOperator_in_rule__Operator__Alternatives1818);
                    ruleCountOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getCountOperatorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:875:6: ( ruleStandardDeviationOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:875:6: ( ruleStandardDeviationOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:876:1: ruleStandardDeviationOperator
                    {
                     before(grammarAccess.getOperatorAccess().getStandardDeviationOperatorParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStandardDeviationOperator_in_rule__Operator__Alternatives1835);
                    ruleStandardDeviationOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getStandardDeviationOperatorParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:881:6: ( ruleAverageOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:881:6: ( ruleAverageOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:882:1: ruleAverageOperator
                    {
                     before(grammarAccess.getOperatorAccess().getAverageOperatorParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAverageOperator_in_rule__Operator__Alternatives1852);
                    ruleAverageOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getAverageOperatorParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:887:6: ( ruleOutputOperator )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:887:6: ( ruleOutputOperator )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:888:1: ruleOutputOperator
                    {
                     before(grammarAccess.getOperatorAccess().getOutputOperatorParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleOutputOperator_in_rule__Operator__Alternatives1869);
                    ruleOutputOperator();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getOutputOperatorParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__ElementJoinOperator__Alternatives_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:898:1: rule__ElementJoinOperator__Alternatives_2 : ( ( ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 ) ) | ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 ) ) );
    public final void rule__ElementJoinOperator__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:902:1: ( ( ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 ) ) | ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==30) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:903:1: ( ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:903:1: ( ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 ) )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:904:1: ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 )
                    {
                     before(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_2_0()); 
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:905:1: ( rule__ElementJoinOperator__ElementParametersAssignment_2_0 )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:905:2: rule__ElementJoinOperator__ElementParametersAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ElementJoinOperator__ElementParametersAssignment_2_0_in_rule__ElementJoinOperator__Alternatives_21901);
                    rule__ElementJoinOperator__ElementParametersAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:909:6: ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:909:6: ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 ) )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:910:1: ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 )
                    {
                     before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_2_1()); 
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:911:1: ( rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:911:2: rule__ElementJoinOperator__VariableElementParametersAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ElementJoinOperator__VariableElementParametersAssignment_2_1_in_rule__ElementJoinOperator__Alternatives_21919);
                    rule__ElementJoinOperator__VariableElementParametersAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Alternatives_2"


    // $ANTLR start "rule__TagElement__Alternatives"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:920:1: rule__TagElement__Alternatives : ( ( ruleTagClassElement ) | ( ruleTagObjectPropertyElement ) | ( ruleTagDataTypePropertyElement ) );
    public final void rule__TagElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:924:1: ( ( ruleTagClassElement ) | ( ruleTagObjectPropertyElement ) | ( ruleTagDataTypePropertyElement ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==25) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==36) ) {
                            switch ( input.LA(5) ) {
                            case 39:
                                {
                                alt5=3;
                                }
                                break;
                            case 37:
                                {
                                alt5=1;
                                }
                                break;
                            case 38:
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:925:1: ( ruleTagClassElement )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:925:1: ( ruleTagClassElement )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:926:1: ruleTagClassElement
                    {
                     before(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTagClassElement_in_rule__TagElement__Alternatives1952);
                    ruleTagClassElement();

                    state._fsp--;

                     after(grammarAccess.getTagElementAccess().getTagClassElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:931:6: ( ruleTagObjectPropertyElement )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:931:6: ( ruleTagObjectPropertyElement )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:932:1: ruleTagObjectPropertyElement
                    {
                     before(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTagObjectPropertyElement_in_rule__TagElement__Alternatives1969);
                    ruleTagObjectPropertyElement();

                    state._fsp--;

                     after(grammarAccess.getTagElementAccess().getTagObjectPropertyElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:937:6: ( ruleTagDataTypePropertyElement )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:937:6: ( ruleTagDataTypePropertyElement )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:938:1: ruleTagDataTypePropertyElement
                    {
                     before(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTagDataTypePropertyElement_in_rule__TagElement__Alternatives1986);
                    ruleTagDataTypePropertyElement();

                    state._fsp--;

                     after(grammarAccess.getTagElementAccess().getTagDataTypePropertyElementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagElement__Alternatives"


    // $ANTLR start "rule__WindowOperator__Alternatives"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:948:1: rule__WindowOperator__Alternatives : ( ( ( rule__WindowOperator__Group_0__0 ) ) | ( ( rule__WindowOperator__SettingAssignment_1 ) ) );
    public final void rule__WindowOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:952:1: ( ( ( rule__WindowOperator__Group_0__0 ) ) | ( ( rule__WindowOperator__SettingAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:953:1: ( ( rule__WindowOperator__Group_0__0 ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:953:1: ( ( rule__WindowOperator__Group_0__0 ) )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:954:1: ( rule__WindowOperator__Group_0__0 )
                    {
                     before(grammarAccess.getWindowOperatorAccess().getGroup_0()); 
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:955:1: ( rule__WindowOperator__Group_0__0 )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:955:2: rule__WindowOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__WindowOperator__Group_0__0_in_rule__WindowOperator__Alternatives2018);
                    rule__WindowOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWindowOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:959:6: ( ( rule__WindowOperator__SettingAssignment_1 ) )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:959:6: ( ( rule__WindowOperator__SettingAssignment_1 ) )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:960:1: ( rule__WindowOperator__SettingAssignment_1 )
                    {
                     before(grammarAccess.getWindowOperatorAccess().getSettingAssignment_1()); 
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:961:1: ( rule__WindowOperator__SettingAssignment_1 )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:961:2: rule__WindowOperator__SettingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__WindowOperator__SettingAssignment_1_in_rule__WindowOperator__Alternatives2036);
                    rule__WindowOperator__SettingAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWindowOperatorAccess().getSettingAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Alternatives"


    // $ANTLR start "rule__WindowOperator__UnitAlternatives_0_2_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:970:1: rule__WindowOperator__UnitAlternatives_0_2_0 : ( ( 'min' ) | ( 'hrs' ) | ( 'sec' ) | ( 'elements' ) );
    public final void rule__WindowOperator__UnitAlternatives_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:974:1: ( ( 'min' ) | ( 'hrs' ) | ( 'sec' ) | ( 'elements' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:975:1: ( 'min' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:975:1: ( 'min' )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:976:1: 'min'
                    {
                     before(grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__WindowOperator__UnitAlternatives_0_2_02070); 
                     after(grammarAccess.getWindowOperatorAccess().getUnitMinKeyword_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:983:6: ( 'hrs' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:983:6: ( 'hrs' )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:984:1: 'hrs'
                    {
                     before(grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__WindowOperator__UnitAlternatives_0_2_02090); 
                     after(grammarAccess.getWindowOperatorAccess().getUnitHrsKeyword_0_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:991:6: ( 'sec' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:991:6: ( 'sec' )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:992:1: 'sec'
                    {
                     before(grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__WindowOperator__UnitAlternatives_0_2_02110); 
                     after(grammarAccess.getWindowOperatorAccess().getUnitSecKeyword_0_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:999:6: ( 'elements' )
                    {
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:999:6: ( 'elements' )
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1000:1: 'elements'
                    {
                     before(grammarAccess.getWindowOperatorAccess().getUnitElementsKeyword_0_2_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__WindowOperator__UnitAlternatives_0_2_02130); 
                     after(grammarAccess.getWindowOperatorAccess().getUnitElementsKeyword_0_2_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__UnitAlternatives_0_2_0"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1014:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1018:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1019:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02162);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02165);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1026:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1030:1: ( ( 'package' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1031:1: ( 'package' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1031:1: ( 'package' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1032:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl2193); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1045:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1049:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1050:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12224);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12227);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1057:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1061:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1062:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1062:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1063:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1064:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1064:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2254);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1074:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1078:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1079:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22284);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22287);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1086:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1090:1: ( ( '{' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1091:1: ( '{' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1091:1: ( '{' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1092:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__2__Impl2315); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1105:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1109:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1110:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32346);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32349);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1117:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1121:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1122:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1122:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1123:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1124:1: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||(LA8_0>=20 && LA8_0<=23)||LA8_0==28||(LA8_0>=32 && LA8_0<=35)||LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1124:2: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl2376);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1134:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1138:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1139:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42407);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42410);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1146:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1150:1: ( ( '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1151:1: ( '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1151:1: ( '}' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1152:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2438); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1165:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1169:1: ( rule__PackageDeclaration__Group__5__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1170:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52469);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1176:1: rule__PackageDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1180:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1181:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1181:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1182:1: ';'
            {
             before(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__PackageDeclaration__Group__5__Impl2497); 
             after(grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1207:1: rule__StreamDeclaration__Group__0 : rule__StreamDeclaration__Group__0__Impl rule__StreamDeclaration__Group__1 ;
    public final void rule__StreamDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1211:1: ( rule__StreamDeclaration__Group__0__Impl rule__StreamDeclaration__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1212:2: rule__StreamDeclaration__Group__0__Impl rule__StreamDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__0__Impl_in_rule__StreamDeclaration__Group__02540);
            rule__StreamDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDeclaration__Group__1_in_rule__StreamDeclaration__Group__02543);
            rule__StreamDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__0"


    // $ANTLR start "rule__StreamDeclaration__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1219:1: rule__StreamDeclaration__Group__0__Impl : ( 'stream' ) ;
    public final void rule__StreamDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1223:1: ( ( 'stream' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1224:1: ( 'stream' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1224:1: ( 'stream' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1225:1: 'stream'
            {
             before(grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__StreamDeclaration__Group__0__Impl2571); 
             after(grammarAccess.getStreamDeclarationAccess().getStreamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1238:1: rule__StreamDeclaration__Group__1 : rule__StreamDeclaration__Group__1__Impl rule__StreamDeclaration__Group__2 ;
    public final void rule__StreamDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1242:1: ( rule__StreamDeclaration__Group__1__Impl rule__StreamDeclaration__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1243:2: rule__StreamDeclaration__Group__1__Impl rule__StreamDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__1__Impl_in_rule__StreamDeclaration__Group__12602);
            rule__StreamDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDeclaration__Group__2_in_rule__StreamDeclaration__Group__12605);
            rule__StreamDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__1"


    // $ANTLR start "rule__StreamDeclaration__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1250:1: rule__StreamDeclaration__Group__1__Impl : ( ( rule__StreamDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StreamDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1254:1: ( ( ( rule__StreamDeclaration__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1255:1: ( ( rule__StreamDeclaration__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1255:1: ( ( rule__StreamDeclaration__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1256:1: ( rule__StreamDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStreamDeclarationAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1257:1: ( rule__StreamDeclaration__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1257:2: rule__StreamDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__NameAssignment_1_in_rule__StreamDeclaration__Group__1__Impl2632);
            rule__StreamDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1267:1: rule__StreamDeclaration__Group__2 : rule__StreamDeclaration__Group__2__Impl rule__StreamDeclaration__Group__3 ;
    public final void rule__StreamDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1271:1: ( rule__StreamDeclaration__Group__2__Impl rule__StreamDeclaration__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1272:2: rule__StreamDeclaration__Group__2__Impl rule__StreamDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__2__Impl_in_rule__StreamDeclaration__Group__22662);
            rule__StreamDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDeclaration__Group__3_in_rule__StreamDeclaration__Group__22665);
            rule__StreamDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__2"


    // $ANTLR start "rule__StreamDeclaration__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1279:1: rule__StreamDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__StreamDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1283:1: ( ( '{' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1284:1: ( '{' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1284:1: ( '{' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1285:1: '{'
            {
             before(grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__StreamDeclaration__Group__2__Impl2693); 
             after(grammarAccess.getStreamDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1298:1: rule__StreamDeclaration__Group__3 : rule__StreamDeclaration__Group__3__Impl rule__StreamDeclaration__Group__4 ;
    public final void rule__StreamDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1302:1: ( rule__StreamDeclaration__Group__3__Impl rule__StreamDeclaration__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1303:2: rule__StreamDeclaration__Group__3__Impl rule__StreamDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__3__Impl_in_rule__StreamDeclaration__Group__32724);
            rule__StreamDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDeclaration__Group__4_in_rule__StreamDeclaration__Group__32727);
            rule__StreamDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__3"


    // $ANTLR start "rule__StreamDeclaration__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1310:1: rule__StreamDeclaration__Group__3__Impl : ( ( ( rule__StreamDeclaration__ElementsAssignment_3 ) ) ( ( rule__StreamDeclaration__ElementsAssignment_3 )* ) ) ;
    public final void rule__StreamDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1314:1: ( ( ( ( rule__StreamDeclaration__ElementsAssignment_3 ) ) ( ( rule__StreamDeclaration__ElementsAssignment_3 )* ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1315:1: ( ( ( rule__StreamDeclaration__ElementsAssignment_3 ) ) ( ( rule__StreamDeclaration__ElementsAssignment_3 )* ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1315:1: ( ( ( rule__StreamDeclaration__ElementsAssignment_3 ) ) ( ( rule__StreamDeclaration__ElementsAssignment_3 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1316:1: ( ( rule__StreamDeclaration__ElementsAssignment_3 ) ) ( ( rule__StreamDeclaration__ElementsAssignment_3 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1316:1: ( ( rule__StreamDeclaration__ElementsAssignment_3 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1317:1: ( rule__StreamDeclaration__ElementsAssignment_3 )
            {
             before(grammarAccess.getStreamDeclarationAccess().getElementsAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1318:1: ( rule__StreamDeclaration__ElementsAssignment_3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1318:2: rule__StreamDeclaration__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__ElementsAssignment_3_in_rule__StreamDeclaration__Group__3__Impl2756);
            rule__StreamDeclaration__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStreamDeclarationAccess().getElementsAssignment_3()); 

            }

            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1321:1: ( ( rule__StreamDeclaration__ElementsAssignment_3 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1322:1: ( rule__StreamDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStreamDeclarationAccess().getElementsAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1323:1: ( rule__StreamDeclaration__ElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1323:2: rule__StreamDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StreamDeclaration__ElementsAssignment_3_in_rule__StreamDeclaration__Group__3__Impl2768);
            	    rule__StreamDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStreamDeclarationAccess().getElementsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1334:1: rule__StreamDeclaration__Group__4 : rule__StreamDeclaration__Group__4__Impl rule__StreamDeclaration__Group__5 ;
    public final void rule__StreamDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1338:1: ( rule__StreamDeclaration__Group__4__Impl rule__StreamDeclaration__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1339:2: rule__StreamDeclaration__Group__4__Impl rule__StreamDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__4__Impl_in_rule__StreamDeclaration__Group__42801);
            rule__StreamDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDeclaration__Group__5_in_rule__StreamDeclaration__Group__42804);
            rule__StreamDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__4"


    // $ANTLR start "rule__StreamDeclaration__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1346:1: rule__StreamDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__StreamDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1350:1: ( ( '}' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1351:1: ( '}' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1351:1: ( '}' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1352:1: '}'
            {
             before(grammarAccess.getStreamDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__StreamDeclaration__Group__4__Impl2832); 
             after(grammarAccess.getStreamDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StreamDeclaration__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1365:1: rule__StreamDeclaration__Group__5 : rule__StreamDeclaration__Group__5__Impl ;
    public final void rule__StreamDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1369:1: ( rule__StreamDeclaration__Group__5__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1370:2: rule__StreamDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StreamDeclaration__Group__5__Impl_in_rule__StreamDeclaration__Group__52863);
            rule__StreamDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__5"


    // $ANTLR start "rule__StreamDeclaration__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1376:1: rule__StreamDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__StreamDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1380:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1381:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1381:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1382:1: ';'
            {
             before(grammarAccess.getStreamDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__StreamDeclaration__Group__5__Impl2891); 
             after(grammarAccess.getStreamDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StreamElement__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1407:1: rule__StreamElement__Group__0 : rule__StreamElement__Group__0__Impl rule__StreamElement__Group__1 ;
    public final void rule__StreamElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1411:1: ( rule__StreamElement__Group__0__Impl rule__StreamElement__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1412:2: rule__StreamElement__Group__0__Impl rule__StreamElement__Group__1
            {
            pushFollow(FOLLOW_rule__StreamElement__Group__0__Impl_in_rule__StreamElement__Group__02934);
            rule__StreamElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamElement__Group__1_in_rule__StreamElement__Group__02937);
            rule__StreamElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__0"


    // $ANTLR start "rule__StreamElement__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1419:1: rule__StreamElement__Group__0__Impl : ( ( rule__StreamElement__TypeAssignment_0 ) ) ;
    public final void rule__StreamElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1423:1: ( ( ( rule__StreamElement__TypeAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1424:1: ( ( rule__StreamElement__TypeAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1424:1: ( ( rule__StreamElement__TypeAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1425:1: ( rule__StreamElement__TypeAssignment_0 )
            {
             before(grammarAccess.getStreamElementAccess().getTypeAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1426:1: ( rule__StreamElement__TypeAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1426:2: rule__StreamElement__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StreamElement__TypeAssignment_0_in_rule__StreamElement__Group__0__Impl2964);
            rule__StreamElement__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamElementAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__0__Impl"


    // $ANTLR start "rule__StreamElement__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1436:1: rule__StreamElement__Group__1 : rule__StreamElement__Group__1__Impl rule__StreamElement__Group__2 ;
    public final void rule__StreamElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1440:1: ( rule__StreamElement__Group__1__Impl rule__StreamElement__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1441:2: rule__StreamElement__Group__1__Impl rule__StreamElement__Group__2
            {
            pushFollow(FOLLOW_rule__StreamElement__Group__1__Impl_in_rule__StreamElement__Group__12994);
            rule__StreamElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamElement__Group__2_in_rule__StreamElement__Group__12997);
            rule__StreamElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__1"


    // $ANTLR start "rule__StreamElement__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1448:1: rule__StreamElement__Group__1__Impl : ( ( rule__StreamElement__NameAssignment_1 ) ) ;
    public final void rule__StreamElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1452:1: ( ( ( rule__StreamElement__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1453:1: ( ( rule__StreamElement__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1453:1: ( ( rule__StreamElement__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1454:1: ( rule__StreamElement__NameAssignment_1 )
            {
             before(grammarAccess.getStreamElementAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1455:1: ( rule__StreamElement__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1455:2: rule__StreamElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StreamElement__NameAssignment_1_in_rule__StreamElement__Group__1__Impl3024);
            rule__StreamElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__1__Impl"


    // $ANTLR start "rule__StreamElement__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1465:1: rule__StreamElement__Group__2 : rule__StreamElement__Group__2__Impl ;
    public final void rule__StreamElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1469:1: ( rule__StreamElement__Group__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1470:2: rule__StreamElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StreamElement__Group__2__Impl_in_rule__StreamElement__Group__23054);
            rule__StreamElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__2"


    // $ANTLR start "rule__StreamElement__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1476:1: rule__StreamElement__Group__2__Impl : ( ';' ) ;
    public final void rule__StreamElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1480:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1481:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1481:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1482:1: ';'
            {
             before(grammarAccess.getStreamElementAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__StreamElement__Group__2__Impl3082); 
             after(grammarAccess.getStreamElementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1501:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1505:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1506:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03119);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03122);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1513:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1517:1: ( ( 'import' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1518:1: ( 'import' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1518:1: ( 'import' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1519:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Import__Group__0__Impl3150); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1532:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1536:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1537:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13181);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13184);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1544:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1548:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1549:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1549:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1550:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1551:1: ( rule__Import__ImportURIAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1551:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3211);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1561:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1565:1: ( rule__Import__Group__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1566:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23241);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1572:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1576:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1577:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1577:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1578:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__2__Impl3269); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__TestElement__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1597:1: rule__TestElement__Group__0 : rule__TestElement__Group__0__Impl rule__TestElement__Group__1 ;
    public final void rule__TestElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1601:1: ( rule__TestElement__Group__0__Impl rule__TestElement__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1602:2: rule__TestElement__Group__0__Impl rule__TestElement__Group__1
            {
            pushFollow(FOLLOW_rule__TestElement__Group__0__Impl_in_rule__TestElement__Group__03306);
            rule__TestElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestElement__Group__1_in_rule__TestElement__Group__03309);
            rule__TestElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestElement__Group__0"


    // $ANTLR start "rule__TestElement__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1609:1: rule__TestElement__Group__0__Impl : ( 'var' ) ;
    public final void rule__TestElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1613:1: ( ( 'var' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1614:1: ( 'var' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1614:1: ( 'var' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1615:1: 'var'
            {
             before(grammarAccess.getTestElementAccess().getVarKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__TestElement__Group__0__Impl3337); 
             after(grammarAccess.getTestElementAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestElement__Group__0__Impl"


    // $ANTLR start "rule__TestElement__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1628:1: rule__TestElement__Group__1 : rule__TestElement__Group__1__Impl ;
    public final void rule__TestElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1632:1: ( rule__TestElement__Group__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1633:2: rule__TestElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TestElement__Group__1__Impl_in_rule__TestElement__Group__13368);
            rule__TestElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestElement__Group__1"


    // $ANTLR start "rule__TestElement__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1639:1: rule__TestElement__Group__1__Impl : ( ( rule__TestElement__NameAssignment_1 ) ) ;
    public final void rule__TestElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1643:1: ( ( ( rule__TestElement__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1644:1: ( ( rule__TestElement__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1644:1: ( ( rule__TestElement__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1645:1: ( rule__TestElement__NameAssignment_1 )
            {
             before(grammarAccess.getTestElementAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1646:1: ( rule__TestElement__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1646:2: rule__TestElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TestElement__NameAssignment_1_in_rule__TestElement__Group__1__Impl3395);
            rule__TestElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestElement__Group__1__Impl"


    // $ANTLR start "rule__TestAssign__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1660:1: rule__TestAssign__Group__0 : rule__TestAssign__Group__0__Impl rule__TestAssign__Group__1 ;
    public final void rule__TestAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1664:1: ( rule__TestAssign__Group__0__Impl rule__TestAssign__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1665:2: rule__TestAssign__Group__0__Impl rule__TestAssign__Group__1
            {
            pushFollow(FOLLOW_rule__TestAssign__Group__0__Impl_in_rule__TestAssign__Group__03429);
            rule__TestAssign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestAssign__Group__1_in_rule__TestAssign__Group__03432);
            rule__TestAssign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__0"


    // $ANTLR start "rule__TestAssign__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1672:1: rule__TestAssign__Group__0__Impl : ( 'let' ) ;
    public final void rule__TestAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1676:1: ( ( 'let' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1677:1: ( 'let' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1677:1: ( 'let' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1678:1: 'let'
            {
             before(grammarAccess.getTestAssignAccess().getLetKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TestAssign__Group__0__Impl3460); 
             after(grammarAccess.getTestAssignAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__0__Impl"


    // $ANTLR start "rule__TestAssign__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1691:1: rule__TestAssign__Group__1 : rule__TestAssign__Group__1__Impl rule__TestAssign__Group__2 ;
    public final void rule__TestAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1695:1: ( rule__TestAssign__Group__1__Impl rule__TestAssign__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1696:2: rule__TestAssign__Group__1__Impl rule__TestAssign__Group__2
            {
            pushFollow(FOLLOW_rule__TestAssign__Group__1__Impl_in_rule__TestAssign__Group__13491);
            rule__TestAssign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestAssign__Group__2_in_rule__TestAssign__Group__13494);
            rule__TestAssign__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__1"


    // $ANTLR start "rule__TestAssign__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1703:1: rule__TestAssign__Group__1__Impl : ( ( rule__TestAssign__LeftAssignment_1 ) ) ;
    public final void rule__TestAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1707:1: ( ( ( rule__TestAssign__LeftAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1708:1: ( ( rule__TestAssign__LeftAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1708:1: ( ( rule__TestAssign__LeftAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1709:1: ( rule__TestAssign__LeftAssignment_1 )
            {
             before(grammarAccess.getTestAssignAccess().getLeftAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1710:1: ( rule__TestAssign__LeftAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1710:2: rule__TestAssign__LeftAssignment_1
            {
            pushFollow(FOLLOW_rule__TestAssign__LeftAssignment_1_in_rule__TestAssign__Group__1__Impl3521);
            rule__TestAssign__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAssignAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__1__Impl"


    // $ANTLR start "rule__TestAssign__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1720:1: rule__TestAssign__Group__2 : rule__TestAssign__Group__2__Impl rule__TestAssign__Group__3 ;
    public final void rule__TestAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1724:1: ( rule__TestAssign__Group__2__Impl rule__TestAssign__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1725:2: rule__TestAssign__Group__2__Impl rule__TestAssign__Group__3
            {
            pushFollow(FOLLOW_rule__TestAssign__Group__2__Impl_in_rule__TestAssign__Group__23551);
            rule__TestAssign__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestAssign__Group__3_in_rule__TestAssign__Group__23554);
            rule__TestAssign__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__2"


    // $ANTLR start "rule__TestAssign__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1732:1: rule__TestAssign__Group__2__Impl : ( '=' ) ;
    public final void rule__TestAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1736:1: ( ( '=' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1737:1: ( '=' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1737:1: ( '=' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1738:1: '='
            {
             before(grammarAccess.getTestAssignAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__TestAssign__Group__2__Impl3582); 
             after(grammarAccess.getTestAssignAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__2__Impl"


    // $ANTLR start "rule__TestAssign__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1751:1: rule__TestAssign__Group__3 : rule__TestAssign__Group__3__Impl ;
    public final void rule__TestAssign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1755:1: ( rule__TestAssign__Group__3__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1756:2: rule__TestAssign__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TestAssign__Group__3__Impl_in_rule__TestAssign__Group__33613);
            rule__TestAssign__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__3"


    // $ANTLR start "rule__TestAssign__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1762:1: rule__TestAssign__Group__3__Impl : ( ( rule__TestAssign__RightAssignment_3 ) ) ;
    public final void rule__TestAssign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1766:1: ( ( ( rule__TestAssign__RightAssignment_3 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1767:1: ( ( rule__TestAssign__RightAssignment_3 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1767:1: ( ( rule__TestAssign__RightAssignment_3 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1768:1: ( rule__TestAssign__RightAssignment_3 )
            {
             before(grammarAccess.getTestAssignAccess().getRightAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1769:1: ( rule__TestAssign__RightAssignment_3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1769:2: rule__TestAssign__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__TestAssign__RightAssignment_3_in_rule__TestAssign__Group__3__Impl3640);
            rule__TestAssign__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAssignAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1788:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1792:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1793:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__03679);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__03682);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1800:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1804:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1805:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1805:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1806:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1807:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1807:2: rule__VariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl3709);
            rule__VariableDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1817:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1821:1: ( rule__VariableDeclaration__Group__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1822:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__13739);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1828:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1832:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1833:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1833:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1834:1: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1835:1: ( rule__VariableDeclaration__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1835:2: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl3766);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StreamDefinition__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1849:1: rule__StreamDefinition__Group__0 : rule__StreamDefinition__Group__0__Impl rule__StreamDefinition__Group__1 ;
    public final void rule__StreamDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1853:1: ( rule__StreamDefinition__Group__0__Impl rule__StreamDefinition__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1854:2: rule__StreamDefinition__Group__0__Impl rule__StreamDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__StreamDefinition__Group__0__Impl_in_rule__StreamDefinition__Group__03800);
            rule__StreamDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDefinition__Group__1_in_rule__StreamDefinition__Group__03803);
            rule__StreamDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__0"


    // $ANTLR start "rule__StreamDefinition__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1861:1: rule__StreamDefinition__Group__0__Impl : ( ( rule__StreamDefinition__ReferenceAssignment_0 ) ) ;
    public final void rule__StreamDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1865:1: ( ( ( rule__StreamDefinition__ReferenceAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1866:1: ( ( rule__StreamDefinition__ReferenceAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1866:1: ( ( rule__StreamDefinition__ReferenceAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1867:1: ( rule__StreamDefinition__ReferenceAssignment_0 )
            {
             before(grammarAccess.getStreamDefinitionAccess().getReferenceAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1868:1: ( rule__StreamDefinition__ReferenceAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1868:2: rule__StreamDefinition__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__StreamDefinition__ReferenceAssignment_0_in_rule__StreamDefinition__Group__0__Impl3830);
            rule__StreamDefinition__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamDefinitionAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__0__Impl"


    // $ANTLR start "rule__StreamDefinition__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1878:1: rule__StreamDefinition__Group__1 : rule__StreamDefinition__Group__1__Impl rule__StreamDefinition__Group__2 ;
    public final void rule__StreamDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1882:1: ( rule__StreamDefinition__Group__1__Impl rule__StreamDefinition__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1883:2: rule__StreamDefinition__Group__1__Impl rule__StreamDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__StreamDefinition__Group__1__Impl_in_rule__StreamDefinition__Group__13860);
            rule__StreamDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamDefinition__Group__2_in_rule__StreamDefinition__Group__13863);
            rule__StreamDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__1"


    // $ANTLR start "rule__StreamDefinition__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1890:1: rule__StreamDefinition__Group__1__Impl : ( ( rule__StreamDefinition__NameAssignment_1 ) ) ;
    public final void rule__StreamDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1894:1: ( ( ( rule__StreamDefinition__NameAssignment_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1895:1: ( ( rule__StreamDefinition__NameAssignment_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1895:1: ( ( rule__StreamDefinition__NameAssignment_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1896:1: ( rule__StreamDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStreamDefinitionAccess().getNameAssignment_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1897:1: ( rule__StreamDefinition__NameAssignment_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1897:2: rule__StreamDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StreamDefinition__NameAssignment_1_in_rule__StreamDefinition__Group__1__Impl3890);
            rule__StreamDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__1__Impl"


    // $ANTLR start "rule__StreamDefinition__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1907:1: rule__StreamDefinition__Group__2 : rule__StreamDefinition__Group__2__Impl ;
    public final void rule__StreamDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1911:1: ( rule__StreamDefinition__Group__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1912:2: rule__StreamDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StreamDefinition__Group__2__Impl_in_rule__StreamDefinition__Group__23920);
            rule__StreamDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__2"


    // $ANTLR start "rule__StreamDefinition__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1918:1: rule__StreamDefinition__Group__2__Impl : ( ';' ) ;
    public final void rule__StreamDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1922:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1923:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1923:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1924:1: ';'
            {
             before(grammarAccess.getStreamDefinitionAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__StreamDefinition__Group__2__Impl3948); 
             after(grammarAccess.getStreamDefinitionAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__Group__2__Impl"


    // $ANTLR start "rule__StreamAccess__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1943:1: rule__StreamAccess__Group__0 : rule__StreamAccess__Group__0__Impl rule__StreamAccess__Group__1 ;
    public final void rule__StreamAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1947:1: ( rule__StreamAccess__Group__0__Impl rule__StreamAccess__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1948:2: rule__StreamAccess__Group__0__Impl rule__StreamAccess__Group__1
            {
            pushFollow(FOLLOW_rule__StreamAccess__Group__0__Impl_in_rule__StreamAccess__Group__03985);
            rule__StreamAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamAccess__Group__1_in_rule__StreamAccess__Group__03988);
            rule__StreamAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__0"


    // $ANTLR start "rule__StreamAccess__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1955:1: rule__StreamAccess__Group__0__Impl : ( ( rule__StreamAccess__ReferenceAssignment_0 ) ) ;
    public final void rule__StreamAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1959:1: ( ( ( rule__StreamAccess__ReferenceAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1960:1: ( ( rule__StreamAccess__ReferenceAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1960:1: ( ( rule__StreamAccess__ReferenceAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1961:1: ( rule__StreamAccess__ReferenceAssignment_0 )
            {
             before(grammarAccess.getStreamAccessAccess().getReferenceAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1962:1: ( rule__StreamAccess__ReferenceAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1962:2: rule__StreamAccess__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__StreamAccess__ReferenceAssignment_0_in_rule__StreamAccess__Group__0__Impl4015);
            rule__StreamAccess__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccessAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__0__Impl"


    // $ANTLR start "rule__StreamAccess__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1972:1: rule__StreamAccess__Group__1 : rule__StreamAccess__Group__1__Impl rule__StreamAccess__Group__2 ;
    public final void rule__StreamAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1976:1: ( rule__StreamAccess__Group__1__Impl rule__StreamAccess__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1977:2: rule__StreamAccess__Group__1__Impl rule__StreamAccess__Group__2
            {
            pushFollow(FOLLOW_rule__StreamAccess__Group__1__Impl_in_rule__StreamAccess__Group__14045);
            rule__StreamAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamAccess__Group__2_in_rule__StreamAccess__Group__14048);
            rule__StreamAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__1"


    // $ANTLR start "rule__StreamAccess__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1984:1: rule__StreamAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__StreamAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1988:1: ( ( '.' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1989:1: ( '.' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1989:1: ( '.' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:1990:1: '.'
            {
             before(grammarAccess.getStreamAccessAccess().getFullStopKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__StreamAccess__Group__1__Impl4076); 
             after(grammarAccess.getStreamAccessAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__1__Impl"


    // $ANTLR start "rule__StreamAccess__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2003:1: rule__StreamAccess__Group__2 : rule__StreamAccess__Group__2__Impl ;
    public final void rule__StreamAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2007:1: ( rule__StreamAccess__Group__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2008:2: rule__StreamAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StreamAccess__Group__2__Impl_in_rule__StreamAccess__Group__24107);
            rule__StreamAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__2"


    // $ANTLR start "rule__StreamAccess__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2014:1: rule__StreamAccess__Group__2__Impl : ( ( rule__StreamAccess__ElementAssignment_2 ) ) ;
    public final void rule__StreamAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2018:1: ( ( ( rule__StreamAccess__ElementAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2019:1: ( ( rule__StreamAccess__ElementAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2019:1: ( ( rule__StreamAccess__ElementAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2020:1: ( rule__StreamAccess__ElementAssignment_2 )
            {
             before(grammarAccess.getStreamAccessAccess().getElementAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2021:1: ( rule__StreamAccess__ElementAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2021:2: rule__StreamAccess__ElementAssignment_2
            {
            pushFollow(FOLLOW_rule__StreamAccess__ElementAssignment_2_in_rule__StreamAccess__Group__2__Impl4134);
            rule__StreamAccess__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccessAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__Group__2__Impl"


    // $ANTLR start "rule__StreamOperatorParameter__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2037:1: rule__StreamOperatorParameter__Group__0 : rule__StreamOperatorParameter__Group__0__Impl rule__StreamOperatorParameter__Group__1 ;
    public final void rule__StreamOperatorParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2041:1: ( rule__StreamOperatorParameter__Group__0__Impl rule__StreamOperatorParameter__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2042:2: rule__StreamOperatorParameter__Group__0__Impl rule__StreamOperatorParameter__Group__1
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group__0__Impl_in_rule__StreamOperatorParameter__Group__04170);
            rule__StreamOperatorParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group__1_in_rule__StreamOperatorParameter__Group__04173);
            rule__StreamOperatorParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group__0"


    // $ANTLR start "rule__StreamOperatorParameter__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2049:1: rule__StreamOperatorParameter__Group__0__Impl : ( ( rule__StreamOperatorParameter__StreamAssignment_0 ) ) ;
    public final void rule__StreamOperatorParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2053:1: ( ( ( rule__StreamOperatorParameter__StreamAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2054:1: ( ( rule__StreamOperatorParameter__StreamAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2054:1: ( ( rule__StreamOperatorParameter__StreamAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2055:1: ( rule__StreamOperatorParameter__StreamAssignment_0 )
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getStreamAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2056:1: ( rule__StreamOperatorParameter__StreamAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2056:2: rule__StreamOperatorParameter__StreamAssignment_0
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__StreamAssignment_0_in_rule__StreamOperatorParameter__Group__0__Impl4200);
            rule__StreamOperatorParameter__StreamAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamOperatorParameterAccess().getStreamAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group__0__Impl"


    // $ANTLR start "rule__StreamOperatorParameter__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2066:1: rule__StreamOperatorParameter__Group__1 : rule__StreamOperatorParameter__Group__1__Impl ;
    public final void rule__StreamOperatorParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2070:1: ( rule__StreamOperatorParameter__Group__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2071:2: rule__StreamOperatorParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group__1__Impl_in_rule__StreamOperatorParameter__Group__14230);
            rule__StreamOperatorParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group__1"


    // $ANTLR start "rule__StreamOperatorParameter__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2077:1: rule__StreamOperatorParameter__Group__1__Impl : ( ( rule__StreamOperatorParameter__Group_1__0 )? ) ;
    public final void rule__StreamOperatorParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2081:1: ( ( ( rule__StreamOperatorParameter__Group_1__0 )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2082:1: ( ( rule__StreamOperatorParameter__Group_1__0 )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2082:1: ( ( rule__StreamOperatorParameter__Group_1__0 )? )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2083:1: ( rule__StreamOperatorParameter__Group_1__0 )?
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getGroup_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2084:1: ( rule__StreamOperatorParameter__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2084:2: rule__StreamOperatorParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__0_in_rule__StreamOperatorParameter__Group__1__Impl4257);
                    rule__StreamOperatorParameter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStreamOperatorParameterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group__1__Impl"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2098:1: rule__StreamOperatorParameter__Group_1__0 : rule__StreamOperatorParameter__Group_1__0__Impl rule__StreamOperatorParameter__Group_1__1 ;
    public final void rule__StreamOperatorParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2102:1: ( rule__StreamOperatorParameter__Group_1__0__Impl rule__StreamOperatorParameter__Group_1__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2103:2: rule__StreamOperatorParameter__Group_1__0__Impl rule__StreamOperatorParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__0__Impl_in_rule__StreamOperatorParameter__Group_1__04292);
            rule__StreamOperatorParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__1_in_rule__StreamOperatorParameter__Group_1__04295);
            rule__StreamOperatorParameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__0"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2110:1: rule__StreamOperatorParameter__Group_1__0__Impl : ( '[' ) ;
    public final void rule__StreamOperatorParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2114:1: ( ( '[' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2115:1: ( '[' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2115:1: ( '[' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2116:1: '['
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__StreamOperatorParameter__Group_1__0__Impl4323); 
             after(grammarAccess.getStreamOperatorParameterAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__0__Impl"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2129:1: rule__StreamOperatorParameter__Group_1__1 : rule__StreamOperatorParameter__Group_1__1__Impl rule__StreamOperatorParameter__Group_1__2 ;
    public final void rule__StreamOperatorParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2133:1: ( rule__StreamOperatorParameter__Group_1__1__Impl rule__StreamOperatorParameter__Group_1__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2134:2: rule__StreamOperatorParameter__Group_1__1__Impl rule__StreamOperatorParameter__Group_1__2
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__1__Impl_in_rule__StreamOperatorParameter__Group_1__14354);
            rule__StreamOperatorParameter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__2_in_rule__StreamOperatorParameter__Group_1__14357);
            rule__StreamOperatorParameter__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__1"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2141:1: rule__StreamOperatorParameter__Group_1__1__Impl : ( ( rule__StreamOperatorParameter__BarrierAssignment_1_1 ) ) ;
    public final void rule__StreamOperatorParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2145:1: ( ( ( rule__StreamOperatorParameter__BarrierAssignment_1_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2146:1: ( ( rule__StreamOperatorParameter__BarrierAssignment_1_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2146:1: ( ( rule__StreamOperatorParameter__BarrierAssignment_1_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2147:1: ( rule__StreamOperatorParameter__BarrierAssignment_1_1 )
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getBarrierAssignment_1_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2148:1: ( rule__StreamOperatorParameter__BarrierAssignment_1_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2148:2: rule__StreamOperatorParameter__BarrierAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__BarrierAssignment_1_1_in_rule__StreamOperatorParameter__Group_1__1__Impl4384);
            rule__StreamOperatorParameter__BarrierAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamOperatorParameterAccess().getBarrierAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__1__Impl"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2158:1: rule__StreamOperatorParameter__Group_1__2 : rule__StreamOperatorParameter__Group_1__2__Impl ;
    public final void rule__StreamOperatorParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2162:1: ( rule__StreamOperatorParameter__Group_1__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2163:2: rule__StreamOperatorParameter__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StreamOperatorParameter__Group_1__2__Impl_in_rule__StreamOperatorParameter__Group_1__24414);
            rule__StreamOperatorParameter__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__2"


    // $ANTLR start "rule__StreamOperatorParameter__Group_1__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2169:1: rule__StreamOperatorParameter__Group_1__2__Impl : ( ']' ) ;
    public final void rule__StreamOperatorParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2173:1: ( ( ']' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2174:1: ( ']' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2174:1: ( ']' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2175:1: ']'
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,27,FOLLOW_27_in_rule__StreamOperatorParameter__Group_1__2__Impl4442); 
             after(grammarAccess.getStreamOperatorParameterAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__Group_1__2__Impl"


    // $ANTLR start "rule__CountOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2194:1: rule__CountOperator__Group__0 : rule__CountOperator__Group__0__Impl rule__CountOperator__Group__1 ;
    public final void rule__CountOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2198:1: ( rule__CountOperator__Group__0__Impl rule__CountOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2199:2: rule__CountOperator__Group__0__Impl rule__CountOperator__Group__1
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__0__Impl_in_rule__CountOperator__Group__04479);
            rule__CountOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountOperator__Group__1_in_rule__CountOperator__Group__04482);
            rule__CountOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__0"


    // $ANTLR start "rule__CountOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2206:1: rule__CountOperator__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2210:1: ( ( 'count' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2211:1: ( 'count' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2211:1: ( 'count' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2212:1: 'count'
            {
             before(grammarAccess.getCountOperatorAccess().getCountKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__CountOperator__Group__0__Impl4510); 
             after(grammarAccess.getCountOperatorAccess().getCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__0__Impl"


    // $ANTLR start "rule__CountOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2225:1: rule__CountOperator__Group__1 : rule__CountOperator__Group__1__Impl rule__CountOperator__Group__2 ;
    public final void rule__CountOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2229:1: ( rule__CountOperator__Group__1__Impl rule__CountOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2230:2: rule__CountOperator__Group__1__Impl rule__CountOperator__Group__2
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__1__Impl_in_rule__CountOperator__Group__14541);
            rule__CountOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountOperator__Group__2_in_rule__CountOperator__Group__14544);
            rule__CountOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__1"


    // $ANTLR start "rule__CountOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2237:1: rule__CountOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__CountOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2241:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2242:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2242:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2243:1: '('
            {
             before(grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__CountOperator__Group__1__Impl4572); 
             after(grammarAccess.getCountOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__1__Impl"


    // $ANTLR start "rule__CountOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2256:1: rule__CountOperator__Group__2 : rule__CountOperator__Group__2__Impl rule__CountOperator__Group__3 ;
    public final void rule__CountOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2260:1: ( rule__CountOperator__Group__2__Impl rule__CountOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2261:2: rule__CountOperator__Group__2__Impl rule__CountOperator__Group__3
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__2__Impl_in_rule__CountOperator__Group__24603);
            rule__CountOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountOperator__Group__3_in_rule__CountOperator__Group__24606);
            rule__CountOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__2"


    // $ANTLR start "rule__CountOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2268:1: rule__CountOperator__Group__2__Impl : ( ( rule__CountOperator__ParameterAssignment_2 ) ) ;
    public final void rule__CountOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2272:1: ( ( ( rule__CountOperator__ParameterAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2273:1: ( ( rule__CountOperator__ParameterAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2273:1: ( ( rule__CountOperator__ParameterAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2274:1: ( rule__CountOperator__ParameterAssignment_2 )
            {
             before(grammarAccess.getCountOperatorAccess().getParameterAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2275:1: ( rule__CountOperator__ParameterAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2275:2: rule__CountOperator__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__CountOperator__ParameterAssignment_2_in_rule__CountOperator__Group__2__Impl4633);
            rule__CountOperator__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountOperatorAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__2__Impl"


    // $ANTLR start "rule__CountOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2285:1: rule__CountOperator__Group__3 : rule__CountOperator__Group__3__Impl rule__CountOperator__Group__4 ;
    public final void rule__CountOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2289:1: ( rule__CountOperator__Group__3__Impl rule__CountOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2290:2: rule__CountOperator__Group__3__Impl rule__CountOperator__Group__4
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__3__Impl_in_rule__CountOperator__Group__34663);
            rule__CountOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountOperator__Group__4_in_rule__CountOperator__Group__34666);
            rule__CountOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__3"


    // $ANTLR start "rule__CountOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2297:1: rule__CountOperator__Group__3__Impl : ( ',' ) ;
    public final void rule__CountOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2301:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2302:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2302:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2303:1: ','
            {
             before(grammarAccess.getCountOperatorAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__CountOperator__Group__3__Impl4694); 
             after(grammarAccess.getCountOperatorAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__3__Impl"


    // $ANTLR start "rule__CountOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2316:1: rule__CountOperator__Group__4 : rule__CountOperator__Group__4__Impl rule__CountOperator__Group__5 ;
    public final void rule__CountOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2320:1: ( rule__CountOperator__Group__4__Impl rule__CountOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2321:2: rule__CountOperator__Group__4__Impl rule__CountOperator__Group__5
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__4__Impl_in_rule__CountOperator__Group__44725);
            rule__CountOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CountOperator__Group__5_in_rule__CountOperator__Group__44728);
            rule__CountOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__4"


    // $ANTLR start "rule__CountOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2328:1: rule__CountOperator__Group__4__Impl : ( ( rule__CountOperator__StreamAssignment_4 ) ) ;
    public final void rule__CountOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2332:1: ( ( ( rule__CountOperator__StreamAssignment_4 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2333:1: ( ( rule__CountOperator__StreamAssignment_4 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2333:1: ( ( rule__CountOperator__StreamAssignment_4 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2334:1: ( rule__CountOperator__StreamAssignment_4 )
            {
             before(grammarAccess.getCountOperatorAccess().getStreamAssignment_4()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2335:1: ( rule__CountOperator__StreamAssignment_4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2335:2: rule__CountOperator__StreamAssignment_4
            {
            pushFollow(FOLLOW_rule__CountOperator__StreamAssignment_4_in_rule__CountOperator__Group__4__Impl4755);
            rule__CountOperator__StreamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCountOperatorAccess().getStreamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__4__Impl"


    // $ANTLR start "rule__CountOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2345:1: rule__CountOperator__Group__5 : rule__CountOperator__Group__5__Impl ;
    public final void rule__CountOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2349:1: ( rule__CountOperator__Group__5__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2350:2: rule__CountOperator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CountOperator__Group__5__Impl_in_rule__CountOperator__Group__54785);
            rule__CountOperator__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__5"


    // $ANTLR start "rule__CountOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2356:1: rule__CountOperator__Group__5__Impl : ( ')' ) ;
    public final void rule__CountOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2360:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2361:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2361:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2362:1: ')'
            {
             before(grammarAccess.getCountOperatorAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__CountOperator__Group__5__Impl4813); 
             after(grammarAccess.getCountOperatorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__Group__5__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2387:1: rule__StandardDeviationOperator__Group__0 : rule__StandardDeviationOperator__Group__0__Impl rule__StandardDeviationOperator__Group__1 ;
    public final void rule__StandardDeviationOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2391:1: ( rule__StandardDeviationOperator__Group__0__Impl rule__StandardDeviationOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2392:2: rule__StandardDeviationOperator__Group__0__Impl rule__StandardDeviationOperator__Group__1
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__0__Impl_in_rule__StandardDeviationOperator__Group__04856);
            rule__StandardDeviationOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__1_in_rule__StandardDeviationOperator__Group__04859);
            rule__StandardDeviationOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__0"


    // $ANTLR start "rule__StandardDeviationOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2399:1: rule__StandardDeviationOperator__Group__0__Impl : ( 'std' ) ;
    public final void rule__StandardDeviationOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2403:1: ( ( 'std' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2404:1: ( 'std' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2404:1: ( 'std' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2405:1: 'std'
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StandardDeviationOperator__Group__0__Impl4887); 
             after(grammarAccess.getStandardDeviationOperatorAccess().getStdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__0__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2418:1: rule__StandardDeviationOperator__Group__1 : rule__StandardDeviationOperator__Group__1__Impl rule__StandardDeviationOperator__Group__2 ;
    public final void rule__StandardDeviationOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2422:1: ( rule__StandardDeviationOperator__Group__1__Impl rule__StandardDeviationOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2423:2: rule__StandardDeviationOperator__Group__1__Impl rule__StandardDeviationOperator__Group__2
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__1__Impl_in_rule__StandardDeviationOperator__Group__14918);
            rule__StandardDeviationOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__2_in_rule__StandardDeviationOperator__Group__14921);
            rule__StandardDeviationOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__1"


    // $ANTLR start "rule__StandardDeviationOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2430:1: rule__StandardDeviationOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__StandardDeviationOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2434:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2435:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2435:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2436:1: '('
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__StandardDeviationOperator__Group__1__Impl4949); 
             after(grammarAccess.getStandardDeviationOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__1__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2449:1: rule__StandardDeviationOperator__Group__2 : rule__StandardDeviationOperator__Group__2__Impl rule__StandardDeviationOperator__Group__3 ;
    public final void rule__StandardDeviationOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2453:1: ( rule__StandardDeviationOperator__Group__2__Impl rule__StandardDeviationOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2454:2: rule__StandardDeviationOperator__Group__2__Impl rule__StandardDeviationOperator__Group__3
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__2__Impl_in_rule__StandardDeviationOperator__Group__24980);
            rule__StandardDeviationOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__3_in_rule__StandardDeviationOperator__Group__24983);
            rule__StandardDeviationOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__2"


    // $ANTLR start "rule__StandardDeviationOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2461:1: rule__StandardDeviationOperator__Group__2__Impl : ( ( rule__StandardDeviationOperator__ParameterAssignment_2 ) ) ;
    public final void rule__StandardDeviationOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2465:1: ( ( ( rule__StandardDeviationOperator__ParameterAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2466:1: ( ( rule__StandardDeviationOperator__ParameterAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2466:1: ( ( rule__StandardDeviationOperator__ParameterAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2467:1: ( rule__StandardDeviationOperator__ParameterAssignment_2 )
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getParameterAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2468:1: ( rule__StandardDeviationOperator__ParameterAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2468:2: rule__StandardDeviationOperator__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__ParameterAssignment_2_in_rule__StandardDeviationOperator__Group__2__Impl5010);
            rule__StandardDeviationOperator__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStandardDeviationOperatorAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__2__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2478:1: rule__StandardDeviationOperator__Group__3 : rule__StandardDeviationOperator__Group__3__Impl rule__StandardDeviationOperator__Group__4 ;
    public final void rule__StandardDeviationOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2482:1: ( rule__StandardDeviationOperator__Group__3__Impl rule__StandardDeviationOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2483:2: rule__StandardDeviationOperator__Group__3__Impl rule__StandardDeviationOperator__Group__4
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__3__Impl_in_rule__StandardDeviationOperator__Group__35040);
            rule__StandardDeviationOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__4_in_rule__StandardDeviationOperator__Group__35043);
            rule__StandardDeviationOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__3"


    // $ANTLR start "rule__StandardDeviationOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2490:1: rule__StandardDeviationOperator__Group__3__Impl : ( ',' ) ;
    public final void rule__StandardDeviationOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2494:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2495:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2495:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2496:1: ','
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__StandardDeviationOperator__Group__3__Impl5071); 
             after(grammarAccess.getStandardDeviationOperatorAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__3__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2509:1: rule__StandardDeviationOperator__Group__4 : rule__StandardDeviationOperator__Group__4__Impl rule__StandardDeviationOperator__Group__5 ;
    public final void rule__StandardDeviationOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2513:1: ( rule__StandardDeviationOperator__Group__4__Impl rule__StandardDeviationOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2514:2: rule__StandardDeviationOperator__Group__4__Impl rule__StandardDeviationOperator__Group__5
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__4__Impl_in_rule__StandardDeviationOperator__Group__45102);
            rule__StandardDeviationOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__5_in_rule__StandardDeviationOperator__Group__45105);
            rule__StandardDeviationOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__4"


    // $ANTLR start "rule__StandardDeviationOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2521:1: rule__StandardDeviationOperator__Group__4__Impl : ( ( rule__StandardDeviationOperator__StreamAssignment_4 ) ) ;
    public final void rule__StandardDeviationOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2525:1: ( ( ( rule__StandardDeviationOperator__StreamAssignment_4 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2526:1: ( ( rule__StandardDeviationOperator__StreamAssignment_4 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2526:1: ( ( rule__StandardDeviationOperator__StreamAssignment_4 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2527:1: ( rule__StandardDeviationOperator__StreamAssignment_4 )
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getStreamAssignment_4()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2528:1: ( rule__StandardDeviationOperator__StreamAssignment_4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2528:2: rule__StandardDeviationOperator__StreamAssignment_4
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__StreamAssignment_4_in_rule__StandardDeviationOperator__Group__4__Impl5132);
            rule__StandardDeviationOperator__StreamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStandardDeviationOperatorAccess().getStreamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__4__Impl"


    // $ANTLR start "rule__StandardDeviationOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2538:1: rule__StandardDeviationOperator__Group__5 : rule__StandardDeviationOperator__Group__5__Impl ;
    public final void rule__StandardDeviationOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2542:1: ( rule__StandardDeviationOperator__Group__5__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2543:2: rule__StandardDeviationOperator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StandardDeviationOperator__Group__5__Impl_in_rule__StandardDeviationOperator__Group__55162);
            rule__StandardDeviationOperator__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__5"


    // $ANTLR start "rule__StandardDeviationOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2549:1: rule__StandardDeviationOperator__Group__5__Impl : ( ')' ) ;
    public final void rule__StandardDeviationOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2553:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2554:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2554:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2555:1: ')'
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__StandardDeviationOperator__Group__5__Impl5190); 
             after(grammarAccess.getStandardDeviationOperatorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__Group__5__Impl"


    // $ANTLR start "rule__AverageOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2580:1: rule__AverageOperator__Group__0 : rule__AverageOperator__Group__0__Impl rule__AverageOperator__Group__1 ;
    public final void rule__AverageOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2584:1: ( rule__AverageOperator__Group__0__Impl rule__AverageOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2585:2: rule__AverageOperator__Group__0__Impl rule__AverageOperator__Group__1
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__0__Impl_in_rule__AverageOperator__Group__05233);
            rule__AverageOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AverageOperator__Group__1_in_rule__AverageOperator__Group__05236);
            rule__AverageOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__0"


    // $ANTLR start "rule__AverageOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2592:1: rule__AverageOperator__Group__0__Impl : ( 'avg' ) ;
    public final void rule__AverageOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2596:1: ( ( 'avg' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2597:1: ( 'avg' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2597:1: ( 'avg' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2598:1: 'avg'
            {
             before(grammarAccess.getAverageOperatorAccess().getAvgKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__AverageOperator__Group__0__Impl5264); 
             after(grammarAccess.getAverageOperatorAccess().getAvgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__0__Impl"


    // $ANTLR start "rule__AverageOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2611:1: rule__AverageOperator__Group__1 : rule__AverageOperator__Group__1__Impl rule__AverageOperator__Group__2 ;
    public final void rule__AverageOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2615:1: ( rule__AverageOperator__Group__1__Impl rule__AverageOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2616:2: rule__AverageOperator__Group__1__Impl rule__AverageOperator__Group__2
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__1__Impl_in_rule__AverageOperator__Group__15295);
            rule__AverageOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AverageOperator__Group__2_in_rule__AverageOperator__Group__15298);
            rule__AverageOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__1"


    // $ANTLR start "rule__AverageOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2623:1: rule__AverageOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__AverageOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2627:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2628:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2628:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2629:1: '('
            {
             before(grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__AverageOperator__Group__1__Impl5326); 
             after(grammarAccess.getAverageOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__1__Impl"


    // $ANTLR start "rule__AverageOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2642:1: rule__AverageOperator__Group__2 : rule__AverageOperator__Group__2__Impl rule__AverageOperator__Group__3 ;
    public final void rule__AverageOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2646:1: ( rule__AverageOperator__Group__2__Impl rule__AverageOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2647:2: rule__AverageOperator__Group__2__Impl rule__AverageOperator__Group__3
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__2__Impl_in_rule__AverageOperator__Group__25357);
            rule__AverageOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AverageOperator__Group__3_in_rule__AverageOperator__Group__25360);
            rule__AverageOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__2"


    // $ANTLR start "rule__AverageOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2654:1: rule__AverageOperator__Group__2__Impl : ( ( rule__AverageOperator__ParameterAssignment_2 ) ) ;
    public final void rule__AverageOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2658:1: ( ( ( rule__AverageOperator__ParameterAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2659:1: ( ( rule__AverageOperator__ParameterAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2659:1: ( ( rule__AverageOperator__ParameterAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2660:1: ( rule__AverageOperator__ParameterAssignment_2 )
            {
             before(grammarAccess.getAverageOperatorAccess().getParameterAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2661:1: ( rule__AverageOperator__ParameterAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2661:2: rule__AverageOperator__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__AverageOperator__ParameterAssignment_2_in_rule__AverageOperator__Group__2__Impl5387);
            rule__AverageOperator__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAverageOperatorAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__2__Impl"


    // $ANTLR start "rule__AverageOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2671:1: rule__AverageOperator__Group__3 : rule__AverageOperator__Group__3__Impl rule__AverageOperator__Group__4 ;
    public final void rule__AverageOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2675:1: ( rule__AverageOperator__Group__3__Impl rule__AverageOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2676:2: rule__AverageOperator__Group__3__Impl rule__AverageOperator__Group__4
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__3__Impl_in_rule__AverageOperator__Group__35417);
            rule__AverageOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AverageOperator__Group__4_in_rule__AverageOperator__Group__35420);
            rule__AverageOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__3"


    // $ANTLR start "rule__AverageOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2683:1: rule__AverageOperator__Group__3__Impl : ( ',' ) ;
    public final void rule__AverageOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2687:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2688:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2688:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2689:1: ','
            {
             before(grammarAccess.getAverageOperatorAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__AverageOperator__Group__3__Impl5448); 
             after(grammarAccess.getAverageOperatorAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__3__Impl"


    // $ANTLR start "rule__AverageOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2702:1: rule__AverageOperator__Group__4 : rule__AverageOperator__Group__4__Impl rule__AverageOperator__Group__5 ;
    public final void rule__AverageOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2706:1: ( rule__AverageOperator__Group__4__Impl rule__AverageOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2707:2: rule__AverageOperator__Group__4__Impl rule__AverageOperator__Group__5
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__4__Impl_in_rule__AverageOperator__Group__45479);
            rule__AverageOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AverageOperator__Group__5_in_rule__AverageOperator__Group__45482);
            rule__AverageOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__4"


    // $ANTLR start "rule__AverageOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2714:1: rule__AverageOperator__Group__4__Impl : ( ( rule__AverageOperator__StreamAssignment_4 ) ) ;
    public final void rule__AverageOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2718:1: ( ( ( rule__AverageOperator__StreamAssignment_4 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2719:1: ( ( rule__AverageOperator__StreamAssignment_4 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2719:1: ( ( rule__AverageOperator__StreamAssignment_4 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2720:1: ( rule__AverageOperator__StreamAssignment_4 )
            {
             before(grammarAccess.getAverageOperatorAccess().getStreamAssignment_4()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2721:1: ( rule__AverageOperator__StreamAssignment_4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2721:2: rule__AverageOperator__StreamAssignment_4
            {
            pushFollow(FOLLOW_rule__AverageOperator__StreamAssignment_4_in_rule__AverageOperator__Group__4__Impl5509);
            rule__AverageOperator__StreamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAverageOperatorAccess().getStreamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__4__Impl"


    // $ANTLR start "rule__AverageOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2731:1: rule__AverageOperator__Group__5 : rule__AverageOperator__Group__5__Impl ;
    public final void rule__AverageOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2735:1: ( rule__AverageOperator__Group__5__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2736:2: rule__AverageOperator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AverageOperator__Group__5__Impl_in_rule__AverageOperator__Group__55539);
            rule__AverageOperator__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__5"


    // $ANTLR start "rule__AverageOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2742:1: rule__AverageOperator__Group__5__Impl : ( ')' ) ;
    public final void rule__AverageOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2746:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2747:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2747:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2748:1: ')'
            {
             before(grammarAccess.getAverageOperatorAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__AverageOperator__Group__5__Impl5567); 
             after(grammarAccess.getAverageOperatorAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__Group__5__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2773:1: rule__ElementJoinOperator__Group__0 : rule__ElementJoinOperator__Group__0__Impl rule__ElementJoinOperator__Group__1 ;
    public final void rule__ElementJoinOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2777:1: ( rule__ElementJoinOperator__Group__0__Impl rule__ElementJoinOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2778:2: rule__ElementJoinOperator__Group__0__Impl rule__ElementJoinOperator__Group__1
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__0__Impl_in_rule__ElementJoinOperator__Group__05610);
            rule__ElementJoinOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__1_in_rule__ElementJoinOperator__Group__05613);
            rule__ElementJoinOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__0"


    // $ANTLR start "rule__ElementJoinOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2785:1: rule__ElementJoinOperator__Group__0__Impl : ( 'ejoin' ) ;
    public final void rule__ElementJoinOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2789:1: ( ( 'ejoin' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2790:1: ( 'ejoin' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2790:1: ( 'ejoin' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2791:1: 'ejoin'
            {
             before(grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ElementJoinOperator__Group__0__Impl5641); 
             after(grammarAccess.getElementJoinOperatorAccess().getEjoinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__0__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2804:1: rule__ElementJoinOperator__Group__1 : rule__ElementJoinOperator__Group__1__Impl rule__ElementJoinOperator__Group__2 ;
    public final void rule__ElementJoinOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2808:1: ( rule__ElementJoinOperator__Group__1__Impl rule__ElementJoinOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2809:2: rule__ElementJoinOperator__Group__1__Impl rule__ElementJoinOperator__Group__2
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__1__Impl_in_rule__ElementJoinOperator__Group__15672);
            rule__ElementJoinOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__2_in_rule__ElementJoinOperator__Group__15675);
            rule__ElementJoinOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__1"


    // $ANTLR start "rule__ElementJoinOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2816:1: rule__ElementJoinOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__ElementJoinOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2820:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2821:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2821:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2822:1: '('
            {
             before(grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ElementJoinOperator__Group__1__Impl5703); 
             after(grammarAccess.getElementJoinOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__1__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2835:1: rule__ElementJoinOperator__Group__2 : rule__ElementJoinOperator__Group__2__Impl rule__ElementJoinOperator__Group__3 ;
    public final void rule__ElementJoinOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2839:1: ( rule__ElementJoinOperator__Group__2__Impl rule__ElementJoinOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2840:2: rule__ElementJoinOperator__Group__2__Impl rule__ElementJoinOperator__Group__3
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__2__Impl_in_rule__ElementJoinOperator__Group__25734);
            rule__ElementJoinOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__3_in_rule__ElementJoinOperator__Group__25737);
            rule__ElementJoinOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__2"


    // $ANTLR start "rule__ElementJoinOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2847:1: rule__ElementJoinOperator__Group__2__Impl : ( ( rule__ElementJoinOperator__Alternatives_2 ) ) ;
    public final void rule__ElementJoinOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2851:1: ( ( ( rule__ElementJoinOperator__Alternatives_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2852:1: ( ( rule__ElementJoinOperator__Alternatives_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2852:1: ( ( rule__ElementJoinOperator__Alternatives_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2853:1: ( rule__ElementJoinOperator__Alternatives_2 )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getAlternatives_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2854:1: ( rule__ElementJoinOperator__Alternatives_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2854:2: rule__ElementJoinOperator__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Alternatives_2_in_rule__ElementJoinOperator__Group__2__Impl5764);
            rule__ElementJoinOperator__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getElementJoinOperatorAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__2__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2864:1: rule__ElementJoinOperator__Group__3 : rule__ElementJoinOperator__Group__3__Impl rule__ElementJoinOperator__Group__4 ;
    public final void rule__ElementJoinOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2868:1: ( rule__ElementJoinOperator__Group__3__Impl rule__ElementJoinOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2869:2: rule__ElementJoinOperator__Group__3__Impl rule__ElementJoinOperator__Group__4
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__3__Impl_in_rule__ElementJoinOperator__Group__35794);
            rule__ElementJoinOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__4_in_rule__ElementJoinOperator__Group__35797);
            rule__ElementJoinOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__3"


    // $ANTLR start "rule__ElementJoinOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2876:1: rule__ElementJoinOperator__Group__3__Impl : ( ( rule__ElementJoinOperator__Group_3__0 )* ) ;
    public final void rule__ElementJoinOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2880:1: ( ( ( rule__ElementJoinOperator__Group_3__0 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2881:1: ( ( rule__ElementJoinOperator__Group_3__0 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2881:1: ( ( rule__ElementJoinOperator__Group_3__0 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2882:1: ( rule__ElementJoinOperator__Group_3__0 )*
            {
             before(grammarAccess.getElementJoinOperatorAccess().getGroup_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2883:1: ( rule__ElementJoinOperator__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        int LA11_2 = input.LA(3);

                        if ( (LA11_2==25) ) {
                            alt11=1;
                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2883:2: rule__ElementJoinOperator__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementJoinOperator__Group_3__0_in_rule__ElementJoinOperator__Group__3__Impl5824);
            	    rule__ElementJoinOperator__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getElementJoinOperatorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__3__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2893:1: rule__ElementJoinOperator__Group__4 : rule__ElementJoinOperator__Group__4__Impl rule__ElementJoinOperator__Group__5 ;
    public final void rule__ElementJoinOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2897:1: ( rule__ElementJoinOperator__Group__4__Impl rule__ElementJoinOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2898:2: rule__ElementJoinOperator__Group__4__Impl rule__ElementJoinOperator__Group__5
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__4__Impl_in_rule__ElementJoinOperator__Group__45855);
            rule__ElementJoinOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__5_in_rule__ElementJoinOperator__Group__45858);
            rule__ElementJoinOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__4"


    // $ANTLR start "rule__ElementJoinOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2905:1: rule__ElementJoinOperator__Group__4__Impl : ( ( rule__ElementJoinOperator__Group_4__0 )* ) ;
    public final void rule__ElementJoinOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2909:1: ( ( ( rule__ElementJoinOperator__Group_4__0 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2910:1: ( ( rule__ElementJoinOperator__Group_4__0 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2910:1: ( ( rule__ElementJoinOperator__Group_4__0 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2911:1: ( rule__ElementJoinOperator__Group_4__0 )*
            {
             before(grammarAccess.getElementJoinOperatorAccess().getGroup_4()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2912:1: ( rule__ElementJoinOperator__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID) ) {
                        int LA12_2 = input.LA(3);

                        if ( (LA12_2==30) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2912:2: rule__ElementJoinOperator__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ElementJoinOperator__Group_4__0_in_rule__ElementJoinOperator__Group__4__Impl5885);
            	    rule__ElementJoinOperator__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getElementJoinOperatorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__4__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2922:1: rule__ElementJoinOperator__Group__5 : rule__ElementJoinOperator__Group__5__Impl rule__ElementJoinOperator__Group__6 ;
    public final void rule__ElementJoinOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2926:1: ( rule__ElementJoinOperator__Group__5__Impl rule__ElementJoinOperator__Group__6 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2927:2: rule__ElementJoinOperator__Group__5__Impl rule__ElementJoinOperator__Group__6
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__5__Impl_in_rule__ElementJoinOperator__Group__55916);
            rule__ElementJoinOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__6_in_rule__ElementJoinOperator__Group__55919);
            rule__ElementJoinOperator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__5"


    // $ANTLR start "rule__ElementJoinOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2934:1: rule__ElementJoinOperator__Group__5__Impl : ( ',' ) ;
    public final void rule__ElementJoinOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2938:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2939:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2939:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2940:1: ','
            {
             before(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__ElementJoinOperator__Group__5__Impl5947); 
             after(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__5__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__6"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2953:1: rule__ElementJoinOperator__Group__6 : rule__ElementJoinOperator__Group__6__Impl rule__ElementJoinOperator__Group__7 ;
    public final void rule__ElementJoinOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2957:1: ( rule__ElementJoinOperator__Group__6__Impl rule__ElementJoinOperator__Group__7 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2958:2: rule__ElementJoinOperator__Group__6__Impl rule__ElementJoinOperator__Group__7
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__6__Impl_in_rule__ElementJoinOperator__Group__65978);
            rule__ElementJoinOperator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__7_in_rule__ElementJoinOperator__Group__65981);
            rule__ElementJoinOperator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__6"


    // $ANTLR start "rule__ElementJoinOperator__Group__6__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2965:1: rule__ElementJoinOperator__Group__6__Impl : ( ( rule__ElementJoinOperator__ParameterAssignment_6 ) ) ;
    public final void rule__ElementJoinOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2969:1: ( ( ( rule__ElementJoinOperator__ParameterAssignment_6 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2970:1: ( ( rule__ElementJoinOperator__ParameterAssignment_6 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2970:1: ( ( rule__ElementJoinOperator__ParameterAssignment_6 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2971:1: ( rule__ElementJoinOperator__ParameterAssignment_6 )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getParameterAssignment_6()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2972:1: ( rule__ElementJoinOperator__ParameterAssignment_6 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2972:2: rule__ElementJoinOperator__ParameterAssignment_6
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__ParameterAssignment_6_in_rule__ElementJoinOperator__Group__6__Impl6008);
            rule__ElementJoinOperator__ParameterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getElementJoinOperatorAccess().getParameterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__6__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group__7"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2982:1: rule__ElementJoinOperator__Group__7 : rule__ElementJoinOperator__Group__7__Impl ;
    public final void rule__ElementJoinOperator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2986:1: ( rule__ElementJoinOperator__Group__7__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2987:2: rule__ElementJoinOperator__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group__7__Impl_in_rule__ElementJoinOperator__Group__76038);
            rule__ElementJoinOperator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__7"


    // $ANTLR start "rule__ElementJoinOperator__Group__7__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2993:1: rule__ElementJoinOperator__Group__7__Impl : ( ')' ) ;
    public final void rule__ElementJoinOperator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2997:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2998:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2998:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:2999:1: ')'
            {
             before(grammarAccess.getElementJoinOperatorAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_31_in_rule__ElementJoinOperator__Group__7__Impl6066); 
             after(grammarAccess.getElementJoinOperatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group__7__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group_3__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3028:1: rule__ElementJoinOperator__Group_3__0 : rule__ElementJoinOperator__Group_3__0__Impl rule__ElementJoinOperator__Group_3__1 ;
    public final void rule__ElementJoinOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3032:1: ( rule__ElementJoinOperator__Group_3__0__Impl rule__ElementJoinOperator__Group_3__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3033:2: rule__ElementJoinOperator__Group_3__0__Impl rule__ElementJoinOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_3__0__Impl_in_rule__ElementJoinOperator__Group_3__06113);
            rule__ElementJoinOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_3__1_in_rule__ElementJoinOperator__Group_3__06116);
            rule__ElementJoinOperator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_3__0"


    // $ANTLR start "rule__ElementJoinOperator__Group_3__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3040:1: rule__ElementJoinOperator__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ElementJoinOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3044:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3045:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3045:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3046:1: ','
            {
             before(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementJoinOperator__Group_3__0__Impl6144); 
             after(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_3__0__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group_3__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3059:1: rule__ElementJoinOperator__Group_3__1 : rule__ElementJoinOperator__Group_3__1__Impl ;
    public final void rule__ElementJoinOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3063:1: ( rule__ElementJoinOperator__Group_3__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3064:2: rule__ElementJoinOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_3__1__Impl_in_rule__ElementJoinOperator__Group_3__16175);
            rule__ElementJoinOperator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_3__1"


    // $ANTLR start "rule__ElementJoinOperator__Group_3__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3070:1: rule__ElementJoinOperator__Group_3__1__Impl : ( ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 ) ) ;
    public final void rule__ElementJoinOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3074:1: ( ( ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3075:1: ( ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3075:1: ( ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3076:1: ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_3_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3077:1: ( rule__ElementJoinOperator__ElementParametersAssignment_3_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3077:2: rule__ElementJoinOperator__ElementParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__ElementParametersAssignment_3_1_in_rule__ElementJoinOperator__Group_3__1__Impl6202);
            rule__ElementJoinOperator__ElementParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementJoinOperatorAccess().getElementParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_3__1__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group_4__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3091:1: rule__ElementJoinOperator__Group_4__0 : rule__ElementJoinOperator__Group_4__0__Impl rule__ElementJoinOperator__Group_4__1 ;
    public final void rule__ElementJoinOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3095:1: ( rule__ElementJoinOperator__Group_4__0__Impl rule__ElementJoinOperator__Group_4__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3096:2: rule__ElementJoinOperator__Group_4__0__Impl rule__ElementJoinOperator__Group_4__1
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_4__0__Impl_in_rule__ElementJoinOperator__Group_4__06236);
            rule__ElementJoinOperator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_4__1_in_rule__ElementJoinOperator__Group_4__06239);
            rule__ElementJoinOperator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_4__0"


    // $ANTLR start "rule__ElementJoinOperator__Group_4__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3103:1: rule__ElementJoinOperator__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ElementJoinOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3107:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3108:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3108:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3109:1: ','
            {
             before(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__ElementJoinOperator__Group_4__0__Impl6267); 
             after(grammarAccess.getElementJoinOperatorAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_4__0__Impl"


    // $ANTLR start "rule__ElementJoinOperator__Group_4__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3122:1: rule__ElementJoinOperator__Group_4__1 : rule__ElementJoinOperator__Group_4__1__Impl ;
    public final void rule__ElementJoinOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3126:1: ( rule__ElementJoinOperator__Group_4__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3127:2: rule__ElementJoinOperator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__Group_4__1__Impl_in_rule__ElementJoinOperator__Group_4__16298);
            rule__ElementJoinOperator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_4__1"


    // $ANTLR start "rule__ElementJoinOperator__Group_4__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3133:1: rule__ElementJoinOperator__Group_4__1__Impl : ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 ) ) ;
    public final void rule__ElementJoinOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3137:1: ( ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3138:1: ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3138:1: ( ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3139:1: ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_4_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3140:1: ( rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3140:2: rule__ElementJoinOperator__VariableElementParametersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ElementJoinOperator__VariableElementParametersAssignment_4_1_in_rule__ElementJoinOperator__Group_4__1__Impl6325);
            rule__ElementJoinOperator__VariableElementParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__Group_4__1__Impl"


    // $ANTLR start "rule__TagOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3154:1: rule__TagOperator__Group__0 : rule__TagOperator__Group__0__Impl rule__TagOperator__Group__1 ;
    public final void rule__TagOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3158:1: ( rule__TagOperator__Group__0__Impl rule__TagOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3159:2: rule__TagOperator__Group__0__Impl rule__TagOperator__Group__1
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__0__Impl_in_rule__TagOperator__Group__06359);
            rule__TagOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__1_in_rule__TagOperator__Group__06362);
            rule__TagOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__0"


    // $ANTLR start "rule__TagOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3166:1: rule__TagOperator__Group__0__Impl : ( 'tag' ) ;
    public final void rule__TagOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3170:1: ( ( 'tag' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3171:1: ( 'tag' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3171:1: ( 'tag' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3172:1: 'tag'
            {
             before(grammarAccess.getTagOperatorAccess().getTagKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__TagOperator__Group__0__Impl6390); 
             after(grammarAccess.getTagOperatorAccess().getTagKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__0__Impl"


    // $ANTLR start "rule__TagOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3185:1: rule__TagOperator__Group__1 : rule__TagOperator__Group__1__Impl rule__TagOperator__Group__2 ;
    public final void rule__TagOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3189:1: ( rule__TagOperator__Group__1__Impl rule__TagOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3190:2: rule__TagOperator__Group__1__Impl rule__TagOperator__Group__2
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__1__Impl_in_rule__TagOperator__Group__16421);
            rule__TagOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__2_in_rule__TagOperator__Group__16424);
            rule__TagOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__1"


    // $ANTLR start "rule__TagOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3197:1: rule__TagOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__TagOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3201:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3202:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3202:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3203:1: '('
            {
             before(grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__TagOperator__Group__1__Impl6452); 
             after(grammarAccess.getTagOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__1__Impl"


    // $ANTLR start "rule__TagOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3216:1: rule__TagOperator__Group__2 : rule__TagOperator__Group__2__Impl rule__TagOperator__Group__3 ;
    public final void rule__TagOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3220:1: ( rule__TagOperator__Group__2__Impl rule__TagOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3221:2: rule__TagOperator__Group__2__Impl rule__TagOperator__Group__3
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__2__Impl_in_rule__TagOperator__Group__26483);
            rule__TagOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__3_in_rule__TagOperator__Group__26486);
            rule__TagOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__2"


    // $ANTLR start "rule__TagOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3228:1: rule__TagOperator__Group__2__Impl : ( ( rule__TagOperator__ParametersAssignment_2 ) ) ;
    public final void rule__TagOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3232:1: ( ( ( rule__TagOperator__ParametersAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3233:1: ( ( rule__TagOperator__ParametersAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3233:1: ( ( rule__TagOperator__ParametersAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3234:1: ( rule__TagOperator__ParametersAssignment_2 )
            {
             before(grammarAccess.getTagOperatorAccess().getParametersAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3235:1: ( rule__TagOperator__ParametersAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3235:2: rule__TagOperator__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__TagOperator__ParametersAssignment_2_in_rule__TagOperator__Group__2__Impl6513);
            rule__TagOperator__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTagOperatorAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__2__Impl"


    // $ANTLR start "rule__TagOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3245:1: rule__TagOperator__Group__3 : rule__TagOperator__Group__3__Impl rule__TagOperator__Group__4 ;
    public final void rule__TagOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3249:1: ( rule__TagOperator__Group__3__Impl rule__TagOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3250:2: rule__TagOperator__Group__3__Impl rule__TagOperator__Group__4
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__3__Impl_in_rule__TagOperator__Group__36543);
            rule__TagOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__4_in_rule__TagOperator__Group__36546);
            rule__TagOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__3"


    // $ANTLR start "rule__TagOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3257:1: rule__TagOperator__Group__3__Impl : ( ( rule__TagOperator__Group_3__0 )* ) ;
    public final void rule__TagOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3261:1: ( ( ( rule__TagOperator__Group_3__0 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3262:1: ( ( rule__TagOperator__Group_3__0 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3262:1: ( ( rule__TagOperator__Group_3__0 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3263:1: ( rule__TagOperator__Group_3__0 )*
            {
             before(grammarAccess.getTagOperatorAccess().getGroup_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3264:1: ( rule__TagOperator__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        int LA13_2 = input.LA(3);

                        if ( (LA13_2==25) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3264:2: rule__TagOperator__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TagOperator__Group_3__0_in_rule__TagOperator__Group__3__Impl6573);
            	    rule__TagOperator__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTagOperatorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__3__Impl"


    // $ANTLR start "rule__TagOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3274:1: rule__TagOperator__Group__4 : rule__TagOperator__Group__4__Impl rule__TagOperator__Group__5 ;
    public final void rule__TagOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3278:1: ( rule__TagOperator__Group__4__Impl rule__TagOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3279:2: rule__TagOperator__Group__4__Impl rule__TagOperator__Group__5
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__4__Impl_in_rule__TagOperator__Group__46604);
            rule__TagOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__5_in_rule__TagOperator__Group__46607);
            rule__TagOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__4"


    // $ANTLR start "rule__TagOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3286:1: rule__TagOperator__Group__4__Impl : ( ',' ) ;
    public final void rule__TagOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3290:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3291:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3291:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3292:1: ','
            {
             before(grammarAccess.getTagOperatorAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__TagOperator__Group__4__Impl6635); 
             after(grammarAccess.getTagOperatorAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__4__Impl"


    // $ANTLR start "rule__TagOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3305:1: rule__TagOperator__Group__5 : rule__TagOperator__Group__5__Impl rule__TagOperator__Group__6 ;
    public final void rule__TagOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3309:1: ( rule__TagOperator__Group__5__Impl rule__TagOperator__Group__6 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3310:2: rule__TagOperator__Group__5__Impl rule__TagOperator__Group__6
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__5__Impl_in_rule__TagOperator__Group__56666);
            rule__TagOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group__6_in_rule__TagOperator__Group__56669);
            rule__TagOperator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__5"


    // $ANTLR start "rule__TagOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3317:1: rule__TagOperator__Group__5__Impl : ( ( rule__TagOperator__StreamAssignment_5 ) ) ;
    public final void rule__TagOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3321:1: ( ( ( rule__TagOperator__StreamAssignment_5 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3322:1: ( ( rule__TagOperator__StreamAssignment_5 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3322:1: ( ( rule__TagOperator__StreamAssignment_5 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3323:1: ( rule__TagOperator__StreamAssignment_5 )
            {
             before(grammarAccess.getTagOperatorAccess().getStreamAssignment_5()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3324:1: ( rule__TagOperator__StreamAssignment_5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3324:2: rule__TagOperator__StreamAssignment_5
            {
            pushFollow(FOLLOW_rule__TagOperator__StreamAssignment_5_in_rule__TagOperator__Group__5__Impl6696);
            rule__TagOperator__StreamAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTagOperatorAccess().getStreamAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__5__Impl"


    // $ANTLR start "rule__TagOperator__Group__6"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3334:1: rule__TagOperator__Group__6 : rule__TagOperator__Group__6__Impl ;
    public final void rule__TagOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3338:1: ( rule__TagOperator__Group__6__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3339:2: rule__TagOperator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TagOperator__Group__6__Impl_in_rule__TagOperator__Group__66726);
            rule__TagOperator__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__6"


    // $ANTLR start "rule__TagOperator__Group__6__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3345:1: rule__TagOperator__Group__6__Impl : ( ')' ) ;
    public final void rule__TagOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3349:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3350:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3350:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3351:1: ')'
            {
             before(grammarAccess.getTagOperatorAccess().getRightParenthesisKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__TagOperator__Group__6__Impl6754); 
             after(grammarAccess.getTagOperatorAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group__6__Impl"


    // $ANTLR start "rule__TagOperator__Group_3__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3378:1: rule__TagOperator__Group_3__0 : rule__TagOperator__Group_3__0__Impl rule__TagOperator__Group_3__1 ;
    public final void rule__TagOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3382:1: ( rule__TagOperator__Group_3__0__Impl rule__TagOperator__Group_3__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3383:2: rule__TagOperator__Group_3__0__Impl rule__TagOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__TagOperator__Group_3__0__Impl_in_rule__TagOperator__Group_3__06799);
            rule__TagOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagOperator__Group_3__1_in_rule__TagOperator__Group_3__06802);
            rule__TagOperator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group_3__0"


    // $ANTLR start "rule__TagOperator__Group_3__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3390:1: rule__TagOperator__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TagOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3394:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3395:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3395:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3396:1: ','
            {
             before(grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__TagOperator__Group_3__0__Impl6830); 
             after(grammarAccess.getTagOperatorAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group_3__0__Impl"


    // $ANTLR start "rule__TagOperator__Group_3__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3409:1: rule__TagOperator__Group_3__1 : rule__TagOperator__Group_3__1__Impl ;
    public final void rule__TagOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3413:1: ( rule__TagOperator__Group_3__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3414:2: rule__TagOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TagOperator__Group_3__1__Impl_in_rule__TagOperator__Group_3__16861);
            rule__TagOperator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group_3__1"


    // $ANTLR start "rule__TagOperator__Group_3__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3420:1: rule__TagOperator__Group_3__1__Impl : ( ( rule__TagOperator__ParametersAssignment_3_1 ) ) ;
    public final void rule__TagOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3424:1: ( ( ( rule__TagOperator__ParametersAssignment_3_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3425:1: ( ( rule__TagOperator__ParametersAssignment_3_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3425:1: ( ( rule__TagOperator__ParametersAssignment_3_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3426:1: ( rule__TagOperator__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getTagOperatorAccess().getParametersAssignment_3_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3427:1: ( rule__TagOperator__ParametersAssignment_3_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3427:2: rule__TagOperator__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TagOperator__ParametersAssignment_3_1_in_rule__TagOperator__Group_3__1__Impl6888);
            rule__TagOperator__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTagOperatorAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__Group_3__1__Impl"


    // $ANTLR start "rule__TagClassElement__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3441:1: rule__TagClassElement__Group__0 : rule__TagClassElement__Group__0__Impl rule__TagClassElement__Group__1 ;
    public final void rule__TagClassElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3445:1: ( rule__TagClassElement__Group__0__Impl rule__TagClassElement__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3446:2: rule__TagClassElement__Group__0__Impl rule__TagClassElement__Group__1
            {
            pushFollow(FOLLOW_rule__TagClassElement__Group__0__Impl_in_rule__TagClassElement__Group__06922);
            rule__TagClassElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagClassElement__Group__1_in_rule__TagClassElement__Group__06925);
            rule__TagClassElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__0"


    // $ANTLR start "rule__TagClassElement__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3453:1: rule__TagClassElement__Group__0__Impl : ( ( rule__TagClassElement__ReferenceAssignment_0 ) ) ;
    public final void rule__TagClassElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3457:1: ( ( ( rule__TagClassElement__ReferenceAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3458:1: ( ( rule__TagClassElement__ReferenceAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3458:1: ( ( rule__TagClassElement__ReferenceAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3459:1: ( rule__TagClassElement__ReferenceAssignment_0 )
            {
             before(grammarAccess.getTagClassElementAccess().getReferenceAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3460:1: ( rule__TagClassElement__ReferenceAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3460:2: rule__TagClassElement__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__TagClassElement__ReferenceAssignment_0_in_rule__TagClassElement__Group__0__Impl6952);
            rule__TagClassElement__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagClassElementAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__0__Impl"


    // $ANTLR start "rule__TagClassElement__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3470:1: rule__TagClassElement__Group__1 : rule__TagClassElement__Group__1__Impl rule__TagClassElement__Group__2 ;
    public final void rule__TagClassElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3474:1: ( rule__TagClassElement__Group__1__Impl rule__TagClassElement__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3475:2: rule__TagClassElement__Group__1__Impl rule__TagClassElement__Group__2
            {
            pushFollow(FOLLOW_rule__TagClassElement__Group__1__Impl_in_rule__TagClassElement__Group__16982);
            rule__TagClassElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagClassElement__Group__2_in_rule__TagClassElement__Group__16985);
            rule__TagClassElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__1"


    // $ANTLR start "rule__TagClassElement__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3482:1: rule__TagClassElement__Group__1__Impl : ( 'is' ) ;
    public final void rule__TagClassElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3486:1: ( ( 'is' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3487:1: ( 'is' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3487:1: ( 'is' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3488:1: 'is'
            {
             before(grammarAccess.getTagClassElementAccess().getIsKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__TagClassElement__Group__1__Impl7013); 
             after(grammarAccess.getTagClassElementAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__1__Impl"


    // $ANTLR start "rule__TagClassElement__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3501:1: rule__TagClassElement__Group__2 : rule__TagClassElement__Group__2__Impl rule__TagClassElement__Group__3 ;
    public final void rule__TagClassElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3505:1: ( rule__TagClassElement__Group__2__Impl rule__TagClassElement__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3506:2: rule__TagClassElement__Group__2__Impl rule__TagClassElement__Group__3
            {
            pushFollow(FOLLOW_rule__TagClassElement__Group__2__Impl_in_rule__TagClassElement__Group__27044);
            rule__TagClassElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagClassElement__Group__3_in_rule__TagClassElement__Group__27047);
            rule__TagClassElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__2"


    // $ANTLR start "rule__TagClassElement__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3513:1: rule__TagClassElement__Group__2__Impl : ( 'class' ) ;
    public final void rule__TagClassElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3517:1: ( ( 'class' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3518:1: ( 'class' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3518:1: ( 'class' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3519:1: 'class'
            {
             before(grammarAccess.getTagClassElementAccess().getClassKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__TagClassElement__Group__2__Impl7075); 
             after(grammarAccess.getTagClassElementAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__2__Impl"


    // $ANTLR start "rule__TagClassElement__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3532:1: rule__TagClassElement__Group__3 : rule__TagClassElement__Group__3__Impl ;
    public final void rule__TagClassElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3536:1: ( rule__TagClassElement__Group__3__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3537:2: rule__TagClassElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TagClassElement__Group__3__Impl_in_rule__TagClassElement__Group__37106);
            rule__TagClassElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__3"


    // $ANTLR start "rule__TagClassElement__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3543:1: rule__TagClassElement__Group__3__Impl : ( ( rule__TagClassElement__ElementAssignment_3 ) ) ;
    public final void rule__TagClassElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3547:1: ( ( ( rule__TagClassElement__ElementAssignment_3 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3548:1: ( ( rule__TagClassElement__ElementAssignment_3 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3548:1: ( ( rule__TagClassElement__ElementAssignment_3 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3549:1: ( rule__TagClassElement__ElementAssignment_3 )
            {
             before(grammarAccess.getTagClassElementAccess().getElementAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3550:1: ( rule__TagClassElement__ElementAssignment_3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3550:2: rule__TagClassElement__ElementAssignment_3
            {
            pushFollow(FOLLOW_rule__TagClassElement__ElementAssignment_3_in_rule__TagClassElement__Group__3__Impl7133);
            rule__TagClassElement__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTagClassElementAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__Group__3__Impl"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3568:1: rule__TagObjectPropertyElement__Group__0 : rule__TagObjectPropertyElement__Group__0__Impl rule__TagObjectPropertyElement__Group__1 ;
    public final void rule__TagObjectPropertyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3572:1: ( rule__TagObjectPropertyElement__Group__0__Impl rule__TagObjectPropertyElement__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3573:2: rule__TagObjectPropertyElement__Group__0__Impl rule__TagObjectPropertyElement__Group__1
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__0__Impl_in_rule__TagObjectPropertyElement__Group__07171);
            rule__TagObjectPropertyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__1_in_rule__TagObjectPropertyElement__Group__07174);
            rule__TagObjectPropertyElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__0"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3580:1: rule__TagObjectPropertyElement__Group__0__Impl : ( ( rule__TagObjectPropertyElement__ReferenceAssignment_0 ) ) ;
    public final void rule__TagObjectPropertyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3584:1: ( ( ( rule__TagObjectPropertyElement__ReferenceAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3585:1: ( ( rule__TagObjectPropertyElement__ReferenceAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3585:1: ( ( rule__TagObjectPropertyElement__ReferenceAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3586:1: ( rule__TagObjectPropertyElement__ReferenceAssignment_0 )
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getReferenceAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3587:1: ( rule__TagObjectPropertyElement__ReferenceAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3587:2: rule__TagObjectPropertyElement__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__ReferenceAssignment_0_in_rule__TagObjectPropertyElement__Group__0__Impl7201);
            rule__TagObjectPropertyElement__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagObjectPropertyElementAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__0__Impl"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3597:1: rule__TagObjectPropertyElement__Group__1 : rule__TagObjectPropertyElement__Group__1__Impl rule__TagObjectPropertyElement__Group__2 ;
    public final void rule__TagObjectPropertyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3601:1: ( rule__TagObjectPropertyElement__Group__1__Impl rule__TagObjectPropertyElement__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3602:2: rule__TagObjectPropertyElement__Group__1__Impl rule__TagObjectPropertyElement__Group__2
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__1__Impl_in_rule__TagObjectPropertyElement__Group__17231);
            rule__TagObjectPropertyElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__2_in_rule__TagObjectPropertyElement__Group__17234);
            rule__TagObjectPropertyElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__1"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3609:1: rule__TagObjectPropertyElement__Group__1__Impl : ( 'is' ) ;
    public final void rule__TagObjectPropertyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3613:1: ( ( 'is' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3614:1: ( 'is' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3614:1: ( 'is' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3615:1: 'is'
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__TagObjectPropertyElement__Group__1__Impl7262); 
             after(grammarAccess.getTagObjectPropertyElementAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__1__Impl"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3628:1: rule__TagObjectPropertyElement__Group__2 : rule__TagObjectPropertyElement__Group__2__Impl rule__TagObjectPropertyElement__Group__3 ;
    public final void rule__TagObjectPropertyElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3632:1: ( rule__TagObjectPropertyElement__Group__2__Impl rule__TagObjectPropertyElement__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3633:2: rule__TagObjectPropertyElement__Group__2__Impl rule__TagObjectPropertyElement__Group__3
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__2__Impl_in_rule__TagObjectPropertyElement__Group__27293);
            rule__TagObjectPropertyElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__3_in_rule__TagObjectPropertyElement__Group__27296);
            rule__TagObjectPropertyElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__2"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3640:1: rule__TagObjectPropertyElement__Group__2__Impl : ( 'objectproperty' ) ;
    public final void rule__TagObjectPropertyElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3644:1: ( ( 'objectproperty' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3645:1: ( 'objectproperty' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3645:1: ( 'objectproperty' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3646:1: 'objectproperty'
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__TagObjectPropertyElement__Group__2__Impl7324); 
             after(grammarAccess.getTagObjectPropertyElementAccess().getObjectpropertyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__2__Impl"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3659:1: rule__TagObjectPropertyElement__Group__3 : rule__TagObjectPropertyElement__Group__3__Impl ;
    public final void rule__TagObjectPropertyElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3663:1: ( rule__TagObjectPropertyElement__Group__3__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3664:2: rule__TagObjectPropertyElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__Group__3__Impl_in_rule__TagObjectPropertyElement__Group__37355);
            rule__TagObjectPropertyElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__3"


    // $ANTLR start "rule__TagObjectPropertyElement__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3670:1: rule__TagObjectPropertyElement__Group__3__Impl : ( ( rule__TagObjectPropertyElement__ElementAssignment_3 ) ) ;
    public final void rule__TagObjectPropertyElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3674:1: ( ( ( rule__TagObjectPropertyElement__ElementAssignment_3 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3675:1: ( ( rule__TagObjectPropertyElement__ElementAssignment_3 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3675:1: ( ( rule__TagObjectPropertyElement__ElementAssignment_3 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3676:1: ( rule__TagObjectPropertyElement__ElementAssignment_3 )
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getElementAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3677:1: ( rule__TagObjectPropertyElement__ElementAssignment_3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3677:2: rule__TagObjectPropertyElement__ElementAssignment_3
            {
            pushFollow(FOLLOW_rule__TagObjectPropertyElement__ElementAssignment_3_in_rule__TagObjectPropertyElement__Group__3__Impl7382);
            rule__TagObjectPropertyElement__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTagObjectPropertyElementAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__Group__3__Impl"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3695:1: rule__TagDataTypePropertyElement__Group__0 : rule__TagDataTypePropertyElement__Group__0__Impl rule__TagDataTypePropertyElement__Group__1 ;
    public final void rule__TagDataTypePropertyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3699:1: ( rule__TagDataTypePropertyElement__Group__0__Impl rule__TagDataTypePropertyElement__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3700:2: rule__TagDataTypePropertyElement__Group__0__Impl rule__TagDataTypePropertyElement__Group__1
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__0__Impl_in_rule__TagDataTypePropertyElement__Group__07420);
            rule__TagDataTypePropertyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__1_in_rule__TagDataTypePropertyElement__Group__07423);
            rule__TagDataTypePropertyElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__0"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3707:1: rule__TagDataTypePropertyElement__Group__0__Impl : ( ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 ) ) ;
    public final void rule__TagDataTypePropertyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3711:1: ( ( ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3712:1: ( ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3712:1: ( ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3713:1: ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 )
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3714:1: ( rule__TagDataTypePropertyElement__ReferenceAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3714:2: rule__TagDataTypePropertyElement__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__ReferenceAssignment_0_in_rule__TagDataTypePropertyElement__Group__0__Impl7450);
            rule__TagDataTypePropertyElement__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__0__Impl"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3724:1: rule__TagDataTypePropertyElement__Group__1 : rule__TagDataTypePropertyElement__Group__1__Impl rule__TagDataTypePropertyElement__Group__2 ;
    public final void rule__TagDataTypePropertyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3728:1: ( rule__TagDataTypePropertyElement__Group__1__Impl rule__TagDataTypePropertyElement__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3729:2: rule__TagDataTypePropertyElement__Group__1__Impl rule__TagDataTypePropertyElement__Group__2
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__1__Impl_in_rule__TagDataTypePropertyElement__Group__17480);
            rule__TagDataTypePropertyElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__2_in_rule__TagDataTypePropertyElement__Group__17483);
            rule__TagDataTypePropertyElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__1"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3736:1: rule__TagDataTypePropertyElement__Group__1__Impl : ( 'is' ) ;
    public final void rule__TagDataTypePropertyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3740:1: ( ( 'is' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3741:1: ( 'is' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3741:1: ( 'is' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3742:1: 'is'
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__TagDataTypePropertyElement__Group__1__Impl7511); 
             after(grammarAccess.getTagDataTypePropertyElementAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__1__Impl"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3755:1: rule__TagDataTypePropertyElement__Group__2 : rule__TagDataTypePropertyElement__Group__2__Impl rule__TagDataTypePropertyElement__Group__3 ;
    public final void rule__TagDataTypePropertyElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3759:1: ( rule__TagDataTypePropertyElement__Group__2__Impl rule__TagDataTypePropertyElement__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3760:2: rule__TagDataTypePropertyElement__Group__2__Impl rule__TagDataTypePropertyElement__Group__3
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__2__Impl_in_rule__TagDataTypePropertyElement__Group__27542);
            rule__TagDataTypePropertyElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__3_in_rule__TagDataTypePropertyElement__Group__27545);
            rule__TagDataTypePropertyElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__2"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3767:1: rule__TagDataTypePropertyElement__Group__2__Impl : ( 'datatype' ) ;
    public final void rule__TagDataTypePropertyElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3771:1: ( ( 'datatype' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3772:1: ( 'datatype' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3772:1: ( 'datatype' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3773:1: 'datatype'
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__TagDataTypePropertyElement__Group__2__Impl7573); 
             after(grammarAccess.getTagDataTypePropertyElementAccess().getDatatypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__2__Impl"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3786:1: rule__TagDataTypePropertyElement__Group__3 : rule__TagDataTypePropertyElement__Group__3__Impl ;
    public final void rule__TagDataTypePropertyElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3790:1: ( rule__TagDataTypePropertyElement__Group__3__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3791:2: rule__TagDataTypePropertyElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__Group__3__Impl_in_rule__TagDataTypePropertyElement__Group__37604);
            rule__TagDataTypePropertyElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__3"


    // $ANTLR start "rule__TagDataTypePropertyElement__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3797:1: rule__TagDataTypePropertyElement__Group__3__Impl : ( ( rule__TagDataTypePropertyElement__ElementAssignment_3 ) ) ;
    public final void rule__TagDataTypePropertyElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3801:1: ( ( ( rule__TagDataTypePropertyElement__ElementAssignment_3 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3802:1: ( ( rule__TagDataTypePropertyElement__ElementAssignment_3 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3802:1: ( ( rule__TagDataTypePropertyElement__ElementAssignment_3 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3803:1: ( rule__TagDataTypePropertyElement__ElementAssignment_3 )
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getElementAssignment_3()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3804:1: ( rule__TagDataTypePropertyElement__ElementAssignment_3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3804:2: rule__TagDataTypePropertyElement__ElementAssignment_3
            {
            pushFollow(FOLLOW_rule__TagDataTypePropertyElement__ElementAssignment_3_in_rule__TagDataTypePropertyElement__Group__3__Impl7631);
            rule__TagDataTypePropertyElement__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTagDataTypePropertyElementAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__Group__3__Impl"


    // $ANTLR start "rule__OutputOperator__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3822:1: rule__OutputOperator__Group__0 : rule__OutputOperator__Group__0__Impl rule__OutputOperator__Group__1 ;
    public final void rule__OutputOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3826:1: ( rule__OutputOperator__Group__0__Impl rule__OutputOperator__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3827:2: rule__OutputOperator__Group__0__Impl rule__OutputOperator__Group__1
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__0__Impl_in_rule__OutputOperator__Group__07669);
            rule__OutputOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__1_in_rule__OutputOperator__Group__07672);
            rule__OutputOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__0"


    // $ANTLR start "rule__OutputOperator__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3834:1: rule__OutputOperator__Group__0__Impl : ( 'out' ) ;
    public final void rule__OutputOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3838:1: ( ( 'out' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3839:1: ( 'out' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3839:1: ( 'out' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3840:1: 'out'
            {
             before(grammarAccess.getOutputOperatorAccess().getOutKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__OutputOperator__Group__0__Impl7700); 
             after(grammarAccess.getOutputOperatorAccess().getOutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__0__Impl"


    // $ANTLR start "rule__OutputOperator__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3853:1: rule__OutputOperator__Group__1 : rule__OutputOperator__Group__1__Impl rule__OutputOperator__Group__2 ;
    public final void rule__OutputOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3857:1: ( rule__OutputOperator__Group__1__Impl rule__OutputOperator__Group__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3858:2: rule__OutputOperator__Group__1__Impl rule__OutputOperator__Group__2
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__1__Impl_in_rule__OutputOperator__Group__17731);
            rule__OutputOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__2_in_rule__OutputOperator__Group__17734);
            rule__OutputOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__1"


    // $ANTLR start "rule__OutputOperator__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3865:1: rule__OutputOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__OutputOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3869:1: ( ( '(' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3870:1: ( '(' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3870:1: ( '(' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3871:1: '('
            {
             before(grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__OutputOperator__Group__1__Impl7762); 
             after(grammarAccess.getOutputOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__1__Impl"


    // $ANTLR start "rule__OutputOperator__Group__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3884:1: rule__OutputOperator__Group__2 : rule__OutputOperator__Group__2__Impl rule__OutputOperator__Group__3 ;
    public final void rule__OutputOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3888:1: ( rule__OutputOperator__Group__2__Impl rule__OutputOperator__Group__3 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3889:2: rule__OutputOperator__Group__2__Impl rule__OutputOperator__Group__3
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__2__Impl_in_rule__OutputOperator__Group__27793);
            rule__OutputOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__3_in_rule__OutputOperator__Group__27796);
            rule__OutputOperator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__2"


    // $ANTLR start "rule__OutputOperator__Group__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3896:1: rule__OutputOperator__Group__2__Impl : ( ( rule__OutputOperator__ParameterAssignment_2 ) ) ;
    public final void rule__OutputOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3900:1: ( ( ( rule__OutputOperator__ParameterAssignment_2 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3901:1: ( ( rule__OutputOperator__ParameterAssignment_2 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3901:1: ( ( rule__OutputOperator__ParameterAssignment_2 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3902:1: ( rule__OutputOperator__ParameterAssignment_2 )
            {
             before(grammarAccess.getOutputOperatorAccess().getParameterAssignment_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3903:1: ( rule__OutputOperator__ParameterAssignment_2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3903:2: rule__OutputOperator__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__OutputOperator__ParameterAssignment_2_in_rule__OutputOperator__Group__2__Impl7823);
            rule__OutputOperator__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__2__Impl"


    // $ANTLR start "rule__OutputOperator__Group__3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3913:1: rule__OutputOperator__Group__3 : rule__OutputOperator__Group__3__Impl rule__OutputOperator__Group__4 ;
    public final void rule__OutputOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3917:1: ( rule__OutputOperator__Group__3__Impl rule__OutputOperator__Group__4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3918:2: rule__OutputOperator__Group__3__Impl rule__OutputOperator__Group__4
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__3__Impl_in_rule__OutputOperator__Group__37853);
            rule__OutputOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__4_in_rule__OutputOperator__Group__37856);
            rule__OutputOperator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__3"


    // $ANTLR start "rule__OutputOperator__Group__3__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3925:1: rule__OutputOperator__Group__3__Impl : ( ',' ) ;
    public final void rule__OutputOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3929:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3930:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3930:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3931:1: ','
            {
             before(grammarAccess.getOutputOperatorAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__OutputOperator__Group__3__Impl7884); 
             after(grammarAccess.getOutputOperatorAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__3__Impl"


    // $ANTLR start "rule__OutputOperator__Group__4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3944:1: rule__OutputOperator__Group__4 : rule__OutputOperator__Group__4__Impl rule__OutputOperator__Group__5 ;
    public final void rule__OutputOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3948:1: ( rule__OutputOperator__Group__4__Impl rule__OutputOperator__Group__5 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3949:2: rule__OutputOperator__Group__4__Impl rule__OutputOperator__Group__5
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__4__Impl_in_rule__OutputOperator__Group__47915);
            rule__OutputOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__5_in_rule__OutputOperator__Group__47918);
            rule__OutputOperator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__4"


    // $ANTLR start "rule__OutputOperator__Group__4__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3956:1: rule__OutputOperator__Group__4__Impl : ( ( rule__OutputOperator__LocationAssignment_4 ) ) ;
    public final void rule__OutputOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3960:1: ( ( ( rule__OutputOperator__LocationAssignment_4 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3961:1: ( ( rule__OutputOperator__LocationAssignment_4 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3961:1: ( ( rule__OutputOperator__LocationAssignment_4 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3962:1: ( rule__OutputOperator__LocationAssignment_4 )
            {
             before(grammarAccess.getOutputOperatorAccess().getLocationAssignment_4()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3963:1: ( rule__OutputOperator__LocationAssignment_4 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3963:2: rule__OutputOperator__LocationAssignment_4
            {
            pushFollow(FOLLOW_rule__OutputOperator__LocationAssignment_4_in_rule__OutputOperator__Group__4__Impl7945);
            rule__OutputOperator__LocationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorAccess().getLocationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__4__Impl"


    // $ANTLR start "rule__OutputOperator__Group__5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3973:1: rule__OutputOperator__Group__5 : rule__OutputOperator__Group__5__Impl rule__OutputOperator__Group__6 ;
    public final void rule__OutputOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3977:1: ( rule__OutputOperator__Group__5__Impl rule__OutputOperator__Group__6 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3978:2: rule__OutputOperator__Group__5__Impl rule__OutputOperator__Group__6
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__5__Impl_in_rule__OutputOperator__Group__57975);
            rule__OutputOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__6_in_rule__OutputOperator__Group__57978);
            rule__OutputOperator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__5"


    // $ANTLR start "rule__OutputOperator__Group__5__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3985:1: rule__OutputOperator__Group__5__Impl : ( ',' ) ;
    public final void rule__OutputOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3989:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3990:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3990:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:3991:1: ','
            {
             before(grammarAccess.getOutputOperatorAccess().getCommaKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__OutputOperator__Group__5__Impl8006); 
             after(grammarAccess.getOutputOperatorAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__5__Impl"


    // $ANTLR start "rule__OutputOperator__Group__6"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4004:1: rule__OutputOperator__Group__6 : rule__OutputOperator__Group__6__Impl rule__OutputOperator__Group__7 ;
    public final void rule__OutputOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4008:1: ( rule__OutputOperator__Group__6__Impl rule__OutputOperator__Group__7 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4009:2: rule__OutputOperator__Group__6__Impl rule__OutputOperator__Group__7
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__6__Impl_in_rule__OutputOperator__Group__68037);
            rule__OutputOperator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__7_in_rule__OutputOperator__Group__68040);
            rule__OutputOperator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__6"


    // $ANTLR start "rule__OutputOperator__Group__6__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4016:1: rule__OutputOperator__Group__6__Impl : ( ( rule__OutputOperator__StreamAssignment_6 ) ) ;
    public final void rule__OutputOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4020:1: ( ( ( rule__OutputOperator__StreamAssignment_6 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4021:1: ( ( rule__OutputOperator__StreamAssignment_6 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4021:1: ( ( rule__OutputOperator__StreamAssignment_6 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4022:1: ( rule__OutputOperator__StreamAssignment_6 )
            {
             before(grammarAccess.getOutputOperatorAccess().getStreamAssignment_6()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4023:1: ( rule__OutputOperator__StreamAssignment_6 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4023:2: rule__OutputOperator__StreamAssignment_6
            {
            pushFollow(FOLLOW_rule__OutputOperator__StreamAssignment_6_in_rule__OutputOperator__Group__6__Impl8067);
            rule__OutputOperator__StreamAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorAccess().getStreamAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__6__Impl"


    // $ANTLR start "rule__OutputOperator__Group__7"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4033:1: rule__OutputOperator__Group__7 : rule__OutputOperator__Group__7__Impl rule__OutputOperator__Group__8 ;
    public final void rule__OutputOperator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4037:1: ( rule__OutputOperator__Group__7__Impl rule__OutputOperator__Group__8 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4038:2: rule__OutputOperator__Group__7__Impl rule__OutputOperator__Group__8
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__7__Impl_in_rule__OutputOperator__Group__78097);
            rule__OutputOperator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperator__Group__8_in_rule__OutputOperator__Group__78100);
            rule__OutputOperator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__7"


    // $ANTLR start "rule__OutputOperator__Group__7__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4045:1: rule__OutputOperator__Group__7__Impl : ( ')' ) ;
    public final void rule__OutputOperator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4049:1: ( ( ')' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4050:1: ( ')' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4050:1: ( ')' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4051:1: ')'
            {
             before(grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_7()); 
            match(input,31,FOLLOW_31_in_rule__OutputOperator__Group__7__Impl8128); 
             after(grammarAccess.getOutputOperatorAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__7__Impl"


    // $ANTLR start "rule__OutputOperator__Group__8"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4064:1: rule__OutputOperator__Group__8 : rule__OutputOperator__Group__8__Impl ;
    public final void rule__OutputOperator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4068:1: ( rule__OutputOperator__Group__8__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4069:2: rule__OutputOperator__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__OutputOperator__Group__8__Impl_in_rule__OutputOperator__Group__88159);
            rule__OutputOperator__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__8"


    // $ANTLR start "rule__OutputOperator__Group__8__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4075:1: rule__OutputOperator__Group__8__Impl : ( ';' ) ;
    public final void rule__OutputOperator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4079:1: ( ( ';' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4080:1: ( ';' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4080:1: ( ';' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4081:1: ';'
            {
             before(grammarAccess.getOutputOperatorAccess().getSemicolonKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__OutputOperator__Group__8__Impl8187); 
             after(grammarAccess.getOutputOperatorAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__Group__8__Impl"


    // $ANTLR start "rule__OutputOperatorParameter__Group__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4112:1: rule__OutputOperatorParameter__Group__0 : rule__OutputOperatorParameter__Group__0__Impl rule__OutputOperatorParameter__Group__1 ;
    public final void rule__OutputOperatorParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4116:1: ( rule__OutputOperatorParameter__Group__0__Impl rule__OutputOperatorParameter__Group__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4117:2: rule__OutputOperatorParameter__Group__0__Impl rule__OutputOperatorParameter__Group__1
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group__0__Impl_in_rule__OutputOperatorParameter__Group__08236);
            rule__OutputOperatorParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group__1_in_rule__OutputOperatorParameter__Group__08239);
            rule__OutputOperatorParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group__0"


    // $ANTLR start "rule__OutputOperatorParameter__Group__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4124:1: rule__OutputOperatorParameter__Group__0__Impl : ( ( rule__OutputOperatorParameter__ElementAssignment_0 ) ) ;
    public final void rule__OutputOperatorParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4128:1: ( ( ( rule__OutputOperatorParameter__ElementAssignment_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4129:1: ( ( rule__OutputOperatorParameter__ElementAssignment_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4129:1: ( ( rule__OutputOperatorParameter__ElementAssignment_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4130:1: ( rule__OutputOperatorParameter__ElementAssignment_0 )
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4131:1: ( rule__OutputOperatorParameter__ElementAssignment_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4131:2: rule__OutputOperatorParameter__ElementAssignment_0
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__ElementAssignment_0_in_rule__OutputOperatorParameter__Group__0__Impl8266);
            rule__OutputOperatorParameter__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group__0__Impl"


    // $ANTLR start "rule__OutputOperatorParameter__Group__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4141:1: rule__OutputOperatorParameter__Group__1 : rule__OutputOperatorParameter__Group__1__Impl ;
    public final void rule__OutputOperatorParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4145:1: ( rule__OutputOperatorParameter__Group__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4146:2: rule__OutputOperatorParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group__1__Impl_in_rule__OutputOperatorParameter__Group__18296);
            rule__OutputOperatorParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group__1"


    // $ANTLR start "rule__OutputOperatorParameter__Group__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4152:1: rule__OutputOperatorParameter__Group__1__Impl : ( ( rule__OutputOperatorParameter__Group_1__0 )* ) ;
    public final void rule__OutputOperatorParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4156:1: ( ( ( rule__OutputOperatorParameter__Group_1__0 )* ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4157:1: ( ( rule__OutputOperatorParameter__Group_1__0 )* )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4157:1: ( ( rule__OutputOperatorParameter__Group_1__0 )* )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4158:1: ( rule__OutputOperatorParameter__Group_1__0 )*
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getGroup_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4159:1: ( rule__OutputOperatorParameter__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4159:2: rule__OutputOperatorParameter__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OutputOperatorParameter__Group_1__0_in_rule__OutputOperatorParameter__Group__1__Impl8323);
            	    rule__OutputOperatorParameter__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOutputOperatorParameterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group__1__Impl"


    // $ANTLR start "rule__OutputOperatorParameter__Group_1__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4173:1: rule__OutputOperatorParameter__Group_1__0 : rule__OutputOperatorParameter__Group_1__0__Impl rule__OutputOperatorParameter__Group_1__1 ;
    public final void rule__OutputOperatorParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4177:1: ( rule__OutputOperatorParameter__Group_1__0__Impl rule__OutputOperatorParameter__Group_1__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4178:2: rule__OutputOperatorParameter__Group_1__0__Impl rule__OutputOperatorParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group_1__0__Impl_in_rule__OutputOperatorParameter__Group_1__08358);
            rule__OutputOperatorParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group_1__1_in_rule__OutputOperatorParameter__Group_1__08361);
            rule__OutputOperatorParameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group_1__0"


    // $ANTLR start "rule__OutputOperatorParameter__Group_1__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4185:1: rule__OutputOperatorParameter__Group_1__0__Impl : ( ',' ) ;
    public final void rule__OutputOperatorParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4189:1: ( ( ',' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4190:1: ( ',' )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4190:1: ( ',' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4191:1: ','
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__OutputOperatorParameter__Group_1__0__Impl8389); 
             after(grammarAccess.getOutputOperatorParameterAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group_1__0__Impl"


    // $ANTLR start "rule__OutputOperatorParameter__Group_1__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4204:1: rule__OutputOperatorParameter__Group_1__1 : rule__OutputOperatorParameter__Group_1__1__Impl ;
    public final void rule__OutputOperatorParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4208:1: ( rule__OutputOperatorParameter__Group_1__1__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4209:2: rule__OutputOperatorParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__Group_1__1__Impl_in_rule__OutputOperatorParameter__Group_1__18420);
            rule__OutputOperatorParameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group_1__1"


    // $ANTLR start "rule__OutputOperatorParameter__Group_1__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4215:1: rule__OutputOperatorParameter__Group_1__1__Impl : ( ( rule__OutputOperatorParameter__ElementAssignment_1_1 ) ) ;
    public final void rule__OutputOperatorParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4219:1: ( ( ( rule__OutputOperatorParameter__ElementAssignment_1_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4220:1: ( ( rule__OutputOperatorParameter__ElementAssignment_1_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4220:1: ( ( rule__OutputOperatorParameter__ElementAssignment_1_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4221:1: ( rule__OutputOperatorParameter__ElementAssignment_1_1 )
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_1_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4222:1: ( rule__OutputOperatorParameter__ElementAssignment_1_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4222:2: rule__OutputOperatorParameter__ElementAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OutputOperatorParameter__ElementAssignment_1_1_in_rule__OutputOperatorParameter__Group_1__1__Impl8447);
            rule__OutputOperatorParameter__ElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputOperatorParameterAccess().getElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__Group_1__1__Impl"


    // $ANTLR start "rule__WindowOperator__Group_0__0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4236:1: rule__WindowOperator__Group_0__0 : rule__WindowOperator__Group_0__0__Impl rule__WindowOperator__Group_0__1 ;
    public final void rule__WindowOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4240:1: ( rule__WindowOperator__Group_0__0__Impl rule__WindowOperator__Group_0__1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4241:2: rule__WindowOperator__Group_0__0__Impl rule__WindowOperator__Group_0__1
            {
            pushFollow(FOLLOW_rule__WindowOperator__Group_0__0__Impl_in_rule__WindowOperator__Group_0__08481);
            rule__WindowOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WindowOperator__Group_0__1_in_rule__WindowOperator__Group_0__08484);
            rule__WindowOperator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__0"


    // $ANTLR start "rule__WindowOperator__Group_0__0__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4248:1: rule__WindowOperator__Group_0__0__Impl : ( ( rule__WindowOperator__SettingAssignment_0_0 ) ) ;
    public final void rule__WindowOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4252:1: ( ( ( rule__WindowOperator__SettingAssignment_0_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4253:1: ( ( rule__WindowOperator__SettingAssignment_0_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4253:1: ( ( rule__WindowOperator__SettingAssignment_0_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4254:1: ( rule__WindowOperator__SettingAssignment_0_0 )
            {
             before(grammarAccess.getWindowOperatorAccess().getSettingAssignment_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4255:1: ( rule__WindowOperator__SettingAssignment_0_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4255:2: rule__WindowOperator__SettingAssignment_0_0
            {
            pushFollow(FOLLOW_rule__WindowOperator__SettingAssignment_0_0_in_rule__WindowOperator__Group_0__0__Impl8511);
            rule__WindowOperator__SettingAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getWindowOperatorAccess().getSettingAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__0__Impl"


    // $ANTLR start "rule__WindowOperator__Group_0__1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4265:1: rule__WindowOperator__Group_0__1 : rule__WindowOperator__Group_0__1__Impl rule__WindowOperator__Group_0__2 ;
    public final void rule__WindowOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4269:1: ( rule__WindowOperator__Group_0__1__Impl rule__WindowOperator__Group_0__2 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4270:2: rule__WindowOperator__Group_0__1__Impl rule__WindowOperator__Group_0__2
            {
            pushFollow(FOLLOW_rule__WindowOperator__Group_0__1__Impl_in_rule__WindowOperator__Group_0__18541);
            rule__WindowOperator__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WindowOperator__Group_0__2_in_rule__WindowOperator__Group_0__18544);
            rule__WindowOperator__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__1"


    // $ANTLR start "rule__WindowOperator__Group_0__1__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4277:1: rule__WindowOperator__Group_0__1__Impl : ( ( rule__WindowOperator__ValueAssignment_0_1 ) ) ;
    public final void rule__WindowOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4281:1: ( ( ( rule__WindowOperator__ValueAssignment_0_1 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4282:1: ( ( rule__WindowOperator__ValueAssignment_0_1 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4282:1: ( ( rule__WindowOperator__ValueAssignment_0_1 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4283:1: ( rule__WindowOperator__ValueAssignment_0_1 )
            {
             before(grammarAccess.getWindowOperatorAccess().getValueAssignment_0_1()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4284:1: ( rule__WindowOperator__ValueAssignment_0_1 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4284:2: rule__WindowOperator__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__WindowOperator__ValueAssignment_0_1_in_rule__WindowOperator__Group_0__1__Impl8571);
            rule__WindowOperator__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowOperatorAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__1__Impl"


    // $ANTLR start "rule__WindowOperator__Group_0__2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4294:1: rule__WindowOperator__Group_0__2 : rule__WindowOperator__Group_0__2__Impl ;
    public final void rule__WindowOperator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4298:1: ( rule__WindowOperator__Group_0__2__Impl )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4299:2: rule__WindowOperator__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__WindowOperator__Group_0__2__Impl_in_rule__WindowOperator__Group_0__28601);
            rule__WindowOperator__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__2"


    // $ANTLR start "rule__WindowOperator__Group_0__2__Impl"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4305:1: rule__WindowOperator__Group_0__2__Impl : ( ( rule__WindowOperator__UnitAssignment_0_2 )? ) ;
    public final void rule__WindowOperator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4309:1: ( ( ( rule__WindowOperator__UnitAssignment_0_2 )? ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4310:1: ( ( rule__WindowOperator__UnitAssignment_0_2 )? )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4310:1: ( ( rule__WindowOperator__UnitAssignment_0_2 )? )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4311:1: ( rule__WindowOperator__UnitAssignment_0_2 )?
            {
             before(grammarAccess.getWindowOperatorAccess().getUnitAssignment_0_2()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4312:1: ( rule__WindowOperator__UnitAssignment_0_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=15)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4312:2: rule__WindowOperator__UnitAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__WindowOperator__UnitAssignment_0_2_in_rule__WindowOperator__Group_0__2__Impl8628);
                    rule__WindowOperator__UnitAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowOperatorAccess().getUnitAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__Group_0__2__Impl"


    // $ANTLR start "rule__Model__ModelAssignment"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4329:1: rule__Model__ModelAssignment : ( rulePackageDeclaration ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4333:1: ( ( rulePackageDeclaration ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4334:1: ( rulePackageDeclaration )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4334:1: ( rulePackageDeclaration )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4335:1: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getModelPackageDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Model__ModelAssignment8670);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModelPackageDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4344:1: rule__PackageDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4348:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4349:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4349:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4350:1: RULE_ID
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageDeclaration__NameAssignment_18701); 
             after(grammarAccess.getPackageDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4359:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleModelElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4363:1: ( ( ruleModelElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4364:1: ( ruleModelElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4364:1: ( ruleModelElement )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4365:1: ruleModelElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsModelElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModelElement_in_rule__PackageDeclaration__ElementsAssignment_38732);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsModelElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__StreamDeclaration__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4374:1: rule__StreamDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StreamDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4378:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4379:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4379:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4380:1: RULE_ID
            {
             before(grammarAccess.getStreamDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamDeclaration__NameAssignment_18763); 
             after(grammarAccess.getStreamDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StreamDeclaration__ElementsAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4389:1: rule__StreamDeclaration__ElementsAssignment_3 : ( ruleStreamElement ) ;
    public final void rule__StreamDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4393:1: ( ( ruleStreamElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4394:1: ( ruleStreamElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4394:1: ( ruleStreamElement )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4395:1: ruleStreamElement
            {
             before(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStreamElement_in_rule__StreamDeclaration__ElementsAssignment_38794);
            ruleStreamElement();

            state._fsp--;

             after(grammarAccess.getStreamDeclarationAccess().getElementsStreamElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__StreamElement__TypeAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4404:1: rule__StreamElement__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamElement__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4408:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4409:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4409:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4410:1: ( RULE_ID )
            {
             before(grammarAccess.getStreamElementAccess().getTypeJvmTypeCrossReference_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4411:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4412:1: RULE_ID
            {
             before(grammarAccess.getStreamElementAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamElement__TypeAssignment_08829); 
             after(grammarAccess.getStreamElementAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStreamElementAccess().getTypeJvmTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__TypeAssignment_0"


    // $ANTLR start "rule__StreamElement__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4423:1: rule__StreamElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StreamElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4427:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4428:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4428:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4429:1: RULE_ID
            {
             before(grammarAccess.getStreamElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamElement__NameAssignment_18864); 
             after(grammarAccess.getStreamElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamElement__NameAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4438:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4442:1: ( ( RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4443:1: ( RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4443:1: ( RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4444:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18895); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__TestElement__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4453:1: rule__TestElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TestElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4457:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4458:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4458:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4459:1: RULE_ID
            {
             before(grammarAccess.getTestElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestElement__NameAssignment_18926); 
             after(grammarAccess.getTestElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestElement__NameAssignment_1"


    // $ANTLR start "rule__TestAssign__LeftAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4468:1: rule__TestAssign__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TestAssign__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4472:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4473:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4473:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4474:1: ( RULE_ID )
            {
             before(grammarAccess.getTestAssignAccess().getLeftTestElementCrossReference_1_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4475:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4476:1: RULE_ID
            {
             before(grammarAccess.getTestAssignAccess().getLeftTestElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestAssign__LeftAssignment_18961); 
             after(grammarAccess.getTestAssignAccess().getLeftTestElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTestAssignAccess().getLeftTestElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__LeftAssignment_1"


    // $ANTLR start "rule__TestAssign__RightAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4487:1: rule__TestAssign__RightAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TestAssign__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4491:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4492:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4492:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4493:1: ( RULE_ID )
            {
             before(grammarAccess.getTestAssignAccess().getRightTestElementCrossReference_3_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4494:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4495:1: RULE_ID
            {
             before(grammarAccess.getTestAssignAccess().getRightTestElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestAssign__RightAssignment_39000); 
             after(grammarAccess.getTestAssignAccess().getRightTestElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTestAssignAccess().getRightTestElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestAssign__RightAssignment_3"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4507:1: rule__VariableDeclaration__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4511:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4512:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4512:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4513:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeCrossReference_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4514:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4515:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_09040); 
             after(grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeJvmTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4526:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4530:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4531:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4531:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4532:1: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_19075); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StreamDefinition__ReferenceAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4541:1: rule__StreamDefinition__ReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamDefinition__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4545:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4546:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4546:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4547:1: ( RULE_ID )
            {
             before(grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4548:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4549:1: RULE_ID
            {
             before(grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamDefinition__ReferenceAssignment_09110); 
             after(grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStreamDefinitionAccess().getReferenceStreamDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__ReferenceAssignment_0"


    // $ANTLR start "rule__StreamDefinition__NameAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4560:1: rule__StreamDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StreamDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4564:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4565:1: ( RULE_ID )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4565:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4566:1: RULE_ID
            {
             before(grammarAccess.getStreamDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamDefinition__NameAssignment_19145); 
             after(grammarAccess.getStreamDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamDefinition__NameAssignment_1"


    // $ANTLR start "rule__StreamAccess__ReferenceAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4575:1: rule__StreamAccess__ReferenceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamAccess__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4579:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4580:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4580:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4581:1: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4582:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4583:1: RULE_ID
            {
             before(grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamAccess__ReferenceAssignment_09180); 
             after(grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStreamAccessAccess().getReferenceStreamDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__ReferenceAssignment_0"


    // $ANTLR start "rule__StreamAccess__ElementAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4594:1: rule__StreamAccess__ElementAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StreamAccess__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4598:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4599:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4599:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4600:1: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccessAccess().getElementVariableDeclarationCrossReference_2_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4601:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4602:1: RULE_ID
            {
             before(grammarAccess.getStreamAccessAccess().getElementVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamAccess__ElementAssignment_29219); 
             after(grammarAccess.getStreamAccessAccess().getElementVariableDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStreamAccessAccess().getElementVariableDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAccess__ElementAssignment_2"


    // $ANTLR start "rule__StreamOperatorParameter__StreamAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4613:1: rule__StreamOperatorParameter__StreamAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamOperatorParameter__StreamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4617:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4618:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4618:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4619:1: ( RULE_ID )
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4620:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4621:1: RULE_ID
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreamOperatorParameter__StreamAssignment_09258); 
             after(grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStreamOperatorParameterAccess().getStreamStreamDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__StreamAssignment_0"


    // $ANTLR start "rule__StreamOperatorParameter__BarrierAssignment_1_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4632:1: rule__StreamOperatorParameter__BarrierAssignment_1_1 : ( ruleBarrierOperator ) ;
    public final void rule__StreamOperatorParameter__BarrierAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4636:1: ( ( ruleBarrierOperator ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4637:1: ( ruleBarrierOperator )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4637:1: ( ruleBarrierOperator )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4638:1: ruleBarrierOperator
            {
             before(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBarrierOperator_in_rule__StreamOperatorParameter__BarrierAssignment_1_19293);
            ruleBarrierOperator();

            state._fsp--;

             after(grammarAccess.getStreamOperatorParameterAccess().getBarrierBarrierOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamOperatorParameter__BarrierAssignment_1_1"


    // $ANTLR start "rule__CountOperator__ParameterAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4647:1: rule__CountOperator__ParameterAssignment_2 : ( ruleStreamAccess ) ;
    public final void rule__CountOperator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4651:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4652:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4652:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4653:1: ruleStreamAccess
            {
             before(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__CountOperator__ParameterAssignment_29324);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getCountOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__ParameterAssignment_2"


    // $ANTLR start "rule__CountOperator__StreamAssignment_4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4662:1: rule__CountOperator__StreamAssignment_4 : ( ruleStreamOperatorParameter ) ;
    public final void rule__CountOperator__StreamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4666:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4667:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4667:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4668:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__CountOperator__StreamAssignment_49355);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getCountOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountOperator__StreamAssignment_4"


    // $ANTLR start "rule__StandardDeviationOperator__ParameterAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4677:1: rule__StandardDeviationOperator__ParameterAssignment_2 : ( ruleStreamAccess ) ;
    public final void rule__StandardDeviationOperator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4681:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4682:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4682:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4683:1: ruleStreamAccess
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__StandardDeviationOperator__ParameterAssignment_29386);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getStandardDeviationOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__ParameterAssignment_2"


    // $ANTLR start "rule__StandardDeviationOperator__StreamAssignment_4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4692:1: rule__StandardDeviationOperator__StreamAssignment_4 : ( ruleStreamOperatorParameter ) ;
    public final void rule__StandardDeviationOperator__StreamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4696:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4697:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4697:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4698:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__StandardDeviationOperator__StreamAssignment_49417);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getStandardDeviationOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviationOperator__StreamAssignment_4"


    // $ANTLR start "rule__AverageOperator__ParameterAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4707:1: rule__AverageOperator__ParameterAssignment_2 : ( ruleStreamAccess ) ;
    public final void rule__AverageOperator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4711:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4712:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4712:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4713:1: ruleStreamAccess
            {
             before(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__AverageOperator__ParameterAssignment_29448);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getAverageOperatorAccess().getParameterStreamAccessParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__ParameterAssignment_2"


    // $ANTLR start "rule__AverageOperator__StreamAssignment_4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4722:1: rule__AverageOperator__StreamAssignment_4 : ( ruleStreamOperatorParameter ) ;
    public final void rule__AverageOperator__StreamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4726:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4727:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4727:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4728:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__AverageOperator__StreamAssignment_49479);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getAverageOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AverageOperator__StreamAssignment_4"


    // $ANTLR start "rule__ElementJoinOperator__ElementParametersAssignment_2_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4737:1: rule__ElementJoinOperator__ElementParametersAssignment_2_0 : ( ruleStreamAccess ) ;
    public final void rule__ElementJoinOperator__ElementParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4741:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4742:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4742:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4743:1: ruleStreamAccess
            {
             before(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__ElementJoinOperator__ElementParametersAssignment_2_09510);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__ElementParametersAssignment_2_0"


    // $ANTLR start "rule__ElementJoinOperator__VariableElementParametersAssignment_2_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4752:1: rule__ElementJoinOperator__VariableElementParametersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ElementJoinOperator__VariableElementParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4756:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4757:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4757:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4758:1: ( RULE_ID )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_2_1_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4759:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4760:1: RULE_ID
            {
             before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ElementJoinOperator__VariableElementParametersAssignment_2_19545); 
             after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__VariableElementParametersAssignment_2_1"


    // $ANTLR start "rule__ElementJoinOperator__ElementParametersAssignment_3_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4771:1: rule__ElementJoinOperator__ElementParametersAssignment_3_1 : ( ruleStreamAccess ) ;
    public final void rule__ElementJoinOperator__ElementParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4775:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4776:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4776:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4777:1: ruleStreamAccess
            {
             before(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__ElementJoinOperator__ElementParametersAssignment_3_19580);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getElementJoinOperatorAccess().getElementParametersStreamAccessParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__ElementParametersAssignment_3_1"


    // $ANTLR start "rule__ElementJoinOperator__VariableElementParametersAssignment_4_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4786:1: rule__ElementJoinOperator__VariableElementParametersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ElementJoinOperator__VariableElementParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4790:1: ( ( ( RULE_ID ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4791:1: ( ( RULE_ID ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4791:1: ( ( RULE_ID ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4792:1: ( RULE_ID )
            {
             before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_4_1_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4793:1: ( RULE_ID )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4794:1: RULE_ID
            {
             before(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ElementJoinOperator__VariableElementParametersAssignment_4_19615); 
             after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getElementJoinOperatorAccess().getVariableElementParametersVariableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__VariableElementParametersAssignment_4_1"


    // $ANTLR start "rule__ElementJoinOperator__ParameterAssignment_6"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4805:1: rule__ElementJoinOperator__ParameterAssignment_6 : ( ruleStreamOperatorParameter ) ;
    public final void rule__ElementJoinOperator__ParameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4809:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4810:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4810:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4811:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__ElementJoinOperator__ParameterAssignment_69650);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getElementJoinOperatorAccess().getParameterStreamOperatorParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementJoinOperator__ParameterAssignment_6"


    // $ANTLR start "rule__TagOperator__ParametersAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4820:1: rule__TagOperator__ParametersAssignment_2 : ( ruleTagElement ) ;
    public final void rule__TagOperator__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4824:1: ( ( ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4825:1: ( ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4825:1: ( ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4826:1: ruleTagElement
            {
             before(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTagElement_in_rule__TagOperator__ParametersAssignment_29681);
            ruleTagElement();

            state._fsp--;

             after(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__ParametersAssignment_2"


    // $ANTLR start "rule__TagOperator__ParametersAssignment_3_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4835:1: rule__TagOperator__ParametersAssignment_3_1 : ( ruleTagElement ) ;
    public final void rule__TagOperator__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4839:1: ( ( ruleTagElement ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4840:1: ( ruleTagElement )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4840:1: ( ruleTagElement )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4841:1: ruleTagElement
            {
             before(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTagElement_in_rule__TagOperator__ParametersAssignment_3_19712);
            ruleTagElement();

            state._fsp--;

             after(grammarAccess.getTagOperatorAccess().getParametersTagElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__ParametersAssignment_3_1"


    // $ANTLR start "rule__TagOperator__StreamAssignment_5"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4850:1: rule__TagOperator__StreamAssignment_5 : ( ruleStreamOperatorParameter ) ;
    public final void rule__TagOperator__StreamAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4854:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4855:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4855:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4856:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__TagOperator__StreamAssignment_59743);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getTagOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagOperator__StreamAssignment_5"


    // $ANTLR start "rule__TagClassElement__ReferenceAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4865:1: rule__TagClassElement__ReferenceAssignment_0 : ( ruleStreamAccess ) ;
    public final void rule__TagClassElement__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4869:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4870:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4870:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4871:1: ruleStreamAccess
            {
             before(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__TagClassElement__ReferenceAssignment_09774);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getTagClassElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__ReferenceAssignment_0"


    // $ANTLR start "rule__TagClassElement__ElementAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4880:1: rule__TagClassElement__ElementAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TagClassElement__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4884:1: ( ( ( RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4885:1: ( ( RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4885:1: ( ( RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4886:1: ( RULE_STRING )
            {
             before(grammarAccess.getTagClassElementAccess().getElementOWLClassCrossReference_3_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4887:1: ( RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4888:1: RULE_STRING
            {
             before(grammarAccess.getTagClassElementAccess().getElementOWLClassSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TagClassElement__ElementAssignment_39809); 
             after(grammarAccess.getTagClassElementAccess().getElementOWLClassSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTagClassElementAccess().getElementOWLClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagClassElement__ElementAssignment_3"


    // $ANTLR start "rule__TagObjectPropertyElement__ReferenceAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4899:1: rule__TagObjectPropertyElement__ReferenceAssignment_0 : ( ruleStreamAccess ) ;
    public final void rule__TagObjectPropertyElement__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4903:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4904:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4904:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4905:1: ruleStreamAccess
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__TagObjectPropertyElement__ReferenceAssignment_09844);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getTagObjectPropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__ReferenceAssignment_0"


    // $ANTLR start "rule__TagObjectPropertyElement__ElementAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4914:1: rule__TagObjectPropertyElement__ElementAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TagObjectPropertyElement__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4918:1: ( ( ( RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4919:1: ( ( RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4919:1: ( ( RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4920:1: ( RULE_STRING )
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertyCrossReference_3_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4921:1: ( RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4922:1: RULE_STRING
            {
             before(grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertySTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TagObjectPropertyElement__ElementAssignment_39879); 
             after(grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertySTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTagObjectPropertyElementAccess().getElementOWLObjectPropertyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagObjectPropertyElement__ElementAssignment_3"


    // $ANTLR start "rule__TagDataTypePropertyElement__ReferenceAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4933:1: rule__TagDataTypePropertyElement__ReferenceAssignment_0 : ( ruleStreamAccess ) ;
    public final void rule__TagDataTypePropertyElement__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4937:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4938:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4938:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4939:1: ruleStreamAccess
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__TagDataTypePropertyElement__ReferenceAssignment_09914);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getTagDataTypePropertyElementAccess().getReferenceStreamAccessParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__ReferenceAssignment_0"


    // $ANTLR start "rule__TagDataTypePropertyElement__ElementAssignment_3"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4948:1: rule__TagDataTypePropertyElement__ElementAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TagDataTypePropertyElement__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4952:1: ( ( ( RULE_STRING ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4953:1: ( ( RULE_STRING ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4953:1: ( ( RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4954:1: ( RULE_STRING )
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertyCrossReference_3_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4955:1: ( RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4956:1: RULE_STRING
            {
             before(grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertySTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TagDataTypePropertyElement__ElementAssignment_39949); 
             after(grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertySTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTagDataTypePropertyElementAccess().getElementOWLDatatypePropertyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagDataTypePropertyElement__ElementAssignment_3"


    // $ANTLR start "rule__OutputOperator__ParameterAssignment_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4967:1: rule__OutputOperator__ParameterAssignment_2 : ( ruleOutputOperatorParameter ) ;
    public final void rule__OutputOperator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4971:1: ( ( ruleOutputOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4972:1: ( ruleOutputOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4972:1: ( ruleOutputOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4973:1: ruleOutputOperatorParameter
            {
             before(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOutputOperatorParameter_in_rule__OutputOperator__ParameterAssignment_29984);
            ruleOutputOperatorParameter();

            state._fsp--;

             after(grammarAccess.getOutputOperatorAccess().getParameterOutputOperatorParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__ParameterAssignment_2"


    // $ANTLR start "rule__OutputOperator__LocationAssignment_4"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4982:1: rule__OutputOperator__LocationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OutputOperator__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4986:1: ( ( RULE_STRING ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4987:1: ( RULE_STRING )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4987:1: ( RULE_STRING )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4988:1: RULE_STRING
            {
             before(grammarAccess.getOutputOperatorAccess().getLocationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OutputOperator__LocationAssignment_410015); 
             after(grammarAccess.getOutputOperatorAccess().getLocationSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__LocationAssignment_4"


    // $ANTLR start "rule__OutputOperator__StreamAssignment_6"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:4997:1: rule__OutputOperator__StreamAssignment_6 : ( ruleStreamOperatorParameter ) ;
    public final void rule__OutputOperator__StreamAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5001:1: ( ( ruleStreamOperatorParameter ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5002:1: ( ruleStreamOperatorParameter )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5002:1: ( ruleStreamOperatorParameter )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5003:1: ruleStreamOperatorParameter
            {
             before(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStreamOperatorParameter_in_rule__OutputOperator__StreamAssignment_610046);
            ruleStreamOperatorParameter();

            state._fsp--;

             after(grammarAccess.getOutputOperatorAccess().getStreamStreamOperatorParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperator__StreamAssignment_6"


    // $ANTLR start "rule__OutputOperatorParameter__ElementAssignment_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5012:1: rule__OutputOperatorParameter__ElementAssignment_0 : ( ruleStreamAccess ) ;
    public final void rule__OutputOperatorParameter__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5016:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5017:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5017:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5018:1: ruleStreamAccess
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__OutputOperatorParameter__ElementAssignment_010077);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__ElementAssignment_0"


    // $ANTLR start "rule__OutputOperatorParameter__ElementAssignment_1_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5027:1: rule__OutputOperatorParameter__ElementAssignment_1_1 : ( ruleStreamAccess ) ;
    public final void rule__OutputOperatorParameter__ElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5031:1: ( ( ruleStreamAccess ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5032:1: ( ruleStreamAccess )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5032:1: ( ruleStreamAccess )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5033:1: ruleStreamAccess
            {
             before(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStreamAccess_in_rule__OutputOperatorParameter__ElementAssignment_1_110108);
            ruleStreamAccess();

            state._fsp--;

             after(grammarAccess.getOutputOperatorParameterAccess().getElementStreamAccessParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputOperatorParameter__ElementAssignment_1_1"


    // $ANTLR start "rule__WindowOperator__SettingAssignment_0_0"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5042:1: rule__WindowOperator__SettingAssignment_0_0 : ( ( 'last' ) ) ;
    public final void rule__WindowOperator__SettingAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5046:1: ( ( ( 'last' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5047:1: ( ( 'last' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5047:1: ( ( 'last' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5048:1: ( 'last' )
            {
             before(grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5049:1: ( 'last' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5050:1: 'last'
            {
             before(grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__WindowOperator__SettingAssignment_0_010144); 
             after(grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0()); 

            }

             after(grammarAccess.getWindowOperatorAccess().getSettingLastKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__SettingAssignment_0_0"


    // $ANTLR start "rule__WindowOperator__ValueAssignment_0_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5065:1: rule__WindowOperator__ValueAssignment_0_1 : ( RULE_NUMBER ) ;
    public final void rule__WindowOperator__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5069:1: ( ( RULE_NUMBER ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5070:1: ( RULE_NUMBER )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5070:1: ( RULE_NUMBER )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5071:1: RULE_NUMBER
            {
             before(grammarAccess.getWindowOperatorAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__WindowOperator__ValueAssignment_0_110183); 
             after(grammarAccess.getWindowOperatorAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__ValueAssignment_0_1"


    // $ANTLR start "rule__WindowOperator__UnitAssignment_0_2"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5080:1: rule__WindowOperator__UnitAssignment_0_2 : ( ( rule__WindowOperator__UnitAlternatives_0_2_0 ) ) ;
    public final void rule__WindowOperator__UnitAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5084:1: ( ( ( rule__WindowOperator__UnitAlternatives_0_2_0 ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5085:1: ( ( rule__WindowOperator__UnitAlternatives_0_2_0 ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5085:1: ( ( rule__WindowOperator__UnitAlternatives_0_2_0 ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5086:1: ( rule__WindowOperator__UnitAlternatives_0_2_0 )
            {
             before(grammarAccess.getWindowOperatorAccess().getUnitAlternatives_0_2_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5087:1: ( rule__WindowOperator__UnitAlternatives_0_2_0 )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5087:2: rule__WindowOperator__UnitAlternatives_0_2_0
            {
            pushFollow(FOLLOW_rule__WindowOperator__UnitAlternatives_0_2_0_in_rule__WindowOperator__UnitAssignment_0_210214);
            rule__WindowOperator__UnitAlternatives_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWindowOperatorAccess().getUnitAlternatives_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__UnitAssignment_0_2"


    // $ANTLR start "rule__WindowOperator__SettingAssignment_1"
    // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5096:1: rule__WindowOperator__SettingAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__WindowOperator__SettingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5100:1: ( ( ( 'now' ) ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5101:1: ( ( 'now' ) )
            {
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5101:1: ( ( 'now' ) )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5102:1: ( 'now' )
            {
             before(grammarAccess.getWindowOperatorAccess().getSettingNowKeyword_1_0()); 
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5103:1: ( 'now' )
            // ../de.hs_rm.cs.vs.dsm.flow.ui/src-gen/de/hs_rm/cs/vs/dsm/ui/contentassist/antlr/internal/InternalFlow.g:5104:1: 'now'
            {
             before(grammarAccess.getWindowOperatorAccess().getSettingNowKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__WindowOperator__SettingAssignment_110252); 
             after(grammarAccess.getWindowOperatorAccess().getSettingNowKeyword_1_0()); 

            }

             after(grammarAccess.getWindowOperatorAccess().getSettingNowKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowOperator__SettingAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_in_ruleModel96 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_in_ruleModel108 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_entryRuleStreamDeclaration258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDeclaration265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__0_in_ruleStreamDeclaration291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_entryRuleStreamElement318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamElement325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__0_in_ruleStreamElement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestElement_in_entryRuleTestElement438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestElement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestElement__Group__0_in_ruleTestElement471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestAssign_in_entryRuleTestAssign498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestAssign505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__0_in_ruleTestAssign531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_entryRuleStreamDefinition682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamDefinition689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__0_in_ruleStreamDefinition715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_entryRuleStreamAccess742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamAccess749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__0_in_ruleStreamAccess775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_entryRuleStreamOperatorParameter802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamOperatorParameter809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group__0_in_ruleStreamOperatorParameter835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_entryRuleCountOperator862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountOperator869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__0_in_ruleCountOperator895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_entryRuleStandardDeviationOperator922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStandardDeviationOperator929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__0_in_ruleStandardDeviationOperator955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_entryRuleAverageOperator982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageOperator989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__0_in_ruleAverageOperator1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_entryRuleElementJoinOperator1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementJoinOperator1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__0_in_ruleElementJoinOperator1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_entryRuleTagOperator1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagOperator1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__0_in_ruleTagOperator1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_entryRuleTagElement1162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagElement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagElement__Alternatives_in_ruleTagElement1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_entryRuleTagClassElement1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagClassElement1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__0_in_ruleTagClassElement1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_entryRuleTagObjectPropertyElement1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagObjectPropertyElement1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__0_in_ruleTagObjectPropertyElement1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_entryRuleTagDataTypePropertyElement1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagDataTypePropertyElement1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__0_in_ruleTagDataTypePropertyElement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_entryRuleOutputOperator1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperator1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__0_in_ruleOutputOperator1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_entryRuleOutputOperatorParameter1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOperatorParameter1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group__0_in_ruleOutputOperatorParameter1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_entryRuleBarrierOperator1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrierOperator1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_ruleBarrierOperator1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindowOperator_in_entryRuleWindowOperator1581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindowOperator1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__Alternatives_in_ruleWindowOperator1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__ModelElement__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ModelElement__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestElement_in_rule__ModelElement__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestAssign_in_rule__ModelElement__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDeclaration_in_rule__ModelElement__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ModelElement__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamDefinition_in_rule__ModelElement__Alternatives1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementJoinOperator_in_rule__Operator__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagOperator_in_rule__Operator__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountOperator_in_rule__Operator__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStandardDeviationOperator_in_rule__Operator__Alternatives1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageOperator_in_rule__Operator__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperator_in_rule__Operator__Alternatives1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__ElementParametersAssignment_2_0_in_rule__ElementJoinOperator__Alternatives_21901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__VariableElementParametersAssignment_2_1_in_rule__ElementJoinOperator__Alternatives_21919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagClassElement_in_rule__TagElement__Alternatives1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagObjectPropertyElement_in_rule__TagElement__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagDataTypePropertyElement_in_rule__TagElement__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__0_in_rule__WindowOperator__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__SettingAssignment_1_in_rule__WindowOperator__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__WindowOperator__UnitAlternatives_0_2_02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__WindowOperator__UnitAlternatives_0_2_02090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WindowOperator__UnitAlternatives_0_2_02110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WindowOperator__UnitAlternatives_0_2_02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22284 = new BitSet(new long[]{0x0000010F10F50010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__2__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32346 = new BitSet(new long[]{0x0000010F10F50010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_3_in_rule__PackageDeclaration__Group__3__Impl2376 = new BitSet(new long[]{0x0000010F10F10012L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclaration__Group__5__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__0__Impl_in_rule__StreamDeclaration__Group__02540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__1_in_rule__StreamDeclaration__Group__02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StreamDeclaration__Group__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__1__Impl_in_rule__StreamDeclaration__Group__12602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__2_in_rule__StreamDeclaration__Group__12605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__NameAssignment_1_in_rule__StreamDeclaration__Group__1__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__2__Impl_in_rule__StreamDeclaration__Group__22662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__3_in_rule__StreamDeclaration__Group__22665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StreamDeclaration__Group__2__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__3__Impl_in_rule__StreamDeclaration__Group__32724 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__4_in_rule__StreamDeclaration__Group__32727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__ElementsAssignment_3_in_rule__StreamDeclaration__Group__3__Impl2756 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__ElementsAssignment_3_in_rule__StreamDeclaration__Group__3__Impl2768 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__4__Impl_in_rule__StreamDeclaration__Group__42801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__5_in_rule__StreamDeclaration__Group__42804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StreamDeclaration__Group__4__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDeclaration__Group__5__Impl_in_rule__StreamDeclaration__Group__52863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StreamDeclaration__Group__5__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__0__Impl_in_rule__StreamElement__Group__02934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__1_in_rule__StreamElement__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__TypeAssignment_0_in_rule__StreamElement__Group__0__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__1__Impl_in_rule__StreamElement__Group__12994 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__2_in_rule__StreamElement__Group__12997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__NameAssignment_1_in_rule__StreamElement__Group__1__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamElement__Group__2__Impl_in_rule__StreamElement__Group__23054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StreamElement__Group__2__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Import__Group__0__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13181 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__2__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestElement__Group__0__Impl_in_rule__TestElement__Group__03306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TestElement__Group__1_in_rule__TestElement__Group__03309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TestElement__Group__0__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestElement__Group__1__Impl_in_rule__TestElement__Group__13368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestElement__NameAssignment_1_in_rule__TestElement__Group__1__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__0__Impl_in_rule__TestAssign__Group__03429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__1_in_rule__TestAssign__Group__03432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TestAssign__Group__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__1__Impl_in_rule__TestAssign__Group__13491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__2_in_rule__TestAssign__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__LeftAssignment_1_in_rule__TestAssign__Group__1__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__2__Impl_in_rule__TestAssign__Group__23551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__3_in_rule__TestAssign__Group__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TestAssign__Group__2__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__Group__3__Impl_in_rule__TestAssign__Group__33613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestAssign__RightAssignment_3_in_rule__TestAssign__Group__3__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__03679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__03682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__0__Impl_in_rule__StreamDefinition__Group__03800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__1_in_rule__StreamDefinition__Group__03803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__ReferenceAssignment_0_in_rule__StreamDefinition__Group__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__1__Impl_in_rule__StreamDefinition__Group__13860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__2_in_rule__StreamDefinition__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__NameAssignment_1_in_rule__StreamDefinition__Group__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamDefinition__Group__2__Impl_in_rule__StreamDefinition__Group__23920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StreamDefinition__Group__2__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__0__Impl_in_rule__StreamAccess__Group__03985 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__1_in_rule__StreamAccess__Group__03988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__ReferenceAssignment_0_in_rule__StreamAccess__Group__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__1__Impl_in_rule__StreamAccess__Group__14045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__2_in_rule__StreamAccess__Group__14048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StreamAccess__Group__1__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__Group__2__Impl_in_rule__StreamAccess__Group__24107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamAccess__ElementAssignment_2_in_rule__StreamAccess__Group__2__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group__0__Impl_in_rule__StreamOperatorParameter__Group__04170 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group__1_in_rule__StreamOperatorParameter__Group__04173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__StreamAssignment_0_in_rule__StreamOperatorParameter__Group__0__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group__1__Impl_in_rule__StreamOperatorParameter__Group__14230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__0_in_rule__StreamOperatorParameter__Group__1__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__0__Impl_in_rule__StreamOperatorParameter__Group_1__04292 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__1_in_rule__StreamOperatorParameter__Group_1__04295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StreamOperatorParameter__Group_1__0__Impl4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__1__Impl_in_rule__StreamOperatorParameter__Group_1__14354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__2_in_rule__StreamOperatorParameter__Group_1__14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__BarrierAssignment_1_1_in_rule__StreamOperatorParameter__Group_1__1__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreamOperatorParameter__Group_1__2__Impl_in_rule__StreamOperatorParameter__Group_1__24414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StreamOperatorParameter__Group_1__2__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__0__Impl_in_rule__CountOperator__Group__04479 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__1_in_rule__CountOperator__Group__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CountOperator__Group__0__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__1__Impl_in_rule__CountOperator__Group__14541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__2_in_rule__CountOperator__Group__14544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CountOperator__Group__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__2__Impl_in_rule__CountOperator__Group__24603 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__3_in_rule__CountOperator__Group__24606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__ParameterAssignment_2_in_rule__CountOperator__Group__2__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__3__Impl_in_rule__CountOperator__Group__34663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__4_in_rule__CountOperator__Group__34666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CountOperator__Group__3__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__4__Impl_in_rule__CountOperator__Group__44725 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__5_in_rule__CountOperator__Group__44728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__StreamAssignment_4_in_rule__CountOperator__Group__4__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CountOperator__Group__5__Impl_in_rule__CountOperator__Group__54785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CountOperator__Group__5__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__0__Impl_in_rule__StandardDeviationOperator__Group__04856 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__1_in_rule__StandardDeviationOperator__Group__04859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StandardDeviationOperator__Group__0__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__1__Impl_in_rule__StandardDeviationOperator__Group__14918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__2_in_rule__StandardDeviationOperator__Group__14921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StandardDeviationOperator__Group__1__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__2__Impl_in_rule__StandardDeviationOperator__Group__24980 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__3_in_rule__StandardDeviationOperator__Group__24983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__ParameterAssignment_2_in_rule__StandardDeviationOperator__Group__2__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__3__Impl_in_rule__StandardDeviationOperator__Group__35040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__4_in_rule__StandardDeviationOperator__Group__35043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StandardDeviationOperator__Group__3__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__4__Impl_in_rule__StandardDeviationOperator__Group__45102 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__5_in_rule__StandardDeviationOperator__Group__45105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__StreamAssignment_4_in_rule__StandardDeviationOperator__Group__4__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StandardDeviationOperator__Group__5__Impl_in_rule__StandardDeviationOperator__Group__55162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StandardDeviationOperator__Group__5__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__0__Impl_in_rule__AverageOperator__Group__05233 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__1_in_rule__AverageOperator__Group__05236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AverageOperator__Group__0__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__1__Impl_in_rule__AverageOperator__Group__15295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__2_in_rule__AverageOperator__Group__15298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AverageOperator__Group__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__2__Impl_in_rule__AverageOperator__Group__25357 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__3_in_rule__AverageOperator__Group__25360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__ParameterAssignment_2_in_rule__AverageOperator__Group__2__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__3__Impl_in_rule__AverageOperator__Group__35417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__4_in_rule__AverageOperator__Group__35420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AverageOperator__Group__3__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__4__Impl_in_rule__AverageOperator__Group__45479 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__5_in_rule__AverageOperator__Group__45482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__StreamAssignment_4_in_rule__AverageOperator__Group__4__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AverageOperator__Group__5__Impl_in_rule__AverageOperator__Group__55539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AverageOperator__Group__5__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__0__Impl_in_rule__ElementJoinOperator__Group__05610 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__1_in_rule__ElementJoinOperator__Group__05613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ElementJoinOperator__Group__0__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__1__Impl_in_rule__ElementJoinOperator__Group__15672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__2_in_rule__ElementJoinOperator__Group__15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ElementJoinOperator__Group__1__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__2__Impl_in_rule__ElementJoinOperator__Group__25734 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__3_in_rule__ElementJoinOperator__Group__25737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Alternatives_2_in_rule__ElementJoinOperator__Group__2__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__3__Impl_in_rule__ElementJoinOperator__Group__35794 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__4_in_rule__ElementJoinOperator__Group__35797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_3__0_in_rule__ElementJoinOperator__Group__3__Impl5824 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__4__Impl_in_rule__ElementJoinOperator__Group__45855 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__5_in_rule__ElementJoinOperator__Group__45858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_4__0_in_rule__ElementJoinOperator__Group__4__Impl5885 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__5__Impl_in_rule__ElementJoinOperator__Group__55916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__6_in_rule__ElementJoinOperator__Group__55919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementJoinOperator__Group__5__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__6__Impl_in_rule__ElementJoinOperator__Group__65978 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__7_in_rule__ElementJoinOperator__Group__65981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__ParameterAssignment_6_in_rule__ElementJoinOperator__Group__6__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group__7__Impl_in_rule__ElementJoinOperator__Group__76038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ElementJoinOperator__Group__7__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_3__0__Impl_in_rule__ElementJoinOperator__Group_3__06113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_3__1_in_rule__ElementJoinOperator__Group_3__06116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementJoinOperator__Group_3__0__Impl6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_3__1__Impl_in_rule__ElementJoinOperator__Group_3__16175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__ElementParametersAssignment_3_1_in_rule__ElementJoinOperator__Group_3__1__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_4__0__Impl_in_rule__ElementJoinOperator__Group_4__06236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_4__1_in_rule__ElementJoinOperator__Group_4__06239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ElementJoinOperator__Group_4__0__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__Group_4__1__Impl_in_rule__ElementJoinOperator__Group_4__16298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementJoinOperator__VariableElementParametersAssignment_4_1_in_rule__ElementJoinOperator__Group_4__1__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__0__Impl_in_rule__TagOperator__Group__06359 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__1_in_rule__TagOperator__Group__06362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TagOperator__Group__0__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__1__Impl_in_rule__TagOperator__Group__16421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__2_in_rule__TagOperator__Group__16424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TagOperator__Group__1__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__2__Impl_in_rule__TagOperator__Group__26483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__3_in_rule__TagOperator__Group__26486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__ParametersAssignment_2_in_rule__TagOperator__Group__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__3__Impl_in_rule__TagOperator__Group__36543 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__4_in_rule__TagOperator__Group__36546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group_3__0_in_rule__TagOperator__Group__3__Impl6573 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__4__Impl_in_rule__TagOperator__Group__46604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__5_in_rule__TagOperator__Group__46607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TagOperator__Group__4__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__5__Impl_in_rule__TagOperator__Group__56666 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__6_in_rule__TagOperator__Group__56669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__StreamAssignment_5_in_rule__TagOperator__Group__5__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group__6__Impl_in_rule__TagOperator__Group__66726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TagOperator__Group__6__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group_3__0__Impl_in_rule__TagOperator__Group_3__06799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagOperator__Group_3__1_in_rule__TagOperator__Group_3__06802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TagOperator__Group_3__0__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__Group_3__1__Impl_in_rule__TagOperator__Group_3__16861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagOperator__ParametersAssignment_3_1_in_rule__TagOperator__Group_3__1__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__0__Impl_in_rule__TagClassElement__Group__06922 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__1_in_rule__TagClassElement__Group__06925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__ReferenceAssignment_0_in_rule__TagClassElement__Group__0__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__1__Impl_in_rule__TagClassElement__Group__16982 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__2_in_rule__TagClassElement__Group__16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TagClassElement__Group__1__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__2__Impl_in_rule__TagClassElement__Group__27044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__3_in_rule__TagClassElement__Group__27047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TagClassElement__Group__2__Impl7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__Group__3__Impl_in_rule__TagClassElement__Group__37106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagClassElement__ElementAssignment_3_in_rule__TagClassElement__Group__3__Impl7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__0__Impl_in_rule__TagObjectPropertyElement__Group__07171 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__1_in_rule__TagObjectPropertyElement__Group__07174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__ReferenceAssignment_0_in_rule__TagObjectPropertyElement__Group__0__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__1__Impl_in_rule__TagObjectPropertyElement__Group__17231 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__2_in_rule__TagObjectPropertyElement__Group__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TagObjectPropertyElement__Group__1__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__2__Impl_in_rule__TagObjectPropertyElement__Group__27293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__3_in_rule__TagObjectPropertyElement__Group__27296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TagObjectPropertyElement__Group__2__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__Group__3__Impl_in_rule__TagObjectPropertyElement__Group__37355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagObjectPropertyElement__ElementAssignment_3_in_rule__TagObjectPropertyElement__Group__3__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__0__Impl_in_rule__TagDataTypePropertyElement__Group__07420 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__1_in_rule__TagDataTypePropertyElement__Group__07423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__ReferenceAssignment_0_in_rule__TagDataTypePropertyElement__Group__0__Impl7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__1__Impl_in_rule__TagDataTypePropertyElement__Group__17480 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__2_in_rule__TagDataTypePropertyElement__Group__17483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TagDataTypePropertyElement__Group__1__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__2__Impl_in_rule__TagDataTypePropertyElement__Group__27542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__3_in_rule__TagDataTypePropertyElement__Group__27545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TagDataTypePropertyElement__Group__2__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__Group__3__Impl_in_rule__TagDataTypePropertyElement__Group__37604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagDataTypePropertyElement__ElementAssignment_3_in_rule__TagDataTypePropertyElement__Group__3__Impl7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__0__Impl_in_rule__OutputOperator__Group__07669 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__1_in_rule__OutputOperator__Group__07672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__OutputOperator__Group__0__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__1__Impl_in_rule__OutputOperator__Group__17731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__2_in_rule__OutputOperator__Group__17734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OutputOperator__Group__1__Impl7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__2__Impl_in_rule__OutputOperator__Group__27793 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__3_in_rule__OutputOperator__Group__27796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__ParameterAssignment_2_in_rule__OutputOperator__Group__2__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__3__Impl_in_rule__OutputOperator__Group__37853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__4_in_rule__OutputOperator__Group__37856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OutputOperator__Group__3__Impl7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__4__Impl_in_rule__OutputOperator__Group__47915 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__5_in_rule__OutputOperator__Group__47918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__LocationAssignment_4_in_rule__OutputOperator__Group__4__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__5__Impl_in_rule__OutputOperator__Group__57975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__6_in_rule__OutputOperator__Group__57978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OutputOperator__Group__5__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__6__Impl_in_rule__OutputOperator__Group__68037 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__7_in_rule__OutputOperator__Group__68040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__StreamAssignment_6_in_rule__OutputOperator__Group__6__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__7__Impl_in_rule__OutputOperator__Group__78097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__8_in_rule__OutputOperator__Group__78100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OutputOperator__Group__7__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperator__Group__8__Impl_in_rule__OutputOperator__Group__88159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OutputOperator__Group__8__Impl8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group__0__Impl_in_rule__OutputOperatorParameter__Group__08236 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group__1_in_rule__OutputOperatorParameter__Group__08239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__ElementAssignment_0_in_rule__OutputOperatorParameter__Group__0__Impl8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group__1__Impl_in_rule__OutputOperatorParameter__Group__18296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group_1__0_in_rule__OutputOperatorParameter__Group__1__Impl8323 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group_1__0__Impl_in_rule__OutputOperatorParameter__Group_1__08358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group_1__1_in_rule__OutputOperatorParameter__Group_1__08361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OutputOperatorParameter__Group_1__0__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__Group_1__1__Impl_in_rule__OutputOperatorParameter__Group_1__18420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputOperatorParameter__ElementAssignment_1_1_in_rule__OutputOperatorParameter__Group_1__1__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__0__Impl_in_rule__WindowOperator__Group_0__08481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__1_in_rule__WindowOperator__Group_0__08484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__SettingAssignment_0_0_in_rule__WindowOperator__Group_0__0__Impl8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__1__Impl_in_rule__WindowOperator__Group_0__18541 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__2_in_rule__WindowOperator__Group_0__18544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__ValueAssignment_0_1_in_rule__WindowOperator__Group_0__1__Impl8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__Group_0__2__Impl_in_rule__WindowOperator__Group_0__28601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__UnitAssignment_0_2_in_rule__WindowOperator__Group_0__2__Impl8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Model__ModelAssignment8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageDeclaration__NameAssignment_18701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__PackageDeclaration__ElementsAssignment_38732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamDeclaration__NameAssignment_18763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamElement_in_rule__StreamDeclaration__ElementsAssignment_38794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamElement__TypeAssignment_08829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamElement__NameAssignment_18864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestElement__NameAssignment_18926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestAssign__LeftAssignment_18961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestAssign__RightAssignment_39000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__TypeAssignment_09040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_19075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamDefinition__ReferenceAssignment_09110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamDefinition__NameAssignment_19145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamAccess__ReferenceAssignment_09180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamAccess__ElementAssignment_29219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreamOperatorParameter__StreamAssignment_09258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrierOperator_in_rule__StreamOperatorParameter__BarrierAssignment_1_19293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__CountOperator__ParameterAssignment_29324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__CountOperator__StreamAssignment_49355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__StandardDeviationOperator__ParameterAssignment_29386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__StandardDeviationOperator__StreamAssignment_49417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__AverageOperator__ParameterAssignment_29448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__AverageOperator__StreamAssignment_49479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__ElementJoinOperator__ElementParametersAssignment_2_09510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ElementJoinOperator__VariableElementParametersAssignment_2_19545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__ElementJoinOperator__ElementParametersAssignment_3_19580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ElementJoinOperator__VariableElementParametersAssignment_4_19615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__ElementJoinOperator__ParameterAssignment_69650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_rule__TagOperator__ParametersAssignment_29681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagElement_in_rule__TagOperator__ParametersAssignment_3_19712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__TagOperator__StreamAssignment_59743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__TagClassElement__ReferenceAssignment_09774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TagClassElement__ElementAssignment_39809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__TagObjectPropertyElement__ReferenceAssignment_09844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TagObjectPropertyElement__ElementAssignment_39879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__TagDataTypePropertyElement__ReferenceAssignment_09914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TagDataTypePropertyElement__ElementAssignment_39949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOperatorParameter_in_rule__OutputOperator__ParameterAssignment_29984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OutputOperator__LocationAssignment_410015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamOperatorParameter_in_rule__OutputOperator__StreamAssignment_610046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__OutputOperatorParameter__ElementAssignment_010077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamAccess_in_rule__OutputOperatorParameter__ElementAssignment_1_110108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__WindowOperator__SettingAssignment_0_010144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__WindowOperator__ValueAssignment_0_110183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WindowOperator__UnitAlternatives_0_2_0_in_rule__WindowOperator__UnitAssignment_0_210214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__WindowOperator__SettingAssignment_110252 = new BitSet(new long[]{0x0000000000000002L});

}