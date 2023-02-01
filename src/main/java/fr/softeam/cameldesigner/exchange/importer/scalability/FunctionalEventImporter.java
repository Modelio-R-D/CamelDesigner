package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.core.Attribute;
import camel.deployment.Component;
import camel.scalability.BinaryPatternOperatorType;
import camel.scalability.Event;
import camel.scalability.FunctionalEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4a3f756e-1cb2-43e7-9337-b8c24b543bd8")
public class FunctionalEventImporter<T extends FunctionalEvent, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent> extends SingleEventImporter<T,V> {
    @objid ("124369c8-bded-4619-9c02-60879a45281a")
    public FunctionalEventImporter() {
    }

    @objid ("cd104577-33d2-4dd2-ab52-a100941095c6")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitFunctionalEvent(this);
    }

    @objid ("bd9be1f9-90ac-4b0e-96fb-01fb3e3a59ff")
    public FunctionalEventImporter(T elt) {
        super(elt);
    }

    @objid ("5f5a580a-6dc7-4e7e-8803-4fccd7b42766")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.create();
    }

    @objid ("6f71355e-4b84-4f72-acf2-f34590d1bc90")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("c43ad154-69bd-40da-bbb1-36ced6a314a4")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setFunctionalType(elt);
        setComponent(elt);
    }

    @objid ("0576809f-7c0e-48b6-9d8c-4a1ef4f72231")
    private void setFunctionalType(V elt) {
        Attribute value = this._element.getFunctionalType();
        if (value != null) {
            elt.setFunctionalType((CamelAttribute) value);
        }
    }

    @objid ("c06989cd-d08c-428a-9bfc-7ea61d634048")
    private void setComponent(V elt) {
        Component value = this._element.getComponent();
        if (value != null) {
            elt.setComponent( (CamelComponent) value);
        }
    }

}
