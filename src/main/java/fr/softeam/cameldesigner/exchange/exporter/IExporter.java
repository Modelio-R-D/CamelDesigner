package fr.softeam.cameldesigner.exchange.exporter;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;

@objid ("33b9bc31-b658-4c84-a5c1-1a27d4b5bde2")
public interface IExporter {
    @objid ("44106778-390d-4c1c-aeef-38b404d90fa2")
    CDOObject createCamelElt(CDOObject owner);

    @objid ("7a2f2a3f-7162-41b6-a0ba-7ec324382818")
    void setProperties(CDOObject elt);

    @objid ("2cb89f3c-79a0-4bd5-b468-e82be0e9c88f")
    void attach(CDOObject elt, CDOObject context);

}
