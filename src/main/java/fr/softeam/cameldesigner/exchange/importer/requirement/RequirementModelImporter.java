package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.RequirementModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("60caac69-ac63-4475-ae4c-ccb843d0aabf")
public class RequirementModelImporter<T extends RequirementModel, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> extends SubModelImporter<T,V> {
    @objid ("7becdf98-80b4-4503-9f5c-956272197bd5")
    public RequirementModelImporter() {
    }

    @objid ("a9095e42-d846-4ff8-a3c8-f9bc47eb5f85")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequirementModel(this);
    }

    @objid ("87496312-9686-4a1e-a231-1b5fa2cdde18")
    public RequirementModelImporter(T elt) {
        super(elt);
    }

    @objid ("231d250c-8f6c-41d8-96ec-9cbc2e2dad56")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.create();
    }

    @objid ("44cc13f5-1ddd-4aba-8d77-56a27a5d877f")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addRequirementModels(elt);
    }

}
