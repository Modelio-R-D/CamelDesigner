package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataSourceInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1e55fbb8-914a-44b6-933c-c406a46c70c0")
public class DataSourceInstanceImporter<T extends DataSourceInstance, V extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance> extends FeatureImporter<T,V> {
    @objid ("910f3a60-5b9a-41df-a0c7-cc3a811aeee3")
    public DataSourceInstanceImporter() {
        super();
    }

    @objid ("ce59dd76-69b9-46e6-9c27-ee77e4b8f5ca")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.create();
    }

    @objid ("b719e1f7-cb78-4508-8469-60bbe7f0c069")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("00215708-f757-4e59-af4f-68e7adeaf49f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataSourceInstance(this);
    }

}
