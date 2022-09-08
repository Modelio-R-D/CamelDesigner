package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.VerticalScaleRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6d762c8e-d8f3-4c1c-ac5c-1dca9ffa0180")
public class VerticalScaleRequirementImporter<T extends VerticalScaleRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement> extends ScaleRequirementImporter<T,V> {
    @objid ("8486ab69-7092-4b6d-a406-63f4b6a4b5c2")
    public VerticalScaleRequirementImporter() {
    }

    @objid ("02dfc7ec-a7ed-43c4-8e51-37c735971dbb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitVerticalScaleRequirement(this);
    }

    @objid ("518f327c-4b26-40e1-a7ce-2815b9888985")
    public VerticalScaleRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("dff2a170-9508-4dba-8322-eaded4c4e838")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.create();
    }

    @objid ("5acdbfd1-74e1-4075-b074-472d37a9ba06")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
