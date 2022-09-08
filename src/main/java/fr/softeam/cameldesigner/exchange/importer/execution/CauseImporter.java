package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.Cause;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c1cbdf62-d3aa-4a85-8f18-0ccbc1334bd5")
public class CauseImporter<T extends Cause, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> extends FeatureImporter<T,V> {
    @objid ("11047860-3db5-4402-aa7c-f55de4826ab7")
    public CauseImporter() {
        super();
    }

    @objid ("6ea32cb6-55b0-4514-837f-fd0e06480b79")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return  fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.create();
    }

    @objid ("cef9f9c2-baf7-4463-b052-9c49e0b9a7b4")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("62ef5b04-601a-410c-83e4-d5db8a97d50c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCause(this);
    }

}
