package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.exchange.exporter.requirement.ServiceLevelObjectiveExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("51529210-b155-4e8c-9249-28e68f4e1c59")
public class SecuritySLOExporter<T extends SecuritySLO> extends ServiceLevelObjectiveExporter<T> {
    @objid ("e50a34a0-9664-4a80-b732-25660044bca3")
    public SecuritySLOExporter(T elt) {
        super(elt);
    }

    @objid ("c8e215bc-97b5-433c-b138-f8f43be1a0c9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecuritySLO();
    }

    @objid ("53014073-a861-4034-93c9-68a5d93e812d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("16ebbb0a-25ef-4333-a0f5-4632ad47ae51")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
