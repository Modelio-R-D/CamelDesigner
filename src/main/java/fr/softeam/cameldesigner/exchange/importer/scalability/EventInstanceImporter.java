package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.constraint.MetricConstraint;
import camel.core.LayerType;
import camel.scalability.EventInstance;
import camel.scalability.SingleEvent;
import camel.scalability.StatusType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;

@objid ("3b16121b-9ebe-43bc-b870-ce46d0dd55e9")
public abstract class EventInstanceImporter<T extends EventInstance, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> extends FeatureImporter<T,V> {
    @objid ("d0f2db40-a2c0-44f6-831f-aed3e75182e8")
    public EventInstanceImporter() {
    }

    @objid ("80390642-eeda-43a2-82b3-d7de74b69a84")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEventInstance(this);
    }

    @objid ("8000e3f1-d66f-4ca7-9831-74b979611f31")
    public EventInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("42542f44-15f7-46a5-9dc3-e0827913f4f5")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof ScalabilityModel)
            ((ScalabilityModel)context).addEventInstances(elt);
    }

    @objid ("1172849e-5a88-48f6-a205-c58e72690826")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setStatusType(elt);
        setLayerType(elt);
        setType(elt);
    }

    @objid ("d98c4f76-b5da-4a08-9590-9703899591c5")
    private void setStatusType(V elt) {
        StatusType value = this._element.getStatus();
        if (value != null) {
            elt.setStatus(value);
        }
    }

    @objid ("fe3a16a2-c093-4142-b110-65b64c2c79d4")
    private void setLayerType(V elt) {
        LayerType value = this._element.getLayer();
        if (value != null) {
            elt.setLayer(value);
        }
    }

    @objid ("a245d1d2-4566-479b-b625-f7363d52b9d3")
    private void setType(V elt) {
        SingleEvent value = this._element.getType();
        if (value != null) {
            elt.setType((Event) value);
        }
    }

}
