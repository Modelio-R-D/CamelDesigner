package fr.softeam.cameldesigner.exchange.exporter.unit;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureDataTypeExporter;


public abstract class UnitDimensionExporter<T extends UnitDimension> extends FeatureDataTypeExporter<FeatureDataType>{

    public UnitDimensionExporter(T elt) {
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
        if ((context instanceof camel.unit.UnitModel) && (elt instanceof camel.unit.UnitDimension)) {
            ((camel.unit.UnitModel) context).getDimensions().add((camel.unit.UnitDimension) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
