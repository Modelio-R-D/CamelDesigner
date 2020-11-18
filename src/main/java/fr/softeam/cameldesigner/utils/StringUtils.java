package fr.softeam.cameldesigner.utils;

import java.util.regex.Pattern;

public class StringUtils {
    private static final Object TRUE_LITERAL = "true";

    private static final Object FALSE_LITERAL = "false";

    private static Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static String capitalizeFirst(String toCap) {
        return toCap.substring(0, 1).toUpperCase() + toCap.substring(1);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return NUMBER_PATTERN.matcher(strNum).matches();
    }

    public static boolean isBoolean(String strBoolean) {
        return strBoolean != null && (strBoolean.equals(TRUE_LITERAL) || strBoolean.equals(FALSE_LITERAL));
    }

}
