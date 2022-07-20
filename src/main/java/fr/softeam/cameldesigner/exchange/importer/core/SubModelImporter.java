package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Model;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("329577cf-315a-44c7-b7d4-9b1771dd725f")
public abstract class SubModelImporter<T extends Model, V extends SubModel> extends FeatureImporter<T,V> {
    @objid ("2f78f8fd-2141-4844-8b82-7229f1f3ed51")
    public SubModelImporter() {
    }

    @objid ("40236eee-a746-4b1f-b8c9-c1a0087a75bf")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitModel(this);
    }

    @objid ("a7edf21f-3773-4ad0-b4bd-ec125dd1709b")
    public SubModelImporter(T elt) {
        super(elt);
    }

}
