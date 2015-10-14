
package org.jboss.as.quickstarts.loggingToolsQS.exceptions;

import java.io.Serializable;
import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2015-10-14T23:22:03+0200")
public class GreeterExceptionBundle_$bundle
    implements Serializable, GreeterExceptionBundle
{

    private final static long serialVersionUID = 1L;
    public final static GreeterExceptionBundle_$bundle INSTANCE = new GreeterExceptionBundle_$bundle();
    private final static java.lang.String thrownOnPurpose = "GREETER000006: This exception thrown on purpose.";
    private final static java.lang.String localeNotValid = "GREETER000005: Requested locale not valid: %s";

    protected GreeterExceptionBundle_$bundle() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public final java.lang.Exception thrownOnPurpose(final Throwable ex) {
        java.lang.Exception result = new java.lang.Exception(java.lang.String.format(thrownOnPurpose$str()), ex);
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String thrownOnPurpose$str() {
        return thrownOnPurpose;
    }

    public final org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException localeNotValid(final java.lang.String locale) {
        org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException result = new org.jboss.as.quickstarts.loggingToolsQS.exceptions.LocaleInvalidException(java.lang.String.format(localeNotValid$str(), locale));
        java.lang.StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(java.util.Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected java.lang.String localeNotValid$str() {
        return localeNotValid;
    }

}
