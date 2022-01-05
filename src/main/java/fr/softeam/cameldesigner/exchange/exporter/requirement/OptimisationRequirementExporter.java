package fr.softeam.cameldesigner.exchange.exporter.requirement;

import camel.requirement.RequirementFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("db9bc91d-f86b-4ecc-9e0d-8be565fbc164")
public class OptimisationRequirementExporter<T extends OptimisationRequirement> extends NamedElementExporter<T> {
    @objid ("5053adef-4d79-4556-ae3b-2125f429f0ea")
    public OptimisationRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("096d3493-5416-44fd-b13a-311a268716ea")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createOptimisationRequirement();
    }

    @objid ("419fde25-4f21-461a-9445-ac0ee965f567")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("9781b357-eb56-4ba3-a42c-afad5ac9623b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
