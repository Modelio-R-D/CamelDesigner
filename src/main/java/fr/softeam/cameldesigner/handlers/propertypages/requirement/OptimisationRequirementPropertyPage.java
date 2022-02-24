package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("49fc2b50-4a75-408b-a5df-a2721e7e8c28")
public class OptimisationRequirementPropertyPage<T extends OptimisationRequirement> extends SoftRequirementPropertyPage<T> {
    @objid ("79b3d784-07bf-45d9-b10f-c2ffc8d92471")
    private List<ModelElement> _metricContexts;

    @objid ("50965ce8-1284-44ad-afea-8cbdc0af1fba")
    private List<ModelElement> _metricVariables;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("965a93bd-12ad-4a34-bc9b-362779db4b2a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            if (value.equals("")) {
                this._element.setMetricContext(null);
            }else {
                ModelElement metricContex = getModelElt(_metricContexts, value);
                if (MetricContext.canInstantiate(metricContex)) {
                    this._element.setMetricContext((MetricContext) CamelDesignerProxyFactory.instantiate(metricContex));
                }
            }
            break;
        
        case 2 :
            if (value.equals("")) {
                this._element.setMetricVariable(null);
            }else {
                ModelElement metricVariable = getModelElt(_metricVariables, value);
                if (MetricVariable.canInstantiate(metricVariable)) {
                    this._element.setMetricVariable((MetricVariable) CamelDesignerProxyFactory.instantiate(metricVariable));
                }
            }
            break;
        
        case 3 :
            Boolean minimise = Boolean.valueOf(value);
            this._element.setMinimise(minimise);
            break;
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("44c67d3f-ad3b-4415-bc3a-26b48ae21143")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //MetricContext
        this._metricContexts = CamelDesignerAbstractProxy.getMetricContexts();
        table.addProperty("Metric Context", getCamelName(this._element.getMetricContext()), getCamelNames(this._metricContexts));
        
        //MetricVariable
        this._metricVariables = MetricVariable.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Metric Variable", getCamelName(this._element.getMetricVariable()), getCamelNames(this._metricVariables));
        
        //Mimimise
        table.addProperty("Minimise", this._element.isMinimise());
    }

    @objid ("f49c96ec-9b52-4d30-8993-f25a20f72faf")
    public OptimisationRequirementPropertyPage(T elt) {
        super(elt);
    }

}
