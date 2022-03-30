package fr.softeam.cameldesigner.exchange.exporter.unit;

import camel.unit.UnitFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import org.eclipse.emf.cdo.CDOObject;

@objid ("93d770a8-d59c-49f5-b8c3-0914d0a86182")
public class SingleUnitExporter<T extends SingleUnit> extends DimensionedUnitExporter<T> {
    @objid ("0e4fee17-7ea1-446a-ba6b-c87882d049fd")
    public SingleUnitExporter(T elt) {
        super(elt);
    }

    @objid ("1236cde2-5940-4543-bd0e-d0d0596584d6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createSingleUnit();
    }

    @objid ("dd3878ed-9aac-4af3-9ad3-d7c402533f6c")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f4afd5ce-6ae7-4d69-8b8e-b97f17e915ae")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
