package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class WindowPropertyPage<T extends Window> extends FeaturePropertyPage<T> {

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
            DataType elt = (DataType) getModelElt(this._unit, value);
            if (Unit.canInstantiate(elt)) {
                this._element.setTimeUnit(Unit.instantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            this._element.setWindowType(value);
        }

        else if(this._currentRow == 3){
            this._element.setSizeType(value);
        }

        else if(this._currentRow == 4){
            this._element.setMeasurementSize(value);
        }

        else if(this._currentRow == 5){
            this._element.setTimeSize(value);
        }
        
        else if(this._currentRow == 6){
            this._element.setMeasurementSize(value);
        }


        this._currentRow -= 6;
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

        //Time Unit
        this._unit = CamelDesignerAbstractProxy.getUnits();
        table.addProperty("Time Unit", getCamelName(this._element.getTimeUnit()), getCamelNames(this._unit));

        //Window Type
        table.addProperty("Window Type", this._element.getWindowType());

        //Size Type
        table.addProperty("Size Type", this._element.getSizeType());

        //Measurement Size
        table.addProperty("Start", this._element.getMeasurementSize());

        //Time Size
        table.addProperty("Time Size", this._element.getTimeSize());
        
        //Measurement Size
        table.addProperty("Measurement Size", this._element.getMeasurementSize());

    }

    public WindowPropertyPage(T elt) {
        super(elt);

    }

}
