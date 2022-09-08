package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.QualityAttribute;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6aa6e94f-97e6-4c36-9878-23a5288062d2")
public class QualityAttributeImporter<T extends QualityAttribute, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> extends AttributeImporter<T,V> {
    @objid ("88eb55ca-8492-4262-827c-e7c5e4e96134")
    public QualityAttributeImporter() {
    }

    @objid ("f650fcc2-7bf1-46c8-89cd-d703638c9cf2")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitQualityAttribute(this);
    }

    @objid ("8c0151e1-346c-4f2c-9566-df9672d5c408")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("89f00a4c-d136-4f20-af2e-293ecb2f10d3")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("d6b4ad73-758a-4bbb-b26f-03b374d79cce")
    public QualityAttributeImporter(T elt) {
        super(elt);
    }

    @objid ("432dd228-50c4-4c71-91bf-52d096a6cc68")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

}
