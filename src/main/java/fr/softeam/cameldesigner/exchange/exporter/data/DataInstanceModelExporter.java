package fr.softeam.cameldesigner.exchange.exporter.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.data.DataFactory;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;

@objid ("b7c15e0b-653e-4663-88a9-eeec649648a4")
public class DataInstanceModelExporter<T extends DataInstanceModel> extends DataModelExporter<T> {
    @objid ("f443c345-8c49-4011-a358-1dc392710630")
    public DataInstanceModelExporter(T elt) {
        super(elt);
    }

    @objid ("9040956b-0aa9-446c-8912-0b5b8977210e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createDataInstanceModel();
    }

    @objid ("473493d9-fc58-4e5f-97ff-281725ec6a4d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.data.DataInstanceModel)
            setType((camel.data.DataInstanceModel) elt);
    }

    private void setType(camel.data.DataInstanceModel data) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.data.DataTypeModel))
            data.setType((camel.data.DataTypeModel) type);
    }

    @objid ("b6de8579-719f-461e-851d-30aef37e84fd")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
