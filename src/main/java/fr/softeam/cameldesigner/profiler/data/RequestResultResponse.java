
package fr.softeam.cameldesigner.profiler.data;

import java.util.List;
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
public class RequestResultResponse {

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("component_name")
    @Expose
    private String componentName = "";
    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("suggested_categories")
    @Expose
    private List<SuggestedCategory> suggestedCategories = null;

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     * 
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     * 
     */
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     * 
     */
    public List<SuggestedCategory> getSuggestedCategories() {
        return suggestedCategories;
    }

    /**
     * Suggested_categories
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSuggestedCategories(List<SuggestedCategory> suggestedCategories) {
        this.suggestedCategories = suggestedCategories;
    }

}
