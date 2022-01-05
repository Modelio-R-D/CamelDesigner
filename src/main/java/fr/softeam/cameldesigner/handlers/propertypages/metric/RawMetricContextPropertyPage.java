package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Component;

@objid ("f766578b-ffed-4e7d-b720-f99a9184b3c8")
public class RawMetricContextPropertyPage<T extends RawMetricContext> extends MetricContextPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("81ab1c69-ce60-4056-9fb7-f99a756e29a3")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Component elt = (Component) getModelElt(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (Sensor.canInstantiate(elt)) {
                this._element.setSensor(Sensor.instantiate(elt));
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
    @objid ("c5a177a6-2e27-4a6f-9b28-6277c2174476")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Sensor
        table.addProperty("Sensor", getCamelName(this._element.getSensor()), getCamelNames(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("d2159791-fb5f-4634-bf6e-6d98a5005317")
    public RawMetricContextPropertyPage(T elt) {
        super(elt);
    }

}
