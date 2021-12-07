package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9007080c-d5a3-4a3c-8f47-3e836e4a455f")
public class NonFunctionalEventInstancePropertyPage<T extends NonFunctionalEventInstance> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5af80ef5-6e0f-4326-a91c-db426db00daf")
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
    @objid ("f5f6c3bb-6a6d-42f2-8d5d-6b5b3a18ebbc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ba9c5b85-58c8-4dea-958e-1f95c3ade241")
    public NonFunctionalEventInstancePropertyPage(T elt) {
        super(elt);
    }

}
