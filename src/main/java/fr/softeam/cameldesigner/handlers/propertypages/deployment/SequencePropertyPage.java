package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Sequence;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class SequencePropertyPage <T extends Sequence> extends FeaturePropertyPage<T>{

	public SequencePropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}
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
	 
	@Override
	public void update(IModulePropertyTable table) {
    super.update(table);
    
    //PrecedesComponent
    // table.addProperty("Components", getCamelValue(this._element.getComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComponents()));
    
}


}
