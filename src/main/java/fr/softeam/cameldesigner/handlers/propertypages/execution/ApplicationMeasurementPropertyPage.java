package fr.softeam.cameldesigner.handlers.propertypages.execution;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("21995497-65bb-41a4-a810-468e7a5f1955")
public class ApplicationMeasurementPropertyPage<T extends ApplicationMeasurement> extends MeasurementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("722fe0e0-ce42-4e0c-a57c-35cda7ddeaab")
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
    @objid ("28e1865d-4264-43b4-a1da-1d98aa0a794b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8159372b-5cad-4416-97ad-06f78f597e1c")
    public ApplicationMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
