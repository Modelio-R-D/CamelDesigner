package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("3dc9a0e5-ecaf-4568-8741-6788681cf3cd")
public class CommunicationMeasurementPropertyPage<T extends CommunicationMeasurement> extends FeatureClassPropertyPage<T> {
    @objid ("831b9eee-98d9-4054-b7a7-94028bcbe050")
    private List<ModelElement> _sourceVMInstance = null;

    @objid ("7ab5cfb6-8cbf-4158-8b54-2f3b7d65cd1e")
    private List<ModelElement> _targetVMInstance = null;

    @objid ("15145c63-e2c0-4d2b-a291-4eb77fa912db")
    private List<ModelElement> _sourceVM = null;

    @objid ("d71d4942-d2e6-44b0-8750-7b1d24ab374b")
    private List<ModelElement> _targetVM = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8601ad95-f704-491a-b98f-5387e6e488d4")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
             Instance  elt = (Instance) getModelElt(this._sourceVMInstance, value);
            if (VMInstance.canInstantiate(elt)) {
                this._element.setSourceVMInstance(VMInstance.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            Instance  elt = (Instance) getModelElt(this._targetVMInstance, value);
            if (VMInstance.canInstantiate(elt)) {
                this._element.setTargetVMInstance(VMInstance.safeInstantiate(elt));
            }
        }
        
        
        else if(this._currentRow == 3){
            ModelElement elt =  getModelElt(this._sourceVM, value);
            if (VM.canInstantiate(elt)) {
                this._element.setSourceVM(VM.safeInstantiate((Component)elt));
            }
        }
        
        
        else if(this._currentRow == 4){
            ModelElement elt = getModelElt(this._targetVM, value);
            if (VM.canInstantiate(elt)) {
                this._element.setTargetVM(VM.safeInstantiate((Component)elt));
            }
        }
        
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("7484f7ff-2165-429d-91aa-d60be5ad4460")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
              
        //Source VM Instance
        this._sourceVMInstance = VMInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Source VM Instance", getCamelName(this._element.getSourceVMInstance()), getCamelNames(this._sourceVMInstance));
        
        //Target VM Instance
        this._targetVMInstance = VMInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Target VM Instance", getCamelName(this._element.getTargetVMInstance()), getCamelNames(this._targetVMInstance));
           
        //Source VM 
        this._sourceVM = VM.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Source VM ", getCamelName(this._element.getSourceVM()), getCamelNames(this._sourceVM));
        
        //Target VM 
        this._targetVM = VM.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Target VM ", getCamelName(this._element.getTargetVM()), getCamelNames(this._targetVM));
    }

    @objid ("cf48ffbb-fe3c-4a16-993e-ca1c3e62a315")
    public CommunicationMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
