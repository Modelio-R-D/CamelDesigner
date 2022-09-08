package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.ScaleRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a7b3fcc5-50c6-4082-8c8b-af0ae0973009")
public abstract class ScaleRequirementImporter<T extends ScaleRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement> extends HardRequirementImporter<T,V> {
    @objid ("2e9fb09f-a879-49dd-88a5-ea4611a1c10d")
    public ScaleRequirementImporter() {
    }

    @objid ("16749dd6-e614-42dc-a6a1-d911fd334496")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitScaleRequirement(this);
    }

    @objid ("aab87f9f-08b5-4c22-a10a-5b73da5ccb82")
    public ScaleRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("8dde5c4c-9744-418f-8b60-d5cd804afd89")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

    @objid ("7adff053-4e70-4545-86cf-341c5c1780e8")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
