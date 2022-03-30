package fr.softeam.cameldesigner.exchange.exporter.unit;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureDataTypeExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6c4a3139-3b74-40c9-a6e8-9b7d10b54218")
public abstract class UnitExporter<T extends Unit> extends FeatureDataTypeExporter<T> {
    @objid ("adb27177-e88b-477d-b321-9b1f70c72751")
    public UnitExporter(T elt) {
        super(elt);
    }

    @objid ("0721aa71-7df9-43d9-928b-740410430a71")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("127b78f1-88d2-4b01-8dc6-0aa20f4a8239")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.unit.Unit) {
            setMultipleOf((camel.unit.Unit) elt);
        }
    }

    @objid ("9125c4f3-c8f2-4a95-8a7d-6d6c68d21716")
    private void setMultipleOf(camel.unit.Unit unit) {
        List<camel.unit.Unit> units = new ArrayList<>();
        for (Unit multiple : this._element.getMultipleOf()) {
            CDOObject camelUnit = this._process.getElement(multiple);
            if ((camelUnit != null) &&  (camelUnit instanceof camel.unit.Unit))
                units.add((camel.unit.Unit) camelUnit);
        }
        
        unit.getMultipleOf().addAll(units);
    }

    @objid ("f6fae830-7805-4f43-9190-d308b5ba8827")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.unit.UnitModel) && (elt instanceof camel.unit.Unit)) {
            ((camel.unit.UnitModel) context).getUnits().add((camel.unit.Unit) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
