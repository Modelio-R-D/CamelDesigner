package fr.softeam.cameldesigner.exchange.exporter.metadata;

import camel.mms.MmsFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8c91b6a5-0b23-4492-8db4-1b7da0f8bd35")
public class MmsPropertyInstanceExporter<T extends MmsPropertyInstance> extends NamedElementExporter<T> {
    @objid ("2e4d3316-3c32-42d8-96ab-6d29d337ef66")
    public MmsPropertyInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("b62dab64-ce60-4f15-b8b0-84b4e53e4ec4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MmsFactory.eINSTANCE.createMmsPropertyInstance();
    }

    @objid ("331c4595-7638-4291-87b0-6758422a10ac")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("ae2755ce-4c54-4b8e-b395-d0eb533cfce8")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
