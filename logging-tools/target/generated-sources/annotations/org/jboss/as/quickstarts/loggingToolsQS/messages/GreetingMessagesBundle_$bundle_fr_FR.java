
package org.jboss.as.quickstarts.loggingToolsQS.messages;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreetingMessagesBundle_$bundle_fr_FR
    extends GreetingMessagesBundle_$bundle_fr
    implements GreetingMessagesBundle
{

    public final static GreetingMessagesBundle_$bundle_fr_FR INSTANCE = new GreetingMessagesBundle_$bundle_fr_FR();
    private final static java.lang.String helloToYou = "Bonjour %s.";

    protected GreetingMessagesBundle_$bundle_fr_FR() {
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
