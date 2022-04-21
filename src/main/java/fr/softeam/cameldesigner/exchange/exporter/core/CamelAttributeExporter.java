package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import org.eclipse.emf.cdo.CDOObject;

@objid ("668fff4d-c8db-4b74-a22e-d38735dab8bd")
public abstract class CamelAttributeExporter<T extends CamelAttribute> extends ExpendableElementExporter<T> {
    @objid ("67d6f93b-a675-4775-ae43-9f97cfc05eac")
    public CamelAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("04e98212-bdc4-4545-b5bf-04ec39805bf6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createAttribute();
    }

    @objid ("f943813f-de0c-4599-85bc-be133f0f5e9a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("649d5d67-49f7-433c-8e63-a6f18d2fee1f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if (elt instanceof camel.core.Attribute){
            camel.core.Attribute att = (camel.core.Attribute) elt;
            if (context instanceof camel.deployment.ClusterConfiguration) {
                ((camel.deployment.ClusterConfiguration) context).getConfigParameters().add(att);
            } else if (context instanceof camel.deployment.ServerlessConfiguration) {
                ((camel.deployment.ServerlessConfiguration) context).getEnvironmentConfigParams().add(att);
            } else if (context instanceof camel.core.Feature) {
                ((camel.core.Feature) context).getAttributes().add(att);
            }
        }
    }

}
