package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("39a85190-eff2-41a6-861c-a83c099dad4e")
public class NonFunctionalEventPropertyPage<T extends NonFunctionalEvent> extends FeaturePropertyPage<T> {
    @objid ("86d4c32e-c982-424e-b7fe-ae8a140f6657")
    private List<ModelElement> _metricConstraint = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("e4957df6-b9fd-40b3-aece-155613f8978f")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._metricConstraint, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME)) {
                this._element.setMetricConstraint( (MetricConstraint) elt);
            }
        }
        
        else if(this._currentRow == 2){
            this._element.setIsViolation(Boolean.valueOf(value));
        
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("c4002b84-da23-49b7-85bc-27a817daad21")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Subject
        this._metricConstraint = CamelDesignerAbstractProxy.getMetricContexts();
        table.addProperty("Metric Constraint", getCamelName(this._element.getMetricConstraint()), getCamelNames(this._metricConstraint));
        
        //Is violation
        table.addProperty("Is Violation",this._element.isIsViolation());
    }

    @objid ("eeec7695-a4ed-49a5-baf6-5a0bc8f8d032")
    public NonFunctionalEventPropertyPage(T elt) {
        super(elt);
    }

}
