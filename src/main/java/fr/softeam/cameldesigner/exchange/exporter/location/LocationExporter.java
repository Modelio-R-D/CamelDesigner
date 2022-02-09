package fr.softeam.cameldesigner.exchange.exporter.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e5e9de61-252f-4705-ab30-bcbac041abc5")
public abstract class LocationExporter<T extends Location> extends NamedElementExporter<T> {
    @objid ("01dfb8e9-f318-4318-a6c1-af2db7099c25")
    public LocationExporter(T elt) {
        super(elt);
    }

    @objid ("d3b4eaf7-a0c2-4b54-817e-ba8e8236401d")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("812888fd-99d5-49d5-80a6-12a02ff36a72")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("fca643f2-87e4-44ff-a6dc-cfd383fc2284")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
