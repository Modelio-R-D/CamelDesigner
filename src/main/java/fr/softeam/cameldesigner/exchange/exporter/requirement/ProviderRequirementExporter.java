package fr.softeam.cameldesigner.exchange.exporter.requirement;

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
    }

    @objid ("a9a9b20d-db19-4859-8fb4-2b2c75fd01a2")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
