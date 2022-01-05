package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("50009999-7a67-4b17-aa6d-d57c8d1d724f")
public class ScalabilityModelExporter<T extends ScalabilityModel> extends SubModelExporter<T> {
    @objid ("3940555d-ae2b-4799-8aab-6ba7ffc9b99c")
    public ScalabilityModelExporter(T elt) {
        super(elt);
    }

    @objid ("347d1c38-7fc1-4d7e-b1e9-0e155e6aef17")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createScalabilityModel();
    }

    @objid ("243f7c1f-0b40-439b-aad8-1e0e9b27906b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("962c2eb4-d4b0-4198-84ba-cd92785298c0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
