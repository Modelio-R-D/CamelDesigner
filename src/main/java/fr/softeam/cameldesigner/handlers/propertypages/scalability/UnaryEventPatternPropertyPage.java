package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("c35db71b-fae1-4269-bbbf-486b422d8fd5")
public class UnaryEventPatternPropertyPage<T extends UnaryEventPattern> extends FeaturePropertyPage<T> {
    @objid ("2c5b7b81-096d-4e51-a299-983d20d3d7e5")
    private List<ModelElement> _event = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("203db146-c29a-457d-b220-f521bd850cb6")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        switch (this._currentRow) {
        
        case 1 :
            ModelElement elt =  getModelElt(this._event, value);
            if (Unit.canInstantiate(elt)) {
                this._element.setEvent( (Event)elt);
            }
            break;
            
        case 2 :
            this._element.setOccurrenceNum(value);;
            break;
        
        case 3 :
            this._element.setOperator(value);;
            break;
            
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("bac56497-77e8-4452-81fb-806c96758a74")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Event
        this._event = Event.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Event ", getCamelName(this._element.getEvent()), getCamelNames(this._event));
        
        table.addProperty("Occurence Num",getValue(this._element.getOccurrenceNum()));
        table.addProperty("Operator",getValue(this._element.getOperator()));
    }

    @objid ("b877cba3-e639-47de-9aad-eb2fe8838e2e")
    public UnaryEventPatternPropertyPage(T elt) {
        super(elt);
    }

}
