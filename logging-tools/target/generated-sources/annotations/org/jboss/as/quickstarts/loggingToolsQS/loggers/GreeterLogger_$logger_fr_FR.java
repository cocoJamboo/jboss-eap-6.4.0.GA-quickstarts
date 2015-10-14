
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2015-10-14T23:22:01+0200")
public class GreeterLogger_$logger_fr_FR
    extends GreeterLogger_$logger_fr
    implements GreeterLogger, BasicLogger
{

    private final static java.lang.String logHelloMessageSentForLocale = "GREETER000002: Bonjour message envo\u00e9 pour la localisation de: %s.";
    private final static java.lang.String logHelloMessageSent = "GREETER000001: Bonjour message envoy\u00e9.";

    public GreeterLogger_$logger_fr_FR(final Logger logger) {
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
