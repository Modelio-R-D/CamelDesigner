package fr.softeam.cameldesigner.profiler.data;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Items
 * <p>
 */
@objid ("bf1a6820-4f7d-4f31-bcc7-23294562384b")
@Generated("jsonschema2pojo")
public enum Category {
    @SerializedName("cpu")
    CPU ("cpu"),
    @SerializedName("gpu")
    GPU ("gpu"),
    @SerializedName("fpga")
    FPGA ("fpga"),
    @SerializedName("vm")
    VM ("vm"),
    @SerializedName("docker")
    DOCKER ("docker"),
    @SerializedName("serverless")
    SERVERLESS ("serverless"),
    @SerializedName("hpc")
    HPC ("hpc");

    @objid ("ac97fb4e-3ffd-4b95-a997-2c32cb65bbb3")
    private final String value;

    @objid ("6628276f-d656-418e-a2e7-4df942fb8c21")
    private static final Map<String, Category> CONSTANTS = new HashMap<String, Category>();

    @objid ("a90f4a54-8b09-4531-bfbc-34fe598a147e")
    Category(String value) {
        this.value = value;
    }

    @objid ("3bca6de0-5f0b-48d6-a6ba-970a11477827")
    @Override
    public String toString() {
        return this.value;
    }

    @objid ("1a7ced66-12ef-4f5b-b267-1d0337a79b36")
    public String value() {
        return this.value;
    }

    @objid ("4ca162cf-99ef-4115-9b77-4a10ecf1d5c9")
    public static Category fromValue(String value) {
        Category constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }


static {
    for (Category c: values()) {
        CONSTANTS.put(c.value, c);
    }
}
}
