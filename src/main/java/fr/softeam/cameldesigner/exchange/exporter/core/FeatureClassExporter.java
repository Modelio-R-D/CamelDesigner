package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cd39153e-cbbf-49e5-8cf5-2e35c03881a5")
public class FeatureClassExporter<T extends FeatureClass> extends FeatureExporter<T> {
    @objid ("7459e2bb-e1cf-465a-9b4e-fcd27d66820a")
    public FeatureClassExporter(T elt) {
        super(elt);
    }

    @objid ("62c1a4a2-995d-47fa-bf2c-efa1e0a876d1")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("30f4e645-6587-40b0-95fa-2a10a50594df")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}