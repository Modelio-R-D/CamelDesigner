package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6063c182-30b1-4068-9c62-e00f2180ae02")
public class AttributeAttributeExporter<T extends AttributeAttribute> extends CamelAttributeExporter<T> {
    @objid ("4a22c919-1cb5-4998-9bab-5f1bb3a8a535")
    public AttributeAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("b7329c1d-7742-40fe-b752-59153825e2e8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("a5b4c764-853c-4163-a540-b1fcd076fd57")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
