
package org.jboss.as.quickstarts.loggingToolsQS.messages;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:22:03+0200")
public class GreetingMessagesBundle_$bundle_de_DE
    extends GreetingMessagesBundle_$bundle_de
    implements GreetingMessagesBundle
{

    public final static GreetingMessagesBundle_$bundle_de_DE INSTANCE = new GreetingMessagesBundle_$bundle_de_DE();
    private final static java.lang.String helloToYou = "Hallo %s.";

    protected GreetingMessagesBundle_$bundle_de_DE() {
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
