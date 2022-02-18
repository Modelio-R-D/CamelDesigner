package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;


public abstract class SoftRequirementExporter<T extends SoftRequirement> extends RequirementExporter<T> {

    public SoftRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("4355df39-6d28-48c1-8737-dfc88b91c1b5")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
