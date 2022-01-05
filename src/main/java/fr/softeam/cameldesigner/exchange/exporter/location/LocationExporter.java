package fr.softeam.cameldesigner.exchange.exporter.location;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;


public abstract class LocationExporter<T extends Location> extends NamedElementExporter<T> {

    public LocationExporter(T elt) {
        super(elt);
    }

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
