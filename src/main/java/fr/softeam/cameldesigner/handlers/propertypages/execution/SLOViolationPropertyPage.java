package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("fc39fb0b-e1a8-4b6c-b5b6-f9055fde833c")
public class SLOViolationPropertyPage<T extends SLOViolation> extends CausePropertyPage<T> {
    @objid ("60ed485e-7201-4ad3-bf55-caf13ff354f0")
    private List<ModelElement> _slo = null;

    @objid ("3ec6ef74-a70e-43d5-a5b3-ff9205ab2860")
    private List<ModelElement> _measurement = null;

    @objid ("45788fa6-9430-45e3-b8b0-b37db8af5c5c")
    private List<ModelElement> _assessmentTime = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("7925f2cd-1944-4487-8863-408bbc037a08")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._slo, value);
            if (ServiceLevelObjective.canInstantiate(elt)) {
                this._element.setSlo(ServiceLevelObjective.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt =  getModelElt(this._measurement, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Measurement.STEREOTYPE_NAME)) {
                this._element.setMeasurement((Measurement)elt);
            }
        }
        
        
        else if(this._currentRow == 3){
            this._element.setAssessmentTime(value);
        
        }
        
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("3955e21d-7e34-4c3b-ae63-6d6eeaf4e69e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //SLO
        this._slo = ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("SLO", getCamelName(this._element.getSlo()), getCamelNames(this._slo));
        
        //Measurement
        this._measurement =CamelDesignerAbstractProxy.getMeasurements();
        table.addProperty("Measurement", getCamelName(this._element.getMeasurement()), getCamelNames(this._measurement));
        
        //Assessment Time
        table.addProperty("Value", getNotNull(this._element.getAssessmentTime()));
    }

    @objid ("1dfe709f-499d-4adb-968c-30672b1dbeba")
    public SLOViolationPropertyPage(T elt) {
        super(elt);
    }

}
