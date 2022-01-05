package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureInstanceExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("18ecb454-803d-4407-b414-9bb6da83d8a4")
public abstract class ComponentInstanceExporter<T extends ComponentInstance> extends FeatureInstanceExporter<T> {
    @objid ("ff502510-3422-4069-992e-9bda59328d0c")
    public ComponentInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("61a2bf12-5a66-4eab-b7c6-a5600e07ea14")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("4307a4d6-e7b1-4e60-9bc7-2c9d2b40196a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("307996a4-4f61-415f-80e8-145000251274")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
