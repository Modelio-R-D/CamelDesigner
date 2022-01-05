package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9520becd-ccee-49fc-8d55-09e1e8b44adc")
public class CamelModelExporter<T extends CamelModel> extends NamedElementExporter<T> {
    @objid ("8c378661-30f4-4e2a-a08e-43d25f87d42d")
    public CamelModelExporter(T elt) {
        super(elt);
    }

    @objid ("8dfc1d30-0501-489c-ade2-afdf82cd26a9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createCamelModel();
    }

    @objid ("089c421d-9d79-4ea9-a07e-f4f96c7ccdf8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
