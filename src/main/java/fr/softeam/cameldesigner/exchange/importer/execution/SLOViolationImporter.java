package fr.softeam.cameldesigner.exchange.importer.execution;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.execution.SLOViolation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("36da3370-7025-4299-8b01-655abf9ae8b0")
public class SLOViolationImporter<T extends SLOViolation, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation> extends CauseImporter<T,V> {
    @objid ("7e472269-4b73-4567-885f-050ed8298dce")
    public SLOViolationImporter() {
        super();
    }

    @objid ("072ed1b7-4972-408e-9520-ef1a71ac6f61")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.create();
    }

    @objid ("5d96534e-d926-48e0-a439-b4abd693f719")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("8b0a78f9-d8fc-482c-a891-e14d5f312e19")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSLOViolation(this);
    }

}
