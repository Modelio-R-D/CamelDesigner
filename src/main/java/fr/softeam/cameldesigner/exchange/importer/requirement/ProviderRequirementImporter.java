package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.constraint.Constraint;
import camel.requirement.CloudType;
import camel.requirement.ProviderRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("74cc92b6-9efe-4e14-8c90-ea5219c7a8dd")
public class ProviderRequirementImporter<T extends ProviderRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement> extends HardRequirementImporter<T,V> {
    @objid ("0ea76931-924d-45b7-9476-c0ee113a3a69")
    public ProviderRequirementImporter() {
    }

    @objid ("6e4c05d0-64b0-4b50-b7f5-76f4e99ae7b8")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProviderRequirement(this);
    }

    @objid ("349a6f34-405d-45d4-b6d2-bcab67493856")
    public ProviderRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("cbad0d11-d982-48e2-a200-0a40c383b408")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.create();
    }

    @objid ("bc55d815-1b59-4eb4-a6f7-35111c10f5ad")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("a8f4b924-f5f7-4ae7-9f38-e6c5629d0b75")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setCloudType(elt);
        setProviderNames(elt);
    }

    @objid ("7f1c8362-311d-435e-9120-dd9315b108f6")
    private void setProviderNames(V elt) {
        // TODO Auto-generated method stub
        EList<String> value = this._element.getProviderNames();
        if (value != null) {
            elt.setProviderNames(value);
        }
    }

    @objid ("089eaa3f-dd67-4cc3-8d95-0d9bd97fa24c")
    private void setCloudType(V elt) {
        // TODO Auto-generated method stub
        CloudType value = this._element.getCloudType();
        if (value != null) {
            elt.setCloudType(value.getName());
        }
    }

}
