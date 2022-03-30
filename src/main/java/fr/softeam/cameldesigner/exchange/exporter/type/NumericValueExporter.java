package fr.softeam.cameldesigner.exchange.exporter.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.NumericValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("396c659c-8637-41d8-aac3-d76d395d6214")
public abstract class NumericValueExporter<T extends NumericValue> extends ValueExporter<T> {
    @objid ("089df222-54b6-481d-b421-dcce9f0bf2fd")
    public NumericValueExporter(T elt) {
        super(elt);
    }

    @objid ("c987b7bb-8572-49c8-9fd9-6bd5a68aafcc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @objid ("03ca9c86-66b1-421a-8455-cee841c34ba5")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("2fa5a4a6-03d6-4cb8-bd83-ca6b1b7b37a9")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
