package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.Timer;
import camel.scalability.TimerType;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("868c339f-4851-4fb1-bc49-46771e76c245")
public class TimerImporter<T extends Timer, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> extends FeatureImporter<T,V> {
    @objid ("f971447a-d9fd-464e-893d-43a7437adcd3")
    public TimerImporter() {
    }

    @objid ("57691f04-e3bc-41be-9541-942df97fce35")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitTimer(this);
    }

    @objid ("7c7c43de-6e3b-45dd-9fbf-fb9f75d95dbb")
    public TimerImporter(T elt) {
        super(elt);
    }

    @objid ("755ba3e3-3e05-4a1c-8185-9db80d42bdc3")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.create();
    }

    @objid ("04fe49fc-bfb2-416d-8d8d-b852bd736344")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof ScalabilityModel)
            ((ScalabilityModel)context).addTimers(elt);
    }

    @objid ("ce19fc5c-5547-4174-b66b-a7ac2e14d254")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setType(elt);
        setTimeValue(elt);
        setMaxOccurrenceNum(elt);
        setUnit(elt);
    }

    @objid ("46d32936-1d59-4637-857b-09be35412f4b")
    private void setType(V elt) {
        TimerType value = this._element.getType();
        if (value != null) {
            elt.setType(value.getLiteral());
        }
    }

    @objid ("31bbcdbf-0f24-4b22-bac8-ab4489b44eb0")
    private void setTimeValue(V elt) {
        Integer value = this._element.getTimeValue();
        if (value != null) {
            elt.setTimeValue(String.valueOf(value));
        }
    }

    @objid ("d99cb66c-0cfa-4f10-8294-80bbdf248c66")
    private void setMaxOccurrenceNum(V elt) {
        Integer value = this._element.getMaxOccurrenceNum();
        if (value != null) {
            elt.setMaxOccurrenceNum(String.valueOf(value));
        }
    }

    @objid ("fb1a88c3-7116-4c6e-b810-fab315fd0281")
    private void setUnit(V elt) {
        Unit value = this._element.getUnit();
        if (value != null) {
            elt.setUnit((fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) value);
        }
    }

}
