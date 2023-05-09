package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.constraint.Sequence;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ee559ff5-ae4d-4310-ad40-6c6261db040f")
public class SequencePropertyPage<T extends Sequence> extends FeaturePropertyPage<T> {
    @objid ("a6133452-e97f-4953-b247-b78d9e61a2ae")
    public SequencePropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("7b335f7b-e400-44f6-8439-d427f218d60a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            /*
            Class elt1 = (Class) getModelElt(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null) && (elt1.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME))) {
                Object sc = CamelDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addComponents((SoftwareComponent)sc);
                }else {
                    this._element.removeComponents((SoftwareComponent) sc);
                }
            }
        
        */
        }
        this._currentRow -= 1;
    }

    @objid ("1f4129d5-dfbf-4b58-bc27-d5c8ab050dfd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //PrecedesComponent
        // table.addProperty("Components", getCamelValue(this._element.getComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComponents()));
    }

}
