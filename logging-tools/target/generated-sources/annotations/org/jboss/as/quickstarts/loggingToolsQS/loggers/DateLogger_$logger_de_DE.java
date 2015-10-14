
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerTranslator", date = "2015-10-14T23:22:02+0200")
public class DateLogger_$logger_de_DE
    extends DateLogger_$logger_de
    implements DateLogger, BasicLogger
{

    private final static java.lang.String logDaysUntilRequest = "GTRDATES000004: Gew\u00fcnschte Anzahl der Tage bis '%s'.";
    private final static java.lang.String logStringCouldntParseAsDate = "GTRDATES000003: Ung\u00fcltiges Datum als String \u00fcbergeben, '%s.";

    public DateLogger_$logger_de_DE(final Logger logger) {
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
