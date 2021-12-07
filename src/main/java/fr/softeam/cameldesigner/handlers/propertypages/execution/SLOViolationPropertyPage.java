package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("fc39fb0b-e1a8-4b6c-b5b6-f9055fde833c")
public class SLOViolationPropertyPage<T extends SLOViolation> extends CausePropertyPage<T> {
    @objid ("650abf47-6655-4c1d-8b55-202c5bee1f26")
    private List<ModelElement> _slo = null;

    @objid ("2c96a7d2-ed89-4e0c-819f-3d1db31f5ee5")
    private List<ModelElement> _measurement = null;

    @objid ("ebba3caa-d25e-42d5-bea2-0e656dd42f46")
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
        table.addProperty("Value", getValue(this._element.getAssessmentTime()));
    }

    @objid ("1dfe709f-499d-4adb-968c-30672b1dbeba")
    public SLOViolationPropertyPage(T elt) {
        super(elt);
    }

}
