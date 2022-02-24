package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
import org.eclipse.emf.cdo.CDOObject;

@objid ("383b533e-84cc-4787-9720-a4839b8f99cb")
public class FeatureEnumerationExporter<T extends FeatureEnumeration> extends FeatureClassifierExporter<T> {
    @objid ("2c57a781-841b-40bf-b25a-3e58858decf7")
    public FeatureEnumerationExporter(T elt) {
        super(elt);
    }

    @objid ("31a07f11-5dab-400d-a03e-cabb1c5badf5")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("0a96f5b5-a911-43fe-9500-e7c3d6df69e9")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
