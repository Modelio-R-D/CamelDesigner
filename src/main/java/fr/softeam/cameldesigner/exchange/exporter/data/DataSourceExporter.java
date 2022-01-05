package fr.softeam.cameldesigner.exchange.exporter.data;

import camel.data.DataFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("3a22d107-09c9-4584-bc6a-de51525e929e")
public class DataSourceExporter<T extends DataSource> extends NamedElementExporter<T> {
    @objid ("9b9569a7-947f-40f1-bdc4-3006153cdbdd")
    public DataSourceExporter(T elt) {
        super(elt);
    }

    @objid ("c454fbc0-007f-4b66-8be0-1b7722cf2c47")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createDataSource();
    }

    @objid ("859c6f96-6b72-4f75-91b6-7f4961c0638e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
