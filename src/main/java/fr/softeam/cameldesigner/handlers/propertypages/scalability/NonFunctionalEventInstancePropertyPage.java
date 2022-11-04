package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9007080c-d5a3-4a3c-8f47-3e836e4a455f")
public class NonFunctionalEventInstancePropertyPage<T extends NonFunctionalEventInstance> extends FeaturePropertyPage<T> {
    @objid ("feb62c72-1fe5-4a93-968a-0757b44b14c0")
    private List<ModelElement> _metricInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5af80ef5-6e0f-4326-a91c-db426db00daf")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._metricInstance, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME)) {
                this._element.setMetricInstance( (MetricInstance) elt);
            }
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f5f6c3bb-6a6d-42f2-8d5d-6b5b3a18ebbc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Metric instance
        this._metricInstance = MetricInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Metric Instance", getCamelName(this._element.getMetricInstance()), getCamelNames(this._metricInstance));
    }

    @objid ("ba9c5b85-58c8-4dea-958e-1f95c3ade241")
    public NonFunctionalEventInstancePropertyPage(T elt) {
        super(elt);
    }

}
