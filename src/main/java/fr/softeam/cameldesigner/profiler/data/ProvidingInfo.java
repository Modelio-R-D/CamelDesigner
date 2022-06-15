package fr.softeam.cameldesigner.profiler.data;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Root
 * <p>
 */
@objid ("2f882cea-0d39-4c82-979e-eb574e161383")
@Generated("jsonschema2pojo")
public class ProvidingInfo {
    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("1bcda391-4ee6-4e49-986d-64e0c9d68b36")
    @SerializedName("component_name")
    @Expose
    private String componentName = "";

    /**
     * Categories
     * <p>
     * 
     * (Required)
     */
    @objid ("b53fab3c-29ce-457f-a103-12bc2365e7b1")
    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<>();

    /**
     * Language
     * <p>
     * 
     * (Required)
     */
    @objid ("2f5e047d-eeb2-4517-b520-ec193ca097e4")
    @SerializedName("language")
    @Expose
    private String language = "";

    /**
     * Repository
     * <p>
     * 
     * (Required)
     */
    @objid ("e0a4b6bd-c519-40db-84a4-7322f3dcbf3c")
    @SerializedName("repository")
    @Expose
    private String repository = "";

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("a7fb52f6-c4fb-4c65-ad8c-b1876bd77174")
    public String getComponentName() {
        return componentName;
    }

    /**
     * Component_name
     * <p>
     * 
     * (Required)
     */
    @objid ("88e87137-a568-49a0-9925-c0ace2f268a7")
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Categories
     * <p>
     * 
     * (Required)
     */
    @objid ("c88dd5d0-fe29-4c08-a305-399157240f6a")
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * Categories
     * <p>
     * 
     * (Required)
     */
    @objid ("1951a11d-6859-4c94-b5b7-c5f9b731f3a6")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * Language
     * <p>
     * 
     * (Required)
     */
    @objid ("c473e0fb-a6d6-4954-a965-ce2f7fe952d8")
    public String getLanguage() {
        return language;
    }

    /**
     * Language
     * <p>
     * 
     * (Required)
     */
    @objid ("e1e86394-4068-4b69-8097-bc48fd12b658")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Repository
     * <p>
     * 
     * (Required)
     */
    @objid ("73fa2866-e298-4086-a473-87e014b7cd1f")
    public String getRepository() {
        return repository;
    }

    /**
     * Repository
     * <p>
     * 
     * (Required)
     */
    @objid ("1fa33433-9426-441c-9ef7-ceb57e65c17a")
    public void setRepository(String repository) {
        this.repository = repository;
    }

}
