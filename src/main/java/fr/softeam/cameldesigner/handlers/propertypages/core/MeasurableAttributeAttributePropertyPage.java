package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("bf4f798e-4a7d-41a1-91ae-3677727ecdbd")
public class MeasurableAttributeAttributePropertyPage<T extends MeasurableAttributeAttribute> extends QualityAttributeAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("7744db81-94a2-4311-98fd-4fd4f6607a66")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt!=null) &&(elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME))) {
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
    @objid ("c129f58c-b8be-40b0-beda-dbb1fbe40714")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Sensor
        table.addProperty("Sensors", getCamelValue(this._element.getSensors()), getAddRemove(Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSensors()));
    }

    @objid ("db73a741-28bd-48f4-9659-f22daf7f1d31")
    public MeasurableAttributeAttributePropertyPage(T elt) {
        super(elt);
    }

}
