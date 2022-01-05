package fr.softeam.cameldesigner.exchange.exporter.data;

import camel.data.DataFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3edf057e-2473-4274-b3d8-78a011468569")
public class DataSourceInstanceExporter<T extends DataSourceInstance> extends NamedElementExporter<T> {
    @objid ("96bad6ab-085b-48bd-b4b9-7a303610b111")
    public DataSourceInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("ff199a29-58aa-4a9b-8fc1-45a0e035e7de")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createDataSourceInstance();
    }

    @objid ("36c4a850-9528-457b-89b6-a6f4b2cc6c8f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
