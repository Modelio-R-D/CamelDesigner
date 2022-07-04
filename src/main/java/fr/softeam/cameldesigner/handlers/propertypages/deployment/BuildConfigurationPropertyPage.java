package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureArtifactPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c05768fb-b938-405f-b565-ef10d9e748ab")
public class BuildConfigurationPropertyPage<T extends BuildConfiguration> extends FeatureArtifactPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("59aa8ebf-9205-47c0-8a61-eb084d77fc40")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setArtifactId(value);
            break;
        
        case 2 :
            this._element.setBuildFramework(value);
            break;
        
        case 3 :
            this._element.setSourceCodeURL(value);
            break;
            
        case 4 :
            this._element.setInclude(value);
            break;
            
        case 5 :
            this._element.setExclude(value);
            break;
        }
            
            this._currentRow -=5;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("abf5b6c4-8fda-4602-a825-7bdeefb30600")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Artifact ID", getNotNull(this._element.getArtifactId()));
        table.addProperty("Build Framework", getNotNull(this._element.getBuildFramework()));
        table.addProperty("Source code URL", getNotNull(this._element.getSourceCodeURL()));
        table.addProperty("Include", getNotNull(this._element.getInclude()));
        table.addProperty("Exclude", getNotNull(this._element.getExclude()));
    }

    @objid ("9fa8bee3-1bef-499b-a9ce-57c7f8efe23f")
    public BuildConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
