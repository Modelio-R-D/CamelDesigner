package fr.softeam.cameldesigner.handlers.propertypage;

import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.AttributeAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.CamelModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.FeaturePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.ScriptConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.SoftwareComponentPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.OptimisationRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.ResourceRequirementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Component;

public class PropertyPageManager {
    public int changeProperty(ModelElement elt, int row, String value) {
        IPropertyContent propertyPage = getPropertyPage(elt);
        
        if (propertyPage != null) {
            propertyPage.changeProperty(row, value);
        }
        return row;
    }

    /**
     * build the property table of the selected Elements
     * @param element : the selected element
     * 
     * @param table : the property table
     */
    public void update(ModelElement elt, IModulePropertyTable table) {
        IPropertyContent propertyPage = getPropertyPage(elt);
        
        if (propertyPage != null) {
            propertyPage.update(table);
        }
    }

    private IPropertyContent getPropertyPage(ModelElement elt) {
        IPropertyContent result = null;
        
        if(CamelModel.canInstantiate(elt)) {
            result = new CamelModelPropertyPage(CamelModel.instantiate((org.modelio.metamodel.uml.statik.Package)elt));
        
        } else if (SoftwareComponent.canInstantiate(elt)) {
            result = new SoftwareComponentPropertyPage(SoftwareComponent.instantiate((Component) elt));
        
        } else if (ScriptConfiguration.canInstantiate(elt)) {
            result = new ScriptConfigurationPropertyPage(ScriptConfiguration.instantiate((Artifact) elt));
        
        } else if (OptimisationRequirement.canInstantiate(elt)) {
            result = new OptimisationRequirementPropertyPage(OptimisationRequirement.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (ResourceRequirement.canInstantiate(elt)) {
            result = new ResourceRequirementPropertyPage(ResourceRequirement.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (FeatureClass.canInstantiate(elt)) {
            result = new FeaturePropertyPage(FeatureClass.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (AttributeAttribute.canInstantiate(elt)) {
            result = new AttributeAttributePropertyPage(AttributeAttribute.instantiate((org.modelio.metamodel.uml.statik.Attribute) elt));
        }
        return result;
    }

}