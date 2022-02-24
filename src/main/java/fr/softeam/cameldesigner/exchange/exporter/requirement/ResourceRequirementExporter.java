package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d23db89a-a16f-44ab-9728-b29a7cf0882a")
public class ResourceRequirementExporter<T extends ResourceRequirement> extends HardRequirementExporter<T> {
    @objid ("a8365dfe-9e66-4be7-a7c9-22f8f5197e2c")
    public ResourceRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("34ce4506-61ac-4578-b763-f4e98eeb0ff8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createResourceRequirement();
    }

    @objid ("9ffda416-60d0-4339-9d07-bc8a177e70dd")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a566650f-dada-4693-b3e1-9508d0728510")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
