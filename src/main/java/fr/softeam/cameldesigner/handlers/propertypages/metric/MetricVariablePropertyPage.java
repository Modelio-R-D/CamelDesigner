package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("e38652b1-391f-4a40-acd0-91468e6b9a3c")
public class MetricVariablePropertyPage<T extends MetricVariable> extends MetricPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("e4b4619c-4f76-4bb8-bf57-19a71902c1b9")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setCurrentConfiguration(Boolean.valueOf(value));
        }
        
        else if(this._currentRow == 2){
            Component elt = (Component) getModelElt(CamelDesignerAbstractProxy.getComponents(), value);
            if (CamelComponent.canInstantiate(elt)) {
                this._element.setComponent(CamelComponent.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 3){
            this._element.setOnNodeCandidates(Boolean.valueOf(value));
        }
        
        else if(this._currentRow == 4){
            this._element.setFormula(value);
        }
        
        else if(this._currentRow == 5){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getMetrics(), value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME)) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComponentMetrics((Metric) mmsObj);
                }else {
                    this._element.removeComponentMetrics((Metric) mmsObj);
                }
            }
        }
        else if(this._currentRow == 6){
             ModelElement elt = getModelElt(CamelDesignerAbstractProxy.getMetricContexts(), value);
            if (CamelComponent.canInstantiate(elt)) {
                this._element.setMetricContext((MetricContext) MetricContext.instantiate(elt));
            }
        }
        
        
        this._currentRow -= 6;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("0531cbff-ef84-4cc2-9ca3-c73994892b2f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Current Configuration
        table.addProperty("Current Configuration", this._element.isCurrentConfiguration());
        
        //Component
        table.addProperty("Component", getCamelName(this._element.getComponent()), getCamelNames(CamelDesignerAbstractProxy.getComponents()));
        
        //On Node Candidates
        table.addProperty("On Node Candidates", this._element.isOnNodeCandidates());
        
        
        //Formula
        table.addProperty("Formula", getNotNull(this._element.getFormula()));
        
        //ComponentMetric Context
        table.addProperty("Component Metric", getCamelValue(this._element.getComponentMetrics()), getAddRemove(CamelDesignerAbstractProxy.getMetrics(), this._element.getComponentMetrics()));
         
        //Component
        table.addProperty("Metric Context", getCamelName(this._element.getMetricContext()), getCamelNames(CamelDesignerAbstractProxy.getMetricContexts()));
    }

    @objid ("de011a31-d91f-40ad-a89c-78a0f4d6b723")
    public MetricVariablePropertyPage(T elt) {
        super(elt);
    }

}
