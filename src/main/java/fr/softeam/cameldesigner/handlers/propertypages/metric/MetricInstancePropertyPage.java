package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureInstancePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("5e3b1e18-9b01-4d32-81cb-8b728aebd248")
public class MetricInstancePropertyPage<T extends MetricInstance> extends FeatureInstancePropertyPage<T> {
    @objid ("98fcdec2-19ca-4eb9-8089-f20d044a222f")
    private List<ModelElement> _objectBinding = null;

    @objid ("520b6771-a398-4dea-9e07-8b8d85538d93")
    private List<ModelElement> _metricContext = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("06938158-21da-4f9a-89f5-a1f8faaa25af")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._objectBinding, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricObjectBinding.STEREOTYPE_NAME)) {
                this._element.setObjectBinding((MetricObjectBinding) elt);
            }
        }
        
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._metricContext, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME)) {
                this._element.setMetricContext((MetricContext) elt);
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComposingMetricInstances((MetricInstance) obj);
                }else {
                    this._element.removeComposingMetricInstances((MetricInstance) obj);
                }
            }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("6955a07d-d325-479a-9a2b-7f5058de3c1d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Object Binding
        this._objectBinding = CamelDesignerAbstractProxy.getEvents();
        table.addProperty("Object Binding", getCamelName(this._element.getObjectBinding()), getCamelNames(this._objectBinding));
        
        //Metric Context
        this._metricContext = CamelDesignerAbstractProxy.getEvents();
        table.addProperty("Metric Context", getCamelName(this._element.getMetricContext()), getCamelNames(this._metricContext));
        
        //Composing Metric Instances
        table.addProperty("Composing Metric Instances", getCamelValue(this._element.getComposingMetricInstances()), getAddRemove(MetricInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComposingMetricInstances()));
    }

    @objid ("81b52169-d819-44c1-8768-bb8c1cadd05d")
    public MetricInstancePropertyPage(T elt) {
        super(elt);
    }

}
