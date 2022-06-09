
package fr.softeam.cameldesigner.profiler.data;

import java.util.ArrayList;
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
public class ProvidingInfo {

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
     * Categories
     * <p>
     *
     * (Required)
     *
     */
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<>();
    /**
     * Language
     * <p>
     *
     * (Required)
     *
     */
    @SerializedName("language")
    @Expose
    private String language = "";
    /**
     * Repository
     * <p>
     *
     * (Required)
     *
     */
    @SerializedName("repository")
    @Expose
    private String repository = "";

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
     * Categories
     * <p>
     *
     * (Required)
     *
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * Categories
     * <p>
     *
     * (Required)
     *
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * Language
     * <p>
     *
     * (Required)
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Language
     * <p>
     *
     * (Required)
     *
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Repository
     * <p>
     *
     * (Required)
     *
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Repository
     * <p>
     *
     * (Required)
     *
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

}
