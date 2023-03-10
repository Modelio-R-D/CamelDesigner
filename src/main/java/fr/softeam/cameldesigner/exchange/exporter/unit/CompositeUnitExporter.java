package fr.softeam.cameldesigner.exchange.exporter.unit;

import camel.unit.UnitFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import org.eclipse.emf.cdo.CDOObject;

@objid ("647a127d-0242-483d-b091-6339b687c542")
public class CompositeUnitExporter<T extends CompositeUnit> extends DimensionedUnitExporter<T> {
    @objid ("ff2dfbe8-0fa6-49fc-ac3d-eebe099a59df")
    public CompositeUnitExporter(T elt) {
        super(elt);
    }

    @objid ("91bcdd8b-8c93-450d-9fb9-61682d77f8f0")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return UnitFactory.eINSTANCE.createCompositeUnit();
    }

    @objid ("baf5cac5-6a66-438d-a642-1251c6e9f829")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.unit.CompositeUnit) {
            camel.unit.CompositeUnit cmc = (camel.unit.CompositeUnit) elt;
            setFormula(cmc);
        }
    }

    @objid ("098fcdea-911f-487e-8bef-da096b1b1e87")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("3d27713d-b71e-4bb8-938f-9aa759f7aae3")
    private void setFormula(camel.unit.CompositeUnit cmc) {
        String formula = this._element.getFormula();
            cmc.setFormula(formula);
    }

}
