package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7d098415-7c67-45ea-846c-dee26ba16e16")
public class SecurityControlExporter<T extends SecurityControl> extends FeatureExporter<T> {
    @objid ("9fafa24c-5b4d-4681-a8df-e39db55ca5de")
    public SecurityControlExporter(T elt) {
        super(elt);
    }

    @objid ("4bb8911c-5b36-4f23-97e7-3764d520475b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityControl();
    }

    @objid ("028fab79-c653-4ac5-8e6b-cc150b4d3911")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("9a0e3806-950b-44d2-9eee-549c396aa3d5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.SecurityControl)) {
            ((camel.security.SecurityModel) context).getSecurityControls().add((camel.security.SecurityControl) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
