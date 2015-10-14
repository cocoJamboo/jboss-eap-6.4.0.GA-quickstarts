
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreeterExceptionBundle_$bundle_fr_FR
    extends GreeterExceptionBundle_$bundle_fr
    implements GreeterExceptionBundle
{

    public final static GreeterExceptionBundle_$bundle_fr_FR INSTANCE = new GreeterExceptionBundle_$bundle_fr_FR();
    private final static java.lang.String thrownOnPurpose = "GREETER000006: Cette Exception lev\u00e9e sur le but.";
    private final static java.lang.String localeNotValid = "GREETER000005: Locale a demand\u00e9 pas valide: %s";

    protected GreeterExceptionBundle_$bundle_fr_FR() {
        super();
    }

    @Override
    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    protected java.lang.String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }

    @Override
    protected java.lang.String localeNotValid$str() {
        return localeNotValid;
    }

}
