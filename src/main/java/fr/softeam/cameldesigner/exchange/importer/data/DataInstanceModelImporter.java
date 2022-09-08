package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataInstanceModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b8fb657b-f90e-499b-9377-d23b9b2e2ca5")
public class DataInstanceModelImporter<T extends DataInstanceModel, V extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> extends DataModelImporter<T,V> {
    @objid ("2ad04297-0f32-40d3-907e-2dc05f516649")
    public DataInstanceModelImporter() {
        super();
    }

    @objid ("53fb8b87-8b3a-4bdf-92ef-fec49f4280b2")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.create();
    }

    @objid ("783008eb-49e2-4b38-bf79-2fba64d0edff")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("ac870f01-2508-45f5-9421-c0d9d9997e15")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataInstanceModel(this);
    }

}
