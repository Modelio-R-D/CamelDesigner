package fr.softeam.cameldesigner.exchange.importer.location;

import camel.location.LocationModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("526be2e4-4791-4cbc-979a-f23a2fa71d97")
public class LocationModelImporter<T extends LocationModel, V extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> extends SubModelImporter<T,V> {
    @objid ("9bf437cf-3973-4202-9020-047e2837bb91")
    public LocationModelImporter() {
        super();
    }

    @objid ("8897498a-5fd2-4860-b90d-e45561f3f6ee")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.create();
    }

    @objid ("25bf983a-1ff3-40e0-9249-1276dc6bffe9")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addLocationModels(elt);
    }

    @objid ("d2f2382e-2c10-4aee-8251-a26362786800")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitLocationModel(this);
    }

}
