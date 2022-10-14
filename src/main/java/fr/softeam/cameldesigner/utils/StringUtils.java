package fr.softeam.cameldesigner.utils;

import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3b19308b-651e-43ee-a664-110640ad8fd6")
public class StringUtils {
    @objid ("695016b2-dbe0-41b7-959d-305fbf4f71b6")
    private static final Object TRUE_LITERAL = "true";

    @objid ("fe84b98c-56ef-4743-b177-baf16e75e775")
    private static final Object FALSE_LITERAL = "false";

    @objid ("e3bc0760-03f7-4781-8121-cf22753a26bd")
    private static Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+(\\.\\d+)?");

    @objid ("47afe1d6-eefa-47d0-8b84-d2d4075b5bb9")
    private static Pattern INT_PATTERN = Pattern.compile("(0|[1-9]\\d*)");

    @objid ("5a9f406f-7a9a-4c97-83e0-9b9aa5bc42e9")
    public static String capitalizeFirst(String toCap) {
        return toCap.substring(0, 1).toUpperCase() + toCap.substring(1);
    }

    @objid ("b15f69ab-78f3-4533-9d69-32c6310ff6ef")
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return NUMBER_PATTERN.matcher(strNum).matches();
    }

    @objid ("723f0524-c8be-4448-aa27-02180a895f57")
    public static boolean isBoolean(String strBoolean) {
        return strBoolean != null && (strBoolean.equals(TRUE_LITERAL) || strBoolean.equals(FALSE_LITERAL));
    }

    @objid ("83d636ef-e1d7-42c3-9048-69ed4e1a5b50")
    public static boolean isInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        return NUMBER_PATTERN.matcher(strNum).matches();
    }

    @objid ("b12022b5-4a3d-4c55-863d-32b2e0ff1c21")
    public static boolean isNullOrEmpty(String toTest) {
        return ((toTest == null) || (toTest.equals("")));
    }

}
