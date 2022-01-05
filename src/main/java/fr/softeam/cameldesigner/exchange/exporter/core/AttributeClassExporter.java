package fr.softeam.cameldesigner.exchange.exporter.core;

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
        return super.createCamelElt(context);
    }

    @objid ("e45943df-6840-43f5-aa86-ecc31a0d0982")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
