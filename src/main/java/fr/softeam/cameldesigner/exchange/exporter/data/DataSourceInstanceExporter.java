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
        if (elt instanceof DataSourceInstance) {
            camel.data.DataSourceInstance dataSourceInstance = (camel.data.DataSourceInstance) elt;
            setType(dataSourceInstance);
            setSoftwareComponentInstance(dataSourceInstance);
        }
    }

    @objid ("6ae15faa-003e-4cb4-96a6-68313ddb6921")
    private void setType(camel.data.DataSourceInstance data) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.data.DataSource))
            data.setType((camel.data.DataSource) type);
    }

    @objid ("9e234cc2-33cb-469a-ab8d-4b877b918186")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if  ((elt instanceof camel.data.DataSourceInstance) && (context instanceof camel.data.DataInstanceModel)) {
               ((camel.data.DataInstanceModel) context).getDataSourceInstances().add((camel.data.DataSourceInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("fa943182-7fff-425e-b6ea-7ec3a0aaaf4f")
    private void setSoftwareComponentInstance(camel.data.DataSourceInstance dataSource) {
        CDOObject comp =  this._process.getElement(this._element.getSoftwareComponentInstance());
        if ((comp != null) &&  (comp instanceof camel.deployment.SoftwareComponentInstance))
            dataSource.setSoftwareComponentInstance((camel.deployment.SoftwareComponentInstance) comp);
    }

}
