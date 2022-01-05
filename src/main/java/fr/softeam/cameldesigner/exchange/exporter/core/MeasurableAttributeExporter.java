package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1e3affd3-a822-46b9-9f98-e4c113b6f02f")
public class MeasurableAttributeExporter<T extends MeasurableAttribute> extends CamelAttributeExporter<T> {
    @objid ("f26414ea-1ff1-419c-b922-2d0bdbfea187")
    public MeasurableAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("8736aeb2-04c6-49ed-9136-12e6ac7c0365")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createMeasurableAttribute();
    }

    @objid ("21db2a8e-4f9c-4d4f-beb1-22a7d496312d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("897542ab-12e3-4882-adc4-07fff3a54156")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
