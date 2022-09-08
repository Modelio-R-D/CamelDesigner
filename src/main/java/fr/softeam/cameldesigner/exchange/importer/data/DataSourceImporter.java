package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataSource;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("99bdc355-d03c-40a3-a8e7-461f8269aff0")
public class DataSourceImporter<T extends DataSource, V extends fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource> extends FeatureImporter<T,V> {
    @objid ("286d1d5b-c25a-4673-8021-d89a6e83ac12")
    public DataSourceImporter() {
        super();
    }

    @objid ("bd006e22-ed21-4f08-95db-016ae84f95f2")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.create();
    }

    @objid ("d78a8944-7156-43af-937c-2458c3b74d3d")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("3b88cdf8-e0ea-42c2-acbd-de3d43c0e4df")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataSource(this);
    }

}
