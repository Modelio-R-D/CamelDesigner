package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.core.Feature;
import camel.deployment.EventConfiguration;
import camel.deployment.HTTPMethodType;
import camel.metric.Schedule;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d2b98e41-d675-4d03-abd6-ff0c7e3bc1d8")
public class EventConfigurationImporter<T extends EventConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> extends FeatureImporter<T,V> {
    @objid ("57339d32-0579-4b4d-b5d2-dd8d4832feb6")
    public EventConfigurationImporter() {
        super();
    }

    @objid ("48aff542-f25f-4ad8-8a04-77c1b8d38c5d")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.create();
    }

    @objid ("c544d282-718d-4f26-b287-a01a8955670c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitEventConfiguration(this);
    }

    @objid ("99781799-2af1-4998-8ea8-0c2363cd371b")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setHttpMethodName(elt);
        setHttpMethodType(elt);
        setExecutionSchedule(elt);
        setScheduledExecutionConfig(elt);
    }

    @objid ("8e97d72a-69a2-44ac-ae97-3a7e83d3e58b")
    private void setHttpMethodName(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getHttpMethodName();
        if (value != null) {
            elt.setHttpMethodName(value);
        }
    }

    @objid ("8fced59c-d2d3-44e9-9ccf-aff7849d6e12")
    private void setHttpMethodType(V elt) {
        // TODO Auto-generated method stub
        HTTPMethodType value = this._element.getHttpMethodType();
        if (value != null) {
            elt.setHttpMethodType(value.getLiteral());
        }
    }

    @objid ("69b5bd2e-a102-4caf-844e-d7a8992674cc")
    private void setExecutionSchedule(V elt) {
        // TODO Auto-generated method stub
        Schedule value = this._element.getExecutionSchedule();
        if (value != null) {
            elt.setExecutionSchedule((fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule) value);
        }
    }

    @objid ("5dd0f56d-b62d-4ae9-b989-9632845cba07")
    private void setScheduledExecutionConfig(V elt) {
        // TODO Auto-generated method stub
        Feature value = this._element.getScheduledExecutionConfig();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof FeatureClass) {
                elt.setScheduledExecutionConfig((FeatureClass) valueElt);
        
            }
        }
    }

}
