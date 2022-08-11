package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.Arrays;
import camel.metric.WindowSizeType;
import camel.metric.WindowType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("3945a140-43a0-47da-b8ef-7175b26a4ad9")
public class WindowPropertyPage<T extends Window> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4068a9e5-386a-4747-997f-cd9b4350fd01")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getUnits(), value);
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
        
        
        this._currentRow -= 5;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("7699e556-9cd4-4994-96c5-9906ede4b2d5")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Time Unit
        table.addProperty("Time Unit", getCamelName(this._element.getTimeUnit()), getCamelNames(CamelDesignerAbstractProxy.getUnits()));
        
        //Window Type
        String[] values = Arrays.stream(WindowType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Window Type", getNotNull(this._element.getWindowType()), values);
        
        //Size Type
        values = Arrays.stream(WindowSizeType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Size Type", getNotNull(this._element.getSizeType()), values);
        
        //Measurement Size
        table.addProperty("Start", getNotNull(this._element.getMeasurementSize()));
        
        //Time Size
        table.addProperty("Time Size", getNotNull(this._element.getTimeSize()));
    }

    @objid ("5067070d-79e4-4c9e-9fe5-1a63c84db1f9")
    public WindowPropertyPage(T elt) {
        super(elt);
    }

}
