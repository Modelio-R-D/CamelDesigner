package fr.softeam.cameldesigner.handlers.propertypages.metric;

<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
import camel.metric.GroupingType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("b4a0eb59-7d17-496c-82f0-efb4c83f0ea1")
public class CompositeMetricContextPropertyPage<T extends CompositeMetricContext> extends MetricContextPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("e79dad3e-e222-4598-b499-4d7a769de63a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setGroupingType(value);
        }
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(CamelDesignerAbstractProxy.getMetricContexts(), value);
            if ((elt!=null) &&(elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComposingMetricContexts((MetricContext) mmsObj);
                }else {
                    this._element.removeComposingMetricContexts((MetricContext) mmsObj);
                }
            }
        }
        else if(this._currentRow == 3){
             Class elt = (Class) getModelElt(Window.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
             if (Window.canInstantiate(elt)) {
                 this._element.setWindow(Window.instantiate(elt));
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
    @objid ("39889527-fd5e-4749-9b55-336d172fe258")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Grouping Type
        String[] values = Arrays.stream(GroupingType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Grouping Type", getNotNull(this._element.getGroupingType()), values);
        
        //Composing Metric Context
        table.addProperty("Composing Metric Context", getCamelValue(this._element.getComposingMetricContexts()), getAddRemove(CamelDesignerAbstractProxy.getMetricContexts(), this._element.getComposingMetricContexts()));
        
        //Window
        table.addProperty("Window", getCamelName(this._element.getWindow()), getCamelNames(Window.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("1d5516ca-839e-4001-9f94-e732c05bc2a8")
    public CompositeMetricContextPropertyPage(T elt) {
        super(elt);
    }

}
