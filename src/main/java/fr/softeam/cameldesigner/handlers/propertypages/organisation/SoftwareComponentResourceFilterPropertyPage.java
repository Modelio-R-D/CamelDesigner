package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("08e0b08c-a6c4-4af7-a5b8-d933d69544d2")
public class SoftwareComponentResourceFilterPropertyPage<T extends SoftwareComponentResourceFilter> extends ResourceFilterPropertyPage<T> {
    @objid ("5a42e633-fb34-4aa0-a6ac-366be0d79bc8")
    private List<ModelElement> _application = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("3017bd52-3e43-48c2-9d58-0b16d23f78df")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        
        if(this._currentRow == 1){
            this._element.setEveryComponent(Boolean.valueOf(value));
        
        }
        else if(this._currentRow == 2) {
            ModelElement elt = getModelElt(this._application, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME)) {
                this._element.setApplication((CamelModel) elt);
            }
        }
        
        else if(this._currentRow == 3) {
            Class elt = (Class) getModelElt(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addSoftwareComponents((SoftwareComponent) mmsObj);
                }else {
                    this._element.removeSoftwareComponents((SoftwareComponent) mmsObj);
                }
            }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("7f5fadeb-7ce4-45d4-bc48-205225ee3ca8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Every component
        table.addProperty("Every Component", this._element.isEveryComponent());
        
        //Application
        this._application = Application.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Application", getCamelName(this._element.getApplication()), getCamelNames(this._application));
        
        //Software Components
        table.addProperty("Software Components", getCamelValue(this._element.getSoftwareComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getSoftwareComponents()));
    }

    @objid ("b5a5f7e0-6c59-4815-81b9-6271180888fe")
    public SoftwareComponentResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
