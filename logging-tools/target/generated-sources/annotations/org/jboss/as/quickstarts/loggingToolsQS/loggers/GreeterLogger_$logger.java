
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2015-10-14T23:22:01+0200")
public class GreeterLogger_$logger
    extends DelegatingBasicLogger
    implements Serializable, GreeterLogger, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static java.lang.String FQCN = GreeterLogger_$logger.class.getName();
    private final static java.lang.String logHelloMessageSentForLocale = "GREETER000002: Hello message sent for locale: %s.";
    private final static java.lang.String logHelloMessageSent = "GREETER000001: Hello message sent.";

    public GreeterLogger_$logger(final Logger log) {
        super(log);
    }

    public final void logHelloMessageSentForLocale(final java.lang.String locale) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logHelloMessageSentForLocale$str(), locale);
    }

    protected java.lang.String logHelloMessageSentForLocale$str() {
        return logHelloMessageSentForLocale;
    }

    public final void logHelloMessageSent() {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logHelloMessageSent$str());
    }

    protected java.lang.String logHelloMessageSent$str() {
        return logHelloMessageSent;
    }

}
