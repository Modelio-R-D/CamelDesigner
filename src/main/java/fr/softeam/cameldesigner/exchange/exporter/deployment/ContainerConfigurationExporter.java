package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;

public class ContainerConfigurationExporter <T extends ContainerConfiguration> extends ConfigurationExporter<T> {

	public ContainerConfigurationExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createContainerConfiguration();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.ContainerConfiguration) {
            camel.deployment.ContainerConfiguration cc = (camel.deployment.ContainerConfiguration) elt;
            setImageId(cc);
            setStartCommand(cc);
            setUpdateCommand(cc);
            setEnvironment(cc);
        }
    }

    private void setEnvironment(camel.deployment.ContainerConfiguration cc) {
        Feature content = this._element.getEnvironment();
        if (content != null)
            cc.setEnvironment((camel.core.Feature) content);
	}

	private void setUpdateCommand(camel.deployment.ContainerConfiguration cc) {
        String content = this._element.getUpdateCommandNote();
        if (content != null)
            cc.setUpdateCommand(content);		
	}

	private void setStartCommand(camel.deployment.ContainerConfiguration cc) {
        String content = this._element.getStartCommandNote();
        if (content != null)
            cc.setStartCommand(content);		
	}

	private void setImageId(camel.deployment.ContainerConfiguration cc) {
            String content = this._element.getImageId();
            if (content != null)
                cc.setImageId(content);
	}

	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }





}
