package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.CamelList;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2a985ecd-2ce6-4c93-a584-28ca68772fb9")
public class ListExporter<T extends CamelList> extends ValueTypeExporter<T> {
    @objid ("932ea968-aa08-421c-8be6-3df31e1296ce")
    public ListExporter(T elt) {
        super(elt);
    }

    @objid ("a6fc5bcd-3399-4d56-bb48-80558b09b43b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createList();
    }

    @objid ("d75617c4-ebe1-4af0-a851-743a6614ee89")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("98e7fe1d-eddd-4aea-984a-4e3c4bf55f10")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
