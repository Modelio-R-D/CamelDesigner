package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;


import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;

public class ImageConfigurationExporter <T extends ImageConfiguration> extends ConfigurationExporter<T> { 
	
	public ImageConfigurationExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CDOObject createCamelElt(CDOObject context) {
	        return DeploymentFactory.eINSTANCE.createImageConfiguration();
	    }

	    @Override
	    public void setProperties(CDOObject elt) {
	        super.setProperties(elt);
	        if (elt instanceof camel.deployment.ImageConfiguration) {
	            camel.deployment.ImageConfiguration cc = (camel.deployment.ImageConfiguration) elt;
	            setImageId(cc);

	        }
	    }

		private void setImageId(camel.deployment.ImageConfiguration cc) {
            String content = this._element.getImageId();
            if (content != null)
                cc.setImageId(content);
	}


}
