package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("69837d2c-98a2-4236-891f-89695a3b2e15")
public class ImageRequirementExporter<T extends ImageRequirement> extends HardRequirementExporter<T> {
    @objid ("263ab3df-226a-4ac1-a5bb-e5c23761df07")
    public ImageRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("7b5cb054-6bda-49cb-9fc8-90e0c8462fc8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createImageRequirement();
    }

    @objid ("cd3da706-4367-45b2-83fe-36848bbf09fa")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("8af3e1f9-5d47-4c0a-9f53-01b8948548e3")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
