package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.ApplicationMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8601411c-4083-4aea-bb42-e3b9ac182bfe")
public class ApplicationMeasurementImporter<T extends ApplicationMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement> extends MeasurementImporter<T,V> {
    @objid ("29227ea5-64af-45ae-8930-1369c3e49211")
    public ApplicationMeasurementImporter() {
        super();
    }

    @objid ("a737f1ad-3124-43f3-bf63-3090e2590f44")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.create();
    }

    @objid ("bc921687-7b1e-416b-9303-4a87e2c26536")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("4492f320-fb8f-466f-9874-e5bf639fcd6f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitApplicationMeasurement(this);
    }

}
