package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import org.eclipse.emf.cdo.CDOObject;

@objid ("06696a80-4c89-465f-b118-ce5c7a80d754")
public class FeaturePortExporter<T extends FeaturePort> extends FeatureExporter<T> {
    @objid ("08a96577-0170-47d3-954b-c8f7deb9cc04")
    public FeaturePortExporter(T elt) {
        super(elt);
    }

    @objid ("3ef4458d-8ca4-47d1-b1d6-7c614f7045a1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("22f2f8f0-7f39-4565-bb52-2d3dd818e1d8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
