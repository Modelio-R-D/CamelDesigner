package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a0fe30b6-1cfb-4dd5-b543-8dc3717032f1")
public class RangeUnionExporter<T extends RangeUnion> extends ValueTypeExporter<T> {
    @objid ("9688d1fb-085a-4b89-a849-a7d5229bbfe6")
    public RangeUnionExporter(T elt) {
        super(elt);
    }

    @objid ("37149391-cde8-4a00-99d4-f22fba55ae6b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createRangeUnion();
    }

    @objid ("195246c8-b155-4bbd-843d-4672567452f0")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("e2a6d920-2a96-4bff-ab43-6cfeaa4de969")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
