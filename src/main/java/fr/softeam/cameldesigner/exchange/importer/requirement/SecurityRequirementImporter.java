package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.requirement.SecurityRequirement;
import camel.security.SecurityControl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("d9e36fd0-43c8-42ae-96d5-6679a14c95b7")
public class SecurityRequirementImporter<T extends SecurityRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement> extends HardRequirementImporter<T,V> {
    @objid ("46b62cb4-8cd7-42eb-abc7-07fd6713d813")
    public SecurityRequirementImporter() {
    }

    @objid ("1a01ff27-6e47-4e09-9234-f5eb2c031e8f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityRequirement(this);
    }

    @objid ("cdd8a14b-bb75-4d9f-be6d-5efd6fbe19bc")
    public SecurityRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("de1d0aa3-14c0-43b2-8613-5398bcae0604")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.create();
    }

    @objid ("72b33029-5889-424d-b93c-b1a595486a7e")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("73cad672-44d3-4c94-a192-c13cb6f124df")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setSecurityControls(elt);
    }

    @objid ("f6689286-93c6-4d83-b371-7cbdd06be14f")
    private void setSecurityControls(V elt) {
        // TODO Auto-generated method stub
        EList<SecurityControl> value = this._element.getSecurityControls();
        if (value != null) {
            for (SecurityControl securityControl: value)
            elt.addSecurityControls((fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl) securityControl);
        }
    }

}
