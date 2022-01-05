package fr.softeam.cameldesigner.exchange.exporter.metadata;

import camel.mms.MmsFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9e1baa7f-a6b5-48aa-bcee-c9b9a46b342e")
public class MetaDataModelExporter<T extends MetaDataModel> extends SubModelExporter<T> {
    @objid ("653eb806-b295-45ad-89e1-4e17f6525125")
    public MetaDataModelExporter(T elt) {
        super(elt);
    }

    @objid ("a8c17c69-f27a-47ef-99bc-2e4c10b16e40")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MmsFactory.eINSTANCE.createMetaDataModel();
    }

    @objid ("666de8f1-09c8-4263-b2d3-f0d80e0a8e69")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("2b4ef0c7-674d-4061-93d2-924624b6e032")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
