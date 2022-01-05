package fr.softeam.cameldesigner.exchange.exporter.data;

import camel.data.DataFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import org.eclipse.emf.cdo.CDOObject;

@objid ("84c07d3f-8e7f-4cff-b0e4-75ad4b0ae495")
public class DataTypeModelExporter<T extends DataTypeModel> extends DataModelExporter<T> {
    @objid ("7ca2b08f-75fa-44bf-9359-db2f7a7f3d74")
    public DataTypeModelExporter(T elt) {
        super(elt);
    }

    @objid ("2b25ec1d-a75f-46ee-93e4-b59b21e47d17")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createDataTypeModel();
    }

    @objid ("f997218a-9db5-4aa1-bd4a-65ee75d69cad")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
