
package org.jboss.as.quickstarts.kitchensink.util;

import java.io.Serializable;
import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2015-10-14T23:21:50+0200")
public class KitchensinkMessages_$bundle
    implements Serializable, KitchensinkMessages
{

    private final static long serialVersionUID = 1L;
    public final static KitchensinkMessages_$bundle INSTANCE = new KitchensinkMessages_$bundle();
    private final static java.lang.String defaultErrorMessage = "Registration failed. See server log for more information.";
    private final static java.lang.String registerFailMessage = "Registration failed:";
    private final static java.lang.String registeredMessage = "Registered!";
    private final static java.lang.String registerSuccessfulMessage = "Successfully registered!";

    protected KitchensinkMessages_$bundle() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public final java.lang.String defaultErrorMessage() {
        java.lang.String result = java.lang.String.format(defaultErrorMessage$str());
        return result;
    }

    protected java.lang.String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }

    public final java.lang.String registerFailMessage() {
        java.lang.String result = java.lang.String.format(registerFailMessage$str());
        return result;
    }

    protected java.lang.String registerFailMessage$str() {
        return registerFailMessage;
    }

    public final java.lang.String registeredMessage() {
        java.lang.String result = java.lang.String.format(registeredMessage$str());
        return result;
    }

    protected java.lang.String registeredMessage$str() {
        return registeredMessage;
    }

    public final java.lang.String registerSuccessfulMessage() {
        java.lang.String result = java.lang.String.format(registerSuccessfulMessage$str());
        return result;
    }

    protected java.lang.String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }

}
