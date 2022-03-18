package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("113b1aef-5919-4716-b96a-e57f000454c2")
public class MetricPropertyPage<T extends Metric> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("12a7c393-ffc4-46c2-883d-b60e2b5889e9")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(MetricTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (MetricTemplate.canInstantiate(elt)) {
                this._element.setMetricTemplate(MetricTemplate.safeInstantiate(elt));
            }
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("c3e2ba50-9c67-44fb-96d4-a5b8a29f09e8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Template
        table.addProperty("Template", getCamelName(this._element.getMetricTemplate()), getCamelNames(MetricTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("25d46604-1176-4009-9ee3-d916cd97e318")
    public MetricPropertyPage(T elt) {
        super(elt);
    }

}
