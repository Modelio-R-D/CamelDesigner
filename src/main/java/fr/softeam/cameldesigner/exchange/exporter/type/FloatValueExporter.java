package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.FloatValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e758fb40-4239-443f-aa9b-c439f4c921a2")
public class FloatValueExporter<T extends FloatValue> extends ValueExporter<T> {
    @objid ("5b0d1df1-e8fe-4f1f-9a68-97d90b4ac207")
    public FloatValueExporter(T elt) {
        super(elt);
    }

    @objid ("a6598bc5-907e-4863-b73f-f4ea294b2d8d")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createFloatValue();
    }

    @objid ("7fb67314-ea1c-45a3-9dd7-9e1bf10de3e1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("1351c234-72af-48fb-8594-8158b50cac99")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
