package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Precedes;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class PrecedesPropertyPage <T extends Precedes> extends FeaturePropertyPage<T>{


	public PrecedesPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

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
	            Class elt1 = (Class) getModelElt(SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
	            if ((elt1 != null) && (elt1.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentInstance.STEREOTYPE_NAME))) {
	                Object pc = CamelDesignerProxyFactory.instantiate(elt1);
	                if (value.startsWith(this._add)) {
	                    this._element.addPrecededComponents((SoftwareComponentInstance) pc);
	                }else {
	                    this._element.removePrecededComponents((SoftwareComponentInstance) pc);
	                }
	            }
	        }
	        
	        this._currentRow -= 2;
	    }
	 
	@Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        

        //Component
        table.addProperty("Component",getCamelName(this._element.getComponent()), getCamelNames(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //PrecedesComponent
         table.addProperty("Precedes Component", getCamelValue(this._element.getPrecededComponents()), getAddRemove(SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getPrecededComponents()));
        
   }

   
}
