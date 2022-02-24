package fr.softeam.cameldesigner.exchange.exporter.deploymentinstance;

import java.util.ArrayList;
import java.util.List;
import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4401954c-a51b-4cfb-aab3-caf6ab79be47")
public class SoftwareComponentInstanceExporter<T extends SoftwareComponentInstance> extends ComponentInstanceExporter<T> {
    @objid ("fe5147bd-76a3-4571-b393-4291ce6516fb")
    public SoftwareComponentInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("ce2ef668-abde-4121-9972-9403a922cd19")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createSoftwareComponentInstance();
    }

    @objid ("6a1c2561-787a-4cdf-a205-b759ec54d447")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.SoftwareComponentInstance) {
            camel.deployment.SoftwareComponentInstance sci = (camel.deployment.SoftwareComponentInstance) elt;
            setGeneratesDataInstance(sci);
            setConsumesDataInstance(sci);
            setManagesDataSourceInstance(sci);
        }
    }

    @objid ("5360edbd-3b2b-4f82-b37c-a79ba2fc359f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentInstanceModel) && (elt instanceof camel.deployment.SoftwareComponentInstance)) {
            ((camel.deployment.DeploymentInstanceModel) context).getSoftwareComponentInstances().add((camel.deployment.SoftwareComponentInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("a31a89cb-5bdf-40ad-b711-e36ca5c45a66")
    private void setConsumesDataInstance(camel.deployment.SoftwareComponentInstance sci) {
        List<camel.data.DataInstance> dataSetInstance = new ArrayList<>();
        for (DataInstance dataInstance : this._element.getConsumesDataInstances()) {
            CDOObject camelDataInstance = this._process.getElement(dataInstance);
            if ((camelDataInstance != null) &&  (camelDataInstance instanceof camel.data.Data))
                dataSetInstance.add((camel.data.DataInstance) camelDataInstance);
        }
        
        sci.getConsumesDataInstance().addAll(dataSetInstance);
    }

    @objid ("a0842efc-c813-4e51-999a-3615c3f50de0")
    private void setManagesDataSourceInstance(camel.deployment.SoftwareComponentInstance sci) {
        List<camel.data.DataSourceInstance> dataSourceInstanceSet = new ArrayList<>();
        for (DataSourceInstance dataSourceInstance : this._element.getManagesDataSourceInstance()) {
            CDOObject camelDataSourceInstance = this._process.getElement(dataSourceInstance);
            if ((camelDataSourceInstance != null) &&  (camelDataSourceInstance instanceof camel.data.DataSourceInstance))
                dataSourceInstanceSet.add((camel.data.DataSourceInstance) camelDataSourceInstance);
        }
        
        sci.getManagesDataSourceInstance().addAll(dataSourceInstanceSet);
    }

    @objid ("7647d8ad-0a03-44c4-91bb-6dfa92677b8e")
    private void setGeneratesDataInstance(camel.deployment.SoftwareComponentInstance sci) {
        List<camel.data.DataInstance> dataSet = new ArrayList<>();
        for (DataInstance dataInstance : this._element.getGeneratesDataInstance()) {
            CDOObject camelData = this._process.getElement(dataInstance);
            if ((camelData != null) &&  (camelData instanceof camel.data.DataInstance))
                dataSet.add((camel.data.DataInstance) camelData);
        }
        
        sci.getGeneratesDataInstance().addAll(dataSet);
    }

}
