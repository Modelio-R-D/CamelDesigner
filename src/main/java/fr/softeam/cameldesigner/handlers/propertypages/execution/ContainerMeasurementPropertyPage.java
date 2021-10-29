package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;

public class ContainerMeasurementPropertyPage<T extends ContainerMeasurement> extends MeasurementPropertyPage<T> {
    
    private List<ModelElement> _containerInstance = null;
    private List<ModelElement> _container = null;

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

    public ContainerMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
