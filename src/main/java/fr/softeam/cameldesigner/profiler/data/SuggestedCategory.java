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
@objid ("94f409f8-97a8-42b0-95d8-0b26332fd03c")
@Generated("jsonschema2pojo")
public enum SuggestedCategory {
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

    @objid ("e7dfcabd-b855-49b2-8fc7-045b138ed6cb")
    private final String value;

    @objid ("bd483c2b-97bd-4f40-9c56-c40e79df7629")
    private static final Map<String, SuggestedCategory> CONSTANTS = new HashMap<String, SuggestedCategory>();

    @objid ("ac3f27e7-6e7e-45a2-8499-722d2d80680f")
    SuggestedCategory(String value) {
        this.value = value;
    }

    @objid ("71f23a7d-5c2c-45c0-9b9c-7a3ee065c467")
    @Override
    public String toString() {
        return this.value;
    }

    @objid ("dad28401-2c60-4133-89e9-f3a73d0dc02f")
    public String value() {
        return this.value;
    }

    @objid ("07d35530-9a94-4fe6-852d-6a1da3a9b1bf")
    public static SuggestedCategory fromValue(String value) {
        SuggestedCategory constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }


static {
    for (SuggestedCategory c: values()) {
        CONSTANTS.put(c.value, c);
    }
}
}
