package fr.softeam.cameldesigner.exchange.exporter.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.exchange.exporter.core.CamelElementExporter;

@objid ("b229ae17-91cc-4f88-897f-4d2674b764be")
public abstract class MmsObjectExporter<T extends MmsObject> extends CamelElementExporter<T> {
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
    }

    @objid ("d92eda2a-eb50-49f8-b147-71ac8264534c")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.mms.MetaDataModel)) {
            ((camel.core.CamelModel) context).getMetadataModels().add((camel.mms.MetaDataModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
