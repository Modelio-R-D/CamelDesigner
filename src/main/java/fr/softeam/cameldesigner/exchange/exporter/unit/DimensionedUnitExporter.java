package fr.softeam.cameldesigner.exchange.exporter.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ddba5ef0-f6f3-41a1-8da8-b7ffa7f239cc")
public abstract class DimensionedUnitExporter<T extends DimensionedUnit> extends UnitExporter<T> {
    @objid ("94410ae4-f0f9-4f57-b575-0b996e13cb06")
    public DimensionedUnitExporter(T elt) {
        super(elt);
    }

    @objid ("232aa996-cc5d-4099-bb71-126786e8d5a4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("5bc4370f-07fb-4ccb-9f9d-dd69417157c3")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f196db3d-d359-44d9-b01c-8d6a6588137f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
