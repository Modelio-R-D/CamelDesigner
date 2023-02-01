package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;

public class ContainerConfigurationPropertyPage <T extends ContainerConfiguration> extends ConfigurationPropertyPage<T> {

	public ContainerConfigurationPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setImageId(value);
        
        }else 
        	if(this._currentRow == 2){
        		this._element.setStartCommandNote(value);
        
        }else 
            if(this._currentRow == 3){
                this._element.setUpdateCommandNote(value);
            
            }
         else 
             if(this._currentRow == 4){
            	 Class elt = (Class) getModelElt(Feature.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
                 if (Feature.canInstantiate(elt)) {
                     this._element.setEnvironment(Feature.instantiate(elt));
                 }                
             }
        
        this._currentRow -= 4;
    }
    
    
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Image id", getNotNull(this._element.getImageId()));
        table.addProperty("Start Command", getNotNull(this._element.getStartCommandNote()));
        table.addProperty("Update Command", getNotNull(this._element.getUpdateCommandNote()));
        table.addProperty("Environment", getCamelName(this._element.getEnvironment()), getCamelNames(Feature.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
    }

}
