package fr.softeam.cameldesigner.exchange.exporter.unit;

import org.eclipse.emf.cdo.CDOObject;
import camel.unit.UnitFactory;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;

public class CompositeUnitExporter<T extends CompositeUnit> extends DimensionedUnitExporter<T>{

    public CompositeUnitExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createCompositeUnit();
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
