
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2015-10-14T23:22:02+0200")
public class GreeterLogger_$logger_sv_SE
    extends GreeterLogger_$logger_sv
    implements GreeterLogger, BasicLogger
{

    private final static java.lang.String logHelloMessageSentForLocale = "GREETER000002: Hej meddelande skickas till locale: %s.";
    private final static java.lang.String logHelloMessageSent = "GREETER000001: Hej meddelande som skickas.";

    public GreeterLogger_$logger_sv_SE(final Logger logger) {
        super(logger);
    }

    @Override
    protected java.lang.String logHelloMessageSentForLocale$str() {
        return logHelloMessageSentForLocale;
    }

    @Override
    protected java.lang.String logHelloMessageSent$str() {
        return logHelloMessageSent;
    }

}
