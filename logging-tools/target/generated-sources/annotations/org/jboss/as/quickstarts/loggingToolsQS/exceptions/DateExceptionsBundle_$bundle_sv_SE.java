
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:02+0200")
public class DateExceptionsBundle_$bundle_sv_SE
    extends DateExceptionsBundle_$bundle_sv
    implements DateExceptionsBundle
{

    public final static DateExceptionsBundle_$bundle_sv_SE INSTANCE = new DateExceptionsBundle_$bundle_sv_SE();
    private final static java.lang.String targetDateStringDidntParse = "GRTDATES000007: Det datum du har s\u00e4nt mig \u00e4r inte giltig, '%s'. Urs\u00e4kta.";

    protected DateExceptionsBundle_$bundle_sv_SE() {
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
