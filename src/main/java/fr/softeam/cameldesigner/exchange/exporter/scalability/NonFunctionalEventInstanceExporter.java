package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("985ff8a3-f2a8-489a-9f79-6cfc2f505cb7")
public class NonFunctionalEventInstanceExporter<T extends NonFunctionalEventInstance> extends EventInstanceExporter<T> {
    @objid ("0e8d01b9-4d36-4835-a474-f923ac9fdc13")
    public NonFunctionalEventInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("21bc94f3-22b4-40a4-8fc9-dc66b2ef5060")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createNonFunctionalEventInstance();
    }

    @objid ("6ec1171f-7949-4a02-9596-30c93d28b288")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f0e0fefa-1d04-42dc-b0bb-98a56a67e936")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
