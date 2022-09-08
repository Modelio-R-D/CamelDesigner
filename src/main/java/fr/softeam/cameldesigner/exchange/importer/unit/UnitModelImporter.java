package fr.softeam.cameldesigner.exchange.importer.unit;

import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c577d417-73f5-4dc2-97bf-91b4edf8dec8")
public class UnitModelImporter<T extends UnitModel, V extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> extends SubModelImporter<T,V> {
    @objid ("2fe0380b-5089-48d4-809b-a7859bdf2178")
    public UnitModelImporter() {
    }

    @objid ("14bd469a-e428-4f1d-9b46-c550ba6b2989")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnitModel(this);
    }

    @objid ("cfe4cbde-41c9-4dc1-a973-5cd9ca924503")
    public UnitModelImporter(T elt) {
        super(elt);
    }

    @objid ("03252185-81b5-4d01-bc88-9e3fd06857b4")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.create();
    }

    @objid ("56fc099b-84d6-40df-8e13-7cf72a54cdf9")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addUnitModels(elt);
    }

}
