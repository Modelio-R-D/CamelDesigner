package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("c8c09f65-ad2b-4f4f-8c2e-70f51e76604b")
public abstract class DimensionedUnitPropertyPage<T extends DimensionedUnit> extends UnitPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("e3b7ce11-5556-4a48-b7dd-abae7b643c56")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(UnitDimension.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (UnitDimension.canInstantiate(elt)) {
                this._element.setDimension(UnitDimension.safeInstantiate(elt));
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
    @objid ("9420fec7-70a3-4272-bb13-0f9c1d127da1")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Dimension
        table.addProperty("Dimension", getCamelName(this._element.getDimension()), getCamelNames(UnitDimension.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("c5e16819-5eea-40c3-9a8d-4c00d09f6590")
    public DimensionedUnitPropertyPage(T elt) {
        super(elt);
    }

}
