package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("070142a8-4cf6-4701-91e1-536d94e5f8eb")
public abstract class SoftRequirementExporter<T extends SoftRequirement> extends RequirementExporter<T> {
    @objid ("6c343edc-ad17-4517-ac7e-86f1ea21d8cc")
    public SoftRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("404726e3-f9b1-494e-9f39-83c0afbab5a7")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("fc7a859e-daf2-4cab-a4cd-4af9129ff5e7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("2e285d02-5f5c-4755-a972-bca57922385c")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

}
