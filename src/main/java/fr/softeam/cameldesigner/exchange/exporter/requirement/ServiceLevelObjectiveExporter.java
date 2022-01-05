package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d8f9c7d3-424f-432b-94fd-79b57038b1d7")
public class ServiceLevelObjectiveExporter<T extends ServiceLevelObjective> extends HardRequirementExporter<T> {
    @objid ("3ca211b6-b129-44a7-a6d0-c8664bb5be67")
    public ServiceLevelObjectiveExporter(T elt) {
        super(elt);
    }

    @objid ("968d663e-4482-4e93-bc1c-4d7feb00810c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createServiceLevelObjective();
    }

    @objid ("7b16347a-7e99-41f5-83c5-7c701319bb78")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f9245c87-48ac-4cda-83d6-37157225f3fb")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
