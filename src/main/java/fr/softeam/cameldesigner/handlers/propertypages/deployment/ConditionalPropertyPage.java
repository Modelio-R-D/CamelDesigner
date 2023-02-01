package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Conditional;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Precedes;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class ConditionalPropertyPage <T extends Conditional> extends FeaturePropertyPage<T>{

    private List<ModelElement> _firstComponent = null;
    private List<ModelElement> _secondComponent = null;

	public ConditionalPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

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
