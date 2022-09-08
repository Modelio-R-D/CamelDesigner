package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.PaaSRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2a4fff36-c2a0-4c69-9894-87b1ce9fb7ce")
public class PaaSRequirementImporter<T extends PaaSRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement> extends HardRequirementImporter<T,V> {
    @objid ("9e2b1a68-d5ba-4d9c-8626-e816c20091d7")
    public PaaSRequirementImporter() {
    }

    @objid ("39aa4749-53f4-4af0-adfa-6a2db3e3bb9e")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaSRequirement(this);
    }

    @objid ("e91cd0d4-acd9-449f-80f1-bc14e20fb996")
    public PaaSRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("b6a09624-6105-499e-a8b1-d5fd576e2cb5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.create();
    }

    @objid ("b8d2bf62-c5c0-431d-b850-fe650ced0ede")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
