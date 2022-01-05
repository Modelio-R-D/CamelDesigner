package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8fddd25c-079f-4b9f-8429-2fafd6f6b0f2")
public class FeatureExporter<T extends Feature> extends NamedElementExporter<T> {
    @objid ("b28804ae-84ba-42dc-b94c-472c9a672f97")
    public FeatureExporter(T elt) {
        super(elt);
    }

    @objid ("71f95c6d-ec95-4ec0-8d7c-d54c00b34e9e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return camel.core.CoreFactory.eINSTANCE.createFeature();
    }

    @objid ("377a3264-39c0-42f3-807d-9628ca8a46c9")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("af39f5ef-4706-4ade-a113-3d0d6706193e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
