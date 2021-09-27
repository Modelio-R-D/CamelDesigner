package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class SchedulePropertyPage<T extends Schedule> extends FeaturePropertyPage<T> {

    private List<ModelElement> _unit = null;

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

        if(this._currentRow == 1){
           this._element.setStart(value);
        }

        else if(this._currentRow == 2){
            this._element.setEnd(value);
        }

        else if(this._currentRow == 3){
            DataType elt = (DataType) getModelElt(this._unit, value);
            if (Unit.canInstantiate(elt)) {
                this._element.setTimeUnit(Unit.instantiate(elt));
            }
        }

        else if(this._currentRow == 4){
            this._element.setRepetitions(value);
        }

        else if(this._currentRow == 5){
            this._element.setInterval(value);
        }



        this._currentRow -= 5;
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

        //Start
        table.addProperty("Start", this._element.getStart());

        //End
        table.addProperty("End", this._element.getEnd());

        //Time Unit
        this._unit = CamelDesignerAbstractProxy.getUnits();
        table.addProperty("Time Unit", getCamelName(this._element.getTimeUnit()), getCamelNames(this._unit));

        //Repetitions
        table.addProperty("Repetitions", this._element.getRepetitions());

        //Interval
        table.addProperty("Interval", this._element.getInterval());
    }

    public SchedulePropertyPage(T elt) {
        super(elt);

    }

}
