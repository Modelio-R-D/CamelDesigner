package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import java.util.Arrays;
import java.util.List;
import camel.organisation.PermissionActionType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("1d3118c1-93c0-4305-bc7c-a7e9a3284de1")
public class PermissionPropertyPage<T extends Permission> extends FeaturePropertyPage<T> {
    @objid ("cbfc6fbd-7cb1-4d86-bb4c-a2f8754c5803")
    private List<ModelElement> _role = null;

    @objid ("2c7b7299-1f55-46a4-8305-72131ce6f70d")
    private List<ModelElement> _resourceFilter = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4632a433-d3c8-4e8b-bbd4-ee538098728e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._role, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME)) {
                 this._element.setRole((Role) elt);
             }
        }
        
        else if(this._currentRow == 2){
            this._element.setStartTime(value);
        
        }
        
        else if(this._currentRow == 3){
            this._element.setEndTime(value);
        
        }
        
        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(this._resourceFilter, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ResourceFilter.STEREOTYPE_NAME)) {
                this._element.setResourceFilter((ResourceFilter) elt);
            }
        }
        
        else if(this._currentRow == 5){
            this._element.setAction(value);
        
        }
        
        this._currentRow -= 5;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("c8cf6744-e5b6-4025-a308-437e015efe82")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
               //Role
        this._role = Role.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Role", getCamelName(this._element.getRole()), getCamelNames(this._role));
        
        table.addProperty("Start Time", getNotNull(this._element.getStartTime()));
        
        table.addProperty("End Time", getNotNull(this._element.getEndTime()));
        
        //Resource Filter
        this._resourceFilter = ResourceFilter.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Resource Filter", getCamelName(this._element.getResourceFilter()), getCamelNames(this._resourceFilter));
        
        //Action
        //PermissionActionType
        String[] values = Arrays.stream(PermissionActionType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Action", getNotNull(this._element.getAction()), values);
    }

    @objid ("1ec36d55-58b1-487c-992a-ee9b11a63ab9")
    public PermissionPropertyPage(T elt) {
        super(elt);
    }

}
