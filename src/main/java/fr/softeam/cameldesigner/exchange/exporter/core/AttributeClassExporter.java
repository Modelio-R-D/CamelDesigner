package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import org.eclipse.emf.cdo.CDOObject;

@objid ("32636505-9353-4200-9c32-055f0525ad20")
public class AttributeClassExporter<T extends AttributeClass> extends CamelAttributeExporter<T> {
    @objid ("4b1ba0ad-f3d6-4162-b8d1-53e0f734b57b")
    public AttributeClassExporter(T elt) {
        super(elt);
    }

    @objid ("e9a681fa-7c34-48f0-86dd-1821f2785f41")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createAttribute();
    }

    @objid ("e45943df-6840-43f5-aa86-ecc31a0d0982")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a8ca8740-3b74-454e-b2ea-d831afe9cf05")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
