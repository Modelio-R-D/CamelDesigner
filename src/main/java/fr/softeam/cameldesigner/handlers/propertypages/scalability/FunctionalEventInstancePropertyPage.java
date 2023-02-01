package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("349141a9-11f7-4874-912c-255bd1a03ac5")
public class FunctionalEventInstancePropertyPage<T extends FunctionalEventInstance> extends FeaturePropertyPage<T> {
    @objid ("7879fbc2-c176-4b20-8aa5-a92ac48514ca")
    private List<ModelElement> _componentInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("717cc1ce-1b66-49ca-88f5-7dd0b2eaeb23")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._componentInstance, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentInstance.STEREOTYPE_NAME)) {
                this._element.setComponentInstance( (ComponentInstance) elt);
            }
        }
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4fdc7b50-63ea-496b-9bbc-1eaa3aa402a7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._componentInstance = ComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Component Instance", getCamelName(this._element.getComponentInstance()), getCamelNames(this._componentInstance));
    }

    @objid ("bb47d901-409b-48eb-be60-831e528f18fe")
    public FunctionalEventInstancePropertyPage(T elt) {
        super(elt);
    }

}
