
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2015-10-14T23:22:02+0200")
public class DateExceptionsBundle_$bundle
    implements Serializable, DateExceptionsBundle
{

    private final static long serialVersionUID = 1L;
    public final static DateExceptionsBundle_$bundle INSTANCE = new DateExceptionsBundle_$bundle();
    private final static java.lang.String targetDateStringDidntParse = "GRTDATES000007: The date you sent me isn't valid, '%s'.  Sorry.";

    protected DateExceptionsBundle_$bundle() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public final java.text.ParseException targetDateStringDidntParse(final java.lang.String dateString, final int errorOffset) {
        java.text.ParseException result = new java.text.ParseException(java.lang.String.format(targetDateStringDidntParse$str(), dateString), errorOffset);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String targetDateStringDidntParse$str() {
        return targetDateStringDidntParse;
    }

}
