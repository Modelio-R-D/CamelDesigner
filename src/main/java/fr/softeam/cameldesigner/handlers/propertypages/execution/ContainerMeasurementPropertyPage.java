package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("90d45a35-d602-49f4-befc-ccfd215de1b1")
public class ContainerMeasurementPropertyPage<T extends ContainerMeasurement> extends MeasurementPropertyPage<T> {
    @objid ("4276e835-129f-4e3d-9a99-9bdfae6cc449")
    private List<ModelElement> _containerInstance = null;

    @objid ("c731395f-e003-42cc-8ed3-7a9c6b50036b")
    private List<ModelElement> _container = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("36a037aa-de1f-4b46-a7aa-cd679b4d05f6")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Instance elt = (Instance)getModelElt(this._containerInstance, value);
            if (ContainerInstance.canInstantiate(elt)) {
                this._element.setContainerInstance(ContainerInstance.safeInstantiate( elt));
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt =  getModelElt(this._container, value);
            if (Container.canInstantiate(elt)) {
                this._element.setContainer(Container.safeInstantiate((Component) elt));
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
    @objid ("475a8f73-2f09-400e-a388-7d08168e6b77")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Container Instance
        this._containerInstance = ContainerInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Container Instance", getCamelName(this._element.getContainerInstance()), getCamelNames(this._containerInstance));
        
        
        // Container
        this._container = Container.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Container ", getCamelName(this._element.getContainer()), getCamelNames(this._container));
    }

    @objid ("2b63e893-5bfe-4c30-b9cb-7ff0eb91c1b9")
    public ContainerMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
