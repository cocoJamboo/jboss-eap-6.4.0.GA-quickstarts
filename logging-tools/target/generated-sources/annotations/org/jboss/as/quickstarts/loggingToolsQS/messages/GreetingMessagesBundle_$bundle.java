
package org.jboss.as.quickstarts.loggingToolsQS.messages;

import java.io.Serializable;
import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2015-10-14T23:22:03+0200")
public class GreetingMessagesBundle_$bundle
    implements Serializable, GreetingMessagesBundle
{

    private final static long serialVersionUID = 1L;
    public final static GreetingMessagesBundle_$bundle INSTANCE = new GreetingMessagesBundle_$bundle();
    private final static java.lang.String helloToYou = "Hello %s.";

    protected GreetingMessagesBundle_$bundle() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public final java.lang.String helloToYou(final java.lang.String name) {
        java.lang.String result = java.lang.String.format(helloToYou$str(), name);
        return result;
    }

    protected java.lang.String helloToYou$str() {
        return helloToYou;
    }

}
