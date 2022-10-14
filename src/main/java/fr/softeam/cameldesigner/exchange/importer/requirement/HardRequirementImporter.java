package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.HardRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d4809bac-6c0f-42e4-ab2d-7eabc1aa69b2")
public abstract class HardRequirementImporter<T extends HardRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement> extends RequirementImporter<T,V> {
    @objid ("3e665e4e-ffda-424e-86dc-b8230bf38906")
    public HardRequirementImporter() {
    }

    @objid ("3496c270-0052-405a-ae08-2708e5fbb044")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHardRequirement(this);
    }

    @objid ("f86abd7b-fa4e-4eea-8c4a-0e87e33406c9")
    public HardRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("c49ecfce-0b96-45ec-8d90-628199aef3ce")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

    @objid ("02b88d00-46c9-4389-9fd6-ad548096649b")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

}
