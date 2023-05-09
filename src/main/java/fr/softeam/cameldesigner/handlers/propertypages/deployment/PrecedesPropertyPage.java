package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.substitution.Precedes;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("154f62e8-8934-4cf6-a89d-b76c44805188")
public class PrecedesPropertyPage<T extends Precedes> extends FeaturePropertyPage<T> {
    @objid ("56e81ba4-ca72-402f-bb5f-c6f08eb8dad8")
    public PrecedesPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("c1428f47-b269-4336-be2d-8ee75b56f7cd")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            Class elt = (Class) getModelElt(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (SoftwareComponent.canInstantiate(elt)) {
                this._element.setComponent( (SoftwareComponent) SoftwareComponent.safeInstantiate(elt));
            }
            break;
        
        case 2 :
            Class elt1 = (Class) getModelElt(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null) && (elt1.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME))) {
                Object pc = CamelDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addPrecededComponents((SoftwareComponent) pc);
                }else {
                    this._element.removePrecededComponents((SoftwareComponent) pc);
                }
            }
        }
        
        this._currentRow -= 2;
    }

    @objid ("4f3ed6b3-f2cb-4c4b-9f2e-6404fca045ec")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        //Component
        table.addProperty("Component",getCamelName(this._element.getComponent()), getCamelNames(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //PrecedesComponent
         table.addProperty("Precedes Component", getCamelValue(this._element.getPrecededComponents()), getAddRemove(SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getPrecededComponents()));
    }

}
