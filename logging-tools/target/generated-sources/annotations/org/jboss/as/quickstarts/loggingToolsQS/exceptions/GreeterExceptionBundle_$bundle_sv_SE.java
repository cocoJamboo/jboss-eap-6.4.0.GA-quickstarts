
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreeterExceptionBundle_$bundle_sv_SE
    extends GreeterExceptionBundle_$bundle_sv
    implements GreeterExceptionBundle
{

    public final static GreeterExceptionBundle_$bundle_sv_SE INSTANCE = new GreeterExceptionBundle_$bundle_sv_SE();
    private final static java.lang.String thrownOnPurpose = "GREETER000006: Detta undantag kastas med flit.";
    private final static java.lang.String localeNotValid = "GREETER000005: Beg\u00e4rd spr\u00e5k inte giltigt: %s.";

    protected GreeterExceptionBundle_$bundle_sv_SE() {
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
