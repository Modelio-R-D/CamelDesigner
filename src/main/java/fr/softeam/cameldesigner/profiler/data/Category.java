
package fr.softeam.cameldesigner.profiler.data;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * Items
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum Category {

    @SerializedName("cpu")
    CPU("cpu"),
    @SerializedName("gpu")
    GPU("gpu"),
    @SerializedName("fpga")
    FPGA("fpga"),
    @SerializedName("vm")
    VM("vm"),
    @SerializedName("docker")
    DOCKER("docker"),
    @SerializedName("serverless")
    SERVERLESS("serverless"),
    @SerializedName("hpc")
    HPC("hpc");
    private final String value;
    private final static Map<String, Category> CONSTANTS = new HashMap<String, Category>();

    static {
        for (Category c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Category(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static Category fromValue(String value) {
        Category constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
