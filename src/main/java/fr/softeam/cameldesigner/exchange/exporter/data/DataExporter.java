package fr.softeam.cameldesigner.exchange.exporter.data;

import camel.data.DataFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("082b323a-16a3-40da-a081-ccf46bfc664f")
public class DataExporter<T extends Data> extends NamedElementExporter<T> {
    @objid ("a06670b3-d210-4b1c-8ace-38db601110a5")
    public DataExporter(T elt) {
        super(elt);
    }

    @objid ("e6844fa8-07e5-40a6-86da-0c671351e872")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DataFactory.eINSTANCE.createData();
    }

    @objid ("f6407788-d6f0-42d7-9b6b-8e1c8a4c4110")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.data.Data) {
            setDataSource((camel.data.Data) elt);
        }
    }

    @objid ("75b29bbf-a257-473f-89be-b94ff130a6ee")
    private void setDataSource(camel.data.Data data) {
        CDOObject source =  this._process.getElement(this._element.getDataSource());
        if ((source != null) &&  (source instanceof camel.data.DataSource))
            data.setDataSource((camel.data.DataSource) source);
    }

    @objid ("9953dbfe-b9db-4ab0-a9c9-60f5595a396f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if  (elt instanceof camel.data.Data) {
            if (context instanceof camel.data.DataTypeModel) {
               ((camel.data.DataTypeModel) context).getData().add((camel.data.Data) elt);
            }else   if (context instanceof camel.data.Data) {
                ((camel.data.Data) context).getIncludesData().add((camel.data.Data) elt);
            }else {
                super.attach(elt, context);
            }
        }else {
            super.attach(elt, context);
        }
    }

}
