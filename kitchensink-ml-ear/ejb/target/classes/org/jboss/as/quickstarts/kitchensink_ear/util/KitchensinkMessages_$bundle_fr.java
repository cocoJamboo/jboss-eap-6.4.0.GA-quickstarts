
package org.jboss.as.quickstarts.kitchensink_ear.util;

import javax.annotation.Generated;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleTranslator", date = "2015-10-14T23:21:54+0200")
public class KitchensinkMessages_$bundle_fr
    extends KitchensinkMessages_$bundle
    implements KitchensinkMessages
{

    public final static KitchensinkMessages_$bundle_fr INSTANCE = new KitchensinkMessages_$bundle_fr();
    private final static java.lang.String defaultErrorMessage = "Echec de l'enregistrement. Voir journal du serveur pour plus d'informations.";
    private final static java.lang.String registerFailMessage = "Echec de l'enregistrement:";
    private final static java.lang.String registeredMessage = "Enregistr\u00e9!";
    private final static java.lang.String registerSuccessfulMessage = "enregistr\u00e9 avec succ\u00e8s!";

    protected KitchensinkMessages_$bundle_fr() {
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
