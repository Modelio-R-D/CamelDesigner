package fr.softeam.cameldesigner.handlers.propertypages.security;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("364ce501-c977-41c5-80d8-1f752c19173e")
public class SecurityControlPropertyPage<T extends SecurityControl> extends FeaturePropertyPage<T> {
    @objid ("7320c032-10cb-49c6-a7e9-53dca7c40735")
    private List<ModelElement> _domain = null;

    @objid ("be9866a7-e01a-4791-bdb3-385d04c727d1")
    private List<ModelElement> _subDomain = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("77ceafd2-8128-47bf-a2d8-d3779831c336")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
             this._element.setId(value);
            
        }
        
        
        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._domain, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME)) {
                this._element.setDomain((SecurityDomain) elt);
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._subDomain, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityDomain.STEREOTYPE_NAME)) {
                this._element.setSubDomain((SecurityDomain) elt);
            }
        }
        else if(this._currentRow == 4){
            this._element.setSpecification(value);
        }
        
        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityAttribute.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSecurityProperties((SecurityAttribute) obj);
                }else {
                    this._element.removeSecurityProperties((SecurityAttribute) obj);
                }
            }
        }
        
        else if(this._currentRow == 6){
            Class elt = (Class) getModelElt(RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addRawSecurityMetrics((RawSecurityMetric) obj);
                }else {
                    this._element.removeRawSecurityMetrics((RawSecurityMetric) obj);
                }
            }
        }
        else if(this._currentRow == 7){
            Class elt = (Class) getModelElt(CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addCompositeSecurityMetrics((CompositeSecurityMetric) obj);
                }else {
                    this._element.removeCompositeSecurityMetrics((CompositeSecurityMetric) obj);
                }
            }        }
        
        
        this._currentRow -= 7;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("79cefe01-08ff-467f-a20a-2f642806635c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Event",getNotNull(this._element.getId()));
        
        this._domain = SecurityDomain.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Domain", getCamelName(this._element.getDomain()), getCamelNames(this._domain));
            
        this._subDomain = SecurityDomain.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Sub Domain", getCamelName(this._element.getSubDomain()), getCamelNames(this._subDomain));
        
        table.addProperty("Specification",getNotNull(this._element.getSpecification()));
        
        table.addProperty("Security Properties", getCamelValue(this._element.getSecurityProperties()), getAddRemove(SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSecurityProperties()));
        table.addProperty("Raw Security Metrics", getCamelValue(this._element.getRawSecurityMetrics()), getAddRemove(RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getRawSecurityMetrics()));
        table.addProperty("Composite Security Metrics", getCamelValue(this._element.getCompositeSecurityMetrics()), getAddRemove(CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getCompositeSecurityMetrics()));
    }

    @objid ("a911193a-2a02-4116-9a59-fef08f812cda")
    public SecurityControlPropertyPage(T elt) {
        super(elt);
    }

}
