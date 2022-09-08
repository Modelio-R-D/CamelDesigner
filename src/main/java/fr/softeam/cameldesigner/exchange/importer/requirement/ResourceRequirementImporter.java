package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.ResourceRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3d2e9a3e-ca6f-4f52-b6df-c76c92776045")
public class ResourceRequirementImporter<T extends ResourceRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> extends HardRequirementImporter<T,V> {
    @objid ("b97e9b6f-85c9-4633-8777-67d2583f0816")
    public ResourceRequirementImporter() {
    }

    @objid ("d2c8827b-acf7-477c-bb93-0f9159e1ce91")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitResourceRequirement(this);
    }

    @objid ("2b9a67b6-849f-40e6-b02c-dcb741204e43")
    public ResourceRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("452f6e7a-26af-480b-85e6-e7f8f7456d55")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.create();
    }

    @objid ("2c3bbe92-62f5-45ba-a26c-1b17fb2ee458")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
