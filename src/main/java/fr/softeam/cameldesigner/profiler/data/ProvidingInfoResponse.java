package fr.softeam.cameldesigner.profiler.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Root
 * <p>
 */
@objid ("5161f725-644b-4842-ba04-ae88d86a0e2d")
@Generated("jsonschema2pojo")
public class ProvidingInfoResponse {
    /**
     * Status
     * <p>
     * 
     * (Required)
     */
    @objid ("1e8b8d87-9027-463e-869c-9978e8f3a305")
    @SerializedName("status")
    @Expose
    private String status = "";

    /**
     * Code
     * <p>
     * 
     * (Required)
     */
    @objid ("e6226852-f769-4049-8a71-5ad7243f9173")
    @SerializedName("code")
    @Expose
    private String code = "";

    /**
     * Message
     * <p>
     * 
     * (Required)
     */
    @objid ("3dd3f347-b8e5-4302-a080-6d35a4af3224")
    @SerializedName("message")
    @Expose
    private String message = "";

    /**
     * Status
     * <p>
     * 
     * (Required)
     */
    @objid ("b848cb02-d9c2-4306-91aa-aa0d4dc9e905")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * 
     * (Required)
     */
    @objid ("efc3dc91-e0e6-495e-a260-230d74617b9b")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Code
     * <p>
     * 
     * (Required)
     */
    @objid ("79670efe-8278-404a-8a71-670bc6b4c499")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * 
     * (Required)
     */
    @objid ("e5d7d4fb-0aff-4207-8167-19d4c5030a36")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     */
    @objid ("2b61d9a4-d777-4172-804c-8bc159ac194c")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     */
    @objid ("9adc3549-a689-44a9-8345-4701dba99258")
    public void setMessage(String message) {
        this.message = message;
    }

}
