package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Attribute;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("804d7722-af37-42b3-ace8-7102790c372c")
public class AttributeImporter<T extends Attribute, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> extends NamedElementImporter<T,V> {
    @objid ("85d96de8-1760-4a0a-8422-6da18b72ee0d")
    public AttributeImporter() {
    }

    @objid ("e689fbe7-49aa-4837-9dbc-6260e4394667")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitAttribute(this);
    }

    @objid ("665b14ab-5a4c-4175-aeb0-35fa05bfd588")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("8c4f7bea-5e16-4322-a673-3d0db11f72cd")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("17db46cd-3cb3-4a60-8e59-469a497c8cea")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("b8229cdb-32b8-4dd8-9bb3-3d64a073a537")
    public AttributeImporter(T elt) {
        super(elt);
    }

}
