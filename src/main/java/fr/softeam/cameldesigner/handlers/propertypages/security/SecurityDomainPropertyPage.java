package fr.softeam.cameldesigner.handlers.propertypages.security;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("e5ad43f1-3c60-441d-9a02-1b7e22316c2b")
public class SecurityDomainPropertyPage<T extends SecurityDomain> extends FeaturePropertyPage<T> {
    @objid ("ad077c64-3699-400a-b3c9-d0c853ab5c67")
    private List<ModelElement> _subDomains = SecurityDomain.MdaTypes.STEREOTYPE_ELT.getExtendedElement();

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4bad27f1-9081-4d31-88ca-0091b968b4d9")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setId(value);
            break;
        
        case 2 : 
            // subDomains
            ModelElement elt = getModelElt(this._subDomains, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME)) {
                Object secDomObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSubDomains((SecurityDomain) secDomObj);
                }else {
                    this._element.removeSubDomains((SecurityDomain) secDomObj);
                }
            }
            break;
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4179a506-b7d0-4255-aadc-9557bf7da195")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //id
        table.addProperty("id", this._element.getId());
        
        //SubDomains
        table.addProperty("subDomains", getCamelValue(this._element.getSubDomains()), getAddRemove(this._subDomains, this._element.getSubDomains()));
    }

    @objid ("26db7512-5387-4365-94e9-83f67e960419")
    public SecurityDomainPropertyPage(T elt) {
        super(elt);
    }

}
