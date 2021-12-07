package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e097ef3a-1865-4ee4-a301-8928a5fc611d")
public class MetaDataModelPropertyPage<T extends MetaDataModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0bf4506e-f4aa-4059-aaea-5235a221ccb0")
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
    @objid ("14d9e476-ddaa-43a2-9f77-be79889fac47")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("a9e4f280-eb52-459f-b047-fdc89d0857b0")
    public MetaDataModelPropertyPage(T elt) {
        super(elt);
    }

}
