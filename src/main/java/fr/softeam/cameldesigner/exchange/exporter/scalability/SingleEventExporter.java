package fr.softeam.cameldesigner.exchange.exporter.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent;
import org.eclipse.emf.cdo.CDOObject;

@objid ("76647977-67d9-463d-b16f-a3f282cbfa76")
public abstract class SingleEventExporter<T extends SingleEvent> extends EventExporter<T> {
    @objid ("33bd7d8b-c8e4-4a7b-95e5-5ead5fd1a17e")
    public SingleEventExporter(T elt) {
        super(elt);
    }

    @objid ("c894f046-b669-4656-8010-bc2ebbb0b30e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("dba3da4e-de2c-4e2b-aec5-4ecbb060dec2")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("0785485d-091e-4725-908d-d09ad470d892")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.scalability.ScalabilityModel) && (elt instanceof camel.scalability.SingleEvent)) {
             ((camel.scalability.ScalabilityModel) context).getEvents().add((camel.scalability.SingleEvent) elt);
         }else {
             super.attach(elt, context);
         }
    }

}
