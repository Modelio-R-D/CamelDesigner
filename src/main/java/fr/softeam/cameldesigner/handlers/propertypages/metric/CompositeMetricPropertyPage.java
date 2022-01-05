package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("39a5f381-a3b4-4c08-b98c-0e3baef51e96")
public class CompositeMetricPropertyPage<T extends CompositeMetric> extends MetricPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d688dafb-7b46-415c-b6d3-ff73c58559b6")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setFormula(value);
        }
        
        else if(this._currentRow == 2){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getMetrics(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComponentMetrics((Metric) mmsObj);
                }else {
                    this._element.removeComponentMetrics((Metric) mmsObj);
                }
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
    @objid ("87e3af29-8565-4abb-9a1f-e2c8da6e0bd0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Formula
        table.addProperty("Formula", this._element.getFormula());
        
        //Component Metric
        table.addProperty("Component Metric", getCamelValue(this._element.getComponentMetrics()), getAddRemove( CamelDesignerAbstractProxy.getMetrics(), this._element.getComponentMetrics()));
    }

    @objid ("673fd7f9-0241-4af1-936a-a0bfdd8e23dc")
    public CompositeMetricPropertyPage(T elt) {
        super(elt);
    }

}
