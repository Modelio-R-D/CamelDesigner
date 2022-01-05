package fr.softeam.cameldesigner.exchange.exporter.data;

import camel.data.DataFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("44e9e416-06f8-4a4d-8880-1727cf1594ca")
public class DataInstanceExporter<T extends DataInstance> extends NamedElementExporter<T> {
    @objid ("704e3d9c-9312-478f-9bfc-f60f652093fc")
    public DataInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("b78433b0-aab7-4670-b1ac-93435d1ef948")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createDataInstance();
    }

    @objid ("c5f42715-6d99-4f57-9eeb-1efc0268acc0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
