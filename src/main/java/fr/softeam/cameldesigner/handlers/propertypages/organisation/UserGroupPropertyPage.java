package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("4377749b-5a0d-4990-b7a0-8f95f87388aa")
public class UserGroupPropertyPage<T extends UserGroup> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8564188a-9196-400e-a552-6bb12be6e611")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1) {
            Class elt = (Class) getModelElt(User.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addUsers((User) obj);
                }else {
                    this._element.removeUsers((User) obj);
                }
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
    @objid ("d805daa1-d710-459c-8763-e9ce29029ddc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Users", getCamelValue(this._element.getUsers()), getAddRemove(User.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getUsers()));
    }

    @objid ("7c5b5fd7-acba-4ca3-9771-7c2316e54d19")
    public UserGroupPropertyPage(T elt) {
        super(elt);
    }

}
