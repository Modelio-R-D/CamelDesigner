package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("d5e3f916-27ef-444e-83ef-120b3a283a61")
public class PaaSMeasurementPropertyPage<T extends PaaSMeasurement> extends MeasurementPropertyPage<T> {
    @objid ("c379cc3c-1651-4063-87f0-78c7b85ca9f1")
    private List<ModelElement> _paasInstance = null;

    @objid ("a55296f3-8040-4189-bf04-685fb9b6105f")
    private List<ModelElement> _paas = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("acaa5bf3-8c13-40b1-948f-7e7fcc255500")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        
        if(this._currentRow == 1){
            Instance elt = (Instance) getModelElt(this._paasInstance, value);
            if (PaaSInstance.canInstantiate(elt)) {
                this._element.setPaaSInstance(PaaSInstance.safeInstantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt =  getModelElt(this._paas, value);
            if (PaaS.canInstantiate(elt)) {
                this._element.setPaaS(PaaS.safeInstantiate((Component)elt));
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
    @objid ("fc7c8522-b193-44ef-8d11-587db36af24e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        // Pass Instance
        this._paasInstance = PaaSInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Pass Instance", getCamelName(this._element.getPaaSInstance()), getCamelNames(this._paasInstance));
        
        // Pass 
        this._paas = PaaS.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Pass", getCamelName(this._element.getPaaS()), getCamelNames(this._paas));
    }

    @objid ("db3ea533-11f1-49d9-9693-16e20acb0f9a")
    public PaaSMeasurementPropertyPage(T elt) {
        super(elt);
    }

}
