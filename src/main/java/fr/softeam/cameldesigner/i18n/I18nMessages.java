package fr.softeam.cameldesigner.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class I18nMessages {
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle ("fr.softeam.cameldesigner.i18n.messages");

    private I18nMessages() {
    }

    public static String getString(final String key) {
        try {
            return RESOURCE_BUNDLE.getString (key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

    public static String getString(final String key, final String... params) {
        try {
            return MessageFormat.format (RESOURCE_BUNDLE.getString (key),(Object[]) params);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }

}
