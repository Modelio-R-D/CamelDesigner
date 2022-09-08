package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.Requirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7c4fa8ab-32ef-4498-be00-bb0484c9c018")
public abstract class RequirementImporter<T extends Requirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement> extends FeatureImporter<T,V> {
    @objid ("de62b495-641a-4cba-af3b-9e24d251dd85")
    public RequirementImporter() {
    }

    @objid ("6a91dff8-bb34-4b4a-9913-0a50894a95a2")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequirement(this);
    }

    @objid ("d8a777d7-fbcb-42ed-b6d5-fd7a09330847")
    public RequirementImporter(T elt) {
        super(elt);
    }

    @objid ("9f2344ba-c57c-4beb-9569-745205bafc25")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

}
