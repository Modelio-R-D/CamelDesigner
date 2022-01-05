package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d81ea0ba-e1d0-44c5-b03f-8f2a8165695d")
public class SecurityModelExporter<T extends SecurityModel> extends SubModelExporter<T> {
    @objid ("86b39345-6083-44db-874d-e68b6ced3f2f")
    public SecurityModelExporter(T elt) {
        super(elt);
    }

    @objid ("c6e1ff7c-1bc7-44d3-bf39-02b580496df6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityModel();
    }

    @objid ("b169418d-6539-4487-af2a-9b5126c6ad95")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("37c098b7-b6dc-4b76-a76a-1eae5b79396e")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
