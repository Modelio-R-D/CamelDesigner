package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.StringValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("72b4503a-8627-4597-92d0-7abceffb0866")
public class StringValueExporter<T extends StringValue> extends ValueExporter<T> {
    @objid ("2f7c0641-ff27-4920-b402-4944079f68bc")
    public StringValueExporter(T elt) {
        super(elt);
    }

    @objid ("5d9d92cd-2556-4c15-9969-2334ea8ee2f7")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createStringValue();
    }

    @objid ("4a313c30-88a8-4eab-a81f-87b91fc85b76")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("56c85add-50a6-4c5a-870b-7db88e5cfce3")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
