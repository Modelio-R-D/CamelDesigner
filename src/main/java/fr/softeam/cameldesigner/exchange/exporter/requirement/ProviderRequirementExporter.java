package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.CloudType;
import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ce6bc0fb-b214-4321-9f7f-16f635f8d307")
public class ProviderRequirementExporter<T extends ProviderRequirement> extends HardRequirementExporter<T> {
    @objid ("905b5ee9-d83a-4a89-be99-6658f1d33676")
    public ProviderRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("55363456-2a80-4fba-88ab-aa5b9cd8df68")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createProviderRequirement();
    }

    @objid ("9d1a0394-db92-4923-907a-667d227b2b32")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.requirement.ProviderRequirement) {
            camel.requirement.ProviderRequirement pr = (camel.requirement.ProviderRequirement) elt;
            setCloudType(pr);
            setProviderNames(pr);
        }
    }

    @objid ("a9a9b20d-db19-4859-8fb4-2b2c75fd01a2")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("da876011-531c-42ab-a98f-66c90db6bed7")
    private void setProviderNames(camel.requirement.ProviderRequirement pr) {
        if (this._element.getProviderNames()!=null)
        for (String name : this._element.getProviderNames()) {
            pr.getProviderNames().add(name);
        }
    }

    @objid ("7d4f6825-d73a-49e3-bd8f-55a22c91fbbe")
    private void setCloudType(camel.requirement.ProviderRequirement pr) {
        String content = this._element.getCloudType();
        if (content != null)
            pr.setCloudType(CloudType.valueOf(content));
    }

}
