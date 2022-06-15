package fr.softeam.cameldesigner.profiler.data;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Root
 * <p>
 */
@objid ("4c0a2eaa-2f64-438b-b564-55eae3ebb477")
@Generated("jsonschema2pojo")
public class RequestResultResponse {
    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("5da98094-b792-4b1a-bdc3-3677f28fd7e1")
    @SerializedName("component_name")
    @Expose
    private String componentName = "";

    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     */
    @objid ("a01f5f7a-06ae-4a24-bf09-9395b2e6f2c2")
    @SerializedName("suggested_categories")
    @Expose
    private List<SuggestedCategory> suggestedCategories = null;

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("3ea60f88-27a1-4bbc-9c74-13e62b617997")
    public String getComponentName() {
        return componentName;
    }

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("b06b1d8c-297e-47fd-9403-49e3bbfb646c")
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     */
    @objid ("283b1c87-771a-4c9a-86c0-c486e8c88133")
    public List<SuggestedCategory> getSuggestedCategories() {
        return suggestedCategories;
    }

    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     */
    @objid ("c1169c30-5850-451a-aeb1-33632592b78d")
    public void setSuggestedCategories(List<SuggestedCategory> suggestedCategories) {
        this.suggestedCategories = suggestedCategories;
    }

}
