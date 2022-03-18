package fr.softeam.cameldesigner.exchange.exporter.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.data.DataFactory;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;

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
        if (elt instanceof camel.data.DataSource) {
            camel.data.DataSource dataSource = (camel.data.DataSource) elt;
            setExternal(dataSource);
            setComponent(dataSource);
        }
    }

    @objid ("ddc36432-e622-4dc0-8f38-559865764685")
    private void setComponent(camel.data.DataSource dataSource) {
        CDOObject comp =  this._process.getElement(this._element.getSoftwareComponent());
        if ((comp != null) &&  (comp instanceof camel.deployment.SoftwareComponent))
            dataSource.setComponent((camel.deployment.SoftwareComponent) comp);
    }

    @objid ("de0a31fb-4ccb-4981-a117-cbfeae2aa15a")
    private void setExternal(camel.data.DataSource dataSource) {
        dataSource.setExternal(Boolean.valueOf(this._element.isExternal()));
    }

    @objid ("aafff264-d2ea-4d9d-8799-d8e24b5c96c6")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if  ((elt instanceof camel.data.DataSource) && (context instanceof camel.data.DataTypeModel)) {
               ((camel.data.DataTypeModel) context).getDataSources().add((camel.data.DataSource) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
