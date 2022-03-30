package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5e1fa245-4c89-49af-9f61-a84c8390157e")
public class FeatureDataTypeExporter<T extends FeatureDataType> extends FeatureClassifierExporter<T> {
    @objid ("d17001ac-1a50-482f-a4a2-db9fd49897dd")
    public FeatureDataTypeExporter(T elt) {
        super(elt);
    }

    @objid ("0a0082e5-400a-417c-9d97-3f2d25994782")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createFeature();
    }

    @objid ("6eb3d19d-36d2-4ca6-b718-38bc3acab7d7")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
