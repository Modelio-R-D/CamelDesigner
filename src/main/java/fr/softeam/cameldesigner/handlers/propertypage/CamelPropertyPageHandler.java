package fr.softeam.cameldesigner.handlers.propertypage;

import java.util.List;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.AttributeAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.CamelModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.FeatureClassPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.ProvidedCommunicationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.ProvidedHostPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.RequiredCommunicationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.RequiredHostPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.ScriptConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.deploymentproperties.SoftwareComponentPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.OptimisationRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypage.requirementproperties.ResourceRequirementPropertyPage;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CamelPropertyPageHandler extends AbstractModulePropertyPage {
    public CamelPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @Override
    public void update(final List<MObject> selectedElements, final IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.update(table);
            }
        }
    }

    @Override
    public void changeProperty(final List<MObject> selectedElements, final int row, final String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            ModelElement selectedElement = ((ModelElement) selectedElements.get(0));
        
            IPropertyContent propertyPage = getPropertyPage(selectedElement);
        
            if (propertyPage != null) {
                propertyPage.changeProperty(row, value);
            }
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
        
        } else if (CommunicationPort.canInstantiate(elt)) {
        
            CommunicationPort commPort = CommunicationPort.instantiate((org.modelio.metamodel.uml.statik.Port) elt);
        
            if (commPort.getElement().getDirection().equals(PortOrientation.IN))
                result = new ProvidedCommunicationPropertyPage(commPort);
            else  if (commPort.getElement().getDirection().equals(PortOrientation.OUT))
                result = new RequiredCommunicationPropertyPage(commPort);
        
        } else if (HostingPort.canInstantiate(elt)) {
            HostingPort hostingPort = HostingPort.instantiate((org.modelio.metamodel.uml.statik.Port) elt);
            if (hostingPort.getElement().getDirection().equals(PortOrientation.IN))
                result = new ProvidedHostPropertyPage(hostingPort);
            else  if (hostingPort.getElement().getDirection().equals(PortOrientation.OUT))
                result = new RequiredHostPropertyPage(hostingPort);
        
        } else if (ResourceRequirement.canInstantiate(elt)) {
            result = new ResourceRequirementPropertyPage(ResourceRequirement.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (FeatureClass.canInstantiate(elt)) {
            result = new FeatureClassPropertyPage(FeatureClass.instantiate((org.modelio.metamodel.uml.statik.Class) elt));
        
        } else if (AttributeAttribute.canInstantiate(elt)) {
            result = new AttributeAttributePropertyPage(AttributeAttribute.instantiate((org.modelio.metamodel.uml.statik.Attribute) elt));
        
        } else if (SoftwareComponent.canInstantiate(elt)) {
            result = new SoftwareComponentPropertyPage(SoftwareComponent.instantiate((org.modelio.metamodel.uml.statik.Component) elt));
        }
        return result;
    }

}
