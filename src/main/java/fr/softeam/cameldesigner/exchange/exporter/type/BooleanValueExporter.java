package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.BooleanValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bd612f9a-7f1e-4b98-9c4e-0bc53826a2e9")
public class BooleanValueExporter<T extends BooleanValue> extends ValueExporter<T> {
    @objid ("c435674a-1cca-40fd-8770-f96839658540")
    public BooleanValueExporter(T elt) {
        super(elt);
    }

    @objid ("a4b3acdc-913e-4623-8776-ea4b28272473")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createBooleanValue();
    }

    @objid ("a18ed95b-ff6f-4ede-bc76-3ff67cafbaec")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3b4076c1-9e20-48ed-b991-584fa123fe94")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
