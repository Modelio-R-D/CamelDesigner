package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("c1e3d22f-dba0-4cc7-8093-4a7716322c90")
public class TimerPropertyPage<T extends Timer> extends FeaturePropertyPage<T> {
    @objid ("909c70a1-db0c-4d70-8dfa-5e0bd3771995")
    private List<ModelElement> _unit = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("fa629a8c-f766-4f71-b934-15ff594c615b")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setType(value);
            break;
        
        case 2 :
            this._element.setTimeValue(value);
            break;
        
        case 3 :
            this._element.setMaxOccurrenceNum(value);
            break;
        
        case 4:
            ModelElement elt =  getModelElt(this._unit, value);
            if (Unit.canInstantiate(elt)) {
                this._element.set((Unit) elt);
            }
            break;
        
        }
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("b7d71319-57af-4c78-a0b5-d7b96fd0ccc2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Type",getValue(this._element.getType()));
        table.addProperty("Time Value",getValue(this._element.getTimeValue()));
        table.addProperty("Max Occurence Num",getValue(this._element.getMaxOccurrenceNum()));
        
        //Unit
        this._unit = Unit.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Unit ", getCamelName(this._element.get()), getCamelNames(this._unit));
    }

    @objid ("90e9a8b4-ec73-4308-bbb1-e447547fbf5c")
    public TimerPropertyPage(T elt) {
        super(elt);
    }

}
