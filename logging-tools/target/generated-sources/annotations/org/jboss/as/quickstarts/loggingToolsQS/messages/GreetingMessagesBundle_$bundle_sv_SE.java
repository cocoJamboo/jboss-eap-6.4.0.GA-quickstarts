
package org.jboss.as.quickstarts.loggingToolsQS.messages;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreetingMessagesBundle_$bundle_sv_SE
    extends GreetingMessagesBundle_$bundle_sv
    implements GreetingMessagesBundle
{

    public final static GreetingMessagesBundle_$bundle_sv_SE INSTANCE = new GreetingMessagesBundle_$bundle_sv_SE();
    private final static java.lang.String helloToYou = "Hej %s.";

    protected GreetingMessagesBundle_$bundle_sv_SE() {
        super();
    }

    @Override
    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    protected java.lang.String helloToYou$str() {
        return helloToYou;
    }

}
