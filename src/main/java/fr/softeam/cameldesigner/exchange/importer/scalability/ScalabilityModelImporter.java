package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.ScalabilityModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f18b881-4db4-4ad6-b8fc-d528874da0e1")
public class ScalabilityModelImporter<T extends ScalabilityModel, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> extends SubModelImporter<T,V> {
    @objid ("e1eff0ea-bbc9-40c6-b23a-a1b5c98cd7f7")
    public ScalabilityModelImporter() {
    }

    @objid ("351af8aa-db42-45e2-ab88-f7a57c9cfdeb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitScalabilityModel(this);
    }

    @objid ("da0f749f-a0ac-438d-b923-95a4be06271c")
    public ScalabilityModelImporter(T elt) {
        super(elt);
    }

    @objid ("41d2522c-b5a7-4a2c-849b-a79a14e0c99e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.create();
    }

    @objid ("4c7bb983-0d3b-4fe4-9548-65cddafc2fa6")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addScalabilityModels(elt);
    }

}
