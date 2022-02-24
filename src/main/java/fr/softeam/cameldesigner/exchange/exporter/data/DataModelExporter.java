package fr.softeam.cameldesigner.exchange.exporter.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4356a6b8-75a7-495f-b3fe-d15f20264b47")
public abstract class DataModelExporter<T extends DataModel> extends SubModelExporter<T> {
    @objid ("9dd2f90b-4bb9-4cb0-a543-3b59b47daafe")
    public DataModelExporter(T elt) {
        super(elt);
    }

    @objid ("5f2d8621-3e57-423f-aaf5-648378cb49fc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("6c44a499-a970-44fb-a935-4b153d31f10c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("326bfd10-1089-4aa3-9fde-020ed89c93a5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.data.DataModel)) {
            ((camel.core.CamelModel) context).getDataModels().add((camel.data.DataModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
