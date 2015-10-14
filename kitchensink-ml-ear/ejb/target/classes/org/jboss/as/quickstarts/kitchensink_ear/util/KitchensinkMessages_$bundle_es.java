
package org.jboss.as.quickstarts.kitchensink_ear.util;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:21:54+0200")
public class KitchensinkMessages_$bundle_es
    extends KitchensinkMessages_$bundle
    implements KitchensinkMessages
{

    public final static KitchensinkMessages_$bundle_es INSTANCE = new KitchensinkMessages_$bundle_es();
    private final static java.lang.String defaultErrorMessage = "Error de registro. Vea el registro del servidor para obtener m\u00e1s informaci\u00f3n.";
    private final static java.lang.String registerFailMessage = "Registro no se ha:";
    private final static java.lang.String registeredMessage = "De registro!";
    private final static java.lang.String registerSuccessfulMessage = "Registrado con \u00e9xito!";

    protected KitchensinkMessages_$bundle_es() {
        super();
    }

    @Override
    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    protected java.lang.String defaultErrorMessage$str() {
        return defaultErrorMessage;
    }

    @Override
    protected java.lang.String registerFailMessage$str() {
        return registerFailMessage;
    }

    @Override
    protected java.lang.String registeredMessage$str() {
        return registeredMessage;
    }

    @Override
    protected java.lang.String registerSuccessfulMessage$str() {
        return registerSuccessfulMessage;
    }

}
