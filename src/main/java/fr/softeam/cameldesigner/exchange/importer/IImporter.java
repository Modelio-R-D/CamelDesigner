package fr.softeam.cameldesigner.exchange.importer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import org.eclipse.emf.cdo.CDOObject;

@objid ("357d3ae7-884b-4241-bf1b-90f61638a9fb")
public interface IImporter<T extends CDOObject, V extends CamelElement, W extends CamelElement> {
    @objid ("9e1e49b6-9c14-427d-89cf-08ffe4085f65")
    CamelElement createCamelElt(T owner);

    @objid ("045aff1c-8bdb-4acc-93af-7c1da617be25")
    void setProperties(V elt);

    @objid ("5714b57b-1159-468e-a5e2-abd83b162dd6")
    void attach(V elt, W context);

}
