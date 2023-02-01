package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.Arrays;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Switch;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class SwitchPropertyPage <T extends Switch> extends FeaturePropertyPage<T>{

	public SwitchPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void changeProperty(int row, String value) {
	    	super.changeProperty(row, value);
	        
	        if(this._currentRow == 1){
	            Class elt = (Class) getModelElt(CamelDesignerAbstractProxy.getMetricContexts(), value);
	            if (MetricContext.canInstantiate(elt)) {
	                this._element.setMetricContext((MetricContext) MetricContext.safeinstantiate(elt));
	            }
	        }
	        
	        
	        else if(this._currentRow == 2){

	            this._element.setValues(Arrays.asList(value.split(this._eltSeparator)));

	        }
	        
	        else if(this._currentRow == 3){
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
	        
	        this._currentRow -= 3;
	    }
	 
	@Override
	public void update(IModulePropertyTable table) {
     super.update(table);
     
     //Metric Context
     table.addProperty("Metric Context", getCamelValue(this._element.getComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComponents()));
          
     //Values
     String values = "";
     for(String v: this._element.getValues()) {
     	values +=  v  + " ";
     }
     table.addProperty("Values", values);
     
     //Software Components
     table.addProperty("Software Components", getCamelValue(this._element.getComponents()), getAddRemove(SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getComponents()));
     
}

}
