package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;

public class VMMeasurementPropertyPage<T extends VMMeasurement> extends FeatureClassPropertyPage<T> {
  
    private List<ModelElement> _vm = null;
    private List<ModelElement> _vmInstance = null;

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
            Instance elt = (Instance) getModelElt(this._vmInstance, value);
            if (VMInstance.canInstantiate(elt)) {
                this._element.setVmInstance(VMInstance.safeInstantiate(elt));
            }
        }


        else if(this._currentRow == 2){
            ModelElement elt =  getModelElt(this._vm, value);
            if (VM.canInstantiate(elt)) {
                this._element.setVm(VM.safeInstantiate((Component) elt));
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
        
    	// VM Instance
        this._vmInstance = VMInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("VM Instance", getCamelName(this._element.getVmInstance()), getCamelNames(this._vmInstance));

		// VM
        this._vm = VM.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("VM ", getCamelName(this._element.getVm()), getCamelNames(this._vm));
 

    }

    public VMMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
