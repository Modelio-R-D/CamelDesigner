package fr.softeam.cameldesigner.handlers.propertypages.location;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;

@objid ("6742798b-5010-4709-a1d9-929b26d0ed83")
public class CloudLocationPropertyPage<T extends CloudLocation> extends LocationPropertyPage<T> {
    @objid ("84e4adae-444a-441e-8c9d-edfcbcb54200")
    private List<ModelElement> _parent = null;

    @objid ("34894df5-0f4e-4631-9020-beed8c70ec18")
    private List<ModelElement> _geographicalRegion = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("78374501-d2b6-40d8-94a4-a9de16db216e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1){
            this._element.setIsAssignable(Boolean.valueOf(value));

        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._parent, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudLocation.STEREOTYPE_NAME)) {
                this._element.setParent((CloudLocation) elt);
            }
        }

        else if(this._currentRow == 3){
            ModelElement elt = getModelElt(this._geographicalRegion, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, GeographicalRegion.STEREOTYPE_NAME)) {
            this._element.setGeographicalRegion((GeographicalRegion) elt);;
            }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @objid ("f4858ac1-63d1-4c49-821f-6c05ebec4612")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        table.addProperty("Is Assignable", this._element.isIsAssignable());

        //Parent
        this._parent = CloudLocation.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Parent", getCamelName(this._element.getParent()), getCamelNames(this._parent));

               //Geographical Region
        this._geographicalRegion = GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Geographical Region", getCamelName(this._element.getGeographicalRegion()), getCamelNames(this._geographicalRegion));
    }

    @objid ("3f21ac48-1cc7-489b-9fbc-36f7d8b8e7a2")
    public CloudLocationPropertyPage(T elt) {
        super(elt);
    }

}
