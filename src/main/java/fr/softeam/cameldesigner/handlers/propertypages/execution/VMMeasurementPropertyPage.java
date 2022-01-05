package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("451847ca-2d63-4a36-9c09-8fe4a9339b52")
public class VMMeasurementPropertyPage<T extends VMMeasurement> extends FeatureClassPropertyPage<T> {
    @objid ("4dc45424-950a-44d4-9eed-07bac2dd2fb6")
    private List<ModelElement> _vm = null;

    @objid ("57d65c9b-1c35-4581-9787-1723a395be29")
    private List<ModelElement> _vmInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ab1c6da4-f99b-4528-96ac-57411e4bc322")
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
    @objid ("05246b35-99d5-4e7e-aa10-5a5c10db6ca5")
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

    @objid ("dcc9338b-8591-46d2-a7bf-e4a05e8e8e45")
    public VMMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
