package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("cd2bff5b-4751-4be5-9785-f5908402cc9d")
public class DataResourceFilterPropertyPage<T extends DataResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c67bc0f6-d1cb-4365-b1fb-bd4d8c9670e6")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(Data.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addData((Data) obj);
                }else {
                    this._element.removeData((Data) obj);
                }
            }
        }
        else if(this._currentRow == 2) {
            Class elt = (Class) getModelElt(DataInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addDataInstances((DataInstance) obj);
                }else {
                    this._element.removeDataInstances((DataInstance) obj);
                }
            }
        }
        
        else if(this._currentRow == 3) {
            Class elt = (Class) getModelElt(Location.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Location.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addLocations((Location) mmsObj);
                }else {
                    this._element.removeLocations((Location) mmsObj);
                }
            }
        }
        
        else if(this._currentRow == 4) {
            this._element.setEveryData(Boolean.valueOf(value));
        }
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("ac957488-6a07-47b5-b136-bbda490ba69e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Data", getCamelValue(this._element.getData()), getAddRemove(Data.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getData()));
        table.addProperty("Data Instances", getCamelValue(this._element.getDataInstances()), getAddRemove(DataInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getDataInstances()));
        table.addProperty("Locations", getCamelValue(this._element.getLocations()), getAddRemove(Location.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getLocations()));
        
        table.addProperty("Every Data", this._element.isEveryData());
    }

    @objid ("3a642576-a307-492c-8485-543522119d06")
    public DataResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
