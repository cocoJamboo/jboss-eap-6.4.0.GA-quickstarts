
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2015-10-14T23:22:02+0200")
public class DateLogger_$logger_fr_FR
    extends DateLogger_$logger_fr
    implements DateLogger, BasicLogger
{

    private final static java.lang.String logDaysUntilRequest = "GTRDATES000004: Nombre requis de jours jusqu'\u00e0 ce que '%s'";
    private final static java.lang.String logStringCouldntParseAsDate = "GTRDATES000003: Blancs date pass\u00e9e en tant que cha\u00eene: %s";

    public DateLogger_$logger_fr_FR(final Logger logger) {
        super(logger);
    }

    @Override
    protected java.lang.String logDaysUntilRequest$str() {
        return logDaysUntilRequest;
    }

    @Override
    protected java.lang.String logStringCouldntParseAsDate$str() {
        return logStringCouldntParseAsDate;
    }

}
