package fr.softeam.cameldesigner.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1dc6fa27-d222-4f6f-adec-b5b71d3b220e")
public class I18nMessages {
    @objid ("d19633b0-340b-4cf6-a6cc-fc3ebda556e9")
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("fr.softeam.cameldesigner.i18n.messages");

    @objid ("2902951f-5f98-434b-acd4-9c610c739342")
    private I18nMessages() {
    }

    @objid ("4bd0fd47-7c36-41f8-9c43-a30a822669d9")
    public static String getString(final String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    @objid ("93ace2af-53d3-4a85-9526-f238d9c82491")
    public static String getString(final String key, final String... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key),(Object[]) params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
