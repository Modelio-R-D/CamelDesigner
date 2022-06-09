
package fr.softeam.cameldesigner.profiler.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Root
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class ProvidingInfoResponse {

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("status")
    @Expose
    private String status = "";
    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("code")
    @Expose
    private String code = "";
    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("message")
    @Expose
    private String message = "";

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
