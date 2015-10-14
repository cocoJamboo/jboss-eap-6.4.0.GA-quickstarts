
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:02+0200")
public class DateExceptionsBundle_$bundle_fr_FR
    extends DateExceptionsBundle_$bundle_fr
    implements DateExceptionsBundle
{

    public final static DateExceptionsBundle_$bundle_fr_FR INSTANCE = new DateExceptionsBundle_$bundle_fr_FR();
    private final static java.lang.String targetDateStringDidntParse = "GRTDATES000007: La date que vous m'avez envoy\u00e9 n'est pas valide, '%s'. d\u00e9sol\u00e9.";

    protected DateExceptionsBundle_$bundle_fr_FR() {
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
