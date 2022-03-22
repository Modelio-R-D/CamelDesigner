package fr.softeam.cameldesigner.exchange.exporter.unit;

import org.eclipse.emf.cdo.CDOObject;
import camel.unit.UnitFactory;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;


public class SingleUnitExporter<T extends SingleUnit> extends DimensionedUnitExporter<T>{

    public SingleUnitExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createSingleUnit();
    }


    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }


    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
