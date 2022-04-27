package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("7f3ded21-24b7-4e67-b8d2-be8c431244c7")
public class MeasurableAttributeClassPropertyPage<T extends MeasurableAttributeClass> extends QualityAttributeClassPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("22c6a448-88f0-4e8a-a579-e1002e10f6b7")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSensors((Sensor) mmsObj);
                }else {
                    this._element.removeSensors((Sensor) mmsObj);
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
    @objid ("32f79e7d-7dfe-42f5-afff-2ae2caf7d9f0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Sensor
        table.addProperty("Sensors", getCamelValue(this._element.getSensors()), getAddRemove(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSensors()));
    }

    @objid ("1454b696-e246-42e8-9450-b4fc17b33add")
    public MeasurableAttributeClassPropertyPage(T elt) {
        super(elt);
    }

}
