package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.substitution.Conditional;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("feea665d-30fa-4a7a-8dc3-d4432ef86360")
public class ConditionalPropertyPage<T extends Conditional> extends FeaturePropertyPage<T> {
    @objid ("4f7e958d-e949-4074-8f23-f5d332477783")
    private List<ModelElement> _firstComponent = null;

    @objid ("c719cb17-6dc3-4542-b474-6e55300335e0")
    private List<ModelElement> _secondComponent = null;

    @objid ("f6c0373d-73d2-4bd5-b8b0-c057e1c37a27")
    public ConditionalPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("90be6d78-b999-49a0-934a-32e5a9ae1f2c")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
                   /*
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(CamelConstraint.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (RequirementSet.canInstantiate(elt)) {
                this._element.setConstraint((CamelConstraint) CamelConstraint.instantiate(elt));
            }
        
        }else
        */
         if (this._currentRow == 1){
            Class elt = (Class) getModelElt(this._firstComponent, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME)) {
                this._element.setFirstComponent((SoftwareComponent) elt);
            }
        
         }else if (this._currentRow ==2){
            Class elt = (Class) getModelElt(this._secondComponent, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponent.STEREOTYPE_NAME)) {
                this._element.setSecondComponent((SoftwareComponent) elt);
            }
         }
        this._currentRow -= 2;
    }

    @objid ("60a7ccb8-6bd1-414b-ba02-ca4479b00027")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        // Constraint ??
        
        
        //First Component
        this._firstComponent = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("First Component", getCamelName(this._element.getFirstComponent()), getCamelNames(this._firstComponent));
        
        //Second Component
        this._secondComponent = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Second Component", getCamelName(this._element.getSecondComponent()), getCamelNames(this._secondComponent));
    }

}
