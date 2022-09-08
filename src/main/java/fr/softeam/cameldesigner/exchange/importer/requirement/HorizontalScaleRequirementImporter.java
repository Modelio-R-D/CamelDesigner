package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.HorizontalScaleRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("e31cd9e0-d781-4fa1-98ee-1506f36215e2")
public class HorizontalScaleRequirementImporter<T extends HorizontalScaleRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement> extends ScaleRequirementImporter<T,V> {
    @objid ("0efbb1ed-5445-4b4e-b98d-a5aeaba804a1")
    public HorizontalScaleRequirementImporter() {
    }

    @objid ("c59ee9e8-c11b-439f-ae82-2bb33f04b68e")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHorizontalScaleRequirement(this);
    }

    @objid ("015aa04d-bdd0-4888-b7f7-6a0bb7d919f1")
    public HorizontalScaleRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("7d1cce15-0c49-40fa-a221-504c2e48b3fd")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.create();
    }

    @objid ("4b8c667c-a855-4e48-a2c2-20d62f479d29")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("80166831-2f7f-4509-8f07-af4951a3ffb9")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMaxInstances(elt);
        setMinInstances(elt);
    }

    @objid ("c2d14f77-1d1c-4c32-abb3-2c82f6e2711f")
    private void setMaxInstances(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getMaxInstances();
        if (value != null) {
            elt.setMaxInstances(String.valueOf(value));
        }
    }

    @objid ("cd7da480-8d8c-4ea5-949b-d5c5663101eb")
    private void setMinInstances(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getMinInstances();
        if (value != null) {
            elt.setMinInstances(String.valueOf(value));
        }
    }

}
