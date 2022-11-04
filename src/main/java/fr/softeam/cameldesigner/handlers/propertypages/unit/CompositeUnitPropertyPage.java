package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("a22e0674-8ba0-4510-ba34-897f0fb3a54b")
public class CompositeUnitPropertyPage<T extends CompositeUnit> extends DimensionedUnitPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("97905294-e905-4785-bd86-9ebdb6eed537")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        
        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getUnits(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME))) {
                Object unit = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComponentsUnits((Unit) unit);
                }else {
                    this._element.removeComponentsUnits((Unit) unit);
                }
            }
        }
        
        else if(this._currentRow == 2){
            this._element.setFormula(value);
        }
        
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("7943eedb-2d9d-4531-a18b-1b9fe6ce199e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Components Unit
        table.addProperty("Components Unit", getCamelValue(this._element.getComponentsUnits()), getAddRemove(CamelDesignerAbstractProxy.getUnits(), this._element.getComponentsUnits()));
        
        //Formula
        table.addProperty("Formula",  getNotNull(this._element.getFormula()));
    }

    @objid ("e836cd48-bc80-4b7a-bb65-3bb6a1d501b0")
    public CompositeUnitPropertyPage(T elt) {
        super(elt);
    }

}
