package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("9d99e861-4247-4913-8e29-9e2b644ceee0")
public abstract class UnitPropertyPage<T extends Unit> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("08814222-8375-4f1b-8d5d-4b7554d44904")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getUnits(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME))) {
                Object unit = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addMultipleOf((Unit) unit);
                }else {
                    this._element.removeMultipleOf((Unit) unit);
                }
            }
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f820c893-8b2d-4fa7-b7d4-ed32ba5af1ee")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Multiple of
        table.addProperty("Multiple of", getCamelValue(this._element.getMultipleOf()), getAddRemove(CamelDesignerAbstractProxy.getUnits(), this._element.getMultipleOf()));
    }

    @objid ("178fb898-6ef9-4428-afd9-a02c2d8c22e4")
    public UnitPropertyPage(T elt) {
        super(elt);
    }

}
