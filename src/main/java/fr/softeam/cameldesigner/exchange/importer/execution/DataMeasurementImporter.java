package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.DataMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1232f7c5-6b62-4023-983c-00ab1f148482")
public class DataMeasurementImporter<T extends DataMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement> extends MeasurementImporter<T,V> {
    @objid ("91fc03c2-79fa-4e10-ba48-7174e9bfaca6")
    public DataMeasurementImporter() {
        super();
    }

    @objid ("0048443e-d9d1-4420-8395-0d511d908799")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.create();
    }

    @objid ("342d4bf1-1a9f-499a-a11e-72e3a11d191e")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("83251536-97ba-4d80-af31-a62595cb00aa")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataMeasurement(this);
    }

}
