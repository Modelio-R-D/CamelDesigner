package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.CommunicationRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("997dc0f2-cc54-46d2-9a22-b6fc22929b80")
public class CommunicationPropertyPage<T extends Communication> extends ComponentRelationPropertyPage<T> {
    @objid ("ddf7294b-12f8-4928-9695-bc04020b2f62")
    private List<ModelElement> _providedPortConfiguration = null;

    @objid ("b76bb119-e73e-455a-9ebb-456e6b4f83cf")
    private List<ModelElement> _requiredPortConfiguration = null;

    @objid ("5729f1e4-ad7f-4cad-8cb6-29ba0aab5c2e")
    public CommunicationPropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("21f1b0d7-2b66-47be-9fab-f2e57c0cf542")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._providedPortConfiguration, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME)) {
            this._element.setProvidedPortConfiguration((Configuration)elt);
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt = getModelElt(this._requiredPortConfiguration, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME)) {
            this._element.setRequiredPortConfiguration((Configuration) elt);
            }
        }
        else if(this._currentRow == 3){
             Class elt = (Class) getModelElt(CommunicationRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
             if (CommunicationRequirement.canInstantiate(elt)) {
                 this._element.setRequirement(CommunicationRequirement.safeInstantiate(elt));
             }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("cd5be132-1bce-4624-a2fd-d3a3ac4b1faf")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        //provided Port Configuration
        this._providedPortConfiguration = Configuration.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Provided Port Configuration", getCamelName(this._element.getProvidedPortConfiguration()), getCamelNames(this._providedPortConfiguration));
        
        //Required Port Configuration
        this._requiredPortConfiguration = Configuration.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Required Port Configuration", getCamelName(this._element.getRequiredPortConfiguration()), getCamelNames(this._requiredPortConfiguration));
            
        //Requirement
        table.addProperty("Requirement", getCamelName(this._element.getRequirement()), getCamelNames(CommunicationRequirement.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

}
