package fr.softeam.cameldesigner.exchange.exporter.location;

import camel.location.LocationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8ae33d26-af1b-4618-b9c8-c6709046f0ef")
public class LocationModelExporter<T extends LocationModel> extends SubModelExporter<T> {
    @objid ("f6e592ea-fb52-4341-8334-7d5f8c559b83")
    public LocationModelExporter(T elt) {
        super(elt);
    }

    @objid ("e9f834b4-7577-4d6f-a037-6a758287c171")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return LocationFactory.eINSTANCE.createLocationModel();
    }

    @objid ("0c47f80e-cb58-470c-8c3b-9fe75fd2898f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("162b0420-33bd-44cb-9de1-816a897c175d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.location.LocationModel)) {
            ((camel.core.CamelModel) context).getLocationModels().add((camel.location.LocationModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
