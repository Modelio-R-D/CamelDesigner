package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("16b2612a-8c49-4989-9ec6-1a9acdca1c29")
public class BinaryEventPatternExporter<T extends BinaryEventPattern> extends FeatureExporter<T> {
    @objid ("4fc67aac-0377-4242-b0ec-51457cd81a22")
    public BinaryEventPatternExporter(T elt) {
        super(elt);
    }

    @objid ("0de74e2a-ad7d-45d6-9e08-d8e5af7d450a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createBinaryEventPattern();
    }

    @objid ("9a0fe7dd-a881-45ca-98d8-52c2831d203f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("0eaa29d1-3b95-4142-9326-2f60e0e0eea6")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
