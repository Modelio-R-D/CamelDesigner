package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c47fb4c1-17fb-400f-b0b4-e6718481cfd3")
public class FeatureArtifactPropertyPage<T extends FeatureArtifact> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("80d3300f-bde3-4b1a-90b2-3120b21cc4d7")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("e6a17be6-ae00-4778-bfc4-f5e788500da2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("e8c60036-af81-4b0d-b318-b45ae2e54cc5")
    public FeatureArtifactPropertyPage(T elt) {
        super(elt);
    }

}
