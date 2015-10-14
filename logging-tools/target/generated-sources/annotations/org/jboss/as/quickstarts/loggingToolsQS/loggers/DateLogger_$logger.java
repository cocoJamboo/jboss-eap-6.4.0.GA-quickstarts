
package org.jboss.as.quickstarts.loggingToolsQS.loggers;

import java.io.Serializable;
import java.text.ParseException;
import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2015-10-14T23:22:02+0200")
public class DateLogger_$logger
    extends DelegatingBasicLogger
    implements Serializable, DateLogger, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static java.lang.String FQCN = DateLogger_$logger.class.getName();
    private final static java.lang.String logDaysUntilRequest = "GTRDATES000004: Requested number of days until '%s'";
    private final static java.lang.String logStringCouldntParseAsDate = "GTRDATES000003: Invalid date passed as string: %s";

    public DateLogger_$logger(final Logger log) {
        super(log);
    }

    public final void logDaysUntilRequest(final java.lang.String dateString) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.INFO), null, logDaysUntilRequest$str(), dateString);
    }

    protected java.lang.String logDaysUntilRequest$str() {
        return logDaysUntilRequest;
    }

    public final void logStringCouldntParseAsDate(final java.lang.String datestring, final ParseException exception) {
        super.log.logf(FQCN, (org.jboss.logging.Logger.Level.ERROR), (exception), logStringCouldntParseAsDate$str(), datestring);
    }

    protected java.lang.String logStringCouldntParseAsDate$str() {
        return logStringCouldntParseAsDate;
    }

}
