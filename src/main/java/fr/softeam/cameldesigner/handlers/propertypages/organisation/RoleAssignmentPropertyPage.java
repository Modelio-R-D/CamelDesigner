package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("3529635a-263b-48e5-8483-7ecec3f65e34")
public class RoleAssignmentPropertyPage<T extends RoleAssignment> extends FeaturePropertyPage<T> {
    @objid ("2b833793-2da5-4eaf-a29c-218e55d8d225")
    private List<ModelElement> _user = null;

    @objid ("3e800a23-9cc7-4eb4-b19b-331aec044d6e")
    private List<ModelElement> _role = null;

    @objid ("3451ad55-d2b7-4e1e-8ec5-894ebe190322")
    private List<ModelElement> _userGroup = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a29199b8-ef0d-41d2-adb8-99a860b66e1a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._user, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME)) {
                this._element.setUser((User) elt);
            }
        }
        
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._role, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Role.STEREOTYPE_NAME)) {
                this._element.setRole((Role) elt);
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._userGroup, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UserGroup.STEREOTYPE_NAME)) {
                this._element.setUserGroup((UserGroup) elt);
            }
        }
        
        else if(this._currentRow == 4){
           
            this._element.setStartTime(value);
            
        }
        
        else if(this._currentRow == 5){
            
            this._element.setEndTime(value);
        
        }
        
        else if(this._currentRow == 6){
        
            this._element.setAssignmentTime(value);
        
        }
        
        this._currentRow -= 6;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("32865b8b-8c8c-4a89-aaca-f90a5124f38f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._user = User.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("User", getCamelName(this._element.getUser()), getCamelNames(this._user));
         
        this._role = Role.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Role", getCamelName(this._element.getRole()), getCamelNames(this._role));
         
        this._userGroup = UserGroup.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("User Group", getCamelName(this._element.getUserGroup()), getCamelNames(this._userGroup));
         
        table.addProperty("Start Time", getNotNull(this._element.getStartTime()));
        table.addProperty("End Time", getNotNull(this._element.getEndTime()));
        table.addProperty("Assignment Time", getNotNull(this._element.getAssignmentTime()));
    }

    @objid ("d0420eae-80f4-4a67-834c-c0af18400aa8")
    public RoleAssignmentPropertyPage(T elt) {
        super(elt);
    }

}
