package fr.softeam.cameldesigner.exchange.exporter.unit;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit;


public abstract class DimensionedUnitExporter<T extends DimensionedUnit> extends UnitExporter<T>{

    public DimensionedUnitExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
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
