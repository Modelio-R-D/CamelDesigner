package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.PaaSMeasurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4521fe4b-13a9-4566-bf8e-c14edf5efe19")
public class PaaSMeasurementImporter<T extends PaaSMeasurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement> extends MeasurementImporter<T,V> {
    @objid ("f9e415b4-0715-4c7c-9007-46b30a9ce375")
    public PaaSMeasurementImporter() {
        super();
    }

    @objid ("df76de9c-b182-4876-baad-770a89194a59")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.create();
    }

    @objid ("5fa8f099-69b1-4307-96bd-57d5bde87775")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("77fea515-b103-438f-acf3-c501d4ef58d6")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaSMeasurement(this);
    }

}
