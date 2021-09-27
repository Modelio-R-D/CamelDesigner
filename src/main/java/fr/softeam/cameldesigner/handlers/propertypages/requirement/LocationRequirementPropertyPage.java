package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;

public class LocationRequirementPropertyPage<T extends LocationRequirement> extends HardRequirementPropertyPage<T> {

    private List<ModelElement> _locations = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1) {
            this._element.setAllRequired(Boolean.valueOf(value));
        }

        else if(this._currentRow == 2) {
            Enumeration elt = (Enumeration) getModelElt(this._locations, value);
            if ((elt != null) && (Location.canInstantiate(elt))) {
                Object loc = Location.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addLocations((Location) loc);
                }else {
                    this._element.removeLocations((Location) loc);
                }
            }
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //AllRequired
        table.addProperty("AllRequired", this._element.isAllRequired());

        //Location
        this._locations = CamelDesignerAbstractProxy.getLocations();
        table.addProperty("Locations", getCamelValue(this._element.getLocations()), getAddRemove(this._locations, this._element.getLocations()));
    }

    public LocationRequirementPropertyPage(T elt) {
        super(elt);
    }

}
