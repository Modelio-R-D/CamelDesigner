package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.Limit;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a9644f1c-997d-4ddc-a3fc-da5f83c5ad6d")
public class LimitExporter<T extends Limit> {
    @objid ("29d076d5-3f3e-45de-874e-2962c8f59a57")
    public LimitExporter(T elt) {
    }

    @objid ("3b1d64a1-bc22-4aa5-8f5e-281dae28dafe")
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createLimit();
    }

    @objid ("a3a6eaed-3fa5-42a5-8f8d-78596a022c41")
    public void setProperties(CDOObject elt) {
    }

    @objid ("919234c6-27a3-4d38-af06-d5a3dd55b768")
    public void attach(CDOObject elt, CDOObject context) {
    }

}
