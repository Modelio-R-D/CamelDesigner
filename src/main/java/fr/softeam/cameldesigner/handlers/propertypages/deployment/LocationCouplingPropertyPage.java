package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.ComponentRelationPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("fc07e1d9-c99c-4c2d-a2a3-1fbc1d256c03")
public class LocationCouplingPropertyPage<T extends LocationCoupling> extends ComponentRelationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4b9d21ff-8fd1-465d-b291-1020b963d484")
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
    @objid ("da4ab41a-1306-432f-8e6c-447e82c7f7b4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("64bb2fd0-7519-4e63-a366-38b21422385c")
    public LocationCouplingPropertyPage(T elt) {
        super(elt);
    }

}
