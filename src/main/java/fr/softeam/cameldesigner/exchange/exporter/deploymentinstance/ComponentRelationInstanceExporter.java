package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("47f0480b-1494-407a-8a77-3a062a6eccaa")
public abstract class ComponentRelationInstanceExporter<T extends ComponentRelationInstance> extends FeatureExporter<T> {
    @objid ("8289f0e6-9f6e-40df-a532-1b393380791b")
    public ComponentRelationInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("989d3c62-12f8-426b-8705-29f5921a4901")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("2fc76ba9-d687-4ed0-af8e-db23433eb3ef")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("7997dc75-fc2a-4c3a-b7a4-3809e1dbbdd6")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
