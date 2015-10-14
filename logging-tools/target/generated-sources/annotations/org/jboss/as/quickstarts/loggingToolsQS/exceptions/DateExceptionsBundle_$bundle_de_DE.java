
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:02+0200")
public class DateExceptionsBundle_$bundle_de_DE
    extends DateExceptionsBundle_$bundle_de
    implements DateExceptionsBundle
{

    public final static DateExceptionsBundle_$bundle_de_DE INSTANCE = new DateExceptionsBundle_$bundle_de_DE();
    private final static java.lang.String targetDateStringDidntParse = "GRTDATES000007: Das Datum, das Sie mir geschickt ist nicht g\u00fcltig, '%s'. Entschuldigung.";

    protected DateExceptionsBundle_$bundle_de_DE() {
        super();
    }

    @Override
    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    protected java.lang.String targetDateStringDidntParse$str() {
        return targetDateStringDidntParse;
    }

}
