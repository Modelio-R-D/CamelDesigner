package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import java.util.List;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

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
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        switch (currentRow) {
        
        case 1 :
        //            ModelElement elt = getModelElt(this._annotations, value);
        //            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
        //                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
        //                if (value.startsWith(this.add)) {
        //                    this.element.addAnnotations((MmsObject) mmsObj);
        //                }else {
        //                    this.element.removeAnnotations((MmsObject) mmsObj);
        //                }
        //            }
        
        case 2 :
            this.element.setAllRequired(Boolean.valueOf(value));
        }
        return currentRow - 2;
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
        
              //Locations
        //                table.addProperty("Locations", this.element);
        //                table.addProperty("Annotations", getCamelValue(this.element.getAnnotations()), getAddRemove(this._annotations, this.element.getAnnotations()));
        
              //AllRequired
        table.addProperty("AllRequired", this.element.isAllRequired());
    }

    public LocationRequirementPropertyPage(T elt) {
        super(elt);
        //        this._locations = CamelDesignerAbstractProxy.getLocations();
    }

}
