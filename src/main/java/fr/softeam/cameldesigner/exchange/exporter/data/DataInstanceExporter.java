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
        if (elt instanceof camel.data.DataInstance) {
            camel.data.DataInstance dataInstance = (camel.data.DataInstance) elt;
            setDataSourceInstance(dataInstance);
            setType(dataInstance);
        }
    }

    @objid ("76c78abc-ef29-44d6-9e06-f0a21421313c")
    private void setDataSourceInstance(camel.data.DataInstance data) {
        CDOObject source =  this._process.getElement(this._element.getDataSourceInstance());
        if ((source != null) &&  (source instanceof camel.data.DataSourceInstance))
            data.setDataSourceInstance((camel.data.DataSourceInstance) source);
    }

    @objid ("89c508a8-1ba0-471f-bcd0-0272b651d140")
    private void setType(camel.data.DataInstance data) {
        CDOObject type =  this._process.getElement(this._element.getType());
        if ((type != null) &&  (type instanceof camel.data.Data))
            data.setType((camel.data.Data) type);
    }

    @objid ("77e9f424-da0f-4b33-af29-083932246701")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if  (elt instanceof camel.data.DataInstance) {
            if (context instanceof camel.data.DataInstanceModel) {
               ((camel.data.DataInstanceModel) context).getDataInstances().add((camel.data.DataInstance) elt);
            }else   if (context instanceof camel.data.DataInstance) {
                ((camel.data.DataInstance) context).getIncludesDataInstance().add((camel.data.DataInstance) elt);
            }else {
                super.attach(elt, context);
            }
        }else {
            super.attach(elt, context);
        }
    }

}
