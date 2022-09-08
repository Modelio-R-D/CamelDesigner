package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ac5e1895-4135-4262-b38b-b27c4c3b032b")
public class DataInstanceImporter<T extends DataInstance, V extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> extends FeatureImporter<T,V> {
    @objid ("4c30ca6c-ce58-43dc-8613-823e94a35e4f")
    public DataInstanceImporter() {
        super();
    }

    @objid ("630c81db-ffdb-428c-b512-53a2859a5a35")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.create();
    }

    @objid ("63605762-c567-4435-8f3d-2949a295290a")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("4de3b0af-b88a-4fac-b7ee-4999ed2ce94b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataInstance(this);
    }

}
