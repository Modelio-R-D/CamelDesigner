package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import org.eclipse.emf.cdo.CDOObject;

@objid ("601fa0b7-9bab-4d86-9d21-78c962ea7c6a")
public class SoftwareComponentExporter<T extends SoftwareComponent> extends CamelComponentExporter<T> {
    @objid ("02b91033-9b01-467b-828c-d1a77363151f")
    public SoftwareComponentExporter(T elt) {
        super(elt);
    }

    @objid ("5a7b2340-f229-4f15-816a-a80b3234e3fb")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return camel.deployment.DeploymentFactory.eINSTANCE.createSoftwareComponent();
    }

    @objid ("33d62df0-4a1f-4a84-b98b-948346fb2cb8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.SoftwareComponent) {
            camel.deployment.SoftwareComponent sc = (camel.deployment.SoftwareComponent) elt;
            setRequirementSet(sc);
            setGeneratesData(sc);
            setConsumesData(sc);
            setManagesDataSource(sc);
            setLongLived(sc);
            setCoinstanceHosting(sc);
        }
    }

    @objid ("ea2bf4f9-365b-4400-8325-c37cca864b01")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.DeploymentTypeModel) && (elt instanceof camel.deployment.SoftwareComponent)) {
            ((camel.deployment.DeploymentTypeModel) context).getSoftwareComponents().add((camel.deployment.SoftwareComponent) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("c1f2554b-8d0e-4bdc-9075-f03bd68a3386")
    private void setCoinstanceHosting(camel.deployment.SoftwareComponent sc) {
        sc.setCoInstanceHosting(this._element.isCoInstanceHosting());
    }

    @objid ("fe7abece-f9eb-4949-8642-53f23f80e2e1")
    private void setLongLived(camel.deployment.SoftwareComponent sc) {
        sc.setLongLived(this._element.isLongLived());
    }

    @objid ("e27f1e97-f51f-4978-86de-1255173fdf6c")
    private void setGeneratesData(camel.deployment.SoftwareComponent sc) {
        List<camel.data.Data> dataSet = new ArrayList<>();
        for (Data data : this._element.getGeneratesData()) {
            CDOObject camelData = this._process.getElement(data);
            if ((camelData != null) &&  (camelData instanceof camel.data.Data))
                dataSet.add((camel.data.Data) camelData);
        }
        
        sc.getGeneratesData().addAll(dataSet);
    }

    @objid ("3c55247f-54a6-4e7c-b901-210141d4aedf")
    private void setConsumesData(camel.deployment.SoftwareComponent sc) {
        List<camel.data.Data> dataSet = new ArrayList<>();
        for (Data data : this._element.getConsumesData()) {
            CDOObject camelData = this._process.getElement(data);
            if ((camelData != null) &&  (camelData instanceof camel.data.Data))
                dataSet.add((camel.data.Data) camelData);
        }
        
        sc.getConsumesData().addAll(dataSet);
    }

    @objid ("d26a536f-651d-44fd-907a-69001cf6f1ec")
    private void setManagesDataSource(camel.deployment.SoftwareComponent sc) {
        List<camel.data.DataSource> dataSourceSet = new ArrayList<>();
        for (DataSource dataSource : this._element.getManagesDataSource()) {
            CDOObject camelDataSource = this._process.getElement(dataSource);
            if ((camelDataSource != null) &&  (camelDataSource instanceof camel.data.DataSource))
                dataSourceSet.add((camel.data.DataSource) camelDataSource);
        }
        
        sc.getManagesDataSource().addAll(dataSourceSet);
    }

    @objid ("8719c000-0387-47fb-9d5c-e4f96b9977b1")
    private void setRequirementSet(camel.deployment.SoftwareComponent sc) {
        CDOObject rs =  this._process.getElement(this._element.getRequirementSet());
        if ((rs != null) &&  (rs instanceof camel.deployment.RequirementSet))
            sc.setRequirementSet((camel.deployment.RequirementSet) rs);
    }

}
