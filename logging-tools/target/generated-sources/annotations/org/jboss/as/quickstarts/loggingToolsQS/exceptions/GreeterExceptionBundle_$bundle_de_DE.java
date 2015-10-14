
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreeterExceptionBundle_$bundle_de_DE
    extends GreeterExceptionBundle_$bundle_de
    implements GreeterExceptionBundle
{

    public final static GreeterExceptionBundle_$bundle_de_DE INSTANCE = new GreeterExceptionBundle_$bundle_de_DE();
    private final static java.lang.String thrownOnPurpose = "GREETER000006: Diese Ausnahme absichtlich geworfen.";
    private final static java.lang.String localeNotValid = "GREETER000005: Angeforderte Gebietsschema nicht g\u00fcltig: %s";

    protected GreeterExceptionBundle_$bundle_de_DE() {
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
