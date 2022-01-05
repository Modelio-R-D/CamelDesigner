package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("dbdcb34f-a1bd-4383-8858-00e5f5d72040")
public class ScalabilityRuleExporter<T extends ScalabilityRule> extends FeatureExporter<T> {
    @objid ("8ada81f7-419b-499a-8b35-e9ef139cdcb9")
    public ScalabilityRuleExporter(T elt) {
        super(elt);
    }

    @objid ("af85e021-f238-4063-9c54-6e00ea959ba2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createScalabilityRule();
    }

    @objid ("2a74968c-7afe-4fda-9e8f-cb93b0c4f388")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5668f866-dd7b-4574-9e83-cf62c99a4788")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
