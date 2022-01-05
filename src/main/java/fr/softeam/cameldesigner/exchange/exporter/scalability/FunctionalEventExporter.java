package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5346bf8a-dfba-4c3a-9f07-bbdb84bee050")
public class FunctionalEventExporter<T extends FunctionalEvent> extends FeatureExporter<T> {
    @objid ("dfb5cb29-4cef-44cd-8bc0-44779c2cd13b")
    public FunctionalEventExporter(T elt) {
        super(elt);
    }

    @objid ("ef348a5f-77f2-4189-bda9-a8eef64e9b78")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createFunctionalEvent();
    }

    @objid ("a12011be-7aae-4383-81d4-117fa00be9cf")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("71fe2887-5680-4419-b45e-40df87f735a1")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
