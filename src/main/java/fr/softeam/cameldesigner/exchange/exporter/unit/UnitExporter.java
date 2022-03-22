package fr.softeam.cameldesigner.exchange.exporter.unit;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureDataTypeExporter;


public abstract class UnitExporter<T extends Unit> extends FeatureDataTypeExporter<T>{

    public UnitExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }


    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.unit.Unit) {
            setMultipleOf((camel.unit.Unit) elt);
        }
    }


    private void setMultipleOf(camel.unit.Unit unit) {

        List<camel.unit.Unit> units = new ArrayList<>();
        for (Unit multiple : this._element.getMultipleOf()) {
            CDOObject camelUnit = this._process.getElement(multiple);
            if ((camelUnit != null) &&  (camelUnit instanceof camel.unit.Unit))
                units.add((camel.unit.Unit) camelUnit);
        }

        unit.getMultipleOf().addAll(units);
    }


    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.unit.UnitModel) && (elt instanceof camel.unit.Unit)) {
            ((camel.unit.UnitModel) context).getUnits().add((camel.unit.Unit) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
