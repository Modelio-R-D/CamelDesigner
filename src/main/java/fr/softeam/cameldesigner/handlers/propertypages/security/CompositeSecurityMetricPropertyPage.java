package fr.softeam.cameldesigner.handlers.propertypages.security;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("29046394-6a2c-45e1-9a15-f67ca5b5d94a")
public class CompositeSecurityMetricPropertyPage<T extends CompositeSecurityMetric> extends FeaturePropertyPage<T> {
    @objid ("29a91788-84d7-4c37-a1d5-b733e8a4fd3f")
    private List<ModelElement> _domain = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4e567e2d-36c8-4252-bc63-52e2b411bf49")
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
    @objid ("30210114-16fb-4cad-b6ce-840dc791b9da")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._domain = SecurityDomain.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Domain", getCamelName(this._element.getDomain()), getCamelNames(this._domain));
    }

    @objid ("775ab325-cb2b-4163-b6b2-24639eb6febc")
    public CompositeSecurityMetricPropertyPage(T elt) {
        super(elt);
    }

}
