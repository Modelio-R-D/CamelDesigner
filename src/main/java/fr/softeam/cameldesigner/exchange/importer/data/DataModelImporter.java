package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("be6ac165-e220-4708-bc0f-db11b169b831")
public class DataModelImporter<T extends DataModel, V extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel> extends SubModelImporter<T,V> {
    @objid ("0d192721-19e1-429a-81b7-f607ad0fc6e0")
    public DataModelImporter() {
        super();
    }

    @objid ("9a0cb5d9-033e-44af-89ff-184e65e33424")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("b29ede7f-dd10-4431-9fe3-a1b0ed2ad116")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("df175ca9-cbee-4887-a124-eaf5a893e345")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataModel(this);
    }

}
