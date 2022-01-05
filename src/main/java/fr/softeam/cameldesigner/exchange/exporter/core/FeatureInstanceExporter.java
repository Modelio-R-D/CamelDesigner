package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("324b53a7-eb59-41db-bdc6-46b13dbdc5bc")
public class FeatureInstanceExporter<T extends FeatureInstance> extends FeatureExporter<T> {
    @objid ("39f54a82-ae39-40e7-a59f-7d856e881c8f")
    public FeatureInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("1ab731b5-4b92-4dbb-a9a2-663a08bec772")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("a11fa7ca-bf94-4cce-ad42-b078874a6427")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
