package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.metric.MetricContext;
import camel.requirement.SoftRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a68197d8-430e-496b-9f5e-0d96266de8e6")
public abstract class SoftRequirementImporter<T extends SoftRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement> extends RequirementImporter<T,V> {
    @objid ("ff3c2fdd-64c1-4ce9-a712-e2b857501e8e")
    public SoftRequirementImporter() {
    }

    @objid ("66dcb9a9-e29d-4b9c-abdd-dbcf932d3e9f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSoftRequirement(this);
    }

    @objid ("536d7b40-aee5-4561-82b4-0e8404c03fb4")
    public SoftRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("7d01e602-c79c-416e-9447-ac8d614c058f")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return super.createCamelElt(owner);
    }

    @objid ("65ad3356-de15-4fb3-ad36-c2ae6f146827")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setPriority(elt);
    }

    @objid ("ac3e9de6-4d90-40e2-a0da-9ee82286e011")
    private void setPriority(V elt) {
        // TODO Auto-generated method stub
        Double value = this._element.getPriority();
        if (value != null) {
            elt.setPriority(String.valueOf(value));
        }
    }

}
