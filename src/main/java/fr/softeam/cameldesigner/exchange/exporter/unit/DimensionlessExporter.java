package fr.softeam.cameldesigner.exchange.exporter.unit;

import camel.unit.UnitFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8300942b-15f9-4fdb-a4cb-4f45fe156257")
public class DimensionlessExporter<T extends Dimensionless> extends UnitExporter<T> {
    @objid ("c2b5f058-ab0d-41a8-9706-dbc576906271")
    public DimensionlessExporter(T elt) {
        super(elt);
    }

    @objid ("ace5a373-94fc-46d1-b76f-664d179260e6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createDimensionless();
    }

    @objid ("b1722ecd-d6ee-47ec-b724-2519815ac290")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3c95d71c-a859-40bb-8936-fa7169bab0a8")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
