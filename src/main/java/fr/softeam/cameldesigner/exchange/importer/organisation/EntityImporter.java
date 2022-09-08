package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.Entity;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("dca04a2f-259f-48ee-b05a-d7650112d9e2")
public class EntityImporter<T extends Entity, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> extends FeatureImporter<T,V> {
    @objid ("1d383a7a-88aa-4e8c-8584-7401e4a32841")
    public EntityImporter() {
    }

    @objid ("15092c7f-7277-4409-8e00-cdc02683a4d1")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEntity(this);
    }

    @objid ("56afde47-00f6-454a-8cb6-784cceb3eae2")
    public EntityImporter(T elt) {
        super(elt);
    }

    @objid ("93f881f0-324f-4437-a393-8c01ac56b032")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.create();
    }

    @objid ("30252ebf-9792-4754-a54e-18ef5167628f")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
