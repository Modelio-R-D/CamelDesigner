package fr.softeam.cameldesigner.exchange.exporter.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("931c928f-db80-44bc-9cf0-4c72e9154936")
public abstract class ComponentRelationExporter<T extends ComponentRelation> extends FeatureExporter<T> {
    @objid ("8cb96af9-86d8-44df-b66a-0eb61d1058c3")
    public ComponentRelationExporter(T elt) {
        super(elt);
    }

    @objid ("dbec4c63-2da7-428a-b292-e02335094431")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("3aef59ed-fa3f-4f06-bddb-8c0a0cf720b0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("ea5066bc-ef5d-4ae3-9dbd-2ffae6715a5b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
