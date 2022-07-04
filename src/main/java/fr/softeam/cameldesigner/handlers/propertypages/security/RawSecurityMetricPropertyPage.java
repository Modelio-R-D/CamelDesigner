package fr.softeam.cameldesigner.handlers.propertypages.security;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("b96147c7-471d-4b65-9725-d34cac27ee21")
public class RawSecurityMetricPropertyPage<T extends RawSecurityMetric> extends FeaturePropertyPage<T> {
    @objid ("142cfa59-e99f-49a5-bcbd-ce0878eef600")
    private List<ModelElement> _domain = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("07b2f788-74c1-44a8-8c0e-647f03efcd21")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._domain, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME)) {
                this._element.setDomain((SecurityDomain) elt);
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
    @objid ("74dab846-6c79-455d-b8dc-910491130e33")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._domain = SecurityDomain.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Domain", getCamelName(this._element.getDomain()), getCamelNames(this._domain));
    }

    @objid ("35066b93-8495-4916-9ca7-24306edd582c")
    public RawSecurityMetricPropertyPage(T elt) {
        super(elt);
    }

}
