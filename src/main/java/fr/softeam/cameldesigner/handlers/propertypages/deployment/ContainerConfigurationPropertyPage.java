package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("4da4db48-0c5d-40a8-8273-47f65d88ddde")
public class ContainerConfigurationPropertyPage<T extends ContainerConfiguration> extends ConfigurationPropertyPage<T> {
    @objid ("9f9c8c06-9229-4df4-a76f-323c21548b54")
    public ContainerConfigurationPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("7d486d9c-f01c-4785-9fc6-b197e1707dfa")
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

    @objid ("78de7cfa-fdf0-4c06-b532-255aa21d698b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Image id", getNotNull(this._element.getImageId()));
        table.addProperty("Start Command", getNotNull(this._element.getStartCommandNote()));
        table.addProperty("Update Command", getNotNull(this._element.getUpdateCommandNote()));
        table.addProperty("Environment", getCamelName(this._element.getEnvironment()), getCamelNames(Feature.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

}
