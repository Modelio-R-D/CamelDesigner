package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;

public class SoftwareComponentMeasurementPropertyPage<T extends SoftwareComponentMeasurement> extends MeasurementPropertyPage<T> {
    
    private List<ModelElement> _software_component_instance = null;

    private List<ModelElement> _software_component = null;

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
            Instance elt = (Instance) getModelElt(this._software_component_instance, value);
            if (SoftwareComponentInstance.canInstantiate(elt)) {
                this._element.setSoftwareComponentInstance(SoftwareComponentInstance.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 2){
        	ModelElement  elt =  getModelElt(this._software_component, value);
            if (SoftwareComponent.canInstantiate(elt)) {
                this._element.setSoftwareComponent(SoftwareComponent.safeInstantiate((Component) elt));
                }
        }
        
        this._currentRow -= 2;

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
        
        //Software Component Instance
        this._software_component_instance = SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Software Component Instance", getCamelName(this._element.getSoftwareComponentInstance()), getCamelNames(this._software_component_instance));

        //Software Component 
        this._software_component = SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Software Component ", getCamelName(this._element.getSoftwareComponent()), getCamelNames(this._software_component));

    }

    public SoftwareComponentMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
