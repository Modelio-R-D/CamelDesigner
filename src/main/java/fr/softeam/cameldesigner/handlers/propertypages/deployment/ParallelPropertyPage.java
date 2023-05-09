package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.constraint.Parallel;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("072dcde3-6d4a-4d3f-9ef2-c3cc24a2449e")
public class ParallelPropertyPage<T extends Parallel> extends FeaturePropertyPage<T> {
    @objid ("2e1c7ca9-d2c4-4da1-a5f3-a0ceee93c9d1")
    public ParallelPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("25eca544-df95-4be4-aa26-979c174bb2de")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            Class elt1 = (Class) getModelElt(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt1 != null) && (elt1.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME))) {
                Object pc = CamelDesignerProxyFactory.instantiate(elt1);
                if (value.startsWith(this._add)) {
                    this._element.addComponents((SoftwareComponent) pc);
                }else {
                    this._element.removeComponents((SoftwareComponent) pc);
                }
            }
            }
        
        this._currentRow -= 1;
    }

    @objid ("1a5f0e21-c313-4872-b5f1-294aff142be6")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Software Components
         table.addProperty("Software Components", getCamelValue(this._element.getComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComponents()));
    }

}
