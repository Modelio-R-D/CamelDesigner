package fr.softeam.cameldesigner.exchange.exporter.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b229ae17-91cc-4f88-897f-4d2674b764be")
public abstract class MmsObjectExporter<T extends MmsObject> extends NamedElementExporter<T> {
    @objid ("9e002395-0ace-47ba-91ac-f72a682b686e")
    public MmsObjectExporter(T elt) {
        super(elt);
    }

    @objid ("2ed51d8b-a990-42e1-8594-00b55b45d908")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @objid ("d7c2666a-c33a-4a8e-a71b-9aa95d97509a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.mms.MmsObject) {
            camel.mms.MmsObject mo = (camel.mms.MmsObject) elt;
            setId(mo);
            setURI(mo);
        }
    }

    @objid ("d92eda2a-eb50-49f8-b147-71ac8264534c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.mms.MetaDataModel) && (elt instanceof camel.mms.MmsObject)) {
            ((camel.mms.MetaDataModel) context).getMetadataElements().add((camel.mms.MmsObject) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("f888d3ff-d9e7-43e0-b515-2480d70907ff")
    private void setURI(camel.mms.MmsObject mo) {
        mo.setUri(this._element.getUri());
    }

    @objid ("c833df3f-cf82-43b8-97c3-f4ed40c425fe")
    private void setId(camel.mms.MmsObject mo) {
        mo.setId(this._element.getId());
    }

}
